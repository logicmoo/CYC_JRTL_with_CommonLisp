/*
 * JavaStackFrame.java
 *
 * Copyright (C) 2009 Mark Evenson
 * $Id: JavaStackFrame.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class JavaStackFrame 
  extends StackFrame
{
  public final StackTraceElement javaFrame;

  public JavaStackFrame(StackTraceElement javaFrame)
  {
    this.javaFrame = javaFrame;
  }

  @Override
  public SubLObject typeOf() { 
    return LispSymbols.JAVA_STACK_FRAME; 
  }

  @Override
  public SubLObject classOf()   { return BuiltInClass.JAVA_STACK_FRAME; }

  @Override
  public String writeToString() { 
    final String JAVA_STACK_FRAME = "JAVA-STACK-FRAME";
    return unreadableString(JAVA_STACK_FRAME + " "
				+ toLispString().getString());
  }

  @Override
  public SubLObject typep(SubLObject typeSpecifier) 

  {
     if (typeSpecifier == LispSymbols.JAVA_STACK_FRAME)
       return T;
     if (typeSpecifier == BuiltInClass.JAVA_STACK_FRAME)
       return T;
     return super.typep(typeSpecifier);
   }

  static final SubLSymbol CLASS = internKeyword("CLASS");
  static final SubLSymbol METHOD = internKeyword("METHOD");
  static final SubLSymbol FILE = internKeyword("FILE");
  static final SubLSymbol LINE = internKeyword("LINE");
  static final SubLSymbol NATIVE_METHOD = internKeyword("NATIVE-METHOD");

  public SubLObject toLispList()
  {
    SubLObject result = Lisp.NIL;
    
    if ( javaFrame == null) 
      return result;

    result = result.push(CLASS);
    result = result.push(makeString(javaFrame.getClassName()));
    result = result.push(METHOD);
    result = result.push(makeString(javaFrame.getMethodName()));
    result = result.push(FILE);
    result = result.push(makeString(javaFrame.getFileName()));
    result = result.push(LINE);
    result = result.push(LispObjectFactory.makeInteger(javaFrame.getLineNumber()));
    if (javaFrame.isNativeMethod()) {
      result = result.push(NATIVE_METHOD);
      result = result.push(LispSymbols.T);
    }

    return result.nreverse();
  }

  @Override
  public SubLString toLispString() 

  {
    return makeString(javaFrame.toString());
  }

  @Override
  public SubLObject getParts() 

  { 
    SubLObject result = NIL;
    result = result.push(makeCons("CLASS", 
				  makeString(javaFrame.getClassName())));
    result = result.push(makeCons("METHOD", 
				  makeString(javaFrame.getMethodName())));
    result = result.push(makeCons("FILE", 
				  makeString(javaFrame.getFileName())));
    result = result.push(makeCons("LINE",
				  LispObjectFactory.makeInteger(javaFrame.getLineNumber())));
    result = result.push(makeCons("NATIVE-METHOD",
    		makeBoolean(javaFrame.isNativeMethod())));
    return result.nreverse();
  }

	@Override
	public void incrementCalls() {
		// TODO Auto-generated method stub
		
	}
}
