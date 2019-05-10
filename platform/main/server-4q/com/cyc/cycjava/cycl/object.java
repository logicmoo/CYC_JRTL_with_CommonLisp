package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class object
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.object";
  public static final String myFingerPrint = "a3b3fcf8b6dfc431354b16fbca99d4f2cc6866a5846d5a03f2781e5d0c3185c8";
  private static final SubLSymbol $sym0$OBJECT;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$INSTANCE_NUMBER;
  private static final SubLInteger $int3$4096;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_OBJECT_CLASS;
  private static final SubLSymbol $sym6$ISOLATED_P;
  private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_OBJECT_INSTANCE;
  private static final SubLSymbol $sym8$NEW;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$INITIALIZE;
  private static final SubLSymbol $sym12$OBJECT_NEW_METHOD;
  private static final SubLSymbol $sym13$CLASS_OF;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$OBJECT_CLASS_OF_METHOD;
  private static final SubLSymbol $sym16$DESCRIBE_CLASS;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLString $str19$;
  private static final SubLString $str20$__;
  private static final SubLString $str21$___ADescription_of_class__S_;
  private static final SubLString $str22$___A_S_____S;
  private static final SubLSymbol $sym23$OBJECT_DESCRIBE_CLASS_METHOD;
  private static final SubLSymbol $sym24$PARENT_CLASS;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$OBJECT_PARENT_CLASS_METHOD;
  private static final SubLSymbol $sym27$CHILD_CLASSES;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$OBJECT_CHILD_CLASSES_METHOD;
  private static final SubLSymbol $sym30$IMPLEMENTS_METHOD_P;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$OBJECT_IMPLEMENTS_METHOD_P_METHOD;
  private static final SubLSymbol $sym35$METHOD_LAMBDA_LIST;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$OBJECT_METHOD_LAMBDA_LIST_METHOD;
  private static final SubLSymbol $sym38$HAS_SLOT_P;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$OBJECT_HAS_SLOT_P_METHOD;
  private static final SubLSymbol $sym42$ON_DESTROY_CLASS;
  private static final SubLSymbol $sym43$OBJECT_ON_DESTROY_CLASS_METHOD;
  private static final SubLSymbol $sym44$CFASL_INPUT;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$INTEGERP;
  private static final SubLSymbol $sym49$SYMBOLP;
  private static final SubLSymbol $sym50$INLINE_SET_SLOT;
  private static final SubLSymbol $sym51$QUOTE;
  private static final SubLSymbol $sym52$OBJECT_CFASL_INPUT_METHOD;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$OBJECT_INITIALIZE_METHOD;
  private static final SubLSymbol $sym55$PRINT;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$OUTER_CATCH_FOR_OBJECT_METHOD;
  private static final SubLString $str59$___S__S_;
  private static final SubLString $str60$__Malformed_Instance_;
  private static final SubLSymbol $sym61$OBJECT_PRINT_METHOD;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$OBJECT_EQUAL_METHOD;
  private static final SubLSymbol $sym65$ESSENTIALLY_EQUAL;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$OBJECT_ESSENTIALLY_EQUAL_METHOD;
  private static final SubLSymbol $sym69$CLONE;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$OBJECT_CLONE_METHOD;
  private static final SubLSymbol $sym72$DESCRIBE_INSTANCE;
  private static final SubLList $list73;
  private static final SubLString $str74$___ADescription_of_instance__S_;
  private static final SubLSymbol $sym75$OBJECT_DESCRIBE_INSTANCE_METHOD;
  private static final SubLSymbol $sym76$CFASL_OUTPUT;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$SLOT_NAME;
  private static final SubLSymbol $sym80$INLINE_GET_SLOT;
  private static final SubLSymbol $sym81$OBJECT_CFASL_OUTPUT_METHOD;
  private static final SubLSymbol $sym82$ADD_GET_SLOT_LISTENER;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLString $str85$_ADD_GET_SLOT_LISTENER_OBJECT___t;
  private static final SubLString $str86$_ADD_GET_SLOT_LISTENER_OBJECT___t;
  private static final SubLString $str87$_ADD_GET_SLOT_LISTENER_OBJECT___m;
  private static final SubLSymbol $kw88$GET;
  private static final SubLSymbol $sym89$OBJECT_ADD_GET_SLOT_LISTENER_METHOD;
  private static final SubLSymbol $sym90$ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE;
  private static final SubLList $list91;
  private static final SubLList $list92;
  private static final SubLString $str93$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str94$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str95$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLSymbol $sym96$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD;
  private static final SubLSymbol $sym97$ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE;
  private static final SubLList $list98;
  private static final SubLList $list99;
  private static final SubLString $str100$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str101$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str102$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str103$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLSymbol $sym104$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD;
  private static final SubLSymbol $sym105$ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM;
  private static final SubLList $list106;
  private static final SubLList $list107;
  private static final SubLString $str108$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str109$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str110$_ADD_GET_SLOT_LISTENER_STIMULATED;
  private static final SubLSymbol $sym111$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD;
  private static final SubLSymbol $sym112$ADD_SET_SLOT_LISTENER;
  private static final SubLList $list113;
  private static final SubLString $str114$_ADD_SET_SLOT_LISTENER_OBJECT___t;
  private static final SubLString $str115$_ADD_SET_SLOT_LISTENER_OBJECT___t;
  private static final SubLString $str116$_ADD_SET_SLOT_LISTENER_OBJECT___m;
  private static final SubLSymbol $kw117$SET;
  private static final SubLSymbol $sym118$OBJECT_ADD_SET_SLOT_LISTENER_METHOD;
  private static final SubLSymbol $sym119$ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE;
  private static final SubLList $list120;
  private static final SubLString $str121$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str122$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str123$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLSymbol $sym124$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD;
  private static final SubLSymbol $sym125$ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE;
  private static final SubLList $list126;
  private static final SubLString $str127$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str128$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str129$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str130$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLSymbol $sym131$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD;
  private static final SubLSymbol $sym132$ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM;
  private static final SubLList $list133;
  private static final SubLString $str134$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str135$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLString $str136$_ADD_SET_SLOT_LISTENER_STIMULATED;
  private static final SubLSymbol $sym137$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD;
  private static final SubLSymbol $sym138$REMOVE_ALL_GET_SLOT_LISTENERS;
  private static final SubLList $list139;
  private static final SubLList $list140;
  private static final SubLString $str141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB;
  private static final SubLString $str142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB;
  private static final SubLSymbol $sym143$OBJECT_REMOVE_ALL_GET_SLOT_LISTENERS_METHOD;
  private static final SubLSymbol $sym144$REMOVE_ALL_SET_SLOT_LISTENERS;
  private static final SubLList $list145;
  private static final SubLString $str146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB;
  private static final SubLString $str147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB;
  private static final SubLSymbol $sym148$OBJECT_REMOVE_ALL_SET_SLOT_LISTENERS_METHOD;
  private static final SubLSymbol $sym149$REMOVE_ALL_SLOT_LISTENERS;
  private static final SubLList $list150;
  private static final SubLString $str151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT;
  private static final SubLString $str152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT;
  private static final SubLSymbol $sym153$OBJECT_REMOVE_ALL_SLOT_LISTENERS_METHOD;
  private static final SubLSymbol $sym154$ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER;
  private static final SubLList $list155;
  private static final SubLList $list156;
  private static final SubLString $str157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS;
  private static final SubLString $str158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS;
  private static final SubLString $str159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS;
  private static final SubLSymbol $sym160$OBJECT_ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER_METHOD;
  private static final SubLSymbol $sym161$ADD_CLASS_WIDE_AFTER_METHOD_LISTENER;
  private static final SubLList $list162;
  private static final SubLString $str163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST;
  private static final SubLString $str164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST;
  private static final SubLString $str165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST;
  private static final SubLSymbol $sym166$OBJECT_ADD_CLASS_WIDE_AFTER_METHOD_LISTENER_METHOD;
  private static final SubLSymbol $sym167$REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS;
  private static final SubLList $list168;
  private static final SubLList $list169;
  private static final SubLString $str170$_REMOVE_CLASS_WIDE_METHOD_LISTENE;
  private static final SubLString $str171$_REMOVE_CLASS_WIDE_METHOD_LISTENE;
  private static final SubLSymbol $sym172$OBJECT_REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS_METHOD;
  private static final SubLSymbol $sym173$ISOLATE;
  private static final SubLList $list174;
  private static final SubLSymbol $sym175$OUTER_CATCH_FOR_OBJECT_METHOD;
  private static final SubLSymbol $sym176$OBJECT_ISOLATE_METHOD;
  private static final SubLSymbol $sym177$PLISTIFY;
  private static final SubLList $list178;
  private static final SubLSymbol $kw179$TEST;
  private static final SubLSymbol $sym180$OBJECT_PLISTIFY_METHOD;
  private static final SubLSymbol $sym181$LISTIFY;
  private static final SubLList $list182;
  private static final SubLSymbol $sym183$OUTER_CATCH_FOR_OBJECT_METHOD;
  private static final SubLSymbol $sym184$OBJECT_LISTIFY_METHOD;
  private static final SubLSymbol $sym185$ASSIMILATE;
  private static final SubLList $list186;
  private static final SubLList $list187;
  private static final SubLList $list188;
  private static final SubLString $str189$_ASSIMILATE__S____S_is_not_a_vali;
  private static final SubLSymbol $sym190$OBJECT_ASSIMILATE_METHOD;
  private static final SubLString $str191$NEW_SUBLOOPS_INSTANCE___S_is_neit;
  private static final SubLString $str192$CREATE_OBJECT_FROM_LIST___S_is_no;
  private static final SubLList $list193;
  private static final SubLString $str194$CREATE_OBJECT_FROM_LIST___S_does_;
  private static final SubLList $list195;
  private static final SubLList $list196;
  private static final SubLSymbol $kw197$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw198$NUMBER;
  private static final SubLSymbol $kw199$IDENTITY;
  private static final SubLString $str200$INSTANCE;
  private static final SubLString $str201$STREAM;
  private static final SubLSymbol $sym202$PROGN;
  private static final SubLSymbol $sym203$CHECK_TYPE;
  private static final SubLList $list204;
  private static final SubLSymbol $sym205$CLET;
  private static final SubLSymbol $sym206$PRINT_UNREADABLE_OBJECT;
  private static final SubLSymbol $sym207$PRINC;
  private static final SubLSymbol $sym208$CLASS_NAME;
  private static final SubLSymbol $sym209$INSTANCE_CLASS;
  private static final SubLSymbol $sym210$PWHEN;
  private static final SubLSymbol $sym211$FORMAT;
  private static final SubLString $str212$__A;
  private static final SubLSymbol $sym213$GET_OBJECT_INSTANCE_NUMBER;
  private static final SubLSymbol $sym214$WRITE_CHAR;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject get_object_instance_number(final SubLObject v_object)
  {
    return classes.subloop_get_access_protected_instance_slot( v_object, ZERO_INTEGER, $sym2$INSTANCE_NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject set_object_instance_number(final SubLObject v_object, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_object, value, ZERO_INTEGER, $sym2$INSTANCE_NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject get_object_isolated_p(final SubLObject v_object)
  {
    return classes.ldb_test( $int3$4096, subloop_structures.instance_boolean_slots( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject set_object_isolated_p(final SubLObject v_object, final SubLObject value)
  {
    subloop_structures._csetf_instance_boolean_slots( v_object, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int3$4096, subloop_structures.instance_boolean_slots( v_object ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject get_object_instance_count(final SubLObject v_object)
  {
    final SubLObject v_class = v_object.isSymbol() ? classes.classes_retrieve_class( v_object )
        : ( ( NIL != subloop_structures.class_p( v_object ) ) ? v_object : ( ( NIL != subloop_structures.instance_p( v_object ) ) ? subloop_structures.instance_class( v_object ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym4$INSTANCE_COUNT, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ZERO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject set_object_instance_count(final SubLObject v_object, final SubLObject value)
  {
    final SubLObject v_class = v_object.isSymbol() ? classes.classes_retrieve_class( v_object )
        : ( ( NIL != subloop_structures.class_p( v_object ) ) ? v_object : ( ( NIL != subloop_structures.instance_p( v_object ) ) ? subloop_structures.instance_class( v_object ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym4$INSTANCE_COUNT, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ZERO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject subloop_reserved_initialize_object_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym0$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject subloop_reserved_initialize_object_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym0$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$OBJECT, $sym2$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2363L)
  public static SubLObject object_p(final SubLObject v_object)
  {
    return classes.subloop_instanceof_class( v_object, $sym0$OBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5741L)
  public static SubLObject object_new_method(final SubLObject self)
  {
    SubLObject instance_count = get_object_instance_count( self );
    if( NIL != instance_count )
    {
      instance_count = Numbers.add( instance_count, ONE_INTEGER );
      set_object_instance_count( self, instance_count );
    }
    else
    {
      instance_count = ZERO_INTEGER;
      set_object_instance_count( self, instance_count );
    }
    final SubLObject instance = instances.new_instance( self );
    methods.funcall_instance_method_with_0_args( instance, $sym11$INITIALIZE );
    return instance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5986L)
  public static SubLObject object_class_of_method(final SubLObject self)
  {
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6040L)
  public static SubLObject object_describe_class_method(final SubLObject self, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    final SubLObject all_class_slots = classes.classes_all_class_slots( self, UNPROVIDED );
    final SubLObject tab = depth.isZero() ? $str19$ : Strings.make_string( Numbers.multiply( depth, TWO_INTEGER ), UNPROVIDED );
    final SubLObject slot_tab = depth.isZero() ? $str20$__ : Strings.make_string( Numbers.add( Numbers.multiply( depth, TWO_INTEGER ), TWO_INTEGER ), UNPROVIDED );
    PrintLow.format( stream, $str21$___ADescription_of_class__S_, tab, subloop_structures.class_name( self ) );
    SubLObject cdolist_list_var = all_class_slots;
    SubLObject class_slot = NIL;
    class_slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str22$___A_S_____S, new SubLObject[] { slot_tab, class_slot, instances.get_slot( self, class_slot )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      class_slot = cdolist_list_var.first();
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6519L)
  public static SubLObject object_parent_class_method(final SubLObject self)
  {
    final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path( self );
    if( NIL != compiled_inheritance_path && NIL != compiled_inheritance_path.rest() )
    {
      return conses_high.cadr( compiled_inheritance_path );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6781L)
  public static SubLObject object_child_classes_method(final SubLObject self)
  {
    final SubLObject subclass_names = subloop_structures.class_subclasses( self );
    if( NIL != subclass_names )
    {
      SubLObject subclasses = NIL;
      SubLObject subclass = NIL;
      SubLObject cdolist_list_var = subclass_names;
      SubLObject subclass_name = NIL;
      subclass_name = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        subclass = classes.classes_retrieve_class( subclass_name );
        if( NIL != subclass )
        {
          subclasses = ConsesLow.cons( subclass, subclasses );
        }
        cdolist_list_var = cdolist_list_var.rest();
        subclass_name = cdolist_list_var.first();
      }
      return Sequences.nreverse( subclasses );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7156L)
  public static SubLObject object_implements_method_p_method(final SubLObject self, final SubLObject method_name)
  {
    final SubLObject my_class = ( NIL != subloop_structures.class_p( self ) ) ? self : subloop_structures.instance_class( self );
    final SubLObject instance_method_access_list = subloop_structures.class_compiled_instance_method_access_alist( my_class );
    final SubLObject class_method_access_list = subloop_structures.class_compiled_class_method_access_alist( my_class );
    return ( NIL != methods.method_assoc( method_name, instance_method_access_list ) ) ? T : ( ( NIL != methods.method_assoc( method_name, class_method_access_list ) ) ? T : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7632L)
  public static SubLObject object_method_lambda_list_method(final SubLObject self, final SubLObject method_name)
  {
    SubLObject method = methods.method_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( self ) );
    if( NIL == method )
    {
      method = methods.method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( self ) );
    }
    return subloop_structures.method_lambda_list( method );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7955L)
  public static SubLObject object_has_slot_p_method(final SubLObject self, final SubLObject slot_name)
  {
    SubLObject slot = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_slot_access_alist( self ) );
    if( NIL == slot )
    {
      slot = slots.slot_assoc( slot_name, subloop_structures.class_compiled_class_slot_access_alist( self ) );
      if( NIL == slot )
      {
        slot = slots.slot_assoc( slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist( self ) );
        if( NIL == slot )
        {
          slot = slots.slot_assoc( slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist( self ) );
        }
      }
    }
    return ( NIL != slot ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8463L)
  public static SubLObject object_on_destroy_class_method(final SubLObject self)
  {
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8533L)
  public static SubLObject object_cfasl_input_method(final SubLObject self, final SubLObject stream)
  {
    final SubLObject class_name = subloop_structures.class_name( self );
    final SubLObject instance = new_class_instance( self );
    final SubLObject number_of_slots = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject slot_name = NIL;
    SubLObject slot_value = NIL;
    assert NIL != Types.integerp( number_of_slots ) : number_of_slots;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( number_of_slots ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      slot_name = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      slot_value = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      assert NIL != Types.symbolp( slot_name ) : slot_name;
      Eval.eval( ConsesLow.list( $sym50$INLINE_SET_SLOT, ConsesLow.list( slot_name, class_name ), instance, ConsesLow.list( $sym51$QUOTE, slot_value ) ) );
    }
    return instance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9590L)
  public static SubLObject object_initialize_method(final SubLObject self)
  {
    final SubLObject instance_count = get_object_instance_count( self );
    SubLObject instance_number = get_object_instance_number( self );
    SubLObject isolated_p = get_object_isolated_p( self );
    isolated_p = NIL;
    set_object_isolated_p( self, isolated_p );
    instance_number = instance_count;
    set_object_instance_number( self, instance_number );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9728L)
  public static SubLObject object_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_method = NIL;
    final SubLObject instance_number = get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym58$OUTER_CATCH_FOR_OBJECT_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str59$___S__S_, subloop_structures.class_name( subloop_structures.instance_class( self ) ), instance_number );
        }
        else
        {
          PrintLow.format( stream, $str60$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym58$OUTER_CATCH_FOR_OBJECT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_instance_number( self, instance_number );
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
      catch_var_for_object_method = Errors.handleThrowable( ccatch_env_var, $sym58$OUTER_CATCH_FOR_OBJECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9969L)
  public static SubLObject object_equal_method(final SubLObject self, final SubLObject v_object)
  {
    return Equality.eq( self, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10041L)
  public static SubLObject object_essentially_equal_method(final SubLObject self, final SubLObject v_object, SubLObject ignore_slots)
  {
    if( ignore_slots == UNPROVIDED )
    {
      ignore_slots = NIL;
    }
    final SubLObject v_class_$1;
    final SubLObject v_class = v_class_$1 = subloop_structures.instance_class( self );
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class_$1 );
    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class_$1 );
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class_$1 );
    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class_$1 );
    SubLObject slot_name = NIL;
    SubLObject cdolist_list_var = compiled_class_slot_access_alist;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != slots.slot_essential( slot ) )
      {
        slot_name = slots.slot_name( slot );
        if( NIL == conses_high.member( slot_name, ignore_slots, UNPROVIDED, UNPROVIDED ) && !instances.get_slot( self, slot_name ).equal( instances.get_slot( v_object, slot_name ) ) )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_class_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != slots.slot_essential( slot ) )
      {
        slot_name = slots.slot_name( slot );
        if( NIL == conses_high.member( slot_name, ignore_slots, UNPROVIDED, UNPROVIDED ) && !instances.get_slot( self, slot_name ).equal( instances.get_slot( v_object, slot_name ) ) )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_instance_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != slots.slot_essential( slot ) )
      {
        slot_name = slots.slot_name( slot );
        if( NIL == conses_high.member( slot_name, ignore_slots, UNPROVIDED, UNPROVIDED ) && !instances.get_slot( self, slot_name ).equal( instances.get_slot( v_object, slot_name ) ) )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_instance_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != slots.slot_essential( slot ) )
      {
        slot_name = slots.slot_name( slot );
        if( NIL == conses_high.member( slot_name, ignore_slots, UNPROVIDED, UNPROVIDED ) && !instances.get_slot( self, slot_name ).equal( instances.get_slot( v_object, slot_name ) ) )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11143L)
  public static SubLObject object_clone_method(final SubLObject self)
  {
    final SubLObject class_of_self = subloop_structures.instance_class( self );
    return methods.funcall_class_method_with_0_args( class_of_self, $sym8$NEW );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11285L)
  public static SubLObject object_describe_instance_method(final SubLObject self, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    final SubLObject all_instance_slots = instances.instances_all_instance_slots( self );
    final SubLObject tab = depth.isZero() ? $str19$ : Strings.make_string( Numbers.multiply( depth, TWO_INTEGER ), UNPROVIDED );
    final SubLObject slot_tab = depth.isZero() ? $str20$__ : Strings.make_string( Numbers.add( Numbers.multiply( depth, TWO_INTEGER ), TWO_INTEGER ), UNPROVIDED );
    PrintLow.format( stream, $str74$___ADescription_of_instance__S_, tab, self );
    methods.funcall_instance_method_with_2_args( self, $sym16$DESCRIBE_CLASS, stream, number_utilities.f_1X( depth ) );
    SubLObject cdolist_list_var = all_instance_slots;
    SubLObject instance_slot = NIL;
    instance_slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str22$___A_S_____S, new SubLObject[] { slot_tab, instance_slot, instances.get_slot( self, instance_slot )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      instance_slot = cdolist_list_var.first();
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11849L)
  public static SubLObject object_cfasl_output_method(final SubLObject self, final SubLObject stream)
  {
    final SubLObject v_class = subloop_structures.instance_class( self );
    final SubLObject class_name = subloop_structures.class_name( v_class );
    cfasl.cfasl_output( class_name, stream );
    final SubLObject v_class_$2 = v_class;
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class_$2 );
    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class_$2 );
    SubLObject instance_slots = ConsesLow.append( compiled_instance_slot_access_alist, compiled_instance_boolean_slot_access_alist );
    instance_slots = Sequences.delete( $sym2$INSTANCE_NUMBER, instance_slots, Symbols.symbol_function( EQ ), $sym79$SLOT_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject number_of_slots = Sequences.length( instance_slots );
    cfasl.cfasl_output( number_of_slots, stream );
    SubLObject slot_name = NIL;
    SubLObject cdolist_list_var = instance_slots;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      slot_name = slots.slot_name( slot );
      cfasl.cfasl_output( slot_name, stream );
      cfasl.cfasl_output( Eval.eval( ConsesLow.list( $sym80$INLINE_GET_SLOT, ConsesLow.list( slot_name, class_name ), self ) ), stream );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12855L)
  public static SubLObject object_add_get_slot_listener_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str85$_ADD_GET_SLOT_LISTENER_OBJECT___t, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str86$_ADD_GET_SLOT_LISTENER_OBJECT___t, target_slot );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !my_method.isSymbol() )
    {
      Errors.error( $str87$_ADD_GET_SLOT_LISTENER_OBJECT___m, my_method );
    }
    slot_listeners.add_generic_slot_listener( target_instance, target_slot, $kw88$GET, my_method, self );
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13412L)
  public static SubLObject object_add_get_slot_listener_stimulated_by_value_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method,
      final SubLObject trigger_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str93$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str94$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !my_method.isSymbol() )
    {
      Errors.error( $str95$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method );
    }
    slot_listeners.add_generic_slot_listener_stimulated_by_value( target_instance, target_slot, $kw88$GET, my_method, self, trigger_value );
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14083L)
  public static SubLObject object_add_get_slot_listener_stimulated_by_range_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method,
      final SubLObject trigger_value_lower_bound, final SubLObject trigger_value_upper_bound)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str100$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str101$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !my_method.isSymbol() )
    {
      Errors.error( $str102$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !trigger_value_lower_bound.isNumber() || !trigger_value_upper_bound.isNumber() ) && ( !trigger_value_lower_bound.isString()
        || !trigger_value_upper_bound.isString() ) && ( !trigger_value_lower_bound.isChar() || !trigger_value_upper_bound.isChar() ) )
    {
      Errors.error( $str103$_ADD_GET_SLOT_LISTENER_STIMULATED, trigger_value_lower_bound, trigger_value_upper_bound );
    }
    slot_listeners.add_generic_slot_listener_stimulated_by_range( target_instance, target_slot, $kw88$GET, my_method, self, trigger_value_lower_bound, trigger_value_upper_bound );
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15335L)
  public static SubLObject object_add_get_slot_listener_stimulated_by_enum_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method,
      final SubLObject trigger_enumeration)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str108$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str109$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !my_method.isSymbol() )
    {
      Errors.error( $str110$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method );
    }
    slot_listeners.add_generic_slot_listener_stimulated_by_enum( target_instance, target_slot, $kw88$GET, my_method, self, trigger_enumeration );
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16013L)
  public static SubLObject object_add_set_slot_listener_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str114$_ADD_SET_SLOT_LISTENER_OBJECT___t, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str115$_ADD_SET_SLOT_LISTENER_OBJECT___t, target_slot );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !my_method.isSymbol() )
    {
      Errors.error( $str116$_ADD_SET_SLOT_LISTENER_OBJECT___m, my_method );
    }
    slot_listeners.add_generic_slot_listener( target_instance, target_slot, $kw117$SET, my_method, self );
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16549L)
  public static SubLObject object_add_set_slot_listener_stimulated_by_value_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method,
      final SubLObject trigger_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str121$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str122$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !my_method.isSymbol() )
    {
      Errors.error( $str123$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method );
    }
    slot_listeners.add_generic_slot_listener_stimulated_by_value( target_instance, target_slot, $kw117$SET, my_method, self, trigger_value );
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17220L)
  public static SubLObject object_add_set_slot_listener_stimulated_by_range_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method,
      final SubLObject trigger_value_lower_bound, final SubLObject trigger_value_upper_bound)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str127$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str128$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !my_method.isSymbol() )
    {
      Errors.error( $str129$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !trigger_value_lower_bound.isNumber() || !trigger_value_upper_bound.isNumber() ) && ( !trigger_value_lower_bound.isString()
        || !trigger_value_upper_bound.isString() ) && ( !trigger_value_lower_bound.isChar() || !trigger_value_upper_bound.isChar() ) )
    {
      Errors.error( $str130$_ADD_SET_SLOT_LISTENER_STIMULATED, trigger_value_lower_bound, trigger_value_upper_bound );
    }
    slot_listeners.add_generic_slot_listener_stimulated_by_range( target_instance, target_slot, $kw117$SET, my_method, self, trigger_value_lower_bound, trigger_value_upper_bound );
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18472L)
  public static SubLObject object_add_set_slot_listener_stimulated_by_enum_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method,
      final SubLObject trigger_enumeration)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str134$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str135$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !my_method.isSymbol() )
    {
      Errors.error( $str136$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method );
    }
    slot_listeners.add_generic_slot_listener_stimulated_by_enum( target_instance, target_slot, $kw117$SET, my_method, self, trigger_enumeration );
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19150L)
  public static SubLObject object_remove_all_get_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot)
  {
    if( target_slot == UNPROVIDED )
    {
      target_slot = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB, target_slot );
    }
    return slot_listeners.slot_listeners_remove_all_get_slot_listeners( target_instance, self, target_slot );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19604L)
  public static SubLObject object_remove_all_set_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot)
  {
    if( target_slot == UNPROVIDED )
    {
      target_slot = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB, target_slot );
    }
    return slot_listeners.slot_listeners_remove_all_set_slot_listeners( target_instance, self, target_slot );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20058L)
  public static SubLObject object_remove_all_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot)
  {
    if( target_slot == UNPROVIDED )
    {
      target_slot = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( target_instance ) )
    {
      Errors.error( $str151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT, target_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_slot.isSymbol() )
    {
      Errors.error( $str152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT, target_slot );
    }
    return slot_listeners.slot_listeners_remove_all_slot_listeners( target_instance, self, target_slot );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20496L)
  public static SubLObject object_add_class_wide_before_method_listener_method(final SubLObject self, final SubLObject v_class, final SubLObject target_method, final SubLObject my_method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) && NIL == subloop_structures.instance_p( v_class ) )
    {
      Errors.error( $str157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == target_method || !target_method.isSymbol() ) )
    {
      Errors.error( $str158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, target_method );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == my_method || !my_method.isSymbol() ) )
    {
      Errors.error( $str159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, my_method );
    }
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      method_listeners.method_listeners_add_before_listener( subloop_structures.class_name( v_class ), target_method, my_method, self );
    }
    else if( NIL != subloop_structures.instance_p( v_class ) )
    {
      method_listeners.method_listeners_add_before_listener( subloop_structures.class_name( subloop_structures.instance_class( v_class ) ), target_method, my_method, self );
    }
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21351L)
  public static SubLObject object_add_class_wide_after_method_listener_method(final SubLObject self, final SubLObject v_class, final SubLObject target_method, final SubLObject my_method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) && NIL == subloop_structures.instance_p( v_class ) )
    {
      Errors.error( $str163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == target_method || !target_method.isSymbol() ) )
    {
      Errors.error( $str164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, target_method );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == my_method || !my_method.isSymbol() ) )
    {
      Errors.error( $str165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, my_method );
    }
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      method_listeners.method_listeners_add_after_listener( subloop_structures.class_name( v_class ), target_method, my_method, self );
    }
    else if( NIL != subloop_structures.instance_p( v_class ) )
    {
      method_listeners.method_listeners_add_after_listener( subloop_structures.class_name( subloop_structures.instance_class( v_class ) ), target_method, my_method, self );
    }
    return my_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22208L)
  public static SubLObject object_remove_all_class_wide_method_listeners_method(final SubLObject self, final SubLObject monitored_instance, SubLObject target_method)
  {
    if( target_method == UNPROVIDED )
    {
      target_method = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.instance_p( monitored_instance ) && NIL == subloop_structures.class_p( monitored_instance ) )
    {
      Errors.error( $str170$_REMOVE_CLASS_WIDE_METHOD_LISTENE, monitored_instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !target_method.isSymbol() )
    {
      Errors.error( $str171$_REMOVE_CLASS_WIDE_METHOD_LISTENE, target_method );
    }
    return method_listeners.method_listeners_remove_all_method_listeners( monitored_instance, self, target_method );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22754L)
  public static SubLObject object_isolate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_method = NIL;
    SubLObject isolated_p = get_object_isolated_p( self );
    try
    {
      thread.throwStack.push( $sym175$OUTER_CATCH_FOR_OBJECT_METHOD );
      try
      {
        isolated_p = T;
        slot_listeners.slot_listeners_remove_all_slot_listeners( self, UNPROVIDED, UNPROVIDED );
        method_listeners.method_listeners_remove_all_method_listeners( self, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym175$OUTER_CATCH_FOR_OBJECT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_isolated_p( self, isolated_p );
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
      catch_var_for_object_method = Errors.handleThrowable( ccatch_env_var, $sym175$OUTER_CATCH_FOR_OBJECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23304L)
  public static SubLObject object_plistify_method(final SubLObject self)
  {
    SubLObject listed_slots = NIL;
    final SubLObject keyword_package = Symbols.symbol_package( $kw179$TEST );
    final SubLObject v_class_$3;
    final SubLObject v_class = v_class_$3 = subloop_structures.instance_class( self );
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class_$3 );
    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class_$3 );
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class_$3 );
    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist( v_class_$3 );
    SubLObject slot_name = NIL;
    SubLObject cdolist_list_var = compiled_class_slot_access_alist;
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != slots.slot_essential( slot ) )
      {
        slot_name = slots.slot_name( slot );
        listed_slots = ConsesLow.cons( Packages.intern( Symbols.symbol_name( slot_name ), keyword_package ), listed_slots );
        listed_slots = ConsesLow.cons( instances.get_slot( self, slot_name ), listed_slots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_class_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != slots.slot_essential( slot ) )
      {
        slot_name = slots.slot_name( slot );
        listed_slots = ConsesLow.cons( Packages.intern( Symbols.symbol_name( slot_name ), keyword_package ), listed_slots );
        listed_slots = ConsesLow.cons( instances.get_slot( self, slot_name ), listed_slots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_instance_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != slots.slot_essential( slot ) )
      {
        slot_name = slots.slot_name( slot );
        listed_slots = ConsesLow.cons( Packages.intern( Symbols.symbol_name( slot_name ), keyword_package ), listed_slots );
        listed_slots = ConsesLow.cons( instances.get_slot( self, slot_name ), listed_slots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    slot_name = NIL;
    cdolist_list_var = compiled_instance_boolean_slot_access_alist;
    slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != slots.slot_essential( slot ) )
      {
        slot_name = slots.slot_name( slot );
        listed_slots = ConsesLow.cons( Packages.intern( Symbols.symbol_name( slot_name ), keyword_package ), listed_slots );
        listed_slots = ConsesLow.cons( instances.get_slot( self, slot_name ), listed_slots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    return Sequences.nreverse( listed_slots );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24436L)
  public static SubLObject object_listify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_method = NIL;
    final SubLObject instance_number = get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym183$OUTER_CATCH_FOR_OBJECT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym183$OUTER_CATCH_FOR_OBJECT_METHOD, ConsesLow.listS( subloop_structures.class_name( subloop_structures.instance_class( self ) ), instance_number, methods
            .funcall_instance_method_with_0_args( self, $sym177$PLISTIFY ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_instance_number( self, instance_number );
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
      catch_var_for_object_method = Errors.handleThrowable( ccatch_env_var, $sym183$OUTER_CATCH_FOR_OBJECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24609L)
  public static SubLObject object_assimilate_method(final SubLObject self, final SubLObject plistified_content)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !plistified_content.isList() )
    {
      Errors.error( $str189$_ASSIMILATE__S____S_is_not_a_vali, self );
    }
    SubLObject slot = NIL;
    SubLObject slot_name = NIL;
    final SubLObject v_class = subloop_structures.instance_class( self );
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class );
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class );
    SubLObject remainder;
    SubLObject key;
    SubLObject value;
    for( remainder = NIL, remainder = plistified_content; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      key = remainder.first();
      value = conses_high.cadr( remainder );
      slot = slots.slot_assoc_by_name( Symbols.symbol_name( key ), compiled_class_slot_access_alist );
      if( NIL != slot )
      {
        slot_name = slots.slot_name( slot );
        instances.set_slot( self, slot_name, value );
      }
    }
    for( remainder = NIL, remainder = plistified_content; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      key = remainder.first();
      value = conses_high.cadr( remainder );
      slot = slots.slot_assoc_by_name( Symbols.symbol_name( key ), compiled_instance_slot_access_alist );
      if( NIL != slot )
      {
        slot_name = slots.slot_name( slot );
        instances.set_slot( self, slot_name, value );
      }
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25324L)
  public static SubLObject describe_instance(final SubLObject instance)
  {
    if( NIL != subloop_structures.instance_p( instance ) )
    {
      methods.funcall_instance_method_with_0_args( instance, $sym72$DESCRIBE_INSTANCE );
    }
    return instance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25477L)
  public static SubLObject new_object_instance(final SubLObject class_or_class_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_or_class_name.isSymbol() ? classes.classes_retrieve_class( class_or_class_name ) : class_or_class_name;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str191$NEW_SUBLOOPS_INSTANCE___S_is_neit, class_or_class_name );
    }
    final SubLObject new_instance = object_new_method( class_or_class_name );
    return new_instance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25951L)
  public static SubLObject new_class_instance(final SubLObject class_or_class_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_or_class_name.isSymbol() ? classes.classes_retrieve_class( class_or_class_name ) : class_or_class_name;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str191$NEW_SUBLOOPS_INSTANCE___S_is_neit, class_or_class_name );
    }
    final SubLObject new_instance = object_new_method( class_or_class_name );
    return new_instance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26374L)
  public static SubLObject create_object_from_list(final SubLObject listified_instance, SubLObject allocate_new_instance_number)
  {
    if( allocate_new_instance_number == UNPROVIDED )
    {
      allocate_new_instance_number = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !listified_instance.isCons() || !listified_instance.first().isSymbol() || !listified_instance.rest().isCons() || !conses_high.cadr(
        listified_instance ).isInteger() || !conses_high.cddr( listified_instance ).isList() ) )
    {
      Errors.error( $str192$CREATE_OBJECT_FROM_LIST___S_is_no, listified_instance );
    }
    SubLObject class_name = NIL;
    SubLObject instance_number = NIL;
    SubLObject slot_plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( listified_instance, listified_instance, $list193 );
    class_name = listified_instance.first();
    SubLObject current = listified_instance.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, listified_instance, $list193 );
    instance_number = current.first();
    current = ( slot_plist = current.rest() );
    final SubLObject v_object = instances.new_instance( class_name );
    SubLObject slot = NIL;
    SubLObject slot_name = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_object )
    {
      Errors.error( $str194$CREATE_OBJECT_FROM_LIST___S_does_, class_name );
    }
    if( NIL != allocate_new_instance_number )
    {
      SubLObject current_instance_count = get_object_instance_count( v_object );
      if( NIL == current_instance_count )
      {
        current_instance_count = ZERO_INTEGER;
      }
      else
      {
        current_instance_count = Numbers.add( current_instance_count, ONE_INTEGER );
      }
      set_object_instance_count( v_object, current_instance_count );
      methods.funcall_instance_method_with_0_args( v_object, $sym11$INITIALIZE );
    }
    else
    {
      methods.funcall_instance_method_with_0_args( v_object, $sym11$INITIALIZE );
      set_object_instance_number( v_object, instance_number );
    }
    final SubLObject v_class = subloop_structures.instance_class( v_object );
    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist( v_class );
    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist( v_class );
    SubLObject remainder;
    SubLObject key;
    SubLObject value;
    for( remainder = NIL, remainder = slot_plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      key = remainder.first();
      value = conses_high.cadr( remainder );
      slot = slots.slot_assoc_by_name( Symbols.symbol_name( key ), compiled_class_slot_access_alist );
      if( NIL != slot )
      {
        slot_name = slots.slot_name( slot );
        instances.set_slot( v_object, slot_name, value );
      }
    }
    for( remainder = NIL, remainder = slot_plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      key = remainder.first();
      value = conses_high.cadr( remainder );
      slot = slots.slot_assoc_by_name( Symbols.symbol_name( key ), compiled_instance_slot_access_alist );
      if( NIL != slot )
      {
        slot_name = slots.slot_name( slot );
        instances.set_slot( v_object, slot_name, value );
      }
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28026L)
  public static SubLObject print_class_instance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance = NIL;
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
    stream = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list195 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list195 );
      if( NIL == conses_high.member( current_$4, $list196, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw197$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list195 );
    }
    final SubLObject number_tail = cdestructuring_bind.property_list_member( $kw198$NUMBER, current );
    final SubLObject number = ( NIL != number_tail ) ? conses_high.cadr( number_tail ) : NIL;
    final SubLObject identity_tail = cdestructuring_bind.property_list_member( $kw199$IDENTITY, current );
    final SubLObject identity = ( NIL != identity_tail ) ? conses_high.cadr( identity_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject instance_var = Symbols.make_symbol( $str200$INSTANCE );
    final SubLObject stream_var = Symbols.make_symbol( $str201$STREAM );
    return ConsesLow.list( $sym202$PROGN, ConsesLow.listS( $sym203$CHECK_TYPE, instance, $list204 ), ConsesLow.list( $sym205$CLET, ConsesLow.list( ConsesLow.list( instance_var, instance ), ConsesLow.list( stream_var,
        stream ) ), ConsesLow.listS( $sym206$PRINT_UNREADABLE_OBJECT, ConsesLow.list( instance_var, stream_var, $kw199$IDENTITY, identity ), ConsesLow.list( $sym207$PRINC, ConsesLow.list( $sym208$CLASS_NAME, ConsesLow
            .list( $sym209$INSTANCE_CLASS, instance_var ) ), stream_var ), ConsesLow.list( $sym210$PWHEN, number, ConsesLow.list( $sym211$FORMAT, stream_var, $str212$__A, ConsesLow.list(
                $sym213$GET_OBJECT_INSTANCE_NUMBER, instance_var ) ) ), ( NIL != body ) ? ConsesLow.list( $sym214$WRITE_CHAR, Characters.CHAR_space, stream_var ) : NIL, ConsesLow.append( body, NIL ) ) ) );
  }

  public static SubLObject declare_object_file()
  {
    SubLFiles.declareFunction( me, "get_object_instance_number", "GET-OBJECT-INSTANCE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_object_instance_number", "SET-OBJECT-INSTANCE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_object_isolated_p", "GET-OBJECT-ISOLATED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_object_isolated_p", "SET-OBJECT-ISOLATED-P", 2, 0, false );
    SubLFiles.declareFunction( me, "get_object_instance_count", "GET-OBJECT-INSTANCE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_object_instance_count", "SET-OBJECT-INSTANCE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_object_class", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_object_instance", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "object_p", "OBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "object_new_method", "OBJECT-NEW-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_class_of_method", "OBJECT-CLASS-OF-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_describe_class_method", "OBJECT-DESCRIBE-CLASS-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "object_parent_class_method", "OBJECT-PARENT-CLASS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_child_classes_method", "OBJECT-CHILD-CLASSES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_implements_method_p_method", "OBJECT-IMPLEMENTS-METHOD-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_method_lambda_list_method", "OBJECT-METHOD-LAMBDA-LIST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_has_slot_p_method", "OBJECT-HAS-SLOT-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_on_destroy_class_method", "OBJECT-ON-DESTROY-CLASS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_cfasl_input_method", "OBJECT-CFASL-INPUT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_initialize_method", "OBJECT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_print_method", "OBJECT-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "object_equal_method", "OBJECT-EQUAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_essentially_equal_method", "OBJECT-ESSENTIALLY-EQUAL-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "object_clone_method", "OBJECT-CLONE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_describe_instance_method", "OBJECT-DESCRIBE-INSTANCE-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "object_cfasl_output_method", "OBJECT-CFASL-OUTPUT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_add_get_slot_listener_method", "OBJECT-ADD-GET-SLOT-LISTENER-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "object_add_get_slot_listener_stimulated_by_value_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "object_add_get_slot_listener_stimulated_by_range_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD", 6, 0, false );
    SubLFiles.declareFunction( me, "object_add_get_slot_listener_stimulated_by_enum_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "object_add_set_slot_listener_method", "OBJECT-ADD-SET-SLOT-LISTENER-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "object_add_set_slot_listener_stimulated_by_value_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "object_add_set_slot_listener_stimulated_by_range_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD", 6, 0, false );
    SubLFiles.declareFunction( me, "object_add_set_slot_listener_stimulated_by_enum_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "object_remove_all_get_slot_listeners_method", "OBJECT-REMOVE-ALL-GET-SLOT-LISTENERS-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "object_remove_all_set_slot_listeners_method", "OBJECT-REMOVE-ALL-SET-SLOT-LISTENERS-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "object_remove_all_slot_listeners_method", "OBJECT-REMOVE-ALL-SLOT-LISTENERS-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "object_add_class_wide_before_method_listener_method", "OBJECT-ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "object_add_class_wide_after_method_listener_method", "OBJECT-ADD-CLASS-WIDE-AFTER-METHOD-LISTENER-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "object_remove_all_class_wide_method_listeners_method", "OBJECT-REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "object_isolate_method", "OBJECT-ISOLATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_plistify_method", "OBJECT-PLISTIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_listify_method", "OBJECT-LISTIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_assimilate_method", "OBJECT-ASSIMILATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "describe_instance", "DESCRIBE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_object_instance", "NEW-OBJECT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_class_instance", "NEW-CLASS-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "create_object_from_list", "CREATE-OBJECT-FROM-LIST", 1, 1, false );
    SubLFiles.declareMacro( me, "print_class_instance", "PRINT-CLASS-INSTANCE" );
    return NIL;
  }

  public static SubLObject init_object_file()
  {
    return NIL;
  }

  public static SubLObject setup_object_file()
  {
    classes.subloop_new_class( $sym0$OBJECT, NIL, NIL, NIL, $list1 );
    classes.class_set_implements_slot_listeners( $sym0$OBJECT, NIL );
    classes.subloop_note_class_initialization_function( $sym0$OBJECT, $sym5$SUBLOOP_RESERVED_INITIALIZE_OBJECT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$OBJECT, $sym7$SUBLOOP_RESERVED_INITIALIZE_OBJECT_INSTANCE );
    subloop_reserved_initialize_object_class( $sym0$OBJECT );
    methods.methods_incorporate_class_method( $sym8$NEW, $sym0$OBJECT, $list9, NIL, $list10 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym8$NEW, $sym12$OBJECT_NEW_METHOD );
    methods.methods_incorporate_class_method( $sym13$CLASS_OF, $sym0$OBJECT, NIL, NIL, $list14 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym13$CLASS_OF, $sym15$OBJECT_CLASS_OF_METHOD );
    methods.methods_incorporate_class_method( $sym16$DESCRIBE_CLASS, $sym0$OBJECT, NIL, $list17, $list18 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym16$DESCRIBE_CLASS, $sym23$OBJECT_DESCRIBE_CLASS_METHOD );
    methods.methods_incorporate_class_method( $sym24$PARENT_CLASS, $sym0$OBJECT, NIL, NIL, $list25 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym24$PARENT_CLASS, $sym26$OBJECT_PARENT_CLASS_METHOD );
    methods.methods_incorporate_class_method( $sym27$CHILD_CLASSES, $sym0$OBJECT, NIL, NIL, $list28 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym27$CHILD_CLASSES, $sym29$OBJECT_CHILD_CLASSES_METHOD );
    methods.methods_incorporate_class_method( $sym30$IMPLEMENTS_METHOD_P, $sym0$OBJECT, $list31, $list32, $list33 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym30$IMPLEMENTS_METHOD_P, $sym34$OBJECT_IMPLEMENTS_METHOD_P_METHOD );
    methods.methods_incorporate_class_method( $sym35$METHOD_LAMBDA_LIST, $sym0$OBJECT, $list31, $list32, $list36 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym35$METHOD_LAMBDA_LIST, $sym37$OBJECT_METHOD_LAMBDA_LIST_METHOD );
    methods.methods_incorporate_class_method( $sym38$HAS_SLOT_P, $sym0$OBJECT, $list31, $list39, $list40 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym38$HAS_SLOT_P, $sym41$OBJECT_HAS_SLOT_P_METHOD );
    methods.methods_incorporate_class_method( $sym42$ON_DESTROY_CLASS, $sym0$OBJECT, $list31, NIL, $list14 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym42$ON_DESTROY_CLASS, $sym43$OBJECT_ON_DESTROY_CLASS_METHOD );
    methods.methods_incorporate_class_method( $sym44$CFASL_INPUT, $sym0$OBJECT, $list45, $list46, $list47 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym44$CFASL_INPUT, $sym52$OBJECT_CFASL_INPUT_METHOD );
    methods.methods_incorporate_instance_method( $sym11$INITIALIZE, $sym0$OBJECT, $list9, NIL, $list53 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym11$INITIALIZE, $sym54$OBJECT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym55$PRINT, $sym0$OBJECT, NIL, $list56, $list57 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym55$PRINT, $sym61$OBJECT_PRINT_METHOD );
    methods.methods_incorporate_instance_method( EQUAL, $sym0$OBJECT, NIL, $list62, $list63 );
    methods.subloop_register_instance_method( $sym0$OBJECT, EQUAL, $sym64$OBJECT_EQUAL_METHOD );
    methods.methods_incorporate_instance_method( $sym65$ESSENTIALLY_EQUAL, $sym0$OBJECT, $list31, $list66, $list67 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym65$ESSENTIALLY_EQUAL, $sym68$OBJECT_ESSENTIALLY_EQUAL_METHOD );
    methods.methods_incorporate_instance_method( $sym69$CLONE, $sym0$OBJECT, NIL, NIL, $list70 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym69$CLONE, $sym71$OBJECT_CLONE_METHOD );
    methods.methods_incorporate_instance_method( $sym72$DESCRIBE_INSTANCE, $sym0$OBJECT, NIL, $list17, $list73 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym72$DESCRIBE_INSTANCE, $sym75$OBJECT_DESCRIBE_INSTANCE_METHOD );
    methods.methods_incorporate_instance_method( $sym76$CFASL_OUTPUT, $sym0$OBJECT, $list77, $list46, $list78 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym76$CFASL_OUTPUT, $sym81$OBJECT_CFASL_OUTPUT_METHOD );
    methods.methods_incorporate_instance_method( $sym82$ADD_GET_SLOT_LISTENER, $sym0$OBJECT, NIL, $list83, $list84 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym82$ADD_GET_SLOT_LISTENER, $sym89$OBJECT_ADD_GET_SLOT_LISTENER_METHOD );
    methods.methods_incorporate_instance_method( $sym90$ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE, $sym0$OBJECT, NIL, $list91, $list92 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym90$ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE, $sym96$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD );
    methods.methods_incorporate_instance_method( $sym97$ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE, $sym0$OBJECT, NIL, $list98, $list99 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym97$ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE, $sym104$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD );
    methods.methods_incorporate_instance_method( $sym105$ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM, $sym0$OBJECT, NIL, $list106, $list107 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym105$ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM, $sym111$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD );
    methods.methods_incorporate_instance_method( $sym112$ADD_SET_SLOT_LISTENER, $sym0$OBJECT, NIL, $list83, $list113 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym112$ADD_SET_SLOT_LISTENER, $sym118$OBJECT_ADD_SET_SLOT_LISTENER_METHOD );
    methods.methods_incorporate_instance_method( $sym119$ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE, $sym0$OBJECT, NIL, $list91, $list120 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym119$ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE, $sym124$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD );
    methods.methods_incorporate_instance_method( $sym125$ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE, $sym0$OBJECT, NIL, $list98, $list126 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym125$ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE, $sym131$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD );
    methods.methods_incorporate_instance_method( $sym132$ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM, $sym0$OBJECT, NIL, $list106, $list133 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym132$ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM, $sym137$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD );
    methods.methods_incorporate_instance_method( $sym138$REMOVE_ALL_GET_SLOT_LISTENERS, $sym0$OBJECT, NIL, $list139, $list140 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym138$REMOVE_ALL_GET_SLOT_LISTENERS, $sym143$OBJECT_REMOVE_ALL_GET_SLOT_LISTENERS_METHOD );
    methods.methods_incorporate_instance_method( $sym144$REMOVE_ALL_SET_SLOT_LISTENERS, $sym0$OBJECT, NIL, $list139, $list145 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym144$REMOVE_ALL_SET_SLOT_LISTENERS, $sym148$OBJECT_REMOVE_ALL_SET_SLOT_LISTENERS_METHOD );
    methods.methods_incorporate_instance_method( $sym149$REMOVE_ALL_SLOT_LISTENERS, $sym0$OBJECT, NIL, $list139, $list150 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym149$REMOVE_ALL_SLOT_LISTENERS, $sym153$OBJECT_REMOVE_ALL_SLOT_LISTENERS_METHOD );
    methods.methods_incorporate_class_method( $sym154$ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER, $sym0$OBJECT, NIL, $list155, $list156 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym154$ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER, $sym160$OBJECT_ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER_METHOD );
    methods.methods_incorporate_class_method( $sym161$ADD_CLASS_WIDE_AFTER_METHOD_LISTENER, $sym0$OBJECT, NIL, $list155, $list162 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym161$ADD_CLASS_WIDE_AFTER_METHOD_LISTENER, $sym166$OBJECT_ADD_CLASS_WIDE_AFTER_METHOD_LISTENER_METHOD );
    methods.methods_incorporate_class_method( $sym167$REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS, $sym0$OBJECT, NIL, $list168, $list169 );
    methods.subloop_register_class_method( $sym0$OBJECT, $sym167$REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS, $sym172$OBJECT_REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS_METHOD );
    methods.methods_incorporate_instance_method( $sym173$ISOLATE, $sym0$OBJECT, NIL, NIL, $list174 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym173$ISOLATE, $sym176$OBJECT_ISOLATE_METHOD );
    methods.methods_incorporate_instance_method( $sym177$PLISTIFY, $sym0$OBJECT, $list31, NIL, $list178 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym177$PLISTIFY, $sym180$OBJECT_PLISTIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym181$LISTIFY, $sym0$OBJECT, $list31, NIL, $list182 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym181$LISTIFY, $sym184$OBJECT_LISTIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym185$ASSIMILATE, $sym0$OBJECT, $list186, $list187, $list188 );
    methods.subloop_register_instance_method( $sym0$OBJECT, $sym185$ASSIMILATE, $sym190$OBJECT_ASSIMILATE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_object_file();
  }

  @Override
  public void initializeVariables()
  {
    init_object_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_object_file();
  }
  static
  {
    me = new object();
    $sym0$OBJECT = makeSymbol( "OBJECT" );
    $list1 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "INSTANCE-COUNT" ), makeKeyword( "CLASS" ), makeKeyword( "VALUE" ), ZERO_INTEGER, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "ISOLATED-P" ), makeKeyword( "BOOLEAN" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "INSTANCE-NUMBER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-CLASS-METHOD" ), makeSymbol( "NEW" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "CLASS-OF" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "DESCRIBE-CLASS" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STREAM" ), T ), ConsesLow.list( makeSymbol( "DEPTH" ),
                    ZERO_INTEGER ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "PARENT-CLASS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-CLASS-METHOD" ), makeSymbol( "CHILD-CLASSES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "IMPLEMENTS-METHOD-P" ), ConsesLow.list(
                            makeSymbol( "METHOD-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "METHOD-LAMBDA-LIST" ), ConsesLow.list( makeSymbol( "METHOD-NAME" ) ),
                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "HAS-SLOT-P" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
                                    .list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ON-DESTROY-CLASS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
                                        "CFASL-INPUT" ), ConsesLow.list( makeSymbol( "STREAM" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL,
                                            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ),
                                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), EQUAL, ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ESSENTIALLY-EQUAL" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol(
                                                        "IGNORE-SLOTS" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLONE" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DESCRIBE-INSTANCE" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STREAM" ), T ), ConsesLow.list( makeSymbol( "DEPTH" ),
          ZERO_INTEGER ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CFASL-OUTPUT" ), ConsesLow.list( makeSymbol( "STREAM" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow
              .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-GET-SLOT-LISTENER" ), ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ) ), makeKeyword(
                  "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE" ), ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol(
                      "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ), makeSymbol( "TRIGGER-VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                          "ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE" ), ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ),
                              makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM" ),
                                  ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ), makeSymbol( "TRIGGER-ENUMERATION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                      makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-SET-SLOT-LISTENER" ), ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ) ),
                                      makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE" ), ConsesLow.list( makeSymbol(
                                          "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ), makeSymbol( "TRIGGER-VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                              "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE" ), ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol(
                                                  "MY-METHOD" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                      "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM" ), ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ),
                                                          makeSymbol( "MY-METHOD" ), makeSymbol( "TRIGGER-ENUMERATION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                              "REMOVE-ALL-GET-SLOT-LISTENERS" ), ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET-SLOT" ),
                                                                  NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE-ALL-SET-SLOT-LISTENERS" ), ConsesLow.list(
                                                                      makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET-SLOT" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
                                                                          .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE-ALL-SLOT-LISTENERS" ), ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ),
                                                                              makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET-SLOT" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                  "DEF-CLASS-METHOD" ), makeSymbol( "ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER" ), ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol(
                                                                                      "TARGET-METHOD" ), makeSymbol( "MY-METHOD" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ),
                                                                                          makeSymbol( "ADD-CLASS-WIDE-AFTER-METHOD-LISTENER" ), ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "TARGET-METHOD" ),
                                                                                              makeSymbol( "MY-METHOD" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
                                                                                                  "REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS" ), ConsesLow.list( makeSymbol( "MONITORED-INSTANCE" ), makeSymbol( "&OPTIONAL" ),
                                                                                                      ConsesLow.list( makeSymbol( "TARGET-METHOD" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                                          "DEF-INSTANCE-METHOD" ), makeSymbol( "ISOLATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                                              "DEF-INSTANCE-METHOD" ), makeSymbol( "PLISTIFY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                                                                  "DEF-INSTANCE-METHOD" ), makeSymbol( "LISTIFY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                                                                                                      makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASSIMILATE" ), ConsesLow.list( makeSymbol(
                                                                                                                          "PLISTIFIED-CONTENT" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym2$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $int3$4096 = makeInteger( 4096 );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$SUBLOOP_RESERVED_INITIALIZE_OBJECT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-OBJECT-CLASS" );
    $sym6$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym7$SUBLOOP_RESERVED_INITIALIZE_OBJECT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-OBJECT-INSTANCE" );
    $sym8$NEW = makeSymbol( "NEW" );
    $list9 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ) );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "INSTANCE-COUNT" ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "INSTANCE-COUNT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "INSTANCE-COUNT" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE" ), ConsesLow.list( makeSymbol( "NEW-INSTANCE" ), makeSymbol(
            "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIALIZE" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "INSTANCE" ) ) ) );
    $sym11$INITIALIZE = makeSymbol( "INITIALIZE" );
    $sym12$OBJECT_NEW_METHOD = makeSymbol( "OBJECT-NEW-METHOD" );
    $sym13$CLASS_OF = makeSymbol( "CLASS-OF" );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym15$OBJECT_CLASS_OF_METHOD = makeSymbol( "OBJECT-CLASS-OF-METHOD" );
    $sym16$DESCRIBE_CLASS = makeSymbol( "DESCRIBE-CLASS" );
    $list17 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STREAM" ), T ), ConsesLow.list( makeSymbol( "DEPTH" ), ZERO_INTEGER ) );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALL-CLASS-SLOTS" ), ConsesLow.list( makeSymbol( "CLASSES-ALL-CLASS-SLOTS" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "TAB" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "ZEROP" ), makeSymbol( "DEPTH" ) ), makeString( "" ), ConsesLow.list( makeSymbol( "MAKE-STRING" ), ConsesLow
            .list( makeSymbol( "*" ), makeSymbol( "DEPTH" ), TWO_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "SLOT-TAB" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "ZEROP" ), makeSymbol(
                "DEPTH" ) ), makeString( "  " ), ConsesLow.list( makeSymbol( "MAKE-STRING" ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol( "DEPTH" ), TWO_INTEGER ),
                    TWO_INTEGER ) ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%~ADescription of class ~S:" ), makeSymbol( "TAB" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ),
                        makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CLASS-SLOT" ), makeSymbol( "ALL-CLASS-SLOTS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ),
                            makeSymbol( "STREAM" ), makeString( "~%~A~S -> ~S" ), makeSymbol( "SLOT-TAB" ), makeSymbol( "CLASS-SLOT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol(
                                "CLASS-SLOT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $str19$ = makeString( "" );
    $str20$__ = makeString( "  " );
    $str21$___ADescription_of_class__S_ = makeString( "~%~ADescription of class ~S:" );
    $str22$___A_S_____S = makeString( "~%~A~S -> ~S" );
    $sym23$OBJECT_DESCRIBE_CLASS_METHOD = makeSymbol( "OBJECT-DESCRIBE-CLASS-METHOD" );
    $sym24$PARENT_CLASS = makeSymbol( "PARENT-CLASS" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPILED-INHERITANCE-PATH" ), ConsesLow.list( makeSymbol( "CLASS-COMPILED-INHERITANCE-PATH" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "COMPILED-INHERITANCE-PATH" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
            "COMPILED-INHERITANCE-PATH" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CADR" ), makeSymbol( "COMPILED-INHERITANCE-PATH" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym26$OBJECT_PARENT_CLASS_METHOD = makeSymbol( "OBJECT-PARENT-CLASS-METHOD" );
    $sym27$CHILD_CLASSES = makeSymbol( "CHILD-CLASSES" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBCLASS-NAMES" ), ConsesLow.list( makeSymbol( "CLASS-SUBCLASSES" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "SUBCLASS-NAMES" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUBCLASSES" ), NIL ), ConsesLow.list( makeSymbol( "SUBCLASS" ),
            NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SUBCLASS-NAME" ), makeSymbol( "SUBCLASS-NAMES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBCLASS" ), ConsesLow
                .list( makeSymbol( "CLASSES-RETRIEVE-CLASS" ), makeSymbol( "SUBCLASS-NAME" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SUBCLASS" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                    "SUBCLASS" ), makeSymbol( "SUBCLASSES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "SUBCLASSES" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                        NIL ) ) );
    $sym29$OBJECT_CHILD_CLASSES_METHOD = makeSymbol( "OBJECT-CHILD-CLASSES-METHOD" );
    $sym30$IMPLEMENTS_METHOD_P = makeSymbol( "IMPLEMENTS-METHOD-P" );
    $list31 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list32 = ConsesLow.list( makeSymbol( "METHOD-NAME" ) );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MY-CLASS" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol(
        "SELF" ) ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "INSTANCE-METHOD-ACCESS-LIST" ), ConsesLow.list( makeSymbol(
            "CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST" ), makeSymbol( "MY-CLASS" ) ) ), ConsesLow.list( makeSymbol( "CLASS-METHOD-ACCESS-LIST" ), ConsesLow.list( makeSymbol(
                "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeSymbol( "MY-CLASS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "METHOD-ASSOC" ),
                    makeSymbol( "METHOD-NAME" ), makeSymbol( "INSTANCE-METHOD-ACCESS-LIST" ) ), T, ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "METHOD-ASSOC" ), makeSymbol( "METHOD-NAME" ),
                        makeSymbol( "CLASS-METHOD-ACCESS-LIST" ) ), T, NIL ) ) ) ) );
    $sym34$OBJECT_IMPLEMENTS_METHOD_P_METHOD = makeSymbol( "OBJECT-IMPLEMENTS-METHOD-P-METHOD" );
    $sym35$METHOD_LAMBDA_LIST = makeSymbol( "METHOD-LAMBDA-LIST" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "METHOD-ASSOC" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list(
        makeSymbol( "CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "METHOD" ), ConsesLow.list( makeSymbol( "METHOD-ASSOC" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "METHOD-LAMBDA-LIST" ), makeSymbol( "METHOD" ) ) ) ) );
    $sym37$OBJECT_METHOD_LAMBDA_LIST_METHOD = makeSymbol( "OBJECT-METHOD-LAMBDA-LIST-METHOD" );
    $sym38$HAS_SLOT_P = makeSymbol( "HAS-SLOT-P" );
    $list39 = ConsesLow.list( makeSymbol( "SLOT-NAME" ) );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "SLOT-ASSOC" ), makeSymbol( "SLOT-NAME" ), ConsesLow.list( makeSymbol(
        "CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SLOT" ), ConsesLow
            .list( makeSymbol( "SLOT-ASSOC" ), makeSymbol( "SLOT-NAME" ), ConsesLow.list( makeSymbol( "CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "SLOT-ASSOC" ), makeSymbol( "SLOT-NAME" ), ConsesLow.list( makeSymbol(
                    "CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                        "SLOT" ), ConsesLow.list( makeSymbol( "SLOT-ASSOC" ), makeSymbol( "SLOT-NAME" ), ConsesLow.list( makeSymbol( "CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "SELF" ) ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "SLOT" ), T, NIL ) ) ) );
    $sym41$OBJECT_HAS_SLOT_P_METHOD = makeSymbol( "OBJECT-HAS-SLOT-P-METHOD" );
    $sym42$ON_DESTROY_CLASS = makeSymbol( "ON-DESTROY-CLASS" );
    $sym43$OBJECT_ON_DESTROY_CLASS_METHOD = makeSymbol( "OBJECT-ON-DESTROY-CLASS-METHOD" );
    $sym44$CFASL_INPUT = makeSymbol( "CFASL-INPUT" );
    $list45 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list46 = ConsesLow.list( makeSymbol( "STREAM" ) );
    $list47 = ConsesLow.list( makeString( "This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\n   Use the public function @xref CFASL-INPUT or the like.\n   @owner bgottesm" ), ConsesLow
        .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "INSTANCE" ), ConsesLow
            .list( makeSymbol( "NEW-CLASS-INSTANCE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "NUMBER-OF-SLOTS" ), ConsesLow.list( makeSymbol( "CFASL-INPUT" ), makeSymbol( "STREAM" ) ) ), makeSymbol(
                "SLOT-NAME" ), makeSymbol( "SLOT-VALUE" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NUMBER-OF-SLOTS" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow
                    .list( makeSymbol( "I" ), makeSymbol( "NUMBER-OF-SLOTS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SLOT-NAME" ), ConsesLow.list( makeSymbol( "CFASL-INPUT" ), makeSymbol( "STREAM" ) ),
                        makeSymbol( "SLOT-VALUE" ), ConsesLow.list( makeSymbol( "CFASL-INPUT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "SLOT-NAME" ), makeSymbol(
                            "SYMBOLP" ) ), ConsesLow.list( makeSymbol( "EVAL" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INLINE-SET-SLOT" ) ), ConsesLow.list(
                                makeSymbol( "BQ-LIST" ), makeSymbol( "SLOT-NAME" ), makeSymbol( "CLASS-NAME" ) ), makeSymbol( "INSTANCE" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "QUOTE" ) ), makeSymbol( "SLOT-VALUE" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INSTANCE" ) ) ) );
    $sym48$INTEGERP = makeSymbol( "INTEGERP" );
    $sym49$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym50$INLINE_SET_SLOT = makeSymbol( "INLINE-SET-SLOT" );
    $sym51$QUOTE = makeSymbol( "QUOTE" );
    $sym52$OBJECT_CFASL_INPUT_METHOD = makeSymbol( "OBJECT-CFASL-INPUT-METHOD" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ISOLATED-P" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "INSTANCE-COUNT" ) ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym54$OBJECT_INITIALIZE_METHOD = makeSymbol( "OBJECT-INITIALIZE-METHOD" );
    $sym55$PRINT = makeSymbol( "PRINT" );
    $list56 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<~S-~S>" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ), makeSymbol(
            "INSTANCE-NUMBER" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym58$OUTER_CATCH_FOR_OBJECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-METHOD" );
    $str59$___S__S_ = makeString( "#<~S-~S>" );
    $str60$__Malformed_Instance_ = makeString( "#<Malformed Instance>" );
    $sym61$OBJECT_PRINT_METHOD = makeSymbol( "OBJECT-PRINT-METHOD" );
    $list62 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( EQ, makeSymbol( "SELF" ), makeSymbol( "OBJECT" ) ) ) );
    $sym64$OBJECT_EQUAL_METHOD = makeSymbol( "OBJECT-EQUAL-METHOD" );
    $sym65$ESSENTIALLY_EQUAL = makeSymbol( "ESSENTIALLY-EQUAL" );
    $list66 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "IGNORE-SLOTS" ), NIL ) );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
        makeSymbol( "WITH-CLASS" ), makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "CDO-ESSENTIAL-SLOTS" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL, makeSymbol(
            "COMPILED-CLASS-SLOT-ACCESS-ALIST" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "SLOT-NAME" ), makeSymbol( "IGNORE-SLOTS" ) ), ConsesLow.list( makeSymbol(
                "PUNLESS" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT-NAME" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OBJECT" ),
                    makeSymbol( "SLOT-NAME" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "CDO-ESSENTIAL-SLOTS" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL,
                        makeSymbol( "COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "SLOT-NAME" ), makeSymbol(
                            "IGNORE-SLOTS" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT-NAME" ) ), ConsesLow.list(
                                makeSymbol( "GET-SLOT" ), makeSymbol( "OBJECT" ), makeSymbol( "SLOT-NAME" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "CDO-ESSENTIAL-SLOTS" ),
                                    ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL, makeSymbol( "COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list(
                                        makeSymbol( "MEMBER" ), makeSymbol( "SLOT-NAME" ), makeSymbol( "IGNORE-SLOTS" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol(
                                            "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT-NAME" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OBJECT" ), makeSymbol( "SLOT-NAME" ) ) ), ConsesLow
                                                .list( makeSymbol( "RET" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "CDO-ESSENTIAL-SLOTS" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL, makeSymbol(
                                                    "COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "SLOT-NAME" ),
                                                        makeSymbol( "IGNORE-SLOTS" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ),
                                                            makeSymbol( "SLOT-NAME" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "OBJECT" ), makeSymbol( "SLOT-NAME" ) ) ), ConsesLow.list( makeSymbol(
                                                                "RET" ), NIL ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym68$OBJECT_ESSENTIALLY_EQUAL_METHOD = makeSymbol( "OBJECT-ESSENTIALLY-EQUAL-METHOD" );
    $sym69$CLONE = makeSymbol( "CLONE" );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-OF-SELF" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ), makeSymbol( "CLASS-OF-SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ) ) );
    $sym71$OBJECT_CLONE_METHOD = makeSymbol( "OBJECT-CLONE-METHOD" );
    $sym72$DESCRIBE_INSTANCE = makeSymbol( "DESCRIBE-INSTANCE" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALL-INSTANCE-SLOTS" ), ConsesLow.list( makeSymbol( "INSTANCES-ALL-INSTANCE-SLOTS" ), makeSymbol(
        "SELF" ) ) ), ConsesLow.list( makeSymbol( "TAB" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "ZEROP" ), makeSymbol( "DEPTH" ) ), makeString( "" ), ConsesLow.list( makeSymbol(
            "MAKE-STRING" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol( "DEPTH" ), TWO_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "SLOT-TAB" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol(
                "ZEROP" ), makeSymbol( "DEPTH" ) ), makeString( "  " ), ConsesLow.list( makeSymbol( "MAKE-STRING" ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol( "DEPTH" ),
                    TWO_INTEGER ), TWO_INTEGER ) ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%~ADescription of instance ~S:" ), makeSymbol( "TAB" ), makeSymbol( "SELF" ) ),
        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DESCRIBE-CLASS" ) ), makeSymbol( "STREAM" ), ConsesLow.list( makeSymbol( "1+" ),
            makeSymbol( "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "INSTANCE-SLOT" ), makeSymbol( "ALL-INSTANCE-SLOTS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
                "STREAM" ), makeString( "~%~A~S -> ~S" ), makeSymbol( "SLOT-TAB" ), makeSymbol( "INSTANCE-SLOT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "INSTANCE-SLOT" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $str74$___ADescription_of_instance__S_ = makeString( "~%~ADescription of instance ~S:" );
    $sym75$OBJECT_DESCRIBE_INSTANCE_METHOD = makeSymbol( "OBJECT-DESCRIBE-INSTANCE-METHOD" );
    $sym76$CFASL_OUTPUT = makeSymbol( "CFASL-OUTPUT" );
    $list77 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PROTECTED" ) );
    $list78 = ConsesLow.list( makeString( "This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\n   Use the public function @xref CFASL-OUTPUT or the like.\n   @owner bgottesm" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CLASS-NAME" ),
            ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS" ) ) ) ), ConsesLow.list( makeSymbol( "CFASL-OUTPUT" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol(
                "WITH-CLASS" ), makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-SLOTS" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol(
                    "COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ), makeSymbol( "COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INSTANCE-SLOTS" ), ConsesLow.list(
                        makeSymbol( "DELETE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSTANCE-NUMBER" ) ), makeSymbol( "INSTANCE-SLOTS" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "SLOT-NAME" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NUMBER-OF-SLOTS" ), ConsesLow.list( makeSymbol(
                                "LENGTH" ), makeSymbol( "INSTANCE-SLOTS" ) ) ) ), ConsesLow.list( makeSymbol( "CFASL-OUTPUT" ), makeSymbol( "NUMBER-OF-SLOTS" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol(
                                    "CDOSLOTS" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL, makeSymbol( "INSTANCE-SLOTS" ) ), ConsesLow.list( makeSymbol( "CFASL-OUTPUT" ), makeSymbol( "SLOT-NAME" ),
                                        makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "CFASL-OUTPUT" ), ConsesLow.list( makeSymbol( "EVAL" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol(
                                            "QUOTE" ), makeSymbol( "INLINE-GET-SLOT" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "SLOT-NAME" ), makeSymbol( "CLASS-NAME" ) ), makeSymbol( "SELF" ) ) ),
                                            makeSymbol( "STREAM" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym79$SLOT_NAME = makeSymbol( "SLOT-NAME" );
    $sym80$INLINE_GET_SLOT = makeSymbol( "INLINE-GET-SLOT" );
    $sym81$OBJECT_CFASL_OUTPUT_METHOD = makeSymbol( "OBJECT-CFASL-OUTPUT-METHOD" );
    $sym82$ADD_GET_SLOT_LISTENER = makeSymbol( "ADD-GET-SLOT-LISTENER" );
    $list83 = ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ) );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(ADD-GET-SLOT-LISTENER OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol(
            "TARGET-SLOT" ) ), makeString( "(ADD-GET-SLOT-LISTENER OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
                makeSymbol( "MY-METHOD" ) ), makeString( "(ADD-GET-SLOT-LISTENER OBJECT): method ~S is not a method." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list( makeSymbol( "ADD-GENERIC-SLOT-LISTENER" ), makeSymbol(
                    "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeKeyword( "GET" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str85$_ADD_GET_SLOT_LISTENER_OBJECT___t = makeString( "(ADD-GET-SLOT-LISTENER OBJECT): target instance ~S is not an instance." );
    $str86$_ADD_GET_SLOT_LISTENER_OBJECT___t = makeString( "(ADD-GET-SLOT-LISTENER OBJECT): target slot ~S is not a slot." );
    $str87$_ADD_GET_SLOT_LISTENER_OBJECT___m = makeString( "(ADD-GET-SLOT-LISTENER OBJECT): method ~S is not a method." );
    $kw88$GET = makeKeyword( "GET" );
    $sym89$OBJECT_ADD_GET_SLOT_LISTENER_METHOD = makeSymbol( "OBJECT-ADD-GET-SLOT-LISTENER-METHOD" );
    $sym90$ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE = makeSymbol( "ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE" );
    $list91 = ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ), makeSymbol( "TRIGGER-VALUE" ) );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
            makeSymbol( "TARGET-SLOT" ) ), makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow
                .list( makeSymbol( "SYMBOLP" ), makeSymbol( "MY-METHOD" ) ), makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list(
                    makeSymbol( "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE" ), makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeKeyword( "GET" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ),
                    makeSymbol( "TRIGGER-VALUE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str93$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance." );
    $str94$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot." );
    $str95$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method." );
    $sym96$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD = makeSymbol( "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD" );
    $sym97$ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE = makeSymbol( "ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE" );
    $list98 = ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
            makeSymbol( "TARGET-SLOT" ) ), makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow
                .list( makeSymbol( "SYMBOLP" ), makeSymbol( "MY-METHOD" ) ), makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list(
                    makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ) ), ConsesLow.list(
                        makeSymbol( "NUMBERP" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ) ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ) ),
                            ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ) ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CHARACTERP" ), makeSymbol(
                                "TRIGGER-VALUE-LOWER-BOUND" ) ), ConsesLow.list( makeSymbol( "CHARACTERP" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ) ) ), makeString(
                                    "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type." ),
                    makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ), ConsesLow.list( makeSymbol( "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE" ), makeSymbol( "TARGET-INSTANCE" ),
                        makeSymbol( "TARGET-SLOT" ), makeKeyword( "GET" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str100$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance." );
    $str101$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot." );
    $str102$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method." );
    $str103$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString(
        "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type." );
    $sym104$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD = makeSymbol( "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD" );
    $sym105$ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM = makeSymbol( "ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM" );
    $list106 = ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeSymbol( "MY-METHOD" ), makeSymbol( "TRIGGER-ENUMERATION" ) );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
            makeSymbol( "TARGET-SLOT" ) ), makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow
                .list( makeSymbol( "SYMBOLP" ), makeSymbol( "MY-METHOD" ) ), makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list(
                    makeSymbol( "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM" ), makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeKeyword( "GET" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ),
                    makeSymbol( "TRIGGER-ENUMERATION" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str108$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance." );
    $str109$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot." );
    $str110$_ADD_GET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method." );
    $sym111$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD = makeSymbol( "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD" );
    $sym112$ADD_SET_SLOT_LISTENER = makeSymbol( "ADD-SET-SLOT-LISTENER" );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(ADD-SET-SLOT-LISTENER OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol(
            "TARGET-SLOT" ) ), makeString( "(ADD-SET-SLOT-LISTENER OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
                makeSymbol( "MY-METHOD" ) ), makeString( "(ADD-SET-SLOT-LISTENER OBJECT): method ~S is not a method." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list( makeSymbol( "ADD-GENERIC-SLOT-LISTENER" ), makeSymbol(
                    "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeKeyword( "SET" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str114$_ADD_SET_SLOT_LISTENER_OBJECT___t = makeString( "(ADD-SET-SLOT-LISTENER OBJECT): target instance ~S is not an instance." );
    $str115$_ADD_SET_SLOT_LISTENER_OBJECT___t = makeString( "(ADD-SET-SLOT-LISTENER OBJECT): target slot ~S is not a slot." );
    $str116$_ADD_SET_SLOT_LISTENER_OBJECT___m = makeString( "(ADD-SET-SLOT-LISTENER OBJECT): method ~S is not a method." );
    $kw117$SET = makeKeyword( "SET" );
    $sym118$OBJECT_ADD_SET_SLOT_LISTENER_METHOD = makeSymbol( "OBJECT-ADD-SET-SLOT-LISTENER-METHOD" );
    $sym119$ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE = makeSymbol( "ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE" );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
            makeSymbol( "TARGET-SLOT" ) ), makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow
                .list( makeSymbol( "SYMBOLP" ), makeSymbol( "MY-METHOD" ) ), makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list(
                    makeSymbol( "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE" ), makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeKeyword( "SET" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ),
                    makeSymbol( "TRIGGER-VALUE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str121$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance." );
    $str122$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot." );
    $str123$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method." );
    $sym124$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD = makeSymbol( "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD" );
    $sym125$ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE = makeSymbol( "ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE" );
    $list126 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
            makeSymbol( "TARGET-SLOT" ) ), makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow
                .list( makeSymbol( "SYMBOLP" ), makeSymbol( "MY-METHOD" ) ), makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list(
                    makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ) ), ConsesLow.list(
                        makeSymbol( "NUMBERP" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ) ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ) ),
                            ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ) ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CHARACTERP" ), makeSymbol(
                                "TRIGGER-VALUE-LOWER-BOUND" ) ), ConsesLow.list( makeSymbol( "CHARACTERP" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ) ) ), makeString(
                                    "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type." ),
                    makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ), ConsesLow.list( makeSymbol( "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE" ), makeSymbol( "TARGET-INSTANCE" ),
                        makeSymbol( "TARGET-SLOT" ), makeKeyword( "SET" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ), makeSymbol( "TRIGGER-VALUE-LOWER-BOUND" ), makeSymbol( "TRIGGER-VALUE-UPPER-BOUND" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str127$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance." );
    $str128$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot." );
    $str129$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method." );
    $str130$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString(
        "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type." );
    $sym131$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD = makeSymbol( "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD" );
    $sym132$ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM = makeSymbol( "ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM" );
    $list133 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
            makeSymbol( "TARGET-SLOT" ) ), makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow
                .list( makeSymbol( "SYMBOLP" ), makeSymbol( "MY-METHOD" ) ), makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list(
                    makeSymbol( "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM" ), makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "TARGET-SLOT" ), makeKeyword( "SET" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ),
                    makeSymbol( "TRIGGER-ENUMERATION" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str134$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance." );
    $str135$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot." );
    $str136$_ADD_SET_SLOT_LISTENER_STIMULATED = makeString( "(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method." );
    $sym137$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD = makeSymbol( "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD" );
    $sym138$REMOVE_ALL_GET_SLOT_LISTENERS = makeSymbol( "REMOVE-ALL-GET-SLOT-LISTENERS" );
    $list139 = ConsesLow.list( makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET-SLOT" ), NIL ) );
    $list140 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol(
            "TARGET-SLOT" ) ), makeString( "(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                "SLOT-LISTENERS-REMOVE-ALL-GET-SLOT-LISTENERS" ), makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "SELF" ), makeSymbol( "TARGET-SLOT" ) ) ) );
    $str141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB = makeString( "(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance." );
    $str142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB = makeString( "(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot." );
    $sym143$OBJECT_REMOVE_ALL_GET_SLOT_LISTENERS_METHOD = makeSymbol( "OBJECT-REMOVE-ALL-GET-SLOT-LISTENERS-METHOD" );
    $sym144$REMOVE_ALL_SET_SLOT_LISTENERS = makeSymbol( "REMOVE-ALL-SET-SLOT-LISTENERS" );
    $list145 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol(
            "TARGET-SLOT" ) ), makeString( "(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                "SLOT-LISTENERS-REMOVE-ALL-SET-SLOT-LISTENERS" ), makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "SELF" ), makeSymbol( "TARGET-SLOT" ) ) ) );
    $str146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB = makeString( "(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance." );
    $str147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB = makeString( "(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot." );
    $sym148$OBJECT_REMOVE_ALL_SET_SLOT_LISTENERS_METHOD = makeSymbol( "OBJECT-REMOVE-ALL-SET-SLOT-LISTENERS-METHOD" );
    $sym149$REMOVE_ALL_SLOT_LISTENERS = makeSymbol( "REMOVE-ALL-SLOT-LISTENERS" );
    $list150 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET-INSTANCE" ) ), makeString(
        "(REMOVE-ALL-SLOT-LISTENERS OBJECT): target instance ~S is not an instance." ), makeSymbol( "TARGET-INSTANCE" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol(
            "TARGET-SLOT" ) ), makeString( "(REMOVE-ALL-SLOT-LISTENERS OBJECT): target slot ~S is not a slot." ), makeSymbol( "TARGET-SLOT" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS" ), makeSymbol( "TARGET-INSTANCE" ), makeSymbol( "SELF" ), makeSymbol( "TARGET-SLOT" ) ) ) );
    $str151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT = makeString( "(REMOVE-ALL-SLOT-LISTENERS OBJECT): target instance ~S is not an instance." );
    $str152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT = makeString( "(REMOVE-ALL-SLOT-LISTENERS OBJECT): target slot ~S is not a slot." );
    $sym153$OBJECT_REMOVE_ALL_SLOT_LISTENERS_METHOD = makeSymbol( "OBJECT-REMOVE-ALL-SLOT-LISTENERS-METHOD" );
    $sym154$ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER = makeSymbol( "ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER" );
    $list155 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "TARGET-METHOD" ), makeSymbol( "MY-METHOD" ) );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol( "CLASS" ) ), ConsesLow.list( makeSymbol( "INSTANCE-P" ),
        makeSymbol( "CLASS" ) ) ), makeString( "(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance." ), makeSymbol( "CLASS" ) ), ConsesLow.list( makeSymbol( "MUST" ),
            ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "TARGET-METHOD" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "TARGET-METHOD" ) ) ), makeString(
                "(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name." ), makeSymbol( "TARGET-METHOD" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol(
                    "CAND" ), makeSymbol( "MY-METHOD" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "MY-METHOD" ) ) ), makeString(
                        "(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): method ~S is not a legal method name." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list(
                            makeSymbol( "CLASS-P" ), makeSymbol( "CLASS" ) ), ConsesLow.list( makeSymbol( "METHOD-LISTENERS-ADD-BEFORE-LISTENER" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS" ) ),
                                makeSymbol( "TARGET-METHOD" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "CLASS" ) ), ConsesLow.list(
                                    makeSymbol( "METHOD-LISTENERS-ADD-BEFORE-LISTENER" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "CLASS" ) ) ), makeSymbol(
                                        "TARGET-METHOD" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString( "(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance." );
    $str158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString( "(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name." );
    $str159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = makeString( "(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): method ~S is not a legal method name." );
    $sym160$OBJECT_ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER_METHOD = makeSymbol( "OBJECT-ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER-METHOD" );
    $sym161$ADD_CLASS_WIDE_AFTER_METHOD_LISTENER = makeSymbol( "ADD-CLASS-WIDE-AFTER-METHOD-LISTENER" );
    $list162 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol( "CLASS" ) ), ConsesLow.list( makeSymbol( "INSTANCE-P" ),
        makeSymbol( "CLASS" ) ) ), makeString( "(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance." ), makeSymbol( "CLASS" ) ), ConsesLow.list( makeSymbol( "MUST" ),
            ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "TARGET-METHOD" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "TARGET-METHOD" ) ) ), makeString(
                "(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target method ~S is not a legal method name." ), makeSymbol( "TARGET-METHOD" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol(
                    "CAND" ), makeSymbol( "MY-METHOD" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "MY-METHOD" ) ) ), makeString(
                        "(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): method ~S is not a legal method name." ), makeSymbol( "MY-METHOD" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list(
                            makeSymbol( "CLASS-P" ), makeSymbol( "CLASS" ) ), ConsesLow.list( makeSymbol( "METHOD-LISTENERS-ADD-AFTER-LISTENER" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS" ) ),
                                makeSymbol( "TARGET-METHOD" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "CLASS" ) ), ConsesLow.list(
                                    makeSymbol( "METHOD-LISTENERS-ADD-AFTER-LISTENER" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "CLASS" ) ) ), makeSymbol(
                                        "TARGET-METHOD" ), makeSymbol( "MY-METHOD" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MY-METHOD" ) ) );
    $str163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString( "(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance." );
    $str164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString( "(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target method ~S is not a legal method name." );
    $str165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = makeString( "(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): method ~S is not a legal method name." );
    $sym166$OBJECT_ADD_CLASS_WIDE_AFTER_METHOD_LISTENER_METHOD = makeSymbol( "OBJECT-ADD-CLASS-WIDE-AFTER-METHOD-LISTENER-METHOD" );
    $sym167$REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS = makeSymbol( "REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS" );
    $list168 = ConsesLow.list( makeSymbol( "MONITORED-INSTANCE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TARGET-METHOD" ), NIL ) );
    $list169 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "MONITORED-INSTANCE" ) ), ConsesLow.list( makeSymbol(
        "CLASS-P" ), makeSymbol( "MONITORED-INSTANCE" ) ) ), makeString( "(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): monitored instance ~S is not an instance." ), makeSymbol( "MONITORED-INSTANCE" ) ), ConsesLow.list(
            makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "TARGET-METHOD" ) ), makeString( "(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name." ),
            makeSymbol( "TARGET-METHOD" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS" ), makeSymbol( "MONITORED-INSTANCE" ), makeSymbol( "SELF" ),
                makeSymbol( "TARGET-METHOD" ) ) ) );
    $str170$_REMOVE_CLASS_WIDE_METHOD_LISTENE = makeString( "(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): monitored instance ~S is not an instance." );
    $str171$_REMOVE_CLASS_WIDE_METHOD_LISTENE = makeString( "(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name." );
    $sym172$OBJECT_REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS_METHOD = makeSymbol( "OBJECT-REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS-METHOD" );
    $sym173$ISOLATE = makeSymbol( "ISOLATE" );
    $list174 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ISOLATED-P" ), T ), ConsesLow.list( makeSymbol( "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym175$OUTER_CATCH_FOR_OBJECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-METHOD" );
    $sym176$OBJECT_ISOLATE_METHOD = makeSymbol( "OBJECT-ISOLATE-METHOD" );
    $sym177$PLISTIFY = makeSymbol( "PLISTIFY" );
    $list178 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTED-SLOTS" ), NIL ), ConsesLow.list( makeSymbol( "KEYWORD-PACKAGE" ), ConsesLow.list( makeSymbol(
        "SYMBOL-PACKAGE" ), makeKeyword( "TEST" ) ) ), ConsesLow.list( makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "WITH-CLASS" ),
            makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "CDO-ESSENTIAL-SLOTS" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL, makeSymbol( "COMPILED-CLASS-SLOT-ACCESS-ALIST" ) ), ConsesLow.list(
                makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "INTERN" ), ConsesLow.list( makeSymbol( "SYMBOL-NAME" ), makeSymbol( "SLOT-NAME" ) ), makeSymbol( "KEYWORD-PACKAGE" ) ), makeSymbol( "LISTED-SLOTS" ) ),
                ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT-NAME" ) ), makeSymbol( "LISTED-SLOTS" ) ) ), ConsesLow.list( makeSymbol(
                    "CDO-ESSENTIAL-SLOTS" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL, makeSymbol( "COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                        .list( makeSymbol( "INTERN" ), ConsesLow.list( makeSymbol( "SYMBOL-NAME" ), makeSymbol( "SLOT-NAME" ) ), makeSymbol( "KEYWORD-PACKAGE" ) ), makeSymbol( "LISTED-SLOTS" ) ), ConsesLow.list(
                            makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT-NAME" ) ), makeSymbol( "LISTED-SLOTS" ) ) ), ConsesLow.list( makeSymbol(
                                "CDO-ESSENTIAL-SLOTS" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL, makeSymbol( "COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                    ConsesLow.list( makeSymbol( "INTERN" ), ConsesLow.list( makeSymbol( "SYMBOL-NAME" ), makeSymbol( "SLOT-NAME" ) ), makeSymbol( "KEYWORD-PACKAGE" ) ), makeSymbol( "LISTED-SLOTS" ) ),
                                ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT-NAME" ) ), makeSymbol( "LISTED-SLOTS" ) ) ), ConsesLow.list(
                                    makeSymbol( "CDO-ESSENTIAL-SLOTS" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), NIL, NIL, NIL, NIL, makeSymbol( "COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ) ), ConsesLow.list(
                                        makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "INTERN" ), ConsesLow.list( makeSymbol( "SYMBOL-NAME" ), makeSymbol( "SLOT-NAME" ) ), makeSymbol( "KEYWORD-PACKAGE" ) ),
                                        makeSymbol( "LISTED-SLOTS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT-NAME" ) ), makeSymbol(
                                            "LISTED-SLOTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "LISTED-SLOTS" ) ) ) ) );
    $kw179$TEST = makeKeyword( "TEST" );
    $sym180$OBJECT_PLISTIFY_METHOD = makeSymbol( "OBJECT-PLISTIFY-METHOD" );
    $sym181$LISTIFY = makeSymbol( "LISTIFY" );
    $list182 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST*" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol(
        "SELF" ) ) ), makeSymbol( "INSTANCE-NUMBER" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLISTIFY" ) ) ) ) ) );
    $sym183$OUTER_CATCH_FOR_OBJECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-METHOD" );
    $sym184$OBJECT_LISTIFY_METHOD = makeSymbol( "OBJECT-LISTIFY-METHOD" );
    $sym185$ASSIMILATE = makeSymbol( "ASSIMILATE" );
    $list186 = ConsesLow.list( makeKeyword( "NO-INSTANCE-VARIABLES" ), makeKeyword( "PUBLIC" ) );
    $list187 = ConsesLow.list( makeSymbol( "PLISTIFIED-CONTENT" ) );
    $list188 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "PLISTIFIED-CONTENT" ) ), makeString( "(ASSIMILATE ~S): ~S is not a valid plist." ), makeSymbol(
        "SELF" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "SLOT" ), makeSymbol( "SLOT-NAME" ) ), ConsesLow.list( makeSymbol( "WITH-CLASS" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ),
            makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CDOPLIST" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "PLISTIFIED-CONTENT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "SLOT-ASSOC-BY-NAME" ), ConsesLow.list( makeSymbol( "SYMBOL-NAME" ), makeSymbol( "KEY" ) ), makeSymbol( "COMPILED-CLASS-SLOT-ACCESS-ALIST" ) ) ),
                ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SLOT-NAME" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), makeSymbol( "SLOT" ) ) ),
                    ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT-NAME" ), makeSymbol( "VALUE" ) ) ) ), ConsesLow.list( makeSymbol( "CDOPLIST" ), ConsesLow.list( makeSymbol( "KEY" ),
                        makeSymbol( "VALUE" ), makeSymbol( "PLISTIFIED-CONTENT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "SLOT-ASSOC-BY-NAME" ), ConsesLow.list(
                            makeSymbol( "SYMBOL-NAME" ), makeSymbol( "KEY" ) ), makeSymbol( "COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SLOT" ), ConsesLow.list(
                                makeSymbol( "CSETQ" ), makeSymbol( "SLOT-NAME" ), ConsesLow.list( makeSymbol( "SLOT-NAME" ), makeSymbol( "SLOT" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ),
                                    makeSymbol( "SLOT-NAME" ), makeSymbol( "VALUE" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $str189$_ASSIMILATE__S____S_is_not_a_vali = makeString( "(ASSIMILATE ~S): ~S is not a valid plist." );
    $sym190$OBJECT_ASSIMILATE_METHOD = makeSymbol( "OBJECT-ASSIMILATE-METHOD" );
    $str191$NEW_SUBLOOPS_INSTANCE___S_is_neit = makeString( "NEW-SUBLOOPS-INSTANCE: ~S is neither a class name nor a class." );
    $str192$CREATE_OBJECT_FROM_LIST___S_is_no = makeString( "CREATE-OBJECT-FROM-LIST: ~S is not a well formed listified " );
    $list193 = ConsesLow.listS( makeSymbol( "CLASS-NAME" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "SLOT-PLIST" ) );
    $str194$CREATE_OBJECT_FROM_LIST___S_does_ = makeString( "CREATE-OBJECT-FROM-LIST: ~S does not name a known class." );
    $list195 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol( "STREAM" ), makeSymbol( "&KEY" ), makeSymbol( "NUMBER" ), IDENTITY ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list196 = ConsesLow.list( makeKeyword( "NUMBER" ), makeKeyword( "IDENTITY" ) );
    $kw197$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw198$NUMBER = makeKeyword( "NUMBER" );
    $kw199$IDENTITY = makeKeyword( "IDENTITY" );
    $str200$INSTANCE = makeString( "INSTANCE" );
    $str201$STREAM = makeString( "STREAM" );
    $sym202$PROGN = makeSymbol( "PROGN" );
    $sym203$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list204 = ConsesLow.list( makeSymbol( "INSTANCE-P" ) );
    $sym205$CLET = makeSymbol( "CLET" );
    $sym206$PRINT_UNREADABLE_OBJECT = makeSymbol( "PRINT-UNREADABLE-OBJECT" );
    $sym207$PRINC = makeSymbol( "PRINC" );
    $sym208$CLASS_NAME = makeSymbol( "CLASS-NAME" );
    $sym209$INSTANCE_CLASS = makeSymbol( "INSTANCE-CLASS" );
    $sym210$PWHEN = makeSymbol( "PWHEN" );
    $sym211$FORMAT = makeSymbol( "FORMAT" );
    $str212$__A = makeString( "-~A" );
    $sym213$GET_OBJECT_INSTANCE_NUMBER = makeSymbol( "GET-OBJECT-INSTANCE-NUMBER" );
    $sym214$WRITE_CHAR = makeSymbol( "WRITE-CHAR" );
  }
}
/*
 * 
 * Total time: 659 ms
 * 
 */