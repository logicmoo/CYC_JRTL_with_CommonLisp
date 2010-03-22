/*
 * LispStackFrame.java
 *
 * Copyright (C) 2009 Mark Evenson
 * $Id: LispStackFrame.java 12376 2010-01-14 22:07:57Z astalla $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;

public class LispStackFrame 
  extends StackFrame
{
  public final SubLObject operator;
  final int arity;
  private final SubLObject first;
  private final SubLObject second;
  private final SubLObject third;
  private final SubLObject[] args;

  private final class UnavailableArgument extends AbstractLispObject
  {
    public UnavailableArgument () { }
    @Override
    public String writeToString() { 
      return unreadableString("unavailable arg", false); 
    }
  }

  private final SubLObject UNAVAILABLE_ARG = new UnavailableArgument();

  public LispStackFrame(SubLObject operator)
  {
    this.operator = operator;
    arity = 0;
    first = null;
    second = null;
    third = null;
    args = null;
  }

  public LispStackFrame(SubLObject operator, SubLObject arg)
  {
    this.operator = operator;
    arity = 1;
    first = arg;
    second = null;
    third = null;
    args = null;
  }

  public LispStackFrame(SubLObject operator, SubLObject first,
			SubLObject second)
  {
    this.operator = operator;
    this.first = first;
    this.second = second;
    arity = 2;
    third = null;
    args = null;
  }

  public LispStackFrame(SubLObject operator, SubLObject first,
			SubLObject second, SubLObject third)

  {
    this.operator = operator;
    this.first = first;
    this.second = second;
    this.third = third;
    arity = 3;
    args = null;
  }

  public LispStackFrame(SubLObject operator, SubLObject... args)
  {
    this.operator = operator;
    first = null;
    second = null;
    third = null;
    arity = args.length;
    this.args = args;
  }

   @Override
   public SubLObject typeOf() { 
     return LispSymbols.LISP_STACK_FRAME; 
   }
  
   @Override
   public SubLObject classOf() { 
     return BuiltInClass.LISP_STACK_FRAME; 
   }

   @Override
   public String writeToString() 
   { 
     String result = "";
     final String LISP_STACK_FRAME = "LISP-STACK-FRAME";
     try {
	 result = LispSymbols.PRIN1_TO_STRING.execute(this.toLispList()).writeToString();
     } catch (Throwable t) { // error while printing stack
       Debug.trace("Serious printing error: ");
       Debug.trace(t);
       result = unreadableString(LISP_STACK_FRAME);
     }
     return result;
   }

  @Override
  public SubLObject typep(SubLObject typeSpecifier) 

  {
    if (typeSpecifier == LispSymbols.LISP_STACK_FRAME)
      return T;
    if (typeSpecifier == BuiltInClass.LISP_STACK_FRAME)
      return T;
    return super.typep(typeSpecifier);
   }

  public SubLObject toLispList() 

  {
    SubLObject result = argsToLispList();
    if (operator instanceof Operator) {
      SubLObject lambdaName = ((Operator)operator).getLambdaName();
      if (lambdaName != null && lambdaName != Lisp.NIL)
	return result.push(lambdaName);
    }
    return result.push(operator);
  }

  private SubLObject argsToLispList() 

  {
    SubLObject result = Lisp.NIL;
    if (args != null) {
      for (int i = 0; i < args.length; i++)
        // `args' come here from LispThread.execute. I don't know
        // how it comes that some callers pass NULL ptrs around but
        // we better do not create conses with their CAR being NULL;
        // it'll horribly break printing such a cons; and probably
        // other bad things may happen, too. --TCR, 2009-09-17.
        if (args[i] == null)
          result = result.push(UNAVAILABLE_ARG);
        else
          result = result.push(args[i]);
    } else {
      do {
	if (first != null)
	  result = result.push(first);
	else
	  break;
	if (second != null)
	  result = result.push(second);
	else
	  break;
	if (third != null)
	  result = result.push(third);
	else
	  break;
      } while (false);
    }
    return result.nreverse();
  }

  public SubLString toLispString() 

  {
    String result;
    try {
      result = this.toLispList().writeToString();
    } catch (Throwable t) { // error while printing stack
      Debug.trace("Serious printing error: ");
      Debug.trace(t);
      result = unreadableString("LISP-STACK-FRAME");
    }
    return makeString(result);
  }

  public SubLObject getOperator() {
    return operator;
  }

  @Override 
  public SubLObject getParts() 

  {
    SubLObject result = NIL;
    result = result.push(makeCons("OPERATOR", getOperator()));
    SubLObject args = argsToLispList();
    if (args != NIL) {
      result = result.push(makeCons("ARGS", args));
    }
			 
    return result.nreverse();
  }

	public int getArity() {
		return arity;
	}

	@Override
	public void incrementCalls() {
			operator.incrementCallCount(arity);		
	}
}
