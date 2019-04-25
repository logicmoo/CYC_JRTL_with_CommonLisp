package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyclifier_interface
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyclifier_interface";
  public static final String myFingerPrint = "8fb7014bce55611a8fcb7f12252da615772db2c07da1e2b1ca52892963aeb11a";
  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 1098L)
  public static SubLSymbol $cyclification_in_progress$;
  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 1221L)
  public static SubLSymbol $cyclification_complete$;
  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 1339L)
  public static SubLSymbol $allow_duplicate_cyclificationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 17964L)
  private static SubLSymbol $context_keyword_equivalence$;
  private static final SubLSymbol $sym0$PUNLESS;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$PROGN;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CYCLIFIABLE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$CYCLIFY;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$GET_CYCLIFIER;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$PARSE_TREE_INTERFACE;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$CYCLIFIABLE_PHRASE;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$CYCLIFIABLE_NOUN_PHRASE;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$CYCLIFIABLE_VERB_PHRASE;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$VP_COORDINATE_PHRASE_P;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$GET_REFS;
  private static final SubLSymbol $sym29$REFS;
  private static final SubLSymbol $sym30$RUN;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$CSETQ;
  private static final SubLSymbol $sym34$ALIST_PUSHNEW;
  private static final SubLSymbol $sym35$CYCLIFY_INT;
  private static final SubLSymbol $sym36$GET_MODIFIERS;
  private static final SubLSymbol $sym37$CYCLIFY_INT_VP;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$CYCLIFY_INT_VP_COORDINATION;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$CYCLIFIABLE_SENTENTIAL_PHRASE;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$CYCLIFIABLE_PREPOSITIONAL_PHRASE;
  private static final SubLSymbol $sym47$CYCLIFIABLE_WORD;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$GET_KEYWORD_RENAMINGS;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$GET_SEMANTIC_COMPLEMENTS;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$PARTITION_SEMANTIC_COMPLEMENTS;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$GET_PP_COMPLEMENT;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$GET_OBLIQUE_OBJECT;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $kw61$SUBJECT;
  private static final SubLSymbol $kw62$DEFAULT;
  private static final SubLSymbol $sym63$CYCLIFY_NUCLEUS;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$MODIFIED_DEPENDENT_MEANING_P;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$TREE_KEYWORD_EQ_CLASSES;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$ACTION;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$GET;
  private static final SubLSymbol $kw73$FRAME;
  private static final SubLObject $const74$ParticleFrameType;
  private static final SubLObject $const75$EverythingPSC;
  private static final SubLSymbol $sym76$POS_FILTER_LEXES;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$PP_COMP_FILTER_LEXES;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$FRAME_FILTER_LEXES;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$NOMINAL_WORD;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$GET_QUANTIFIER;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$GET_HEAD;
  private static final SubLSymbol $kw92$SEMTRANS;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$DEFINITE_DESCRIPTION_P;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$RELATIONAL_NOUN_P;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$NAME_WORD;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$VERBAL_WORD;
  private static final SubLList $list105;
  private static final SubLList $list106;
  private static final SubLList $list107;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$PARTICLE_FILTER_LEXES;
  private static final SubLList $list110;
  private static final SubLSymbol $sym111$GET_MATRIX_CLAUSE;
  private static final SubLList $list112;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$SUBJECT_CONTROLLER_P;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$OBJECT_CONTROLLER_P;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$CONTROL_VERB_P;
  private static final SubLList $list119;
  private static final SubLSymbol $sym120$GET_CONTROL_VERB;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$GET_CONTROLLER;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$AUX_VERB_WORD;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$GET_TENSE;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$GET_SEMANTIC_HEADS;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$GET_COMPLEMENTS;
  private static final SubLList $list131;
  private static final SubLList $list132;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$COPULA_P;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$ADJECTIVAL_WORD;
  private static final SubLList $list138;
  private static final SubLList $list139;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$ADVERBIAL_WORD;
  private static final SubLList $list143;
  private static final SubLList $list144;
  private static final SubLList $list145;
  private static final SubLSymbol $sym146$PREPOSITIONAL_OR_PARTICLE_WORD;
  private static final SubLList $list147;
  private static final SubLList $list148;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$QUANTIFIER_WORD;
  private static final SubLList $list151;
  private static final SubLList $list152;
  private static final SubLSymbol $sym153$PUNCTUATION_WORD;
  private static final SubLSymbol $sym154$POSSESSIVE_WORD;
  private static final SubLList $list155;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$GET_STRING;
  private static final SubLSymbol $sym158$BASE_P;
  private static final SubLSymbol $kw159$VB;
  private static final SubLList $list160;
  private static final SubLSymbol $kw161$VBP;
  private static final SubLList $list162;
  private static final SubLSymbol $kw163$VBZ;
  private static final SubLList $list164;
  private static final SubLSymbol $sym165$GET_MOTHER;
  private static final SubLSymbol $sym166$GET_SISTER;
  private static final SubLSymbol $kw167$VBN;
  private static final SubLSymbol $kw168$VBD;
  private static final SubLSymbol $sym169$GET_CATEGORY;
  private static final SubLSymbol $kw170$AUXG;
  private static final SubLSymbol $kw171$VBG;
  private static final SubLList $list172;
  private static final SubLSymbol $sym173$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym174$PWHEN;
  private static final SubLSymbol $sym175$__;
  private static final SubLList $list176;
  private static final SubLList $list177;
  private static final SubLList $list178;
  private static final SubLList $list179;

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 1403L)
  public static SubLObject without_recursive_cyclification(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$PUNLESS, $list1, ConsesLow.listS( $sym2$CLET, $list3, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 1637L)
  public static SubLObject without_duplicate_cyclification(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym4$PROGN, ConsesLow.listS( $sym0$PUNLESS, $list5, $list6, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 1894L)
  public static SubLObject cyclifiable_p(final SubLObject cyclifiable)
  {
    return interfaces.subloop_instanceof_interface( cyclifiable, $sym7$CYCLIFIABLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 4770L)
  public static SubLObject parse_tree_interface_p(final SubLObject parse_tree_interface)
  {
    return interfaces.subloop_instanceof_interface( parse_tree_interface, $sym15$PARSE_TREE_INTERFACE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 4893L)
  public static SubLObject cyclifiable_phrase_p(final SubLObject cyclifiable_phrase)
  {
    return interfaces.subloop_instanceof_interface( cyclifiable_phrase, $sym17$CYCLIFIABLE_PHRASE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 4957L)
  public static SubLObject cyclifiable_noun_phrase_p(final SubLObject cyclifiable_noun_phrase)
  {
    return interfaces.subloop_instanceof_interface( cyclifiable_noun_phrase, $sym20$CYCLIFIABLE_NOUN_PHRASE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 5033L)
  public static SubLObject cyclifiable_verb_phrase_p(final SubLObject cyclifiable_verb_phrase)
  {
    return interfaces.subloop_instanceof_interface( cyclifiable_verb_phrase, $sym23$CYCLIFIABLE_VERB_PHRASE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 5697L)
  public static SubLObject resolve_cyclifiable_coreferences(final SubLObject cyclifiables, final SubLObject resolver)
  {
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( resolver, $sym30$RUN, cyclifiables );
    SubLObject corefering = NIL;
    corefering = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject referents = methods.funcall_instance_method_with_0_args( corefering.first(), $sym28$GET_REFS );
      SubLObject cdolist_list_var_$1 = corefering.rest();
      SubLObject word = NIL;
      word = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        instances.set_slot( word, $sym29$REFS, referents );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        word = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      corefering = cdolist_list_var.first();
    }
    return cyclifiables;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 6057L)
  public static SubLObject alist_cpushnew(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    value = current.first();
    current = current.rest();
    final SubLObject test = current.isCons() ? current.first() : $list32;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list31 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym33$CSETQ, list, ConsesLow.list( $sym34$ALIST_PUSHNEW, list, key, value, test ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list31 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 6199L)
  public static SubLObject get_mod_cycls(final SubLObject word)
  {
    SubLObject mod_cycls = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( word, $sym36$GET_MODIFIERS );
    SubLObject modifier = NIL;
    modifier = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args( modifier, $sym35$CYCLIFY_INT );
      if( NIL != mod_cycl )
      {
        mod_cycls = ConsesLow.cons( mod_cycl, mod_cycls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      modifier = cdolist_list_var.first();
    }
    return mod_cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 10703L)
  public static SubLObject cyclifiable_sentential_phrase_p(final SubLObject cyclifiable_sentential_phrase)
  {
    return interfaces.subloop_instanceof_interface( cyclifiable_sentential_phrase, $sym43$CYCLIFIABLE_SENTENTIAL_PHRASE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 10790L)
  public static SubLObject cyclifiable_prepositional_phrase_p(final SubLObject cyclifiable_prepositional_phrase)
  {
    return interfaces.subloop_instanceof_interface( cyclifiable_prepositional_phrase, $sym46$CYCLIFIABLE_PREPOSITIONAL_PHRASE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 10875L)
  public static SubLObject cyclifiable_word_p(final SubLObject cyclifiable_word)
  {
    return interfaces.subloop_instanceof_interface( cyclifiable_word, $sym47$CYCLIFIABLE_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 13993L)
  public static SubLObject renaming_key(final SubLObject renaming)
  {
    SubLObject cdolist_list_var = renaming;
    SubLObject keyXvalue = NIL;
    keyXvalue = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( keyXvalue.first().eql( $kw61$SUBJECT ) )
      {
        return keyXvalue.rest();
      }
      cdolist_list_var = cdolist_list_var.rest();
      keyXvalue = cdolist_list_var.first();
    }
    return $kw62$DEFAULT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 14159L)
  public static SubLObject group_disjunctive_renamings(final SubLObject disjunction)
  {
    final SubLObject groupings = Hashtables.make_hash_table( SIXTEEN_INTEGER, EQL, UNPROVIDED );
    SubLObject new_disjunction = NIL;
    SubLObject cdolist_list_var = disjunction;
    SubLObject conjunction = NIL;
    conjunction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject groups = NIL;
      SubLObject cdolist_list_var_$2 = conjunction;
      SubLObject renaming = NIL;
      renaming = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        final SubLObject key = renaming_key( renaming );
        Hashtables.sethash( key, groupings, ConsesLow.cons( renaming, Hashtables.gethash( key, groupings, NIL ) ) );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        renaming = cdolist_list_var_$2.first();
      }
      SubLObject key = NIL;
      SubLObject group = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( groupings );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          group = Hashtables.getEntryValue( cdohash_entry );
          groups = ConsesLow.cons( group, groups );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      Hashtables.clrhash( groupings );
      new_disjunction = ConsesLow.cons( groups, new_disjunction );
      cdolist_list_var = cdolist_list_var.rest();
      conjunction = cdolist_list_var.first();
    }
    return new_disjunction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 17587L)
  public static SubLObject keyword_eq_classes(final SubLObject keywords)
  {
    SubLObject equivalence_classes = NIL;
    SubLObject cdolist_list_var = keywords;
    SubLObject keyword = NIL;
    keyword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !keyword.eql( $kw70$ACTION ) )
      {
        final SubLObject equivalence_class = get_keyword_equivalence_class( keyword );
        if( NIL == subl_promotions.memberP( equivalence_class, equivalence_classes, EQUAL, UNPROVIDED ) )
        {
          equivalence_classes = ConsesLow.cons( equivalence_class, equivalence_classes );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      keyword = cdolist_list_var.first();
    }
    return equivalence_classes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 18098L)
  public static SubLObject lex_keyword_eq_classes(final SubLObject lex)
  {
    return keyword_eq_classes( cyclifier.lexical_keywords( lex ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 18287L)
  public static SubLObject lex_entry_score(final SubLObject lex, final SubLObject tree_eq_classes)
  {
    final SubLObject lex_eq_classes = lex_keyword_eq_classes( lex );
    final SubLObject intersection = conses_high.intersection( tree_eq_classes, lex_eq_classes, EQUAL, UNPROVIDED );
    final SubLObject difference = conses_high.union( conses_high.set_difference( tree_eq_classes, intersection, EQUAL, UNPROVIDED ), conses_high.set_difference( lex_eq_classes, intersection, EQUAL, UNPROVIDED ),
        UNPROVIDED, UNPROVIDED );
    final SubLObject frame = methods.funcall_instance_method_with_1_args( lex, $sym72$GET, $kw73$FRAME );
    final SubLObject bonus = ( NIL != isa.isaP( frame, $const74$ParticleFrameType, $const75$EverythingPSC, UNPROVIDED ) ) ? ONE_INTEGER : ZERO_INTEGER;
    return Numbers.add( Numbers.subtract( Sequences.length( intersection ), Sequences.length( difference ) ), bonus );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 19100L)
  public static SubLObject get_keyword_equivalence_class(final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $context_keyword_equivalence$.getDynamicValue( thread );
    SubLObject eq_class = NIL;
    eq_class = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( keyword, eq_class, EQL, UNPROVIDED ) )
      {
        return eq_class;
      }
      cdolist_list_var = cdolist_list_var.rest();
      eq_class = cdolist_list_var.first();
    }
    return ConsesLow.list( keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 21892L)
  public static SubLObject nominal_word_p(final SubLObject nominal_word)
  {
    return interfaces.subloop_instanceof_interface( nominal_word, $sym82$NOMINAL_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 22298L)
  public static SubLObject disjunctive_keyword_renamings(final SubLObject conjuncts, final SubLObject disjuncts)
  {
    SubLObject renamings = NIL;
    if( NIL != disjuncts )
    {
      SubLObject cdolist_list_var = disjuncts;
      SubLObject disj = NIL;
      disj = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        renamings = ConsesLow.cons( list_utilities.cross_products( ConsesLow.cons( ConsesLow.list( disj ), conjuncts ) ), renamings );
        cdolist_list_var = cdolist_list_var.rest();
        disj = cdolist_list_var.first();
      }
    }
    else if( NIL != conjuncts )
    {
      renamings = ConsesLow.cons( list_utilities.cross_products( conjuncts ), renamings );
    }
    else
    {
      renamings = ConsesLow.cons( ConsesLow.list( NIL ), renamings );
    }
    return renamings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 22640L)
  public static SubLObject coordinate_keyword_renaming(final SubLObject keyword, final SubLObject word)
  {
    SubLObject renamings = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( word, $sym28$GET_REFS );
    SubLObject ref = NIL;
    ref = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      renamings = ConsesLow.cons( ConsesLow.cons( keyword, ref ), renamings );
      cdolist_list_var = cdolist_list_var.rest();
      ref = cdolist_list_var.first();
    }
    return renamings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 27178L)
  public static SubLObject partition_modifiers(final SubLObject modifiers)
  {
    SubLObject independents = NIL;
    SubLObject dependents = NIL;
    SubLObject cdolist_list_var = modifiers;
    SubLObject modifier = NIL;
    modifier = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mod_head = methods.funcall_instance_method_with_0_args( modifier, $sym91$GET_HEAD );
      if( NIL != mod_head )
      {
        if( NIL != methods.funcall_instance_method_with_0_args( mod_head, $sym66$MODIFIED_DEPENDENT_MEANING_P ) )
        {
          dependents = ConsesLow.cons( mod_head, dependents );
        }
        else
        {
          independents = ConsesLow.cons( mod_head, independents );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      modifier = cdolist_list_var.first();
    }
    return Values.values( independents, dependents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 27619L)
  public static SubLObject apply_lex_renaming(final SubLObject word, final SubLObject rle, final SubLObject renaming)
  {
    final SubLObject renamed_formula = cyclifier.rename_variables( cyclifier.rename_variables( methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym72$GET, $kw92$SEMTRANS ), cyclifier
        .frame_renaming( methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym72$GET, $kw73$FRAME ) ) ), renaming );
    if( NIL != renamed_formula )
    {
      return cyclifier.new_cyclification( renamed_formula, word, cyclifier.rle_confidence( rle ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 27963L)
  public static SubLObject update_keyword_renaming(final SubLObject renaming, final SubLObject key, final SubLObject new_value)
  {
    SubLObject cdolist_list_var = renaming;
    SubLObject keyXvalue = NIL;
    keyXvalue = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( keyXvalue.first().eql( key ) )
      {
        ConsesLow.rplacd( keyXvalue, new_value );
      }
      cdolist_list_var = cdolist_list_var.rest();
      keyXvalue = cdolist_list_var.first();
    }
    return renaming;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 28218L)
  public static SubLObject update_keyword_renamings(final SubLObject renamings_disj, final SubLObject key, final SubLObject new_value)
  {
    SubLObject cdolist_list_var = renamings_disj;
    SubLObject renamings_conj = NIL;
    renamings_conj = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$3 = renamings_conj;
      SubLObject renaming = NIL;
      renaming = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        update_keyword_renaming( renaming, key, new_value );
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        renaming = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      renamings_conj = cdolist_list_var.first();
    }
    return renamings_disj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 31500L)
  public static SubLObject name_word_p(final SubLObject name_word)
  {
    return interfaces.subloop_instanceof_interface( name_word, $sym99$NAME_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 31942L)
  public static SubLObject verbal_word_p(final SubLObject verbal_word)
  {
    return interfaces.subloop_instanceof_interface( verbal_word, $sym104$VERBAL_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 35338L)
  public static SubLObject delete_cyclifiable(final SubLObject cyclifiable, final SubLObject list)
  {
    SubLObject new_list = NIL;
    SubLObject cdolist_list_var = list;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == methods.funcall_instance_method_with_1_args( element, EQUAL, cyclifiable ) )
      {
        new_list = ConsesLow.cons( element, new_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 39416L)
  public static SubLObject aux_verb_word_p(final SubLObject aux_verb_word)
  {
    return interfaces.subloop_instanceof_interface( aux_verb_word, $sym124$AUX_VERB_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 43114L)
  public static SubLObject adjectival_word_p(final SubLObject adjectival_word)
  {
    return interfaces.subloop_instanceof_interface( adjectival_word, $sym137$ADJECTIVAL_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 44565L)
  public static SubLObject adverbial_word_p(final SubLObject adverbial_word)
  {
    return interfaces.subloop_instanceof_interface( adverbial_word, $sym142$ADVERBIAL_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 45610L)
  public static SubLObject prepositional_or_particle_word_p(final SubLObject prepositional_or_particle_word)
  {
    return interfaces.subloop_instanceof_interface( prepositional_or_particle_word, $sym146$PREPOSITIONAL_OR_PARTICLE_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 46980L)
  public static SubLObject quantifier_word_p(final SubLObject quantifier_word)
  {
    return interfaces.subloop_instanceof_interface( quantifier_word, $sym150$QUANTIFIER_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 48551L)
  public static SubLObject punctuation_word_p(final SubLObject punctuation_word)
  {
    return interfaces.subloop_instanceof_interface( punctuation_word, $sym153$PUNCTUATION_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 48619L)
  public static SubLObject possessive_word_p(final SubLObject possessive_word)
  {
    return interfaces.subloop_instanceof_interface( possessive_word, $sym154$POSSESSIVE_WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 49433L)
  public static SubLObject compute_main_verb_tag(final SubLObject word)
  {
    final SubLObject string = methods.funcall_instance_method_with_0_args( word, $sym157$GET_STRING );
    if( NIL != methods.funcall_instance_method_with_0_args( word, $sym158$BASE_P ) )
    {
      return $kw159$VB;
    }
    if( NIL != conses_high.member( string, $list160, EQUAL, UNPROVIDED ) )
    {
      return $kw161$VBP;
    }
    if( NIL != conses_high.member( string, $list162, EQUAL, UNPROVIDED ) )
    {
      return $kw163$VBZ;
    }
    if( NIL != conses_high.member( string, $list164, EQUAL, UNPROVIDED ) )
    {
      final SubLObject aunt = methods.funcall_instance_method_with_1_args( methods.funcall_instance_method_with_0_args( word, $sym165$GET_MOTHER ), $sym166$GET_SISTER, MINUS_ONE_INTEGER );
      return ( NIL != aunt && NIL != aux_verb_word_p( aunt ) ) ? $kw167$VBN : $kw168$VBD;
    }
    if( methods.funcall_instance_method_with_0_args( word, $sym169$GET_CATEGORY ) == $kw170$AUXG )
    {
      return $kw171$VBG;
    }
    return methods.funcall_instance_method_with_0_args( word, $sym169$GET_CATEGORY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-interface.lisp", position = 49978L)
  public static SubLObject trace_cyclifier(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    final SubLObject level = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list172 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list172 );
      return NIL;
    }
    assert NIL != subl_promotions.non_negative_integer_p( level ) : level;
    return ConsesLow.list( $sym4$PROGN, ConsesLow.listS( $sym174$PWHEN, ConsesLow.listS( $sym175$__, level, $list176 ), $list177 ), ConsesLow.listS( $sym174$PWHEN, ConsesLow.listS( $sym175$__, level, $list178 ),
        $list179 ) );
  }

  public static SubLObject declare_cyclifier_interface_file()
  {
    SubLFiles.declareMacro( me, "without_recursive_cyclification", "WITHOUT-RECURSIVE-CYCLIFICATION" );
    SubLFiles.declareMacro( me, "without_duplicate_cyclification", "WITHOUT-DUPLICATE-CYCLIFICATION" );
    SubLFiles.declareFunction( me, "cyclifiable_p", "CYCLIFIABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_interface_p", "PARSE-TREE-INTERFACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifiable_phrase_p", "CYCLIFIABLE-PHRASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifiable_noun_phrase_p", "CYCLIFIABLE-NOUN-PHRASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifiable_verb_phrase_p", "CYCLIFIABLE-VERB-PHRASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "resolve_cyclifiable_coreferences", "RESOLVE-CYCLIFIABLE-COREFERENCES", 2, 0, false );
    SubLFiles.declareMacro( me, "alist_cpushnew", "ALIST-CPUSHNEW" );
    SubLFiles.declareFunction( me, "get_mod_cycls", "GET-MOD-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifiable_sentential_phrase_p", "CYCLIFIABLE-SENTENTIAL-PHRASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifiable_prepositional_phrase_p", "CYCLIFIABLE-PREPOSITIONAL-PHRASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifiable_word_p", "CYCLIFIABLE-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "renaming_key", "RENAMING-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "group_disjunctive_renamings", "GROUP-DISJUNCTIVE-RENAMINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_eq_classes", "KEYWORD-EQ-CLASSES", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_keyword_eq_classes", "LEX-KEYWORD-EQ-CLASSES", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_entry_score", "LEX-ENTRY-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_keyword_equivalence_class", "GET-KEYWORD-EQUIVALENCE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_p", "NOMINAL-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "disjunctive_keyword_renamings", "DISJUNCTIVE-KEYWORD-RENAMINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "coordinate_keyword_renaming", "COORDINATE-KEYWORD-RENAMING", 2, 0, false );
    SubLFiles.declareFunction( me, "partition_modifiers", "PARTITION-MODIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "apply_lex_renaming", "APPLY-LEX-RENAMING", 3, 0, false );
    SubLFiles.declareFunction( me, "update_keyword_renaming", "UPDATE-KEYWORD-RENAMING", 3, 0, false );
    SubLFiles.declareFunction( me, "update_keyword_renamings", "UPDATE-KEYWORD-RENAMINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "name_word_p", "NAME-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_p", "VERBAL-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "delete_cyclifiable", "DELETE-CYCLIFIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "aux_verb_word_p", "AUX-VERB-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_word_p", "ADJECTIVAL-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "adverbial_word_p", "ADVERBIAL-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_p", "PREPOSITIONAL-OR-PARTICLE-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "quantifier_word_p", "QUANTIFIER-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "punctuation_word_p", "PUNCTUATION-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possessive_word_p", "POSSESSIVE-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_main_verb_tag", "COMPUTE-MAIN-VERB-TAG", 1, 0, false );
    SubLFiles.declareMacro( me, "trace_cyclifier", "TRACE-CYCLIFIER" );
    return NIL;
  }

  public static SubLObject init_cyclifier_interface_file()
  {
    $cyclification_in_progress$ = SubLFiles.defparameter( "*CYCLIFICATION-IN-PROGRESS*", NIL );
    $cyclification_complete$ = SubLFiles.defparameter( "*CYCLIFICATION-COMPLETE*", NIL );
    $allow_duplicate_cyclificationsP$ = SubLFiles.defparameter( "*ALLOW-DUPLICATE-CYCLIFICATIONS?*", NIL );
    $context_keyword_equivalence$ = SubLFiles.defparameter( "*CONTEXT-KEYWORD-EQUIVALENCE*", $list71 );
    return NIL;
  }

  public static SubLObject setup_cyclifier_interface_file()
  {
    interfaces.new_interface( $sym7$CYCLIFIABLE, NIL, NIL, $list8 );
    interfaces.interfaces_add_interface_instance_method( $sym9$CYCLIFY, $sym7$CYCLIFIABLE, $list10, $list11, $list12 );
    interfaces.interfaces_add_interface_instance_method( $sym13$GET_CYCLIFIER, $sym7$CYCLIFIABLE, $list10, $list11, $list14 );
    interfaces.new_interface( $sym15$PARSE_TREE_INTERFACE, NIL, NIL, $list16 );
    interfaces.new_interface( $sym17$CYCLIFIABLE_PHRASE, $list18, $list19, NIL );
    interfaces.new_interface( $sym20$CYCLIFIABLE_NOUN_PHRASE, $list21, $list22, NIL );
    interfaces.new_interface( $sym23$CYCLIFIABLE_VERB_PHRASE, $list21, $list22, $list24 );
    interfaces.interfaces_add_interface_instance_method( $sym25$VP_COORDINATE_PHRASE_P, $sym23$CYCLIFIABLE_VERB_PHRASE, $list26, NIL, $list27 );
    interfaces.interfaces_add_interface_instance_method( $sym37$CYCLIFY_INT_VP, $sym23$CYCLIFIABLE_VERB_PHRASE, $list38, NIL, $list39 );
    interfaces.interfaces_add_interface_instance_method( $sym35$CYCLIFY_INT, $sym23$CYCLIFIABLE_VERB_PHRASE, $list38, NIL, $list40 );
    interfaces.interfaces_add_interface_instance_method( $sym41$CYCLIFY_INT_VP_COORDINATION, $sym23$CYCLIFIABLE_VERB_PHRASE, $list38, NIL, $list42 );
    interfaces.new_interface( $sym43$CYCLIFIABLE_SENTENTIAL_PHRASE, $list44, $list45, NIL );
    interfaces.new_interface( $sym46$CYCLIFIABLE_PREPOSITIONAL_PHRASE, $list21, $list22, NIL );
    interfaces.new_interface( $sym47$CYCLIFIABLE_WORD, $list18, $list19, $list48 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym47$CYCLIFIABLE_WORD, $list38, $list50, $list51 );
    interfaces.interfaces_add_interface_instance_method( $sym52$GET_SEMANTIC_COMPLEMENTS, $sym47$CYCLIFIABLE_WORD, $list10, NIL, $list53 );
    interfaces.interfaces_add_interface_instance_method( $sym54$PARTITION_SEMANTIC_COMPLEMENTS, $sym47$CYCLIFIABLE_WORD, $list38, NIL, $list55 );
    interfaces.interfaces_add_interface_instance_method( $sym56$GET_PP_COMPLEMENT, $sym47$CYCLIFIABLE_WORD, $list10, NIL, $list57 );
    interfaces.interfaces_add_interface_instance_method( $sym58$GET_OBLIQUE_OBJECT, $sym47$CYCLIFIABLE_WORD, $list10, NIL, $list59 );
    interfaces.interfaces_add_interface_instance_method( $sym35$CYCLIFY_INT, $sym47$CYCLIFIABLE_WORD, $list38, NIL, $list60 );
    interfaces.interfaces_add_interface_instance_method( $sym63$CYCLIFY_NUCLEUS, $sym47$CYCLIFIABLE_WORD, $list38, $list64, $list65 );
    interfaces.interfaces_add_interface_instance_method( $sym66$MODIFIED_DEPENDENT_MEANING_P, $sym47$CYCLIFIABLE_WORD, $list38, NIL, $list67 );
    interfaces.interfaces_add_interface_instance_method( $sym68$TREE_KEYWORD_EQ_CLASSES, $sym47$CYCLIFIABLE_WORD, $list38, NIL, $list69 );
    interfaces.interfaces_add_interface_instance_method( $sym76$POS_FILTER_LEXES, $sym47$CYCLIFIABLE_WORD, $list38, NIL, $list77 );
    interfaces.interfaces_add_interface_instance_method( $sym78$PP_COMP_FILTER_LEXES, $sym47$CYCLIFIABLE_WORD, $list38, NIL, $list79 );
    interfaces.interfaces_add_interface_instance_method( $sym80$FRAME_FILTER_LEXES, $sym47$CYCLIFIABLE_WORD, $list38, NIL, $list81 );
    interfaces.new_interface( $sym82$NOMINAL_WORD, $list83, $list84, $list85 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym82$NOMINAL_WORD, $list38, $list86, $list87 );
    interfaces.interfaces_add_interface_instance_method( $sym88$GET_QUANTIFIER, $sym82$NOMINAL_WORD, $list10, NIL, $list89 );
    interfaces.interfaces_add_interface_instance_method( $sym35$CYCLIFY_INT, $sym82$NOMINAL_WORD, $list38, NIL, $list90 );
    interfaces.interfaces_add_interface_instance_method( $sym63$CYCLIFY_NUCLEUS, $sym82$NOMINAL_WORD, $list38, $list93, $list94 );
    interfaces.interfaces_add_interface_instance_method( $sym95$DEFINITE_DESCRIPTION_P, $sym82$NOMINAL_WORD, $list10, NIL, $list96 );
    interfaces.interfaces_add_interface_instance_method( $sym97$RELATIONAL_NOUN_P, $sym82$NOMINAL_WORD, $list10, NIL, $list98 );
    interfaces.new_interface( $sym99$NAME_WORD, $list100, $list101, $list102 );
    interfaces.interfaces_add_interface_instance_method( $sym88$GET_QUANTIFIER, $sym99$NAME_WORD, $list10, NIL, $list103 );
    interfaces.new_interface( $sym104$VERBAL_WORD, $list83, $list84, $list105 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym104$VERBAL_WORD, $list38, $list106, $list107 );
    interfaces.interfaces_add_interface_instance_method( $sym54$PARTITION_SEMANTIC_COMPLEMENTS, $sym104$VERBAL_WORD, $list38, NIL, $list108 );
    interfaces.interfaces_add_interface_instance_method( $sym109$PARTICLE_FILTER_LEXES, $sym104$VERBAL_WORD, $list38, NIL, $list110 );
    interfaces.interfaces_add_interface_instance_method( $sym111$GET_MATRIX_CLAUSE, $sym104$VERBAL_WORD, $list38, NIL, $list112 );
    interfaces.interfaces_add_interface_instance_method( $sym111$GET_MATRIX_CLAUSE, $sym104$VERBAL_WORD, $list38, NIL, $list113 );
    interfaces.interfaces_add_interface_instance_method( $sym114$SUBJECT_CONTROLLER_P, $sym104$VERBAL_WORD, $list38, NIL, $list115 );
    interfaces.interfaces_add_interface_instance_method( $sym116$OBJECT_CONTROLLER_P, $sym104$VERBAL_WORD, $list38, NIL, $list117 );
    interfaces.interfaces_add_interface_instance_method( $sym118$CONTROL_VERB_P, $sym104$VERBAL_WORD, $list38, NIL, $list119 );
    interfaces.interfaces_add_interface_instance_method( $sym120$GET_CONTROL_VERB, $sym104$VERBAL_WORD, $list38, NIL, $list121 );
    interfaces.interfaces_add_interface_instance_method( $sym122$GET_CONTROLLER, $sym104$VERBAL_WORD, $list38, NIL, $list123 );
    interfaces.new_interface( $sym124$AUX_VERB_WORD, $list83, $list84, $list125 );
    interfaces.interfaces_add_interface_instance_method( $sym126$GET_TENSE, $sym124$AUX_VERB_WORD, $list10, NIL, $list127 );
    interfaces.interfaces_add_interface_instance_method( $sym128$GET_SEMANTIC_HEADS, $sym124$AUX_VERB_WORD, $list10, NIL, $list129 );
    interfaces.interfaces_add_interface_instance_method( $sym130$GET_COMPLEMENTS, $sym124$AUX_VERB_WORD, $list38, NIL, $list131 );
    interfaces.interfaces_add_interface_instance_method( $sym52$GET_SEMANTIC_COMPLEMENTS, $sym124$AUX_VERB_WORD, $list38, NIL, $list132 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym124$AUX_VERB_WORD, $list38, $list133, $list134 );
    interfaces.interfaces_add_interface_instance_method( $sym135$COPULA_P, $sym124$AUX_VERB_WORD, $list10, NIL, $list136 );
    interfaces.new_interface( $sym137$ADJECTIVAL_WORD, $list83, $list84, $list138 );
    interfaces.interfaces_add_interface_instance_method( $sym130$GET_COMPLEMENTS, $sym137$ADJECTIVAL_WORD, $list10, NIL, $list139 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym137$ADJECTIVAL_WORD, $list38, $list140, $list141 );
    interfaces.new_interface( $sym142$ADVERBIAL_WORD, $list83, $list84, $list143 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym142$ADVERBIAL_WORD, $list38, $list144, $list145 );
    interfaces.new_interface( $sym146$PREPOSITIONAL_OR_PARTICLE_WORD, $list83, $list84, $list147 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym146$PREPOSITIONAL_OR_PARTICLE_WORD, $list38, $list148, $list149 );
    interfaces.new_interface( $sym150$QUANTIFIER_WORD, $list83, $list84, $list143 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym150$QUANTIFIER_WORD, $list38, $list151, $list152 );
    interfaces.new_interface( $sym153$PUNCTUATION_WORD, $list83, $list84, NIL );
    interfaces.new_interface( $sym154$POSSESSIVE_WORD, $list83, $list84, $list143 );
    interfaces.interfaces_add_interface_instance_method( $sym49$GET_KEYWORD_RENAMINGS, $sym154$POSSESSIVE_WORD, $list38, $list155, $list156 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyclifier_interface_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyclifier_interface_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyclifier_interface_file();
  }
  static
  {
    me = new cyclifier_interface();
    $cyclification_in_progress$ = null;
    $cyclification_complete$ = null;
    $allow_duplicate_cyclificationsP$ = null;
    $context_keyword_equivalence$ = null;
    $sym0$PUNLESS = makeSymbol( "PUNLESS" );
    $list1 = ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "SELF" ), makeSymbol( "*CYCLIFICATION-IN-PROGRESS*" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) );
    $sym2$CLET = makeSymbol( "CLET" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CYCLIFICATION-IN-PROGRESS*" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "SELF" ), makeSymbol( "*CYCLIFICATION-IN-PROGRESS*" ) ) ) );
    $sym4$PROGN = makeSymbol( "PROGN" );
    $list5 = ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "*ALLOW-DUPLICATE-CYCLIFICATIONS?*" ) ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "SELF" ), makeSymbol(
        "*CYCLIFICATION-COMPLETE*" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) );
    $list6 = ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "SELF" ), makeSymbol( "*CYCLIFICATION-COMPLETE*" ) );
    $sym7$CYCLIFIABLE = makeSymbol( "CYCLIFIABLE" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-CYCLIFIER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFIABLE-QUESTION-P" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym9$CYCLIFY = makeSymbol( "CYCLIFY" );
    $list10 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list11 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "PROPERTIES" ) );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-CYCLIFIER" ) ), makeSymbol( "PROPERTIES" ) ) ), ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "CYCLIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HAS-NEXT?" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CYCLIFIER" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ), makeSymbol( "CYCLS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "CYCLS" ) ) ) ) );
    $sym13$GET_CYCLIFIER = makeSymbol( "GET-CYCLIFIER" );
    $list14 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "LEXICON" ), ConsesLow.list(
        makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFIER-LEXICON" ) ) ) ), ConsesLow.list( makeSymbol( "SCORE-FUNCTION" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "CYCLIFICATION-SCORE" ) ) ), ConsesLow.list( makeSymbol( "OUTPUT" ), makeKeyword( "BRIEF" ) ), ConsesLow.list( makeSymbol( "WFF-CHECK?" ), T ), makeSymbol( "CONTEXT" ), ConsesLow.list( makeSymbol(
                "DISAMBIGUATOR" ), NIL ), ConsesLow.list( makeSymbol( "COREFERENCE-RESOLVER" ), NIL ), ConsesLow.list( makeSymbol( "ERROR-HANDLING" ), makeKeyword( "THROW" ) ), ConsesLow.list( makeSymbol(
                    "SUBCYCLIFIER-POOL" ), ConsesLow.list( makeSymbol( "NEW-CYCLIFIER-POOL" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "DATE-CYCLIFIER" ) ) ) ) ) ), makeSymbol( "&ALLOW-OTHER-KEYS" )
        } ), makeSymbol( "PROPERTIES" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "LEXICON" ), makeSymbol( "CYCLIFIER-LEXICON-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol(
            "SCORE-FUNCTION" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OUTPUT" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ),
                makeSymbol( "CONTEXT" ), makeSymbol( "PARSE-TREE-CONTEXT-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "WFF-CHECK?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "MUST" ),
                    ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "ERROR-HANDLING" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "THROW" ), makeKeyword( "WARN" ), makeKeyword(
                        "IGNORE" ) ) ) ), makeString( "Invalid error-handling tag ~a" ), makeSymbol( "ERROR-HANDLING" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "SUBCYCLIFIER-POOL" ),
                            makeSymbol( "CYCLIFIER-POOL-P" ) ), ConsesLow.list( new SubLObject[]
                            { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIFIER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "CYCLIFIER" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-SCORE-FUNCTION" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "SCORE-FUNCTION" ) ), ConsesLow.list( makeSymbol(
                                    "SET-CYCLIFIER-OUTPUT" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "OUTPUT" ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-ERROR-HANDLING" ), makeSymbol( "CYCLIFIER" ), makeSymbol(
                                        "ERROR-HANDLING" ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-SUBCYCLIFIER-POOL" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "SUBCYCLIFIER-POOL" ) ), ConsesLow.list( makeSymbol(
                                            "PWHEN" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY" ) ), makeSymbol(
                                                "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DISAMBIGUATOR" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ),
                                                    makeSymbol( "CONTEXT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTEXT" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list(
                                                        makeSymbol( "QUOTE" ), makeSymbol( "PARSE-TREE-CONTEXT" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DISAMBIGUATOR" ), ConsesLow.list( makeSymbol(
                                                            "QUOTE" ), makeSymbol( "DISAMBIGUATE" ) ), makeSymbol( "SELF" ), makeSymbol( "CONTEXT" ) ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol(
                                                                "COREFERENCE-RESOLVER" ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-TREE" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "SELF" ) ), ConsesLow.list(
                                                                    makeSymbol( "SET-CYCLIFIER-WFF-CHECK?" ), makeSymbol( "CYCLIFIER" ), makeSymbol( "WFF-CHECK?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                                                                        "WFF-CHECK?" ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-MEMOIZATION-STATE" ), makeSymbol( "CYCLIFIER" ), ConsesLow.list( makeSymbol(
                                                                            "NEW-MEMOIZATION-STATE" ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFIER-SBHL-RESOURCE" ), makeSymbol( "CYCLIFIER" ), ConsesLow.list(
                                                                                makeSymbol( "NEW-SBHL-MARKING-SPACE-RESOURCE" ), TEN_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCLIFIER" ) )
        } )
    } ) );
    $sym15$PARSE_TREE_INTERFACE = makeSymbol( "PARSE-TREE-INTERFACE" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SISTER" ), ConsesLow.list( makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-DAUGHTER" ), ConsesLow.list( makeSymbol( "I" ) ) ) );
    $sym17$CYCLIFIABLE_PHRASE = makeSymbol( "CYCLIFIABLE-PHRASE" );
    $list18 = ConsesLow.list( makeSymbol( "CYCLIFIABLE" ) );
    $list19 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "CYCLIFIABLE" ) ) );
    $sym20$CYCLIFIABLE_NOUN_PHRASE = makeSymbol( "CYCLIFIABLE-NOUN-PHRASE" );
    $list21 = ConsesLow.list( makeSymbol( "CYCLIFIABLE-PHRASE" ) );
    $list22 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "CYCLIFIABLE-PHRASE" ) ) );
    $sym23$CYCLIFIABLE_VERB_PHRASE = makeSymbol( "CYCLIFIABLE-VERB-PHRASE" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "VP-COORDINATE-PHRASE-P" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "CYCLIFY-INT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-INT-VP" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-INT-VP-COORDINATION" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym25$VP_COORDINATE_PHRASE_P = makeSymbol( "VP-COORDINATE-PHRASE-P" );
    $list26 = ConsesLow.list( makeKeyword( "PROTECED" ) );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-CONJUNCTION" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
            makeSymbol( "MEMBER-IF-NOT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFIABLE-VERB-PHRASE-P" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ) ) ) ) ) );
    $sym28$GET_REFS = makeSymbol( "GET-REFS" );
    $sym29$REFS = makeSymbol( "REFS" );
    $sym30$RUN = makeSymbol( "RUN" );
    $list31 = ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), EQL ) ) ) );
    $list32 = ConsesLow.list( makeSymbol( "QUOTE" ), EQL );
    $sym33$CSETQ = makeSymbol( "CSETQ" );
    $sym34$ALIST_PUSHNEW = makeSymbol( "ALIST-PUSHNEW" );
    $sym35$CYCLIFY_INT = makeSymbol( "CYCLIFY-INT" );
    $sym36$GET_MODIFIERS = makeSymbol( "GET-MODIFIERS" );
    $sym37$CYCLIFY_INT_VP = makeSymbol( "CYCLIFY-INT-VP" );
    $list38 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "SUBCYCLIFIER-CYCLIFY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "HEADS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEADS" ) ) ) ), ConsesLow.list( makeSymbol( "ALL-CONJUNCTION-CYCLS" ),
                NIL ), ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ), ConsesLow.list(
                    makeSymbol( "COMPLEMENTS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEADS" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "HEADS" ) ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "COMP-CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) ),
            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COMPLEMENTS" ), ConsesLow.list( makeSymbol( "DELETE-CYCLIFIABLE" ), makeSymbol( "SUBJECT" ), makeSymbol( "COMPLEMENTS" ) ) ), ConsesLow.list( makeSymbol(
                "WITHOUT-RECURSIVE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*CYCLIFICATION-IN-PROGRESS*" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol(
                    "HEADS" ), makeSymbol( "*CYCLIFICATION-IN-PROGRESS*" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "HEADS" ) ), ConsesLow.list( makeSymbol(
                        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALL-HEAD-CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "MOD-CYCLS" ), ConsesLow.list( makeSymbol( "GET-MOD-CYCLS" ), makeSymbol( "HEAD" ) ) ),
                            ConsesLow.list( makeSymbol( "RENAMINGS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow
                                .list( makeSymbol( "REQUIRED-KEYWORDS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ) ) ) ),
                        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CONJUNCTION" ), makeSymbol( "RENAMINGS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                            "ALL-RLE-CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPOSITE-VERBAL-CYCLS" ), NIL ) ), ConsesLow.list(
                                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RENAMING" ), makeSymbol( "CONJUNCTION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                        "RENAMED0" ), ConsesLow.list( makeSymbol( "APPLY-LEX-RENAMING" ), makeSymbol( "HEAD" ), makeSymbol( "RLE" ), makeSymbol( "RENAMING" ) ) ), ConsesLow.list( makeSymbol( "RENAMED" ),
                                            ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "RENAMED0" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "QUANTIFY-IMPLICIT-SUBJECT" ), makeSymbol(
                                                "RENAMED0" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "ALIST-CPUSHNEW" ), makeSymbol( "COMPOSITE-VERBAL-CYCLS" ), ConsesLow.list( makeSymbol( "RENAMING-KEY" ), makeSymbol(
                                                    "RENAMING" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol(
                                                        "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "RENAMED" ), makeSymbol( "MOD-CYCLS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                            ConsesLow.list( ConsesLow.list( makeSymbol( "SENSE-CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "VALUE" ), ConsesLow
                                                                .list( makeSymbol( "ALIST-VALUES" ), makeSymbol( "COMPOSITE-VERBAL-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                                    "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                        "VALUE" ) ) ), makeSymbol( "SENSE-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "SENSE-CYCLS" ), makeSymbol(
                                                                            "ALL-RLE-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                                "ALL-RLE-CYCLS" ) ), makeSymbol( "ALL-HEAD-CYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ALL-HEAD-CYCLS" ),
                                                                                    makeSymbol( "ALL-CONJUNCTION-CYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ),
                                                                                        makeSymbol( "COMPLEMENTS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCL" ),
                                                                                            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol(
                                                                                                    "CPUSH" ), makeSymbol( "COMP-CYCL" ), makeSymbol( "COMP-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                                                                                                        ConsesLow.list( makeSymbol( "ALL-HEAD-CYCLS" ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                                                            "ALL-CONJUNCTION-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                                                "CYCLS0" ), NIL ), ConsesLow.list( makeSymbol( "ALL-SUBJECTS-WITH-OBJECTS-CYCLS" ), NIL ) ), ConsesLow.list(
                                                                                                                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol(
                                                                                                                        "INDEXED-PRODUCTS" ), makeSymbol( "ALL-HEAD-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                                                                                            ConsesLow.list( ConsesLow.list( makeSymbol( "COMPLETE-CYCL-FOR-ONE-SUBJECT" ), NIL ) ),
                                                                                                                            ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM2" ), ConsesLow.list(
                                                                                                                                makeSymbol( "CROSS-PRODUCTS" ), makeSymbol( "ITEM" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                    "CSETQ" ), makeSymbol( "COMPLETE-CYCL-FOR-ONE-SUBJECT" ), ConsesLow.list( makeSymbol(
                                                                                                                                        "APPEND" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol(
                                                                                                                                            "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                "INDEXED-PRODUCTS" ), makeSymbol( "ITEM2" ) ) ), makeSymbol(
                                                                                                                                                    "COMPLETE-CYCL-FOR-ONE-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                        "CPUSH" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                                                                                                                                                            makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ),
                                                                                                                                                            ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), ConsesLow.list(
                                                                                                                                                                makeSymbol( "CONS" ), makeSymbol(
                                                                                                                                                                    "COMPLETE-CYCL-FOR-ONE-SUBJECT" ), makeSymbol(
                                                                                                                                                                        "COMP-CYCLS" ) ) ) ), makeSymbol(
                                                                                                                                                                            "ALL-SUBJECTS-WITH-OBJECTS-CYCLS" ) ) ) ),
                                                                                                                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCLS0" ), ConsesLow.list( makeSymbol( "MAPCAR" ),
                                                                                                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol(
                                                                                                                        "INDEXED-PRODUCTS" ), makeSymbol( "ALL-SUBJECTS-WITH-OBJECTS-CYCLS" ) ) ) ), ConsesLow.list(
                                                                                                                            makeSymbol( "CSETQ" ), makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "APPEND" ),
                                                                                                                                makeSymbol( "CYCLS0" ), makeSymbol( "CYCLS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                    "RET" ), makeSymbol( "CYCLS" ) ) ) );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "WITHOUT-DUPLICATE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol(
        "SUBCYCLIFIER-CYCLIFY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCYCLS" ) ) ) ), ConsesLow.list( makeSymbol(
            "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIFIABLE-SENTENTIAL-PHRASE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "HEAD-DTR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD-DAUGHTER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                    makeSymbol( "HEAD-DTR" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD-DTR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "CYCLIFY-INT" ) ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VP-COORDINATE-PHRASE-P" ) ) ), ConsesLow
                            .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT-VP-COORDINATION" ) ) ) ) ), ConsesLow
                                .list( T, ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "SUBJ-CYCLS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list(
                                        makeSymbol( "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "VP-CYCLS" ), ConsesLow.list(
                                            makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT-VP" ) ) ) ), ConsesLow.list( makeSymbol( "SUBJ-VP-CYCLS" ), ConsesLow
                                                .list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJ-CYCLS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SUBJ-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                    makeSymbol( "VP-CYCLS" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "VP-CYCLS" ), makeSymbol( "SUBJ-VP-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                        ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ),
                                                            makeSymbol( "SUBJ-VP-CYCLS" ) ) ) ) ) ) ) ) );
    $sym41$CYCLIFY_INT_VP_COORDINATION = makeSymbol( "CYCLIFY-INT-VP-COORDINATION" );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "SUBCYCLIFIER-CYCLIFY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "SCYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCYCLS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "SUBJ-CYCLS" ), ConsesLow.list(
                makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list(
                    makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONJUNCTION" ) ) ) ), ConsesLow.list( makeSymbol(
                        "VPS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CONJUNCTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "CYCLS" ),
                            NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "VP" ), makeSymbol( "VPS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ),
                                makeSymbol( "VP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT-VP" ) ) ), makeSymbol( "CYCLS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                    "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ),
                                        makeSymbol( "SUBJ-CYCLS" ), makeSymbol( "CYCLS" ) ) ) ) ) ) );
    $sym43$CYCLIFIABLE_SENTENTIAL_PHRASE = makeSymbol( "CYCLIFIABLE-SENTENTIAL-PHRASE" );
    $list44 = ConsesLow.list( makeSymbol( "CYCLIFIABLE-VERB-PHRASE" ) );
    $list45 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "CYCLIFIABLE-VERB-PHRASE" ) ) );
    $sym46$CYCLIFIABLE_PREPOSITIONAL_PHRASE = makeSymbol( "CYCLIFIABLE-PREPOSITIONAL-PHRASE" );
    $sym47$CYCLIFIABLE_WORD = makeSymbol( "CYCLIFIABLE-WORD" );
    $list48 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PPS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET-PP-COMPLEMENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OBLIQUE-OBJECT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ), NIL, makeKeyword(
                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-INT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-NUCLEUS" ), ConsesLow.list(
                            makeSymbol( "&OPTIONAL" ), makeSymbol( "RENAMINGS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MODIFIED-DEPENDENT-MEANING-P" ), NIL,
                                makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POS-FILTER-LEXES" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "TREE-KEYWORD-EQ-CLASSES" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                        "FRAME-FILTER-LEXES" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PP-COMP-FILTER-LEXES" ), NIL, makeKeyword(
                                            "PROTECTED" ) )
    } );
    $sym49$GET_KEYWORD_RENAMINGS = makeSymbol( "GET-KEYWORD-RENAMINGS" );
    $list50 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "KEYWORDS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym52$GET_SEMANTIC_COMPLEMENTS = makeSymbol( "GET-SEMANTIC-COMPLEMENTS" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ) );
    $sym54$PARTITION_SEMANTIC_COMPLEMENTS = makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-SEMANTIC-COMPLEMENTS" ) ) ), NIL ) ) );
    $sym56$GET_PP_COMPLEMENT = makeSymbol( "GET-PP-COMPLEMENT" );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-PPS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PP-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "PP-HEAD-STRING" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP-HEAD" ),
                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                    "PP-HEAD-STRING" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
                            "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                makeSymbol( "FORMULA-KEYWORDS" ), makeSymbol( "CYCL" ) ) ), ConsesLow.list( makeSymbol( "FRAME" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol(
                                    "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list(
                                        makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "OBLIQUE-OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow
                                            .list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "FRAME" ), constant_handles.reader_make_constant_shell(
                                                makeString( "PPCompFrame" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                                    ConsesLow.list( makeSymbol( "PREPOSITION" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ) ), ConsesLow.list( makeSymbol( "PREP-STRING" ),
                                                        ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "GET-STRINGS-OF-TYPE" ), makeSymbol( "PREPOSITION" ), constant_handles
                                                            .reader_make_constant_shell( makeString( "Preposition" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "PREP-STRING" ),
                                                                makeSymbol( "PP-HEAD-STRING" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PP" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ),
                                                                    ConsesLow.list( makeSymbol( "INTERSECTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "POSSESSOR" ), makeKeyword(
                                                                        "POSS-COL" ) ) ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( EQUALP, makeString( "of" ), makeSymbol(
                                                                            "PP-HEAD-STRING" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PP" ) ) ) ) ) ) ) ) ) );
    $sym58$GET_OBLIQUE_OBJECT = makeSymbol( "GET-OBLIQUE-OBJECT" );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GET-PP-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "OBL-OBJ" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBL-OBJ" ) ) ) );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "WITHOUT-DUPLICATE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "CYCLIFY-NUCLEUS" ) ) ) ) ) );
    $kw61$SUBJECT = makeKeyword( "SUBJECT" );
    $kw62$DEFAULT = makeKeyword( "DEFAULT" );
    $sym63$CYCLIFY_NUCLEUS = makeSymbol( "CYCLIFY-NUCLEUS" );
    $list64 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "RENAMINGS" ) );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NDISTR-COMP-CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "DISTR-COMP-CYCLS" ), NIL ), ConsesLow.list(
        makeSymbol( "MOD-CYCLS" ), NIL ), ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "WITHOUT-RECURSIVE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
            "RENAMINGS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RENAMINGS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "REQUIRED-KEYWORDS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-RANKED-LEXES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RENAMINGS" ), ConsesLow.list( makeSymbol( "GROUP-DISJUNCTIVE-RENAMINGS" ), makeSymbol( "RENAMINGS" ) ) ),
            ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "NON-DISTRIBUTING" ), makeSymbol( "DISTRIBUTING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                .list( makeSymbol( "QUOTE" ), makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), makeSymbol( "NON-DISTRIBUTING" ) ),
                    ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COMP-CYCL" ), makeSymbol(
                            "NDISTR-COMP-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), makeSymbol( "DISTRIBUTING" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COMP-CYCL" ), makeSymbol(
                                        "DISTR-COMP-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MODIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIERS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MOD-CYCL" ),
                                                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                    "PWHEN" ), makeSymbol( "MOD-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "MOD-CYCL" ), makeSymbol( "MOD-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                        "CDOLIST" ), ConsesLow.list( makeSymbol( "CONJUNCTION" ), makeSymbol( "RENAMINGS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ),
                                                            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list(
                                                                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MY-CYCLS0" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                                                                    makeSymbol( "GROUPING" ), makeSymbol( "CONJUNCTION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                        "THIS-AND-MODS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RENAMING" ), makeSymbol( "GROUPING" ) ), ConsesLow
                                                                            .list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol(
                                                                                    "LIST" ), ConsesLow.list( makeSymbol( "APPLY-LEX-RENAMING" ), makeSymbol( "SELF" ), makeSymbol( "RLE" ), makeSymbol( "RENAMING" ) ) ),
                                                                                    makeSymbol( "MOD-CYCLS" ) ) ) ), makeSymbol( "THIS-AND-MODS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                                                        "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol(
                                                                                            "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol(
                                                                                                "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                                                    "THIS-AND-MODS" ) ) ), makeSymbol( "NDISTR-COMP-CYCLS" ) ) ) ), makeSymbol( "MY-CYCLS0" ) ) ) ), ConsesLow.list(
                                                                                                        makeSymbol( "CSETQ" ), makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "CYCLS" ),
                                                                                                            ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "INDEXED-PRODUCTS" ), makeSymbol(
                                                                                                                    "MY-CYCLS0" ) ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                                                                                                        "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow
                                                                                                                            .list( makeSymbol( "CROSS-PRODUCTS" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol(
                                                                                                                                "CYCLS" ), makeSymbol( "DISTR-COMP-CYCLS" ) ) ) ) ) ) );
    $sym66$MODIFIED_DEPENDENT_MEANING_P = makeSymbol( "MODIFIED-DEPENDENT-MEANING-P" );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "SEMTRANS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "FIM" ),
            ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                .list( makeSymbol( "MEMBER?" ), makeKeyword( "REPLACE" ), ConsesLow.list( makeSymbol( "FORMULA-KEYWORDS" ), makeSymbol( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), NIL ) ) );
    $sym68$TREE_KEYWORD_EQ_CLASSES = makeSymbol( "TREE-KEYWORD-EQ-CLASSES" );
    $list69 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "KEYWORD-EQ-CLASSES" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CAR" ) ),
        ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-KEYWORD-RENAMINGS" ) ) ) ) ) ) ) ) );
    $kw70$ACTION = makeKeyword( "ACTION" );
    $list71 = ConsesLow.list( ConsesLow.list( makeKeyword( "INF-COMP" ), makeKeyword( "CLAUSE" ) ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "REPLACE" ) ), ConsesLow.list( makeKeyword( "PREP-OBJECT" ),
        makeKeyword( "POSSESSOR" ), makeKeyword( "POSS-COL" ) ) );
    $sym72$GET = makeSymbol( "GET" );
    $kw73$FRAME = makeKeyword( "FRAME" );
    $const74$ParticleFrameType = constant_handles.reader_make_constant_shell( makeString( "ParticleFrameType" ) );
    $const75$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym76$POS_FILTER_LEXES = makeSymbol( "POS-FILTER-LEXES" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ),
        makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                makeKeyword( "PENN-TAGS" ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol(
                    "FILTERED" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                            makeKeyword( "BACKOFF-PENN-TAGS" ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), makeDouble( 0.75 ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                                "RLE" ), makeSymbol( "FILTERED" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "FILTERED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                    "LEXES" ) ) ) );
    $sym78$PP_COMP_FILTER_LEXES = makeSymbol( "PP-COMP-FILTER-LEXES" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ), ConsesLow.list( makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PP-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PP-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PP" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "PP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PP-HEAD" ),
                ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FRAME" ), ConsesLow.list( makeSymbol( "FIM" ),
                    ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                        .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "FRAME" ), constant_handles
                            .reader_make_constant_shell( makeString( "PPCompFrame" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                .list( ConsesLow.list( makeSymbol( "PREPOSITION" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ) ), ConsesLow.list( makeSymbol( "PREP-STRING" ), ConsesLow.list(
                                    makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "GET-STRINGS-OF-TYPE" ), makeSymbol( "PREPOSITION" ), constant_handles.reader_make_constant_shell( makeString(
                                        "Preposition" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "PREP-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PP-HEAD" ),
                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), ONE_INTEGER ), ConsesLow.list(
                                                makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ),
                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "FILTERED" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym80$FRAME_FILTER_LEXES = makeSymbol( "FRAME-FILTER-LEXES" );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ), ConsesLow.list( makeSymbol( "TREE-KEYWORDS" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TREE-KEYWORD-EQ-CLASSES" ) ) ) ), ConsesLow.list( makeSymbol( "LEX-SCORES" ), NIL ), ConsesLow.list( makeSymbol( "MAX-SCORE" ),
            makeInteger( -5 ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-SCORE" ), ConsesLow.list( makeSymbol( "LEX-ENTRY-SCORE" ), ConsesLow.list(
                    makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), makeSymbol( "TREE-KEYWORDS" ) ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "RLE" ), makeSymbol( "LEX-SCORE" ) ), ConsesLow
                        .list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "LEX-SCORES" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "LEX-SCORE" ), makeSymbol(
                            "MAX-SCORE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX-SCORE" ), makeSymbol( "LEX-SCORE" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                                "RLE" ), makeSymbol( "LEX-SCORES" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "RLE-CONFIDENCE" ), makeSymbol( "RLE" ) ),
                                    makeSymbol( "MAX-SCORE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ),
                                        makeSymbol( "FILTERED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym82$NOMINAL_WORD = makeSymbol( "NOMINAL-WORD" );
    $list83 = ConsesLow.list( makeSymbol( "CYCLIFIABLE-WORD" ) );
    $list84 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "CYCLIFIABLE-WORD" ) ) );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-QUANTIFIER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "CYCLIFY-INT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY-NUCLEUS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "DEFINITE-DESCRIPTION-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RELATIONAL-NOUN-P" ), NIL, makeKeyword(
                    "PUBLIC" ) ) );
    $list86 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "POSSESSOR" ), makeKeyword(
        "OBLIQUE-OBJECT" ), makeKeyword( "MODIFIED" ), makeKeyword( "POSS-COL" ), makeKeyword( "NUMBER" ) ) ) ) );
    $list87 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "DISJUNCTS" ), NIL ), ConsesLow.list(
        makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-SEMANTIC-COMPLEMENTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "QUANTIFIER0" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-OVERT-QUANTIFIER" ) ) ) ), ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "QUANTIFIER0" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                    "QUANTIFIER0" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
                            makeKeyword( "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ), makeSymbol( "SELF" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                                    makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "OBLIQUE-OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ),
                                    ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "PREP-OBJECT" ), makeSymbol( "COMPLEMENT" ) ), makeSymbol(
                                        "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword(
                                            "POSSESSOR" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "POSSESSOR" ), makeSymbol( "COMPLEMENT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                                                    .list( makeSymbol( "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "MODIFIED" ), makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                                        makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "MODIFIED" ),
                                                            makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                                                                "QUANTIFIER" ), ConsesLow.list( EQL, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                    "GET-CATEGORY" ) ) ), makeKeyword( "CD" ) ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "NUMBER" ), makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                                                        makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword(
                                                                            "NUMBER" ), makeSymbol( "QUANTIFIER" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                                                                "CAND" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "POSS-COL" ), makeSymbol( "KEYWORDS" ), ConsesLow
                                                                                    .list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ),
                                                                                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                            "GET-HEAD" ) ) ) ), makeSymbol( "CYCL" ), makeSymbol( "COL" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "HEAD" ),
                                                                                                ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                                    makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list(
                                                                                                        makeSymbol( "CSETQ" ), makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow
                                                                                                            .list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                "CSETQ" ), makeSymbol( "COL" ), ConsesLow.list( makeSymbol( "MAIN-COLLECTION" ), makeSymbol( "CYCL" ),
                                                                                                                    makeKeyword( "NOUN" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "CONS" ),
                                                                                                                        makeKeyword( "POSS-COL" ), makeSymbol( "COL" ) ), makeSymbol( "DISJUNCTS" ) ) ), ConsesLow.list(
                                                                                                                            makeSymbol( "PUNLESS" ), makeSymbol( "DISJUNCTS" ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                                                                                ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "POSS-COL" ), constant_handles
                                                                                                                                    .reader_make_constant_shell( makeString( "Thing" ) ) ), makeSymbol(
                                                                                                                                        "DISJUNCTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                                                                                                                            makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ),
                                                                                                                                            makeSymbol( "DISJUNCTS" ) ) )
    } ) );
    $sym88$GET_QUANTIFIER = makeSymbol( "GET-QUANTIFIER" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-OVERT-QUANTIFIER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
            "FWHEN" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ),
                makeString( "the" ) ) ), makeSymbol( "QUANTIFIER" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                    "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "SINGULAR-P" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "GET-EXISTENTIAL-NULL-DETERMINER" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "PLURAL-P" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "GET-EXISTENTIAL-NULL-DETERMINER" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ) );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "WITHOUT-DUPLICATE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-QUANTIFIER" ) ) ) ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list(
            makeSymbol( "FIF" ), makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ), ConsesLow.list(
                makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-NUCLEUS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) ) );
    $sym91$GET_HEAD = makeSymbol( "GET-HEAD" );
    $kw92$SEMTRANS = makeKeyword( "SEMTRANS" );
    $list93 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "RENAMINGS-DISJ" ) );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLS" ), NIL ), makeSymbol( "INDEPENDENT-MODS" ), makeSymbol( "DEPENDENT-MODS" ), ConsesLow.list(
        makeSymbol( "COMP-MOD-CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-SETQ" ), ConsesLow.list( makeSymbol( "INDEPENDENT-MODS" ), makeSymbol( "DEPENDENT-MODS" ) ), ConsesLow.list( makeSymbol(
            "PARTITION-MODIFIERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIERS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                "WITHOUT-RECURSIVE-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "RENAMINGS-DISJ" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RENAMINGS-DISJ" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "REQUIRED-KEYWORDS" ), ConsesLow.list(
                        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                            "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol(
                                "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COMP-CYCL" ), makeSymbol(
                                        "COMP-MOD-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MODIFIER" ), makeSymbol( "INDEPENDENT-MODS" ) ), ConsesLow.list( makeSymbol(
                                            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MOD-CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MOD-CYCL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "MOD-CYCL" ),
                                                    makeSymbol( "COMP-MOD-CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RENAMINGS-CONJ" ), makeSymbol( "RENAMINGS-DISJ" ) ),
                                                        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLS-CONJ" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                                                            makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-RANKED-LEXES" ) ) ) ),
                                                            ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLS-DISJ" ), NIL ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list(
                                                                makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                                                                makeKeyword( "TERM" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RENAMING" ), makeSymbol( "RENAMINGS-CONJ" ) ), ConsesLow
                                                                    .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MY-CYCLS-WITH-MODS" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
                                                                        makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "APPLY-LEX-RENAMING" ), makeSymbol( "SELF" ), makeSymbol( "RLE" ), makeSymbol(
                                                                            "RENAMING" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MOD" ), makeSymbol( "DEPENDENT-MODS" ) ),
                                                                                ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOD" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                    makeSymbol( "CYCLIFY-NUCLEUS" ) ), ConsesLow.list( makeSymbol( "UPDATE-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                        makeSymbol( "MOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ) ), makeKeyword( "REPLACE" ),
                                                                                        makeSymbol( "TERM" ) ) ), makeSymbol( "MY-CYCLS-WITH-MODS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCLS-DISJ" ),
                                                                                            ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ), makeSymbol( "MY-CYCLS-WITH-MODS" ) ) ),
                                                                                                makeSymbol( "CYCLS-DISJ" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CYCLS-DISJ" ), ConsesLow.list(
                                                                                                    makeSymbol( "CSETQ" ), makeSymbol( "CYCLS-CONJ" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "CYCLS-DISJ" ),
                                                                                                        makeSymbol( "CYCLS-CONJ" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCLS" ), ConsesLow.list(
                                                                                                            makeSymbol( "APPEND" ), makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                                                                                                                makeSymbol( "QUOTE" ), makeSymbol( "INSTANTIATE-SCOPE" ) ), ConsesLow.list( makeSymbol( "CROSS-PRODUCTS" ),
                                                                                                                    ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "CYCLS-CONJ" ), makeSymbol(
                                                                                                                        "COMP-MOD-CYCLS" ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                                                                                            "CYCLS" ) ) ) );
    $sym95$DEFINITE_DESCRIPTION_P = makeSymbol( "DEFINITE-DESCRIPTION-P" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GET-DETERMINER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "DET" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "DET" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "the" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "NAME-WORD-P" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SINGULAR-P" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                            makeSymbol( "POS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                "PWHEN" ), makeSymbol( "POS" ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ) );
    $sym97$RELATIONAL_NOUN_P = makeSymbol( "RELATIONAL-NOUN-P" );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-RANKED-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "RENAME-VARIABLES" ), ConsesLow.list( makeSymbol( "FIM" ),
            ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ), ConsesLow.list( makeSymbol( "FRAME-RENAMING" ),
                ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ) ) ) ), ConsesLow
                    .list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "FORMULA-KEYWORDS" ), makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "KEYWORD" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "POSSESSOR" ), makeKeyword( "POSS-COL" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
                            makeSymbol( "KEYWORD" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ) ) ) );
    $sym99$NAME_WORD = makeSymbol( "NAME-WORD" );
    $list100 = ConsesLow.list( makeSymbol( "NOMINAL-WORD" ) );
    $list101 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "NOMINAL-WORD" ) ) );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-QUANTIFIER" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUANTIFIER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-OVERT-QUANTIFIER" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ),
            makeSymbol( "QUANTIFIER" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLURAL-P" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-EXISTENTIAL-NULL-DETERMINER" ) ) ), makeSymbol( "QUANTIFIER" ) ) ) ) );
    $sym104$VERBAL_WORD = makeSymbol( "VERBAL-WORD" );
    $list105 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARTITION-SEMANTIC-COMPLEMENTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PARTICLE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARTICLE-FILTER-LEXES" ), NIL, makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MATRIX-CLAUSE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "SUBJECT-CONTROLLER-P" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "OBJECT-CONTROLLER-P" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
                        .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CONTROL-VERB-P" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "GET-CONTROL-VERB" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTROLLER" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $list106 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ), makeKeyword(
        "OBJECT" ), makeKeyword( "OBLIQUE-OBJECT" ), makeKeyword( "CLAUSE" ), makeKeyword( "INF-COMP" ), makeKeyword( "NOUN" ) ) ) ) );
    $list107 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "DISJUNCTS" ), NIL ), ConsesLow.list(
        makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
            "DIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                "INDIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-INDIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                    "OBLIQUE-OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                        "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol(
                            "MODIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ) ),
      ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "MEMBER?" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
          "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "VBN" ), makeKeyword( "VBG" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow
              .list( makeSymbol( "CNOT" ), makeSymbol( "SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ),
                  makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword(
                      "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword(
                          "ACTION" ), makeSymbol( "SELF" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "SUBJECT" ), ConsesLow.list(
                              makeSymbol( "MEMBER" ), makeKeyword( "SUBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                  makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "SUBJECT" ), makeSymbol( "SUBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                      makeSymbol( "CAND" ), makeSymbol( "DIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                          EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "OBJECT" ), makeSymbol( "DIRECT-OBJECT" ) ),
                                              makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "INDIRECT-OBJECT" ), ConsesLow.list( makeSymbol(
                                                  "MEMBER" ), makeKeyword( "OBLIQUE-OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                                                      .list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "OBLIQUE-OBJECT" ), makeSymbol( "INDIRECT-OBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list(
                                                          makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "OBLIQUE-OBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword(
                                                              "OBLIQUE-OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                                                  makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "PREP-OBJECT" ), makeSymbol( "OBLIQUE-OBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow
                                                                      .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword(
                                                                          "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                                                              makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ), makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list(
                                                                                  makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ),
                                                                                      makeKeyword( "CLAUSE" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol(
                                                                                          "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CL-CYCLS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                                              "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                  "CDOLIST" ), ConsesLow.list( makeSymbol( "CL-CYCL" ), makeSymbol( "CL-CYCLS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                      makeSymbol( "CL-CYCL" ), ConsesLow.list( makeSymbol( "LIFT-CONJUNCTS" ), makeSymbol( "CL-CYCL" ) ) ), ConsesLow.list(
                                                                                                          makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "CLAUSE" ), makeSymbol( "CL-CYCL" ) ),
                                                                                                          makeSymbol( "DISJUNCTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                                                                                                              makeSymbol( "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "INF-COMP" ), makeSymbol(
                                                                                                                  "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                                                                      ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "INF-COMP" ), makeSymbol(
                                                                                                                          "CL-COMPLEMENT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                                                                                                                              .list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), makeSymbol(
                                                                                                                                  "DISJUNCTS" ) ) )
    } ) );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "NON-DISTRIBUTING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NON-DISTRIBUTING" ), ConsesLow.list(
                makeSymbol( "DELETE-CYCLIFIABLE" ), makeSymbol( "SUBJECT" ), makeSymbol( "NON-DISTRIBUTING" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), makeSymbol(
                    "NON-DISTRIBUTING" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SUBJECT" ) ) ) ) ) ) );
    $sym109$PARTICLE_FILTER_LEXES = makeSymbol( "PARTICLE-FILTER-LEXES" );
    $list110 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ), ConsesLow.list( makeSymbol( "SENTENCE-PARTICLE" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PARTICLE" ) ) ) ), ConsesLow.list( makeSymbol( "SENTENCE-PARTICLE-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
            "SENTENCE-PARTICLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SENTENCE-PARTICLE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), makeSymbol( "FRAME" ) ), ConsesLow.list(
                makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FRAME" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list(
                    makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                        makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "FRAME" ), constant_handles
                            .reader_make_constant_shell( makeString( "ParticleFrameType" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                makeSymbol( "SENTENCE-PARTICLE-HEAD" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REQUIRED-PARTICLE-STRING" ), ConsesLow.list( makeSymbol(
                                    "FIRST" ), ConsesLow.list( makeSymbol( "GET-STRINGS-OF-TYPE" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FRAME" ) ), constant_handles.reader_make_constant_shell(
                                        makeString( "VerbParticle" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, makeSymbol( "REQUIRED-PARTICLE-STRING" ), ConsesLow.list( makeSymbol(
                                            "FIM" ), makeSymbol( "SENTENCE-PARTICLE-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ),
                                                makeSymbol( "RLE" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                                                    makeSymbol( "SENTENCE-PARTICLE-HEAD" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "FILTERED" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                        "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "FILTERED" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym111$GET_MATRIX_CLAUSE = makeSymbol( "GET-MATRIX-CLAUSE" );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GET-ANCESTORS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CYCLIFIABLE-SENTENTIAL-PHRASE-P" ), makeSymbol( "ANCESTOR" ) ),
            ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), makeSymbol(
                "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANCESTOR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GET-ANCESTORS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "SENTENTIAL-TREE-P" ), makeSymbol( "ANCESTOR" ) ), ConsesLow.list(
            makeSymbol( "CNOT" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANCESTOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), makeSymbol( "SELF" ) ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANCESTOR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym114$SUBJECT_CONTROLLER_P = makeSymbol( "SUBJECT-CONTROLLER-P" );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "MEMBER" ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "IntransitiveSubjectControlFrame" ) ), constant_handles.reader_make_constant_shell( makeString( "TransitiveSubjectControlFrame" ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BOOLEAN" ), makeSymbol( "RESULT" ) ) ) ) ) ) );
    $sym116$OBJECT_CONTROLLER_P = makeSymbol( "OBJECT-CONTROLLER-P" );
    $list117 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "MEMBER" ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "FRAME" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "ObjectControlFrame" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                    .list( makeSymbol( "BOOLEAN" ), makeSymbol( "RESULT" ) ) ) ) ) ) );
    $sym118$CONTROL_VERB_P = makeSymbol( "CONTROL-VERB-P" );
    $list119 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "SUBJECT-CONTROLLER-P" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OBJECT-CONTROLLER-P" ) ) ) ) ) );
    $sym120$GET_CONTROL_VERB = makeSymbol( "GET-CONTROL-VERB" );
    $list121 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MATRIX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-MATRIX-CLAUSE" ) ) ) ), ConsesLow.list( makeSymbol( "MATRIX-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MATRIX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "MATRIX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MATRIX-HEAD" ), ConsesLow.list(
                makeSymbol( "FIM" ), makeSymbol( "MATRIX-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CONTROL-VERB-P" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MATRIX-HEAD" ) ) ) ) );
    $sym122$GET_CONTROLLER = makeSymbol( "GET-CONTROLLER" );
    $list123 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-CONTROL-VERB" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "CONTROL-VERB" ) ), ConsesLow.list( makeSymbol(
            "RET" ), NIL ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBJECT-CONTROLLER-P" ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OBJECT-CONTROLLER-P" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                        "FIM" ), makeSymbol( "CONTROL-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DIRECT-OBJECT" ) ) ) ) ) ) ) );
    $sym124$AUX_VERB_WORD = makeSymbol( "AUX-VERB-WORD" );
    $list125 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TENSE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-SEMANTIC-HEADS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list(
                makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COPULA-P" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym126$GET_TENSE = makeSymbol( "GET-TENSE" );
    $list127 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "GET-STRING" ), makeSymbol(
        "SELF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "is" ), makeString( "am" ), makeString( "are" ), makeString( "have" ), makeString( "has" ), makeString( "do" ), makeString(
            "does" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), makeKeyword( "PRESENT" ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "GET-STRING" ), makeSymbol(
                "SELF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "was" ), makeString( "were" ), makeString( "had" ), makeString( "did" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    EQUALP ) ), makeKeyword( "PAST" ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "GET-STRING" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        ConsesLow.list( makeString( "be" ), makeString( "do" ), makeString( "have" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), makeKeyword( "INFINITIVE" ) ) ) ) );
    $sym128$GET_SEMANTIC_HEADS = makeSymbol( "GET-SEMANTIC-HEADS" );
    $list129 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MAIN-VERB" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "MAIN-VERB" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "MAIN-VERB" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEADS" ) ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SELF" ) ) ) ) ) );
    $sym130$GET_COMPLEMENTS = makeSymbol( "GET-COMPLEMENTS" );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPLEMENTS" ), NIL ), ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "VERBAL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PREP-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "GET-PREPOSITIONAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "ADJ-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "GET-ADJECTIVAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "ADV-COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "GET-ADVERBIAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol(
                                "LIST" ), makeSymbol( "ADV-COMPLEMENT" ), makeSymbol( "ADJ-COMPLEMENT" ), makeSymbol( "PREP-COMPLEMENT" ), makeSymbol( "VERBAL-COMPLEMENT" ), makeSymbol( "OBJECT" ), makeSymbol(
                                    "SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COMPLEMENT" ), makeSymbol(
                                        "COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COMPLEMENTS" ) ) ) );
    $list132 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COPULA-P" ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
            ConsesLow.list( makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "COMPLEMENT" ) ) ) ) ) ) );
    $list133 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "SUBJECT" ), makeKeyword( "OBJECT" ), makeKeyword(
        "COMPLEMENT" ) ) ) ) );
    $list134 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "DISJUNCTS" ), NIL ), ConsesLow.list( makeSymbol(
        "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "DIRECT-OBJECT" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), ConsesLow.list(
                makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-COMPLEMENTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "SUBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "SUBJECT" ), makeSymbol( "SUBJECT" ) ), makeSymbol(
                            "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "DIRECT-OBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "OBJECT" ),
                                makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword(
                                    "OBJECT" ), makeSymbol( "DIRECT-OBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "COMPLEMENT" ),
                                        ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "SUBJECT" ) ), ConsesLow.list( makeSymbol( "CNOT" ),
                                            ConsesLow.list( EQ, makeSymbol( "COMPLEMENT" ), makeSymbol( "SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQ, makeSymbol( "COMPLEMENT" ), makeSymbol(
                                                "DIRECT-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "COMPLEMENT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ),
                                        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMP-CYCLS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "COMP-CYCLS" ), ConsesLow.list( makeSymbol( "CPUSH" ), NIL,
                                                makeSymbol( "COMP-CYCLS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMP-CYCL" ), makeSymbol( "COMP-CYCLS" ) ), ConsesLow.list(
                                                    makeSymbol( "CSETQ" ), makeSymbol( "COMP-CYCL" ), ConsesLow.list( makeSymbol( "LIFT-CONJUNCTS" ), makeSymbol( "COMP-CYCL" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                        ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "COMPLEMENT" ), makeSymbol( "COMP-CYCL" ) ), makeSymbol( "DISJUNCTS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                            "RET" ), ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), makeSymbol( "DISJUNCTS" ) ) ) ) );
    $sym135$COPULA_P = makeSymbol( "COPULA-P" );
    $list136 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-VERBAL-COMPLEMENT" ) ) ) ) ) );
    $sym137$ADJECTIVAL_WORD = makeSymbol( "ADJECTIVAL-WORD" );
    $list138 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COMPLEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $list139 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MODIFIEDS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ), ConsesLow.list( makeSymbol( "OBL-OBJ" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-OBLIQUE-OBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "MODIFIEDS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "OBL-OBJ" ),
                ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "OBL-OBJ" ) ) ) ) ) ) );
    $list140 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "ACTION" ), makeKeyword(
        "REPLACE" ), makeKeyword( "OBLIQUE-OBJECT" ) ) ) ) );
    $list141 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ), ConsesLow.list( makeSymbol( "OBL-OBJ" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "OBL-OBJ-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
                "OBL-OBJ" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBL-OBJ" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                    "MODIFIED" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow
                        .list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ), makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list(
                            makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol(
                                "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "ACTION" ), makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol(
                                    "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "REPLACE" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol(
                                        "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "CONS" ), makeKeyword( "REPLACE" ), NIL ) ), makeSymbol( "CONJUNCTS" ) ) ) ), ConsesLow.list(
                                            makeSymbol( "PWHEN" ), makeSymbol( "OBL-OBJ-HEAD" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "OBLIQUE-OBJECT" ),
                                                makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                    "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "PREP-OBJECT" ), makeSymbol( "OBL-OBJ-HEAD" ) ), makeSymbol( "CONJUNCTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                        ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), NIL ) ) ) );
    $sym142$ADVERBIAL_WORD = makeSymbol( "ADVERBIAL-WORD" );
    $list143 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword(
        "PROTECTED" ) ) );
    $list144 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ), makeKeyword(
        "OBJECT" ) ) ) ) );
    $list145 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "FIRST" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ), ConsesLow.list( makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol(
            "FWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-WORD-P" ), makeSymbol( "MODIFIED" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-SUBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "VERBAL-WORD-P" ), makeSymbol( "MODIFIED" ) ), ConsesLow.list(
                    makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                        "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "ACTION" ), makeSymbol( "MODIFIED" ) ), makeSymbol(
                                "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "SUBJECT" ),
                                    makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ),
                                        makeKeyword( "SUBJECT" ), makeSymbol( "SUBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                                            "OBJECT" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list(
                                                makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "OBJECT" ), makeSymbol( "OBJECT" ) ), makeSymbol( "CONJUNCTS" ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), NIL ) ) ) );
    $sym146$PREPOSITIONAL_OR_PARTICLE_WORD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD" );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-KEYWORD-RENAMINGS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORDS" ) ), makeKeyword( "PROTECTED" ) ) );
    $list148 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "ACTION" ), makeKeyword(
        "OBJECT" ), makeKeyword( "CLAUSE" ) ) ) ) );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-STRING" ) ) ), makeString( "that" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "MODIFIED" ), ConsesLow.list(
            makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ), ConsesLow.list( makeSymbol( "COMPLEMENT" ),
                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CLAUSE" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                        "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list(
                            makeSymbol( "NOMINAL-WORD-P" ), makeSymbol( "MODIFIED" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ),
                                makeSymbol( "MODIFIED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "MODIFIED" ), ConsesLow.list(
                                    makeSymbol( "MEMBER" ), makeKeyword( "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "VERBAL-WORD-P" ), makeSymbol(
                                        "MODIFIED" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "ACTION" ), makeSymbol( "MODIFIED" ) ),
                                            makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "MEMBER" ),
                                                makeKeyword( "OBJECT" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                    "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "OBJECT" ), makeSymbol( "COMPLEMENT" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                                                        .list( makeSymbol( "CAND" ), makeSymbol( "CLAUSE" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "CLAUSE" ), makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                                            makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "CLAUSE" ),
                                                                makeSymbol( "CLAUSE" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ),
                                                                    makeSymbol( "CONJUNCTS" ), NIL ) ) ) ) );
    $sym150$QUANTIFIER_WORD = makeSymbol( "QUANTIFIER-WORD" );
    $list151 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "RESTR" ), makeKeyword(
        "SCOPE" ) ) ) ) );
    $list152 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "DISJUNCTS" ), NIL ) ), ConsesLow.list( makeSymbol(
        "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeKeyword( "NOUN" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
            makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "NOUN" ), makeSymbol( "SELF" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), makeSymbol( "DISJUNCTS" ) ) ) ) );
    $sym153$PUNCTUATION_WORD = makeSymbol( "PUNCTUATION-WORD" );
    $sym154$POSSESSIVE_WORD = makeSymbol( "POSSESSIVE-WORD" );
    $list155 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "POSSESSOR" ), makeKeyword( "POSSESSED" ) ) ) ) );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CONJUNCTS" ), NIL ), ConsesLow.list( makeSymbol( "POSSESSOR" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSOR" ) ) ) ), ConsesLow.list( makeSymbol( "POSSESSED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-POSSESSED" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "POSSESSOR" ), ConsesLow.list( makeSymbol(
                "MEMBER" ), makeKeyword( "POSSESSOR" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                    "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "POSSESSOR" ), makeSymbol( "POSSESSOR" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                        makeSymbol( "POSSESSED" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "POSSESSED" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list(
                            makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "COORDINATE-KEYWORD-RENAMING" ), makeKeyword( "POSSESSED" ), makeSymbol( "POSSESSED" ) ), makeSymbol( "CONJUNCTS" ) ) ), ConsesLow.list(
                                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DISJUNCTIVE-KEYWORD-RENAMINGS" ), makeSymbol( "CONJUNCTS" ), NIL ) ) ) );
    $sym157$GET_STRING = makeSymbol( "GET-STRING" );
    $sym158$BASE_P = makeSymbol( "BASE-P" );
    $kw159$VB = makeKeyword( "VB" );
    $list160 = ConsesLow.list( makeString( "have" ), makeString( "do" ) );
    $kw161$VBP = makeKeyword( "VBP" );
    $list162 = ConsesLow.list( makeString( "has" ), makeString( "does" ) );
    $kw163$VBZ = makeKeyword( "VBZ" );
    $list164 = ConsesLow.list( makeString( "had" ), makeString( "did" ) );
    $sym165$GET_MOTHER = makeSymbol( "GET-MOTHER" );
    $sym166$GET_SISTER = makeSymbol( "GET-SISTER" );
    $kw167$VBN = makeKeyword( "VBN" );
    $kw168$VBD = makeKeyword( "VBD" );
    $sym169$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $kw170$AUXG = makeKeyword( "AUXG" );
    $kw171$VBG = makeKeyword( "VBG" );
    $list172 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "LEVEL" ), ONE_INTEGER ) );
    $sym173$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym174$PWHEN = makeSymbol( "PWHEN" );
    $sym175$__ = makeSymbol( ">=" );
    $list176 = ConsesLow.list( ZERO_INTEGER );
    $list177 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "CYCLIFIABLE-VERB-PHRASE" ), makeSymbol( "CYCLIFY-INT" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ),
        makeSymbol( "CYCLIFIABLE-VERB-PHRASE" ), makeSymbol( "CYCLIFY-INT-VP" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "CYCLIFIABLE-VERB-PHRASE" ), makeSymbol(
            "CYCLIFY-INT-VP-COORDINATION" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "CYCLIFIABLE-WORD" ), makeSymbol( "CYCLIFY-NUCLEUS" ) ), ConsesLow.list( makeSymbol(
                "TRACE-INTERFACE-METHOD" ), makeSymbol( "NOMINAL-WORD" ), makeSymbol( "CYCLIFY-NUCLEUS" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "CYCLIFIABLE-WORD" ), makeSymbol(
                    "CYCLIFY-INT" ) ) );
    $list178 = ConsesLow.list( ONE_INTEGER );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "NOMINAL-WORD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ),
        makeSymbol( "VERBAL-WORD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "AUX-VERB-WORD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow
            .list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "ADJECTIVAL-WORD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "ADVERBIAL-WORD" ),
                makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list(
                    makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol( "QUANTIFIER-WORD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ), ConsesLow.list( makeSymbol( "TRACE-INTERFACE-METHOD" ), makeSymbol(
                        "POSSESSIVE-WORD" ), makeSymbol( "GET-KEYWORD-RENAMINGS" ) ) );
  }
}
/*
 * 
 * Total time: 957 ms
 * 
 */