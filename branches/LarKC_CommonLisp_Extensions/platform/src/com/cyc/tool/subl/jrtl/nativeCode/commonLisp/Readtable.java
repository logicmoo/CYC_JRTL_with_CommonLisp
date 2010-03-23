/*
 * Readtable.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: Readtable.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.util.Iterator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Readtable extends AbstractLispObject
{
  @Override
  public String writeToString() {
  	return unreadableString(getClass().getSimpleName());
  }

  public static final byte SYNTAX_TYPE_CONSTITUENT           = 0;
  public static final byte SYNTAX_TYPE_WHITESPACE            = 1;
  public static final byte SYNTAX_TYPE_TERMINATING_MACRO     = 2;
  public static final byte SYNTAX_TYPE_NON_TERMINATING_MACRO = 3;
  public static final byte SYNTAX_TYPE_SINGLE_ESCAPE         = 4;
  public static final byte SYNTAX_TYPE_MULTIPLE_ESCAPE       = 5;

  protected final CharHashMap<Byte> syntax = new CharHashMap<Byte>(Byte.class,SYNTAX_TYPE_CONSTITUENT);
  protected final CharHashMap<SubLObject> readerMacroFunctions = new CharHashMap<SubLObject>(SubLObject.class,null);
  protected final CharHashMap<DispatchTable> dispatchTables = new CharHashMap<DispatchTable>(DispatchTable.class,null);

  protected SubLObject readtableCase;

  public Readtable()
  {
    initialize();
  }

  protected void initialize()
  {
    Byte[] syntax = this.syntax.constants;
    syntax[9]    = SYNTAX_TYPE_WHITESPACE; // tab
    syntax[10]   = SYNTAX_TYPE_WHITESPACE; // linefeed
    syntax[12]   = SYNTAX_TYPE_WHITESPACE; // form feed
    syntax[13]   = SYNTAX_TYPE_WHITESPACE; // return
    syntax[' ']  = SYNTAX_TYPE_WHITESPACE;

    syntax['"']  = SYNTAX_TYPE_TERMINATING_MACRO;
    syntax['\''] = SYNTAX_TYPE_TERMINATING_MACRO;
    syntax['(']  = SYNTAX_TYPE_TERMINATING_MACRO;
    syntax[')']  = SYNTAX_TYPE_TERMINATING_MACRO;
    syntax[',']  = SYNTAX_TYPE_TERMINATING_MACRO;
    syntax[';']  = SYNTAX_TYPE_TERMINATING_MACRO;
    syntax['`']  = SYNTAX_TYPE_TERMINATING_MACRO;

    syntax['#']  = SYNTAX_TYPE_NON_TERMINATING_MACRO;

    syntax['\\'] = SYNTAX_TYPE_SINGLE_ESCAPE;
    syntax['|']  = SYNTAX_TYPE_MULTIPLE_ESCAPE;

    SubLObject[] readerMacroFunctions = this.readerMacroFunctions.constants;
    readerMacroFunctions[';']  = LispReader.READ_COMMENT;
    readerMacroFunctions['"']  = LispReader.READ_STRING;
    readerMacroFunctions['(']  = LispReader.READ_LIST;
    readerMacroFunctions[')']  = LispReader.READ_RIGHT_PAREN;
    readerMacroFunctions['\''] = LispReader.READ_QUOTE;
    readerMacroFunctions['#']  = LispReader.READ_DISPATCH_CHAR;

    // BACKQUOTE-MACRO and COMMA-MACRO are defined in backquote.lisp.
    readerMacroFunctions['`']  = LispSymbols.BACKQUOTE_MACRO;
    readerMacroFunctions[',']  = LispSymbols.COMMA_MACRO;

    DispatchTable dt = new DispatchTable();
    SubLObject[] dtfunctions = dt.functions.constants;
    dtfunctions['(']  = LispReader.SHARP_LEFT_PAREN;
    dtfunctions['*']  = LispReader.SHARP_STAR;
    dtfunctions['.']  = LispReader.SHARP_DOT;
    dtfunctions[':']  = LispReader.SHARP_COLON;
    dtfunctions['A']  = LispReader.SHARP_A;
    dtfunctions['B']  = LispReader.SHARP_B;
    dtfunctions['C']  = LispReader.SHARP_C;
    dtfunctions['O']  = LispReader.SHARP_O;
    dtfunctions['P']  = LispReader.SHARP_P;
    dtfunctions['R']  = LispReader.SHARP_R;
    dtfunctions['S']  = LispReader.SHARP_S;
    dtfunctions['X']  = LispReader.SHARP_X;
    dtfunctions['\''] = LispReader.SHARP_QUOTE;
    dtfunctions['\\'] = LispReader.SHARP_BACKSLASH;
    dtfunctions['|']  = LispReader.SHARP_VERTICAL_BAR;
    dtfunctions[')']  = LispReader.SHARP_ILLEGAL;
    dtfunctions['<']  = LispReader.SHARP_ILLEGAL;
    dtfunctions[' ']  = LispReader.SHARP_ILLEGAL;
    dtfunctions[8]    = LispReader.SHARP_ILLEGAL; // backspace
    dtfunctions[9]    = LispReader.SHARP_ILLEGAL; // tab
    dtfunctions[10]   = LispReader.SHARP_ILLEGAL; // newline, linefeed
    dtfunctions[12]   = LispReader.SHARP_ILLEGAL; // page
    dtfunctions[13]   = LispReader.SHARP_ILLEGAL; // return

    dispatchTables.constants['#'] = dt;

    readtableCase = Keyword.UPCASE;
  }

  public Readtable(SubLObject obj)
  {
    Readtable rt;
    if (obj == NIL)
      rt = checkReadtable(STANDARD_READTABLE.symbolValue());
    else
      rt = checkReadtable(obj);
    synchronized (rt)
      {
        copyReadtable(rt, this);
      }
  }

  // FIXME synchronization
  static void copyReadtable(Readtable from, Readtable to)
  {
    Iterator<Character> charIterator = from.syntax.getCharIterator();
      while (charIterator.hasNext()) {
        char c = charIterator.next();
          Byte dt = from.syntax.get(c);
          if (dt!=null) {
              to.syntax.put(c, dt);          
          } else {
              to.syntax.put(c, null);          
          }      
      }      
      charIterator = from.readerMacroFunctions.getCharIterator();
      while (charIterator.hasNext()) {
        char c = charIterator.next();
          SubLObject dt = from.readerMacroFunctions.get(c);
          if (dt!=null) {
              to.readerMacroFunctions.put(c, dt);          
          } else {
              to.readerMacroFunctions.put(c, null);          
          }      
      }
      charIterator = from.dispatchTables.getCharIterator();
      while (charIterator.hasNext()) {
        char c = charIterator.next();
          DispatchTable dt = from.dispatchTables.get(c);
          if (dt!=null) {
              to.dispatchTables.put(c, new DispatchTable(dt));          
          } else {
              to.dispatchTables.put(c, null);          
          }      
      }
      to.readtableCase = from.readtableCase;
  }

  @Override
  public SubLObject typeOf()
  {
    return LispSymbols.READTABLE;
  }

  @Override
  public SubLObject classOf()
  {
    return BuiltInClass.READTABLE;
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.READTABLE)
      return T;
    if (type == BuiltInClass.READTABLE)
      return T;
    return super.typep(type);
  }

  @Override
  public String toString()
  {
    return unreadableString("READTABLE");
  }

  public SubLObject getReadtableCase()
  {
    return readtableCase;
  }

  public boolean isWhitespace(char c)
  {
    return getSyntaxType(c) == SYNTAX_TYPE_WHITESPACE;
  }

  public byte getSyntaxType(char c)
  {
    return syntax.get(c);
  }

  public boolean isInvalid(char c)
  {
    switch (c)
      {
      case 8:
      case 9:
      case 10:
      case 12:
      case 13:
      case 32:
      case 127:
        return true;
      default:
        return false;
      }
  }

  public void checkInvalid(char c, LispStream stream)
  {
    // "... no mechanism is provided for changing the constituent trait of a
    // character." (2.1.4.2)
    if (isInvalid(c))
      {
        String name = CharacterFunctions.charToName(c);
        StringBuilder sb = new StringBuilder("Invalid character");
        if (name != null)
          {
            sb.append(" #\\");
            sb.append(name);
          }
        error(new ReaderError(sb.toString(), stream));
      }
  }

  public SubLObject getReaderMacroFunction(char c)
  {
    return readerMacroFunctions.get(c);
  }

  SubLObject getMacroCharacter(char c)
  {
    SubLObject function = getReaderMacroFunction(c);
    SubLObject non_terminating_p;
    if (function != null)
      {
        if (syntax.get(c) == SYNTAX_TYPE_NON_TERMINATING_MACRO)
          non_terminating_p = T;
        else
          non_terminating_p = NIL;
      }
    else
      {
        function = NIL;
        non_terminating_p = NIL;
      }
    return LispThread.currentThread().setValues(function, non_terminating_p);
  }

  void makeDispatchMacroCharacter(char dispChar, SubLObject non_terminating_p)
  {
    byte syntaxType;
    if (non_terminating_p != NIL)
      syntaxType = SYNTAX_TYPE_NON_TERMINATING_MACRO;
    else
      syntaxType = SYNTAX_TYPE_TERMINATING_MACRO;
    // FIXME synchronization
    syntax.put(dispChar,syntaxType);
    readerMacroFunctions.put(dispChar, LispReader.READ_DISPATCH_CHAR);
    dispatchTables.put(dispChar, new DispatchTable());
  }

  public SubLObject getDispatchMacroCharacter(char dispChar, char subChar)

  {
    DispatchTable dispatchTable = dispatchTables.get(dispChar);
    if (dispatchTable == null)
      {
        LispCharacter c = LispCharacter.makeChar(dispChar);
        return error(new LispError(c.writeToString() +
                                    " is not a dispatch character."));
      }
    SubLObject function =
      dispatchTable.functions.get(CharacterFunctions.toUpperCase(subChar));
    return (function != null) ? function : NIL;
  }

  public void setDispatchMacroCharacter(char dispChar, char subChar,
                                        SubLObject function)

  {
    DispatchTable dispatchTable = dispatchTables.get(dispChar);
    if (dispatchTable == null)
      {
        LispCharacter c = LispCharacter.makeChar(dispChar);
        error(new LispError(c.writeToString() +
                             " is not a dispatch character."));
      }
    dispatchTable.functions.put(CharacterFunctions.toUpperCase(subChar), function);
  }

  protected static class DispatchTable
  {
	protected final CharHashMap<SubLObject> functions;

    public DispatchTable()
    {
      functions = new CharHashMap<SubLObject>(SubLObject.class,null);
    }

    @SuppressWarnings("unchecked")
    public DispatchTable(DispatchTable dt)
    {
      functions = (CharHashMap<SubLObject>) dt.functions.clone();
    }
  }

  // ### readtablep
  private static final Primitive READTABLEP =
    new JavaPrimitive("readtablep", "object")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
        return arg instanceof Readtable ? T : NIL;
      }
    };

  // ### copy-readtable
  private static final Primitive COPY_READTABLE =
    new JavaPrimitive("copy-readtable", "&optional from-readtable to-readtable")
    {
      @Override
      public SubLObject execute()
      {
        return new Readtable(currentReadtable());
      }

      @Override
      public SubLObject execute(SubLObject arg)
      {
        return new Readtable(arg);
      }

      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        Readtable from = designator_readtable(first);
        if (second == NIL)
          return new Readtable(from);
        Readtable to = checkReadtable(second);
        copyReadtable(from, to);
        return to;
      }
    };

  // ### get-macro-character char &optional readtable
  // => function, non-terminating-p
  private static final Primitive GET_MACRO_CHARACTER =
    new JavaPrimitive("get-macro-character", "char &optional readtable")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
        char c = arg.charValue();
        Readtable rt = currentReadtable();
        return rt.getMacroCharacter(c);
      }

      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        char c = first.charValue();
        Readtable rt = designator_readtable(second);
        return rt.getMacroCharacter(c);
      }
    };

  // ### set-macro-character char new-function &optional non-terminating-p readtable
  // => t
  private static final Primitive SET_MACRO_CHARACTER =
    new JavaPrimitive("set-macro-character",
                  "char new-function &optional non-terminating-p readtable")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        return execute(first, second, NIL, currentReadtable());
      }

      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third)

      {
        return execute(first, second, third, currentReadtable());
      }

      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third, SubLObject fourth)

      {
        char c = first.charValue();
        final SubLObject designator;
        if (second instanceof Function
            || second instanceof StandardGenericFunction)
          designator = second;
        else if (second instanceof SubLSymbol)
          designator = second;
        else
          return error(new LispError(second.writeToString() +
                                      " does not designate a function."));
        byte syntaxType;
        if (third != NIL)
          syntaxType = SYNTAX_TYPE_NON_TERMINATING_MACRO;
        else
          syntaxType = SYNTAX_TYPE_TERMINATING_MACRO;
        Readtable rt = designator_readtable(fourth);
        // REVIEW synchronization
        rt.syntax.put(c, syntaxType);
        rt.readerMacroFunctions.put(c, designator);
        return T;
      }
    };

  // ### make-dispatch-macro-character char &optional non-terminating-p readtable
  // => t
  private static final Primitive MAKE_DISPATCH_MACRO_CHARACTER =
    new JavaPrimitive("make-dispatch-macro-character",
                  "char &optional non-terminating-p readtable")
    {
      @Override
      public SubLObject execute(SubLObject[] args)
      {
        if (args.length < 1 || args.length > 3)
          return error(new WrongNumberOfArgumentsException(this));
        char dispChar = args[0].charValue();
        SubLObject non_terminating_p;
        if (args.length > 1)
          non_terminating_p = args[1];
        else
          non_terminating_p = NIL;
        Readtable readtable;
        if (args.length == 3)
          readtable = checkReadtable(args[2]);
        else
          readtable = currentReadtable();
        readtable.makeDispatchMacroCharacter(dispChar, non_terminating_p);
        return T;
      }
    };

  // ### get-dispatch-macro-character disp-char sub-char &optional readtable
  // => function
  private static final Primitive GET_DISPATCH_MACRO_CHARACTER =
    new JavaPrimitive("get-dispatch-macro-character",
                  "disp-char sub-char &optional readtable")
    {
      @Override
      public SubLObject execute(SubLObject[] args)
      {
        if (args.length < 2 || args.length > 3)
          return error(new WrongNumberOfArgumentsException(this));
        char dispChar = args[0].charValue();
        char subChar = args[1].charValue();
        Readtable readtable;
        if (args.length == 3)
          readtable = designator_readtable(args[2]);
        else
          readtable = currentReadtable();
        return readtable.getDispatchMacroCharacter(dispChar, subChar);
      }
    };

  // ### set-dispatch-macro-character disp-char sub-char new-function &optional readtable
  // => t
  private static final Primitive SET_DISPATCH_MACRO_CHARACTER =
    new JavaPrimitive("set-dispatch-macro-character",
                  "disp-char sub-char new-function &optional readtable")
    {
      @Override
      public SubLObject execute(SubLObject[] args)
      {
        if (args.length < 3 || args.length > 4)
          return error(new WrongNumberOfArgumentsException(this));
        char dispChar = args[0].charValue();
        char subChar = args[1].charValue();
        SubLObject function = coerceToFunction(args[2]);
        Readtable readtable;
        if (args.length == 4)
          readtable = designator_readtable(args[3]);
        else
          readtable = currentReadtable();
        readtable.setDispatchMacroCharacter(dispChar, subChar, function);
        return T;
      }
    };

  // ### set-syntax-from-char to-char from-char &optional to-readtable from-readtable
  // => t
  private static final Primitive SET_SYNTAX_FROM_CHAR =
    new JavaPrimitive("set-syntax-from-char",
                  "to-char from-char &optional to-readtable from-readtable")
    {
      @Override
      public SubLObject execute(SubLObject[] args)
      {
        if (args.length < 2 || args.length > 4)
          return error(new WrongNumberOfArgumentsException(this));
        char toChar = args[0].charValue();
        char fromChar = args[1].charValue();
        Readtable toReadtable;
        if (args.length > 2)
          toReadtable = checkReadtable(args[2]);
        else
          toReadtable = currentReadtable();
        Readtable fromReadtable;
        if (args.length > 3)
          fromReadtable = designator_readtable(args[3]);
        else
          fromReadtable = checkReadtable(STANDARD_READTABLE.symbolValue());
        // REVIEW synchronization
        toReadtable.syntax.put(toChar, fromReadtable.syntax.get(fromChar));
        toReadtable.readerMacroFunctions.put(toChar,
        		fromReadtable.readerMacroFunctions.get(fromChar));
        // "If the character is a dispatching macro character, its entire
        // dispatch table of reader macro functions is copied."
        DispatchTable found = fromReadtable.dispatchTables.get(fromChar);
        if (found!=null)
        	toReadtable.dispatchTables.put(toChar, new DispatchTable(found));          
        else
            // Don't leave behind dispatch tables when fromChar
            // doesn't have one
        	toReadtable.dispatchTables.put(toChar, null);
        return T;
      }
    };

  // ### readtable-case readtable => mode
  private static final Primitive READTABLE_CASE =
    new JavaPrimitive("readtable-case", "readtable")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkReadtable(arg).readtableCase;
      }
    };

  // ### %set-readtable-case readtable new-mode => new-mode
  private static final Primitive _SET_READTABLE_CASE =
    new JavaPrimitive("%set-readtable-case", PACKAGE_SYS, false,
                  "readtable new-mode")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
            final Readtable readtable = checkReadtable(first);
            if (second == Keyword.UPCASE || second == Keyword.DOWNCASE ||
                second == Keyword.INVERT || second == Keyword.PRESERVE)
              {
                readtable.readtableCase = second;
                return second;
              }
            return type_error(second, list(LispSymbols.MEMBER,
                                                 Keyword.INVERT,
                                                 Keyword.PRESERVE,
                                                 Keyword.DOWNCASE,
                                                 Keyword.UPCASE));
      }
    };
}
