package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subl_extensions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subl_extensions";
  public static final String myFingerPrint = "8ecafa9f2443f789b25a2d3969ac2a92aa70987f28a10395b43fe63cfb17b3f1";
  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLSymbol $dtp_structure_info$;
  private static final SubLSymbol $sym0$STRUCTURE_INFO;
  private static final SubLSymbol $sym1$STRUCTURE_INFO_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$STRUCTURE_INFO_TYPE_NAME;
  private static final SubLSymbol $sym10$_CSETF_STRUCTURE_INFO_TYPE_NAME;
  private static final SubLSymbol $sym11$STRUCTURE_INFO_SLOT_LIST;
  private static final SubLSymbol $sym12$_CSETF_STRUCTURE_INFO_SLOT_LIST;
  private static final SubLSymbol $sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS;
  private static final SubLSymbol $sym14$_CSETF_STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS;
  private static final SubLSymbol $sym15$STRUCTURE_INFO_PLIST;
  private static final SubLSymbol $sym16$_CSETF_STRUCTURE_INFO_PLIST;
  private static final SubLSymbol $kw17$TYPE_NAME;
  private static final SubLSymbol $kw18$SLOT_LIST;
  private static final SubLSymbol $kw19$ACCESSOR_ASSOCIATIONS;
  private static final SubLSymbol $kw20$PLIST;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_STRUCTURE_INFO;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_STRUCTURE_INFO_METHOD;
  private static final SubLString $str27$__Description_of__S_Structure_Ins;
  private static final SubLList $list28;
  private static final SubLString $str29$_____S_____S;
  private static final SubLString $str30$__End_of_Description_;
  private static final SubLString $str31$_STRUCTURE_INFO_FOR_;
  private static final SubLString $str32$_DEFSTRUCT_;
  private static final SubLString $str33$CREATE_NEW_;
  private static final SubLString $str34$_HAS_SLOT_P;
  private static final SubLString $str35$SET_;
  private static final SubLSymbol $sym36$DEFINE_PROTECTED;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$CSETF;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLString $str42$DEFINE_STRUCTURE___S_is_not_a_val;
  private static final SubLSymbol $kw43$CONC_NAME;
  private static final SubLString $str44$SYSTEM_PRIVATE_STRUCTURE_INFO;
  private static final SubLString $str45$_;
  private static final SubLString $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO;
  private static final SubLSymbol $sym47$PROGN;
  private static final SubLSymbol $sym48$DEFPARAMETER_PUBLIC;
  private static final SubLSymbol $sym49$CREATE_STRUCTURE_INFO;
  private static final SubLSymbol $sym50$QUOTE;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$DEFSTRUCT;
  private static final SubLSymbol $sym53$SYSTEM_PRIVATE_STRUCTURE_INFO;
  private static final SubLSymbol $sym54$DEFINE_PUBLIC;
  private static final SubLSymbol $sym55$CLET;
  private static final SubLSymbol $sym56$NEW_INSTANCE;
  private static final SubLString $str57$MAKE_;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$RET;
  private static final SubLSymbol $sym62$FIF;
  private static final SubLSymbol $sym63$MEMBER;
  private static final SubLSymbol $sym64$SLOT_NAME;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLString $str67$GET_;
  private static final SubLString $str68$_SLOT;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$ASSOCIATION;
  private static final SubLSymbol $sym71$ASSOC;
  private static final SubLSymbol $sym72$SLOT;
  private static final SubLSymbol $sym73$PUNLESS;
  private static final SubLSymbol $sym74$WARN;
  private static final SubLString $str75$Structures_of_type__S_have_no__S_;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$FUNCALL;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLString $str82$DESCRIBE_;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$DESCRIBE_STRUCTURE;
  private static final SubLSymbol $sym85$STREAM;
  private static final SubLList $list86;

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject structure_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject structure_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $structure_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject structure_info_type_name(final SubLObject v_object)
  {
    assert NIL != structure_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject structure_info_slot_list(final SubLObject v_object)
  {
    assert NIL != structure_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject structure_info_accessor_associations(final SubLObject v_object)
  {
    assert NIL != structure_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject structure_info_plist(final SubLObject v_object)
  {
    assert NIL != structure_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject _csetf_structure_info_type_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != structure_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject _csetf_structure_info_slot_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != structure_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject _csetf_structure_info_accessor_associations(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != structure_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject _csetf_structure_info_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != structure_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject make_structure_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $structure_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$TYPE_NAME ) )
      {
        _csetf_structure_info_type_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$SLOT_LIST ) )
      {
        _csetf_structure_info_slot_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$ACCESSOR_ASSOCIATIONS ) )
      {
        _csetf_structure_info_accessor_associations( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$PLIST ) )
      {
        _csetf_structure_info_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject visit_defstruct_structure_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_STRUCTURE_INFO, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$TYPE_NAME, structure_info_type_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$SLOT_LIST, structure_info_slot_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$ACCESSOR_ASSOCIATIONS, structure_info_accessor_associations( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$PLIST, structure_info_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_STRUCTURE_INFO, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
  public static SubLObject visit_defstruct_object_structure_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_structure_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2539L)
  public static SubLObject create_structure_info(final SubLObject type_name, final SubLObject slot_list, final SubLObject associations, final SubLObject plist)
  {
    final SubLObject structure_info_instance = make_structure_info( UNPROVIDED );
    _csetf_structure_info_type_name( structure_info_instance, type_name );
    _csetf_structure_info_slot_list( structure_info_instance, conses_high.copy_list( slot_list ) );
    _csetf_structure_info_accessor_associations( structure_info_instance, conses_high.copy_tree( associations ) );
    _csetf_structure_info_plist( structure_info_instance, plist );
    return structure_info_instance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 3370L)
  public static SubLObject describe_structure(final SubLObject stream, final SubLObject info, final SubLObject structure)
  {
    final SubLObject accessor_associations = structure_info_accessor_associations( info );
    PrintLow.format( stream, $str27$__Description_of__S_Structure_Ins, structure_info_type_name( info ), structure );
    SubLObject cdolist_list_var = accessor_associations;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject slot_name = NIL;
      SubLObject accessors_pair = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
      slot_name = current.first();
      current = ( accessors_pair = current.rest() );
      PrintLow.format( stream, $str29$_____S_____S, slot_name, Functions.funcall( accessors_pair.first(), structure ) );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    PrintLow.format( stream, $str30$__End_of_Description_ );
    return structure;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 4118L)
  public static SubLObject subl_extensions_generate_var_name(final SubLObject type_name)
  {
    return Packages.intern( Sequences.cconcatenate( $str31$_STRUCTURE_INFO_FOR_, new SubLObject[] { format_nil.format_nil_s_no_copy( type_name ), $str32$_DEFSTRUCT_
    } ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 4369L)
  public static SubLObject subl_extensions_generate_defstruct_constructor(final SubLObject type_name)
  {
    return Packages.intern( Sequences.cconcatenate( $str33$CREATE_NEW_, format_nil.format_nil_s_no_copy( type_name ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 4614L)
  public static SubLObject subl_extensions_generate_has_slot_predicate_name(final SubLObject type_name)
  {
    return Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( type_name ), $str34$_HAS_SLOT_P ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 4901L)
  public static SubLObject subl_extensions_generate_accessor_associations(final SubLObject conc_name, final SubLObject slot_list)
  {
    SubLObject getter_alist = NIL;
    if( NIL == slot_list )
    {
      getter_alist = NIL;
    }
    else if( slot_list.isAtom() )
    {
      getter_alist = ConsesLow.list( slot_list );
    }
    else if( NIL == slot_list.rest() )
    {
      final SubLObject slot_name = slot_list.first();
      getter_alist = ConsesLow.list( ConsesLow.listS( slot_name, Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( conc_name ), format_nil.format_nil_s_no_copy( slot_name ) ), UNPROVIDED ),
          Packages.intern( Sequences.cconcatenate( $str35$SET_, new SubLObject[]
          { format_nil.format_nil_s_no_copy( conc_name ), format_nil.format_nil_s_no_copy( slot_name )
          } ), UNPROVIDED ) ) );
    }
    else
    {
      SubLObject tail_cons = NIL;
      SubLObject result = NIL;
      final SubLObject slot_name2 = slot_list.first();
      getter_alist = ( tail_cons = ConsesLow.list( ConsesLow.listS( slot_name2, Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( conc_name ), format_nil.format_nil_s_no_copy( slot_name2 ) ),
          UNPROVIDED ), Packages.intern( Sequences.cconcatenate( $str35$SET_, new SubLObject[]
          { format_nil.format_nil_s_no_copy( conc_name ), format_nil.format_nil_s_no_copy( slot_name2 )
      } ), UNPROVIDED ) ) ) );
      SubLObject cdolist_list_var = slot_list.rest();
      SubLObject slot_name3 = NIL;
      slot_name3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.list( ConsesLow.listS( slot_name3, Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( conc_name ), format_nil.format_nil_s_no_copy( slot_name3 ) ), UNPROVIDED ), Packages
            .intern( Sequences.cconcatenate( $str35$SET_, new SubLObject[]
            { format_nil.format_nil_s_no_copy( conc_name ), format_nil.format_nil_s_no_copy( slot_name3 )
        } ), UNPROVIDED ) ) );
        ConsesLow.rplacd( tail_cons, result );
        tail_cons = result;
        cdolist_list_var = cdolist_list_var.rest();
        slot_name3 = cdolist_list_var.first();
      }
    }
    return getter_alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 5552L)
  public static SubLObject subl_extensions_generate_setters(final SubLObject conc_name, final SubLObject slot_list)
  {
    SubLObject setters = NIL;
    SubLObject cdolist_list_var = slot_list;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      setters = ConsesLow.cons( ConsesLow.listS( $sym36$DEFINE_PROTECTED, Packages.intern( Sequences.cconcatenate( $str35$SET_, new SubLObject[] { format_nil.format_nil_s_no_copy( conc_name ), format_nil
          .format_nil_s_no_copy( slot )
      } ), UNPROVIDED ), $list37, ConsesLow.listS( $sym38$CSETF, reader.bq_cons( Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( conc_name ), format_nil.format_nil_s_no_copy( slot ) ),
          UNPROVIDED ), $list39 ), $list40 ), $list41 ), setters );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return Sequences.nreverse( setters );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 6116L)
  public static SubLObject expand_define_structure(final SubLObject head, final SubLObject v_slots)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject type_name = head.isCons() ? head.first() : head;
    SubLObject slot_list = NIL;
    if( NIL == v_slots )
    {
      slot_list = NIL;
    }
    else if( v_slots.isAtom() )
    {
      slot_list = ConsesLow.list( v_slots );
    }
    else if( NIL == v_slots.rest() )
    {
      final SubLObject slot_decl = v_slots.first();
      slot_list = ConsesLow.list( slot_decl.isCons() ? slot_decl.first() : slot_decl );
    }
    else
    {
      SubLObject tail_cons = NIL;
      SubLObject result = NIL;
      final SubLObject slot_decl2 = v_slots.first();
      slot_list = ( tail_cons = ConsesLow.list( slot_decl2.isCons() ? slot_decl2.first() : slot_decl2 ) );
      SubLObject cdolist_list_var = v_slots.rest();
      SubLObject slot_decl3 = NIL;
      slot_decl3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.list( slot_decl3.isCons() ? slot_decl3.first() : slot_decl3 );
        ConsesLow.rplacd( tail_cons, result );
        tail_cons = result;
        cdolist_list_var = cdolist_list_var.rest();
        slot_decl3 = cdolist_list_var.first();
      }
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == type_name || !type_name.isSymbol() ) )
    {
      Errors.error( $str42$DEFINE_STRUCTURE___S_is_not_a_val, type_name );
    }
    final SubLObject var_name = subl_extensions_generate_var_name( type_name );
    final SubLObject has_slot_predicate_name = subl_extensions_generate_has_slot_predicate_name( type_name );
    SubLObject accessor_name = NIL;
    SubLObject accessor_associations = NIL;
    SubLObject conc_name = NIL;
    if( head.isCons() )
    {
      final SubLObject conc_name_association = conses_high.assoc( $kw43$CONC_NAME, head.rest(), UNPROVIDED, UNPROVIDED );
      if( NIL != conc_name_association )
      {
        conc_name = conses_high.cadr( conc_name_association );
        accessor_name = Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( conc_name ), $str44$SYSTEM_PRIVATE_STRUCTURE_INFO ), UNPROVIDED );
        accessor_associations = subl_extensions_generate_accessor_associations( conc_name, slot_list );
      }
      else
      {
        conc_name = Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( type_name ), $str45$_ ), UNPROVIDED );
        accessor_name = Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( type_name ), $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO ), UNPROVIDED );
        accessor_associations = subl_extensions_generate_accessor_associations( Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( type_name ), $str45$_ ), UNPROVIDED ), slot_list );
      }
    }
    else
    {
      accessor_name = Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( type_name ), $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO ), UNPROVIDED );
      accessor_associations = subl_extensions_generate_accessor_associations( Packages.intern( Sequences.cconcatenate( format_nil.format_nil_s_no_copy( type_name ), $str45$_ ), UNPROVIDED ), slot_list );
    }
    return ConsesLow.listS( $sym47$PROGN, ConsesLow.list( $sym48$DEFPARAMETER_PUBLIC, var_name, ConsesLow.listS( $sym49$CREATE_STRUCTURE_INFO, ConsesLow.list( $sym50$QUOTE, type_name ), ConsesLow.list( $sym50$QUOTE,
        slot_list ), ConsesLow.list( $sym50$QUOTE, accessor_associations ), $list51 ) ), ConsesLow.listS( $sym52$DEFSTRUCT, conses_high.copy_tree( head ), $sym53$SYSTEM_PRIVATE_STRUCTURE_INFO, conses_high.copy_tree(
            v_slots ) ), ConsesLow.append( subl_extensions_generate_setters( conc_name, slot_list ), ConsesLow.list( ConsesLow.list( $sym54$DEFINE_PUBLIC, subl_extensions_generate_defstruct_constructor( type_name ), NIL,
                ConsesLow.listS( $sym55$CLET, ConsesLow.list( ConsesLow.list( $sym56$NEW_INSTANCE, ConsesLow.list( Packages.intern( Sequences.cconcatenate( $str57$MAKE_, format_nil.format_nil_s_no_copy( type_name ) ),
                    UNPROVIDED ) ) ) ), ConsesLow.list( $sym38$CSETF, reader.bq_cons( accessor_name, $list58 ), var_name ), $list59 ) ), ConsesLow.list( $sym54$DEFINE_PUBLIC, has_slot_predicate_name, $list60, ConsesLow
                        .list( $sym61$RET, ConsesLow.listS( $sym62$FIF, ConsesLow.list( $sym63$MEMBER, $sym64$SLOT_NAME, ConsesLow.list( $sym11$STRUCTURE_INFO_SLOT_LIST, reader.bq_cons( accessor_name, $list65 ) ) ),
                            $list66 ) ) ), ConsesLow.list( $sym54$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( $str67$GET_, new SubLObject[]
                            { format_nil.format_nil_s_no_copy( type_name ), $str68$_SLOT
    } ), UNPROVIDED ), reader.bq_cons( type_name, $list69 ), ConsesLow.list( $sym55$CLET, ConsesLow.list( ConsesLow.list( $sym70$ASSOCIATION, ConsesLow.list( $sym71$ASSOC, $sym72$SLOT, ConsesLow.list(
        $sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, ConsesLow.list( accessor_name, type_name ) ) ) ) ), ConsesLow.listS( $sym73$PUNLESS, $sym70$ASSOCIATION, ConsesLow.listS( $sym74$WARN,
            $str75$Structures_of_type__S_have_no__S_, ConsesLow.list( $sym50$QUOTE, type_name ), $list76 ), $list77 ), ConsesLow.list( $sym61$RET, ConsesLow.list( $sym78$FUNCALL, $list79, type_name ) ) ) ), ConsesLow
                .list( $sym54$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( $str35$SET_, new SubLObject[]
                { format_nil.format_nil_s_no_copy( type_name ), $str68$_SLOT
    } ), UNPROVIDED ), reader.bq_cons( type_name, $list80 ), ConsesLow.list( $sym55$CLET, ConsesLow.list( ConsesLow.list( $sym70$ASSOCIATION, ConsesLow.list( $sym71$ASSOC, $sym72$SLOT, ConsesLow.list(
        $sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, ConsesLow.list( accessor_name, type_name ) ) ) ) ), ConsesLow.listS( $sym73$PUNLESS, $sym70$ASSOCIATION, ConsesLow.listS( $sym74$WARN,
            $str75$Structures_of_type__S_have_no__S_, ConsesLow.list( $sym50$QUOTE, type_name ), $list76 ), $list77 ), ConsesLow.list( $sym61$RET, ConsesLow.listS( $sym78$FUNCALL, $list81, type_name, $list40 ) ) ) ),
                ConsesLow.list( $sym54$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( $str82$DESCRIBE_, format_nil.format_nil_s_no_copy( type_name ) ), UNPROVIDED ), reader.bq_cons( type_name, $list83 ),
                    ConsesLow.list( $sym61$RET, ConsesLow.list( $sym84$DESCRIBE_STRUCTURE, $sym85$STREAM, ConsesLow.list( accessor_name, type_name ), type_name ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 9436L)
  public static SubLObject define_structure(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject head = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    head = current.first();
    final SubLObject v_slots;
    current = ( v_slots = current.rest() );
    return expand_define_structure( head, v_slots );
  }

  public static SubLObject declare_subl_extensions_file()
  {
    SubLFiles.declareFunction( me, "structure_info_print_function_trampoline", "STRUCTURE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "structure_info_p", "STRUCTURE-INFO-P", 1, 0, false );
    new $structure_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "structure_info_type_name", "STRUCTURE-INFO-TYPE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "structure_info_slot_list", "STRUCTURE-INFO-SLOT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "structure_info_accessor_associations", "STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "structure_info_plist", "STRUCTURE-INFO-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_structure_info_type_name", "_CSETF-STRUCTURE-INFO-TYPE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_structure_info_slot_list", "_CSETF-STRUCTURE-INFO-SLOT-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_structure_info_accessor_associations", "_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_structure_info_plist", "_CSETF-STRUCTURE-INFO-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_structure_info", "MAKE-STRUCTURE-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_structure_info", "VISIT-DEFSTRUCT-STRUCTURE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_structure_info_method", "VISIT-DEFSTRUCT-OBJECT-STRUCTURE-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "create_structure_info", "CREATE-STRUCTURE-INFO", 4, 0, false );
    SubLFiles.declareFunction( me, "describe_structure", "DESCRIBE-STRUCTURE", 3, 0, false );
    SubLFiles.declareFunction( me, "subl_extensions_generate_var_name", "SUBL-EXTENSIONS-GENERATE-VAR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_extensions_generate_defstruct_constructor", "SUBL-EXTENSIONS-GENERATE-DEFSTRUCT-CONSTRUCTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_extensions_generate_has_slot_predicate_name", "SUBL-EXTENSIONS-GENERATE-HAS-SLOT-PREDICATE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_extensions_generate_accessor_associations", "SUBL-EXTENSIONS-GENERATE-ACCESSOR-ASSOCIATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "subl_extensions_generate_setters", "SUBL-EXTENSIONS-GENERATE-SETTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_define_structure", "EXPAND-DEFINE-STRUCTURE", 2, 0, false );
    SubLFiles.declareMacro( me, "define_structure", "DEFINE-STRUCTURE" );
    return NIL;
  }

  public static SubLObject init_subl_extensions_file()
  {
    $dtp_structure_info$ = SubLFiles.defconstant( "*DTP-STRUCTURE-INFO*", $sym0$STRUCTURE_INFO );
    return NIL;
  }

  public static SubLObject setup_subl_extensions_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_structure_info$.getGlobalValue(), Symbols.symbol_function( $sym7$STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$STRUCTURE_INFO_TYPE_NAME, $sym10$_CSETF_STRUCTURE_INFO_TYPE_NAME );
    Structures.def_csetf( $sym11$STRUCTURE_INFO_SLOT_LIST, $sym12$_CSETF_STRUCTURE_INFO_SLOT_LIST );
    Structures.def_csetf( $sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, $sym14$_CSETF_STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS );
    Structures.def_csetf( $sym15$STRUCTURE_INFO_PLIST, $sym16$_CSETF_STRUCTURE_INFO_PLIST );
    Equality.identity( $sym0$STRUCTURE_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_structure_info$.getGlobalValue(), Symbols.symbol_function( $sym26$VISIT_DEFSTRUCT_OBJECT_STRUCTURE_INFO_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subl_extensions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subl_extensions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subl_extensions_file();
  }
  static
  {
    me = new subl_extensions();
    $dtp_structure_info$ = null;
    $sym0$STRUCTURE_INFO = makeSymbol( "STRUCTURE-INFO" );
    $sym1$STRUCTURE_INFO_P = makeSymbol( "STRUCTURE-INFO-P" );
    $list2 = ConsesLow.list( makeSymbol( "TYPE-NAME" ), makeSymbol( "SLOT-LIST" ), makeSymbol( "ACCESSOR-ASSOCIATIONS" ), makeSymbol( "PLIST" ) );
    $list3 = ConsesLow.list( makeKeyword( "TYPE-NAME" ), makeKeyword( "SLOT-LIST" ), makeKeyword( "ACCESSOR-ASSOCIATIONS" ), makeKeyword( "PLIST" ) );
    $list4 = ConsesLow.list( makeSymbol( "STRUCTURE-INFO-TYPE-NAME" ), makeSymbol( "STRUCTURE-INFO-SLOT-LIST" ), makeSymbol( "STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS" ), makeSymbol( "STRUCTURE-INFO-PLIST" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-STRUCTURE-INFO-TYPE-NAME" ), makeSymbol( "_CSETF-STRUCTURE-INFO-SLOT-LIST" ), makeSymbol( "_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS" ), makeSymbol(
        "_CSETF-STRUCTURE-INFO-PLIST" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "STRUCTURE-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "STRUCTURE-INFO-P" ) );
    $sym9$STRUCTURE_INFO_TYPE_NAME = makeSymbol( "STRUCTURE-INFO-TYPE-NAME" );
    $sym10$_CSETF_STRUCTURE_INFO_TYPE_NAME = makeSymbol( "_CSETF-STRUCTURE-INFO-TYPE-NAME" );
    $sym11$STRUCTURE_INFO_SLOT_LIST = makeSymbol( "STRUCTURE-INFO-SLOT-LIST" );
    $sym12$_CSETF_STRUCTURE_INFO_SLOT_LIST = makeSymbol( "_CSETF-STRUCTURE-INFO-SLOT-LIST" );
    $sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS = makeSymbol( "STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS" );
    $sym14$_CSETF_STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS = makeSymbol( "_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS" );
    $sym15$STRUCTURE_INFO_PLIST = makeSymbol( "STRUCTURE-INFO-PLIST" );
    $sym16$_CSETF_STRUCTURE_INFO_PLIST = makeSymbol( "_CSETF-STRUCTURE-INFO-PLIST" );
    $kw17$TYPE_NAME = makeKeyword( "TYPE-NAME" );
    $kw18$SLOT_LIST = makeKeyword( "SLOT-LIST" );
    $kw19$ACCESSOR_ASSOCIATIONS = makeKeyword( "ACCESSOR-ASSOCIATIONS" );
    $kw20$PLIST = makeKeyword( "PLIST" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_STRUCTURE_INFO = makeSymbol( "MAKE-STRUCTURE-INFO" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_STRUCTURE_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-STRUCTURE-INFO-METHOD" );
    $str27$__Description_of__S_Structure_Ins = makeString( "~%Description of ~S Structure Instance ~S:" );
    $list28 = ConsesLow.cons( makeSymbol( "SLOT-NAME" ), makeSymbol( "ACCESSORS-PAIR" ) );
    $str29$_____S_____S = makeString( "~%  ~S -> ~S" );
    $str30$__End_of_Description_ = makeString( "~%End of Description." );
    $str31$_STRUCTURE_INFO_FOR_ = makeString( "*STRUCTURE-INFO-FOR-" );
    $str32$_DEFSTRUCT_ = makeString( "-DEFSTRUCT*" );
    $str33$CREATE_NEW_ = makeString( "CREATE-NEW-" );
    $str34$_HAS_SLOT_P = makeString( "-HAS-SLOT-P" );
    $str35$SET_ = makeString( "SET-" );
    $sym36$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $list37 = ConsesLow.list( makeSymbol( "STRUCT-OBJECT" ), makeSymbol( "NEW-VALUE" ) );
    $sym38$CSETF = makeSymbol( "CSETF" );
    $list39 = ConsesLow.list( makeSymbol( "STRUCT-OBJECT" ) );
    $list40 = ConsesLow.list( makeSymbol( "NEW-VALUE" ) );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-VALUE" ) ) );
    $str42$DEFINE_STRUCTURE___S_is_not_a_val = makeString( "DEFINE-STRUCTURE: ~S is not a valid structure type name." );
    $kw43$CONC_NAME = makeKeyword( "CONC-NAME" );
    $str44$SYSTEM_PRIVATE_STRUCTURE_INFO = makeString( "SYSTEM-PRIVATE-STRUCTURE-INFO" );
    $str45$_ = makeString( "-" );
    $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO = makeString( "-SYSTEM-PRIVATE-STRUCTURE-INFO" );
    $sym47$PROGN = makeSymbol( "PROGN" );
    $sym48$DEFPARAMETER_PUBLIC = makeSymbol( "DEFPARAMETER-PUBLIC" );
    $sym49$CREATE_STRUCTURE_INFO = makeSymbol( "CREATE-STRUCTURE-INFO" );
    $sym50$QUOTE = makeSymbol( "QUOTE" );
    $list51 = ConsesLow.list( NIL );
    $sym52$DEFSTRUCT = makeSymbol( "DEFSTRUCT" );
    $sym53$SYSTEM_PRIVATE_STRUCTURE_INFO = makeSymbol( "SYSTEM-PRIVATE-STRUCTURE-INFO" );
    $sym54$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym55$CLET = makeSymbol( "CLET" );
    $sym56$NEW_INSTANCE = makeSymbol( "NEW-INSTANCE" );
    $str57$MAKE_ = makeString( "MAKE-" );
    $list58 = ConsesLow.list( makeSymbol( "NEW-INSTANCE" ) );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-INSTANCE" ) ) );
    $list60 = ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol( "SLOT-NAME" ) );
    $sym61$RET = makeSymbol( "RET" );
    $sym62$FIF = makeSymbol( "FIF" );
    $sym63$MEMBER = makeSymbol( "MEMBER" );
    $sym64$SLOT_NAME = makeSymbol( "SLOT-NAME" );
    $list65 = ConsesLow.list( makeSymbol( "INSTANCE" ) );
    $list66 = ConsesLow.list( T, NIL );
    $str67$GET_ = makeString( "GET-" );
    $str68$_SLOT = makeString( "-SLOT" );
    $list69 = ConsesLow.list( makeSymbol( "SLOT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DEFAULT" ), NIL ) );
    $sym70$ASSOCIATION = makeSymbol( "ASSOCIATION" );
    $sym71$ASSOC = makeSymbol( "ASSOC" );
    $sym72$SLOT = makeSymbol( "SLOT" );
    $sym73$PUNLESS = makeSymbol( "PUNLESS" );
    $sym74$WARN = makeSymbol( "WARN" );
    $str75$Structures_of_type__S_have_no__S_ = makeString( "Structures of type ~S have no ~S slot." );
    $list76 = ConsesLow.list( makeSymbol( "SLOT" ) );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DEFAULT" ) ) );
    $sym78$FUNCALL = makeSymbol( "FUNCALL" );
    $list79 = ConsesLow.list( makeSymbol( "CADR" ), makeSymbol( "ASSOCIATION" ) );
    $list80 = ConsesLow.list( makeSymbol( "SLOT" ), makeSymbol( "NEW-VALUE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DEFAULT" ), NIL ) );
    $list81 = ConsesLow.list( makeSymbol( "CDDR" ), makeSymbol( "ASSOCIATION" ) );
    $str82$DESCRIBE_ = makeString( "DESCRIBE-" );
    $list83 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "*STANDARD-OUTPUT*" ) ) );
    $sym84$DESCRIBE_STRUCTURE = makeSymbol( "DESCRIBE-STRUCTURE" );
    $sym85$STREAM = makeSymbol( "STREAM" );
    $list86 = ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "&BODY" ), makeSymbol( "SLOTS" ) );
  }

  public static final class $structure_info_native
      extends
        SubLStructNative
  {
    public SubLObject $type_name;
    public SubLObject $slot_list;
    public SubLObject $accessor_associations;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $structure_info_native()
    {
      this.$type_name = CommonSymbols.NIL;
      this.$slot_list = CommonSymbols.NIL;
      this.$accessor_associations = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $structure_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$slot_list;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$accessor_associations;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$slot_list = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$accessor_associations = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $structure_info_native.class, $sym0$STRUCTURE_INFO, $sym1$STRUCTURE_INFO_P, $list2, $list3, new String[] { "$type_name", "$slot_list", "$accessor_associations",
        "$plist"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $structure_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $structure_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "STRUCTURE-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return structure_info_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 238 ms
 * 
 */