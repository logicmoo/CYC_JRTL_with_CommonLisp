//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.util.function.Function;
import java.util.function.Supplier;

import static org.armedbear.lisp.Lisp.*;
import javax.el.FunctionMapper;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class SubLTrampolineFile 
//
//
implements SubLFile,  Singleton
{
  /**
   * @return
   */
  public static SubLObject maybeDefault(SubLObject initVar, SubLSymbol gv, SubLObject otherwise)
  {
    return ( ( Lisp.NIL != Symbols.boundp( initVar ) && gv != null ) ? gv.getGlobalValue() : otherwise );
  }

  /**
   * @return
   */
  public static SubLObject maybeDefault(SubLObject initVar, SubLSymbol gv, Supplier<SubLObject> otherwise)
  {
    return ( ( Lisp.NIL != Symbols.boundp( initVar ) && gv != null ) ? gv.getGlobalValue() : otherwise.get() );
  }

  // public static ThrowStack throwStack = new ThrowStack();
  //
  // static public class ThrowStack {
  //
  // /**
  // * @param globalValue
  // */
  // public void push(SubLObject globalValue) {
  // // TODO Auto-generated method stub
  // if (true)
  // throw new AbstractMethodError("ThrowStack.push");
  //
  // }
  //
  // /**
  // *
  // */
  // public void pop() {
  // // TODO Auto-generated method stub
  // if (true)
  // throw new AbstractMethodError("ThrowStack.pop");
  //
  // }
  //
  // }
  //
  /**
   * @param string
   */
  public static void newF(SubLFile me, String string)
  {
    newF( me, string, 1 );
  }

  /**
   * @param string
   * @param i
   */
  public static void newF(SubLFile me, String string, int i)
  {
    SubLFiles.createFunction( me.getClass().getName() + "$$" + string, i );
  }
  public static boolean assertionsDisabledInClass = true;
  // public static boolean assertionsDisabledFor(me) = true;
  // public static SubLList throwStack;

  public SubLTrampolineFile()
  {
    BeanShellCntrl.addSubLFile(this);
  }

  public static void checkType(SubLObject obj, SubLObject typeSymbol)
  {}

  public static void enforceType(SubLObject obj, SubLSymbol predicate)
  {
    if( SubLNil.NIL == UnaryFunction.makeInstance( predicate ).processItem( obj ) )
      Errors.error( SubLObjectFactory.makeString( "Got invalid type for object: " + obj + "." + " Wanted type: " + predicate + " Actual type: " + obj.toTypeName() ) );
  }

  public static BinaryFunction extractBinaryFunc(SubLObject func)
  {
    if( func == UNPROVIDED || func == SubLNil.NIL || func == CommonSymbols.EQL )
      return BinaryFunction.EQL_TEST;
    if( func == CommonSymbols.EQ )
      return BinaryFunction.EQ_TEST;
    if( func == CommonSymbols.EQUAL )
      return BinaryFunction.EQUAL_TEST;
    if( func == CommonSymbols.EQUALP )
      return BinaryFunction.EQUALP_TEST;
    return BinaryFunction.makeInstance( func.getFunc() );
  }

  public static int extractCount(SubLObject count)
  {
    return count == UNPROVIDED || count == SubLNil.NIL ? Integer.MAX_VALUE : count.intValue();
  }

  public static int extractEnd(SubLObject end)
  {
    return end == UNPROVIDED || end == SubLNil.NIL ? Integer.MAX_VALUE : end.intValue();
  }

  public static int extractEndUsingSize(SubLObject end, SubLObject seq)
  {
    return end == UNPROVIDED || end == SubLNil.NIL ? seq.size() : end.intValue();
  }

  public static SubLPackage extractPackage(SubLObject thePackage)
  {
    return thePackage == UNPROVIDED ? SubLPackage.getCurrentPackage() : thePackage.toPackage();
  }

  public static int extractStart(SubLObject start)
  {
    return start == UNPROVIDED ? 0 : start.intValue();
  }

  public static UnaryFunction extractUnaryFunc(SubLObject func)
  {
    return func == UNPROVIDED || func == SubLNil.NIL || func == CommonSymbols.IDENTITY ? UnaryFunction.IDENTITY_UNARY_FUNC : UnaryFunction.makeInstance( func.getFunc() );
  }

  public static void main(String[] args)
  {}
}
