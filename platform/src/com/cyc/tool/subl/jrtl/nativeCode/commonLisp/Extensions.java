/*
 * Extensions.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: Extensions.java 12440 2010-02-10 16:14:22Z mevenson $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import java.io.File;
import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class Extensions
{
  // ### *ed-functions*
  public static final SubLSymbol _ED_FUNCTIONS_ =
    exportSpecial("*ED-FUNCTIONS*", PACKAGE_EXT,
                  list(intern("DEFAULT-ED-FUNCTION", PACKAGE_SYS)));

  // ### truly-the value-type form => result*
  private static final SpecialOperator TRULY_THE = new truly_the();
  private static class truly_the extends SpecialOperator {
    truly_the() {
      super("truly-the", PACKAGE_EXT, true, "type value");
    }
    @Override
    public SubLObject execute(SubLObject args, Environment env)
    {
      if (args.cl_length() != 2)
        return error(new WrongNumberOfArgumentsException(this));
      return Lisp.eval(args.second(), env, LispThread.currentThread());
    }
  }

  // ### neq
  private static final Primitive NEQ = new neq();
  private static class neq extends JavaPrimitive 
  {
    neq() 
    {
      super(LispSymbols.NEQ, "obj1 obj2");
    }
    @Override
    public SubLObject execute(SubLObject first, SubLObject second)
    {
        return first != second ? T : NIL;
    }
  }

  // ### memq item list => tail
  private static final Primitive MEMQ = new memq();
  private static class memq extends JavaPrimitive 
  {
    memq() 
    {
      super(LispSymbols.MEMQ, "item list");
    }
    @Override
    public SubLObject execute(SubLObject item, SubLObject list)
    {
      while (list instanceof SubLCons)
        {
          if (item == ((SubLCons)list).first())
            return list;
          list = ((SubLCons)list).rest();
        }
      if (list != NIL)
        type_error(list, LispSymbols.LIST);
      return NIL;
    }
  }

  // ### memql item list => tail
  private static final Primitive MEMQL = new memql();
  private static class memql extends JavaPrimitive
  {
    memql() {
      super(LispSymbols.MEMQL, "item list");
    }
    @Override
    public SubLObject execute(SubLObject item, SubLObject list)
    {
      while (list instanceof SubLCons)
        {
          if (item.eql(((SubLCons)list).first()))
            return list;
          list = ((SubLCons)list).rest();
        }
      if (list != NIL)
        type_error(list, LispSymbols.LIST);
      return NIL;
    }
  }

  // ### adjoin-eql item list => new-list
  private static final Primitive ADJOIN_EQL = new adjoin_eql();
  private static class adjoin_eql extends JavaPrimitive {
    adjoin_eql() {
      super(LispSymbols.ADJOIN_EQL, "item list");
    }
    @Override
    public SubLObject execute(SubLObject item, SubLObject list)
    {
      return memql(item, list) ? list : makeCons(item, list);
    }
  }

  // ### special-variable-p
  private static final Primitive SPECIAL_VARIABLE_P = new special_variable_p();
  private static class special_variable_p extends JavaPrimitive {
    special_variable_p() {
      super("special-variable-p", PACKAGE_EXT, true);
    }
    @Override
    public SubLObject execute(SubLObject arg)
    {
      return arg.isSpecialVariable() ? T : NIL;
    }
  }

  // ### source symbol 
  private static final Primitive SOURCE = new source();
  private static class source extends JavaPrimitive {
    source() {
      super("source", PACKAGE_EXT, true);
    }
    @Override
    public SubLObject execute(SubLObject arg)
    {
      return Lisp.get(arg, LispSymbols._SOURCE, NIL);
    }
  }

  // ### source-file-position symbol
  private static final Primitive SOURCE_FILE_POSITION = new source_file_position();
  private static class source_file_position extends JavaPrimitive {
    source_file_position() {
      super("source-file-position", PACKAGE_EXT, true);
    }
    @Override
    public SubLObject execute(SubLObject arg)
    {
      SubLObject obj = Lisp.get(arg, LispSymbols._SOURCE, NIL);
      if (obj instanceof SubLCons)
        return obj.rest();
      return NIL;
    }
  }

  // ### source-pathname
  public static final Primitive SOURCE_PATHNAME = new source_pathname();
  private static class source_pathname extends JavaPrimitive {
    source_pathname() {
      super("source-pathname", PACKAGE_EXT, true);
    }
    @Override
    public SubLObject execute(SubLObject arg)
    {
      SubLObject obj = Lisp.get(arg, LispSymbols._SOURCE, NIL);
      if (obj instanceof SubLCons)
        return obj.first();
      return obj;
    }
  }

  // ### exit
  private static final Primitive EXIT = new exit();
  private static class exit extends JavaPrimitive {
    exit() {
      super("exit", PACKAGE_EXT, true, "&key status");
    }
    @Override
    public SubLObject execute()
    {
      exit(0);
      return LispThread.currentThread().nothing();
    }
    @Override
    public SubLObject execute(SubLObject first, SubLObject second)
      
    {
      int status = 0;
      if (first == Keyword.STATUS)
        {
          if (second instanceof Fixnum)
            status = ((Fixnum)second).value;
        }
      exit(status);
      return LispThread.currentThread().nothing();
    }
  }

  // ### quit
  private static final Primitive QUIT = new quit();
  private static class quit extends JavaPrimitive {
    quit() {
      super("quit", PACKAGE_EXT, true, "&key status");
    }
    @Override
    public SubLObject execute()
    {
      exit(0);
      return LispThread.currentThread().nothing();
    }
    @Override
    public SubLObject execute(SubLObject first, SubLObject second)
    {
      int status = 0;
      if (first == Keyword.STATUS)
        {
          if (second instanceof Fixnum)
            status = ((Fixnum)second).value;
        }
      exit(status);
      return LispThread.currentThread().nothing();
    }
  }

  // ### dump-java-stack
  private static final Primitive DUMP_JAVA_STACK = new dump_java_stack();
  private static class dump_java_stack extends JavaPrimitive {
    dump_java_stack() {
      super("dump-java-stack", PACKAGE_EXT, true);
    }
    @Override
    public SubLObject execute()
    {
      Thread.dumpStack();
      return LispThread.currentThread().nothing();
    }
  }

  // ### make-temp-file => pathname
  private static final Primitive MAKE_TEMP_FILE = new make_temp_file();
  private static class make_temp_file extends JavaPrimitive { 
    make_temp_file() {
      super("make-temp-file", PACKAGE_EXT, true, "");
    }
    @Override
    public SubLObject execute()
    {
      try
        {
          File file = File.createTempFile("abcl", null, null);
          if (file != null)
            return new Pathname(file.getPath());
        }
      catch (IOException e)
        {
          Debug.trace(e);
        }
      return NIL;
    }
  }

  // ### interrupt-lisp
  private static final Primitive INTERRUPT_LISP = new interrupt_lisp();
  private static class interrupt_lisp extends JavaPrimitive {
    interrupt_lisp() {
      super("interrupt-lisp", PACKAGE_EXT, true, "");
    }
    @Override
    public SubLObject execute()
    {
      setInterrupted(true);
      return T;
    }
  }

  // ### getenv variable => string
  private static final Primitive GETENV = new getenv();
  private static class getenv extends JavaPrimitive 
  {
    getenv() 
    {
      super("getenv", PACKAGE_EXT, true, "variable",
             "Return the value of the environment VARIABLE if it exists, otherwise return NIL.");
    }
    @Override
    public SubLObject execute(SubLObject arg)
    {
      SubLString string;
      if (arg instanceof SubLString) {
        string = (SubLString) arg;
      } else
        return type_error(arg, LispSymbols.STRING);
      String result = System.getenv(string.getString());
      if (result != null)
        return makeString(result);
      else
        return NIL;
    }
  }
}
