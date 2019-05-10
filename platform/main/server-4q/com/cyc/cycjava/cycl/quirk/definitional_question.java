package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.cyclifier_lexicon;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.linkage;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class definitional_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.definitional_question";
  public static final String myFingerPrint = "1146b563676e0e2a772ad3674edf63ad2f8eef0db2581f063486cdcda0960639";
  private static final SubLSymbol $sym0$DEFINITIONAL_QUESTION;
  private static final SubLSymbol $sym1$WH_QUESTION;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$LEADING_APPOSITIVE_BLACKLIST;
  private static final SubLSymbol $sym4$THING_TEMPLATE_PARAMETERS;
  private static final SubLSymbol $sym5$ORGANIZATION_TEMPLATE_PARAMETERS;
  private static final SubLSymbol $sym6$PERSON_TEMPLATE_PARAMETERS;
  private static final SubLSymbol $sym7$GENERAL_TEMPLATE_PARAMETERS;
  private static final SubLSymbol $sym8$GLIMPSE_THING_TEMPLATES;
  private static final SubLSymbol $sym9$GLIMPSE_GENERAL_TEMPLATES;
  private static final SubLSymbol $sym10$OBJECT;
  private static final SubLSymbol $sym11$INSTANCE_COUNT;
  private static final SubLSymbol $sym12$QUESTION;
  private static final SubLSymbol $sym13$LEXICON;
  private static final SubLSymbol $sym14$PARSER;
  private static final SubLSymbol $sym15$TAGGER;
  private static final SubLSymbol $sym16$CHUNKER;
  private static final SubLSymbol $sym17$MAX_CANDIDATES;
  private static final SubLSymbol $sym18$MAX_CONFIDENCE;
  private static final SubLSymbol $sym19$LEARNABLE_TYPES;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_CLASS;
  private static final SubLSymbol $sym28$ISOLATED_P;
  private static final SubLSymbol $sym29$INSTANCE_NUMBER;
  private static final SubLSymbol $sym30$INFORMATION_REQUEST;
  private static final SubLSymbol $sym31$ERROR_HANDLING;
  private static final SubLSymbol $sym32$TIMEOUT;
  private static final SubLSymbol $sym33$STRING;
  private static final SubLSymbol $sym34$PARSE;
  private static final SubLSymbol $sym35$ANSWER_TYPES;
  private static final SubLSymbol $sym36$CORPORA;
  private static final SubLSymbol $sym37$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_INSTANCE;
  private static final SubLSymbol $sym38$ISA_;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$GET_DAUGHTER;
  private static final SubLSymbol $sym43$GET_SUBJECT;
  private static final SubLSymbol $sym44$GET_SEMANTIC_HEAD;
  private static final SubLSymbol $sym45$YIELD;
  private static final SubLSymbol $sym46$GET_STRING;
  private static final SubLList $list47;
  private static final SubLString $str48$the_name;
  private static final SubLString $str49$what;
  private static final SubLString $str50$who;
  private static final SubLSymbol $sym51$GET_HEAD;
  private static final SubLSymbol $sym52$GET_CATEGORY;
  private static final SubLSymbol $kw53$NNP;
  private static final SubLSymbol $sym54$GET_OBJECTS;
  private static final SubLSymbol $sym55$DEFINITIONAL_QUESTION_ISA__METHOD;
  private static final SubLSymbol $sym56$QUERIFY;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
  private static final SubLSymbol $sym59$GET_WH_PHRASE;
  private static final SubLSymbol $sym60$TEMPLATE_PARAM_TABLE;
  private static final SubLSymbol $sym61$DEFINITIONAL_QUESTION_QUERIFY_METHOD;
  private static final SubLSymbol $sym62$ANSWER_WORDNET;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$DEFINITIONAL_QUESTION_ANSWER_WORDNET_METHOD;
  private static final SubLSymbol $kw65$ROOT;
  private static final SubLSymbol $sym66$APPEND;
  private static final SubLSymbol $sym67$GET_ROOTS;
  private static final SubLSymbol $sym68$EXTRACT;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
  private static final SubLSymbol $sym72$ABSTRACT_PASSAGE_P;
  private static final SubLSymbol $sym73$GET_FOCUS;
  private static final SubLSymbol $sym74$GET_FOCUS_VARIANTS;
  private static final SubLSymbol $sym75$GET_CONTENT;
  private static final SubLSymbol $sym76$EXTRACT_VIA_DEEP_PARSE;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK;
  private static final SubLSymbol $sym79$DEFINITIONAL_QUESTION_EXTRACT_METHOD;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
  private static final SubLList $list83;
  private static final SubLSymbol $kw84$DFR2L;
  private static final SubLSymbol $kw85$DFL2R;
  private static final SubLString $str86$_S_is_not_one_of__S;
  private static final SubLSymbol $sym87$DEFINITIONAL_QUESTION_EXTRACT_VIA_DEEP_PARSE_METHOD;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
  private static final SubLSymbol $sym91$DAUGHTER_COUNT;
  private static final SubLSymbol $sym92$GET_PARSE_TREE_STRING;
  private static final SubLSymbol $sym93$DEFINITIONAL_QUESTION_GET_FOCUS_METHOD;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
  private static final SubLSymbol $kw96$NN;
  private static final SubLSymbol $kw97$NNS;
  private static final SubLSymbol $sym98$DEFINITIONAL_QUESTION_GET_FOCUS_VARIANTS_METHOD;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$DEFINITIONAL_QUESTION_ANSWER_TYPES_METHOD;
  private static final SubLSymbol $sym101$ANSWER_CARDINALITY;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$DEFINITIONAL_QUESTION_ANSWER_CARDINALITY_METHOD;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
  private static final SubLString $str107$_FOCUS_;
  private static final SubLSymbol $sym108$DEFINITIONAL_QUESTION_TEMPLATE_PARAM_TABLE_METHOD;
  private static final SubLSymbol $sym109$NRESTR_APPOSITIVE_DESCRIPTION;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLList $list112;
  private static final SubLSymbol $kw113$NP;
  private static final SubLList $list114;
  private static final SubLSymbol $kw115$PRN;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$DEFINITIONAL_QUESTION_NRESTR_APPOSITIVE_DESCRIPTION_METHOD;
  private static final SubLSymbol $sym118$EQUALITY_DESCRIPTION;
  private static final SubLList $list119;
  private static final SubLSymbol $kw120$S;
  private static final SubLSymbol $kw121$VP;
  private static final SubLSymbol $sym122$GET_DESCENDANT;
  private static final SubLList $list123;
  private static final SubLSymbol $kw124$AUX;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$DEFINITIONAL_QUESTION_EQUALITY_DESCRIPTION_METHOD;
  private static final SubLSymbol $sym127$CALLED_X_DESCRIPTION;
  private static final SubLList $list128;
  private static final SubLString $str129$called;
  private static final SubLSymbol $sym130$DEFINITIONAL_QUESTION_CALLED_X_DESCRIPTION_METHOD;
  private static final SubLSymbol $sym131$RESTR_RELATIVE_CLAUSE_DESCRIPTION;
  private static final SubLList $list132;
  private static final SubLList $list133;
  private static final SubLSymbol $kw134$_;
  private static final SubLSymbol $kw135$SBAR;
  private static final SubLList $list136;
  private static final SubLSymbol $kw137$WHNP;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$DEFINITIONAL_QUESTION_RESTR_RELATIVE_CLAUSE_DESCRIPTION_METHOD;
  private static final SubLSymbol $sym140$RESTR_APPOSITIVE_DESCRIPTION;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
  private static final SubLList $list143;
  private static final SubLSymbol $kw144$DT;
  private static final SubLSymbol $sym145$DEFINITIONAL_QUESTION_RESTR_APPOSITIVE_DESCRIPTION_METHOD;
  private static final SubLSymbol $sym146$LINK_WORD_P;
  private static final SubLSymbol $sym147$GET_DIRECTLY_RELATED;
  private static final SubLSymbol $kw148$G_PATTERN;
  private static final SubLSymbol $kw149$LEFT;
  private static final SubLSymbol $kw150$X_I_PATTERN;
  private static final SubLSymbol $kw151$RIGHT;
  private static final SubLSymbol $sym152$STRINGP;
  private static final SubLSymbol $kw153$X_D_PATTERN;
  private static final SubLSymbol $kw154$X_C_PATTERN;
  private static final SubLSymbol $kw155$MX_PATTERN;
  private static final SubLSymbol $sym156$GET_MODIFIERS;
  private static final SubLSymbol $sym157$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw158$LEXICON;
  private static final SubLString $str159$Error_caught_in_GET_PRE_NOMINAL_D;
  private static final SubLSymbol $kw160$GN_PATTERN;
  private static final SubLSymbol $kw161$AN_PATTERN;
  private static final SubLSymbol $sym162$LINK_WORD_AFTER;
  private static final SubLList $list163;
  private static final SubLSymbol $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD;
  private static final SubLSymbol $sym165$DEFINITIONAL_QUESTION_GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK_METHOD;
  private static final SubLInteger $int166$32;
  private static final SubLString $str167$_cyc_projects_aquaint_lemur_indic;
  private static final SubLString $str168$___S__;
  private static final SubLList $list169;
  private static final SubLSymbol $sym170$_;
  private static final SubLSymbol $sym171$SECOND;
  private static final SubLString $str172$_a_is__a_;
  private static final SubLSymbol $sym173$PERSON;
  private static final SubLString $str174$Who;
  private static final SubLString $str175$What;
  private static final SubLString $str176$CNSjan2004;
  private static final SubLString $str177$_________________________________;
  private static final SubLSymbol $sym178$ANSWER;
  private static final SubLString $str179$Who_is_;
  private static final SubLString $str180$_;
  private static final SubLSymbol $sym181$GET_PRE_NOMINAL_DESCRIPTION;
  private static final SubLSymbol $kw182$TEST;
  private static final SubLSymbol $sym183$PRE_NOMINAL_TEST_FUNC;
  private static final SubLSymbol $kw184$OWNER;
  private static final SubLSymbol $kw185$CLASSES;
  private static final SubLSymbol $kw186$KB;
  private static final SubLSymbol $kw187$FULL;
  private static final SubLSymbol $kw188$WORKING_;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$DEFINITIONAL_QUESTION_TEST_HELPER;
  private static final SubLSymbol $sym191$THIS_EQUAL;
  private static final SubLList $list192;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject get_definitional_question_leading_appositive_blacklist(final SubLObject v_definitional_question)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym3$LEADING_APPOSITIVE_BLACKLIST, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FOURTEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject set_definitional_question_leading_appositive_blacklist(final SubLObject v_definitional_question, final SubLObject value)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym3$LEADING_APPOSITIVE_BLACKLIST, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FOURTEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject get_definitional_question_thing_template_parameters(final SubLObject v_definitional_question)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym4$THING_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), THIRTEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject set_definitional_question_thing_template_parameters(final SubLObject v_definitional_question, final SubLObject value)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym4$THING_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), THIRTEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject get_definitional_question_organization_template_parameters(final SubLObject v_definitional_question)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym5$ORGANIZATION_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWELVE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject set_definitional_question_organization_template_parameters(final SubLObject v_definitional_question, final SubLObject value)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym5$ORGANIZATION_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWELVE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject get_definitional_question_person_template_parameters(final SubLObject v_definitional_question)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym6$PERSON_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ELEVEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject set_definitional_question_person_template_parameters(final SubLObject v_definitional_question, final SubLObject value)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym6$PERSON_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ELEVEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject get_definitional_question_general_template_parameters(final SubLObject v_definitional_question)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym7$GENERAL_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject set_definitional_question_general_template_parameters(final SubLObject v_definitional_question, final SubLObject value)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym7$GENERAL_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject get_definitional_question_glimpse_thing_templates(final SubLObject v_definitional_question)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym8$GLIMPSE_THING_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), NINE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject set_definitional_question_glimpse_thing_templates(final SubLObject v_definitional_question, final SubLObject value)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym8$GLIMPSE_THING_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), NINE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject get_definitional_question_glimpse_general_templates(final SubLObject v_definitional_question)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym9$GLIMPSE_GENERAL_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), EIGHT_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject set_definitional_question_glimpse_general_templates(final SubLObject v_definitional_question, final SubLObject value)
  {
    final SubLObject v_class = v_definitional_question.isSymbol() ? classes.classes_retrieve_class( v_definitional_question )
        : ( ( NIL != subloop_structures.class_p( v_definitional_question ) ) ? v_definitional_question
            : ( ( NIL != subloop_structures.instance_p( v_definitional_question ) ) ? subloop_structures.instance_class( v_definitional_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym9$GLIMPSE_GENERAL_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), EIGHT_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject subloop_reserved_initialize_definitional_question_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym10$OBJECT, $sym11$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym13$LEXICON, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym14$PARSER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym15$TAGGER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym16$CHUNKER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym17$MAX_CANDIDATES, TWENTY_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym18$MAX_CONFIDENCE, TEN_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym19$LEARNABLE_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$DEFINITIONAL_QUESTION, $sym9$GLIMPSE_GENERAL_TEMPLATES, $list20 );
    classes.subloop_initialize_slot( new_instance, $sym0$DEFINITIONAL_QUESTION, $sym8$GLIMPSE_THING_TEMPLATES, $list21 );
    classes.subloop_initialize_slot( new_instance, $sym0$DEFINITIONAL_QUESTION, $sym7$GENERAL_TEMPLATE_PARAMETERS, $list22 );
    classes.subloop_initialize_slot( new_instance, $sym0$DEFINITIONAL_QUESTION, $sym6$PERSON_TEMPLATE_PARAMETERS, $list23 );
    classes.subloop_initialize_slot( new_instance, $sym0$DEFINITIONAL_QUESTION, $sym5$ORGANIZATION_TEMPLATE_PARAMETERS, $list24 );
    classes.subloop_initialize_slot( new_instance, $sym0$DEFINITIONAL_QUESTION, $sym4$THING_TEMPLATE_PARAMETERS, $list25 );
    classes.subloop_initialize_slot( new_instance, $sym0$DEFINITIONAL_QUESTION, $sym3$LEADING_APPOSITIVE_BLACKLIST, $list26 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject subloop_reserved_initialize_definitional_question_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym10$OBJECT, $sym28$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$OBJECT, $sym29$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym30$INFORMATION_REQUEST, $sym31$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym30$INFORMATION_REQUEST, $sym32$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym33$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym34$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym35$ANSWER_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$QUESTION, $sym36$CORPORA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 974L)
  public static SubLObject definitional_question_p(final SubLObject v_definitional_question)
  {
    return classes.subloop_instanceof_class( v_definitional_question, $sym0$DEFINITIONAL_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 3172L)
  public static SubLObject definitional_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.wh_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ) ) && NIL != methods.funcall_instance_method_with_0_args( tree,
        $sym43$GET_SUBJECT ) && NIL != word_tree.aux_verb_tree_p( methods.funcall_instance_method_with_0_args( tree, $sym44$GET_SEMANTIC_HEAD ) ) && NIL != conses_high.member( methods.funcall_instance_method_with_0_args(
            methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ONE_INTEGER ), $sym45$YIELD ).first(), $sym46$GET_STRING ), $list47, EQUAL, UNPROVIDED )
        && NIL == string_utilities.starts_with_by_test( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( tree, $sym43$GET_SUBJECT ), $sym46$GET_STRING ), $str48$the_name, EQUALP )
        && ( ( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ), $sym42$GET_DAUGHTER,
            ZERO_INTEGER ), $sym46$GET_STRING ).equalp( $str49$what ) && NIL == parse_tree.nominal_tree_p( methods.funcall_instance_method_with_1_args( methods.funcall_instance_method_with_1_args( tree,
                $sym42$GET_DAUGHTER, ZERO_INTEGER ), $sym42$GET_DAUGHTER, ONE_INTEGER ) ) ) || ( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER,
                    ZERO_INTEGER ), $sym46$GET_STRING ).equalp( $str50$who ) && NIL == word_tree.determiner_word_tree_p( methods.funcall_instance_method_with_1_args( methods.funcall_instance_method_with_0_args( tree,
                        $sym43$GET_SUBJECT ), $sym42$GET_DAUGHTER, ZERO_INTEGER ) ) && ( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods
                            .funcall_instance_method_with_0_args( tree, $sym43$GET_SUBJECT ), $sym51$GET_HEAD ), $sym52$GET_CATEGORY ) == $kw53$NNP || methods.funcall_instance_method_with_0_args( methods
                                .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( tree, $sym54$GET_OBJECTS ).first(), $sym51$GET_HEAD ), $sym52$GET_CATEGORY ) == $kw53$NNP ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 4450L)
  public static SubLObject definitional_question_querify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_definitional_question_method = NIL;
    final SubLObject glimpse_thing_templates = get_definitional_question_glimpse_thing_templates( self );
    final SubLObject glimpse_general_templates = get_definitional_question_glimpse_general_templates( self );
    final SubLObject corpora = question.get_question_corpora( self );
    try
    {
      thread.throwStack.push( $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
      try
      {
        final SubLObject wh_word = methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( methods.funcall_instance_method_with_0_args( self, $sym59$GET_WH_PHRASE ), $sym42$GET_DAUGHTER,
            ZERO_INTEGER ), $sym46$GET_STRING );
        final SubLObject templates = wh_word.equalp( $str49$what ) ? ConsesLow.append( glimpse_general_templates, glimpse_thing_templates ) : glimpse_general_templates;
        final SubLObject param_table = methods.funcall_instance_method_with_1_args( self, $sym60$TEMPLATE_PARAM_TABLE, wh_word );
        SubLObject queries = NIL;
        SubLObject cdolist_list_var = instantiate_templates( templates, param_table );
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$1 = corpora;
          SubLObject corpus = NIL;
          corpus = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            queries = ConsesLow.cons( search_engine.new_glimpse_query( template, corpus ), queries );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            corpus = cdolist_list_var_$1.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          template = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, Sequences.nreverse( queries ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_definitional_question_glimpse_thing_templates( self, glimpse_thing_templates );
          set_definitional_question_glimpse_general_templates( self, glimpse_general_templates );
          question.set_question_corpora( self, corpora );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_definitional_question_method = Errors.handleThrowable( ccatch_env_var, $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_definitional_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 5102L)
  public static SubLObject definitional_question_answer_wordnet_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 5190L)
  public static SubLObject get_roots(final SubLObject parse)
  {
    SubLObject lemmatized = NIL;
    if( parse.first() == $kw65$ROOT )
    {
      lemmatized = ConsesLow.cons( ConsesLow.cons( conses_high.second( parse ), conses_high.third( parse ) ), lemmatized );
    }
    else if( conses_high.second( parse ).isList() )
    {
      lemmatized = Functions.apply( $sym66$APPEND, Mapping.mapcar( $sym67$GET_ROOTS, parse.rest() ) );
    }
    SubLObject cdolist_list_var = lemmatized;
    SubLObject mapping = NIL;
    mapping = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Strings.stringE( mapping.first(), mapping.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ConsesLow.rplacd( mapping, morphology.plural_noun_to_sg( mapping.rest(), UNPROVIDED ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mapping = cdolist_list_var.first();
    }
    return lemmatized;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 6844L)
  public static SubLObject definitional_question_extract_method(final SubLObject self, final SubLObject passage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_definitional_question_method = NIL;
    final SubLObject v_parser = question.get_question_parser( self );
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
      try
      {
        assert NIL != search_engine.abstract_passage_p( passage ) : passage;
        final SubLObject terms = ConsesLow.cons( methods.funcall_instance_method_with_0_args( self, $sym73$GET_FOCUS ), methods.funcall_instance_method_with_0_args( self, $sym74$GET_FOCUS_VARIANTS ) );
        final SubLObject passage_string = methods.funcall_instance_method_with_0_args( passage, $sym75$GET_CONTENT );
        final SubLObject shallow_parses = NIL;
        final SubLObject deep_parse = methods.funcall_instance_method_with_1_args( v_parser, $sym34$PARSE, passage_string );
        final SubLObject answers0 = NIL;
        SubLObject answers2 = NIL;
        if( NIL == answers2 )
        {
          SubLObject csome_list_var;
          SubLObject string_cmp;
          for( csome_list_var = $list77, string_cmp = NIL, string_cmp = csome_list_var.first(); NIL == answers2 && NIL != csome_list_var; answers2 = methods.funcall_instance_method_with_3_args( self,
              $sym76$EXTRACT_VIA_DEEP_PARSE, deep_parse, passage, string_cmp ), csome_list_var = csome_list_var.rest(), string_cmp = csome_list_var.first() )
          {
          }
        }
        answers2 = ConsesLow.append( answers0, answers2 );
        answers2 = conses_high.union( answers2, methods.funcall_instance_method_with_1_args( self, $sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, passage ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
        Dynamic.sublisp_throw( $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, answers2 );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_parser( self, v_parser );
          question.set_question_parse( self, parse );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_definitional_question_method = Errors.handleThrowable( ccatch_env_var, $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_definitional_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 8174L)
  public static SubLObject definitional_question_extract_via_deep_parse_method(final SubLObject self, final SubLObject passage_parse, final SubLObject passage, final SubLObject string_cmp)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_definitional_question_method = NIL;
    final SubLObject max_confidence = question.get_question_max_confidence( self );
    try
    {
      thread.throwStack.push( $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
      try
      {
        final SubLObject terms = ConsesLow.cons( methods.funcall_instance_method_with_0_args( self, $sym73$GET_FOCUS ), methods.funcall_instance_method_with_0_args( self, $sym74$GET_FOCUS_VARIANTS ) );
        final SubLObject extractors = $list83;
        SubLObject foundP = NIL;
        SubLObject answers = NIL;
        if( NIL != parse_tree.parse_tree_p( passage_parse ) )
        {
          final SubLObject stack = stacks.create_stack();
          final SubLObject order_var = $kw84$DFR2L;
          final SubLObject possible_orders = ConsesLow.list( $kw85$DFL2R, $kw84$DFR2L );
          SubLObject subtree = NIL;
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
          {
            Errors.error( $str86$_S_is_not_one_of__S, order_var, possible_orders );
          }
          stacks.stack_push( passage_parse, stack );
          while ( NIL == stacks.stack_empty_p( stack ) && NIL == answers)
          {
            subtree = stacks.stack_pop( stack );
            if( NIL != parse_tree.phrase_tree_p( subtree ) )
            {
              foundP = NIL;
              if( NIL == foundP )
              {
                SubLObject csome_list_var = extractors;
                SubLObject extractor = NIL;
                extractor = csome_list_var.first();
                while ( NIL == foundP && NIL != csome_list_var)
                {
                  if( NIL == foundP )
                  {
                    SubLObject csome_list_var_$2 = terms;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var_$2.first();
                    while ( NIL == foundP && NIL != csome_list_var_$2)
                    {
                      if( NIL != v_term )
                      {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_3_args( self, extractor, v_term, subtree, string_cmp );
                        SubLObject description = NIL;
                        description = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          answers = ConsesLow.cons( answer.new_text_answer( self, methods.funcall_instance_method_with_0_args( description, $sym46$GET_STRING ), passage, max_confidence, description ), answers );
                          foundP = T;
                          cdolist_list_var = cdolist_list_var.rest();
                          description = cdolist_list_var.first();
                        }
                      }
                      csome_list_var_$2 = csome_list_var_$2.rest();
                      v_term = csome_list_var_$2.first();
                    }
                  }
                  csome_list_var = csome_list_var.rest();
                  extractor = csome_list_var.first();
                }
              }
            }
            if( NIL != parse_tree.phrase_tree_p( subtree ) )
            {
              final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( subtree );
              final SubLObject backwardP_var = Equality.eq( order_var, $kw85$DFL2R );
              SubLObject length;
              SubLObject v_iteration;
              SubLObject element_num;
              SubLObject daughter;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                daughter = Vectors.aref( vector_var, element_num );
                stacks.stack_push( daughter, stack );
              }
            }
          }
        }
        Dynamic.sublisp_throw( $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, answers );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_max_confidence( self, max_confidence );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_definitional_question_method = Errors.handleThrowable( ccatch_env_var, $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_definitional_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 9106L)
  public static SubLObject definitional_question_get_focus_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_definitional_question_method = NIL;
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
      try
      {
        SubLObject focus_tree = ( NIL != parse_tree.frag_tree_p( parse ) ) ? NIL : methods.funcall_instance_method_with_0_args( parse, $sym43$GET_SUBJECT );
        if( NIL != parse_tree.whnp_tree_p( focus_tree ) && methods.funcall_instance_method_with_0_args( focus_tree, $sym91$DAUGHTER_COUNT ).numE( ONE_INTEGER ) && NIL != methods.funcall_instance_method_with_0_args(
            parse, $sym54$GET_OBJECTS ) )
        {
          focus_tree = methods.funcall_instance_method_with_0_args( parse, $sym54$GET_OBJECTS ).first();
        }
        if( NIL != focus_tree )
        {
          if( NIL != word_tree.determiner_word_tree_p( methods.funcall_instance_method_with_1_args( focus_tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ) ) )
          {
            Dynamic.sublisp_throw( $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, string_utilities.bunge( Mapping.mapcar( $sym92$GET_PARSE_TREE_STRING, methods.funcall_instance_method_with_0_args( focus_tree,
                $sym45$YIELD ).rest() ), UNPROVIDED ) );
          }
          else
          {
            Dynamic.sublisp_throw( $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, methods.funcall_instance_method_with_0_args( focus_tree, $sym46$GET_STRING ) );
          }
        }
        else
        {
          Dynamic.sublisp_throw( $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, NIL );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_parse( self, parse );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_definitional_question_method = Errors.handleThrowable( ccatch_env_var, $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_definitional_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 9828L)
  public static SubLObject definitional_question_get_focus_variants_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_definitional_question_method = NIL;
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
      try
      {
        final SubLObject focus_tree = ( NIL != parse_tree.frag_tree_p( parse ) ) ? NIL : methods.funcall_instance_method_with_0_args( parse, $sym43$GET_SUBJECT );
        final SubLObject focus_head = ( NIL != focus_tree ) ? methods.funcall_instance_method_with_0_args( focus_tree, $sym51$GET_HEAD ) : NIL;
        final SubLObject focus_pos = ( NIL != focus_head ) ? methods.funcall_instance_method_with_0_args( focus_head, $sym52$GET_CATEGORY ) : NIL;
        SubLObject variants = NIL;
        final SubLObject pcase_var = focus_pos;
        if( pcase_var.eql( $kw96$NN ) )
        {
          variants = ConsesLow.cons( morphology.pluralize_string( definitional_question_get_focus_method( self ), UNPROVIDED ), variants );
        }
        else if( pcase_var.eql( $kw97$NNS ) )
        {
          variants = ConsesLow.cons( morphology.plural_noun_to_sg( definitional_question_get_focus_method( self ), UNPROVIDED ), variants );
        }
        Dynamic.sublisp_throw( $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, variants );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_parse( self, parse );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_definitional_question_method = Errors.handleThrowable( ccatch_env_var, $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_definitional_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 10384L)
  public static SubLObject definitional_question_answer_types_method(final SubLObject self)
  {
    return ConsesLow.list( NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 10627L)
  public static SubLObject definitional_question_answer_cardinality_method(final SubLObject self)
  {
    return TEN_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 10799L)
  public static SubLObject definitional_question_template_param_table_method(final SubLObject self, final SubLObject wh_word)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_definitional_question_method = NIL;
    final SubLObject thing_template_parameters = get_definitional_question_thing_template_parameters( self );
    final SubLObject person_template_parameters = get_definitional_question_person_template_parameters( self );
    final SubLObject general_template_parameters = get_definitional_question_general_template_parameters( self );
    try
    {
      thread.throwStack.push( $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
      try
      {
        SubLObject res = NIL;
        if( wh_word.equalp( $str50$who ) )
        {
          res = ConsesLow.append( general_template_parameters, person_template_parameters );
        }
        else if( wh_word.equalp( $str49$what ) )
        {
          res = ConsesLow.append( general_template_parameters, thing_template_parameters );
        }
        Dynamic.sublisp_throw( $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, conses_high.acons( $str107$_FOCUS_, ConsesLow.cons( methods.funcall_instance_method_with_0_args( self, $sym73$GET_FOCUS ), methods
            .funcall_instance_method_with_0_args( self, $sym74$GET_FOCUS_VARIANTS ) ), res ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_definitional_question_thing_template_parameters( self, thing_template_parameters );
          set_definitional_question_person_template_parameters( self, person_template_parameters );
          set_definitional_question_general_template_parameters( self, general_template_parameters );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_definitional_question_method = Errors.handleThrowable( ccatch_env_var, $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_definitional_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 11227L)
  public static SubLObject instantiate_templates(final SubLObject templates, final SubLObject param_table)
  {
    SubLObject res = NIL;
    SubLObject cdolist_list_var = templates;
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      res = ConsesLow.append( res, template_instances_for_param_table( template, param_table ) );
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return res;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 11450L)
  public static SubLObject template_instances_for_param_table(final SubLObject template, final SubLObject param_table)
  {
    if( NIL == param_table )
    {
      return ConsesLow.list( template );
    }
    final SubLObject v_bindings = param_table.first();
    final SubLObject param = v_bindings.first();
    final SubLObject args = v_bindings.rest();
    return instantiate_templates( template_instances_for_param( template, param, args ), param_table.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 11792L)
  public static SubLObject template_instances_for_param(final SubLObject template, final SubLObject param, final SubLObject args)
  {
    SubLObject res = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      res = ConsesLow.cons( string_utilities.string_substitute( arg, param, template, UNPROVIDED ), res );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Sequences.reverse( Sequences.remove_duplicates( res, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 12023L)
  public static SubLObject definitional_question_nrestr_appositive_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare)
  {
    if( string_compare == UNPROVIDED )
    {
      string_compare = EQUAL;
    }
    final SubLObject num_daughters = methods.funcall_instance_method_with_0_args( tree, $sym91$DAUGHTER_COUNT );
    if( !num_daughters.numGE( TWO_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject first_daughter = methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ZERO_INTEGER );
    final SubLObject second_daughter = methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ONE_INTEGER );
    if( methods.funcall_instance_method_with_0_args( tree, $sym52$GET_CATEGORY ) == $kw113$NP && methods.funcall_instance_method_with_0_args( first_daughter, $sym52$GET_CATEGORY ) == $kw113$NP )
    {
      if( NIL != question.np_term_match( first_daughter, v_term, string_compare ) )
      {
        if( num_daughters.numGE( THREE_INTEGER ) && num_daughters.numLE( FOUR_INTEGER ) && NIL != conses_high.member( methods.funcall_instance_method_with_0_args( second_daughter, $sym52$GET_CATEGORY ), $list114, EQ,
            UNPROVIDED ) )
        {
          final SubLObject potential_nrestr_appositive = methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, TWO_INTEGER );
          if( methods.funcall_instance_method_with_0_args( potential_nrestr_appositive, $sym52$GET_CATEGORY ) == $kw113$NP )
          {
            return ConsesLow.list( potential_nrestr_appositive );
          }
        }
        if( num_daughters.numE( TWO_INTEGER ) && methods.funcall_instance_method_with_0_args( second_daughter, $sym52$GET_CATEGORY ) == $kw115$PRN && methods.funcall_instance_method_with_0_args( second_daughter,
            $sym91$DAUGHTER_COUNT ).numE( THREE_INTEGER ) && NIL != conses_high.member( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( second_daughter, $sym42$GET_DAUGHTER,
                ZERO_INTEGER ), $sym52$GET_CATEGORY ), $list116, EQ, UNPROVIDED ) )
        {
          final SubLObject potential_nrestr_appositive = methods.funcall_instance_method_with_1_args( second_daughter, $sym42$GET_DAUGHTER, ONE_INTEGER );
          if( methods.funcall_instance_method_with_0_args( potential_nrestr_appositive, $sym52$GET_CATEGORY ) == $kw113$NP )
          {
            return ConsesLow.list( potential_nrestr_appositive );
          }
        }
      }
      if( num_daughters.numE( FOUR_INTEGER ) )
      {
        final SubLObject third_daughter = methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, TWO_INTEGER );
        final SubLObject fourth_daughter = methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, THREE_INTEGER );
        if( methods.funcall_instance_method_with_0_args( third_daughter, $sym52$GET_CATEGORY ) == $kw113$NP && NIL != question.np_term_match( third_daughter, v_term, string_compare ) && NIL != conses_high.member( methods
            .funcall_instance_method_with_0_args( fourth_daughter, $sym52$GET_CATEGORY ), $list114, EQ, UNPROVIDED ) )
        {
          return ConsesLow.list( first_daughter );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 14209L)
  public static SubLObject definitional_question_equality_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare)
  {
    if( string_compare == UNPROVIDED )
    {
      string_compare = EQUAL;
    }
    if( methods.funcall_instance_method_with_0_args( tree, $sym52$GET_CATEGORY ) == $kw120$S && methods.funcall_instance_method_with_0_args( tree, $sym91$DAUGHTER_COUNT ).numGE( TWO_INTEGER ) && methods
        .funcall_instance_method_with_0_args( tree, $sym91$DAUGHTER_COUNT ).numLE( THREE_INTEGER ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER,
            ZERO_INTEGER ), $sym52$GET_CATEGORY ) == $kw113$NP && NIL != question.np_term_match( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ), v_term, string_compare ) && methods
                .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ONE_INTEGER ), $sym52$GET_CATEGORY ) == $kw121$VP && NIL != methods
                    .funcall_instance_method_with_1_args( tree, $sym122$GET_DESCENDANT, $list123 ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree,
                        $sym122$GET_DESCENDANT, $list123 ), $sym52$GET_CATEGORY ) == $kw124$AUX && NIL != conses_high.member( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args(
                            tree, $sym122$GET_DESCENDANT, $list123 ), $sym46$GET_STRING ), $list47, EQUALP, UNPROVIDED ) && NIL != methods.funcall_instance_method_with_1_args( tree, $sym122$GET_DESCENDANT, $list125 )
        && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym122$GET_DESCENDANT, $list125 ), $sym52$GET_CATEGORY ) == $kw113$NP )
    {
      return ConsesLow.list( methods.funcall_instance_method_with_1_args( tree, $sym122$GET_DESCENDANT, $list125 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 15128L)
  public static SubLObject definitional_question_called_x_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare)
  {
    if( string_compare == UNPROVIDED )
    {
      string_compare = EQUAL;
    }
    if( methods.funcall_instance_method_with_0_args( tree, $sym52$GET_CATEGORY ) == $kw113$NP && NIL != methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ) && NIL != methods
        .funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ONE_INTEGER ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER,
            ZERO_INTEGER ), $sym52$GET_CATEGORY ) == $kw113$NP && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ONE_INTEGER ),
                $sym52$GET_CATEGORY ) == $kw121$VP && NIL != methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ONE_INTEGER ), $sym51$GET_HEAD )
        && NIL != Functions.funcall( string_compare, methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER,
            ONE_INTEGER ), $sym51$GET_HEAD ), $sym46$GET_STRING ), $str129$called ) && NIL != methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods
                .funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ONE_INTEGER ), $sym51$GET_HEAD ), $sym54$GET_OBJECTS ) && NIL != Functions.funcall( string_compare, methods
                    .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER,
                        ONE_INTEGER ), $sym51$GET_HEAD ), $sym54$GET_OBJECTS ).first(), $sym46$GET_STRING ), v_term ) )
    {
      return ConsesLow.list( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 15918L)
  public static SubLObject definitional_question_restr_relative_clause_description_method(final SubLObject self, final SubLObject v_term, final SubLObject passage_tree, SubLObject string_compare)
  {
    if( string_compare == UNPROVIDED )
    {
      string_compare = EQUAL;
    }
    if( methods.funcall_instance_method_with_0_args( passage_tree, $sym52$GET_CATEGORY ) == $kw113$NP && methods.funcall_instance_method_with_0_args( passage_tree, $sym91$DAUGHTER_COUNT ).numGE( THREE_INTEGER )
        && methods.funcall_instance_method_with_0_args( passage_tree, $sym91$DAUGHTER_COUNT ).numLE( FOUR_INTEGER ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args(
            passage_tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ), $sym52$GET_CATEGORY ) == $kw113$NP && NIL != question.np_term_match( methods.funcall_instance_method_with_1_args( passage_tree, $sym42$GET_DAUGHTER,
                ZERO_INTEGER ), v_term, string_compare ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( passage_tree, $sym42$GET_DAUGHTER, ONE_INTEGER ),
                    $sym52$GET_CATEGORY ) == $kw134$_ && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( passage_tree, $sym42$GET_DAUGHTER, TWO_INTEGER ),
                        $sym52$GET_CATEGORY ) == $kw135$SBAR && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( passage_tree, $sym42$GET_DAUGHTER, TWO_INTEGER ),
                            $sym91$DAUGHTER_COUNT ).numGE( TWO_INTEGER ) && NIL != methods.funcall_instance_method_with_1_args( passage_tree, $sym122$GET_DESCENDANT, $list136 ) && methods
                                .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( passage_tree, $sym122$GET_DESCENDANT, $list136 ), $sym52$GET_CATEGORY ) == $kw137$WHNP && NIL != methods
                                    .funcall_instance_method_with_1_args( passage_tree, $sym122$GET_DESCENDANT, $list138 ) )
    {
      return ConsesLow.list( methods.funcall_instance_method_with_1_args( passage_tree, $sym122$GET_DESCENDANT, $list138 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 16922L)
  public static SubLObject definitional_question_restr_appositive_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare)
  {
    if( string_compare == UNPROVIDED )
    {
      string_compare = EQUAL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_definitional_question_method = NIL;
    final SubLObject leading_appositive_blacklist = get_definitional_question_leading_appositive_blacklist( self );
    final SubLObject v_parser = question.get_question_parser( self );
    final SubLObject parse = question.get_question_parse( self );
    final SubLObject string = question.get_question_string( self );
    try
    {
      thread.throwStack.push( $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
      try
      {
        final SubLObject string_$3 = methods.funcall_instance_method_with_0_args( tree, $sym46$GET_STRING );
        final SubLObject string_length = Sequences.length( string_$3 );
        final SubLObject term_length = Sequences.length( v_term );
        final SubLObject category = methods.funcall_instance_method_with_0_args( tree, $sym52$GET_CATEGORY );
        SubLObject description = NIL;
        SubLObject parse_$4 = NIL;
        if( NIL != subl_promotions.memberP( category, $list143, EQ, UNPROVIDED ) && NIL != methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ) && methods
            .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym42$GET_DAUGHTER, ZERO_INTEGER ), $sym52$GET_CATEGORY ) != $kw144$DT && NIL != question.np_term_match( tree, v_term,
                string_compare ) && Sequences.length( string_$3 ).numG( Sequences.length( v_term ) ) )
        {
          description = string_utilities.substring( string_$3, ZERO_INTEGER, Numbers.subtract( string_length, number_utilities.f_1X( term_length ) ) );
          parse_$4 = methods.funcall_instance_method_with_1_args( v_parser, $sym34$PARSE, description );
          if( NIL != parse_tree.phrase_tree_p( parse_$4 ) && NIL != conses_high.member( methods.funcall_instance_method_with_0_args( parse_$4, $sym52$GET_CATEGORY ), $list143, UNPROVIDED, UNPROVIDED )
              && NIL == subl_promotions.memberP( methods.funcall_instance_method_with_0_args( parse_$4, $sym46$GET_STRING ), leading_appositive_blacklist, EQUALP, UNPROVIDED ) && NIL == lexicon_utilities.first_name_p(
                  methods.funcall_instance_method_with_0_args( parse_$4, $sym46$GET_STRING ) ) )
          {
            Dynamic.sublisp_throw( $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, ConsesLow.list( parse_$4 ) );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_definitional_question_leading_appositive_blacklist( self, leading_appositive_blacklist );
          question.set_question_parser( self, v_parser );
          question.set_question_parse( self, parse );
          question.set_question_string( self, string );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_definitional_question_method = Errors.handleThrowable( ccatch_env_var, $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_definitional_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 18114L)
  public static SubLObject pre_nominal_title_via_link(final SubLObject link_word)
  {
    assert NIL != linkage.link_word_p( link_word ) : link_word;
    SubLObject cdolist_list_var;
    final SubLObject title_link_words = cdolist_list_var = methods.funcall_instance_method_with_2_args( link_word, $sym147$GET_DIRECTLY_RELATED, $kw148$G_PATTERN, $kw149$LEFT );
    SubLObject title_link_word = NIL;
    title_link_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != methods.funcall_instance_method_with_2_args( title_link_word, $sym147$GET_DIRECTLY_RELATED, $kw150$X_I_PATTERN, $kw151$RIGHT ) )
      {
        return methods.funcall_instance_method_with_0_args( title_link_word, $sym46$GET_STRING );
      }
      cdolist_list_var = cdolist_list_var.rest();
      title_link_word = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 18809L)
  public static SubLObject np_head_modified_by_appositive(final SubLObject link_word, final SubLObject v_term)
  {
    assert NIL != linkage.link_word_p( link_word ) : link_word;
    assert NIL != Types.stringp( v_term ) : v_term;
    if( NIL == methods.funcall_instance_method_with_2_args( link_word, $sym147$GET_DIRECTLY_RELATED, $kw153$X_D_PATTERN, $kw149$LEFT ) || NIL == methods.funcall_instance_method_with_2_args( link_word,
        $sym147$GET_DIRECTLY_RELATED, $kw154$X_C_PATTERN, $kw151$RIGHT ) )
    {
      return NIL;
    }
    final SubLObject head = methods.funcall_instance_method_with_2_args( link_word, $sym147$GET_DIRECTLY_RELATED, $kw155$MX_PATTERN, $kw149$LEFT ).first();
    if( NIL != head )
    {
      final SubLObject modifiers = methods.funcall_instance_method_with_0_args( head, $sym156$GET_MODIFIERS );
      SubLObject result_words = ConsesLow.list( head );
      SubLObject cdolist_list_var = modifiers;
      SubLObject modifier = NIL;
      modifier = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == string_utilities.substringP( methods.funcall_instance_method_with_0_args( modifier, $sym46$GET_STRING ), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject item_var = modifier;
          if( NIL == conses_high.member( item_var, result_words, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            result_words = ConsesLow.cons( item_var, result_words );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        modifier = cdolist_list_var.first();
      }
      return ConsesLow.list( head, result_words );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 19930L)
  public static SubLObject get_pre_nominal_description(final SubLObject passage_string, final SubLObject head_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject head_tokens = string_utilities.split_string( head_string, UNPROVIDED );
    SubLObject v_linkage = NIL;
    SubLObject result_words = NIL;
    SubLObject result_strings = NIL;
    SubLObject results = NIL;
    SubLObject error_msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym157$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject lexicon = cyclifier_lexicon.new_cyclifier_lexicon();
          SubLObject error = NIL;
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym157$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                v_linkage = linkage.new_linkage( passage_string, ConsesLow.list( $kw158$LEXICON, lexicon ) );
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$5, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != error )
          {
            parser.ensure_link_server_running();
            v_linkage = linkage.new_linkage( passage_string, ConsesLow.list( $kw158$LEXICON, lexicon ) );
          }
        }
        catch( final Throwable catch_var2 )
        {
          Errors.handleThrowable( catch_var2, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      error_msg = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_msg )
    {
      Errors.warn( $str159$Error_caught_in_GET_PRE_NOMINAL_D, error_msg );
    }
    if( NIL != v_linkage )
    {
      SubLObject cdolist_list_var = ConsesLow.cons( head_string, head_tokens );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$6;
        final SubLObject link_words = cdolist_list_var_$6 = linkage.search_atmost_n_link_words( v_linkage, word, THREE_INTEGER );
        SubLObject link_word = NIL;
        link_word = cdolist_list_var_$6.first();
        while ( NIL != cdolist_list_var_$6)
        {
          final SubLObject title = pre_nominal_title_via_link( link_word );
          final SubLObject head = np_head_modified_by_appositive( link_word, head_string );
          if( NIL != title )
          {
            final SubLObject item_var = title;
            if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              results = ConsesLow.cons( item_var, results );
            }
          }
          if( NIL != head )
          {
            final SubLObject item_var = methods.funcall_instance_method_with_0_args( head.first(), $sym46$GET_STRING );
            if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              results = ConsesLow.cons( item_var, results );
            }
            result_words = conses_high.second( head );
          }
          SubLObject cdolist_list_var_$7;
          final SubLObject related_lws = cdolist_list_var_$7 = Sequences.cconcatenate( methods.funcall_instance_method_with_2_args( link_word, $sym147$GET_DIRECTLY_RELATED, $kw160$GN_PATTERN, $kw149$LEFT ),
              new SubLObject[]
              { methods.funcall_instance_method_with_2_args( link_word, $sym147$GET_DIRECTLY_RELATED, $kw148$G_PATTERN, $kw149$LEFT ), methods.funcall_instance_method_with_2_args( link_word, $sym147$GET_DIRECTLY_RELATED,
                  $kw161$AN_PATTERN, $kw149$LEFT )
              } );
          SubLObject related_lw = NIL;
          related_lw = cdolist_list_var_$7.first();
          while ( NIL != cdolist_list_var_$7)
          {
            final SubLObject item_var2 = methods.funcall_instance_method_with_0_args( related_lw, $sym46$GET_STRING );
            if( NIL == conses_high.member( item_var2, results, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              results = ConsesLow.cons( item_var2, results );
            }
            result_words = ConsesLow.cons( related_lw, result_words );
            result_words = Sequences.cconcatenate( result_words, methods.funcall_instance_method_with_0_args( related_lw, $sym156$GET_MODIFIERS ) );
            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
            related_lw = cdolist_list_var_$7.first();
          }
          cdolist_list_var_$6 = cdolist_list_var_$6.rest();
          link_word = cdolist_list_var_$6.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    SubLObject cdolist_list_var = Sort.sort( Sequences.remove_duplicates( result_words, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym162$LINK_WORD_AFTER, UNPROVIDED );
    SubLObject result_word = NIL;
    result_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result_strings = ConsesLow.cons( methods.funcall_instance_method_with_0_args( result_word, $sym46$GET_STRING ), result_strings );
      cdolist_list_var = cdolist_list_var.rest();
      result_word = cdolist_list_var.first();
    }
    if( NIL != result_strings )
    {
      final SubLObject bunged_result = string_utilities.bunge( result_strings, UNPROVIDED );
      if( NIL != string_utilities.substringP( bunged_result, passage_string, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var3 = bunged_result;
        if( NIL == conses_high.member( item_var3, results, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          results = ConsesLow.cons( item_var3, results );
        }
      }
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 23296L)
  public static SubLObject definitional_question_get_pre_nominal_description_via_link_method(final SubLObject self, final SubLObject passage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_definitional_question_method = NIL;
    final SubLObject max_confidence = question.get_question_max_confidence( self );
    try
    {
      thread.throwStack.push( $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
      try
      {
        final SubLObject terms = ConsesLow.cons( methods.funcall_instance_method_with_0_args( self, $sym73$GET_FOCUS ), methods.funcall_instance_method_with_0_args( self, $sym74$GET_FOCUS_VARIANTS ) );
        final SubLObject passage_string = methods.funcall_instance_method_with_0_args( passage, $sym75$GET_CONTENT );
        SubLObject result_strings = NIL;
        SubLObject results = NIL;
        if( NIL == result_strings )
        {
          SubLObject csome_list_var = terms;
          SubLObject v_term = NIL;
          v_term = csome_list_var.first();
          while ( NIL == result_strings && NIL != csome_list_var)
          {
            if( NIL != v_term )
            {
              result_strings = get_pre_nominal_description( passage_string, v_term );
            }
            csome_list_var = csome_list_var.rest();
            v_term = csome_list_var.first();
          }
        }
        SubLObject cdolist_list_var = result_strings;
        SubLObject result_string = NIL;
        result_string = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var = answer.new_text_answer( self, result_string, passage, max_confidence, UNPROVIDED );
          if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            results = ConsesLow.cons( item_var, results );
          }
          cdolist_list_var = cdolist_list_var.rest();
          result_string = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, results );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_max_confidence( self, max_confidence );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_definitional_question_method = Errors.handleThrowable( ccatch_env_var, $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_definitional_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 23855L)
  public static SubLObject entities_for_cns_topic(final SubLObject query_string)
  {
    assert NIL != Types.stringp( query_string ) : query_string;
    final SubLObject entities_hash = Hashtables.make_hash_table( $int166$32, Symbols.symbol_function( EQUALP ), UNPROVIDED );
    SubLObject entities_list = NIL;
    SubLObject cdolist_list_var;
    final SubLObject passages = cdolist_list_var = search_engine.ask_lemur( query_string, TEN_INTEGER, TEN_INTEGER, ONE_INTEGER, $str167$_cyc_projects_aquaint_lemur_indic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    SubLObject pass = NIL;
    pass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject text = conses_high.third( pass );
      final SubLObject entities = external_interfaces.resporatorXX( text );
      PrintLow.format( T, $str168$___S__, text );
      SubLObject cdolist_list_var_$8 = entities;
      SubLObject ent = NIL;
      ent = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        hash_table_utilities.cinc_hash( ent, entities_hash, UNPROVIDED, UNPROVIDED );
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        ent = cdolist_list_var_$8.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pass = cdolist_list_var.first();
    }
    SubLObject k = NIL;
    SubLObject v = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( entities_hash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        k = Hashtables.getEntryKey( cdohash_entry );
        v = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != subl_promotions.memberP( k.first(), $list169, UNPROVIDED, UNPROVIDED ) )
        {
          entities_list = ConsesLow.cons( ConsesLow.list( k, v ), entities_list );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Sort.sort( entities_list, $sym170$_, $sym171$SECOND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 24640L)
  public static SubLObject research(final SubLObject query_string)
  {
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = entities_for_cns_topic( query_string );
    SubLObject ent = NIL;
    ent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject type = conses_high.caar( ent );
      final SubLObject string = ent.first().rest();
      SubLObject v_question = NIL;
      if( NIL != subl_promotions.memberP( type, $list169, EQUAL, UNPROVIDED ) )
      {
        v_question = question.new_question( PrintLow.format( NIL, $str172$_a_is__a_, type.equal( $sym173$PERSON ) ? $str174$Who : $str175$What, string ), ConsesLow.list( $str176$CNSjan2004 ),
            $sym0$DEFINITIONAL_QUESTION );
        print_high.princ( $str177$_________________________________, UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        print_high.princ( v_question, UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        SubLObject cdolist_list_var_$9 = methods.funcall_instance_method_with_0_args( v_question, $sym178$ANSWER );
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var_$9.first();
        while ( NIL != cdolist_list_var_$9)
        {
          print_high.princ( v_answer, UNPROVIDED );
          streams_high.terpri( UNPROVIDED );
          answers = ConsesLow.cons( v_answer, answers );
          cdolist_list_var_$9 = cdolist_list_var_$9.rest();
          v_answer = cdolist_list_var_$9.first();
        }
        streams_high.terpri( UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ent = cdolist_list_var.first();
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 25320L)
  public static SubLObject definitional_question_test_helper(final SubLObject passage_string, final SubLObject focus_string)
  {
    final SubLObject passage = search_engine.new_simple_passage( passage_string );
    final SubLObject v_parser = parser.new_stanford_parser( UNPROVIDED, UNPROVIDED );
    final SubLObject question_string = Sequences.cconcatenate( $str179$Who_is_, new SubLObject[] { focus_string, $str180$_
    } );
    final SubLObject question_parse = methods.funcall_instance_method_with_1_args( v_parser, $sym34$PARSE, question_string );
    final SubLObject v_question = object.new_class_instance( $sym0$DEFINITIONAL_QUESTION );
    SubLObject answers = NIL;
    SubLObject definitions = NIL;
    question.set_question_parser( v_question, v_parser );
    question.set_question_string( v_question, question_string );
    question.set_question_parse( v_question, question_parse );
    SubLObject cdolist_list_var;
    answers = ( cdolist_list_var = methods.funcall_instance_method_with_1_args( v_question, $sym68$EXTRACT, passage ) );
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject string_answer = methods.funcall_instance_method_with_0_args( v_answer, $sym75$GET_CONTENT );
      if( NIL != string_utilities.non_empty_stringP( string_answer ) )
      {
        definitions = ConsesLow.cons( string_answer, definitions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    return definitions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 25320L)
  public static SubLObject this_equal(final SubLObject thing1, final SubLObject thing2)
  {
    return Equality.equalp( thing1, thing2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/definitional-question.lisp", position = 25320L)
  public static SubLObject pre_nominal_test_func(final SubLObject thing1, final SubLObject thing2)
  {
    return conses_high.intersection( thing1, thing2, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  public static SubLObject declare_definitional_question_file()
  {
    SubLFiles.declareFunction( me, "get_definitional_question_leading_appositive_blacklist", "GET-DEFINITIONAL-QUESTION-LEADING-APPOSITIVE-BLACKLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_definitional_question_leading_appositive_blacklist", "SET-DEFINITIONAL-QUESTION-LEADING-APPOSITIVE-BLACKLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_definitional_question_thing_template_parameters", "GET-DEFINITIONAL-QUESTION-THING-TEMPLATE-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_definitional_question_thing_template_parameters", "SET-DEFINITIONAL-QUESTION-THING-TEMPLATE-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_definitional_question_organization_template_parameters", "GET-DEFINITIONAL-QUESTION-ORGANIZATION-TEMPLATE-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_definitional_question_organization_template_parameters", "SET-DEFINITIONAL-QUESTION-ORGANIZATION-TEMPLATE-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_definitional_question_person_template_parameters", "GET-DEFINITIONAL-QUESTION-PERSON-TEMPLATE-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_definitional_question_person_template_parameters", "SET-DEFINITIONAL-QUESTION-PERSON-TEMPLATE-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_definitional_question_general_template_parameters", "GET-DEFINITIONAL-QUESTION-GENERAL-TEMPLATE-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_definitional_question_general_template_parameters", "SET-DEFINITIONAL-QUESTION-GENERAL-TEMPLATE-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_definitional_question_glimpse_thing_templates", "GET-DEFINITIONAL-QUESTION-GLIMPSE-THING-TEMPLATES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_definitional_question_glimpse_thing_templates", "SET-DEFINITIONAL-QUESTION-GLIMPSE-THING-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_definitional_question_glimpse_general_templates", "GET-DEFINITIONAL-QUESTION-GLIMPSE-GENERAL-TEMPLATES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_definitional_question_glimpse_general_templates", "SET-DEFINITIONAL-QUESTION-GLIMPSE-GENERAL-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_definitional_question_class", "SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_definitional_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_p", "DEFINITIONAL-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_isaP_method", "DEFINITIONAL-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_querify_method", "DEFINITIONAL-QUESTION-QUERIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_answer_wordnet_method", "DEFINITIONAL-QUESTION-ANSWER-WORDNET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_roots", "GET-ROOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_extract_method", "DEFINITIONAL-QUESTION-EXTRACT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_extract_via_deep_parse_method", "DEFINITIONAL-QUESTION-EXTRACT-VIA-DEEP-PARSE-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_get_focus_method", "DEFINITIONAL-QUESTION-GET-FOCUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_get_focus_variants_method", "DEFINITIONAL-QUESTION-GET-FOCUS-VARIANTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_answer_types_method", "DEFINITIONAL-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_answer_cardinality_method", "DEFINITIONAL-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_template_param_table_method", "DEFINITIONAL-QUESTION-TEMPLATE-PARAM-TABLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "instantiate_templates", "INSTANTIATE-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "template_instances_for_param_table", "TEMPLATE-INSTANCES-FOR-PARAM-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "template_instances_for_param", "TEMPLATE-INSTANCES-FOR-PARAM", 3, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_nrestr_appositive_description_method", "DEFINITIONAL-QUESTION-NRESTR-APPOSITIVE-DESCRIPTION-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "definitional_question_equality_description_method", "DEFINITIONAL-QUESTION-EQUALITY-DESCRIPTION-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "definitional_question_called_x_description_method", "DEFINITIONAL-QUESTION-CALLED-X-DESCRIPTION-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "definitional_question_restr_relative_clause_description_method", "DEFINITIONAL-QUESTION-RESTR-RELATIVE-CLAUSE-DESCRIPTION-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "definitional_question_restr_appositive_description_method", "DEFINITIONAL-QUESTION-RESTR-APPOSITIVE-DESCRIPTION-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "pre_nominal_title_via_link", "PRE-NOMINAL-TITLE-VIA-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "np_head_modified_by_appositive", "NP-HEAD-MODIFIED-BY-APPOSITIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_pre_nominal_description", "GET-PRE-NOMINAL-DESCRIPTION", 2, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_get_pre_nominal_description_via_link_method", "DEFINITIONAL-QUESTION-GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "entities_for_cns_topic", "ENTITIES-FOR-CNS-TOPIC", 1, 0, false );
    SubLFiles.declareFunction( me, "research", "RESEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "definitional_question_test_helper", "DEFINITIONAL-QUESTION-TEST-HELPER", 2, 0, false );
    SubLFiles.declareFunction( me, "this_equal", "THIS-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pre_nominal_test_func", "PRE-NOMINAL-TEST-FUNC", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_definitional_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_definitional_question_file()
  {
    classes.subloop_new_class( $sym0$DEFINITIONAL_QUESTION, $sym1$WH_QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$DEFINITIONAL_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$DEFINITIONAL_QUESTION, $sym27$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$DEFINITIONAL_QUESTION, $sym37$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_INSTANCE );
    subloop_reserved_initialize_definitional_question_class( $sym0$DEFINITIONAL_QUESTION );
    methods.methods_incorporate_class_method( $sym38$ISA_, $sym0$DEFINITIONAL_QUESTION, $list39, $list40, $list41 );
    methods.subloop_register_class_method( $sym0$DEFINITIONAL_QUESTION, $sym38$ISA_, $sym55$DEFINITIONAL_QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym56$QUERIFY, $sym0$DEFINITIONAL_QUESTION, $list39, NIL, $list57 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym56$QUERIFY, $sym61$DEFINITIONAL_QUESTION_QUERIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym62$ANSWER_WORDNET, $sym0$DEFINITIONAL_QUESTION, $list39, NIL, $list63 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym62$ANSWER_WORDNET, $sym64$DEFINITIONAL_QUESTION_ANSWER_WORDNET_METHOD );
    methods.methods_incorporate_instance_method( $sym68$EXTRACT, $sym0$DEFINITIONAL_QUESTION, $list39, $list69, $list70 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym68$EXTRACT, $sym79$DEFINITIONAL_QUESTION_EXTRACT_METHOD );
    methods.methods_incorporate_instance_method( $sym76$EXTRACT_VIA_DEEP_PARSE, $sym0$DEFINITIONAL_QUESTION, $list39, $list80, $list81 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym76$EXTRACT_VIA_DEEP_PARSE, $sym87$DEFINITIONAL_QUESTION_EXTRACT_VIA_DEEP_PARSE_METHOD );
    methods.methods_incorporate_instance_method( $sym73$GET_FOCUS, $sym0$DEFINITIONAL_QUESTION, $list88, NIL, $list89 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym73$GET_FOCUS, $sym93$DEFINITIONAL_QUESTION_GET_FOCUS_METHOD );
    methods.methods_incorporate_instance_method( $sym74$GET_FOCUS_VARIANTS, $sym0$DEFINITIONAL_QUESTION, $list88, NIL, $list94 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym74$GET_FOCUS_VARIANTS, $sym98$DEFINITIONAL_QUESTION_GET_FOCUS_VARIANTS_METHOD );
    methods.methods_incorporate_instance_method( $sym35$ANSWER_TYPES, $sym0$DEFINITIONAL_QUESTION, $list39, NIL, $list99 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym35$ANSWER_TYPES, $sym100$DEFINITIONAL_QUESTION_ANSWER_TYPES_METHOD );
    methods.methods_incorporate_instance_method( $sym101$ANSWER_CARDINALITY, $sym0$DEFINITIONAL_QUESTION, $list39, NIL, $list102 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym101$ANSWER_CARDINALITY, $sym103$DEFINITIONAL_QUESTION_ANSWER_CARDINALITY_METHOD );
    methods.methods_incorporate_instance_method( $sym60$TEMPLATE_PARAM_TABLE, $sym0$DEFINITIONAL_QUESTION, $list39, $list104, $list105 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym60$TEMPLATE_PARAM_TABLE, $sym108$DEFINITIONAL_QUESTION_TEMPLATE_PARAM_TABLE_METHOD );
    methods.methods_incorporate_instance_method( $sym109$NRESTR_APPOSITIVE_DESCRIPTION, $sym0$DEFINITIONAL_QUESTION, $list110, $list111, $list112 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym109$NRESTR_APPOSITIVE_DESCRIPTION, $sym117$DEFINITIONAL_QUESTION_NRESTR_APPOSITIVE_DESCRIPTION_METHOD );
    methods.methods_incorporate_instance_method( $sym118$EQUALITY_DESCRIPTION, $sym0$DEFINITIONAL_QUESTION, $list110, $list111, $list119 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym118$EQUALITY_DESCRIPTION, $sym126$DEFINITIONAL_QUESTION_EQUALITY_DESCRIPTION_METHOD );
    methods.methods_incorporate_instance_method( $sym127$CALLED_X_DESCRIPTION, $sym0$DEFINITIONAL_QUESTION, $list110, $list111, $list128 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym127$CALLED_X_DESCRIPTION, $sym130$DEFINITIONAL_QUESTION_CALLED_X_DESCRIPTION_METHOD );
    methods.methods_incorporate_instance_method( $sym131$RESTR_RELATIVE_CLAUSE_DESCRIPTION, $sym0$DEFINITIONAL_QUESTION, $list110, $list132, $list133 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym131$RESTR_RELATIVE_CLAUSE_DESCRIPTION, $sym139$DEFINITIONAL_QUESTION_RESTR_RELATIVE_CLAUSE_DESCRIPTION_METHOD );
    methods.methods_incorporate_instance_method( $sym140$RESTR_APPOSITIVE_DESCRIPTION, $sym0$DEFINITIONAL_QUESTION, $list110, $list111, $list141 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym140$RESTR_APPOSITIVE_DESCRIPTION, $sym145$DEFINITIONAL_QUESTION_RESTR_APPOSITIVE_DESCRIPTION_METHOD );
    methods.methods_incorporate_instance_method( $sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, $sym0$DEFINITIONAL_QUESTION, $list39, $list69, $list163 );
    methods.subloop_register_instance_method( $sym0$DEFINITIONAL_QUESTION, $sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, $sym165$DEFINITIONAL_QUESTION_GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK_METHOD );
    generic_testing.define_test_case_table_int( $sym181$GET_PRE_NOMINAL_DESCRIPTION, ConsesLow.list( new SubLObject[] { $kw182$TEST, Symbols.symbol_function( $sym183$PRE_NOMINAL_TEST_FUNC ), $kw184$OWNER, NIL,
      $kw185$CLASSES, NIL, $kw186$KB, $kw187$FULL, $kw188$WORKING_, NIL
    } ), $list189 );
    generic_testing.define_test_case_table_int( $sym190$DEFINITIONAL_QUESTION_TEST_HELPER, ConsesLow.list( new SubLObject[] { $kw182$TEST, $sym191$THIS_EQUAL, $kw184$OWNER, NIL, $kw185$CLASSES, NIL, $kw186$KB,
      $kw187$FULL, $kw188$WORKING_, NIL
    } ), $list192 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_definitional_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_definitional_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_definitional_question_file();
  }
  static
  {
    me = new definitional_question();
    $sym0$DEFINITIONAL_QUESTION = makeSymbol( "DEFINITIONAL-QUESTION" );
    $sym1$WH_QUESTION = makeSymbol( "WH-QUESTION" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "GLIMPSE-GENERAL-TEMPLATES" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), ConsesLow.list( new SubLObject[]
        { makeString( "<FOCUS><COMMA> <DET>" ), makeString( "such as <FOCUS>" ), makeString( "<FOCUS><COMMA> such as" ), makeString( "<FOCUS><COMMA> as <DET>" ), makeString( "<FOCUS><COMMA> <RELPN> <VERB> <DET>" ),
          makeString( "<FOCUS> <VERB> <DET>" ), makeString( "<VERB> <FOCUS>" ), makeString( "<FOCUS><COMMA> called <DET>" ), makeString( "<FOCUS><COMMA> <TYPE> of" ), makeString( "<FOCUS><COMMA> being <DET>" ),
          makeString( "<FOCUS>" )
        } ) ) ), ConsesLow.list( makeSymbol( "GLIMPSE-THING-TEMPLATES" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString(
            "called <FOCUS>" ), makeString( "<FOCUS><COMMA> defined" ), makeString( "<FOCUS><COMMA> or" ) ) ) ), ConsesLow.list( makeSymbol( "GENERAL-TEMPLATE-PARAMETERS" ), makeKeyword( "CLASS" ), makeKeyword(
                "PROTECTED" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeString( "<COMMA>" ), makeString( "\\," ) ), ConsesLow.list( makeString( "<DET>" ),
                    makeString( "the" ), makeString( "a" ), makeString( "an" ) ), ConsesLow.list( makeString( "<TYPE>" ), makeString( "kind" ), makeString( "type" ), makeString( "sort" ), makeString( "one" ) ), ConsesLow
                        .list( makeString( "<VERB>" ), makeString( "is" ), makeString( "was" ), makeString( "are" ), makeString( "were" ) ) ) ) ), ConsesLow.list( makeSymbol( "PERSON-TEMPLATE-PARAMETERS" ), makeKeyword(
                            "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeString( "<RELPN>" ), makeString( "who" ) ) ) ) ),
      ConsesLow.list( makeSymbol( "ORGANIZATION-TEMPLATE-PARAMETERS" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list(
          makeString( "<RELPN>" ), makeString( "that" ), makeString( "which" ) ) ) ) ), ConsesLow.list( makeSymbol( "THING-TEMPLATE-PARAMETERS" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword(
              "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeString( "<RELPN>" ), makeString( "that" ), makeString( "which" ), makeString( "who" ) ) ) ) ), ConsesLow.list(
                  makeSymbol( "LEADING-APPOSITIVE-BLACKLIST" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( new SubLObject[]
                  { makeString( "Central" ), makeString( "East" ), makeString( "West" ), makeString( "North" ), makeString( "South" ), makeString( "Mr" ), makeString( "Mr." ), makeString( "Mrs" ), makeString( "Mrs." ),
                    makeString( "Ms" )
                  } ) ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                      "DEF-INSTANCE-METHOD" ), makeSymbol( "QUERIFY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT" ), ConsesLow.list( makeSymbol(
                          "PASSAGE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FOCUS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                              "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FOCUS-VARIANTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-TYPES" ), NIL,
                                  makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-CARDINALITY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                      "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-WORDNET" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                          "NRESTR-APPOSITIVE-DESCRIPTION" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TREE" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                              makeSymbol( "RESTR-APPOSITIVE-DESCRIPTION" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TREE" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
                                                  "DEF-INSTANCE-METHOD" ), makeSymbol( "RESTR-RELATIVE-CLAUSE-DESCRIPTION" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TREE" ) ), makeKeyword( "PRIVATE" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EQUALITY-DESCRIPTION" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TREE" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "CALLED-X-DESCRIPTION" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TREE" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
              makeSymbol( "TEMPLATE-PARAM-TABLE" ), ConsesLow.list( makeSymbol( "WH-WORD" ) ), makeKeyword( "PRIVATE" ) )
    } );
    $sym3$LEADING_APPOSITIVE_BLACKLIST = makeSymbol( "LEADING-APPOSITIVE-BLACKLIST" );
    $sym4$THING_TEMPLATE_PARAMETERS = makeSymbol( "THING-TEMPLATE-PARAMETERS" );
    $sym5$ORGANIZATION_TEMPLATE_PARAMETERS = makeSymbol( "ORGANIZATION-TEMPLATE-PARAMETERS" );
    $sym6$PERSON_TEMPLATE_PARAMETERS = makeSymbol( "PERSON-TEMPLATE-PARAMETERS" );
    $sym7$GENERAL_TEMPLATE_PARAMETERS = makeSymbol( "GENERAL-TEMPLATE-PARAMETERS" );
    $sym8$GLIMPSE_THING_TEMPLATES = makeSymbol( "GLIMPSE-THING-TEMPLATES" );
    $sym9$GLIMPSE_GENERAL_TEMPLATES = makeSymbol( "GLIMPSE-GENERAL-TEMPLATES" );
    $sym10$OBJECT = makeSymbol( "OBJECT" );
    $sym11$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym12$QUESTION = makeSymbol( "QUESTION" );
    $sym13$LEXICON = makeSymbol( "LEXICON" );
    $sym14$PARSER = makeSymbol( "PARSER" );
    $sym15$TAGGER = makeSymbol( "TAGGER" );
    $sym16$CHUNKER = makeSymbol( "CHUNKER" );
    $sym17$MAX_CANDIDATES = makeSymbol( "MAX-CANDIDATES" );
    $sym18$MAX_CONFIDENCE = makeSymbol( "MAX-CONFIDENCE" );
    $sym19$LEARNABLE_TYPES = makeSymbol( "LEARNABLE-TYPES" );
    $list20 = ConsesLow.list( new SubLObject[] { makeString( "<FOCUS><COMMA> <DET>" ), makeString( "such as <FOCUS>" ), makeString( "<FOCUS><COMMA> such as" ), makeString( "<FOCUS><COMMA> as <DET>" ), makeString(
        "<FOCUS><COMMA> <RELPN> <VERB> <DET>" ), makeString( "<FOCUS> <VERB> <DET>" ), makeString( "<VERB> <FOCUS>" ), makeString( "<FOCUS><COMMA> called <DET>" ), makeString( "<FOCUS><COMMA> <TYPE> of" ), makeString(
            "<FOCUS><COMMA> being <DET>" ), makeString( "<FOCUS>" )
    } );
    $list21 = ConsesLow.list( makeString( "called <FOCUS>" ), makeString( "<FOCUS><COMMA> defined" ), makeString( "<FOCUS><COMMA> or" ) );
    $list22 = ConsesLow.list( ConsesLow.list( makeString( "<COMMA>" ), makeString( "\\," ) ), ConsesLow.list( makeString( "<DET>" ), makeString( "the" ), makeString( "a" ), makeString( "an" ) ), ConsesLow.list(
        makeString( "<TYPE>" ), makeString( "kind" ), makeString( "type" ), makeString( "sort" ), makeString( "one" ) ), ConsesLow.list( makeString( "<VERB>" ), makeString( "is" ), makeString( "was" ), makeString(
            "are" ), makeString( "were" ) ) );
    $list23 = ConsesLow.list( ConsesLow.list( makeString( "<RELPN>" ), makeString( "who" ) ) );
    $list24 = ConsesLow.list( ConsesLow.list( makeString( "<RELPN>" ), makeString( "that" ), makeString( "which" ) ) );
    $list25 = ConsesLow.list( ConsesLow.list( makeString( "<RELPN>" ), makeString( "that" ), makeString( "which" ), makeString( "who" ) ) );
    $list26 = ConsesLow.list( new SubLObject[] { makeString( "Central" ), makeString( "East" ), makeString( "West" ), makeString( "North" ), makeString( "South" ), makeString( "Mr" ), makeString( "Mr." ), makeString(
        "Mrs" ), makeString( "Mrs." ), makeString( "Ms" )
    } );
    $sym27$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-CLASS" );
    $sym28$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym29$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym30$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym31$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym32$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym33$STRING = makeSymbol( "STRING" );
    $sym34$PARSE = makeSymbol( "PARSE" );
    $sym35$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym36$CORPORA = makeSymbol( "CORPORA" );
    $sym37$SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-INSTANCE" );
    $sym38$ISA_ = makeSymbol( "ISA?" );
    $list39 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list40 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list41 = ConsesLow.list( makeString( "@param TREE question-tree-p\n   @return boolean; t if PARSE-TREE is a definitional question parse tree,\n   nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
        .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WH-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
            ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow
                .list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol(
                    "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "is" ), makeString( "are" ), makeString( "was" ), makeString( "were" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ), ConsesLow.list(
                                makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "STARTS-WITH-BY-TEST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "the name" ), ConsesLow.list( makeSymbol(
                                        "QUOTE" ), EQUALP ) ) ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list(
                                            makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow
                                                .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "what" ) ),
                                            ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "NOMINAL-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
                                                ONE_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                    "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ),
                                                    makeString( "who" ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "DETERMINER-WORD-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow
                                                        .list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                            makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow
                                                                .list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                    "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                        "GET-CATEGORY" ) ) ), makeKeyword( "NNP" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                            ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                makeSymbol( "GET-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol(
                                                                                    "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NNP" ) ) ) ) ) ) ) );
    $sym42$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym43$GET_SUBJECT = makeSymbol( "GET-SUBJECT" );
    $sym44$GET_SEMANTIC_HEAD = makeSymbol( "GET-SEMANTIC-HEAD" );
    $sym45$YIELD = makeSymbol( "YIELD" );
    $sym46$GET_STRING = makeSymbol( "GET-STRING" );
    $list47 = ConsesLow.list( makeString( "is" ), makeString( "are" ), makeString( "was" ), makeString( "were" ) );
    $str48$the_name = makeString( "the name" );
    $str49$what = makeString( "what" );
    $str50$who = makeString( "who" );
    $sym51$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym52$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $kw53$NNP = makeKeyword( "NNP" );
    $sym54$GET_OBJECTS = makeSymbol( "GET-OBJECTS" );
    $sym55$DEFINITIONAL_QUESTION_ISA__METHOD = makeSymbol( "DEFINITIONAL-QUESTION-ISA?-METHOD" );
    $sym56$QUERIFY = makeSymbol( "QUERIFY" );
    $list57 = ConsesLow.list( makeString( "@return listp; a list of queries likely to extract passages relevant to answer\n   this question" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "WH-WORD" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-WH-PHRASE" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list(
                makeSymbol( "TEMPLATES" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( EQUALP, makeSymbol( "WH-WORD" ), makeString( "what" ) ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol(
                    "GLIMPSE-GENERAL-TEMPLATES" ), makeSymbol( "GLIMPSE-THING-TEMPLATES" ) ), makeSymbol( "GLIMPSE-GENERAL-TEMPLATES" ) ) ), ConsesLow.list( makeSymbol( "PARAM-TABLE" ), ConsesLow.list( makeSymbol(
                        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TEMPLATE-PARAM-TABLE" ) ), makeSymbol( "WH-WORD" ) ) ), ConsesLow.list( makeSymbol( "QUERIES" ), NIL ) ),
        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE" ), ConsesLow.list( makeSymbol( "INSTANTIATE-TEMPLATES" ), makeSymbol( "TEMPLATES" ), makeSymbol( "PARAM-TABLE" ) ) ), ConsesLow
            .list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CORPUS" ), makeSymbol( "CORPORA" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-GLIMPSE-QUERY" ), makeSymbol(
                "TEMPLATE" ), makeSymbol( "CORPUS" ) ), makeSymbol( "QUERIES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "QUERIES" ) ) ) ) );
    $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD" );
    $sym59$GET_WH_PHRASE = makeSymbol( "GET-WH-PHRASE" );
    $sym60$TEMPLATE_PARAM_TABLE = makeSymbol( "TEMPLATE-PARAM-TABLE" );
    $sym61$DEFINITIONAL_QUESTION_QUERIFY_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-QUERIFY-METHOD" );
    $sym62$ANSWER_WORDNET = makeSymbol( "ANSWER-WORDNET" );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym64$DEFINITIONAL_QUESTION_ANSWER_WORDNET_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-ANSWER-WORDNET-METHOD" );
    $kw65$ROOT = makeKeyword( "ROOT" );
    $sym66$APPEND = makeSymbol( "APPEND" );
    $sym67$GET_ROOTS = makeSymbol( "GET-ROOTS" );
    $sym68$EXTRACT = makeSymbol( "EXTRACT" );
    $list69 = ConsesLow.list( makeSymbol( "PASSAGE" ) );
    $list70 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from PASSAGE" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PASSAGE" ), makeSymbol( "ABSTRACT-PASSAGE-P" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERMS" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS-VARIANTS" ) ) ) ) ), ConsesLow
                .list( makeSymbol( "PASSAGE-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol(
                    "SHALLOW-PARSES" ), NIL ), ConsesLow.list( makeSymbol( "DEEP-PARSE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ),
                        makeSymbol( "PASSAGE-STRING" ) ) ), makeSymbol( "ANSWERS0" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "STRING-CMP" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), ConsesLow.list( EQUAL, EQUALP ) ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "FIM" ),
                                makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EXTRACT-VIA-DEEP-PARSE" ) ), makeSymbol( "DEEP-PARSE" ), makeSymbol( "PASSAGE" ), makeSymbol(
                                    "STRING-CMP" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "ANSWERS0" ), makeSymbol( "ANSWERS" ) ) ),
            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "UNION" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK" ) ), makeSymbol( "PASSAGE" ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                    makeSymbol( "ANSWERS" ) ) ) );
    $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD" );
    $sym72$ABSTRACT_PASSAGE_P = makeSymbol( "ABSTRACT-PASSAGE-P" );
    $sym73$GET_FOCUS = makeSymbol( "GET-FOCUS" );
    $sym74$GET_FOCUS_VARIANTS = makeSymbol( "GET-FOCUS-VARIANTS" );
    $sym75$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym76$EXTRACT_VIA_DEEP_PARSE = makeSymbol( "EXTRACT-VIA-DEEP-PARSE" );
    $list77 = ConsesLow.list( EQUAL, EQUALP );
    $sym78$GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK = makeSymbol( "GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK" );
    $sym79$DEFINITIONAL_QUESTION_EXTRACT_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-EXTRACT-METHOD" );
    $list80 = ConsesLow.list( makeSymbol( "PASSAGE-PARSE" ), makeSymbol( "PASSAGE" ), makeSymbol( "STRING-CMP" ) );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERMS" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS-VARIANTS" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "EXTRACTORS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "NRESTR-APPOSITIVE-DESCRIPTION" ), makeSymbol( "RESTR-APPOSITIVE-DESCRIPTION" ), makeSymbol(
            "EQUALITY-DESCRIPTION" ), makeSymbol( "RESTR-RELATIVE-CLAUSE-DESCRIPTION" ), makeSymbol( "CALLED-X-DESCRIPTION" ) ) ) ), makeSymbol( "FOUND?" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol(
                "PWHEN" ), ConsesLow.list( makeSymbol( "PARSE-TREE-P" ), makeSymbol( "PASSAGE-PARSE" ) ), ConsesLow.list( makeSymbol( "DO-PARSE-TREE-SUBTREES" ), ConsesLow.list( makeSymbol( "SUBTREE" ), makeSymbol(
                    "PASSAGE-PARSE" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "PHRASE-TREE-P" ), makeSymbol( "SUBTREE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                        makeSymbol( "FOUND?" ), NIL ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "EXTRACTOR" ), makeSymbol( "EXTRACTORS" ), makeSymbol( "FOUND?" ) ), ConsesLow.list( makeSymbol(
                            "CSOME" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TERMS" ), makeSymbol( "FOUND?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TERM" ), ConsesLow.list( makeSymbol(
                                "CDOLIST" ), ConsesLow.list( makeSymbol( "DESCRIPTION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), makeSymbol( "EXTRACTOR" ), makeSymbol( "TERM" ), makeSymbol(
                                    "SUBTREE" ), makeSymbol( "STRING-CMP" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-TEXT-ANSWER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                        "FIM" ), makeSymbol( "DESCRIPTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "PASSAGE" ), makeSymbol( "MAX-CONFIDENCE" ), makeSymbol(
                                            "DESCRIPTION" ) ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FOUND?" ), T ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                "ANSWERS" ) ) ) );
    $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD" );
    $list83 = ConsesLow.list( makeSymbol( "NRESTR-APPOSITIVE-DESCRIPTION" ), makeSymbol( "RESTR-APPOSITIVE-DESCRIPTION" ), makeSymbol( "EQUALITY-DESCRIPTION" ), makeSymbol( "RESTR-RELATIVE-CLAUSE-DESCRIPTION" ),
        makeSymbol( "CALLED-X-DESCRIPTION" ) );
    $kw84$DFR2L = makeKeyword( "DFR2L" );
    $kw85$DFL2R = makeKeyword( "DFL2R" );
    $str86$_S_is_not_one_of__S = makeString( "~S is not one of ~S" );
    $sym87$DEFINITIONAL_QUESTION_EXTRACT_VIA_DEEP_PARSE_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-EXTRACT-VIA-DEEP-PARSE-METHOD" );
    $list88 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list89 = ConsesLow.list( makeString( "@return stringp; the focus string of QUESTION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol(
        "FUNLESS" ), ConsesLow.list( makeSymbol( "FRAG-TREE-P" ), makeSymbol( "PARSE" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-SUBJECT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WHNP-TREE-P" ), makeSymbol( "FOCUS-TREE" ) ), ConsesLow.list( makeSymbol(
                "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "FIM" ),
                    makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol(
                        "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ),
                            makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "DETERMINER-WORD-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FOCUS-TREE" ),
                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "BUNGE" ), ConsesLow.list(
                                    makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PARSE-TREE-STRING" ) ), ConsesLow.list( makeSymbol( "CDR" ), ConsesLow.list( makeSymbol( "FIM" ),
                                        makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ),
                                            makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) );
    $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD" );
    $sym91$DAUGHTER_COUNT = makeSymbol( "DAUGHTER-COUNT" );
    $sym92$GET_PARSE_TREE_STRING = makeSymbol( "GET-PARSE-TREE-STRING" );
    $sym93$DEFINITIONAL_QUESTION_GET_FOCUS_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-GET-FOCUS-METHOD" );
    $list94 = ConsesLow.list( makeString( "@return listp; a list of string of variants of this question's focus" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FOCUS-TREE" ),
        ConsesLow.list( makeSymbol( "FUNLESS" ), ConsesLow.list( makeSymbol( "FRAG-TREE-P" ), makeSymbol( "PARSE" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "GET-SUBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "FOCUS-HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "FOCUS-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "FOCUS-POS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "FOCUS-HEAD" ),
                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FOCUS-HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ) ) ), makeSymbol( "VARIANTS" ) ), ConsesLow.list( makeSymbol(
                        "PCASE" ), makeSymbol( "FOCUS-POS" ), ConsesLow.list( makeKeyword( "NN" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "PLURALIZE-STRING" ), ConsesLow.list( makeSymbol(
                            "GET-FOCUS" ), makeSymbol( "SELF" ) ) ), makeSymbol( "VARIANTS" ) ) ), ConsesLow.list( makeKeyword( "NNS" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                "PLURAL-NOUN-TO-SG" ), ConsesLow.list( makeSymbol( "GET-FOCUS" ), makeSymbol( "SELF" ) ) ), makeSymbol( "VARIANTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                    "VARIANTS" ) ) ) );
    $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD" );
    $kw96$NN = makeKeyword( "NN" );
    $kw97$NNS = makeKeyword( "NNS" );
    $sym98$DEFINITIONAL_QUESTION_GET_FOCUS_VARIANTS_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-GET-FOCUS-VARIANTS-METHOD" );
    $list99 = ConsesLow.list( makeString( "@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction" ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), NIL ) ) );
    $sym100$DEFINITIONAL_QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-ANSWER-TYPES-METHOD" );
    $sym101$ANSWER_CARDINALITY = makeSymbol( "ANSWER-CARDINALITY" );
    $list102 = ConsesLow.list( makeString( "@return positive-integer-p; the number of answers expected for this question" ), ConsesLow.list( makeSymbol( "RET" ), TEN_INTEGER ) );
    $sym103$DEFINITIONAL_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-ANSWER-CARDINALITY-METHOD" );
    $list104 = ConsesLow.list( makeSymbol( "WH-WORD" ) );
    $list105 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RES" ), NIL ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( EQUALP,
        makeSymbol( "WH-WORD" ), makeString( "who" ) ), ConsesLow.list( makeSymbol( "CSETF" ), makeSymbol( "RES" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "GENERAL-TEMPLATE-PARAMETERS" ), makeSymbol(
            "PERSON-TEMPLATE-PARAMETERS" ) ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "WH-WORD" ), makeString( "what" ) ), ConsesLow.list( makeSymbol( "CSETF" ), makeSymbol( "RES" ), ConsesLow.list(
                makeSymbol( "APPEND" ), makeSymbol( "GENERAL-TEMPLATE-PARAMETERS" ), makeSymbol( "THING-TEMPLATE-PARAMETERS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ACONS" ),
                    makeString( "<FOCUS>" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS" ) ) ),
                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS-VARIANTS" ) ) ) ), makeSymbol( "RES" ) ) ) ) );
    $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD" );
    $str107$_FOCUS_ = makeString( "<FOCUS>" );
    $sym108$DEFINITIONAL_QUESTION_TEMPLATE_PARAM_TABLE_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-TEMPLATE-PARAM-TABLE-METHOD" );
    $sym109$NRESTR_APPOSITIVE_DESCRIPTION = makeSymbol( "NRESTR-APPOSITIVE-DESCRIPTION" );
    $list110 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list111 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TREE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STRING-COMPARE" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ) );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NUM-DAUGHTERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "NUM-DAUGHTERS" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ),
            NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIRST-DAUGHTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "SECOND-DAUGHTER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                        "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FIRST-DAUGHTER" ),
                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NP-TERM-MATCH" ),
                                makeSymbol( "FIRST-DAUGHTER" ), makeSymbol( "TERM" ), makeSymbol( "STRING-COMPARE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                                    makeSymbol( ">=" ), makeSymbol( "NUM-DAUGHTERS" ), THREE_INTEGER ), ConsesLow.list( makeSymbol( "<=" ), makeSymbol( "NUM-DAUGHTERS" ), FOUR_INTEGER ), ConsesLow.list( makeSymbol(
                                        "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SECOND-DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "," ), makeKeyword( ":" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                ConsesLow.list( ConsesLow.list( makeSymbol( "POTENTIAL-NRESTR-APPOSITIVE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol(
                                                    "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), TWO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ),
                                                        makeSymbol( "POTENTIAL-NRESTR-APPOSITIVE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list(
                                                            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "POTENTIAL-NRESTR-APPOSITIVE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                                ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "NUM-DAUGHTERS" ), TWO_INTEGER ), ConsesLow.list( EQ, ConsesLow.list(
                                                                    makeSymbol( "FIM" ), makeSymbol( "SECOND-DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "PRN" ) ),
                                                                    ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SECOND-DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                        makeSymbol( "DAUGHTER-COUNT" ) ) ), THREE_INTEGER ), ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list(
                                                                            makeSymbol( "FIM" ), makeSymbol( "SECOND-DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ),
                                                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword(
                                                                                ":" ), makeKeyword( "(" ), makeKeyword( "-LRB-" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ), ConsesLow.list( makeSymbol(
                                                                                    "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POTENTIAL-NRESTR-APPOSITIVE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                                        "SECOND-DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ) ) ), ConsesLow.list(
                                                                                            makeSymbol( "PWHEN" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "POTENTIAL-NRESTR-APPOSITIVE" ),
                                                                                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list( makeSymbol(
                                                                                                    "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "POTENTIAL-NRESTR-APPOSITIVE" ) ) ) ) ) ) ), ConsesLow.list(
                                                                                                        makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "NUM-DAUGHTERS" ), FOUR_INTEGER ), ConsesLow
                                                                                                            .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "THIRD-DAUGHTER" ), ConsesLow.list(
                                                                                                                makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                    "GET-DAUGHTER" ) ), TWO_INTEGER ) ), ConsesLow.list( makeSymbol( "FOURTH-DAUGHTER" ), ConsesLow.list(
                                                                                                                        makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                            "GET-DAUGHTER" ) ), THREE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                                                                                                                makeSymbol( "CAND" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                                                                                    "THIRD-DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                                        "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                            "NP-TERM-MATCH" ), makeSymbol( "THIRD-DAUGHTER" ), makeSymbol( "TERM" ),
                                                                                                                                            makeSymbol( "STRING-COMPARE" ) ), ConsesLow.list( makeSymbol( "MEMBER" ),
                                                                                                                                                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FOURTH-DAUGHTER" ),
                                                                                                                                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ),
                                                                                                                                                ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "," ),
                                                                                                                                                    makeKeyword( ":" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ),
                                                                                                                                ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                                                                                                                                    "FIRST-DAUGHTER" ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $kw113$NP = makeKeyword( "NP" );
    $list114 = ConsesLow.list( makeKeyword( "," ), makeKeyword( ":" ) );
    $kw115$PRN = makeKeyword( "PRN" );
    $list116 = ConsesLow.list( makeKeyword( ":" ), makeKeyword( "(" ), makeKeyword( "-LRB-" ) );
    $sym117$DEFINITIONAL_QUESTION_NRESTR_APPOSITIVE_DESCRIPTION_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-NRESTR-APPOSITIVE-DESCRIPTION-METHOD" );
    $sym118$EQUALITY_DESCRIPTION = makeSymbol( "EQUALITY-DESCRIPTION" );
    $list119 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( new SubLObject[] { makeSymbol( "CAND" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "S" ) ), ConsesLow.list( makeSymbol( ">=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "<=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "DAUGHTER-COUNT" ) ) ), THREE_INTEGER ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list( makeSymbol( "NP-TERM-MATCH" ), ConsesLow
                        .list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), makeSymbol( "TERM" ), makeSymbol( "STRING-COMPARE" ) ),
      ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow
          .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "VP" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
              "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ONE_INTEGER, ZERO_INTEGER ) ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ),
                  makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ONE_INTEGER, ZERO_INTEGER ) ) ), ConsesLow.list(
                      makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "AUX" ) ), ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ),
                          makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ONE_INTEGER, ZERO_INTEGER ) ) ), ConsesLow
                              .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "is" ), makeString( "are" ), makeString( "was" ), makeString(
                                  "were" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                      "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ONE_INTEGER, ONE_INTEGER ) ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list(
                                          makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                                              ONE_INTEGER, ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DESCENDANT" ) ),
        ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ONE_INTEGER, ONE_INTEGER ) ) ) ) ) ) );
    $kw120$S = makeKeyword( "S" );
    $kw121$VP = makeKeyword( "VP" );
    $sym122$GET_DESCENDANT = makeSymbol( "GET-DESCENDANT" );
    $list123 = ConsesLow.list( ONE_INTEGER, ZERO_INTEGER );
    $kw124$AUX = makeKeyword( "AUX" );
    $list125 = ConsesLow.list( ONE_INTEGER, ONE_INTEGER );
    $sym126$DEFINITIONAL_QUESTION_EQUALITY_DESCRIPTION_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-EQUALITY-DESCRIPTION-METHOD" );
    $sym127$CALLED_X_DESCRIPTION = makeSymbol( "CALLED-X-DESCRIPTION" );
    $list128 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( new SubLObject[] { makeSymbol( "CAND" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( EQ,
                ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "VP" ) ), ConsesLow
                            .list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list(
                                makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "STRING-COMPARE" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list(
                                    makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list(
                                        makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "called" ) ), ConsesLow.list( makeSymbol(
                                            "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
                                                ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ), ConsesLow.list(
                                                    makeSymbol( "FUNCALL" ), makeSymbol( "STRING-COMPARE" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                                                        "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                            "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                "GET-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "TERM" ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
        ZERO_INTEGER ) ) ) ) );
    $str129$called = makeString( "called" );
    $sym130$DEFINITIONAL_QUESTION_CALLED_X_DESCRIPTION_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-CALLED-X-DESCRIPTION-METHOD" );
    $sym131$RESTR_RELATIVE_CLAUSE_DESCRIPTION = makeSymbol( "RESTR-RELATIVE-CLAUSE-DESCRIPTION" );
    $list132 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PASSAGE-TREE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STRING-COMPARE" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ) );
    $list133 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( new SubLObject[] { makeSymbol( "CAND" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list( makeSymbol( ">=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ), THREE_INTEGER ), ConsesLow.list( makeSymbol( "<=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ), FOUR_INTEGER ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NP" ) ), ConsesLow.list(
                        makeSymbol( "NP-TERM-MATCH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), makeSymbol(
                            "TERM" ), makeSymbol( "STRING-COMPARE" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list(
                                makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "," ) ), ConsesLow.list( EQ,
                                    ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
                                        TWO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "SBAR" ) ), ConsesLow.list( makeSymbol( ">=" ), ConsesLow.list( makeSymbol(
                                            "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), TWO_INTEGER ), ConsesLow
                                                .list( makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list(
                                                    makeSymbol( "QUOTE" ), makeSymbol( "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( TWO_INTEGER, ZERO_INTEGER ) ) ), ConsesLow.list( EQ,
                                                        ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                            "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( TWO_INTEGER, ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                "GET-CATEGORY" ) ) ), makeKeyword( "WHNP" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                    makeSymbol( "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( TWO_INTEGER, ONE_INTEGER ) ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE-TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-DESCENDANT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( TWO_INTEGER, ONE_INTEGER ) ) ) ) ) ) );
    $kw134$_ = makeKeyword( "," );
    $kw135$SBAR = makeKeyword( "SBAR" );
    $list136 = ConsesLow.list( TWO_INTEGER, ZERO_INTEGER );
    $kw137$WHNP = makeKeyword( "WHNP" );
    $list138 = ConsesLow.list( TWO_INTEGER, ONE_INTEGER );
    $sym139$DEFINITIONAL_QUESTION_RESTR_RELATIVE_CLAUSE_DESCRIPTION_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-RESTR-RELATIVE-CLAUSE-DESCRIPTION-METHOD" );
    $sym140$RESTR_APPOSITIVE_DESCRIPTION = makeSymbol( "RESTR-APPOSITIVE-DESCRIPTION" );
    $list141 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "STRING-LENGTH" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "TERM-LENGTH" ),
            ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( makeSymbol( "CATEGORY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-CATEGORY" ) ) ) ), makeSymbol( "DESCRIPTION" ), makeSymbol( "PARSE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
                    "MEMBER?" ), makeSymbol( "CATEGORY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NP" ), makeKeyword( "NPP" ), makeKeyword( "PNP" ) ) ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), EQ ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
                            "CNOT" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "DT" ) ) ), ConsesLow.list( makeSymbol( "NP-TERM-MATCH" ),
                                    makeSymbol( "TREE" ), makeSymbol( "TERM" ), makeSymbol( "STRING-COMPARE" ) ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "STRING" ) ),
                                        ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "TERM" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DESCRIPTION" ), ConsesLow.list( makeSymbol( "SUBSTRING" ),
                                            makeSymbol( "STRING" ), ZERO_INTEGER, ConsesLow.list( makeSymbol( "-" ), makeSymbol( "STRING-LENGTH" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "TERM-LENGTH" ) ) ) ) ),
                    ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ), makeSymbol(
                        "DESCRIPTION" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "PHRASE-TREE-P" ), makeSymbol( "PARSE" ) ), ConsesLow.list(
                            makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), ConsesLow.list( makeKeyword( "NP" ), makeKeyword( "NPP" ), makeKeyword( "PNP" ) ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "MEMBER?" ), ConsesLow
                                    .list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "LEADING-APPOSITIVE-BLACKLIST" ), ConsesLow.list(
                                        makeSymbol( "QUOTE" ), EQUALP ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIRST-NAME-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ),
                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                                                "PARSE" ) ) ) ) ) ) );
    $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD" );
    $list143 = ConsesLow.list( makeKeyword( "NP" ), makeKeyword( "NPP" ), makeKeyword( "PNP" ) );
    $kw144$DT = makeKeyword( "DT" );
    $sym145$DEFINITIONAL_QUESTION_RESTR_APPOSITIVE_DESCRIPTION_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-RESTR-APPOSITIVE-DESCRIPTION-METHOD" );
    $sym146$LINK_WORD_P = makeSymbol( "LINK-WORD-P" );
    $sym147$GET_DIRECTLY_RELATED = makeSymbol( "GET-DIRECTLY-RELATED" );
    $kw148$G_PATTERN = makeKeyword( "G-PATTERN" );
    $kw149$LEFT = makeKeyword( "LEFT" );
    $kw150$X_I_PATTERN = makeKeyword( "X-I-PATTERN" );
    $kw151$RIGHT = makeKeyword( "RIGHT" );
    $sym152$STRINGP = makeSymbol( "STRINGP" );
    $kw153$X_D_PATTERN = makeKeyword( "X-D-PATTERN" );
    $kw154$X_C_PATTERN = makeKeyword( "X-C-PATTERN" );
    $kw155$MX_PATTERN = makeKeyword( "MX-PATTERN" );
    $sym156$GET_MODIFIERS = makeSymbol( "GET-MODIFIERS" );
    $sym157$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw158$LEXICON = makeKeyword( "LEXICON" );
    $str159$Error_caught_in_GET_PRE_NOMINAL_D = makeString( "Error caught in GET-PRE-NOMINAL-DESCRIPTION ~s" );
    $kw160$GN_PATTERN = makeKeyword( "GN-PATTERN" );
    $kw161$AN_PATTERN = makeKeyword( "AN-PATTERN" );
    $sym162$LINK_WORD_AFTER = makeSymbol( "LINK-WORD-AFTER" );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERMS" ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS-VARIANTS" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "PASSAGE-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), makeSymbol(
            "RESULT-STRINGS" ), makeSymbol( "RESULTS" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TERMS" ), makeSymbol( "RESULT-STRINGS" ) ), ConsesLow.list( makeSymbol(
                "PWHEN" ), makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT-STRINGS" ), ConsesLow.list( makeSymbol( "GET-PRE-NOMINAL-DESCRIPTION" ), makeSymbol( "PASSAGE-STRING" ),
                    makeSymbol( "TERM" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RESULT-STRING" ), makeSymbol( "RESULT-STRINGS" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ),
                        ConsesLow.list( makeSymbol( "NEW-TEXT-ANSWER" ), makeSymbol( "SELF" ), makeSymbol( "RESULT-STRING" ), makeSymbol( "PASSAGE" ), makeSymbol( "MAX-CONFIDENCE" ) ), makeSymbol( "RESULTS" ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULTS" ) ) ) );
    $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD" );
    $sym165$DEFINITIONAL_QUESTION_GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK_METHOD = makeSymbol( "DEFINITIONAL-QUESTION-GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK-METHOD" );
    $int166$32 = makeInteger( 32 );
    $str167$_cyc_projects_aquaint_lemur_indic = makeString( "/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param" );
    $str168$___S__ = makeString( "~%~S~%" );
    $list169 = ConsesLow.list( makeSymbol( "PERSON" ), makeSymbol( "ORG" ) );
    $sym170$_ = makeSymbol( ">" );
    $sym171$SECOND = makeSymbol( "SECOND" );
    $str172$_a_is__a_ = makeString( "~a is ~a?" );
    $sym173$PERSON = makeSymbol( "PERSON" );
    $str174$Who = makeString( "Who" );
    $str175$What = makeString( "What" );
    $str176$CNSjan2004 = makeString( "CNSjan2004" );
    $str177$_________________________________ = makeString( "----------------------------------------------------" );
    $sym178$ANSWER = makeSymbol( "ANSWER" );
    $str179$Who_is_ = makeString( "Who is " );
    $str180$_ = makeString( "?" );
    $sym181$GET_PRE_NOMINAL_DESCRIPTION = makeSymbol( "GET-PRE-NOMINAL-DESCRIPTION" );
    $kw182$TEST = makeKeyword( "TEST" );
    $sym183$PRE_NOMINAL_TEST_FUNC = makeSymbol( "PRE-NOMINAL-TEST-FUNC" );
    $kw184$OWNER = makeKeyword( "OWNER" );
    $kw185$CLASSES = makeKeyword( "CLASSES" );
    $kw186$KB = makeKeyword( "KB" );
    $kw187$FULL = makeKeyword( "FULL" );
    $kw188$WORKING_ = makeKeyword( "WORKING?" );
    $list189 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Canadian singer David Baxter lives in the woods" ), makeString( "David Baxter" ) ), ConsesLow.list( makeString( "Canadian singer" ) ) ) );
    $sym190$DEFINITIONAL_QUESTION_TEST_HELPER = makeSymbol( "DEFINITIONAL-QUESTION-TEST-HELPER" );
    $sym191$THIS_EQUAL = makeSymbol( "THIS-EQUAL" );
    $list192 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Vaclav Havel, who is the president of the Chech Republic, sleeps with monkeys" ), makeString( "Vaclav Havel" ) ), ConsesLow.list( makeString(
        "is the president of the Chech Republic" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "terrorism is a heinous crime against humanity" ), makeString( "terrorism" ) ), ConsesLow.list( makeString(
            "a heinous crime against humanity" ) ) ) );
  }
}
/*
 * 
 * Total time: 809 ms
 * 
 */