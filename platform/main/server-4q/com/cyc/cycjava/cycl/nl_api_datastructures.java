package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_api_datastructures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_api_datastructures";
  public static final String myFingerPrint = "9709e7d3d966034d339936172e000cdbf8ef64753a616dfa4807a41dc263a8e4";
  private static final SubLSymbol $sym0$NEW_NL_OUTPUT_SPEC;
  private static final SubLSymbol $sym1$KEYWORDP;
  private static final SubLSymbol $sym2$NL_INTERPRETATION_SPEC_P;
  private static final SubLSymbol $kw3$SUBL;
  private static final SubLSymbol $kw4$XML;
  private static final SubLSymbol $kw5$CYCL;
  private static final SubLSymbol $kw6$PRAGMATICS;
  private static final SubLSymbol $sym7$NEW_NL_INTERPRETATION_SPEC;
  private static final SubLList $list8;
  private static final SubLString $str9$construct_a_new_default_NL_interp;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLString $str12$;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$NL_INTERP_SPEC_REQUEST_CYCL;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$NL_INTERP_SPEC_RETURN_CYCL_;
  private static final SubLSymbol $kw18$WEIGHT;
  private static final SubLSymbol $sym19$NL_INTERP_SPEC_REQUEST_WEIGHT;
  private static final SubLSymbol $sym20$NL_INTERP_SPEC_RETURN_WEIGHT_;
  private static final SubLSymbol $kw21$JUSTIFICATION;
  private static final SubLSymbol $sym22$NL_INTERP_SPEC_REQUEST_JUSTIFICATION;
  private static final SubLSymbol $sym23$NL_INTERP_SPEC_RETURN_JUSTIFICATION_;
  private static final SubLSymbol $kw24$PHRASE_TYPES;
  private static final SubLSymbol $sym25$NL_INTERP_SPEC_REQUEST_PHRASE_TYPES;
  private static final SubLSymbol $sym26$NL_INTERP_SPEC_RETURN_PHRASE_TYPES_;
  private static final SubLSymbol $kw27$INFLECTIONS;
  private static final SubLSymbol $sym28$NL_INTERP_SPEC_REQUEST_HEAD_INFLECTIONS;
  private static final SubLSymbol $sym29$NL_INTERP_SPEC_RETURN_HEAD_INFLECTIONS_;
  private static final SubLSymbol $sym30$NL_INTERP_SPEC_REQUEST_PRAGMATICS;
  private static final SubLSymbol $sym31$NL_INTERP_SPEC_RETURN_PRAGMATICS_;
  private static final SubLSymbol $sym32$NEW_NL_INTERPRETATION;
  private static final SubLSymbol $sym33$NL_INTERPRETATION_P;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$PLIST_ENTER;
  private static final SubLSymbol $sym37$SET_NL_INTERP_CYCL;
  private static final SubLString $str38$set_the_CycL_value_for_INTERP_to_;
  private static final SubLSymbol $sym39$GET_NL_INTERP_CYCL;
  private static final SubLList $list40;
  private static final SubLString $str41$Returns_the_CycL_currently_specif;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$SET_NL_INTERP_PRAGMATICS;
  private static final SubLString $str46$set_the_pragmatic_features_for_IN;
  private static final SubLSymbol $sym47$GET_NL_INTERP_PRAGMATICS;
  private static final SubLString $str48$Returns_the_pragmatic_features_sp;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$SET_NL_INTERP_WEIGHT;
  private static final SubLString $str52$set_the_weight_for_INTERP_to_WEIG;
  private static final SubLSymbol $sym53$GET_NL_INTERP_WEIGHT;
  private static final SubLString $str54$Returns_the_weight_currently_spec;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$SET_NL_INTERP_JUSTIFICATION;
  private static final SubLString $str58$set_the_justification_for_INTERP_;
  private static final SubLSymbol $sym59$GET_NL_INTERP_JUSTIFICATION;
  private static final SubLString $str60$Returns_the_justification_current;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$SET_NL_INTERP_PHRASE_TYPES;
  private static final SubLString $str64$set_the_phrase_types_for_INTERP_t;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$PUTF;
  private static final SubLSymbol $sym67$ADD_NL_INTERP_PHRASE_TYPE;
  private static final SubLString $str68$add_PHRASE_TYPES_to_the_phrase_ty;
  private static final SubLSymbol $sym69$GET_NL_INTERP_PHRASE_TYPES;
  private static final SubLString $str70$Returns_the_phrase_types_currentl;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$SET_NL_INTERP_HEAD_INFLECTIONS;
  private static final SubLString $str74$set_the_inflections__speech_part_;
  private static final SubLSymbol $sym75$GET_NL_INTERP_HEAD_INFLECTIONS;
  private static final SubLString $str76$returns_the_inflections_predicate;
  private static final SubLString $str77$NLInterpretation;
  private static final SubLSymbol $kw78$UNINITIALIZED;
  private static final SubLString $str79$Cycl;
  private static final SubLString $str80$Weight;
  private static final SubLString $str81$PhraseType;
  private static final SubLString $str82$HeadInflection;
  private static final SubLString $str83$justification;
  private static final SubLString $str84$status;
  private static final SubLString $str85$unimplemented;

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 844L)
  public static SubLObject new_nl_output_spec(final SubLObject output_type, SubLObject interp_spec)
  {
    if( interp_spec == UNPROVIDED )
    {
      interp_spec = NIL;
    }
    enforceType( output_type, $sym1$KEYWORDP );
    enforceType( interp_spec, $sym2$NL_INTERPRETATION_SPEC_P );
    final SubLObject desired_interp_spec = ( NIL != interp_spec ) ? interp_spec : new_nl_interpretation_spec( UNPROVIDED );
    final SubLObject result = ConsesLow.list( output_type, desired_interp_spec );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 1721L)
  public static SubLObject output_spec_interp_spec(final SubLObject obj)
  {
    return conses_high.second( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 1792L)
  public static SubLObject subl_output_spec_p(final SubLObject obj)
  {
    return Equality.eq( obj.first(), $kw3$SUBL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 1868L)
  public static SubLObject xml_output_spec_p(final SubLObject obj)
  {
    return Equality.eq( obj.first(), $kw4$XML );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 1942L)
  public static SubLObject new_nl_interpretation_spec(SubLObject plist)
  {
    if( plist == UNPROVIDED )
    {
      plist = NIL;
    }
    if( NIL != list_utilities.non_empty_list_p( plist ) )
    {
      return plist;
    }
    return new_nl_interpretation( ConsesLow.list( $kw5$CYCL, T, $kw6$PRAGMATICS, T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 2607L)
  public static SubLObject nl_interpretation_spec_p(final SubLObject obj)
  {
    return nl_interpretation_p( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 2719L)
  public static SubLObject nl_interp_spec_request_cycl(SubLObject interp_spec)
  {
    enforceType( interp_spec, $sym2$NL_INTERPRETATION_SPEC_P );
    interp_spec = conses_high.putf( interp_spec, $kw5$CYCL, T );
    return interp_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 2902L)
  public static SubLObject nl_interp_spec_return_cyclP(final SubLObject interp_spec)
  {
    return conses_high.getf( interp_spec, $kw5$CYCL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3001L)
  public static SubLObject nl_interp_spec_request_weight(SubLObject interp_spec)
  {
    enforceType( interp_spec, $sym2$NL_INTERPRETATION_SPEC_P );
    interp_spec = conses_high.putf( interp_spec, $kw18$WEIGHT, T );
    return interp_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3187L)
  public static SubLObject nl_interp_spec_return_weightP(final SubLObject interp_spec)
  {
    return conses_high.getf( interp_spec, $kw18$WEIGHT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3290L)
  public static SubLObject nl_interp_spec_request_justification(SubLObject interp_spec)
  {
    enforceType( interp_spec, $sym2$NL_INTERPRETATION_SPEC_P );
    interp_spec = conses_high.putf( interp_spec, $kw21$JUSTIFICATION, T );
    return interp_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3490L)
  public static SubLObject nl_interp_spec_return_justificationP(final SubLObject interp_spec)
  {
    return conses_high.getf( interp_spec, $kw21$JUSTIFICATION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3607L)
  public static SubLObject nl_interp_spec_request_phrase_types(SubLObject interp_spec)
  {
    enforceType( interp_spec, $sym2$NL_INTERPRETATION_SPEC_P );
    interp_spec = conses_high.putf( interp_spec, $kw24$PHRASE_TYPES, T );
    return interp_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3805L)
  public static SubLObject nl_interp_spec_return_phrase_typesP(final SubLObject interp_spec)
  {
    return conses_high.getf( interp_spec, $kw24$PHRASE_TYPES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3920L)
  public static SubLObject nl_interp_spec_request_head_inflections(SubLObject interp_spec)
  {
    enforceType( interp_spec, $sym2$NL_INTERPRETATION_SPEC_P );
    interp_spec = conses_high.putf( interp_spec, $kw27$INFLECTIONS, T );
    return interp_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4170L)
  public static SubLObject nl_interp_spec_return_head_inflectionsP(final SubLObject interp_spec)
  {
    return conses_high.getf( interp_spec, $kw27$INFLECTIONS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4291L)
  public static SubLObject nl_interp_spec_request_pragmatics(SubLObject interp_spec)
  {
    enforceType( interp_spec, $sym2$NL_INTERPRETATION_SPEC_P );
    interp_spec = conses_high.putf( interp_spec, $kw6$PRAGMATICS, T );
    return interp_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4485L)
  public static SubLObject nl_interp_spec_return_pragmaticsP(final SubLObject interp_spec)
  {
    return conses_high.getf( interp_spec, $kw6$PRAGMATICS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4596L)
  public static SubLObject new_nl_interpretation(SubLObject plist)
  {
    if( plist == UNPROVIDED )
    {
      plist = NIL;
    }
    if( NIL != nl_interpretation_p( plist ) )
    {
      return plist;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4893L)
  public static SubLObject nl_interpretation_p(final SubLObject item)
  {
    return list_utilities.property_list_p( item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4998L)
  public static SubLObject set_nl_interp_cycl(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interp = NIL;
    SubLObject cycl = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    interp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    cycl = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym36$PLIST_ENTER, interp, $kw5$CYCL, cycl );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5133L)
  public static SubLObject get_nl_interp_cycl(final SubLObject interp)
  {
    enforceType( interp, $sym33$NL_INTERPRETATION_P );
    return conses_high.getf( interp, $kw5$CYCL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5344L)
  public static SubLObject set_nl_interp_pragmatics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interp = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    interp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym36$PLIST_ENTER, interp, $kw6$PRAGMATICS, value );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5501L)
  public static SubLObject get_nl_interp_pragmatics(final SubLObject interp)
  {
    enforceType( interp, $sym33$NL_INTERPRETATION_P );
    return conses_high.getf( interp, $kw6$PRAGMATICS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5774L)
  public static SubLObject set_nl_interp_weight(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interp = NIL;
    SubLObject weight = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    interp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    weight = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym36$PLIST_ENTER, interp, $kw18$WEIGHT, weight );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5914L)
  public static SubLObject get_nl_interp_weight(final SubLObject interp)
  {
    enforceType( interp, $sym33$NL_INTERPRETATION_P );
    return conses_high.getf( interp, $kw18$WEIGHT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6126L)
  public static SubLObject set_nl_interp_justification(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interp = NIL;
    SubLObject justification = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    interp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    justification = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym36$PLIST_ENTER, interp, $kw21$JUSTIFICATION, justification );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6308L)
  public static SubLObject get_nl_interp_justification(final SubLObject interp)
  {
    enforceType( interp, $sym33$NL_INTERPRETATION_P );
    return conses_high.getf( interp, $kw21$JUSTIFICATION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6551L)
  public static SubLObject set_nl_interp_phrase_types(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interp = NIL;
    SubLObject phrase_types = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    interp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    phrase_types = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym36$PLIST_ENTER, interp, $kw24$PHRASE_TYPES, phrase_types );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6727L)
  public static SubLObject add_nl_interp_phrase_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interp = NIL;
    SubLObject phrase_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    interp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    phrase_type = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym66$PUTF, interp, $kw24$PHRASE_TYPES, reader.bq_cons( phrase_type, conses_high.getf( interp, $kw24$PHRASE_TYPES, UNPROVIDED ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6928L)
  public static SubLObject get_nl_interp_phrase_types(final SubLObject interp)
  {
    enforceType( interp, $sym33$NL_INTERPRETATION_P );
    return conses_high.getf( interp, $kw24$PHRASE_TYPES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 7168L)
  public static SubLObject set_nl_interp_head_inflections(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interp = NIL;
    SubLObject inflections = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    interp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    inflections = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym36$PLIST_ENTER, interp, $kw27$INFLECTIONS, inflections );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list72 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 7368L)
  public static SubLObject get_nl_interp_head_inflections(final SubLObject interp)
  {
    enforceType( interp, $sym33$NL_INTERPRETATION_P );
    return conses_high.getf( interp, $kw27$INFLECTIONS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 7645L)
  public static SubLObject nl_interp_to_xml(final SubLObject nl_interp)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject xml = NIL;
    final SubLObject attributes = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        try
        {
          final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str77$NLInterpretation, attributes, NIL, NIL, $kw78$UNINITIALIZED );
            final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw78$UNINITIALIZED, thread );
              try
              {
                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str79$Cycl, NIL, NIL, NIL, $kw78$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw78$UNINITIALIZED, thread );
                    cycml_generator.cycml_serialize_object( get_nl_interp_cycl( nl_interp ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$4, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$3, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str79$Cycl );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                }
              }
              if( NIL != get_nl_interp_weight( nl_interp ) )
              {
                try
                {
                  final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str80$Weight, NIL, NIL, NIL, $kw78$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw78$UNINITIALIZED, thread );
                      xml_utilities.xml_print( get_nl_interp_weight( nl_interp ), UNPROVIDED );
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$7, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$5, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$6, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str80$Weight );
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                  }
                }
              }
              if( NIL != get_nl_interp_justification( nl_interp ) )
              {
                nl_interp_justification_to_xml( get_nl_interp_justification( nl_interp ) );
              }
              if( NIL != get_nl_interp_phrase_types( nl_interp ) )
              {
                try
                {
                  final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str81$PhraseType, NIL, NIL, NIL, $kw78$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw78$UNINITIALIZED, thread );
                      SubLObject cdolist_list_var = get_nl_interp_phrase_types( nl_interp );
                      SubLObject phrase_type = NIL;
                      phrase_type = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        cycml_generator.cycml_serialize_object( phrase_type );
                        cdolist_list_var = cdolist_list_var.rest();
                        phrase_type = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$10, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$6, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$9, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str81$PhraseType );
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
                  }
                }
              }
              if( NIL != get_nl_interp_head_inflections( nl_interp ) )
              {
                try
                {
                  final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str82$HeadInflection, NIL, NIL, NIL, $kw78$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw78$UNINITIALIZED, thread );
                      SubLObject cdolist_list_var = get_nl_interp_head_inflections( nl_interp );
                      SubLObject inflection = NIL;
                      inflection = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        cycml_generator.cycml_serialize_object( inflection );
                        cdolist_list_var = cdolist_list_var.rest();
                        inflection = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$13, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$7, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$12, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str82$HeadInflection );
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
                  }
                }
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values5 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str77$NLInterpretation );
            Values.restoreValuesFromVector( _values5 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      xml = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values6 = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values6 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 8581L)
  public static SubLObject nl_interp_justification_to_xml(final SubLObject just)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
    try
    {
      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
      xml_utilities.xml_start_tag_internal( $str83$justification, ConsesLow.list( $str84$status, $str85$unimplemented ), T, NIL, $kw78$UNINITIALIZED );
      final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding( thread );
      try
      {
        xml_vars.$xml_default_namespace$.bind( $kw78$UNINITIALIZED, thread );
      }
      finally
      {
        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$20, thread );
      }
    }
    finally
    {
      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 8729L)
  public static SubLObject cycls_from_nl_interps(final SubLObject interps)
  {
    return Sequences.remove_duplicates( Mapping.mapcar( $sym39$GET_NL_INTERP_CYCL, interps ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 8846L)
  public static SubLObject nl_justification_p(final SubLObject obj)
  {
    return Types.listp( obj );
  }

  public static SubLObject declare_nl_api_datastructures_file()
  {
    SubLFiles.declareFunction( me, "new_nl_output_spec", "NEW-NL-OUTPUT-SPEC", 1, 1, false );
    SubLFiles.declareFunction( me, "output_spec_interp_spec", "OUTPUT-SPEC-INTERP-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_output_spec_p", "SUBL-OUTPUT-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_output_spec_p", "XML-OUTPUT-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_nl_interpretation_spec", "NEW-NL-INTERPRETATION-SPEC", 0, 1, false );
    SubLFiles.declareFunction( me, "nl_interpretation_spec_p", "NL-INTERPRETATION-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_request_cycl", "NL-INTERP-SPEC-REQUEST-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_return_cyclP", "NL-INTERP-SPEC-RETURN-CYCL?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_request_weight", "NL-INTERP-SPEC-REQUEST-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_return_weightP", "NL-INTERP-SPEC-RETURN-WEIGHT?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_request_justification", "NL-INTERP-SPEC-REQUEST-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_return_justificationP", "NL-INTERP-SPEC-RETURN-JUSTIFICATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_request_phrase_types", "NL-INTERP-SPEC-REQUEST-PHRASE-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_return_phrase_typesP", "NL-INTERP-SPEC-RETURN-PHRASE-TYPES?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_request_head_inflections", "NL-INTERP-SPEC-REQUEST-HEAD-INFLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_return_head_inflectionsP", "NL-INTERP-SPEC-RETURN-HEAD-INFLECTIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_request_pragmatics", "NL-INTERP-SPEC-REQUEST-PRAGMATICS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_spec_return_pragmaticsP", "NL-INTERP-SPEC-RETURN-PRAGMATICS?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_nl_interpretation", "NEW-NL-INTERPRETATION", 0, 1, false );
    SubLFiles.declareFunction( me, "nl_interpretation_p", "NL-INTERPRETATION-P", 1, 0, false );
    SubLFiles.declareMacro( me, "set_nl_interp_cycl", "SET-NL-INTERP-CYCL" );
    SubLFiles.declareFunction( me, "get_nl_interp_cycl", "GET-NL-INTERP-CYCL", 1, 0, false );
    SubLFiles.declareMacro( me, "set_nl_interp_pragmatics", "SET-NL-INTERP-PRAGMATICS" );
    SubLFiles.declareFunction( me, "get_nl_interp_pragmatics", "GET-NL-INTERP-PRAGMATICS", 1, 0, false );
    SubLFiles.declareMacro( me, "set_nl_interp_weight", "SET-NL-INTERP-WEIGHT" );
    SubLFiles.declareFunction( me, "get_nl_interp_weight", "GET-NL-INTERP-WEIGHT", 1, 0, false );
    SubLFiles.declareMacro( me, "set_nl_interp_justification", "SET-NL-INTERP-JUSTIFICATION" );
    SubLFiles.declareFunction( me, "get_nl_interp_justification", "GET-NL-INTERP-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareMacro( me, "set_nl_interp_phrase_types", "SET-NL-INTERP-PHRASE-TYPES" );
    SubLFiles.declareMacro( me, "add_nl_interp_phrase_type", "ADD-NL-INTERP-PHRASE-TYPE" );
    SubLFiles.declareFunction( me, "get_nl_interp_phrase_types", "GET-NL-INTERP-PHRASE-TYPES", 1, 0, false );
    SubLFiles.declareMacro( me, "set_nl_interp_head_inflections", "SET-NL-INTERP-HEAD-INFLECTIONS" );
    SubLFiles.declareFunction( me, "get_nl_interp_head_inflections", "GET-NL-INTERP-HEAD-INFLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_to_xml", "NL-INTERP-TO-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_interp_justification_to_xml", "NL-INTERP-JUSTIFICATION-TO-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "cycls_from_nl_interps", "CYCLS-FROM-NL-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_justification_p", "NL-JUSTIFICATION-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_nl_api_datastructures_file()
  {
    return NIL;
  }

  public static SubLObject setup_nl_api_datastructures_file()
  {
    access_macros.register_external_symbol( $sym0$NEW_NL_OUTPUT_SPEC );
    utilities_macros.register_cyc_api_function( $sym7$NEW_NL_INTERPRETATION_SPEC, $list8, $str9$construct_a_new_default_NL_interp, NIL, $list10 );
    utilities_macros.register_cyc_api_function( $sym2$NL_INTERPRETATION_SPEC_P, $list11, $str12$, NIL, $list13 );
    utilities_macros.register_cyc_api_function( $sym14$NL_INTERP_SPEC_REQUEST_CYCL, $list15, $str12$, $list16, NIL );
    utilities_macros.register_cyc_api_function( $sym17$NL_INTERP_SPEC_RETURN_CYCL_, $list15, $str12$, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym19$NL_INTERP_SPEC_REQUEST_WEIGHT, $list15, $str12$, $list16, NIL );
    utilities_macros.register_cyc_api_function( $sym20$NL_INTERP_SPEC_RETURN_WEIGHT_, $list15, $str12$, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym22$NL_INTERP_SPEC_REQUEST_JUSTIFICATION, $list15, $str12$, $list16, NIL );
    utilities_macros.register_cyc_api_function( $sym23$NL_INTERP_SPEC_RETURN_JUSTIFICATION_, $list15, $str12$, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym25$NL_INTERP_SPEC_REQUEST_PHRASE_TYPES, $list15, $str12$, $list16, NIL );
    utilities_macros.register_cyc_api_function( $sym26$NL_INTERP_SPEC_RETURN_PHRASE_TYPES_, $list15, $str12$, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym28$NL_INTERP_SPEC_REQUEST_HEAD_INFLECTIONS, $list15, $str12$, $list16, NIL );
    utilities_macros.register_cyc_api_function( $sym29$NL_INTERP_SPEC_RETURN_HEAD_INFLECTIONS_, $list15, $str12$, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym30$NL_INTERP_SPEC_REQUEST_PRAGMATICS, $list15, $str12$, $list16, NIL );
    utilities_macros.register_cyc_api_function( $sym31$NL_INTERP_SPEC_RETURN_PRAGMATICS_, $list15, $str12$, NIL, NIL );
    access_macros.register_external_symbol( $sym32$NEW_NL_INTERPRETATION );
    utilities_macros.register_cyc_api_function( $sym33$NL_INTERPRETATION_P, $list34, $str12$, NIL, $list13 );
    utilities_macros.register_cyc_api_macro( $sym37$SET_NL_INTERP_CYCL, $list35, $str38$set_the_CycL_value_for_INTERP_to_ );
    utilities_macros.register_cyc_api_function( $sym39$GET_NL_INTERP_CYCL, $list40, $str41$Returns_the_CycL_currently_specif, $list42, $list43 );
    utilities_macros.register_cyc_api_macro( $sym45$SET_NL_INTERP_PRAGMATICS, $list44, $str46$set_the_pragmatic_features_for_IN );
    utilities_macros.register_cyc_api_function( $sym47$GET_NL_INTERP_PRAGMATICS, $list40, $str48$Returns_the_pragmatic_features_sp, $list42, $list49 );
    utilities_macros.register_cyc_api_macro( $sym51$SET_NL_INTERP_WEIGHT, $list50, $str52$set_the_weight_for_INTERP_to_WEIG );
    utilities_macros.register_cyc_api_function( $sym53$GET_NL_INTERP_WEIGHT, $list40, $str54$Returns_the_weight_currently_spec, $list42, $list55 );
    utilities_macros.register_cyc_api_macro( $sym57$SET_NL_INTERP_JUSTIFICATION, $list56, $str58$set_the_justification_for_INTERP_ );
    utilities_macros.register_cyc_api_function( $sym59$GET_NL_INTERP_JUSTIFICATION, $list40, $str60$Returns_the_justification_current, $list42, $list61 );
    utilities_macros.register_cyc_api_macro( $sym63$SET_NL_INTERP_PHRASE_TYPES, $list62, $str64$set_the_phrase_types_for_INTERP_t );
    utilities_macros.register_cyc_api_macro( $sym67$ADD_NL_INTERP_PHRASE_TYPE, $list65, $str68$add_PHRASE_TYPES_to_the_phrase_ty );
    utilities_macros.register_cyc_api_function( $sym69$GET_NL_INTERP_PHRASE_TYPES, $list40, $str70$Returns_the_phrase_types_currentl, $list42, $list71 );
    utilities_macros.register_cyc_api_macro( $sym73$SET_NL_INTERP_HEAD_INFLECTIONS, $list72, $str74$set_the_inflections__speech_part_ );
    utilities_macros.register_cyc_api_function( $sym75$GET_NL_INTERP_HEAD_INFLECTIONS, $list40, $str76$returns_the_inflections_predicate, $list42, $list71 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nl_api_datastructures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nl_api_datastructures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nl_api_datastructures_file();
  }
  static
  {
    me = new nl_api_datastructures();
    $sym0$NEW_NL_OUTPUT_SPEC = makeSymbol( "NEW-NL-OUTPUT-SPEC" );
    $sym1$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym2$NL_INTERPRETATION_SPEC_P = makeSymbol( "NL-INTERPRETATION-SPEC-P" );
    $kw3$SUBL = makeKeyword( "SUBL" );
    $kw4$XML = makeKeyword( "XML" );
    $kw5$CYCL = makeKeyword( "CYCL" );
    $kw6$PRAGMATICS = makeKeyword( "PRAGMATICS" );
    $sym7$NEW_NL_INTERPRETATION_SPEC = makeSymbol( "NEW-NL-INTERPRETATION-SPEC" );
    $list8 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "PLIST" ) );
    $str9$construct_a_new_default_NL_interp = makeString(
        "construct a new default NL interpretation specification.  By default, the interpretation-spec will direct\n   the parsers to return only the CycL of the interpretation" );
    $list10 = ConsesLow.list( makeSymbol( "NL-INTERPRETATION-SPEC-P" ) );
    $list11 = ConsesLow.list( makeSymbol( "OBJ" ) );
    $str12$ = makeString( "" );
    $list13 = ConsesLow.list( makeSymbol( "BOOLEAN" ) );
    $sym14$NL_INTERP_SPEC_REQUEST_CYCL = makeSymbol( "NL-INTERP-SPEC-REQUEST-CYCL" );
    $list15 = ConsesLow.list( makeSymbol( "INTERP-SPEC" ) );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "INTERP-SPEC" ), makeSymbol( "NL-INTERPRETATION-SPEC-P" ) ) );
    $sym17$NL_INTERP_SPEC_RETURN_CYCL_ = makeSymbol( "NL-INTERP-SPEC-RETURN-CYCL?" );
    $kw18$WEIGHT = makeKeyword( "WEIGHT" );
    $sym19$NL_INTERP_SPEC_REQUEST_WEIGHT = makeSymbol( "NL-INTERP-SPEC-REQUEST-WEIGHT" );
    $sym20$NL_INTERP_SPEC_RETURN_WEIGHT_ = makeSymbol( "NL-INTERP-SPEC-RETURN-WEIGHT?" );
    $kw21$JUSTIFICATION = makeKeyword( "JUSTIFICATION" );
    $sym22$NL_INTERP_SPEC_REQUEST_JUSTIFICATION = makeSymbol( "NL-INTERP-SPEC-REQUEST-JUSTIFICATION" );
    $sym23$NL_INTERP_SPEC_RETURN_JUSTIFICATION_ = makeSymbol( "NL-INTERP-SPEC-RETURN-JUSTIFICATION?" );
    $kw24$PHRASE_TYPES = makeKeyword( "PHRASE-TYPES" );
    $sym25$NL_INTERP_SPEC_REQUEST_PHRASE_TYPES = makeSymbol( "NL-INTERP-SPEC-REQUEST-PHRASE-TYPES" );
    $sym26$NL_INTERP_SPEC_RETURN_PHRASE_TYPES_ = makeSymbol( "NL-INTERP-SPEC-RETURN-PHRASE-TYPES?" );
    $kw27$INFLECTIONS = makeKeyword( "INFLECTIONS" );
    $sym28$NL_INTERP_SPEC_REQUEST_HEAD_INFLECTIONS = makeSymbol( "NL-INTERP-SPEC-REQUEST-HEAD-INFLECTIONS" );
    $sym29$NL_INTERP_SPEC_RETURN_HEAD_INFLECTIONS_ = makeSymbol( "NL-INTERP-SPEC-RETURN-HEAD-INFLECTIONS?" );
    $sym30$NL_INTERP_SPEC_REQUEST_PRAGMATICS = makeSymbol( "NL-INTERP-SPEC-REQUEST-PRAGMATICS" );
    $sym31$NL_INTERP_SPEC_RETURN_PRAGMATICS_ = makeSymbol( "NL-INTERP-SPEC-RETURN-PRAGMATICS?" );
    $sym32$NEW_NL_INTERPRETATION = makeSymbol( "NEW-NL-INTERPRETATION" );
    $sym33$NL_INTERPRETATION_P = makeSymbol( "NL-INTERPRETATION-P" );
    $list34 = ConsesLow.list( makeSymbol( "ITEM" ) );
    $list35 = ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "CYCL" ) );
    $sym36$PLIST_ENTER = makeSymbol( "PLIST-ENTER" );
    $sym37$SET_NL_INTERP_CYCL = makeSymbol( "SET-NL-INTERP-CYCL" );
    $str38$set_the_CycL_value_for_INTERP_to_ = makeString( "set the CycL value for INTERP to CYCL" );
    $sym39$GET_NL_INTERP_CYCL = makeSymbol( "GET-NL-INTERP-CYCL" );
    $list40 = ConsesLow.list( makeSymbol( "INTERP" ) );
    $str41$Returns_the_CycL_currently_specif = makeString( "Returns the CycL currently specified on INTERP" );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "NL-INTERPRETATION-P" ) ) );
    $list43 = ConsesLow.list( makeSymbol( "CYCL-FORMULA-P" ) );
    $list44 = ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "VALUE" ) );
    $sym45$SET_NL_INTERP_PRAGMATICS = makeSymbol( "SET-NL-INTERP-PRAGMATICS" );
    $str46$set_the_pragmatic_features_for_IN = makeString( "set the pragmatic features for INTERP to VALUE" );
    $sym47$GET_NL_INTERP_PRAGMATICS = makeSymbol( "GET-NL-INTERP-PRAGMATICS" );
    $str48$Returns_the_pragmatic_features_sp = makeString( "Returns the pragmatic features specified for INTERP, which are each of the form\n   (PRAGMATIC-FEATURE MT)" );
    $list49 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $list50 = ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "WEIGHT" ) );
    $sym51$SET_NL_INTERP_WEIGHT = makeSymbol( "SET-NL-INTERP-WEIGHT" );
    $str52$set_the_weight_for_INTERP_to_WEIG = makeString( "set the weight for INTERP to WEIGHT" );
    $sym53$GET_NL_INTERP_WEIGHT = makeSymbol( "GET-NL-INTERP-WEIGHT" );
    $str54$Returns_the_weight_currently_spec = makeString( "Returns the weight currently specified on INTERP" );
    $list55 = ConsesLow.list( makeSymbol( "NUMBER-P" ) );
    $list56 = ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "JUSTIFICATION" ) );
    $sym57$SET_NL_INTERP_JUSTIFICATION = makeSymbol( "SET-NL-INTERP-JUSTIFICATION" );
    $str58$set_the_justification_for_INTERP_ = makeString( "set the justification for INTERP to JUSTIFICATION" );
    $sym59$GET_NL_INTERP_JUSTIFICATION = makeSymbol( "GET-NL-INTERP-JUSTIFICATION" );
    $str60$Returns_the_justification_current = makeString( "Returns the justification currently specified on INTERP" );
    $list61 = ConsesLow.list( makeSymbol( "NL-JUSTIFICATION-P" ) );
    $list62 = ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "PHRASE-TYPES" ) );
    $sym63$SET_NL_INTERP_PHRASE_TYPES = makeSymbol( "SET-NL-INTERP-PHRASE-TYPES" );
    $str64$set_the_phrase_types_for_INTERP_t = makeString( "set the phrase-types for INTERP to PHRASE-TYPES" );
    $list65 = ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "PHRASE-TYPE" ) );
    $sym66$PUTF = makeSymbol( "PUTF" );
    $sym67$ADD_NL_INTERP_PHRASE_TYPE = makeSymbol( "ADD-NL-INTERP-PHRASE-TYPE" );
    $str68$add_PHRASE_TYPES_to_the_phrase_ty = makeString( "add PHRASE-TYPES to the phrase-types for INTERP" );
    $sym69$GET_NL_INTERP_PHRASE_TYPES = makeSymbol( "GET-NL-INTERP-PHRASE-TYPES" );
    $str70$Returns_the_phrase_types_currentl = makeString( "Returns the phrase-types currently specified on INTERP" );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "CYCL-TERM-P" ) ) );
    $list72 = ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "INFLECTIONS" ) );
    $sym73$SET_NL_INTERP_HEAD_INFLECTIONS = makeSymbol( "SET-NL-INTERP-HEAD-INFLECTIONS" );
    $str74$set_the_inflections__speech_part_ = makeString( "set the inflections (speech-part-predicates) for INTERP to INFLECTIONS" );
    $sym75$GET_NL_INTERP_HEAD_INFLECTIONS = makeSymbol( "GET-NL-INTERP-HEAD-INFLECTIONS" );
    $str76$returns_the_inflections_predicate = makeString( "returns the inflections predicates that are used in the head word for this interpretation" );
    $str77$NLInterpretation = makeString( "NLInterpretation" );
    $kw78$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str79$Cycl = makeString( "Cycl" );
    $str80$Weight = makeString( "Weight" );
    $str81$PhraseType = makeString( "PhraseType" );
    $str82$HeadInflection = makeString( "HeadInflection" );
    $str83$justification = makeString( "justification" );
    $str84$status = makeString( "status" );
    $str85$unimplemented = makeString( "unimplemented" );
  }
}
/*
 * 
 * Total time: 331 ms
 * 
 */