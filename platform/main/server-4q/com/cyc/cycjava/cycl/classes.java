package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class classes
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.classes";
  public static final String myFingerPrint = "ed0cf9dedb8f9588b9f318ace7157d360a2018d60e56c4b8061021ba3608f5c3";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 933L)
  public static SubLSymbol $classes_class_slot_access_violation$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1042L)
  private static SubLSymbol $classes_initial_hashtable_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1102L)
  private static SubLSymbol $classes_class_table_update_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1197L)
  private static SubLSymbol $classes_class_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1944L)
  private static SubLSymbol $classes_valid_class_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2075L)
  private static SubLSymbol $classes_valid_slot_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2831L)
  private static SubLSymbol $classes_valid_method_interface_types$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2938L)
  private static SubLSymbol $classes_valid_method_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3206L)
  private static SubLSymbol $classes_always_generate_before_listeners$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3527L)
  private static SubLSymbol $classes_always_generate_after_listeners$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13588L)
  private static SubLSymbol $classes_new_class_current$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43819L)
  public static SubLSymbol $curclass$;
  private static final SubLString $str0$Cannot_access__A_slot__S_from_cla;
  private static final SubLInteger $int1$800;
  private static final SubLString $str2$Class_Table_Update_Lock;
  private static final SubLSymbol $sym3$_CLASSES_CLASS_TABLE_;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_CLASSES_ALWAYS_GENERATE_BEFORE_LISTENERS_;
  private static final SubLSymbol $sym9$_CLASSES_ALWAYS_GENERATE_AFTER_LISTENERS_;
  private static final SubLSymbol $kw10$SLOT_LISTENERS;
  private static final SubLSymbol $kw11$VALUE;
  private static final SubLSymbol $kw12$AUTO_UPDATE;
  private static final SubLSymbol $kw13$NO_MEMBER_VARIABLES;
  private static final SubLSymbol $kw14$READ_ONLY;
  private static final SubLSymbol $kw15$BEFORE_LISTENERS;
  private static final SubLSymbol $kw16$AFTER_LISTENERS;
  private static final SubLSymbol $sym17$_OPTIONAL;
  private static final SubLSymbol $sym18$DEF_CLASS_METHOD;
  private static final SubLSymbol $sym19$DEF_INSTANCE_METHOD;
  private static final SubLString $str20$_S_is_an_invalid_class_declaratio;
  private static final SubLString $str21$_S_is_neither_a_valid_slot_nor_va;
  private static final SubLString $str22$__class_name_____S;
  private static final SubLString $str23$__parent_____S;
  private static final SubLString $str24$__subclasses_____S;
  private static final SubLString $str25$__interface_names_____S;
  private static final SubLString $str26$__interfaces_____S;
  private static final SubLString $str27$__compiled_inheritance_path_____S;
  private static final SubLString $str28$__instance_var_decls_____S;
  private static final SubLString $str29$__class_var_decls_____S;
  private static final SubLString $str30$__compiled_instance_slot_access_a;
  private static final SubLString $str31$__compiled_instance_boolean_slot_;
  private static final SubLString $str32$__compiled_class_slot_access_alis;
  private static final SubLString $str33$__compiled_class_boolean_slot_acc;
  private static final SubLString $str34$__slot_accessor_alist_____S;
  private static final SubLString $str35$__instance_method_decls_____S;
  private static final SubLString $str36$__class_method_decls_____S;
  private static final SubLString $str37$__boolean_slots_____S;
  private static final SubLString $str38$__any_slots_____S;
  private static final SubLString $str39$__compiled_instance_method_access;
  private static final SubLString $str40$__compiled_class_method_access_al;
  private static final SubLString $str41$__class_initialization_function__;
  private static final SubLString $str42$__class_initialized_p_____S;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$PROGN;
  private static final SubLSymbol $sym45$WITH_LOCK_HELD;
  private static final SubLSymbol $sym46$CLASS_ACCESS_LOCK;
  private static final SubLSymbol $sym47$SUBLISP_CLASS_STRUCTURE;
  private static final SubLString $str48$_S_is_not_a_valid_class_name_;
  private static final SubLString $str49$NEW_CLASS__A_class_cannot_be_its_;
  private static final SubLString $str50$NEW_CLASS__A_class_cannot_subclas;
  private static final SubLSymbol $sym51$OBJECT;
  private static final SubLSymbol $sym52$ON_DESTROY_CLASS;
  private static final SubLString $str53$Class_;
  private static final SubLString $str54$_Definition_Lock;
  private static final SubLString $str55$_Access_Lock;
  private static final SubLString $str56$SUBLOOP_RESERVED_INITIALIZE_;
  private static final SubLString $str57$_CLASS;
  private static final SubLString $str58$_INSTANCE;
  private static final SubLSymbol $sym59$CADR;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$CAR;
  private static final SubLSymbol $sym62$CDDR;
  private static final SubLString $str63$GET_;
  private static final SubLString $str64$_;
  private static final SubLString $str65$SET_;
  private static final SubLString $str66$___S_is_not_a_valid_class_propert;
  private static final SubLString $str67$___S_is_not_a_valid_class_propert;
  private static final SubLString $str68$___S_is_not_a_valid_class_propert;
  private static final SubLSymbol $kw69$EXTENDS;
  private static final SubLString $str70$___S_is_not_a_valid_value_for_the;
  private static final SubLString $str71$__Attempting_to_subclass_unknown_;
  private static final SubLSymbol $kw72$IMPLEMENTS;
  private static final SubLString $str73$___S_is_not_a_valid_value_for_the;
  private static final SubLList $list74;
  private static final SubLSymbol $kw75$PUBLIC;
  private static final SubLSymbol $sym76$DEFINE_PUBLIC;
  private static final SubLSymbol $sym77$CLET;
  private static final SubLSymbol $sym78$NEW_VALUE;
  private static final SubLSymbol $sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT;
  private static final SubLSymbol $sym80$QUOTE;
  private static final SubLSymbol $sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS;
  private static final SubLSymbol $kw82$SLOT_GETTER_REGISTRY;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT;
  private static final SubLSymbol $sym87$VALUE;
  private static final SubLSymbol $kw88$SLOT_SETTER_REGISTRY;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$SUBLOOP_GET_INSTANCE_SLOT;
  private static final SubLSymbol $sym91$SUBLOOP_SET_INSTANCE_SLOT;
  private static final SubLSymbol $sym92$RET;
  private static final SubLString $str93$class;
  private static final SubLString $str94$slot;
  private static final SubLSymbol $sym95$INSTANCE_CLASS;
  private static final SubLSymbol $sym96$SLOT_ASSOC;
  private static final SubLSymbol $sym97$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym98$INSTANCES_ACCESS_CHECK_INSTANCE_SLOT;
  private static final SubLSymbol $sym99$LDB_TEST;
  private static final SubLSymbol $sym100$INSTANCE_BOOLEAN_SLOTS;
  private static final SubLSymbol $sym101$CSETF;
  private static final SubLSymbol $sym102$DPB;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$CLASSES_ACCESS_CHECK_CLASS_SLOT;
  private static final SubLSymbol $sym105$CLASS;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$FIF;
  private static final SubLSymbol $sym108$SYMBOLP;
  private static final SubLSymbol $sym109$CLASSES_RETRIEVE_CLASS;
  private static final SubLSymbol $sym110$CLASS_P;
  private static final SubLSymbol $sym111$INSTANCE_P;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$PWHEN;
  private static final SubLSymbol $sym114$AREF;
  private static final SubLList $list115;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$SET_AREF;
  private static final SubLList $list118;
  private static final SubLList $list119;
  private static final SubLString $str120$_P;
  private static final SubLSymbol $sym121$SUBLOOP_INSTANCEOF_CLASS;
  private static final SubLSymbol $sym122$SUBLOOP_INITIALIZE_SLOT;
  private static final SubLSymbol $sym123$NEW_INSTANCE;
  private static final SubLSymbol $sym124$DEFINE_PROTECTED;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION;
  private static final SubLSymbol $sym127$SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION;
  private static final SubLString $str128$___S_is_not_a_valid_class_name_;
  private static final SubLString $str129$___S_is_not_a_valid_member_variab;
  private static final SubLSymbol $sym130$SUBLOOP_NEW_CLASS;
  private static final SubLSymbol $kw131$ABSTRACT;
  private static final SubLSymbol $sym132$CLASS_SET_IMPLEMENTS_SLOT_LISTENERS;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLList $list135;
  private static final SubLSymbol $sym136$DEFINE_CLASS;
  private static final SubLSymbol $kw137$BOOLEAN;
  private static final SubLSymbol $kw138$CLASS;
  private static final SubLSymbol $kw139$INSTANCE;
  private static final SubLSymbol $kw140$PRIVATE;
  private static final SubLSymbol $kw141$PROTECTED;
  private static final SubLSymbol $kw142$ESSENTIAL;
  private static final SubLSymbol $kw143$NON_ESSENTIAL;
  private static final SubLSymbol $sym144$CLASS_NAME;
  private static final SubLList $list145;
  private static final SubLSymbol $sym146$CLASSES_GETF;
  private static final SubLSymbol $sym147$CLASS_PLIST;
  private static final SubLSymbol $sym148$CLASSES_PUTF;
  private static final SubLSymbol $kw149$IMPLEMENTS_SLOT_LISTENERS;
  private static final SubLList $list150;
  private static final SubLString $str151$stack;
  private static final SubLString $str152$stack_element;
  private static final SubLString $str153$actual_class;
  private static final SubLString $str154$current_depth;
  private static final SubLSymbol $sym155$LIST;
  private static final SubLSymbol $sym156$CONS;
  private static final SubLList $list157;
  private static final SubLSymbol $sym158$WHILE;
  private static final SubLSymbol $sym159$CSETQ;
  private static final SubLSymbol $sym160$CPOP;
  private static final SubLSymbol $sym161$CDR;
  private static final SubLSymbol $sym162$NEXT_DEPTH;
  private static final SubLSymbol $sym163$_;
  private static final SubLList $list164;
  private static final SubLList $list165;
  private static final SubLSymbol $sym166$CDOLIST;
  private static final SubLSymbol $sym167$CHILD_CLASS;
  private static final SubLSymbol $sym168$CLASS_SUBCLASSES;
  private static final SubLList $list169;
  private static final SubLSymbol $sym170$ACTUAL_CHILD;
  private static final SubLSymbol $sym171$CPUSH;
  private static final SubLList $list172;
  private static final SubLString $str173$__;
  private static final SubLString $str174$__;
  private static final SubLString $str175$_S_;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1290L)
  public static SubLObject classes_reset_class_table()
  {
    $classes_class_table$.setGlobalValue( Hashtables.make_hash_table( $classes_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1432L)
  public static SubLObject classes_get_all_classes()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_classes = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $classes_class_table_update_lock$.getDynamicValue( thread ) );
      SubLObject class_name = NIL;
      SubLObject v_class = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $classes_class_table$.getGlobalValue() );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          class_name = Hashtables.getEntryKey( cdohash_entry );
          v_class = Hashtables.getEntryValue( cdohash_entry );
          v_classes = ConsesLow.cons( v_class, v_classes );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $classes_class_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return v_classes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1680L)
  public static SubLObject classes_get_all_class_names()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject class_names = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $classes_class_table_update_lock$.getDynamicValue( thread ) );
      SubLObject class_name = NIL;
      SubLObject v_class = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $classes_class_table$.getGlobalValue() );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          class_name = Hashtables.getEntryKey( cdohash_entry );
          v_class = Hashtables.getEntryValue( cdohash_entry );
          class_names = ConsesLow.cons( class_name, class_names );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $classes_class_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return class_names;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2641L)
  public static SubLObject classes_protection_greater_than_or_equal(final SubLObject level1, final SubLObject level2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sublist = conses_high.member( level1, $classes_valid_slot_properties$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    return ( NIL != conses_high.member( level2, sublist, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3274L)
  public static SubLObject classes_set_always_generate_before_listeners(final SubLObject value)
  {
    $classes_always_generate_before_listeners$.setGlobalValue( value );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3417L)
  public static SubLObject classes_before_listeners_by_default_p()
  {
    return $classes_always_generate_before_listeners$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3594L)
  public static SubLObject classes_set_always_generate_after_listeners(final SubLObject value)
  {
    $classes_always_generate_after_listeners$.setGlobalValue( value );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3735L)
  public static SubLObject classes_after_listeners_by_default_p()
  {
    return $classes_always_generate_after_listeners$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3843L)
  public static SubLObject classes_getf(final SubLObject plist, final SubLObject target_indicator)
  {
    SubLObject remainder;
    SubLObject indicator;
    SubLObject value;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      indicator = remainder.first();
      value = conses_high.cadr( remainder );
      if( indicator.eql( target_indicator ) )
      {
        return value;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4012L)
  public static SubLObject classes_putf(final SubLObject plist, final SubLObject target_indicator, final SubLObject new_value)
  {
    SubLObject indicator = NIL;
    SubLObject sublist;
    for( sublist = NIL, sublist = plist; NIL != sublist; sublist = ( NIL != plist.rest() && plist.rest().isCons() ) ? conses_high.cddr( plist ) : NIL )
    {
      indicator = sublist.first();
      if( indicator.eql( target_indicator ) )
      {
        ConsesLow.rplaca( sublist.rest(), new_value );
        return plist;
      }
    }
    return ConsesLow.listS( target_indicator, new_value, plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4397L)
  public static SubLObject classes_implement_slot_listeners_p(final SubLObject class_properties)
  {
    return classes_getf( class_properties, $kw10$SLOT_LISTENERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4527L)
  public static SubLObject classes_valid_slot_property_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != conses_high.member( v_object, $classes_valid_slot_properties$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4652L)
  public static SubLObject classes_list_of_valid_slot_properties_p(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return T;
    }
    if( v_object.isCons() )
    {
      SubLObject sublist = v_object;
      SubLObject element = NIL;
      while ( NIL != sublist)
      {
        element = sublist.first();
        if( element == $kw11$VALUE )
        {
          if( NIL == sublist.rest() )
          {
            return NIL;
          }
          sublist = conses_high.cddr( sublist );
        }
        else
        {
          if( NIL == classes_valid_slot_property_p( element ) )
          {
            return NIL;
          }
          sublist = sublist.rest();
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5131L)
  public static SubLObject classes_list_of_valid_method_properties_p(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return T;
    }
    if( v_object.isCons() )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == classes_valid_method_property_p( element ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5384L)
  public static SubLObject classes_valid_slot_name_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != v_object && v_object.isSymbol() && !v_object.isKeyword() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5501L)
  public static SubLObject classes_valid_slot_decl_p(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return NIL;
    }
    if( NIL != classes_valid_slot_name_p( v_object ) )
    {
      return T;
    }
    if( v_object.isCons() )
    {
      return makeBoolean( v_object.isCons() && NIL != classes_valid_slot_name_p( v_object.first() ) && NIL != classes_list_of_valid_slot_properties_p( v_object.rest() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5800L)
  public static SubLObject classes_valid_method_property_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != conses_high.member( v_object, $classes_valid_method_properties$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5929L)
  public static SubLObject classes_valid_method_properties_p(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return T;
    }
    if( v_object.isCons() )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == classes_valid_method_property_p( element ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6174L)
  public static SubLObject classes_auto_update_p(final SubLObject method_properties)
  {
    return ( NIL != conses_high.member( $kw12$AUTO_UPDATE, method_properties, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6296L)
  public static SubLObject classes_no_member_variables_p(final SubLObject method_properties)
  {
    return ( NIL != conses_high.member( $kw13$NO_MEMBER_VARIABLES, method_properties, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6434L)
  public static SubLObject classes_read_only_p(final SubLObject method_properties)
  {
    return ( NIL != conses_high.member( $kw14$READ_ONLY, method_properties, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6552L)
  public static SubLObject classes_before_listeners_p(final SubLObject method_properties)
  {
    return ( NIL != classes_before_listeners_by_default_p() || NIL != conses_high.member( $kw15$BEFORE_LISTENERS, method_properties, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6733L)
  public static SubLObject classes_after_listeners_p(final SubLObject method_properties)
  {
    return ( NIL != classes_after_listeners_by_default_p() || NIL != conses_high.member( $kw16$AFTER_LISTENERS, method_properties, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6911L)
  public static SubLObject classes_valid_method_interface_type_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != conses_high.member( v_object, $classes_valid_method_interface_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7051L)
  public static SubLObject classes_valid_method_name_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != v_object && v_object.isSymbol() && !v_object.isKeyword() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7170L)
  public static SubLObject classes_valid_parameter_name_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != v_object && v_object.isSymbol() && v_object != $sym17$_OPTIONAL && !v_object.isKeyword() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7322L)
  public static SubLObject classes_valid_optional_parameter_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != classes_valid_parameter_name_p( v_object ) || ( v_object.isCons() && v_object.rest().isList() && NIL != classes_valid_parameter_name_p( v_object.first() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7540L)
  public static SubLObject classes_valid_optional_parameter_list_p(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return NIL;
    }
    if( v_object.isCons() )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == classes_valid_optional_parameter_p( element ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7796L)
  public static SubLObject classes_valid_lambda_list_p(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return T;
    }
    if( !v_object.isCons() )
    {
      return NIL;
    }
    final SubLObject first_element = v_object.first();
    final SubLObject rest_of_elements = v_object.rest();
    if( first_element == $sym17$_OPTIONAL )
    {
      return classes_valid_optional_parameter_list_p( rest_of_elements );
    }
    return makeBoolean( NIL != classes_valid_parameter_name_p( first_element ) && NIL != classes_valid_lambda_list_p( rest_of_elements ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8224L)
  public static SubLObject classes_valid_method_interface_body_p(final SubLObject v_object)
  {
    return Types.sublisp_null( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8311L)
  public static SubLObject classes_valid_method_interface_decl_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != classes_valid_method_interface_type_p( v_object.first() ) && v_object.rest().isCons() && NIL != classes_valid_method_name_p( v_object.rest().first() ) && v_object
        .rest().rest().isCons() && NIL != classes_valid_lambda_list_p( v_object.rest().rest().first() ) && NIL != classes_list_of_valid_method_properties_p( v_object.rest().rest().rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8585L)
  public static SubLObject classes_method_decl_type(final SubLObject method_interface_decl)
  {
    return method_interface_decl.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8688L)
  public static SubLObject classes_class_method_decl_p(final SubLObject method_interface_decl)
  {
    return Equality.eq( classes_method_decl_type( method_interface_decl ), $sym18$DEF_CLASS_METHOD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8840L)
  public static SubLObject classes_instance_method_decl_p(final SubLObject method_interface_decl)
  {
    return Equality.eq( classes_method_decl_type( method_interface_decl ), $sym19$DEF_INSTANCE_METHOD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8998L)
  public static SubLObject classes_method_name_given_method_decl(final SubLObject method_interface_decl)
  {
    return conses_high.cadr( method_interface_decl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9115L)
  public static SubLObject classes_lambda_list_given_method_decl(final SubLObject method_interface_decl)
  {
    return conses_high.cddr( method_interface_decl ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9238L)
  public static SubLObject classes_properties_given_method_decl(final SubLObject method_interface_decl)
  {
    return conses_high.cddr( method_interface_decl ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9360L)
  public static SubLObject classes_valid_slot_or_method_decl_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != classes_valid_slot_decl_p( v_object ) || NIL != classes_valid_method_interface_decl_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9526L)
  public static SubLObject classes_valid_slot_or_method_decls_p(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return T;
    }
    if( v_object.isCons() )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == classes_valid_slot_or_method_decl_p( element ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9780L)
  public static SubLObject classes_must_be_valid_slot_or_method_decls(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != v_object && !v_object.isCons() )
    {
      Errors.error( $str20$_S_is_an_invalid_class_declaratio, v_object );
    }
    if( v_object.isCons() )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == classes_valid_slot_or_method_decl_p( element ) )
        {
          Errors.error( $str21$_S_is_neither_a_valid_slot_nor_va, element );
        }
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10158L)
  public static SubLObject classes_separate_decls_into_slot_decls_and_method_decls(final SubLObject slot_and_method_decls)
  {
    if( NIL == slot_and_method_decls )
    {
      return Values.values( NIL, NIL );
    }
    SubLObject slot_decls = NIL;
    SubLObject method_decls = NIL;
    SubLObject cdolist_list_var = slot_and_method_decls;
    SubLObject decl = NIL;
    decl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != classes_valid_slot_decl_p( decl ) )
      {
        slot_decls = ConsesLow.cons( decl, slot_decls );
      }
      else if( NIL != classes_valid_method_interface_decl_p( decl ) )
      {
        method_decls = ConsesLow.cons( decl, method_decls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      decl = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( slot_decls ), Sequences.nreverse( method_decls ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10636L)
  public static SubLObject class_separate_decls_into_class_and_instance_method_decls(final SubLObject method_decls)
  {
    if( NIL == method_decls )
    {
      return Values.values( NIL, NIL );
    }
    SubLObject class_method_decls = NIL;
    SubLObject instance_method_decls = NIL;
    SubLObject cdolist_list_var = method_decls;
    SubLObject decl = NIL;
    decl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != classes_class_method_decl_p( decl ) )
      {
        class_method_decls = ConsesLow.cons( decl, class_method_decls );
      }
      else if( NIL != classes_instance_method_decl_p( decl ) )
      {
        instance_method_decls = ConsesLow.cons( decl, instance_method_decls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      decl = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( class_method_decls ), Sequences.nreverse( instance_method_decls ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11145L)
  public static SubLObject ldb_test(final SubLObject spec, final SubLObject integer)
  {
    return bytes.ldb( spec, integer ).isZero() ? NIL : T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11233L)
  public static SubLObject display_class(final SubLObject class_name_or_class)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    PrintLow.format( T, $str22$__class_name_____S, subloop_structures.class_name( v_class ) );
    PrintLow.format( T, $str23$__parent_____S, subloop_structures.class_parent( v_class ) );
    PrintLow.format( T, $str24$__subclasses_____S, subloop_structures.class_subclasses( v_class ) );
    PrintLow.format( T, $str25$__interface_names_____S, subloop_structures.class_interface_names( v_class ) );
    PrintLow.format( T, $str26$__interfaces_____S, subloop_structures.class_interfaces( v_class ) );
    PrintLow.format( T, $str27$__compiled_inheritance_path_____S, subloop_structures.class_compiled_inheritance_path( v_class ) );
    PrintLow.format( T, $str28$__instance_var_decls_____S, subloop_structures.class_instance_var_decls( v_class ) );
    PrintLow.format( T, $str29$__class_var_decls_____S, subloop_structures.class_class_var_decls( v_class ) );
    PrintLow.format( T, $str30$__compiled_instance_slot_access_a, subloop_structures.class_compiled_instance_slot_access_alist( v_class ) );
    PrintLow.format( T, $str31$__compiled_instance_boolean_slot_, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    PrintLow.format( T, $str32$__compiled_class_slot_access_alis, subloop_structures.class_compiled_class_slot_access_alist( v_class ) );
    PrintLow.format( T, $str33$__compiled_class_boolean_slot_acc, subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class ) );
    PrintLow.format( T, $str34$__slot_accessor_alist_____S, subloop_structures.class_slot_accessor_alist( v_class ) );
    PrintLow.format( T, $str35$__instance_method_decls_____S, subloop_structures.class_instance_method_decls( v_class ) );
    PrintLow.format( T, $str36$__class_method_decls_____S, subloop_structures.class_class_method_decls( v_class ) );
    PrintLow.format( T, $str37$__boolean_slots_____S, subloop_structures.class_boolean_slots( v_class ) );
    PrintLow.format( T, $str38$__any_slots_____S, subloop_structures.class_any_slots( v_class ) );
    PrintLow.format( T, $str39$__compiled_instance_method_access, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    PrintLow.format( T, $str40$__compiled_class_method_access_al, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    PrintLow.format( T, $str41$__class_initialization_function__, subloop_structures.class_class_initialization_function( v_class ) );
    PrintLow.format( T, $str42$__class_initialized_p_____S, subloop_structures.class_class_initialized_p( v_class ) );
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13207L)
  public static SubLObject with_class_definition_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    v_class = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return reader.bq_cons( $sym44$PROGN, body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13458L)
  public static SubLObject with_class_access_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    v_class = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym45$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym46$CLASS_ACCESS_LOCK, v_class ) ), body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13644L)
  public static SubLObject classes_retrieve_class(final SubLObject class_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( class_name.isSymbol() )
    {
      final SubLObject actual_class = Hashtables.gethash( class_name, $classes_class_table$.getGlobalValue(), UNPROVIDED );
      if( NIL != actual_class && NIL == subloop_structures.class_class_initialized_p( actual_class ) )
      {
        final SubLObject function = subloop_structures.class_class_initialization_function( actual_class );
        if( NIL != Symbols.fboundp( function ) && !$classes_new_class_current$.getDynamicValue( thread ).eql( class_name ) && NIL != subloop_structures.class_any_slots( actual_class ) && NIL != subloop_structures
            .class_boolean_slots( actual_class ) )
        {
          Functions.funcall( subloop_structures.class_class_initialization_function( actual_class ), actual_class );
          subloop_structures._csetf_class_class_initialized_p( actual_class, T );
        }
      }
      return actual_class;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14464L)
  public static SubLObject classes_intern_class(final SubLObject class_name, final SubLObject v_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $classes_class_table_update_lock$.getDynamicValue( thread ) );
      if( class_name.isSymbol() && NIL != subloop_structures.class_p( v_class ) )
      {
        Hashtables.sethash( class_name, $classes_class_table$.getGlobalValue(), v_class );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $classes_class_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14710L)
  public static SubLObject classes_delete_class(final SubLObject class_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $classes_class_table_update_lock$.getDynamicValue( thread ) );
      if( class_name.isSymbol() )
      {
        Hashtables.remhash( class_name, $classes_class_table$.getGlobalValue() );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $classes_class_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14911L)
  public static SubLObject classes_set_class(final SubLObject symbol, final SubLObject new_class)
  {
    if( symbol.isSymbol() && ( NIL == new_class || NIL != subloop_structures.class_p( new_class ) ) )
    {
      Symbols.put( symbol, $sym47$SUBLISP_CLASS_STRUCTURE, new_class );
      return new_class;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15146L)
  public static SubLObject classes_get_class(final SubLObject symbol)
  {
    if( symbol.isSymbol() )
    {
      final SubLObject possible_class = Symbols.get( symbol, $sym47$SUBLISP_CLASS_STRUCTURE, UNPROVIDED );
      if( NIL != subloop_structures.class_p( possible_class ) )
      {
        return possible_class;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15378L)
  public static SubLObject classes_valid_class_property_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( v_object.isSymbol() && NIL != conses_high.member( v_object, $classes_valid_class_properties$.getDynamicValue( thread ), Symbols.symbol_function( EQ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15525L)
  public static SubLObject classes_valid_instance_var_decl_p(final SubLObject instance_var_decl)
  {
    return makeBoolean( instance_var_decl.isSymbol() || ( instance_var_decl.isCons() && instance_var_decl.first().isSymbol() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15741L)
  public static SubLObject classes_valid_instance_var_decls_p(final SubLObject instance_var_decls)
  {
    if( instance_var_decls.isList() )
    {
      SubLObject cdolist_list_var = instance_var_decls;
      SubLObject instance_var_decl = NIL;
      instance_var_decl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == classes_valid_instance_var_decl_p( instance_var_decl ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        instance_var_decl = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16030L)
  public static SubLObject classes_valid_class_name_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != v_object && v_object.isSymbol() && !v_object.isKeyword() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16150L)
  public static SubLObject classes_must_be_valid_class_name(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == classes_valid_class_name_p( v_object ) )
    {
      Errors.error( $str48$_S_is_not_a_valid_class_name_, v_object );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16310L)
  public static SubLObject classes_unique_elements(final SubLObject list_of_elements)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = list_of_elements;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == conses_high.member( element, result, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( element, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16528L)
  public static SubLObject new_class(final SubLObject class_name, final SubLObject parent_class, SubLObject parent_interfaces, final SubLObject slot_and_method_decls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding( thread );
    try
    {
      $classes_new_class_current$.bind( class_name, thread );
      classes_must_be_valid_class_name( class_name );
      parent_interfaces = classes_unique_elements( parent_interfaces );
      interfaces.interfaces_check_parent_interfaces( parent_interfaces );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && class_name.eql( parent_class ) )
      {
        Errors.error( $str49$NEW_CLASS__A_class_cannot_be_its_, class_name, parent_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != subclassp( parent_class, class_name ) )
      {
        Errors.error( $str50$NEW_CLASS__A_class_cannot_subclas, parent_class, class_name );
      }
      if( NIL != parent_class )
      {
        classes_must_be_valid_class_name( parent_class );
      }
      classes_must_be_valid_slot_or_method_decls( slot_and_method_decls );
    }
    finally
    {
      $classes_new_class_current$.rebind( _prev_bind_0, thread );
    }
    thread.resetMultipleValues();
    final SubLObject slot_decls = classes_separate_decls_into_slot_decls_and_method_decls( slot_and_method_decls );
    final SubLObject method_interface_decls = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject v_class = NIL;
    final SubLObject _prev_bind_2 = $classes_new_class_current$.currentBinding( thread );
    try
    {
      $classes_new_class_current$.bind( class_name, thread );
      final SubLObject old_class = classes_retrieve_class( class_name );
      SubLObject actual_interface = NIL;
      SubLObject actual_interfaces = NIL;
      SubLObject class_var_decls = NIL;
      SubLObject instance_var_decls = NIL;
      if( NIL != old_class && NIL != subclassp( old_class, $sym51$OBJECT ) )
      {
        final SubLObject association = methods.method_assoc( $sym52$ON_DESTROY_CLASS, subloop_structures.class_compiled_class_method_access_alist( old_class ) );
        if( NIL != association )
        {
          final SubLObject function_name = subloop_structures.method_function_name( association );
          if( NIL != Symbols.fboundp( function_name ) )
          {
            methods.funcall_class_method_with_0_args( old_class, $sym52$ON_DESTROY_CLASS );
          }
        }
      }
      v_class = ( ( NIL != old_class ) ? old_class : subloop_structures.create_class() );
      subloop_structures._csetf_class_class_properties( v_class, ZERO_INTEGER );
      if( NIL == old_class )
      {
        subloop_structures._csetf_class_definition_lock( v_class, Locks.make_lock( Sequences.cconcatenate( $str53$Class_, new SubLObject[] { Symbols.symbol_name( class_name ), $str54$_Definition_Lock
        } ) ) );
        subloop_structures._csetf_class_access_lock( v_class, Locks.make_lock( Sequences.cconcatenate( $str53$Class_, new SubLObject[] { Symbols.symbol_name( class_name ), $str55$_Access_Lock
        } ) ) );
      }
      SubLObject cdolist_list_var = parent_interfaces;
      SubLObject interface_name = NIL;
      interface_name = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        actual_interface = interfaces.interfaces_retrieve_interface( interface_name );
        if( NIL != actual_interface )
        {
          actual_interfaces = ConsesLow.cons( actual_interface, actual_interfaces );
        }
        cdolist_list_var = cdolist_list_var.rest();
        interface_name = cdolist_list_var.first();
      }
      actual_interfaces = Sequences.nreverse( actual_interfaces );
      cdolist_list_var = slot_decls;
      SubLObject decl = NIL;
      decl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != classes_class_slot_decl_p( decl ) )
        {
          class_var_decls = ConsesLow.cons( decl, class_var_decls );
        }
        else if( NIL != classes_instance_slot_decl_p( decl ) )
        {
          instance_var_decls = ConsesLow.cons( decl, instance_var_decls );
        }
        cdolist_list_var = cdolist_list_var.rest();
        decl = cdolist_list_var.first();
      }
      subloop_structures._csetf_class_name( v_class, class_name );
      subloop_structures._csetf_class_parent( v_class, parent_class );
      subloop_structures._csetf_class_subclasses( v_class, NIL );
      subloop_structures._csetf_class_interface_names( v_class, parent_interfaces );
      subloop_structures._csetf_class_interfaces( v_class, actual_interfaces );
      subloop_structures._csetf_class_compiled_inheritance_path( v_class, NIL );
      subloop_structures._csetf_class_instance_var_decls( v_class, Sequences.nreverse( instance_var_decls ) );
      subloop_structures._csetf_class_class_var_decls( v_class, Sequences.nreverse( class_var_decls ) );
      subloop_structures._csetf_class_compiled_instance_slot_access_alist( v_class, NIL );
      subloop_structures._csetf_class_instance_method_decls( v_class, NIL );
      subloop_structures._csetf_class_class_method_decls( v_class, NIL );
      subloop_structures._csetf_class_boolean_slots( v_class, ZERO_INTEGER );
      subloop_structures._csetf_class_slot_accessor_alist( v_class, NIL );
      subloop_structures._csetf_class_any_slots( v_class, NIL );
      subloop_structures._csetf_class_compiled_instance_method_access_alist( v_class, NIL );
      subloop_structures._csetf_class_compiled_class_method_access_alist( v_class, NIL );
      subloop_structures._csetf_class_class_initialization_function( v_class, Packages.intern( Sequences.cconcatenate( $str56$SUBLOOP_RESERVED_INITIALIZE_, new SubLObject[] { Symbols.symbol_name( class_name ),
        $str57$_CLASS
      } ), UNPROVIDED ) );
      subloop_structures._csetf_class_class_initialized_p( v_class, NIL );
      subloop_structures._csetf_class_instance_initialization_function( v_class, Packages.intern( Sequences.cconcatenate( $str56$SUBLOOP_RESERVED_INITIALIZE_, new SubLObject[] { Symbols.symbol_name( class_name ),
        $str58$_INSTANCE
      } ), UNPROVIDED ) );
      classes_intern_class( class_name, v_class );
      classes_set_class( class_name, v_class );
      classes_compile_inheritance_path( v_class, UNPROVIDED );
      classes_compile_instance_slot_access_list( v_class, UNPROVIDED );
      classes_compile_instance_boolean_slot_access_list( v_class, UNPROVIDED );
      classes_compile_class_slot_access_list( v_class, UNPROVIDED );
      classes_compile_class_boolean_slot_access_list( v_class, UNPROVIDED );
      classes_generate_slot_accessor_names( v_class );
      classes_initialize_class_slots( v_class );
      thread.resetMultipleValues();
      SubLObject class_method_decls = class_separate_decls_into_class_and_instance_method_decls( method_interface_decls );
      SubLObject instance_method_decls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject interface_class_methods = interfaces.interfaces_collect_method_decls( actual_interfaces );
      final SubLObject interface_instance_methods = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject class_methods_to_append = NIL;
      SubLObject instance_methods_to_append = NIL;
      SubLObject cdolist_list_var2 = interface_class_methods;
      SubLObject method_decl = NIL;
      method_decl = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL == conses_high.member( conses_high.cadr( method_decl ), class_method_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym59$CADR ) ) )
        {
          class_methods_to_append = ConsesLow.cons( method_decl, class_methods_to_append );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        method_decl = cdolist_list_var2.first();
      }
      cdolist_list_var2 = interface_instance_methods;
      method_decl = NIL;
      method_decl = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL == conses_high.member( conses_high.cadr( method_decl ), instance_method_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym59$CADR ) ) )
        {
          instance_methods_to_append = ConsesLow.cons( method_decl, instance_methods_to_append );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        method_decl = cdolist_list_var2.first();
      }
      class_method_decls = ConsesLow.nconc( class_method_decls, Sequences.nreverse( class_methods_to_append ) );
      instance_method_decls = ConsesLow.nconc( instance_method_decls, Sequences.nreverse( instance_methods_to_append ) );
      SubLObject method_name = NIL;
      SubLObject lambda_list = NIL;
      SubLObject v_properties = NIL;
      SubLObject cdolist_list_var3 = class_method_decls;
      SubLObject decl2 = NIL;
      decl2 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        method_name = classes_method_name_given_method_decl( decl2 );
        lambda_list = classes_lambda_list_given_method_decl( decl2 );
        v_properties = classes_properties_given_method_decl( decl2 );
        methods.methods_incorporate_class_method( method_name, class_name, v_properties, lambda_list, NIL );
        cdolist_list_var3 = cdolist_list_var3.rest();
        decl2 = cdolist_list_var3.first();
      }
      cdolist_list_var3 = instance_method_decls;
      decl2 = NIL;
      decl2 = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        method_name = classes_method_name_given_method_decl( decl2 );
        lambda_list = classes_lambda_list_given_method_decl( decl2 );
        v_properties = classes_properties_given_method_decl( decl2 );
        methods.methods_incorporate_instance_method( method_name, class_name, v_properties, lambda_list, NIL );
        cdolist_list_var3 = cdolist_list_var3.rest();
        decl2 = cdolist_list_var3.first();
      }
      if( NIL == class_method_decls && NIL == instance_method_decls )
      {
        methods.methods_compile_method_access_alists( v_class );
      }
    }
    finally
    {
      $classes_new_class_current$.rebind( _prev_bind_2, thread );
    }
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23034L)
  public static SubLObject classes_make_slot_accessor_association(final SubLObject slot_name, final SubLObject getter_name, final SubLObject setter_name)
  {
    return ConsesLow.listS( slot_name, getter_name, setter_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23177L)
  public static SubLObject classes_slot_accessor_association_slot_name(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot_accessor_association = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    slot_accessor_association = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym61$CAR, slot_accessor_association );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23313L)
  public static SubLObject classes_slot_accessor_association_getter_name(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot_accessor_association = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    slot_accessor_association = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym59$CADR, slot_accessor_association );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23452L)
  public static SubLObject classes_slot_accessor_association_setter_name(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot_accessor_association = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    slot_accessor_association = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym62$CDDR, slot_accessor_association );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23591L)
  public static SubLObject classes_retrieve_slot_getter(final SubLObject v_class, final SubLObject slot_name)
  {
    final SubLObject association = conses_high.assoc( slot_name, subloop_structures.class_slot_accessor_alist( v_class ), UNPROVIDED, UNPROVIDED );
    if( NIL != association )
    {
      return conses_high.cadr( association );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23845L)
  public static SubLObject classes_retrieve_slot_setter(final SubLObject v_class, final SubLObject slot_name)
  {
    final SubLObject association = conses_high.assoc( slot_name, subloop_structures.class_slot_accessor_alist( v_class ), UNPROVIDED, UNPROVIDED );
    if( NIL != association )
    {
      return conses_high.cddr( association );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24099L)
  public static SubLObject classes_generate_slot_accessor_names(final SubLObject v_class)
  {
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class );
    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class );
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class );
    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class );
    final SubLObject class_name = subloop_structures.class_name( v_class );
    SubLObject slot_accessor_alist = NIL;
    SubLObject slot_name = NIL;
    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      slot_accessor_alist = ConsesLow.cons( classes_make_slot_accessor_association( slot_name, Packages.intern( Sequences.cconcatenate( $str63$GET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str64$_, Symbols
          .symbol_name( slot_name )
      } ), UNPROVIDED ), Packages.intern( Sequences.cconcatenate( $str65$SET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str64$_, Symbols.symbol_name( slot_name )
      } ), UNPROVIDED ) ), slot_accessor_alist );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_instance_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      slot_accessor_alist = ConsesLow.cons( classes_make_slot_accessor_association( slot_name, Packages.intern( Sequences.cconcatenate( $str63$GET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str64$_, Symbols
          .symbol_name( slot_name )
      } ), UNPROVIDED ), Packages.intern( Sequences.cconcatenate( $str65$SET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str64$_, Symbols.symbol_name( slot_name )
      } ), UNPROVIDED ) ), slot_accessor_alist );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_class_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      slot_accessor_alist = ConsesLow.cons( classes_make_slot_accessor_association( slot_name, Packages.intern( Sequences.cconcatenate( $str63$GET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str64$_, Symbols
          .symbol_name( slot_name )
      } ), UNPROVIDED ), Packages.intern( Sequences.cconcatenate( $str65$SET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str64$_, Symbols.symbol_name( slot_name )
      } ), UNPROVIDED ) ), slot_accessor_alist );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_class_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      slot_accessor_alist = ConsesLow.cons( classes_make_slot_accessor_association( slot_name, Packages.intern( Sequences.cconcatenate( $str63$GET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str64$_, Symbols
          .symbol_name( slot_name )
      } ), UNPROVIDED ), Packages.intern( Sequences.cconcatenate( $str65$SET_, new SubLObject[] { Symbols.symbol_name( class_name ), $str64$_, Symbols.symbol_name( slot_name )
      } ), UNPROVIDED ) ), slot_accessor_alist );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    subloop_structures._csetf_class_slot_accessor_alist( v_class, Sequences.nreverse( slot_accessor_alist ) );
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26166L)
  public static SubLObject classes_valid_class_properties_p(final SubLObject plist)
  {
    if( plist.isList() )
    {
      SubLObject remainder;
      SubLObject indicator;
      SubLObject value;
      for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        indicator = remainder.first();
        value = conses_high.cadr( remainder );
        if( NIL == classes_valid_class_property_p( indicator ) )
        {
          return NIL;
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26420L)
  public static SubLObject class_properties_must_be_valid(final SubLObject class_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !class_properties.isList() )
    {
      Errors.error( $str66$___S_is_not_a_valid_class_propert, class_properties );
    }
    SubLObject remainder;
    SubLObject class_property;
    SubLObject value;
    SubLObject pcase_var;
    for( remainder = NIL, remainder = class_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      class_property = remainder.first();
      value = conses_high.cadr( remainder );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == classes_valid_class_property_p( class_property ) )
      {
        Errors.error( class_property.isSymbol() ? $str67$___S_is_not_a_valid_class_propert : $str68$___S_is_not_a_valid_class_propert, class_property );
      }
      pcase_var = class_property;
      if( pcase_var.eql( $kw69$EXTENDS ) )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !value.isSymbol() )
        {
          Errors.error( $str70$___S_is_not_a_valid_value_for_the, value );
        }
        if( NIL == classes_retrieve_class( value ) )
        {
          Errors.warn( $str71$__Attempting_to_subclass_unknown_, value );
        }
      }
      else if( pcase_var.eql( $kw72$IMPLEMENTS ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !value.isSymbol() && NIL == classes_utilities.classes_symbol_list_p( value ) )
      {
        Errors.error( $str73$___S_is_not_a_valid_value_for_the, value );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27607L)
  public static SubLObject expand_interface_method_instantiations(final SubLObject class_name_or_class)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    final SubLObject class_name = ( NIL != v_class ) ? subloop_structures.class_name( v_class ) : NIL;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      SubLObject instantiations = NIL;
      final SubLObject v_class_$1 = v_class;
      final SubLObject interface_names = subloop_structures.class_interface_names( v_class_$1 );
      final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls( v_class_$1 );
      SubLObject cdolist_list_var;
      final SubLObject class_method_decls = cdolist_list_var = subloop_structures.class_class_method_decls( v_class_$1 );
      SubLObject method = NIL;
      method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subloop_structures.method_instantiate_template( method ) )
        {
          SubLObject collected_methods = NIL;
          SubLObject v_interface = NIL;
          SubLObject interface_method = NIL;
          SubLObject cdolist_list_var_$2 = interface_names;
          SubLObject interface_name = NIL;
          interface_name = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            v_interface = interfaces.interfaces_retrieve_interface( interface_name );
            if( NIL != v_interface )
            {
              interface_method = interfaces.interfaces_find_class_method( subloop_structures.method_name( method ), subloop_structures.interface_name( v_interface ) );
              if( NIL != interface_method )
              {
                collected_methods = ConsesLow.cons( interface_method, collected_methods );
              }
            }
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            interface_name = cdolist_list_var_$2.first();
          }
          if( collected_methods.isCons() && NIL == collected_methods.rest() )
          {
            instantiations = ConsesLow.nconc( instantiations, interfaces.interfaces_class_method_to_listed_def_class_method( class_name, collected_methods.first() ) );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        method = cdolist_list_var.first();
      }
      cdolist_list_var = instance_method_decls;
      method = NIL;
      method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subloop_structures.method_instantiate_template( method ) )
        {
          SubLObject collected_methods = NIL;
          SubLObject v_interface = NIL;
          SubLObject interface_method = NIL;
          SubLObject cdolist_list_var_$3 = interface_names;
          SubLObject interface_name = NIL;
          interface_name = cdolist_list_var_$3.first();
          while ( NIL != cdolist_list_var_$3)
          {
            v_interface = interfaces.interfaces_retrieve_interface( interface_name );
            if( NIL != v_interface )
            {
              interface_method = interfaces.interfaces_find_instance_method( subloop_structures.method_name( method ), subloop_structures.interface_name( v_interface ) );
              if( NIL != interface_method )
              {
                collected_methods = ConsesLow.cons( interface_method, collected_methods );
              }
            }
            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
            interface_name = cdolist_list_var_$3.first();
          }
          if( collected_methods.isCons() && NIL == collected_methods.rest() )
          {
            instantiations = ConsesLow.nconc( instantiations, interfaces.interfaces_instance_method_to_listed_def_instance_method( class_name, collected_methods.first() ) );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        method = cdolist_list_var.first();
      }
      return instantiations;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29476L)
  public static SubLObject expand_accessors_for_class(final SubLObject class_name_or_class, SubLObject v_slot_listeners)
  {
    if( v_slot_listeners == UNPROVIDED )
    {
      v_slot_listeners = NIL;
    }
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject class_name = subloop_structures.class_name( v_class );
      SubLObject defn_pairs = NIL;
      SubLObject v_defns = NIL;
      final SubLObject v_class_$4 = v_class;
      final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class_$4 );
      final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class_$4 );
      final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class_$4 );
      final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class_$4 );
      SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
      SubLObject slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( slots.slot_class_name( slot ).eql( class_name ) )
        {
          defn_pairs = ConsesLow.cons( expand_instance_any_slot_accessors( v_class, slot, v_slot_listeners ), defn_pairs );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      cdolist_list_var = compiled_instance_boolean_slot_access_alist;
      slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( slots.slot_class_name( slot ).eql( class_name ) )
        {
          defn_pairs = ConsesLow.cons( expand_instance_boolean_slot_accessors( v_class, slot ), defn_pairs );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      cdolist_list_var = compiled_class_slot_access_alist;
      slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( slots.slot_class_name( slot ).eql( class_name ) )
        {
          defn_pairs = ConsesLow.cons( expand_class_any_slot_accessors( v_class, slot ), defn_pairs );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      cdolist_list_var = compiled_class_boolean_slot_access_alist;
      slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( slots.slot_class_name( slot ).eql( class_name ) )
        {
          defn_pairs = ConsesLow.cons( expand_class_boolean_slot_accessors( v_class, slot ), defn_pairs );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      cdolist_list_var = defn_pairs;
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject getter = NIL;
        SubLObject setter = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
        getter = current.first();
        current = ( setter = current.rest() );
        v_defns = ConsesLow.cons( setter, v_defns );
        v_defns = ConsesLow.cons( getter, v_defns );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      return v_defns;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30753L)
  public static SubLObject expand_instance_any_slot_accessors(final SubLObject v_class, final SubLObject slot, SubLObject v_slot_listeners)
  {
    if( v_slot_listeners == UNPROVIDED )
    {
      v_slot_listeners = NIL;
    }
    final SubLObject class_name = subloop_structures.class_name( v_class );
    final SubLObject slot_name = slots.slot_name( slot );
    final SubLObject slot_index = slots.slot_index( slot );
    final SubLObject slot_protection = slots.slot_protection( slot );
    final SubLObject getter_name = classes_retrieve_slot_getter( v_class, slot_name );
    final SubLObject setter_name = classes_retrieve_slot_setter( v_class, slot_name );
    final SubLObject access_protection = makeBoolean( slot_protection != $kw75$PUBLIC );
    if( NIL != v_slot_listeners )
    {
      if( NIL != access_protection )
      {
        return ConsesLow.cons( ConsesLow.list( $sym76$DEFINE_PUBLIC, getter_name, ConsesLow.list( class_name ), ConsesLow.listS( $sym77$CLET, ConsesLow.list( ConsesLow.list( $sym78$NEW_VALUE, ConsesLow.list(
            $sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, slot_index, ConsesLow.list( $sym80$QUOTE, slot_name ) ) ) ), ConsesLow.listS( $sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name,
                $kw82$SLOT_GETTER_REGISTRY, ConsesLow.list( $sym80$QUOTE, slot_name ), slot_index, $list83 ), $list84 ) ), ConsesLow.listS( $sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons( class_name, $list85 ),
                    ConsesLow.list( $sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, $sym87$VALUE, slot_index, ConsesLow.list( $sym80$QUOTE, slot_name ) ), ConsesLow.listS(
                        $sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $kw88$SLOT_SETTER_REGISTRY, ConsesLow.list( $sym80$QUOTE, slot_name ), slot_index, $list85 ), $list89 ) );
      }
      return ConsesLow.cons( ConsesLow.list( $sym76$DEFINE_PUBLIC, getter_name, ConsesLow.list( class_name ), ConsesLow.listS( $sym77$CLET, ConsesLow.list( ConsesLow.list( $sym78$NEW_VALUE, ConsesLow.list(
          $sym90$SUBLOOP_GET_INSTANCE_SLOT, class_name, slot_index ) ) ), ConsesLow.listS( $sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $kw82$SLOT_GETTER_REGISTRY, ConsesLow.list( $sym80$QUOTE,
              slot_name ), slot_index, $list83 ), $list84 ) ), ConsesLow.listS( $sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons( class_name, $list85 ), ConsesLow.list( $sym91$SUBLOOP_SET_INSTANCE_SLOT, class_name,
                  $sym87$VALUE, slot_index ), ConsesLow.listS( $sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $kw88$SLOT_SETTER_REGISTRY, ConsesLow.list( $sym80$QUOTE, slot_name ), slot_index, $list85 ),
                  $list89 ) );
    }
    else
    {
      if( NIL != access_protection )
      {
        return ConsesLow.cons( ConsesLow.list( $sym76$DEFINE_PUBLIC, getter_name, ConsesLow.list( class_name ), ConsesLow.list( $sym92$RET, ConsesLow.list( $sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name,
            slot_index, ConsesLow.list( $sym80$QUOTE, slot_name ) ) ) ), ConsesLow.list( $sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons( class_name, $list85 ), ConsesLow.list( $sym92$RET, ConsesLow.list(
                $sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, $sym87$VALUE, slot_index, ConsesLow.list( $sym80$QUOTE, slot_name ) ) ) ) );
      }
      return ConsesLow.cons( ConsesLow.list( $sym76$DEFINE_PUBLIC, getter_name, ConsesLow.list( class_name ), ConsesLow.list( $sym92$RET, ConsesLow.list( $sym90$SUBLOOP_GET_INSTANCE_SLOT, class_name, slot_index ) ) ),
          ConsesLow.list( $sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons( class_name, $list85 ), ConsesLow.list( $sym92$RET, ConsesLow.list( $sym91$SUBLOOP_SET_INSTANCE_SLOT, class_name, $sym87$VALUE,
              slot_index ) ) ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33047L)
  public static SubLObject expand_instance_boolean_slot_accessors(final SubLObject v_class, final SubLObject slot)
  {
    final SubLObject slot_name = slots.slot_name( slot );
    final SubLObject slot_index = slots.slot_index( slot );
    final SubLObject slot_protection = slots.slot_protection( slot );
    final SubLObject slot_byte_spec = bytes.sublisp_byte( ONE_INTEGER, slot_index );
    final SubLObject class_name = subloop_structures.class_name( v_class );
    final SubLObject getter_name = classes_retrieve_slot_getter( v_class, slot_name );
    final SubLObject setter_name = classes_retrieve_slot_setter( v_class, slot_name );
    final SubLObject class_var = Symbols.make_symbol( $str93$class );
    final SubLObject slot_var = Symbols.make_symbol( $str94$slot );
    final SubLObject access_protection = ( slot_protection == $kw75$PUBLIC ) ? NIL
        : ConsesLow.list( ConsesLow.list( $sym77$CLET, ConsesLow.list( ConsesLow.list( class_var, ConsesLow.list( $sym95$INSTANCE_CLASS, class_name ) ), ConsesLow.list( slot_var, ConsesLow.list( $sym96$SLOT_ASSOC,
            ConsesLow.list( $sym80$QUOTE, slot_name ), ConsesLow.list( $sym97$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, class_var ) ) ) ), ConsesLow.list( $sym98$INSTANCES_ACCESS_CHECK_INSTANCE_SLOT, class_var,
                class_name, slot_var ) ) );
    if( NIL != access_protection )
    {
      return ConsesLow.cons( ConsesLow.listS( $sym76$DEFINE_PUBLIC, getter_name, ConsesLow.list( class_name ), ConsesLow.append( conses_high.copy_list( access_protection ), ConsesLow.list( ConsesLow.list( $sym92$RET,
          ConsesLow.list( $sym99$LDB_TEST, slot_byte_spec, ConsesLow.list( $sym100$INSTANCE_BOOLEAN_SLOTS, class_name ) ) ) ) ) ), ConsesLow.listS( $sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons( class_name,
              $list85 ), ConsesLow.append( conses_high.copy_list( access_protection ), reader.bq_cons( ConsesLow.list( $sym101$CSETF, ConsesLow.list( $sym100$INSTANCE_BOOLEAN_SLOTS, class_name ), ConsesLow.list(
                  $sym102$DPB, $list103, slot_byte_spec, ConsesLow.list( $sym100$INSTANCE_BOOLEAN_SLOTS, class_name ) ) ), $list89 ) ) ) );
    }
    return ConsesLow.cons( ConsesLow.listS( $sym76$DEFINE_PUBLIC, getter_name, ConsesLow.list( class_name ), ConsesLow.append( conses_high.copy_list( access_protection ), ConsesLow.list( ConsesLow.list( $sym92$RET,
        ConsesLow.list( $sym99$LDB_TEST, slot_byte_spec, ConsesLow.list( $sym100$INSTANCE_BOOLEAN_SLOTS, class_name ) ) ) ) ) ), ConsesLow.listS( $sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons( class_name, $list85 ),
            ConsesLow.append( conses_high.copy_list( access_protection ), reader.bq_cons( ConsesLow.list( $sym101$CSETF, ConsesLow.list( $sym100$INSTANCE_BOOLEAN_SLOTS, class_name ), ConsesLow.list( $sym102$DPB,
                $list103, slot_byte_spec, ConsesLow.list( $sym100$INSTANCE_BOOLEAN_SLOTS, class_name ) ) ), $list89 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35254L)
  public static SubLObject expand_class_any_slot_accessors(final SubLObject v_class, final SubLObject slot)
  {
    final SubLObject slot_name = slots.slot_name( slot );
    final SubLObject slot_index = slots.slot_index( slot );
    final SubLObject slot_protection = slots.slot_protection( slot );
    final SubLObject class_name = subloop_structures.class_name( v_class );
    final SubLObject getter_name = classes_retrieve_slot_getter( v_class, slot_name );
    final SubLObject setter_name = classes_retrieve_slot_setter( v_class, slot_name );
    final SubLObject access_protection = ( slot_protection == $kw75$PUBLIC ) ? NIL
        : ConsesLow.list( ConsesLow.list( $sym104$CLASSES_ACCESS_CHECK_CLASS_SLOT, $sym105$CLASS, ConsesLow.listS( $sym96$SLOT_ASSOC, ConsesLow.list( $sym80$QUOTE, slot_name ), $list106 ) ) );
    return ConsesLow.cons( ConsesLow.list( $sym76$DEFINE_PUBLIC, getter_name, ConsesLow.list( class_name ), ConsesLow.listS( $sym77$CLET, ConsesLow.list( ConsesLow.list( $sym105$CLASS, ConsesLow.list( $sym107$FIF,
        ConsesLow.list( $sym108$SYMBOLP, class_name ), ConsesLow.list( $sym109$CLASSES_RETRIEVE_CLASS, class_name ), ConsesLow.list( $sym107$FIF, ConsesLow.list( $sym110$CLASS_P, class_name ), class_name, ConsesLow
            .listS( $sym107$FIF, ConsesLow.list( $sym111$INSTANCE_P, class_name ), ConsesLow.list( $sym95$INSTANCE_CLASS, class_name ), $list112 ) ) ) ) ), ConsesLow.listS( $sym113$PWHEN, $sym105$CLASS, ConsesLow.append(
                conses_high.copy_list( access_protection ), ConsesLow.list( ConsesLow.list( $sym92$RET, ConsesLow.list( $sym114$AREF, $list115, slot_index ) ) ) ) ), $list116 ) ), ConsesLow.list( $sym76$DEFINE_PUBLIC,
                    setter_name, reader.bq_cons( class_name, $list85 ), ConsesLow.listS( $sym77$CLET, ConsesLow.list( ConsesLow.list( $sym105$CLASS, ConsesLow.list( $sym107$FIF, ConsesLow.list( $sym108$SYMBOLP,
                        class_name ), ConsesLow.list( $sym109$CLASSES_RETRIEVE_CLASS, class_name ), ConsesLow.list( $sym107$FIF, ConsesLow.list( $sym110$CLASS_P, class_name ), class_name, ConsesLow.listS( $sym107$FIF,
                            ConsesLow.list( $sym111$INSTANCE_P, class_name ), ConsesLow.list( $sym95$INSTANCE_CLASS, class_name ), $list112 ) ) ) ) ), ConsesLow.listS( $sym113$PWHEN, $sym105$CLASS, ConsesLow.append(
                                conses_high.copy_list( access_protection ), ConsesLow.list( ConsesLow.list( $sym92$RET, ConsesLow.listS( $sym117$SET_AREF, $list115, slot_index, $list85 ) ) ) ) ), $list116 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36641L)
  public static SubLObject expand_class_boolean_slot_accessors(final SubLObject v_class, final SubLObject slot)
  {
    final SubLObject slot_name = slots.slot_name( slot );
    final SubLObject slot_index = slots.slot_index( slot );
    final SubLObject slot_protection = slots.slot_protection( slot );
    final SubLObject slot_byte_spec = bytes.sublisp_byte( ONE_INTEGER, slot_index );
    final SubLObject class_name = subloop_structures.class_name( v_class );
    final SubLObject getter_name = classes_retrieve_slot_getter( v_class, slot_name );
    final SubLObject setter_name = classes_retrieve_slot_setter( v_class, slot_name );
    final SubLObject access_protection = ( slot_protection == $kw75$PUBLIC ) ? NIL
        : ConsesLow.list( ConsesLow.list( $sym104$CLASSES_ACCESS_CHECK_CLASS_SLOT, $sym105$CLASS, ConsesLow.listS( $sym96$SLOT_ASSOC, ConsesLow.list( $sym80$QUOTE, slot_name ), $list106 ) ) );
    return ConsesLow.cons( ConsesLow.list( $sym76$DEFINE_PUBLIC, getter_name, ConsesLow.list( class_name ), ConsesLow.listS( $sym77$CLET, ConsesLow.list( ConsesLow.list( $sym105$CLASS, ConsesLow.list( $sym107$FIF,
        ConsesLow.list( $sym108$SYMBOLP, class_name ), ConsesLow.list( $sym109$CLASSES_RETRIEVE_CLASS, class_name ), ConsesLow.list( $sym107$FIF, ConsesLow.list( $sym110$CLASS_P, class_name ), class_name, ConsesLow
            .listS( $sym107$FIF, ConsesLow.list( $sym111$INSTANCE_P, class_name ), ConsesLow.list( $sym95$INSTANCE_CLASS, class_name ), $list112 ) ) ) ) ), ConsesLow.listS( $sym113$PWHEN, $sym105$CLASS, ConsesLow.append(
                conses_high.copy_list( access_protection ), ConsesLow.list( ConsesLow.list( $sym92$RET, ConsesLow.listS( $sym99$LDB_TEST, slot_byte_spec, $list118 ) ) ) ) ), $list116 ) ), ConsesLow.list(
                    $sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons( class_name, $list85 ), ConsesLow.listS( $sym77$CLET, ConsesLow.list( ConsesLow.list( $sym105$CLASS, ConsesLow.list( $sym107$FIF, ConsesLow.list(
                        $sym108$SYMBOLP, class_name ), ConsesLow.list( $sym109$CLASSES_RETRIEVE_CLASS, class_name ), ConsesLow.list( $sym107$FIF, ConsesLow.list( $sym110$CLASS_P, class_name ), class_name, ConsesLow
                            .listS( $sym107$FIF, ConsesLow.list( $sym111$INSTANCE_P, class_name ), ConsesLow.list( $sym95$INSTANCE_CLASS, class_name ), $list112 ) ) ) ) ), ConsesLow.listS( $sym113$PWHEN, $sym105$CLASS,
                                ConsesLow.append( conses_high.copy_list( access_protection ), reader.bq_cons( ConsesLow.list( $sym101$CSETF, $list119, ConsesLow.listS( $sym102$DPB, $list103, slot_byte_spec, $list118 ) ),
                                    $list89 ) ) ), $list116 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38144L)
  public static SubLObject expand_class_predicator(final SubLObject class_name)
  {
    final SubLObject predicate_name = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( class_name ), $str120$_P ), UNPROVIDED );
    return ConsesLow.list( $sym76$DEFINE_PUBLIC, predicate_name, ConsesLow.list( class_name ), ConsesLow.list( $sym92$RET, ConsesLow.list( $sym121$SUBLOOP_INSTANCEOF_CLASS, class_name, ConsesLow.list( $sym80$QUOTE,
        class_name ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38401L)
  public static SubLObject expand_class_initializer(final SubLObject class_or_class_name)
  {
    final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_class_name ) ) ? class_or_class_name : classes_retrieve_class( class_or_class_name );
    final SubLObject class_initializer_name = subloop_structures.class_class_initialization_function( v_class );
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class );
    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class );
    SubLObject initializations = NIL;
    SubLObject slot_name = NIL;
    SubLObject class_name = NIL;
    SubLObject value = NIL;
    SubLObject cdolist_list_var = compiled_class_slot_access_alist;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      class_name = slots.slot_class_name( slot );
      value = slots.slot_init_value( slot );
      initializations = ConsesLow.cons( ConsesLow.list( $sym122$SUBLOOP_INITIALIZE_SLOT, $sym123$NEW_INSTANCE, ConsesLow.list( $sym80$QUOTE, class_name ), ConsesLow.list( $sym80$QUOTE, slot_name ), conses_high.copy_tree(
          value ) ), initializations );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    class_name = NIL;
    value = NIL;
    cdolist_list_var = compiled_class_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      class_name = slots.slot_class_name( slot );
      value = slots.slot_init_value( slot );
      initializations = ConsesLow.cons( ConsesLow.list( $sym122$SUBLOOP_INITIALIZE_SLOT, $sym123$NEW_INSTANCE, ConsesLow.list( $sym80$QUOTE, class_name ), ConsesLow.list( $sym80$QUOTE, slot_name ), conses_high.copy_tree(
          value ) ), initializations );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return ConsesLow.list( $sym44$PROGN, ConsesLow.listS( $sym124$DEFINE_PROTECTED, class_initializer_name, $list125, ConsesLow.append( initializations, $list116 ) ), ConsesLow.list(
        $sym126$SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION, ConsesLow.list( $sym80$QUOTE, class_or_class_name ), ConsesLow.list( $sym80$QUOTE, class_initializer_name ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39512L)
  public static SubLObject expand_instance_initializer(final SubLObject class_or_class_name)
  {
    final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_class_name ) ) ? class_or_class_name : classes_retrieve_class( class_or_class_name );
    final SubLObject instance_initializer_name = subloop_structures.class_instance_initialization_function( v_class );
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class );
    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class );
    SubLObject initializations = NIL;
    SubLObject slot_name = NIL;
    SubLObject class_name = NIL;
    SubLObject value = NIL;
    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      class_name = slots.slot_class_name( slot );
      value = slots.slot_init_value( slot );
      initializations = ConsesLow.cons( ConsesLow.list( $sym122$SUBLOOP_INITIALIZE_SLOT, $sym123$NEW_INSTANCE, ConsesLow.list( $sym80$QUOTE, class_name ), ConsesLow.list( $sym80$QUOTE, slot_name ), conses_high.copy_tree(
          value ) ), initializations );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    class_name = NIL;
    value = NIL;
    cdolist_list_var = compiled_instance_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      class_name = slots.slot_class_name( slot );
      value = slots.slot_init_value( slot );
      initializations = ConsesLow.cons( ConsesLow.list( $sym122$SUBLOOP_INITIALIZE_SLOT, $sym123$NEW_INSTANCE, ConsesLow.list( $sym80$QUOTE, class_name ), ConsesLow.list( $sym80$QUOTE, slot_name ), conses_high.copy_tree(
          value ) ), initializations );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return ConsesLow.list( $sym44$PROGN, ConsesLow.listS( $sym124$DEFINE_PROTECTED, instance_initializer_name, $list125, ConsesLow.append( initializations, $list116 ) ), ConsesLow.list(
        $sym127$SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION, ConsesLow.list( $sym80$QUOTE, class_or_class_name ), ConsesLow.list( $sym80$QUOTE, instance_initializer_name ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40659L)
  public static SubLObject expand_define_class(final SubLObject class_name, final SubLObject class_properties, final SubLObject slot_decls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !class_name.isSymbol() )
    {
      Errors.error( $str128$___S_is_not_a_valid_class_name_, class_name );
    }
    class_properties_must_be_valid( class_properties );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == classes_valid_instance_var_decls_p( slot_decls ) )
    {
      Errors.error( $str129$___S_is_not_a_valid_member_variab, slot_decls );
    }
    final SubLObject parent_class = classes_getf( class_properties, $kw69$EXTENDS );
    SubLObject parent_interfaces = classes_getf( class_properties, $kw72$IMPLEMENTS );
    final SubLObject slot_properties = classes_implement_slot_listeners_p( class_properties );
    SubLObject v_class = NIL;
    if( parent_interfaces.isSymbol() && NIL != parent_interfaces )
    {
      parent_interfaces = ConsesLow.list( parent_interfaces );
    }
    v_class = new_class( class_name, parent_class, parent_interfaces, slot_decls );
    class_set_implements_slot_listeners( v_class, slot_properties );
    SubLObject expanded_definition = NIL;
    final SubLObject expanded_class_initializer = expand_class_initializer( class_name );
    final SubLObject expanded_instance_initializer = expand_instance_initializer( class_name );
    final SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding( thread );
    try
    {
      $classes_new_class_current$.bind( class_name, thread );
      if( NIL != slot_properties )
      {
        expanded_definition = ConsesLow.listS( $sym44$PROGN, ConsesLow.list( $sym130$SUBLOOP_NEW_CLASS, ConsesLow.list( $sym80$QUOTE, class_name ), ConsesLow.list( $sym80$QUOTE, parent_class ), ConsesLow.list(
            $sym80$QUOTE, parent_interfaces ), ( NIL != classes_getf( class_properties, $kw131$ABSTRACT ) ) ? T : NIL, ConsesLow.list( $sym80$QUOTE, slot_decls ) ), ConsesLow.listS(
                $sym132$CLASS_SET_IMPLEMENTS_SLOT_LISTENERS, ConsesLow.list( $sym80$QUOTE, class_name ), $list133 ), ConsesLow.append( expand_accessors_for_class( class_name, T ), expand_interface_method_instantiations(
                    class_name ), ConsesLow.list( expanded_class_initializer, expanded_instance_initializer, expand_class_predicator( class_name ), ConsesLow.list( conses_high.cadr( conses_high.second(
                        expanded_class_initializer ) ), ConsesLow.list( $sym80$QUOTE, class_name ) ) ) ) );
      }
      else
      {
        expanded_definition = ConsesLow.listS( $sym44$PROGN, ConsesLow.list( $sym130$SUBLOOP_NEW_CLASS, ConsesLow.list( $sym80$QUOTE, class_name ), ConsesLow.list( $sym80$QUOTE, parent_class ), ConsesLow.list(
            $sym80$QUOTE, parent_interfaces ), ( NIL != classes_getf( class_properties, $kw131$ABSTRACT ) ) ? T : NIL, ConsesLow.list( $sym80$QUOTE, slot_decls ) ), ConsesLow.listS(
                $sym132$CLASS_SET_IMPLEMENTS_SLOT_LISTENERS, ConsesLow.list( $sym80$QUOTE, class_name ), $list112 ), ConsesLow.append( expand_accessors_for_class( class_name, UNPROVIDED ),
                    expand_interface_method_instantiations( class_name ), ConsesLow.list( expanded_class_initializer, expanded_instance_initializer, expand_class_predicator( class_name ), ConsesLow.list( conses_high
                        .cadr( conses_high.second( expanded_class_initializer ) ), ConsesLow.list( $sym80$QUOTE, class_name ) ) ) ) );
      }
    }
    finally
    {
      $classes_new_class_current$.rebind( _prev_bind_0, thread );
    }
    return expanded_definition;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42971L)
  public static SubLObject define_class(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject class_name_and_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
    class_name_and_properties = current.first();
    final SubLObject slot_decls;
    current = ( slot_decls = current.rest() );
    SubLObject current_$6;
    final SubLObject datum_$5 = current_$6 = class_name_and_properties;
    SubLObject class_name = NIL;
    SubLObject class_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$6, datum_$5, $list135 );
    class_name = current_$6.first();
    current_$6 = ( class_properties = current_$6.rest() );
    final SubLObject class_structure = new_class( class_name, classes_getf( class_properties, $kw69$EXTENDS ), classes_getf( class_properties, $kw72$IMPLEMENTS ), slot_decls );
    subloop_class_properties.set_subloop_class_property_abstract_p( class_structure, classes_getf( class_properties, $kw131$ABSTRACT ) );
    return expand_define_class( class_name, class_properties, slot_decls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43479L)
  public static SubLObject subloop_new_class(final SubLObject class_name, final SubLObject parent_class, final SubLObject parent_interfaces, final SubLObject abstract_p, final SubLObject slot_decls)
  {
    final SubLObject class_structure = new_class( class_name, parent_class, parent_interfaces, slot_decls );
    subloop_class_properties.set_subloop_class_property_abstract_p( class_structure, abstract_p );
    return class_structure;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43850L)
  public static SubLObject subloop_initialize_slot(final SubLObject v_object, final SubLObject class_name, final SubLObject slot_name, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = classes_retrieve_class( class_name );
    final SubLObject setter = classes_retrieve_slot_setter( v_class, slot_name );
    final SubLObject _prev_bind_0 = $curclass$.currentBinding( thread );
    try
    {
      $curclass$.bind( v_class, thread );
      Functions.funcall( setter, v_object, value );
    }
    finally
    {
      $curclass$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44138L)
  public static SubLObject subloop_note_class_initialization_function(final SubLObject class_name, final SubLObject class_initializer_name)
  {
    final SubLObject v_class = classes_retrieve_class( class_name );
    subloop_structures._csetf_class_class_initialization_function( v_class, class_initializer_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44410L)
  public static SubLObject subloop_note_instance_initialization_function(final SubLObject class_name, final SubLObject instance_initializer_name)
  {
    final SubLObject v_class = classes_retrieve_class( class_name );
    subloop_structures._csetf_class_instance_initialization_function( v_class, instance_initializer_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44694L)
  public static SubLObject subloop_instanceof_class(final SubLObject v_object, final SubLObject v_class)
  {
    if( NIL != subloop_structures.instance_p( v_object ) )
    {
      final SubLObject direct_class = subloop_structures.instance_class( v_object );
      SubLObject cdolist_list_var = subloop_structures.class_compiled_inheritance_path( direct_class );
      SubLObject superclass = NIL;
      superclass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( v_class.eql( subloop_structures.class_name( superclass ) ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        superclass = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44994L)
  public static SubLObject subloop_get_instance_slot(final SubLObject v_object, final SubLObject slot_index)
  {
    return Vectors.aref( subloop_structures.instance_any_slots( v_object ), slot_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45141L)
  public static SubLObject subloop_get_access_protected_instance_slot(final SubLObject v_object, final SubLObject slot_index, final SubLObject slot_name)
  {
    final SubLObject v_class = subloop_structures.instance_class( v_object );
    final SubLObject slot = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, v_object, slot );
    return subloop_get_instance_slot( v_object, slot_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45502L)
  public static SubLObject subloop_set_instance_slot(final SubLObject v_object, final SubLObject value, final SubLObject slot_index)
  {
    Vectors.set_aref( subloop_structures.instance_any_slots( v_object ), slot_index, value );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45673L)
  public static SubLObject subloop_set_access_protected_instance_slot(final SubLObject v_object, final SubLObject value, final SubLObject slot_index, final SubLObject slot_name)
  {
    final SubLObject v_class = subloop_structures.instance_class( v_object );
    final SubLObject slot = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, v_object, slot );
    return subloop_set_instance_slot( v_object, value, slot_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46046L)
  public static SubLObject classes_compile_inheritance_path(final SubLObject class_name_or_class, SubLObject recompile)
  {
    if( recompile == UNPROVIDED )
    {
      recompile = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = ( NIL != subloop_structures.class_p( class_name_or_class ) ) ? class_name_or_class : ( class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : NIL );
    if( NIL != v_class )
    {
      if( NIL == recompile )
      {
        final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path( v_class );
        if( NIL != compiled_inheritance_path )
        {
          return compiled_inheritance_path;
        }
      }
      final SubLObject parent = subloop_structures.class_parent( v_class );
      final SubLObject parent_inheritance_path = ( NIL != parent ) ? classes_compile_inheritance_path( parent, NIL ) : NIL;
      final SubLObject inheritance_path = ConsesLow.cons( v_class, parent_inheritance_path );
      if( NIL != parent )
      {
        final SubLObject parent_class = classes_retrieve_class( parent );
        final SubLObject class_name = subloop_structures.class_name( v_class );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == parent_class )
        {
          Errors.error( $str71$__Attempting_to_subclass_unknown_, parent );
        }
        if( NIL == conses_high.member( class_name, subloop_structures.class_subclasses( parent_class ), Symbols.symbol_function( EQ ), UNPROVIDED ) )
        {
          subloop_structures._csetf_class_subclasses( parent_class, ConsesLow.cons( class_name, subloop_structures.class_subclasses( parent_class ) ) );
        }
      }
      subloop_structures._csetf_class_compiled_inheritance_path( v_class, inheritance_path );
      return inheritance_path;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47205L)
  public static SubLObject classes_instance_slot_index(final SubLObject v_class, final SubLObject slot_name)
  {
    return slots.find_slot_index( slot_name, subloop_structures.class_compiled_instance_slot_access_alist( v_class ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47355L)
  public static SubLObject classes_boolean_slot_decl_p(final SubLObject slot_decl)
  {
    return makeBoolean( slot_decl.isCons() && NIL != conses_high.member( $kw137$BOOLEAN, slot_decl.rest(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47486L)
  public static SubLObject classes_class_slot_decl_p(final SubLObject slot_decl)
  {
    return makeBoolean( slot_decl.isCons() && NIL != conses_high.member( $kw138$CLASS, slot_decl.rest(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47613L)
  public static SubLObject classes_instance_slot_decl_p(final SubLObject slot_decl)
  {
    return makeBoolean( ( slot_decl.isCons() && ( NIL != conses_high.member( $kw139$INSTANCE, slot_decl.rest(), UNPROVIDED, UNPROVIDED ) || NIL == conses_high.member( $kw138$CLASS, slot_decl.rest(), UNPROVIDED,
        UNPROVIDED ) ) ) || slot_decl.isSymbol() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47830L)
  public static SubLObject classes_protection_level_of_slot_decl(final SubLObject slot_decl)
  {
    if( !slot_decl.isCons() )
    {
      return $kw75$PUBLIC;
    }
    final SubLObject v_properties = slot_decl.rest();
    if( !v_properties.isCons() )
    {
      return $kw75$PUBLIC;
    }
    if( NIL != conses_high.member( $kw140$PRIVATE, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw140$PRIVATE;
    }
    if( NIL != conses_high.member( $kw141$PROTECTED, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw141$PROTECTED;
    }
    if( NIL != conses_high.member( $kw75$PUBLIC, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw75$PUBLIC;
    }
    return $kw75$PUBLIC;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48245L)
  public static SubLObject classes_essential_slot_p(final SubLObject slot_decl)
  {
    if( !slot_decl.isCons() )
    {
      return NIL;
    }
    final SubLObject v_properties = slot_decl.rest();
    if( v_properties.isCons() )
    {
      return makeBoolean( NIL != conses_high.member( $kw142$ESSENTIAL, v_properties, UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member( $kw143$NON_ESSENTIAL, v_properties, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48529L)
  public static SubLObject classes_value_of_slot_decl(final SubLObject slot_decl)
  {
    if( !slot_decl.isCons() )
    {
      return NIL;
    }
    final SubLObject v_properties = slot_decl.rest();
    if( !v_properties.isCons() )
    {
      return NIL;
    }
    final SubLObject value_sublist = conses_high.member( $kw11$VALUE, v_properties, UNPROVIDED, UNPROVIDED );
    if( NIL == value_sublist )
    {
      return NIL;
    }
    if( value_sublist.rest().isCons() )
    {
      return conses_high.cadr( value_sublist );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48904L)
  public static SubLObject classes_slot_name_given_slot_decl(final SubLObject slot_decl)
  {
    return slot_decl.isSymbol() ? slot_decl : ( slot_decl.isCons() ? ( slot_decl.first().isSymbol() ? slot_decl.first() : NIL ) : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49124L)
  public static SubLObject classes_compile_instance_slot_access_list(final SubLObject class_name_or_class, SubLObject recompile)
  {
    if( recompile == UNPROVIDED )
    {
      recompile = T;
    }
    final SubLObject v_class = ( NIL != subloop_structures.class_p( class_name_or_class ) ) ? class_name_or_class : ( class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : NIL );
    final SubLObject class_name = ( NIL != v_class ) ? subloop_structures.class_name( v_class ) : NIL;
    if( NIL != v_class )
    {
      if( NIL == recompile )
      {
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class );
        if( NIL != compiled_instance_slot_access_alist )
        {
          return compiled_instance_slot_access_alist;
        }
      }
      final SubLObject parent = subloop_structures.class_parent( v_class );
      SubLObject parent_instance_slot_access_list = ( NIL != parent ) ? classes_compile_instance_slot_access_list( parent, NIL ) : NIL;
      SubLObject last_index = ( NIL != parent_instance_slot_access_list ) ? slots.slot_index( parent_instance_slot_access_list.first() ) : MINUS_ONE_INTEGER;
      SubLObject instance_var = NIL;
      SubLObject cdolist_list_var = subloop_structures.class_instance_var_decls( v_class );
      SubLObject decl = NIL;
      decl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == classes_boolean_slot_decl_p( decl ) )
        {
          instance_var = classes_slot_name_given_slot_decl( decl );
          if( NIL != instance_var )
          {
            if( NIL == slots.slot_assoc( instance_var, parent_instance_slot_access_list ) )
            {
              last_index = Numbers.add( last_index, ONE_INTEGER );
              parent_instance_slot_access_list = ConsesLow.cons( slots.new_slot( instance_var, last_index, class_name, classes_protection_level_of_slot_decl( decl ), classes_essential_slot_p( decl ),
                  classes_value_of_slot_decl( decl ) ), parent_instance_slot_access_list );
            }
            else
            {
              slots.set_slot_init_value( instance_var, parent_instance_slot_access_list, classes_value_of_slot_decl( decl ) );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        decl = cdolist_list_var.first();
      }
      subloop_structures._csetf_class_compiled_instance_slot_access_alist( v_class, parent_instance_slot_access_list );
      return parent_instance_slot_access_list;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51176L)
  public static SubLObject classes_compile_instance_boolean_slot_access_list(final SubLObject class_name_or_class, SubLObject recompile)
  {
    if( recompile == UNPROVIDED )
    {
      recompile = T;
    }
    final SubLObject v_class = ( NIL != subloop_structures.class_p( class_name_or_class ) ) ? class_name_or_class : ( class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : NIL );
    final SubLObject class_name = ( NIL != v_class ) ? subloop_structures.class_name( v_class ) : NIL;
    if( NIL != v_class )
    {
      if( NIL == recompile )
      {
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class );
        if( NIL != compiled_instance_boolean_slot_access_alist )
        {
          return compiled_instance_boolean_slot_access_alist;
        }
      }
      final SubLObject parent = subloop_structures.class_parent( v_class );
      SubLObject parent_instance_boolean_slot_access_list = ( NIL != parent ) ? classes_compile_instance_boolean_slot_access_list( parent, NIL ) : NIL;
      SubLObject last_index = ( NIL != parent_instance_boolean_slot_access_list ) ? slots.slot_index( parent_instance_boolean_slot_access_list.first() ) : MINUS_ONE_INTEGER;
      SubLObject instance_var = NIL;
      SubLObject cdolist_list_var = subloop_structures.class_instance_var_decls( v_class );
      SubLObject decl = NIL;
      decl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != classes_boolean_slot_decl_p( decl ) )
        {
          instance_var = classes_slot_name_given_slot_decl( decl );
          if( NIL != instance_var )
          {
            if( NIL == slots.slot_assoc( instance_var, parent_instance_boolean_slot_access_list ) )
            {
              last_index = Numbers.add( last_index, ONE_INTEGER );
              parent_instance_boolean_slot_access_list = ConsesLow.cons( slots.new_slot( instance_var, last_index, class_name, classes_protection_level_of_slot_decl( decl ), classes_essential_slot_p( decl ),
                  classes_value_of_slot_decl( decl ) ), parent_instance_boolean_slot_access_list );
            }
            else
            {
              slots.set_slot_init_value( instance_var, parent_instance_boolean_slot_access_list, classes_value_of_slot_decl( decl ) );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        decl = cdolist_list_var.first();
      }
      subloop_structures._csetf_class_compiled_instance_boolean_slot_access_alist( v_class, parent_instance_boolean_slot_access_list );
      return parent_instance_boolean_slot_access_list;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53314L)
  public static SubLObject classes_compile_class_slot_access_list(final SubLObject class_name_or_class, SubLObject recompile)
  {
    if( recompile == UNPROVIDED )
    {
      recompile = T;
    }
    final SubLObject v_class = ( NIL != subloop_structures.class_p( class_name_or_class ) ) ? class_name_or_class : ( class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : NIL );
    final SubLObject class_name = ( NIL != v_class ) ? subloop_structures.class_name( v_class ) : NIL;
    if( NIL != v_class )
    {
      if( NIL == recompile )
      {
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class );
        if( NIL != compiled_class_slot_access_alist )
        {
          return compiled_class_slot_access_alist;
        }
      }
      final SubLObject parent = subloop_structures.class_parent( v_class );
      SubLObject parent_class_slot_access_list = ( NIL != parent ) ? classes_compile_class_slot_access_list( parent, NIL ) : NIL;
      SubLObject last_index = ( NIL != parent_class_slot_access_list ) ? slots.slot_index( parent_class_slot_access_list.first() ) : MINUS_ONE_INTEGER;
      SubLObject class_var = NIL;
      SubLObject cdolist_list_var = subloop_structures.class_class_var_decls( v_class );
      SubLObject decl = NIL;
      decl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == classes_boolean_slot_decl_p( decl ) )
        {
          class_var = classes_slot_name_given_slot_decl( decl );
          if( NIL != class_var && NIL == slots.slot_assoc( class_var, parent_class_slot_access_list ) )
          {
            last_index = Numbers.add( last_index, ONE_INTEGER );
            parent_class_slot_access_list = ConsesLow.cons( slots.new_slot( class_var, last_index, class_name, classes_protection_level_of_slot_decl( decl ), classes_essential_slot_p( decl ), classes_value_of_slot_decl(
                decl ) ), parent_class_slot_access_list );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        decl = cdolist_list_var.first();
      }
      subloop_structures._csetf_class_compiled_class_slot_access_alist( v_class, parent_class_slot_access_list );
      return parent_class_slot_access_list;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54824L)
  public static SubLObject classes_compile_class_boolean_slot_access_list(final SubLObject class_name_or_class, SubLObject recompile)
  {
    if( recompile == UNPROVIDED )
    {
      recompile = T;
    }
    final SubLObject v_class = ( NIL != subloop_structures.class_p( class_name_or_class ) ) ? class_name_or_class : ( class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : NIL );
    final SubLObject class_name = ( NIL != v_class ) ? subloop_structures.class_name( v_class ) : NIL;
    if( NIL != v_class )
    {
      if( NIL == recompile )
      {
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class );
        if( NIL != compiled_class_boolean_slot_access_alist )
        {
          return compiled_class_boolean_slot_access_alist;
        }
      }
      final SubLObject parent = subloop_structures.class_parent( v_class );
      SubLObject parent_class_boolean_slot_access_list = ( NIL != parent ) ? classes_compile_class_boolean_slot_access_list( parent, NIL ) : NIL;
      SubLObject last_index = ( NIL != parent_class_boolean_slot_access_list ) ? slots.slot_index( parent_class_boolean_slot_access_list.first() ) : MINUS_ONE_INTEGER;
      SubLObject class_var = NIL;
      SubLObject cdolist_list_var = subloop_structures.class_class_var_decls( v_class );
      SubLObject decl = NIL;
      decl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != classes_boolean_slot_decl_p( decl ) )
        {
          class_var = classes_slot_name_given_slot_decl( decl );
          if( NIL != class_var && NIL == slots.slot_assoc( class_var, parent_class_boolean_slot_access_list ) )
          {
            last_index = Numbers.add( last_index, ONE_INTEGER );
            parent_class_boolean_slot_access_list = ConsesLow.cons( slots.new_slot( class_var, last_index, class_name, classes_protection_level_of_slot_decl( decl ), classes_essential_slot_p( decl ),
                classes_value_of_slot_decl( decl ) ), parent_class_boolean_slot_access_list );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        decl = cdolist_list_var.first();
      }
      subloop_structures._csetf_class_compiled_class_boolean_slot_access_alist( v_class, parent_class_boolean_slot_access_list );
      return parent_class_boolean_slot_access_list;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56451L)
  public static SubLObject classes_initialize_class_slots(final SubLObject class_name_or_class)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject boolean_slot_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class );
      final SubLObject boolean_slot_count = Sequences.length( boolean_slot_alist );
      final SubLObject boolean_slot_vector = boolean_slot_count.numG( ZERO_INTEGER ) ? ZERO_INTEGER : NIL;
      final SubLObject any_slot_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class );
      final SubLObject any_slot_count = Sequences.length( any_slot_alist );
      final SubLObject any_slot_vector = any_slot_count.numG( ZERO_INTEGER ) ? Vectors.make_vector( any_slot_count, UNPROVIDED ) : NIL;
      if( NIL != any_slot_vector )
      {
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( any_slot_count ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          Vectors.set_aref( any_slot_vector, i, NIL );
        }
      }
      subloop_structures._csetf_class_boolean_slots( v_class, boolean_slot_vector );
      subloop_structures._csetf_class_any_slots( v_class, any_slot_vector );
      return v_class;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57336L)
  public static SubLObject superclassp(final SubLObject class_name_or_class_1, final SubLObject class_name_or_class_2)
  {
    final SubLObject class1 = class_name_or_class_1.isSymbol() ? classes_retrieve_class( class_name_or_class_1 ) : class_name_or_class_1;
    final SubLObject class2 = class_name_or_class_2.isSymbol() ? classes_retrieve_class( class_name_or_class_2 ) : class_name_or_class_2;
    if( NIL != subloop_structures.class_p( class1 ) && NIL != subloop_structures.class_p( class2 ) )
    {
      final SubLObject class1_name = subloop_structures.class_name( class1 );
      SubLObject cdolist_list_var = subloop_structures.class_compiled_inheritance_path( class2 );
      SubLObject parent_class = NIL;
      parent_class = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( class1_name.eql( subloop_structures.class_name( parent_class ) ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        parent_class = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57938L)
  public static SubLObject subclassp(final SubLObject class_name_or_class_1, final SubLObject class_name_or_class_2)
  {
    return superclassp( class_name_or_class_2, class_name_or_class_1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58601L)
  public static SubLObject classes_access_check_class_slot(final SubLObject v_class, final SubLObject slot)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = slots.slot_protection( slot );
    if( pcase_var.eql( $kw141$PROTECTED ) )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( slots.slot_class_name( slot ), subloop_structures.class_compiled_inheritance_path( v_class ), Symbols.symbol_function( EQ ),
          Symbols.symbol_function( $sym144$CLASS_NAME ) ) )
      {
        Errors.error( $classes_class_slot_access_violation$.getGlobalValue(), $kw141$PROTECTED, slots.slot_name( slot ), subloop_structures.class_name( v_class ) );
      }
    }
    else if( pcase_var.eql( $kw140$PRIVATE ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !subloop_structures.class_name( v_class ).eql( slots.slot_class_name( slot ) ) )
    {
      Errors.error( $classes_class_slot_access_violation$.getGlobalValue(), $kw140$PRIVATE, slots.slot_name( slot ), subloop_structures.class_name( v_class ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59108L)
  public static SubLObject get_class_slot(final SubLObject v_class, final SubLObject slot_name)
  {
    SubLObject association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_class_slot_access_alist( v_class ) );
    if( NIL != association )
    {
      classes_access_check_class_slot( v_class, association );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), slots.slot_index( association ) );
    }
    association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class ) );
    if( NIL != association )
    {
      classes_access_check_class_slot( v_class, association );
      return ldb_test( bytes.sublisp_byte( ONE_INTEGER, slots.slot_index( association ) ), subloop_structures.class_boolean_slots( v_class ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59703L)
  public static SubLObject set_class_slot(final SubLObject v_class, final SubLObject slot_name, final SubLObject value)
  {
    SubLObject association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_class_slot_access_alist( v_class ) );
    if( NIL != association )
    {
      classes_access_check_class_slot( v_class, association );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), slots.slot_index( association ), value );
    }
    association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class ) );
    if( NIL != association )
    {
      classes_access_check_class_slot( v_class, association );
      subloop_structures._csetf_class_boolean_slots( v_class, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, bytes.sublisp_byte( ONE_INTEGER, slots.slot_index( association ) ), subloop_structures
          .class_boolean_slots( v_class ) ) );
      return value;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60379L)
  public static SubLObject classes_shadowed_association(final SubLObject target_key, final SubLObject alist)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = alist;
    SubLObject association = NIL;
    association = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( association.first().eql( target_key ) )
      {
        if( count.numE( ONE_INTEGER ) )
        {
          return association;
        }
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      association = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60620L)
  public static SubLObject classes_all_class_slots(final SubLObject class_name_or_class, SubLObject access_level)
  {
    if( access_level == UNPROVIDED )
    {
      access_level = $kw140$PRIVATE;
    }
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$7 = v_class;
      final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class_$7 );
      final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class_$7 );
      SubLObject v_slots = NIL;
      SubLObject slot_name = NIL;
      SubLObject protection = NIL;
      SubLObject cdolist_list_var = compiled_class_slot_access_alist;
      SubLObject slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        slot_name = slots.slot_name( slot );
        protection = slots.slot_protection( slot );
        if( NIL != classes_protection_greater_than_or_equal( access_level, protection ) )
        {
          v_slots = ConsesLow.cons( slot_name, v_slots );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      slot_name = NIL;
      protection = NIL;
      cdolist_list_var = compiled_class_boolean_slot_access_alist;
      slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        slot_name = slots.slot_name( slot );
        protection = slots.slot_protection( slot );
        if( NIL != classes_protection_greater_than_or_equal( access_level, protection ) )
        {
          v_slots = ConsesLow.cons( slot_name, v_slots );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      return Sequences.nreverse( v_slots );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61360L)
  public static SubLObject classes_all_instance_slots(final SubLObject class_name_or_class, SubLObject access_level)
  {
    if( access_level == UNPROVIDED )
    {
      access_level = $kw140$PRIVATE;
    }
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$8 = v_class;
      final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class_$8 );
      final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class_$8 );
      SubLObject v_slots = NIL;
      SubLObject slot_name = NIL;
      SubLObject protection = NIL;
      SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
      SubLObject slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        slot_name = slots.slot_name( slot );
        protection = slots.slot_protection( slot );
        if( NIL != classes_protection_greater_than_or_equal( access_level, protection ) )
        {
          v_slots = ConsesLow.cons( slot_name, v_slots );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      slot_name = NIL;
      protection = NIL;
      cdolist_list_var = compiled_instance_boolean_slot_access_alist;
      slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        slot_name = slots.slot_name( slot );
        protection = slots.slot_protection( slot );
        if( NIL != classes_protection_greater_than_or_equal( access_level, protection ) )
        {
          v_slots = ConsesLow.cons( slot_name, v_slots );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      return Sequences.nreverse( v_slots );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62109L)
  public static SubLObject classes_all_any_instance_slots(final SubLObject class_name_or_class, SubLObject access_level)
  {
    if( access_level == UNPROVIDED )
    {
      access_level = $kw140$PRIVATE;
    }
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$9 = v_class;
      final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class_$9 );
      SubLObject v_slots = NIL;
      SubLObject slot_name = NIL;
      SubLObject protection = NIL;
      SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
      SubLObject slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        slot_name = slots.slot_name( slot );
        protection = slots.slot_protection( slot );
        if( NIL != classes_protection_greater_than_or_equal( access_level, protection ) )
        {
          v_slots = ConsesLow.cons( slot_name, v_slots );
        }
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      return Sequences.nreverse( v_slots );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62658L)
  public static SubLObject classes_all_slots(final SubLObject class_name_or_class, SubLObject access_level)
  {
    if( access_level == UNPROVIDED )
    {
      access_level = $kw140$PRIVATE;
    }
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      return ConsesLow.nconc( classes_all_class_slots( v_class, access_level ), classes_all_instance_slots( v_class, access_level ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63042L)
  public static SubLObject class_get_property_internal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject indicator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    indicator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym146$CLASSES_GETF, ConsesLow.list( $sym147$CLASS_PLIST, v_class ), indicator );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list145 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63166L)
  public static SubLObject class_get_property(final SubLObject v_class, final SubLObject indicator)
  {
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      return classes_getf( subloop_structures.class_plist( v_class ), indicator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63314L)
  public static SubLObject class_set_property_internal(final SubLObject v_class, final SubLObject indicator, final SubLObject value)
  {
    final SubLObject class_var = Symbols.make_symbol( $str93$class );
    return ConsesLow.list( $sym77$CLET, ConsesLow.list( ConsesLow.list( class_var, v_class ) ), ConsesLow.list( $sym101$CSETF, ConsesLow.list( $sym147$CLASS_PLIST, class_var ), ConsesLow.list( $sym148$CLASSES_PUTF,
        ConsesLow.list( $sym147$CLASS_PLIST, class_var ), indicator, value ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63572L)
  public static SubLObject class_set_property(final SubLObject v_class, final SubLObject indicator, final SubLObject value)
  {
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      class_set_property_internal( v_class, indicator, value );
      return value;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63742L)
  public static SubLObject class_implements_slot_listeners_p(final SubLObject class_name_or_class)
  {
    if( NIL != subloop_structures.class_p( class_name_or_class ) )
    {
      return class_get_property( class_name_or_class, $kw149$IMPLEMENTS_SLOT_LISTENERS );
    }
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : NIL;
    if( NIL != v_class )
    {
      return class_get_property( v_class, $kw149$IMPLEMENTS_SLOT_LISTENERS );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64151L)
  public static SubLObject class_set_implements_slot_listeners(final SubLObject class_name_or_class, final SubLObject boolean_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding( thread );
    try
    {
      $classes_new_class_current$.bind( ( NIL != subloop_structures.class_p( class_name_or_class ) ) ? subloop_structures.class_name( class_name_or_class ) : class_name_or_class, thread );
      if( NIL != subloop_structures.class_p( class_name_or_class ) )
      {
        result = class_set_property( class_name_or_class, $kw149$IMPLEMENTS_SLOT_LISTENERS, boolean_value );
      }
      else
      {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class( class_name_or_class ) : NIL;
        if( NIL != v_class )
        {
          result = class_set_property( v_class, $kw149$IMPLEMENTS_SLOT_LISTENERS, boolean_value );
        }
        else
        {
          result = NIL;
        }
      }
    }
    finally
    {
      $classes_new_class_current$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64819L)
  public static SubLObject classes_implements_p(final SubLObject target_class, final SubLObject parent_interface)
  {
    final SubLObject true_class = ( NIL != subloop_structures.class_p( target_class ) ) ? target_class : ( ( NIL != target_class && target_class.isSymbol() ) ? classes_retrieve_class( target_class ) : NIL );
    final SubLObject true_interface = ( NIL != subloop_structures.interface_p( parent_interface ) ) ? parent_interface
        : ( ( NIL != parent_interface && parent_interface.isSymbol() ) ? interfaces.interfaces_retrieve_interface( parent_interface ) : NIL );
    if( NIL != true_class && NIL != true_interface )
    {
      final SubLObject v_class = true_class;
      final SubLObject v_interfaces = subloop_structures.class_interfaces( v_class );
      final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path( v_class );
      if( NIL != conses_high.member( true_interface, v_interfaces, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      SubLObject cdolist_list_var = v_interfaces;
      SubLObject v_interface = NIL;
      v_interface = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != interfaces.interfaces_implements_p( v_interface, true_interface ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_interface = cdolist_list_var.first();
      }
      cdolist_list_var = compiled_inheritance_path.rest();
      SubLObject parent_class = NIL;
      parent_class = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != classes_implements_p( parent_class, true_interface ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        parent_class = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65703L)
  public static SubLObject classes_get_slot(final SubLObject v_class, final SubLObject slot_name)
  {
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      SubLObject association = NIL;
      association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_slot_access_alist( v_class ) );
      if( NIL != association )
      {
        return association;
      }
      association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
      if( NIL != association )
      {
        return association;
      }
      association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_class_slot_access_alist( v_class ) );
      if( NIL != association )
      {
        return association;
      }
      association = slots.slot_assoc( slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class ) );
      if( NIL != association )
      {
        return association;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66394L)
  public static SubLObject do_classes_in_order(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject base_class = NIL;
    SubLObject listed_optional_depth_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
    base_class = current.first();
    current = ( listed_optional_depth_var = current.rest() );
    final SubLObject forms;
    current = ( forms = temp );
    classes_utilities.classes_check_do_classes_in_order_parameters( var, base_class, listed_optional_depth_var, forms );
    final SubLObject stack_var = Symbols.make_symbol( $str151$stack );
    final SubLObject stack_element_var = Symbols.make_symbol( $str152$stack_element );
    final SubLObject actual_class_var = Symbols.make_symbol( $str153$actual_class );
    final SubLObject current_depth_var = ( NIL != listed_optional_depth_var ) ? listed_optional_depth_var.first() : Symbols.make_symbol( $str154$current_depth );
    return ConsesLow.list( $sym77$CLET, ConsesLow.list( ConsesLow.list( stack_var, ConsesLow.list( $sym155$LIST, ConsesLow.listS( $sym156$CONS, ConsesLow.list( $sym109$CLASSES_RETRIEVE_CLASS, base_class ),
        $list157 ) ) ), current_depth_var, stack_element_var, actual_class_var, var ), ConsesLow.list( $sym158$WHILE, stack_var, ConsesLow.list( $sym159$CSETQ, stack_element_var, ConsesLow.list( $sym61$CAR,
            stack_var ) ), ConsesLow.list( $sym160$CPOP, stack_var ), ConsesLow.list( $sym159$CSETQ, current_depth_var, ConsesLow.list( $sym161$CDR, stack_element_var ) ), ConsesLow.list( $sym159$CSETQ, actual_class_var,
                ConsesLow.list( $sym61$CAR, stack_element_var ) ), ConsesLow.list( $sym113$PWHEN, actual_class_var, ConsesLow.list( $sym159$CSETQ, var, ConsesLow.list( $sym144$CLASS_NAME, actual_class_var ) ), reader
                    .bq_cons( $sym44$PROGN, forms ), ConsesLow.list( $sym77$CLET, reader.bq_cons( ConsesLow.list( $sym162$NEXT_DEPTH, ConsesLow.listS( $sym163$_, current_depth_var, $list164 ) ), $list165 ), ConsesLow
                        .list( $sym166$CDOLIST, ConsesLow.list( $sym167$CHILD_CLASS, ConsesLow.list( $sym168$CLASS_SUBCLASSES, actual_class_var ) ), $list169, ConsesLow.list( $sym113$PWHEN, $sym170$ACTUAL_CHILD,
                            ConsesLow.list( $sym171$CPUSH, $list172, stack_var ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67604L)
  public static SubLObject classes_tab_to_depth(final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str173$__ );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( depth ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      PrintLow.format( stream, $str174$__ );
    }
    return depth;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67739L)
  public static SubLObject classes_display_class_name_at_depth(final SubLObject stream, final SubLObject class_name, final SubLObject depth)
  {
    classes_tab_to_depth( stream, depth );
    PrintLow.format( stream, $str175$_S_, class_name );
    return class_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 67911L)
  public static SubLObject classes_display_hierarchy(final SubLObject base_class_symbolic_name, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    SubLObject stack = ConsesLow.list( ConsesLow.cons( classes_retrieve_class( base_class_symbolic_name ), ZERO_INTEGER ) );
    SubLObject depth = NIL;
    SubLObject stack_element = NIL;
    SubLObject actual_class = NIL;
    SubLObject class_symbolic_name = NIL;
    while ( NIL != stack)
    {
      stack_element = stack.first();
      stack = stack.rest();
      depth = stack_element.rest();
      actual_class = stack_element.first();
      if( NIL != actual_class )
      {
        class_symbolic_name = subloop_structures.class_name( actual_class );
        classes_display_class_name_at_depth( stream, class_symbolic_name, depth );
        final SubLObject next_depth = Numbers.add( depth, ONE_INTEGER );
        SubLObject actual_child = NIL;
        SubLObject cdolist_list_var = subloop_structures.class_subclasses( actual_class );
        SubLObject child_class = NIL;
        child_class = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          actual_child = classes_retrieve_class( child_class );
          if( NIL != actual_child )
          {
            stack = ConsesLow.cons( ConsesLow.cons( actual_child, next_depth ), stack );
          }
          cdolist_list_var = cdolist_list_var.rest();
          child_class = cdolist_list_var.first();
        }
      }
    }
    return base_class_symbolic_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68187L)
  public static SubLObject subloop_type_p(final SubLObject class_or_class_name)
  {
    if( NIL == class_or_class_name )
    {
      return NIL;
    }
    if( class_or_class_name.isSymbol() )
    {
      final SubLObject v_class = classes_retrieve_class( class_or_class_name );
      if( NIL != v_class )
      {
        return T;
      }
      final SubLObject v_interface = interfaces.interfaces_retrieve_interface( class_or_class_name );
      return ( NIL != v_interface ) ? T : NIL;
    }
    else
    {
      if( NIL != subloop_structures.class_p( class_or_class_name ) )
      {
        return T;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 68595L)
  public static SubLObject classes_find_all_subclasses(final SubLObject class_or_class_name, SubLObject recursively)
  {
    if( recursively == UNPROVIDED )
    {
      recursively = T;
    }
    final SubLObject actual_class = class_or_class_name.isSymbol() ? classes_retrieve_class( class_or_class_name ) : ( ( NIL != subloop_structures.class_p( class_or_class_name ) ) ? class_or_class_name : NIL );
    if( NIL == actual_class )
    {
      return NIL;
    }
    final SubLObject direct_subclasses = conses_high.copy_list( subloop_structures.class_subclasses( actual_class ) );
    if( NIL != recursively )
    {
      SubLObject all_subclasses = conses_high.copy_list( direct_subclasses );
      SubLObject cdolist_list_var = direct_subclasses;
      SubLObject subclass = NIL;
      subclass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        all_subclasses = conses_high.union( all_subclasses, classes_find_all_subclasses( subclass, T ), UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        subclass = cdolist_list_var.first();
      }
      return ConsesLow.cons( subloop_structures.class_name( actual_class ), all_subclasses );
    }
    return ConsesLow.cons( subloop_structures.class_name( actual_class ), direct_subclasses );
  }

  public static SubLObject declare_classes_file()
  {
    SubLFiles.declareFunction( me, "classes_reset_class_table", "CLASSES-RESET-CLASS-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "classes_get_all_classes", "CLASSES-GET-ALL-CLASSES", 0, 0, false );
    SubLFiles.declareFunction( me, "classes_get_all_class_names", "CLASSES-GET-ALL-CLASS-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "classes_protection_greater_than_or_equal", "CLASSES-PROTECTION-GREATER-THAN-OR-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_set_always_generate_before_listeners", "CLASSES-SET-ALWAYS-GENERATE-BEFORE-LISTENERS", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_before_listeners_by_default_p", "CLASSES-BEFORE-LISTENERS-BY-DEFAULT-P", 0, 0, false );
    SubLFiles.declareFunction( me, "classes_set_always_generate_after_listeners", "CLASSES-SET-ALWAYS-GENERATE-AFTER-LISTENERS", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_after_listeners_by_default_p", "CLASSES-AFTER-LISTENERS-BY-DEFAULT-P", 0, 0, false );
    SubLFiles.declareFunction( me, "classes_getf", "CLASSES-GETF", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_putf", "CLASSES-PUTF", 3, 0, false );
    SubLFiles.declareFunction( me, "classes_implement_slot_listeners_p", "CLASSES-IMPLEMENT-SLOT-LISTENERS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_slot_property_p", "CLASSES-VALID-SLOT-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_list_of_valid_slot_properties_p", "CLASSES-LIST-OF-VALID-SLOT-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_list_of_valid_method_properties_p", "CLASSES-LIST-OF-VALID-METHOD-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_slot_name_p", "CLASSES-VALID-SLOT-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_slot_decl_p", "CLASSES-VALID-SLOT-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_method_property_p", "CLASSES-VALID-METHOD-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_method_properties_p", "CLASSES-VALID-METHOD-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_auto_update_p", "CLASSES-AUTO-UPDATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_no_member_variables_p", "CLASSES-NO-MEMBER-VARIABLES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_read_only_p", "CLASSES-READ-ONLY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_before_listeners_p", "CLASSES-BEFORE-LISTENERS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_after_listeners_p", "CLASSES-AFTER-LISTENERS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_method_interface_type_p", "CLASSES-VALID-METHOD-INTERFACE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_method_name_p", "CLASSES-VALID-METHOD-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_parameter_name_p", "CLASSES-VALID-PARAMETER-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_optional_parameter_p", "CLASSES-VALID-OPTIONAL-PARAMETER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_optional_parameter_list_p", "CLASSES-VALID-OPTIONAL-PARAMETER-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_lambda_list_p", "CLASSES-VALID-LAMBDA-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_method_interface_body_p", "CLASSES-VALID-METHOD-INTERFACE-BODY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_method_interface_decl_p", "CLASSES-VALID-METHOD-INTERFACE-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_method_decl_type", "CLASSES-METHOD-DECL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_class_method_decl_p", "CLASSES-CLASS-METHOD-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_instance_method_decl_p", "CLASSES-INSTANCE-METHOD-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_method_name_given_method_decl", "CLASSES-METHOD-NAME-GIVEN-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_lambda_list_given_method_decl", "CLASSES-LAMBDA-LIST-GIVEN-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_properties_given_method_decl", "CLASSES-PROPERTIES-GIVEN-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_slot_or_method_decl_p", "CLASSES-VALID-SLOT-OR-METHOD-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_slot_or_method_decls_p", "CLASSES-VALID-SLOT-OR-METHOD-DECLS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_must_be_valid_slot_or_method_decls", "CLASSES-MUST-BE-VALID-SLOT-OR-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_separate_decls_into_slot_decls_and_method_decls", "CLASSES-SEPARATE-DECLS-INTO-SLOT-DECLS-AND-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "class_separate_decls_into_class_and_instance_method_decls", "CLASS-SEPARATE-DECLS-INTO-CLASS-AND-INSTANCE-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "ldb_test", "LDB-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "display_class", "DISPLAY-CLASS", 1, 0, false );
    SubLFiles.declareMacro( me, "with_class_definition_lock", "WITH-CLASS-DEFINITION-LOCK" );
    SubLFiles.declareMacro( me, "with_class_access_lock", "WITH-CLASS-ACCESS-LOCK" );
    SubLFiles.declareFunction( me, "classes_retrieve_class", "CLASSES-RETRIEVE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_intern_class", "CLASSES-INTERN-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_delete_class", "CLASSES-DELETE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_set_class", "CLASSES-SET-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_get_class", "CLASSES-GET-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_class_property_p", "CLASSES-VALID-CLASS-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_instance_var_decl_p", "CLASSES-VALID-INSTANCE-VAR-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_instance_var_decls_p", "CLASSES-VALID-INSTANCE-VAR-DECLS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_class_name_p", "CLASSES-VALID-CLASS-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_must_be_valid_class_name", "CLASSES-MUST-BE-VALID-CLASS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_unique_elements", "CLASSES-UNIQUE-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_class", "NEW-CLASS", 4, 0, false );
    SubLFiles.declareFunction( me, "classes_make_slot_accessor_association", "CLASSES-MAKE-SLOT-ACCESSOR-ASSOCIATION", 3, 0, false );
    SubLFiles.declareMacro( me, "classes_slot_accessor_association_slot_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-SLOT-NAME" );
    SubLFiles.declareMacro( me, "classes_slot_accessor_association_getter_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-GETTER-NAME" );
    SubLFiles.declareMacro( me, "classes_slot_accessor_association_setter_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-SETTER-NAME" );
    SubLFiles.declareFunction( me, "classes_retrieve_slot_getter", "CLASSES-RETRIEVE-SLOT-GETTER", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_retrieve_slot_setter", "CLASSES-RETRIEVE-SLOT-SETTER", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_generate_slot_accessor_names", "CLASSES-GENERATE-SLOT-ACCESSOR-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_valid_class_properties_p", "CLASSES-VALID-CLASS-PROPERTIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "class_properties_must_be_valid", "CLASS-PROPERTIES-MUST-BE-VALID", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_interface_method_instantiations", "EXPAND-INTERFACE-METHOD-INSTANTIATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_accessors_for_class", "EXPAND-ACCESSORS-FOR-CLASS", 1, 1, false );
    SubLFiles.declareFunction( me, "expand_instance_any_slot_accessors", "EXPAND-INSTANCE-ANY-SLOT-ACCESSORS", 2, 1, false );
    SubLFiles.declareFunction( me, "expand_instance_boolean_slot_accessors", "EXPAND-INSTANCE-BOOLEAN-SLOT-ACCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_class_any_slot_accessors", "EXPAND-CLASS-ANY-SLOT-ACCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_class_boolean_slot_accessors", "EXPAND-CLASS-BOOLEAN-SLOT-ACCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_class_predicator", "EXPAND-CLASS-PREDICATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_class_initializer", "EXPAND-CLASS-INITIALIZER", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_instance_initializer", "EXPAND-INSTANCE-INITIALIZER", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_define_class", "EXPAND-DEFINE-CLASS", 3, 0, false );
    SubLFiles.declareMacro( me, "define_class", "DEFINE-CLASS" );
    SubLFiles.declareFunction( me, "subloop_new_class", "SUBLOOP-NEW-CLASS", 5, 0, false );
    SubLFiles.declareFunction( me, "subloop_initialize_slot", "SUBLOOP-INITIALIZE-SLOT", 4, 0, false );
    SubLFiles.declareFunction( me, "subloop_note_class_initialization_function", "SUBLOOP-NOTE-CLASS-INITIALIZATION-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_note_instance_initialization_function", "SUBLOOP-NOTE-INSTANCE-INITIALIZATION-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_instanceof_class", "SUBLOOP-INSTANCEOF-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_get_instance_slot", "SUBLOOP-GET-INSTANCE-SLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_get_access_protected_instance_slot", "SUBLOOP-GET-ACCESS-PROTECTED-INSTANCE-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_set_instance_slot", "SUBLOOP-SET-INSTANCE-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_set_access_protected_instance_slot", "SUBLOOP-SET-ACCESS-PROTECTED-INSTANCE-SLOT", 4, 0, false );
    SubLFiles.declareFunction( me, "classes_compile_inheritance_path", "CLASSES-COMPILE-INHERITANCE-PATH", 1, 1, false );
    SubLFiles.declareFunction( me, "classes_instance_slot_index", "CLASSES-INSTANCE-SLOT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_boolean_slot_decl_p", "CLASSES-BOOLEAN-SLOT-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_class_slot_decl_p", "CLASSES-CLASS-SLOT-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_instance_slot_decl_p", "CLASSES-INSTANCE-SLOT-DECL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_protection_level_of_slot_decl", "CLASSES-PROTECTION-LEVEL-OF-SLOT-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_essential_slot_p", "CLASSES-ESSENTIAL-SLOT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_value_of_slot_decl", "CLASSES-VALUE-OF-SLOT-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_slot_name_given_slot_decl", "CLASSES-SLOT-NAME-GIVEN-SLOT-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_compile_instance_slot_access_list", "CLASSES-COMPILE-INSTANCE-SLOT-ACCESS-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "classes_compile_instance_boolean_slot_access_list", "CLASSES-COMPILE-INSTANCE-BOOLEAN-SLOT-ACCESS-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "classes_compile_class_slot_access_list", "CLASSES-COMPILE-CLASS-SLOT-ACCESS-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "classes_compile_class_boolean_slot_access_list", "CLASSES-COMPILE-CLASS-BOOLEAN-SLOT-ACCESS-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "classes_initialize_class_slots", "CLASSES-INITIALIZE-CLASS-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "superclassp", "SUPERCLASSP", 2, 0, false );
    SubLFiles.declareFunction( me, "subclassp", "SUBCLASSP", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_access_check_class_slot", "CLASSES-ACCESS-CHECK-CLASS-SLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_class_slot", "GET-CLASS-SLOT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_class_slot", "SET-CLASS-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "classes_shadowed_association", "CLASSES-SHADOWED-ASSOCIATION", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_all_class_slots", "CLASSES-ALL-CLASS-SLOTS", 1, 1, false );
    SubLFiles.declareFunction( me, "classes_all_instance_slots", "CLASSES-ALL-INSTANCE-SLOTS", 1, 1, false );
    SubLFiles.declareFunction( me, "classes_all_any_instance_slots", "CLASSES-ALL-ANY-INSTANCE-SLOTS", 1, 1, false );
    SubLFiles.declareFunction( me, "classes_all_slots", "CLASSES-ALL-SLOTS", 1, 1, false );
    SubLFiles.declareMacro( me, "class_get_property_internal", "CLASS-GET-PROPERTY-INTERNAL" );
    SubLFiles.declareFunction( me, "class_get_property", "CLASS-GET-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "class_set_property_internal", "CLASS-SET-PROPERTY-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "class_set_property", "CLASS-SET-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "class_implements_slot_listeners_p", "CLASS-IMPLEMENTS-SLOT-LISTENERS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "class_set_implements_slot_listeners", "CLASS-SET-IMPLEMENTS-SLOT-LISTENERS", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_implements_p", "CLASSES-IMPLEMENTS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_get_slot", "CLASSES-GET-SLOT", 2, 0, false );
    SubLFiles.declareMacro( me, "do_classes_in_order", "DO-CLASSES-IN-ORDER" );
    SubLFiles.declareFunction( me, "classes_tab_to_depth", "CLASSES-TAB-TO-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "classes_display_class_name_at_depth", "CLASSES-DISPLAY-CLASS-NAME-AT-DEPTH", 3, 0, false );
    SubLFiles.declareFunction( me, "classes_display_hierarchy", "CLASSES-DISPLAY-HIERARCHY", 1, 1, false );
    SubLFiles.declareFunction( me, "subloop_type_p", "SUBLOOP-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_find_all_subclasses", "CLASSES-FIND-ALL-SUBCLASSES", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_classes_file()
  {
    $classes_class_slot_access_violation$ = SubLFiles.defconstant( "*CLASSES-CLASS-SLOT-ACCESS-VIOLATION*", $str0$Cannot_access__A_slot__S_from_cla );
    $classes_initial_hashtable_size$ = SubLFiles.defconstant( "*CLASSES-INITIAL-HASHTABLE-SIZE*", $int1$800 );
    $classes_class_table_update_lock$ = SubLFiles.defparameter( "*CLASSES-CLASS-TABLE-UPDATE-LOCK*", Locks.make_lock( $str2$Class_Table_Update_Lock ) );
    $classes_class_table$ = SubLFiles.deflexical( "*CLASSES-CLASS-TABLE*", maybeDefault( $sym3$_CLASSES_CLASS_TABLE_, $classes_class_table$, () -> ( Hashtables.make_hash_table( $classes_initial_hashtable_size$
        .getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ) );
    $classes_valid_class_properties$ = SubLFiles.defparameter( "*CLASSES-VALID-CLASS-PROPERTIES*", $list4 );
    $classes_valid_slot_properties$ = SubLFiles.defparameter( "*CLASSES-VALID-SLOT-PROPERTIES*", $list5 );
    $classes_valid_method_interface_types$ = SubLFiles.defparameter( "*CLASSES-VALID-METHOD-INTERFACE-TYPES*", $list6 );
    $classes_valid_method_properties$ = SubLFiles.defparameter( "*CLASSES-VALID-METHOD-PROPERTIES*", $list7 );
    $classes_always_generate_before_listeners$ = SubLFiles.deflexical( "*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*", ( maybeDefault( $sym8$_CLASSES_ALWAYS_GENERATE_BEFORE_LISTENERS_,
        $classes_always_generate_before_listeners$, NIL ) ) );
    $classes_always_generate_after_listeners$ = SubLFiles.deflexical( "*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*", ( maybeDefault( $sym9$_CLASSES_ALWAYS_GENERATE_AFTER_LISTENERS_,
        $classes_always_generate_after_listeners$, NIL ) ) );
    $classes_new_class_current$ = SubLFiles.defparameter( "*CLASSES-NEW-CLASS-CURRENT*", NIL );
    $curclass$ = SubLFiles.defparameter( "*CURCLASS*", NIL );
    return NIL;
  }

  public static SubLObject setup_classes_file()
  {
    subl_macro_promotions.declare_defglobal( $sym3$_CLASSES_CLASS_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym8$_CLASSES_ALWAYS_GENERATE_BEFORE_LISTENERS_ );
    subl_macro_promotions.declare_defglobal( $sym9$_CLASSES_ALWAYS_GENERATE_AFTER_LISTENERS_ );
    access_macros.register_macro_helper( $sym130$SUBLOOP_NEW_CLASS, $sym136$DEFINE_CLASS );
    access_macros.register_macro_helper( $sym122$SUBLOOP_INITIALIZE_SLOT, $sym136$DEFINE_CLASS );
    access_macros.register_macro_helper( $sym126$SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION, $sym136$DEFINE_CLASS );
    access_macros.register_macro_helper( $sym127$SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION, $sym136$DEFINE_CLASS );
    access_macros.register_macro_helper( $sym121$SUBLOOP_INSTANCEOF_CLASS, $sym136$DEFINE_CLASS );
    access_macros.register_macro_helper( $sym90$SUBLOOP_GET_INSTANCE_SLOT, $sym136$DEFINE_CLASS );
    access_macros.register_macro_helper( $sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, $sym136$DEFINE_CLASS );
    access_macros.register_macro_helper( $sym91$SUBLOOP_SET_INSTANCE_SLOT, $sym136$DEFINE_CLASS );
    access_macros.register_macro_helper( $sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, $sym136$DEFINE_CLASS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_classes_file();
  }

  @Override
  public void initializeVariables()
  {
    init_classes_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_classes_file();
  }
  static
  {
    me = new classes();
    $classes_class_slot_access_violation$ = null;
    $classes_initial_hashtable_size$ = null;
    $classes_class_table_update_lock$ = null;
    $classes_class_table$ = null;
    $classes_valid_class_properties$ = null;
    $classes_valid_slot_properties$ = null;
    $classes_valid_method_interface_types$ = null;
    $classes_valid_method_properties$ = null;
    $classes_always_generate_before_listeners$ = null;
    $classes_always_generate_after_listeners$ = null;
    $classes_new_class_current$ = null;
    $curclass$ = null;
    $str0$Cannot_access__A_slot__S_from_cla = makeString( "Cannot access ~A slot ~S from class ~S." );
    $int1$800 = makeInteger( 800 );
    $str2$Class_Table_Update_Lock = makeString( "Class Table Update Lock" );
    $sym3$_CLASSES_CLASS_TABLE_ = makeSymbol( "*CLASSES-CLASS-TABLE*" );
    $list4 = ConsesLow.list( makeKeyword( "EXTENDS" ), makeKeyword( "IMPLEMENTS" ), makeKeyword( "SLOT-LISTENERS" ), makeKeyword( "SYNCHRONIZED-SLOTS" ), makeKeyword( "ABSTRACT" ) );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "PRIVATE" ), makeKeyword( "PROTECTED" ), makeKeyword( "PUBLIC" ), makeKeyword( "FILE-SCOPE" ), makeKeyword( "SYSTEM-SCOPE" ), makeKeyword( "GLOBAL-SCOPE" ),
      makeKeyword( "CLASS" ), makeKeyword( "INSTANCE" ), makeKeyword( "BOOLEAN" ), makeKeyword( "VALUE" ), makeKeyword( "ESSENTIAL" ), makeKeyword( "NON-ESSENTAIL" )
    } );
    $list6 = ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEF-CLASS-METHOD" ) );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "PRIVATE" ), makeKeyword( "PROTECTED" ), makeKeyword( "PUBLIC" ), makeKeyword( "FILE-SCOPE" ), makeKeyword( "SYSTEM-SCOPE" ), makeKeyword( "GLOBAL-SCOPE" ),
      makeKeyword( "DEFAULT" ), makeKeyword( "AUTO-UPDATE" ), makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "READ-ONLY" ), makeKeyword( "BEFORE-LISTENERS" ), makeKeyword( "AFTER-LISTENERS" ), makeKeyword(
          "INSTANTIATE-TEMPLATE" )
    } );
    $sym8$_CLASSES_ALWAYS_GENERATE_BEFORE_LISTENERS_ = makeSymbol( "*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*" );
    $sym9$_CLASSES_ALWAYS_GENERATE_AFTER_LISTENERS_ = makeSymbol( "*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*" );
    $kw10$SLOT_LISTENERS = makeKeyword( "SLOT-LISTENERS" );
    $kw11$VALUE = makeKeyword( "VALUE" );
    $kw12$AUTO_UPDATE = makeKeyword( "AUTO-UPDATE" );
    $kw13$NO_MEMBER_VARIABLES = makeKeyword( "NO-MEMBER-VARIABLES" );
    $kw14$READ_ONLY = makeKeyword( "READ-ONLY" );
    $kw15$BEFORE_LISTENERS = makeKeyword( "BEFORE-LISTENERS" );
    $kw16$AFTER_LISTENERS = makeKeyword( "AFTER-LISTENERS" );
    $sym17$_OPTIONAL = makeSymbol( "&OPTIONAL" );
    $sym18$DEF_CLASS_METHOD = makeSymbol( "DEF-CLASS-METHOD" );
    $sym19$DEF_INSTANCE_METHOD = makeSymbol( "DEF-INSTANCE-METHOD" );
    $str20$_S_is_an_invalid_class_declaratio = makeString( "~S is an invalid class declaration body." );
    $str21$_S_is_neither_a_valid_slot_nor_va = makeString( "~S is neither a valid slot nor valid method interface declaration." );
    $str22$__class_name_____S = makeString( "~%class-name -> ~S" );
    $str23$__parent_____S = makeString( "~%parent -> ~S" );
    $str24$__subclasses_____S = makeString( "~%subclasses -> ~S" );
    $str25$__interface_names_____S = makeString( "~%interface-names -> ~S" );
    $str26$__interfaces_____S = makeString( "~%interfaces -> ~S" );
    $str27$__compiled_inheritance_path_____S = makeString( "~%compiled-inheritance-path -> ~S" );
    $str28$__instance_var_decls_____S = makeString( "~%instance-var-decls -> ~S" );
    $str29$__class_var_decls_____S = makeString( "~%class-var-decls -> ~S" );
    $str30$__compiled_instance_slot_access_a = makeString( "~%compiled-instance-slot-access-alist -> ~S" );
    $str31$__compiled_instance_boolean_slot_ = makeString( "~%compiled-instance-boolean-slot-access-alist -> ~S" );
    $str32$__compiled_class_slot_access_alis = makeString( "~%compiled-class-slot-access-alist -> ~S" );
    $str33$__compiled_class_boolean_slot_acc = makeString( "~%compiled-class-boolean-slot-access-alist -> ~S" );
    $str34$__slot_accessor_alist_____S = makeString( "~%slot-accessor-alist -> ~S" );
    $str35$__instance_method_decls_____S = makeString( "~%instance-method-decls -> ~S" );
    $str36$__class_method_decls_____S = makeString( "~%class-method-decls -> ~S" );
    $str37$__boolean_slots_____S = makeString( "~%boolean-slots -> ~S" );
    $str38$__any_slots_____S = makeString( "~%any-slots -> ~S" );
    $str39$__compiled_instance_method_access = makeString( "~%compiled-instance-method-access-alist -> ~S" );
    $str40$__compiled_class_method_access_al = makeString( "~%compiled-class-method-access-alist -> ~S" );
    $str41$__class_initialization_function__ = makeString( "~%class-initialization-function -> ~S" );
    $str42$__class_initialized_p_____S = makeString( "~%class-initialized-p -> ~S" );
    $list43 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym44$PROGN = makeSymbol( "PROGN" );
    $sym45$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym46$CLASS_ACCESS_LOCK = makeSymbol( "CLASS-ACCESS-LOCK" );
    $sym47$SUBLISP_CLASS_STRUCTURE = makeSymbol( "SUBLISP-CLASS-STRUCTURE" );
    $str48$_S_is_not_a_valid_class_name_ = makeString( "~S is not a valid class name." );
    $str49$NEW_CLASS__A_class_cannot_be_its_ = makeString( "NEW-CLASS: A class cannot be its own superclass.  ~S can not extend ~S." );
    $str50$NEW_CLASS__A_class_cannot_subclas = makeString( "NEW-CLASS: A class cannot subclass its own subclass.  ~S is a subclass of ~S." );
    $sym51$OBJECT = makeSymbol( "OBJECT" );
    $sym52$ON_DESTROY_CLASS = makeSymbol( "ON-DESTROY-CLASS" );
    $str53$Class_ = makeString( "Class " );
    $str54$_Definition_Lock = makeString( " Definition Lock" );
    $str55$_Access_Lock = makeString( " Access Lock" );
    $str56$SUBLOOP_RESERVED_INITIALIZE_ = makeString( "SUBLOOP-RESERVED-INITIALIZE-" );
    $str57$_CLASS = makeString( "-CLASS" );
    $str58$_INSTANCE = makeString( "-INSTANCE" );
    $sym59$CADR = makeSymbol( "CADR" );
    $list60 = ConsesLow.list( makeSymbol( "SLOT-ACCESSOR-ASSOCIATION" ) );
    $sym61$CAR = makeSymbol( "CAR" );
    $sym62$CDDR = makeSymbol( "CDDR" );
    $str63$GET_ = makeString( "GET-" );
    $str64$_ = makeString( "-" );
    $str65$SET_ = makeString( "SET-" );
    $str66$___S_is_not_a_valid_class_propert = makeString(
        "~%~S is not a valid class property list.  A class property list~\n     ~%must be a sequence of :extend followed by a class or :implements~\n     ~%followed by an interface or a list of interfaces." );
    $str67$___S_is_not_a_valid_class_propert = makeString(
        "~%~S is not a valid class property.~%If you wish to extend a class used :extend.~\n                   ~%If you wish to implement an interface, use :implements." );
    $str68$___S_is_not_a_valid_class_propert = makeString( "~%~S is not a valid class property.~%Only :extends and :implements are valid class properties." );
    $kw69$EXTENDS = makeKeyword( "EXTENDS" );
    $str70$___S_is_not_a_valid_value_for_the = makeString( "~%~S is not a valid value for the :extends class property." );
    $str71$__Attempting_to_subclass_unknown_ = makeString( "~%Attempting to subclass unknown class ~S." );
    $kw72$IMPLEMENTS = makeKeyword( "IMPLEMENTS" );
    $str73$___S_is_not_a_valid_value_for_the = makeString( "~%~S is not a valid value for the :implements class property." );
    $list74 = ConsesLow.cons( makeSymbol( "GETTER" ), makeSymbol( "SETTER" ) );
    $kw75$PUBLIC = makeKeyword( "PUBLIC" );
    $sym76$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym77$CLET = makeSymbol( "CLET" );
    $sym78$NEW_VALUE = makeSymbol( "NEW-VALUE" );
    $sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT = makeSymbol( "SUBLOOP-GET-ACCESS-PROTECTED-INSTANCE-SLOT" );
    $sym80$QUOTE = makeSymbol( "QUOTE" );
    $sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS = makeSymbol( "SLOT-LISTENERS-FAST-FIRE-ALL-SLOT-LISTENERS" );
    $kw82$SLOT_GETTER_REGISTRY = makeKeyword( "SLOT-GETTER-REGISTRY" );
    $list83 = ConsesLow.list( makeSymbol( "NEW-VALUE" ) );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-VALUE" ) ) );
    $list85 = ConsesLow.list( makeSymbol( "VALUE" ) );
    $sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT = makeSymbol( "SUBLOOP-SET-ACCESS-PROTECTED-INSTANCE-SLOT" );
    $sym87$VALUE = makeSymbol( "VALUE" );
    $kw88$SLOT_SETTER_REGISTRY = makeKeyword( "SLOT-SETTER-REGISTRY" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "VALUE" ) ) );
    $sym90$SUBLOOP_GET_INSTANCE_SLOT = makeSymbol( "SUBLOOP-GET-INSTANCE-SLOT" );
    $sym91$SUBLOOP_SET_INSTANCE_SLOT = makeSymbol( "SUBLOOP-SET-INSTANCE-SLOT" );
    $sym92$RET = makeSymbol( "RET" );
    $str93$class = makeString( "class" );
    $str94$slot = makeString( "slot" );
    $sym95$INSTANCE_CLASS = makeSymbol( "INSTANCE-CLASS" );
    $sym96$SLOT_ASSOC = makeSymbol( "SLOT-ASSOC" );
    $sym97$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol( "CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" );
    $sym98$INSTANCES_ACCESS_CHECK_INSTANCE_SLOT = makeSymbol( "INSTANCES-ACCESS-CHECK-INSTANCE-SLOT" );
    $sym99$LDB_TEST = makeSymbol( "LDB-TEST" );
    $sym100$INSTANCE_BOOLEAN_SLOTS = makeSymbol( "INSTANCE-BOOLEAN-SLOTS" );
    $sym101$CSETF = makeSymbol( "CSETF" );
    $sym102$DPB = makeSymbol( "DPB" );
    $list103 = ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "VALUE" ), ONE_INTEGER, ZERO_INTEGER );
    $sym104$CLASSES_ACCESS_CHECK_CLASS_SLOT = makeSymbol( "CLASSES-ACCESS-CHECK-CLASS-SLOT" );
    $sym105$CLASS = makeSymbol( "CLASS" );
    $list106 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST" ), makeSymbol( "CLASS" ) ) );
    $sym107$FIF = makeSymbol( "FIF" );
    $sym108$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym109$CLASSES_RETRIEVE_CLASS = makeSymbol( "CLASSES-RETRIEVE-CLASS" );
    $sym110$CLASS_P = makeSymbol( "CLASS-P" );
    $sym111$INSTANCE_P = makeSymbol( "INSTANCE-P" );
    $list112 = ConsesLow.list( NIL );
    $sym113$PWHEN = makeSymbol( "PWHEN" );
    $sym114$AREF = makeSymbol( "AREF" );
    $list115 = ConsesLow.list( makeSymbol( "CLASS-ANY-SLOTS" ), makeSymbol( "CLASS" ) );
    $list116 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym117$SET_AREF = makeSymbol( "SET-AREF" );
    $list118 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-BOOLEAN-SLOTS" ), makeSymbol( "CLASS" ) ) );
    $list119 = ConsesLow.list( makeSymbol( "CLASS-BOOLEAN-SLOTS" ), makeSymbol( "CLASS" ) );
    $str120$_P = makeString( "-P" );
    $sym121$SUBLOOP_INSTANCEOF_CLASS = makeSymbol( "SUBLOOP-INSTANCEOF-CLASS" );
    $sym122$SUBLOOP_INITIALIZE_SLOT = makeSymbol( "SUBLOOP-INITIALIZE-SLOT" );
    $sym123$NEW_INSTANCE = makeSymbol( "NEW-INSTANCE" );
    $sym124$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $list125 = ConsesLow.list( makeSymbol( "NEW-INSTANCE" ) );
    $sym126$SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION = makeSymbol( "SUBLOOP-NOTE-CLASS-INITIALIZATION-FUNCTION" );
    $sym127$SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION = makeSymbol( "SUBLOOP-NOTE-INSTANCE-INITIALIZATION-FUNCTION" );
    $str128$___S_is_not_a_valid_class_name_ = makeString( "~%~S is not a valid class name." );
    $str129$___S_is_not_a_valid_member_variab = makeString( "~%~S is not a valid member variable and method decl list." );
    $sym130$SUBLOOP_NEW_CLASS = makeSymbol( "SUBLOOP-NEW-CLASS" );
    $kw131$ABSTRACT = makeKeyword( "ABSTRACT" );
    $sym132$CLASS_SET_IMPLEMENTS_SLOT_LISTENERS = makeSymbol( "CLASS-SET-IMPLEMENTS-SLOT-LISTENERS" );
    $list133 = ConsesLow.list( T );
    $list134 = ConsesLow.list( makeSymbol( "CLASS-NAME-AND-PROPERTIES" ), makeSymbol( "&BODY" ), makeSymbol( "SLOT-DECLS" ) );
    $list135 = ConsesLow.cons( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS-PROPERTIES" ) );
    $sym136$DEFINE_CLASS = makeSymbol( "DEFINE-CLASS" );
    $kw137$BOOLEAN = makeKeyword( "BOOLEAN" );
    $kw138$CLASS = makeKeyword( "CLASS" );
    $kw139$INSTANCE = makeKeyword( "INSTANCE" );
    $kw140$PRIVATE = makeKeyword( "PRIVATE" );
    $kw141$PROTECTED = makeKeyword( "PROTECTED" );
    $kw142$ESSENTIAL = makeKeyword( "ESSENTIAL" );
    $kw143$NON_ESSENTIAL = makeKeyword( "NON-ESSENTIAL" );
    $sym144$CLASS_NAME = makeSymbol( "CLASS-NAME" );
    $list145 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "INDICATOR" ) );
    $sym146$CLASSES_GETF = makeSymbol( "CLASSES-GETF" );
    $sym147$CLASS_PLIST = makeSymbol( "CLASS-PLIST" );
    $sym148$CLASSES_PUTF = makeSymbol( "CLASSES-PUTF" );
    $kw149$IMPLEMENTS_SLOT_LISTENERS = makeKeyword( "IMPLEMENTS-SLOT-LISTENERS" );
    $list150 = ConsesLow.list( ConsesLow.listS( makeSymbol( "VAR" ), makeSymbol( "BASE-CLASS" ), makeSymbol( "LISTED-OPTIONAL-DEPTH-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str151$stack = makeString( "stack" );
    $str152$stack_element = makeString( "stack-element" );
    $str153$actual_class = makeString( "actual-class" );
    $str154$current_depth = makeString( "current-depth" );
    $sym155$LIST = makeSymbol( "LIST" );
    $sym156$CONS = makeSymbol( "CONS" );
    $list157 = ConsesLow.list( ZERO_INTEGER );
    $sym158$WHILE = makeSymbol( "WHILE" );
    $sym159$CSETQ = makeSymbol( "CSETQ" );
    $sym160$CPOP = makeSymbol( "CPOP" );
    $sym161$CDR = makeSymbol( "CDR" );
    $sym162$NEXT_DEPTH = makeSymbol( "NEXT-DEPTH" );
    $sym163$_ = makeSymbol( "+" );
    $list164 = ConsesLow.list( ONE_INTEGER );
    $list165 = ConsesLow.list( makeSymbol( "ACTUAL-CHILD" ) );
    $sym166$CDOLIST = makeSymbol( "CDOLIST" );
    $sym167$CHILD_CLASS = makeSymbol( "CHILD-CLASS" );
    $sym168$CLASS_SUBCLASSES = makeSymbol( "CLASS-SUBCLASSES" );
    $list169 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ACTUAL-CHILD" ), ConsesLow.list( makeSymbol( "CLASSES-RETRIEVE-CLASS" ), makeSymbol( "CHILD-CLASS" ) ) );
    $sym170$ACTUAL_CHILD = makeSymbol( "ACTUAL-CHILD" );
    $sym171$CPUSH = makeSymbol( "CPUSH" );
    $list172 = ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "ACTUAL-CHILD" ), makeSymbol( "NEXT-DEPTH" ) );
    $str173$__ = makeString( "~%" );
    $str174$__ = makeString( "| " );
    $str175$_S_ = makeString( "~S:" );
  }
}
/*
 * 
 * Total time: 727 ms
 * 
 */