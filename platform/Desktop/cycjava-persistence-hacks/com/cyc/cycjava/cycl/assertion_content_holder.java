package com.cyc.cycjava.cycl;

import java.lang.reflect.Field;

import org.armedbear.lisp.BuiltInClass;
import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public final class assertion_content_holder
{
  public static SubLStruct makeNewInstance()
  {
    return structDecl.newInstance();
  }

  public static SubLObject isInstance(SubLObject v_object)
  {
    final SubLObject was = structDecl.isInstance( v_object );
    return was;
  }
  static final SubLStructDecl structDecl;
  static
  {
    if( false )
      structDecl = SubLStructDecl.makeStructDeclInterpreted( //
          new String[]
          { "$formula_data", "$mt", "$flags", "$arguments", "$plist"
          }, //
          assertions_low.$sym0$ASSERTION_CONTENT, "AS-CONTENT", "_CSETF-" );
    else
      structDecl = SubLStructDeclNative.makeStructDeclNative( $assertion_content_native.class, assertions_low.$sym0$ASSERTION_CONTENT, "AS-CONTENT", "_CSETF-" );
    // structDecl.setTrackStructInstance(true, -1);
  }

  static public final class $assertion_content_native extends SubLStructNative implements SubLStruct
  {
    public SubLObject $formula_data;
    public SubLObject $mt;
    public SubLObject $flags;
    public SubLObject $arguments;
    public SubLObject $plist;

    public $assertion_content_native()
    {
      this.$formula_data = NIL;
      this.$mt = NIL;
      this.$flags = NIL;
      this.$arguments = NIL;
      this.$plist = NIL;
      this.layout = assertion_content_holder.structDecl;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$formula_data;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$flags;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$arguments;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$formula_data = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$flags = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$arguments = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$plist = value;
    }

    @Override
    public String toString()
    {
      try
      {
        return print_high.princ_to_string( this ).getStringValue();
      }
      catch( final Exception e )
      {
        return super.princToString();
        // "#<" + toTypeName() + " " + getName() + " @ " +
        // System.identityHashCode(this) + ">";
      }
    }
  }
}