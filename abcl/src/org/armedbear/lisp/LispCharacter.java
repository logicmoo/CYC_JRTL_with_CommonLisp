/*
 * LispCharacter.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: LispCharacter.java 14787 2015-06-12 09:18:37Z mevenson $
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

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;
import java.util.HashMap;
import java.util.Map;

public final class LispCharacter extends NLispObject
{

  // TODO Decide if compile-pass2.lisp/ make-runtime-class.lisp should use this or the new one
 public static LispCharacter getInstance(char l) {
    return makeCharacter( l );
  }
 
  public static final LispCharacter[] constants;
  public static final CharHashMap<LispCharacter> lispChars;

  static
  {
    lispChars = new CharHashMap<LispCharacter>(LispCharacter.class,null){
      @Override
      public LispCharacter get(char c) {
        LispCharacter lc = super.get(c);
        if (lc==null) {
          lc = new LispCharacter(c);
          put(c, lc);
        }
        return lc;
      }
    };
    constants = lispChars.constants;
    for (int i = constants.length; i-- > 0;)
      constants[i] = new LispCharacter((char)i);
  }

  public final char value;
  private String name;
  public static LispCharacter makeCharacter(char c)
  {
    return lispChars.get(c);
  }

  // This needs to be public for the compiler.
  private LispCharacter(char c)
  {
    this.value = c;
  }

  @Override
  public LispObject typeOf()
  {
    if (isStandardChar())
      return Symbol.STANDARD_CHAR;
    return Symbol.CHARACTER;
  }

  @Override
  public LispObject classOf()
  {
    return BuiltInClass.CHARACTER;
  }

  @Override
  public LispObject getDescription()
  {
    StringBuilder sb = new StringBuilder("character #\\");
    sb.append(value);
    sb.append(" char-code #x");
    sb.append(Integer.toHexString(value));
    return new SimpleString(sb);
  }

  @Override
  public LispObject typep(LispObject type)
  {
    if (type == Symbol.CHARACTER)
      return T;
    if (type == BuiltInClass.CHARACTER)
      return T;
    if (type == Symbol.BASE_CHAR)
      return T;
    if (type == Symbol.STANDARD_CHAR)
      return isStandardChar() ? T : NIL;
    return super.typep(type);
  }

  @Override
  public boolean characterp()
  {
    return true;
  }

  @Override
  public LispObject STRING()
  {
    return new SimpleString(value);
  }

  boolean isStandardChar()
  {
    if (value >= ' ' && value < 127)
      return true;
    if (value == '\n')
      return true;
    return false;
  }

  @Override
  public boolean eql(char c)
  {
    return value == c;
  }

  @Override
  public boolean eql(LispObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof LispCharacter)
      {
        if (value == ((LispCharacter)obj).value)
          return true;
      }
    return false;
  }

  @Override
  public boolean equal(LispObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof LispCharacter)
      {
        if (value == ((LispCharacter)obj).value)
          return true;
      }
    return false;
  }

  @Override
  public boolean equalp(LispObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof LispCharacter)
      {
        if (value == ((LispCharacter)obj).value)
          return true;
        return LispCharacter.toLowerCase(value) == LispCharacter.toLowerCase(((LispCharacter)obj).value);
      }
    return false;
  }

  public static char getValue(LispObject obj)
  {
      if (obj instanceof LispCharacter)
        return ((LispCharacter)obj).value;
      type_error(obj, Symbol.CHARACTER);
        // Not reached.
      return 0;
  }

  public final char getValue()
  {
    return value;
  }

  @Override
  public Object javaInstance()
  {
    return Character.valueOf(value);
  }

  @Override
  public Object javaInstance(Class c)
  {
    return javaInstance();
  }

  @Override
  public int sxhash()
  {
    return value;
  }

  @Override
  public int psxhash()
  {
		return toUpperCase(value);
  }

  /** See LispObject.getStringValue() */
  @Override
  public String getStringValue()
  {
    return String.valueOf(value);
  }

  @Override
  public final String printObject()
  {
    final LispThread thread = LispThread.currentThread();
    boolean printReadably = (Symbol.PRINT_READABLY.symbolValue(thread) != NIL);
    // "Specifically, if *PRINT-READABLY* is true, printing proceeds as if
    // *PRINT-ESCAPE*, *PRINT-ARRAY*, and *PRINT-GENSYM* were also true,
    // and as if *PRINT-LENGTH*, *PRINT-LEVEL*, and *PRINT-LINES* were
    // false."
    boolean printEscape =
      printReadably || (Symbol.PRINT_ESCAPE.symbolValue(thread) != NIL);
    StringBuilder sb = new StringBuilder();
    if (printEscape)
      {
        sb.append("#\\");
        switch (value)
          {
          case 0:
            sb.append("Null");
            break;
          case 7:
            sb.append("Bell");
            break;
          case '\b':
            sb.append("Backspace");
            break;
          case '\t':
            sb.append("Tab");
            break;
          case '\n':
            sb.append("Newline");
            break;
          case '\f':
            sb.append("Page");
            break;
          case '\r':
            sb.append("Return");
            break;
          case 27:
            sb.append("Escape");
            break;
          case 127:
            sb.append("Rubout");
            break;
          case 160:
            sb.append("No-break_space");
            break;
	  default:
	    if (name!=null)
              sb.append(name);
	    else
              sb.append(value);
            break;
          }
      }
    else
      {
        sb.append(value);
      }
    return sb.toString();
  }

  // ### character
  private static final Primitive CHARACTER =
    new Primitive(Symbol.CHARACTER, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        if (arg instanceof LispCharacter)
          return arg;
        if (arg instanceof AbstractString)
          {
            if (arg.length() == 1)
              return ((AbstractString)arg).AREF(0);
          }
        else if (arg instanceof Symbol)
          {
            String name = ((Symbol)arg).getName();
            if (name.length() == 1)
              return LispCharacter.makeCharacter(name.charAt(0));
          }
        return type_error(arg, Symbol.CHARACTER_DESIGNATOR);
      }
    };

  // ### whitespacep
  private static final Primitive WHITESPACEP =
    new Primitive("whitespacep", PACKAGE_SYS, true)
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          return Character.isWhitespace(LispCharacter.getValue(arg)) ? T : NIL;
      }
    };

  // ### char-code
  private static final Primitive CHAR_CODE =
    new Primitive(Symbol.CHAR_CODE, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          int n = LispCharacter.getValue(arg);
          return Fixnum.makeFixnum(n);
      }
    };

  // ### char-int
  private static final Primitive CHAR_INT =
    new Primitive(Symbol.CHAR_INT, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          int n = LispCharacter.getValue(arg);
          return Fixnum.makeFixnum(n);
      }
    };

  // ### code-char
  private static final Primitive CODE_CHAR =
    new Primitive(Symbol.CODE_CHAR, "code")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        int n = Fixnum.getValue(arg);
        if (Character.isValidCodePoint(n))
          return LispCharacter.makeCharacter((char)n);
        return NIL;
      }
    };

  // ### characterp
  private static final Primitive CHARACTERP =
    new Primitive(Symbol.CHARACTERP, "object")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        return arg instanceof LispCharacter ? T : NIL;
      }
    };

  // ### both-case-p
  private static final Primitive BOTH_CASE_P =
    new Primitive(Symbol.BOTH_CASE_P, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        char c = getValue(arg);
        if (Character.isLowerCase(c) || Character.isUpperCase(c))
          return T;
        return NIL;
      }
    };

  // ### lower-case-p
  private static final Primitive LOWER_CASE_P =
    new Primitive(Symbol.LOWER_CASE_P, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        return Character.isLowerCase(getValue(arg)) ? T : NIL;
      }
    };

  // ### upper-case-p
  private static final Primitive UPPER_CASE_P =
    new Primitive(Symbol.UPPER_CASE_P, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        return Character.isUpperCase(getValue(arg)) ? T : NIL;
      }
    };

  // ### char-downcase
  private static final Primitive CHAR_DOWNCASE =
    new Primitive(Symbol.CHAR_DOWNCASE, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          final char c = LispCharacter.getValue(arg);
          if (c < 128)
           return constants[LOWER_CASE_CHARS[c]];
			if (Lisp.LISP_NOT_JAVA) {
				LispCharacter value = downcases.get(c);
				return value != null ? value : arg;
			}
        return LispCharacter.makeCharacter(toLowerCase(c));
      }
    };

  // ### char-upcase
  private static final Primitive CHAR_UPCASE =
    new Primitive(Symbol.CHAR_UPCASE, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        final char c;
        c = LispCharacter.getValue(arg);
        if (c < 128)
          return constants[UPPER_CASE_CHARS[c]];
			if (Lisp.LISP_NOT_JAVA) {
				LispCharacter value = upcases.get(c);
				return value != null ? value : arg;
			}
        return LispCharacter.makeCharacter(toUpperCase(c));
      }
    };

  // ### digit-char
  private static final Primitive DIGIT_CHAR =
    new Primitive(Symbol.DIGIT_CHAR, "weight &optional radix")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          if (arg instanceof Bignum)
              return NIL;

          int weight = Fixnum.getValue(arg);
        if (weight < 10)
          return constants['0'+weight];
        return NIL;
      }
      @Override
      public LispObject execute(LispObject first, LispObject second)

      {
        int radix;
        if (second instanceof Fixnum)
            radix = ((Fixnum)second).value;
        else
            radix = -1;

        if (radix < 2 || radix > 36)
          return type_error(second,
                                 list(Symbol.INTEGER, Fixnum.TWO,
                                       Fixnum.constants[36]));
        if (first instanceof Bignum)
            return NIL;
        int weight = Fixnum.getValue(first);
        if (weight >= radix)
          return NIL;
        if (weight < 10)
          return constants['0' + weight];
        return constants['A' + weight - 10];
      }
    };

  // ### digit-char-p char &optional radix => weight
  private static final Primitive DIGIT_CHAR_P =
    new Primitive(Symbol.DIGIT_CHAR_P, "char &optional radix")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          final int n = Character.digit(LispCharacter.getValue(arg), 10);
          return n < 0 ? NIL : Fixnum.makeFixnum(n);
      }
      @Override
      public LispObject execute(LispObject first, LispObject second)

      {
        char c;
            c = LispCharacter.getValue(first);
        if (second instanceof Fixnum)
          {
            int radix = ((Fixnum)second).value;
            if (radix >= 2 && radix <= 36)
              {
                int n = Character.digit(c, radix);
                return n < 0 ? NIL : Fixnum.constants[n];
              }
          }
        return type_error(second,
                               list(Symbol.INTEGER, Fixnum.TWO,
                                     Fixnum.constants[36]));
      }
    };

  // ### standard-char-p
  private static final Primitive STANDARD_CHAR_P =
    new Primitive(Symbol.STANDARD_CHAR_P, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          return checkCharacter(arg).isStandardChar() ? T : NIL;
      }
    };

  // ### graphic-char-p
  private static final Primitive GRAPHIC_CHAR_P =
    new Primitive(Symbol.GRAPHIC_CHAR_P, "char")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          char c = LispCharacter.getValue(arg);
          if (c >= ' ' && c < 127)
            return T;
          return Character.isISOControl(c) ? NIL : T;
      }
    };

  // ### alpha-char-p
  private static final Primitive ALPHA_CHAR_P =
    new Primitive(Symbol.ALPHA_CHAR_P, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          return Character.isLetter(LispCharacter.getValue(arg)) ? T : NIL;
      }
    };

  // ### alphanumericp
  private static final Primitive ALPHANUMERICP =
    new Primitive(Symbol.ALPHANUMERICP, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
          return Character.isLetterOrDigit(LispCharacter.getValue(arg)) ? T : NIL;
      }
    };

  public static final int nameToChar(String s)
  {
    String lower = s.toLowerCase();
    LispCharacter lc = namedToChar.get(lower);
    if (lc!=null) return lc.value;
    if (lower.length() == 5
        && lower.startsWith("u")) {
        try {
            final int i = Integer.parseInt(lower.substring(1, 5), 16);
            return i;
        } catch (NumberFormatException e) {};
    }
    if (lower.equals("nul"))
      return 0;
    if (lower.equals("bel"))
      return 7;
    if (lower.equals("bs"))
      return '\b';
    if (lower.equals("ht"))
      return '\t';
    if (lower.equals("linefeed") || lower.equals("lf"))
      return '\n';
    if (lower.equals("ff"))
      return '\f';
    if (lower.equals("cr"))
      return '\r';
    if (lower.equals("esc"))
      return 27;
    if (lower.equals("space") || lower.equals("sp"))
      return ' ';
    if (lower.equals("rubout") || lower.equals("del") || lower.equals("delete"))
      return 127;
    if (lower.equals("no-break_space"))
      return 160;
    if (lower.startsWith("u")) {
      int length = lower.length();
      if (length > 1 && length < 5) {
        try {
          final int i = Integer.parseInt(lower.substring(1), 16);
          return i;
        } catch (NumberFormatException e) {};
        // fall through
      }
    }

    // Unknown.
    return -1;
  }

  // ### name-char
  private static final Primitive NAME_CHAR =
    new Primitive(Symbol.NAME_CHAR, "name")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        String s = arg.STRING().getStringValue();
        int n = nameToChar(s);
        return n >= 0 ? LispCharacter.makeCharacter((char)n) : NIL;
      }
    };

  public static final String charToName(char c)
  {
    switch (c)
      {
      case 0:
        return "Null";
      case 7:
        return "Bell";
      case '\b':
        return "Backspace";
      case '\t':
        return "Tab";
      case '\n':
        return "Newline";
      case '\f':
        return "Page";
      case '\r':
        return "Return";
      case 27:
        return "Escape";
      case ' ':
        return "Space";
      case 127:
        return "Rubout";
      case 160:
        return "No-break_space";
      }

   // if (c<0 || c>255) return null;
    LispCharacter lc = lispChars.get(c);
    if(lc!=null) return lc.name;
    return null;
  }

  // ### char-name
  private static final Primitive CHAR_NAME =
    new Primitive(Symbol.CHAR_NAME, "character")
    {
      @Override
      public LispObject execute(LispObject arg)
      {
        String name = charToName(LispCharacter.getValue(arg));
        return name != null ? new SimpleString(name) : NIL;
      }
    };

  public static final char toUpperCase(char c)
  {
    if (c < 128)
      return UPPER_CASE_CHARS[c];
		if (LISP_NOT_JAVA) {
			LispCharacter value = upcases.get(c);
			return value != null ? value.getValue() : c;
		}
    return Character.toUpperCase(c);
  }

  static int maxNamedChar = 0;
  static Map<String, LispCharacter> namedToChar = new HashMap<String, LispCharacter>();
	private static Map<Integer, LispCharacter> downcases = new HashMap<Integer, LispCharacter>();
	private static Map<Integer, LispCharacter> upcases = new HashMap<Integer, LispCharacter>();

  static void setCharNames(int i, String[] string) {
    int settingChar = i;
    int index = 0;
    int stringLen = string.length;
    while(stringLen-->0) {
      setCharName(settingChar,string[index]);
      index++;
      settingChar++;
    }
		if (maxNamedChar < settingChar)
			maxNamedChar = settingChar;
  }

  static void setCharName(int settingChar, String string) {
    LispCharacter c = lispChars.get((char)settingChar);
    c.name = string;
    namedToChar.put(string.toLowerCase(), c);
  }

  static {
   new CharNameMaker0();
  }

  static class CharNameMaker0{
    {
      setCharNames(0,new String[]{"Null", "Soh", "Stx", "Etx", "Eot", "Enq", "Ack", "Bell", "Backspace", "Tab", "Newline", "Vt", "Page", "Return", "So", "Si", "Dle", "Dc1", "Dc2", "Dc3", "Dc4", "Nak", "Syn", "Etb", "Can", "Em", "Sub", "Escape", "Fs", "Gs", "Rs", "Us"});
      setCharNames(128,new String[]{"U0080", "U0081", "U0082", "U0083", "U0084", "U0085", "U0086", "U0087", "U0088", "U0089", "U008a", "U008b", "U008c", "U008d", "U008e", "U008f", "U0090", "U0091", "U0092", "U0093", "U0094", "U0095", "U0096", "U0097", "U0098", "U0099", "U009a", "U009b", "U009c", "U009d", "U009e", "U009f"});
    }
  }

  static final char[] UPPER_CASE_CHARS = new char[128];

  static
  {
    for (int i = UPPER_CASE_CHARS.length; i-- > 0;)
      UPPER_CASE_CHARS[i] = Character.toUpperCase((char)i);
  }

  public static final char toLowerCase(char c)
  {
    if (c < 128)
      return LOWER_CASE_CHARS[c];
		if (LISP_NOT_JAVA) {
			LispCharacter value = downcases.get(c);
			return value != null ? value.getValue() : c;
		}
    return Character.toLowerCase(c);
  }

  static final char[] LOWER_CASE_CHARS = new char[128];

  static
  {
    for (int i = LOWER_CASE_CHARS.length; i-- > 0;)
      LOWER_CASE_CHARS[i] = Character.toLowerCase((char)i);
  }

	/*
	 * [1]> (defun eqlt (u x ) (when (not (eql u x)) (progn (format t "~A ~A~%"
	 * u x ) (return-from 'eqlt ()))) t) EQLT [2]> (loop for i from 0 below (min
	 * 65536 char-code-limit) for x = (code-char i) always
	 *
	 * (let ((u (char-code (char-upcase x)))(d (char-code (char-downcase x))))
	 * (if (equal i u) () (format t "putUpcase(~A,~A);~%" i u)) (if (equal i d)
	 * () (format t "putDowncase(~A,~A);~%" i d)) t))
	 *
	 * (if (equal i (char-code (char-downcase x))) () (format t
	 * "downcasing.put(~A,~A);~%")) (equal i (char-code (char-downcase x)))) t
	 * (progn (format t " {~A,~A,~A},~%" i (char-code (char-upcase x))
	 * (char-code (char-downcase x))) (or (not x)
	 *
	 * (and (or (lower-case-p x) (eqlt u x))))))))
	 *
	 */

	static {
		/*
		 *
		 *
		 *
		 * (loop for i from 0 below (min 65536 char-code-limit) for x =
		 * (code-char i) always (let ((u (char-code (char-upcase x)))(d
		 * (char-code (char-downcase x)))) (if (equal i u) () (format t
		 * "putUpcase(~A,~A);~%" i u)) (if (equal i d) () (format t
		 * "putDowncase(~A,~A);~%" i d)) t))
		 *
		 * from CLISP 2.49 (2010-07-07) <http://clisp.cons.org/>
		 *
		 */
		putDowncase(65, 97);
		putDowncase(66, 98);
		putDowncase(67, 99);
		putDowncase(68, 100);
		putDowncase(69, 101);
		putDowncase(70, 102);
		putDowncase(71, 103);
		putDowncase(72, 104);
		putDowncase(73, 105);
		putDowncase(74, 106);
		putDowncase(75, 107);
		putDowncase(76, 108);
		putDowncase(77, 109);
		putDowncase(78, 110);
		putDowncase(79, 111);
		putDowncase(80, 112);
		putDowncase(81, 113);
		putDowncase(82, 114);
		putDowncase(83, 115);
		putDowncase(84, 116);
		putDowncase(85, 117);
		putDowncase(86, 118);
		putDowncase(87, 119);
		putDowncase(88, 120);
		putDowncase(89, 121);
		putDowncase(90, 122);
		putUpcase(97, 65);
		putUpcase(98, 66);
		putUpcase(99, 67);
		putUpcase(100, 68);
		putUpcase(101, 69);
		putUpcase(102, 70);
		putUpcase(103, 71);
		putUpcase(104, 72);
		putUpcase(105, 73);
		putUpcase(106, 74);
		putUpcase(107, 75);
		putUpcase(108, 76);
		putUpcase(109, 77);
		putUpcase(110, 78);
		putUpcase(111, 79);
		putUpcase(112, 80);
		putUpcase(113, 81);
		putUpcase(114, 82);
		putUpcase(115, 83);
		putUpcase(116, 84);
		putUpcase(117, 85);
		putUpcase(118, 86);
		putUpcase(119, 87);
		putUpcase(120, 88);
		putUpcase(121, 89);
		putUpcase(122, 90);
		putDowncase(192, 224);
		putDowncase(193, 225);
		putDowncase(194, 226);
		putDowncase(195, 227);
		putDowncase(196, 228);
		putDowncase(197, 229);
		putDowncase(198, 230);
		putDowncase(199, 231);
		putDowncase(200, 232);
		putDowncase(201, 233);
		putDowncase(202, 234);
		putDowncase(203, 235);
		putDowncase(204, 236);
		putDowncase(205, 237);
		putDowncase(206, 238);
		putDowncase(207, 239);
		putDowncase(208, 240);
		putDowncase(209, 241);
		putDowncase(210, 242);
		putDowncase(211, 243);
		putDowncase(212, 244);
		putDowncase(213, 245);
		putDowncase(214, 246);
		putDowncase(216, 248);
		putDowncase(217, 249);
		putDowncase(218, 250);
		putDowncase(219, 251);
		putDowncase(220, 252);
		putDowncase(221, 253);
		putDowncase(222, 254);
		putUpcase(224, 192);
		putUpcase(225, 193);
		putUpcase(226, 194);
		putUpcase(227, 195);
		putUpcase(228, 196);
		putUpcase(229, 197);
		putUpcase(230, 198);
		putUpcase(231, 199);
		putUpcase(232, 200);
		putUpcase(233, 201);
		putUpcase(234, 202);
		putUpcase(235, 203);
		putUpcase(236, 204);
		putUpcase(237, 205);
		putUpcase(238, 206);
		putUpcase(239, 207);
		putUpcase(240, 208);
		putUpcase(241, 209);
		putUpcase(242, 210);
		putUpcase(243, 211);
		putUpcase(244, 212);
		putUpcase(245, 213);
		putUpcase(246, 214);
		putUpcase(248, 216);
		putUpcase(249, 217);
		putUpcase(250, 218);
		putUpcase(251, 219);
		putUpcase(252, 220);
		putUpcase(253, 221);
		putUpcase(254, 222);
		putUpcase(255, 376);
		putDowncase(256, 257);
		putUpcase(257, 256);
		putDowncase(258, 259);
		putUpcase(259, 258);
		putDowncase(260, 261);
		putUpcase(261, 260);
		putDowncase(262, 263);
		putUpcase(263, 262);
		putDowncase(264, 265);
		putUpcase(265, 264);
		putDowncase(266, 267);
		putUpcase(267, 266);
		putDowncase(268, 269);
		putUpcase(269, 268);
		putDowncase(270, 271);
		putUpcase(271, 270);
		putDowncase(272, 273);
		putUpcase(273, 272);
		putDowncase(274, 275);
		putUpcase(275, 274);
		putDowncase(276, 277);
		putUpcase(277, 276);
		putDowncase(278, 279);
		putUpcase(279, 278);
		putDowncase(280, 281);
		putUpcase(281, 280);
		putDowncase(282, 283);
		putUpcase(283, 282);
		putDowncase(284, 285);
		putUpcase(285, 284);
		putDowncase(286, 287);
		putUpcase(287, 286);
		putDowncase(288, 289);
		putUpcase(289, 288);
		putDowncase(290, 291);
		putUpcase(291, 290);
		putDowncase(292, 293);
		putUpcase(293, 292);
		putDowncase(294, 295);
		putUpcase(295, 294);
		putDowncase(296, 297);
		putUpcase(297, 296);
		putDowncase(298, 299);
		putUpcase(299, 298);
		putDowncase(300, 301);
		putUpcase(301, 300);
		putDowncase(302, 303);
		putUpcase(303, 302);
		putDowncase(306, 307);
		putUpcase(307, 306);
		putDowncase(308, 309);
		putUpcase(309, 308);
		putDowncase(310, 311);
		putUpcase(311, 310);
		putDowncase(313, 314);
		putUpcase(314, 313);
		putDowncase(315, 316);
		putUpcase(316, 315);
		putDowncase(317, 318);
		putUpcase(318, 317);
		putDowncase(319, 320);
		putUpcase(320, 319);
		putDowncase(321, 322);
		putUpcase(322, 321);
		putDowncase(323, 324);
		putUpcase(324, 323);
		putDowncase(325, 326);
		putUpcase(326, 325);
		putDowncase(327, 328);
		putUpcase(328, 327);
		putDowncase(330, 331);
		putUpcase(331, 330);
		putDowncase(332, 333);
		putUpcase(333, 332);
		putDowncase(334, 335);
		putUpcase(335, 334);
		putDowncase(336, 337);
		putUpcase(337, 336);
		putDowncase(338, 339);
		putUpcase(339, 338);
		putDowncase(340, 341);
		putUpcase(341, 340);
		putDowncase(342, 343);
		putUpcase(343, 342);
		putDowncase(344, 345);
		putUpcase(345, 344);
		putDowncase(346, 347);
		putUpcase(347, 346);
		putDowncase(348, 349);
		putUpcase(349, 348);
		putDowncase(350, 351);
		putUpcase(351, 350);
		putDowncase(352, 353);
		putUpcase(353, 352);
		putDowncase(354, 355);
		putUpcase(355, 354);
		putDowncase(356, 357);
		putUpcase(357, 356);
		putDowncase(358, 359);
		putUpcase(359, 358);
		putDowncase(360, 361);
		putUpcase(361, 360);
		putDowncase(362, 363);
		putUpcase(363, 362);
		putDowncase(364, 365);
		putUpcase(365, 364);
		putDowncase(366, 367);
		putUpcase(367, 366);
		putDowncase(368, 369);
		putUpcase(369, 368);
		putDowncase(370, 371);
		putUpcase(371, 370);
		putDowncase(372, 373);
		putUpcase(373, 372);
		putDowncase(374, 375);
		putUpcase(375, 374);
		putDowncase(376, 255);
		putDowncase(377, 378);
		putUpcase(378, 377);
		putDowncase(379, 380);
		putUpcase(380, 379);
		putDowncase(381, 382);
		putUpcase(382, 381);
		putDowncase(385, 595);
		putDowncase(386, 387);
		putUpcase(387, 386);
		putDowncase(388, 389);
		putUpcase(389, 388);
		putDowncase(390, 596);
		putDowncase(391, 392);
		putUpcase(392, 391);
		putDowncase(393, 598);
		putDowncase(394, 599);
		putDowncase(395, 396);
		putUpcase(396, 395);
		putDowncase(398, 477);
		putDowncase(399, 601);
		putDowncase(400, 603);
		putDowncase(401, 402);
		putUpcase(402, 401);
		putDowncase(403, 608);
		putDowncase(404, 611);
		putUpcase(405, 502);
		putDowncase(406, 617);
		putDowncase(407, 616);
		putDowncase(408, 409);
		putUpcase(409, 408);
		putDowncase(412, 623);
		putDowncase(413, 626);
		putUpcase(414, 544);
		putDowncase(415, 629);
		putDowncase(416, 417);
		putUpcase(417, 416);
		putDowncase(418, 419);
		putUpcase(419, 418);
		putDowncase(420, 421);
		putUpcase(421, 420);
		putDowncase(422, 640);
		putDowncase(423, 424);
		putUpcase(424, 423);
		putDowncase(425, 643);
		putDowncase(428, 429);
		putUpcase(429, 428);
		putDowncase(430, 648);
		putDowncase(431, 432);
		putUpcase(432, 431);
		putDowncase(433, 650);
		putDowncase(434, 651);
		putDowncase(435, 436);
		putUpcase(436, 435);
		putDowncase(437, 438);
		putUpcase(438, 437);
		putDowncase(439, 658);
		putDowncase(440, 441);
		putUpcase(441, 440);
		putDowncase(444, 445);
		putUpcase(445, 444);
		putUpcase(447, 503);
		putDowncase(452, 454);
		putUpcase(454, 452);
		putDowncase(455, 457);
		putUpcase(457, 455);
		putDowncase(458, 460);
		putUpcase(460, 458);
		putDowncase(461, 462);
		putUpcase(462, 461);
		putDowncase(463, 464);
		putUpcase(464, 463);
		putDowncase(465, 466);
		putUpcase(466, 465);
		putDowncase(467, 468);
		putUpcase(468, 467);
		putDowncase(469, 470);
		putUpcase(470, 469);
		putDowncase(471, 472);
		putUpcase(472, 471);
		putDowncase(473, 474);
		putUpcase(474, 473);
		putDowncase(475, 476);
		putUpcase(476, 475);
		putUpcase(477, 398);
		putDowncase(478, 479);
		putUpcase(479, 478);
		putDowncase(480, 481);
		putUpcase(481, 480);
		putDowncase(482, 483);
		putUpcase(483, 482);
		putDowncase(484, 485);
		putUpcase(485, 484);
		putDowncase(486, 487);
		putUpcase(487, 486);
		putDowncase(488, 489);
		putUpcase(489, 488);
		putDowncase(490, 491);
		putUpcase(491, 490);
		putDowncase(492, 493);
		putUpcase(493, 492);
		putDowncase(494, 495);
		putUpcase(495, 494);
		putDowncase(497, 499);
		putUpcase(499, 497);
		putDowncase(500, 501);
		putUpcase(501, 500);
		putDowncase(502, 405);
		putDowncase(503, 447);
		putDowncase(504, 505);
		putUpcase(505, 504);
		putDowncase(506, 507);
		putUpcase(507, 506);
		putDowncase(508, 509);
		putUpcase(509, 508);
		putDowncase(510, 511);
		putUpcase(511, 510);
		putDowncase(512, 513);
		putUpcase(513, 512);
		putDowncase(514, 515);
		putUpcase(515, 514);
		putDowncase(516, 517);
		putUpcase(517, 516);
		putDowncase(518, 519);
		putUpcase(519, 518);
		putDowncase(520, 521);
		putUpcase(521, 520);
		putDowncase(522, 523);
		putUpcase(523, 522);
		putDowncase(524, 525);
		putUpcase(525, 524);
		putDowncase(526, 527);
		putUpcase(527, 526);
		putDowncase(528, 529);
		putUpcase(529, 528);
		putDowncase(530, 531);
		putUpcase(531, 530);
		putDowncase(532, 533);
		putUpcase(533, 532);
		putDowncase(534, 535);
		putUpcase(535, 534);
		putDowncase(536, 537);
		putUpcase(537, 536);
		putDowncase(538, 539);
		putUpcase(539, 538);
		putDowncase(540, 541);
		putUpcase(541, 540);
		putDowncase(542, 543);
		putUpcase(543, 542);
		putDowncase(544, 414);
		putDowncase(546, 547);
		putUpcase(547, 546);
		putDowncase(548, 549);
		putUpcase(549, 548);
		putDowncase(550, 551);
		putUpcase(551, 550);
		putDowncase(552, 553);
		putUpcase(553, 552);
		putDowncase(554, 555);
		putUpcase(555, 554);
		putDowncase(556, 557);
		putUpcase(557, 556);
		putDowncase(558, 559);
		putUpcase(559, 558);
		putDowncase(560, 561);
		putUpcase(561, 560);
		putDowncase(562, 563);
		putUpcase(563, 562);
		putUpcase(595, 385);
		putUpcase(596, 390);
		putUpcase(598, 393);
		putUpcase(599, 394);
		putUpcase(601, 399);
		putUpcase(603, 400);
		putUpcase(608, 403);
		putUpcase(611, 404);
		putUpcase(616, 407);
		putUpcase(617, 406);
		putUpcase(623, 412);
		putUpcase(626, 413);
		putUpcase(629, 415);
		putUpcase(640, 422);
		putUpcase(643, 425);
		putUpcase(648, 430);
		putUpcase(650, 433);
		putUpcase(651, 434);
		putUpcase(658, 439);
		putDowncase(902, 940);
		putDowncase(904, 941);
		putDowncase(905, 942);
		putDowncase(906, 943);
		putDowncase(908, 972);
		putDowncase(910, 973);
		putDowncase(911, 974);
		putDowncase(913, 945);
		putDowncase(914, 946);
		putDowncase(915, 947);
		putDowncase(916, 948);
		putDowncase(917, 949);
		putDowncase(918, 950);
		putDowncase(919, 951);
		putDowncase(920, 952);
		putDowncase(921, 953);
		putDowncase(922, 954);
		putDowncase(923, 955);
		putDowncase(924, 956);
		putDowncase(925, 957);
		putDowncase(926, 958);
		putDowncase(927, 959);
		putDowncase(928, 960);
		putDowncase(929, 961);
		putDowncase(931, 963);
		putDowncase(932, 964);
		putDowncase(933, 965);
		putDowncase(934, 966);
		putDowncase(935, 967);
		putDowncase(936, 968);
		putDowncase(937, 969);
		putDowncase(938, 970);
		putDowncase(939, 971);
		putUpcase(940, 902);
		putUpcase(941, 904);
		putUpcase(942, 905);
		putUpcase(943, 906);
		putUpcase(945, 913);
		putUpcase(946, 914);
		putUpcase(947, 915);
		putUpcase(948, 916);
		putUpcase(949, 917);
		putUpcase(950, 918);
		putUpcase(951, 919);
		putUpcase(952, 920);
		putUpcase(953, 921);
		putUpcase(954, 922);
		putUpcase(955, 923);
		putUpcase(956, 924);
		putUpcase(957, 925);
		putUpcase(958, 926);
		putUpcase(959, 927);
		putUpcase(960, 928);
		putUpcase(961, 929);
		putUpcase(963, 931);
		putUpcase(964, 932);
		putUpcase(965, 933);
		putUpcase(966, 934);
		putUpcase(967, 935);
		putUpcase(968, 936);
		putUpcase(969, 937);
		putUpcase(970, 938);
		putUpcase(971, 939);
		putUpcase(972, 908);
		putUpcase(973, 910);
		putUpcase(974, 911);
		putDowncase(984, 985);
		putUpcase(985, 984);
		putDowncase(986, 987);
		putUpcase(987, 986);
		putDowncase(988, 989);
		putUpcase(989, 988);
		putDowncase(990, 991);
		putUpcase(991, 990);
		putDowncase(992, 993);
		putUpcase(993, 992);
		putDowncase(994, 995);
		putUpcase(995, 994);
		putDowncase(996, 997);
		putUpcase(997, 996);
		putDowncase(998, 999);
		putUpcase(999, 998);
		putDowncase(1000, 1001);
		putUpcase(1001, 1000);
		putDowncase(1002, 1003);
		putUpcase(1003, 1002);
		putDowncase(1004, 1005);
		putUpcase(1005, 1004);
		putDowncase(1006, 1007);
		putUpcase(1007, 1006);
		putDowncase(1024, 1104);
		putDowncase(1025, 1105);
		putDowncase(1026, 1106);
		putDowncase(1027, 1107);
		putDowncase(1028, 1108);
		putDowncase(1029, 1109);
		putDowncase(1030, 1110);
		putDowncase(1031, 1111);
		putDowncase(1032, 1112);
		putDowncase(1033, 1113);
		putDowncase(1034, 1114);
		putDowncase(1035, 1115);
		putDowncase(1036, 1116);
		putDowncase(1037, 1117);
		putDowncase(1038, 1118);
		putDowncase(1039, 1119);
		putDowncase(1040, 1072);
		putDowncase(1041, 1073);
		putDowncase(1042, 1074);
		putDowncase(1043, 1075);
		putDowncase(1044, 1076);
		putDowncase(1045, 1077);
		putDowncase(1046, 1078);
		putDowncase(1047, 1079);
		putDowncase(1048, 1080);
		putDowncase(1049, 1081);
		putDowncase(1050, 1082);
		putDowncase(1051, 1083);
		putDowncase(1052, 1084);
		putDowncase(1053, 1085);
		putDowncase(1054, 1086);
		putDowncase(1055, 1087);
		putDowncase(1056, 1088);
		putDowncase(1057, 1089);
		putDowncase(1058, 1090);
		putDowncase(1059, 1091);
		putDowncase(1060, 1092);
		putDowncase(1061, 1093);
		putDowncase(1062, 1094);
		putDowncase(1063, 1095);
		putDowncase(1064, 1096);
		putDowncase(1065, 1097);
		putDowncase(1066, 1098);
		putDowncase(1067, 1099);
		putDowncase(1068, 1100);
		putDowncase(1069, 1101);
		putDowncase(1070, 1102);
		putDowncase(1071, 1103);
		putUpcase(1072, 1040);
		putUpcase(1073, 1041);
		putUpcase(1074, 1042);
		putUpcase(1075, 1043);
		putUpcase(1076, 1044);
		putUpcase(1077, 1045);
		putUpcase(1078, 1046);
		putUpcase(1079, 1047);
		putUpcase(1080, 1048);
		putUpcase(1081, 1049);
		putUpcase(1082, 1050);
		putUpcase(1083, 1051);
		putUpcase(1084, 1052);
		putUpcase(1085, 1053);
		putUpcase(1086, 1054);
		putUpcase(1087, 1055);
		putUpcase(1088, 1056);
		putUpcase(1089, 1057);
		putUpcase(1090, 1058);
		putUpcase(1091, 1059);
		putUpcase(1092, 1060);
		putUpcase(1093, 1061);
		putUpcase(1094, 1062);
		putUpcase(1095, 1063);
		putUpcase(1096, 1064);
		putUpcase(1097, 1065);
		putUpcase(1098, 1066);
		putUpcase(1099, 1067);
		putUpcase(1100, 1068);
		putUpcase(1101, 1069);
		putUpcase(1102, 1070);
		putUpcase(1103, 1071);
		putUpcase(1104, 1024);
		putUpcase(1105, 1025);
		putUpcase(1106, 1026);
		putUpcase(1107, 1027);
		putUpcase(1108, 1028);
		putUpcase(1109, 1029);
		putUpcase(1110, 1030);
		putUpcase(1111, 1031);
		putUpcase(1112, 1032);
		putUpcase(1113, 1033);
		putUpcase(1114, 1034);
		putUpcase(1115, 1035);
		putUpcase(1116, 1036);
		putUpcase(1117, 1037);
		putUpcase(1118, 1038);
		putUpcase(1119, 1039);
		putDowncase(1120, 1121);
		putUpcase(1121, 1120);
		putDowncase(1122, 1123);
		putUpcase(1123, 1122);
		putDowncase(1124, 1125);
		putUpcase(1125, 1124);
		putDowncase(1126, 1127);
		putUpcase(1127, 1126);
		putDowncase(1128, 1129);
		putUpcase(1129, 1128);
		putDowncase(1130, 1131);
		putUpcase(1131, 1130);
		putDowncase(1132, 1133);
		putUpcase(1133, 1132);
		putDowncase(1134, 1135);
		putUpcase(1135, 1134);
		putDowncase(1136, 1137);
		putUpcase(1137, 1136);
		putDowncase(1138, 1139);
		putUpcase(1139, 1138);
		putDowncase(1140, 1141);
		putUpcase(1141, 1140);
		putDowncase(1142, 1143);
		putUpcase(1143, 1142);
		putDowncase(1144, 1145);
		putUpcase(1145, 1144);
		putDowncase(1146, 1147);
		putUpcase(1147, 1146);
		putDowncase(1148, 1149);
		putUpcase(1149, 1148);
		putDowncase(1150, 1151);
		putUpcase(1151, 1150);
		putDowncase(1152, 1153);
		putUpcase(1153, 1152);
		putDowncase(1162, 1163);
		putUpcase(1163, 1162);
		putDowncase(1164, 1165);
		putUpcase(1165, 1164);
		putDowncase(1166, 1167);
		putUpcase(1167, 1166);
		putDowncase(1168, 1169);
		putUpcase(1169, 1168);
		putDowncase(1170, 1171);
		putUpcase(1171, 1170);
		putDowncase(1172, 1173);
		putUpcase(1173, 1172);
		putDowncase(1174, 1175);
		putUpcase(1175, 1174);
		putDowncase(1176, 1177);
		putUpcase(1177, 1176);
		putDowncase(1178, 1179);
		putUpcase(1179, 1178);
		putDowncase(1180, 1181);
		putUpcase(1181, 1180);
		putDowncase(1182, 1183);
		putUpcase(1183, 1182);
		putDowncase(1184, 1185);
		putUpcase(1185, 1184);
		putDowncase(1186, 1187);
		putUpcase(1187, 1186);
		putDowncase(1188, 1189);
		putUpcase(1189, 1188);
		putDowncase(1190, 1191);
		putUpcase(1191, 1190);
		putDowncase(1192, 1193);
		putUpcase(1193, 1192);
		putDowncase(1194, 1195);
		putUpcase(1195, 1194);
		putDowncase(1196, 1197);
		putUpcase(1197, 1196);
		putDowncase(1198, 1199);
		putUpcase(1199, 1198);
		putDowncase(1200, 1201);
		putUpcase(1201, 1200);
		putDowncase(1202, 1203);
		putUpcase(1203, 1202);
		putDowncase(1204, 1205);
		putUpcase(1205, 1204);
		putDowncase(1206, 1207);
		putUpcase(1207, 1206);
		putDowncase(1208, 1209);
		putUpcase(1209, 1208);
		putDowncase(1210, 1211);
		putUpcase(1211, 1210);
		putDowncase(1212, 1213);
		putUpcase(1213, 1212);
		putDowncase(1214, 1215);
		putUpcase(1215, 1214);
		putDowncase(1217, 1218);
		putUpcase(1218, 1217);
		putDowncase(1219, 1220);
		putUpcase(1220, 1219);
		putDowncase(1221, 1222);
		putUpcase(1222, 1221);
		putDowncase(1223, 1224);
		putUpcase(1224, 1223);
		putDowncase(1225, 1226);
		putUpcase(1226, 1225);
		putDowncase(1227, 1228);
		putUpcase(1228, 1227);
		putDowncase(1229, 1230);
		putUpcase(1230, 1229);
		putDowncase(1232, 1233);
		putUpcase(1233, 1232);
		putDowncase(1234, 1235);
		putUpcase(1235, 1234);
		putDowncase(1236, 1237);
		putUpcase(1237, 1236);
		putDowncase(1238, 1239);
		putUpcase(1239, 1238);
		putDowncase(1240, 1241);
		putUpcase(1241, 1240);
		putDowncase(1242, 1243);
		putUpcase(1243, 1242);
		putDowncase(1244, 1245);
		putUpcase(1245, 1244);
		putDowncase(1246, 1247);
		putUpcase(1247, 1246);
		putDowncase(1248, 1249);
		putUpcase(1249, 1248);
		putDowncase(1250, 1251);
		putUpcase(1251, 1250);
		putDowncase(1252, 1253);
		putUpcase(1253, 1252);
		putDowncase(1254, 1255);
		putUpcase(1255, 1254);
		putDowncase(1256, 1257);
		putUpcase(1257, 1256);
		putDowncase(1258, 1259);
		putUpcase(1259, 1258);
		putDowncase(1260, 1261);
		putUpcase(1261, 1260);
		putDowncase(1262, 1263);
		putUpcase(1263, 1262);
		putDowncase(1264, 1265);
		putUpcase(1265, 1264);
		putDowncase(1266, 1267);
		putUpcase(1267, 1266);
		putDowncase(1268, 1269);
		putUpcase(1269, 1268);
		putDowncase(1272, 1273);
		putUpcase(1273, 1272);
		putDowncase(1280, 1281);
		putUpcase(1281, 1280);
		putDowncase(1282, 1283);
		putUpcase(1283, 1282);
		putDowncase(1284, 1285);
		putUpcase(1285, 1284);
		putDowncase(1286, 1287);
		putUpcase(1287, 1286);
		putDowncase(1288, 1289);
		putUpcase(1289, 1288);
		putDowncase(1290, 1291);
		putUpcase(1291, 1290);
		putDowncase(1292, 1293);
		putUpcase(1293, 1292);
		putDowncase(1294, 1295);
		putUpcase(1295, 1294);
		putDowncase(1329, 1377);
		putDowncase(1330, 1378);
		putDowncase(1331, 1379);
		putDowncase(1332, 1380);
		putDowncase(1333, 1381);
		putDowncase(1334, 1382);
		putDowncase(1335, 1383);
		putDowncase(1336, 1384);
		putDowncase(1337, 1385);
		putDowncase(1338, 1386);
		putDowncase(1339, 1387);
		putDowncase(1340, 1388);
		putDowncase(1341, 1389);
		putDowncase(1342, 1390);
		putDowncase(1343, 1391);
		putDowncase(1344, 1392);
		putDowncase(1345, 1393);
		putDowncase(1346, 1394);
		putDowncase(1347, 1395);
		putDowncase(1348, 1396);
		putDowncase(1349, 1397);
		putDowncase(1350, 1398);
		putDowncase(1351, 1399);
		putDowncase(1352, 1400);
		putDowncase(1353, 1401);
		putDowncase(1354, 1402);
		putDowncase(1355, 1403);
		putDowncase(1356, 1404);
		putDowncase(1357, 1405);
		putDowncase(1358, 1406);
		putDowncase(1359, 1407);
		putDowncase(1360, 1408);
		putDowncase(1361, 1409);
		putDowncase(1362, 1410);
		putDowncase(1363, 1411);
		putDowncase(1364, 1412);
		putDowncase(1365, 1413);
		putDowncase(1366, 1414);
		putUpcase(1377, 1329);
		putUpcase(1378, 1330);
		putUpcase(1379, 1331);
		putUpcase(1380, 1332);
		putUpcase(1381, 1333);
		putUpcase(1382, 1334);
		putUpcase(1383, 1335);
		putUpcase(1384, 1336);
		putUpcase(1385, 1337);
		putUpcase(1386, 1338);
		putUpcase(1387, 1339);
		putUpcase(1388, 1340);
		putUpcase(1389, 1341);
		putUpcase(1390, 1342);
		putUpcase(1391, 1343);
		putUpcase(1392, 1344);
		putUpcase(1393, 1345);
		putUpcase(1394, 1346);
		putUpcase(1395, 1347);
		putUpcase(1396, 1348);
		putUpcase(1397, 1349);
		putUpcase(1398, 1350);
		putUpcase(1399, 1351);
		putUpcase(1400, 1352);
		putUpcase(1401, 1353);
		putUpcase(1402, 1354);
		putUpcase(1403, 1355);
		putUpcase(1404, 1356);
		putUpcase(1405, 1357);
		putUpcase(1406, 1358);
		putUpcase(1407, 1359);
		putUpcase(1408, 1360);
		putUpcase(1409, 1361);
		putUpcase(1410, 1362);
		putUpcase(1411, 1363);
		putUpcase(1412, 1364);
		putUpcase(1413, 1365);
		putUpcase(1414, 1366);
		putDowncase(7680, 7681);
		putUpcase(7681, 7680);
		putDowncase(7682, 7683);
		putUpcase(7683, 7682);
		putDowncase(7684, 7685);
		putUpcase(7685, 7684);
		putDowncase(7686, 7687);
		putUpcase(7687, 7686);
		putDowncase(7688, 7689);
		putUpcase(7689, 7688);
		putDowncase(7690, 7691);
		putUpcase(7691, 7690);
		putDowncase(7692, 7693);
		putUpcase(7693, 7692);
		putDowncase(7694, 7695);
		putUpcase(7695, 7694);
		putDowncase(7696, 7697);
		putUpcase(7697, 7696);
		putDowncase(7698, 7699);
		putUpcase(7699, 7698);
		putDowncase(7700, 7701);
		putUpcase(7701, 7700);
		putDowncase(7702, 7703);
		putUpcase(7703, 7702);
		putDowncase(7704, 7705);
		putUpcase(7705, 7704);
		putDowncase(7706, 7707);
		putUpcase(7707, 7706);
		putDowncase(7708, 7709);
		putUpcase(7709, 7708);
		putDowncase(7710, 7711);
		putUpcase(7711, 7710);
		putDowncase(7712, 7713);
		putUpcase(7713, 7712);
		putDowncase(7714, 7715);
		putUpcase(7715, 7714);
		putDowncase(7716, 7717);
		putUpcase(7717, 7716);
		putDowncase(7718, 7719);
		putUpcase(7719, 7718);
		putDowncase(7720, 7721);
		putUpcase(7721, 7720);
		putDowncase(7722, 7723);
		putUpcase(7723, 7722);
		putDowncase(7724, 7725);
		putUpcase(7725, 7724);
		putDowncase(7726, 7727);
		putUpcase(7727, 7726);
		putDowncase(7728, 7729);
		putUpcase(7729, 7728);
		putDowncase(7730, 7731);
		putUpcase(7731, 7730);
		putDowncase(7732, 7733);
		putUpcase(7733, 7732);
		putDowncase(7734, 7735);
		putUpcase(7735, 7734);
		putDowncase(7736, 7737);
		putUpcase(7737, 7736);
		putDowncase(7738, 7739);
		putUpcase(7739, 7738);
		putDowncase(7740, 7741);
		putUpcase(7741, 7740);
		putDowncase(7742, 7743);
		putUpcase(7743, 7742);
		putDowncase(7744, 7745);
		putUpcase(7745, 7744);
		putDowncase(7746, 7747);
		putUpcase(7747, 7746);
		putDowncase(7748, 7749);
		putUpcase(7749, 7748);
		putDowncase(7750, 7751);
		putUpcase(7751, 7750);
		putDowncase(7752, 7753);
		putUpcase(7753, 7752);
		putDowncase(7754, 7755);
		putUpcase(7755, 7754);
		putDowncase(7756, 7757);
		putUpcase(7757, 7756);
		putDowncase(7758, 7759);
		putUpcase(7759, 7758);
		putDowncase(7760, 7761);
		putUpcase(7761, 7760);
		putDowncase(7762, 7763);
		putUpcase(7763, 7762);
		putDowncase(7764, 7765);
		putUpcase(7765, 7764);
		putDowncase(7766, 7767);
		putUpcase(7767, 7766);
		putDowncase(7768, 7769);
		putUpcase(7769, 7768);
		putDowncase(7770, 7771);
		putUpcase(7771, 7770);
		putDowncase(7772, 7773);
		putUpcase(7773, 7772);
		putDowncase(7774, 7775);
		putUpcase(7775, 7774);
		putDowncase(7776, 7777);
		putUpcase(7777, 7776);
		putDowncase(7778, 7779);
		putUpcase(7779, 7778);
		putDowncase(7780, 7781);
		putUpcase(7781, 7780);
		putDowncase(7782, 7783);
		putUpcase(7783, 7782);
		putDowncase(7784, 7785);
		putUpcase(7785, 7784);
		putDowncase(7786, 7787);
		putUpcase(7787, 7786);
		putDowncase(7788, 7789);
		putUpcase(7789, 7788);
		putDowncase(7790, 7791);
		putUpcase(7791, 7790);
		putDowncase(7792, 7793);
		putUpcase(7793, 7792);
		putDowncase(7794, 7795);
		putUpcase(7795, 7794);
		putDowncase(7796, 7797);
		putUpcase(7797, 7796);
		putDowncase(7798, 7799);
		putUpcase(7799, 7798);
		putDowncase(7800, 7801);
		putUpcase(7801, 7800);
		putDowncase(7802, 7803);
		putUpcase(7803, 7802);
		putDowncase(7804, 7805);
		putUpcase(7805, 7804);
		putDowncase(7806, 7807);
		putUpcase(7807, 7806);
		putDowncase(7808, 7809);
		putUpcase(7809, 7808);
		putDowncase(7810, 7811);
		putUpcase(7811, 7810);
		putDowncase(7812, 7813);
		putUpcase(7813, 7812);
		putDowncase(7814, 7815);
		putUpcase(7815, 7814);
		putDowncase(7816, 7817);
		putUpcase(7817, 7816);
		putDowncase(7818, 7819);
		putUpcase(7819, 7818);
		putDowncase(7820, 7821);
		putUpcase(7821, 7820);
		putDowncase(7822, 7823);
		putUpcase(7823, 7822);
		putDowncase(7824, 7825);
		putUpcase(7825, 7824);
		putDowncase(7826, 7827);
		putUpcase(7827, 7826);
		putDowncase(7828, 7829);
		putUpcase(7829, 7828);
		putDowncase(7840, 7841);
		putUpcase(7841, 7840);
		putDowncase(7842, 7843);
		putUpcase(7843, 7842);
		putDowncase(7844, 7845);
		putUpcase(7845, 7844);
		putDowncase(7846, 7847);
		putUpcase(7847, 7846);
		putDowncase(7848, 7849);
		putUpcase(7849, 7848);
		putDowncase(7850, 7851);
		putUpcase(7851, 7850);
		putDowncase(7852, 7853);
		putUpcase(7853, 7852);
		putDowncase(7854, 7855);
		putUpcase(7855, 7854);
		putDowncase(7856, 7857);
		putUpcase(7857, 7856);
		putDowncase(7858, 7859);
		putUpcase(7859, 7858);
		putDowncase(7860, 7861);
		putUpcase(7861, 7860);
		putDowncase(7862, 7863);
		putUpcase(7863, 7862);
		putDowncase(7864, 7865);
		putUpcase(7865, 7864);
		putDowncase(7866, 7867);
		putUpcase(7867, 7866);
		putDowncase(7868, 7869);
		putUpcase(7869, 7868);
		putDowncase(7870, 7871);
		putUpcase(7871, 7870);
		putDowncase(7872, 7873);
		putUpcase(7873, 7872);
		putDowncase(7874, 7875);
		putUpcase(7875, 7874);
		putDowncase(7876, 7877);
		putUpcase(7877, 7876);
		putDowncase(7878, 7879);
		putUpcase(7879, 7878);
		putDowncase(7880, 7881);
		putUpcase(7881, 7880);
		putDowncase(7882, 7883);
		putUpcase(7883, 7882);
		putDowncase(7884, 7885);
		putUpcase(7885, 7884);
		putDowncase(7886, 7887);
		putUpcase(7887, 7886);
		putDowncase(7888, 7889);
		putUpcase(7889, 7888);
		putDowncase(7890, 7891);
		putUpcase(7891, 7890);
		putDowncase(7892, 7893);
		putUpcase(7893, 7892);
		putDowncase(7894, 7895);
		putUpcase(7895, 7894);
		putDowncase(7896, 7897);
		putUpcase(7897, 7896);
		putDowncase(7898, 7899);
		putUpcase(7899, 7898);
		putDowncase(7900, 7901);
		putUpcase(7901, 7900);
		putDowncase(7902, 7903);
		putUpcase(7903, 7902);
		putDowncase(7904, 7905);
		putUpcase(7905, 7904);
		putDowncase(7906, 7907);
		putUpcase(7907, 7906);
		putDowncase(7908, 7909);
		putUpcase(7909, 7908);
		putDowncase(7910, 7911);
		putUpcase(7911, 7910);
		putDowncase(7912, 7913);
		putUpcase(7913, 7912);
		putDowncase(7914, 7915);
		putUpcase(7915, 7914);
		putDowncase(7916, 7917);
		putUpcase(7917, 7916);
		putDowncase(7918, 7919);
		putUpcase(7919, 7918);
		putDowncase(7920, 7921);
		putUpcase(7921, 7920);
		putDowncase(7922, 7923);
		putUpcase(7923, 7922);
		putDowncase(7924, 7925);
		putUpcase(7925, 7924);
		putDowncase(7926, 7927);
		putUpcase(7927, 7926);
		putDowncase(7928, 7929);
		putUpcase(7929, 7928);
		putUpcase(7936, 7944);
		putUpcase(7937, 7945);
		putUpcase(7938, 7946);
		putUpcase(7939, 7947);
		putUpcase(7940, 7948);
		putUpcase(7941, 7949);
		putUpcase(7942, 7950);
		putUpcase(7943, 7951);
		putDowncase(7944, 7936);
		putDowncase(7945, 7937);
		putDowncase(7946, 7938);
		putDowncase(7947, 7939);
		putDowncase(7948, 7940);
		putDowncase(7949, 7941);
		putDowncase(7950, 7942);
		putDowncase(7951, 7943);
		putUpcase(7952, 7960);
		putUpcase(7953, 7961);
		putUpcase(7954, 7962);
		putUpcase(7955, 7963);
		putUpcase(7956, 7964);
		putUpcase(7957, 7965);
		putDowncase(7960, 7952);
		putDowncase(7961, 7953);
		putDowncase(7962, 7954);
		putDowncase(7963, 7955);
		putDowncase(7964, 7956);
		putDowncase(7965, 7957);
		putUpcase(7968, 7976);
		putUpcase(7969, 7977);
		putUpcase(7970, 7978);
		putUpcase(7971, 7979);
		putUpcase(7972, 7980);
		putUpcase(7973, 7981);
		putUpcase(7974, 7982);
		putUpcase(7975, 7983);
		putDowncase(7976, 7968);
		putDowncase(7977, 7969);
		putDowncase(7978, 7970);
		putDowncase(7979, 7971);
		putDowncase(7980, 7972);
		putDowncase(7981, 7973);
		putDowncase(7982, 7974);
		putDowncase(7983, 7975);
		putUpcase(7984, 7992);
		putUpcase(7985, 7993);
		putUpcase(7986, 7994);
		putUpcase(7987, 7995);
		putUpcase(7988, 7996);
		putUpcase(7989, 7997);
		putUpcase(7990, 7998);
		putUpcase(7991, 7999);
		putDowncase(7992, 7984);
		putDowncase(7993, 7985);
		putDowncase(7994, 7986);
		putDowncase(7995, 7987);
		putDowncase(7996, 7988);
		putDowncase(7997, 7989);
		putDowncase(7998, 7990);
		putDowncase(7999, 7991);
		putUpcase(8000, 8008);
		putUpcase(8001, 8009);
		putUpcase(8002, 8010);
		putUpcase(8003, 8011);
		putUpcase(8004, 8012);
		putUpcase(8005, 8013);
		putDowncase(8008, 8000);
		putDowncase(8009, 8001);
		putDowncase(8010, 8002);
		putDowncase(8011, 8003);
		putDowncase(8012, 8004);
		putDowncase(8013, 8005);
		putUpcase(8017, 8025);
		putUpcase(8019, 8027);
		putUpcase(8021, 8029);
		putUpcase(8023, 8031);
		putDowncase(8025, 8017);
		putDowncase(8027, 8019);
		putDowncase(8029, 8021);
		putDowncase(8031, 8023);
		putUpcase(8032, 8040);
		putUpcase(8033, 8041);
		putUpcase(8034, 8042);
		putUpcase(8035, 8043);
		putUpcase(8036, 8044);
		putUpcase(8037, 8045);
		putUpcase(8038, 8046);
		putUpcase(8039, 8047);
		putDowncase(8040, 8032);
		putDowncase(8041, 8033);
		putDowncase(8042, 8034);
		putDowncase(8043, 8035);
		putDowncase(8044, 8036);
		putDowncase(8045, 8037);
		putDowncase(8046, 8038);
		putDowncase(8047, 8039);
		putUpcase(8048, 8122);
		putUpcase(8049, 8123);
		putUpcase(8050, 8136);
		putUpcase(8051, 8137);
		putUpcase(8052, 8138);
		putUpcase(8053, 8139);
		putUpcase(8054, 8154);
		putUpcase(8055, 8155);
		putUpcase(8056, 8184);
		putUpcase(8057, 8185);
		putUpcase(8058, 8170);
		putUpcase(8059, 8171);
		putUpcase(8060, 8186);
		putUpcase(8061, 8187);
		putUpcase(8064, 8072);
		putUpcase(8065, 8073);
		putUpcase(8066, 8074);
		putUpcase(8067, 8075);
		putUpcase(8068, 8076);
		putUpcase(8069, 8077);
		putUpcase(8070, 8078);
		putUpcase(8071, 8079);
		putDowncase(8072, 8064);
		putDowncase(8073, 8065);
		putDowncase(8074, 8066);
		putDowncase(8075, 8067);
		putDowncase(8076, 8068);
		putDowncase(8077, 8069);
		putDowncase(8078, 8070);
		putDowncase(8079, 8071);
		putUpcase(8080, 8088);
		putUpcase(8081, 8089);
		putUpcase(8082, 8090);
		putUpcase(8083, 8091);
		putUpcase(8084, 8092);
		putUpcase(8085, 8093);
		putUpcase(8086, 8094);
		putUpcase(8087, 8095);
		putDowncase(8088, 8080);
		putDowncase(8089, 8081);
		putDowncase(8090, 8082);
		putDowncase(8091, 8083);
		putDowncase(8092, 8084);
		putDowncase(8093, 8085);
		putDowncase(8094, 8086);
		putDowncase(8095, 8087);
		putUpcase(8096, 8104);
		putUpcase(8097, 8105);
		putUpcase(8098, 8106);
		putUpcase(8099, 8107);
		putUpcase(8100, 8108);
		putUpcase(8101, 8109);
		putUpcase(8102, 8110);
		putUpcase(8103, 8111);
		putDowncase(8104, 8096);
		putDowncase(8105, 8097);
		putDowncase(8106, 8098);
		putDowncase(8107, 8099);
		putDowncase(8108, 8100);
		putDowncase(8109, 8101);
		putDowncase(8110, 8102);
		putDowncase(8111, 8103);
		putUpcase(8112, 8120);
		putUpcase(8113, 8121);
		putUpcase(8115, 8124);
		putDowncase(8120, 8112);
		putDowncase(8121, 8113);
		putDowncase(8122, 8048);
		putDowncase(8123, 8049);
		putDowncase(8124, 8115);
		putUpcase(8131, 8140);
		putDowncase(8136, 8050);
		putDowncase(8137, 8051);
		putDowncase(8138, 8052);
		putDowncase(8139, 8053);
		putDowncase(8140, 8131);
		putUpcase(8144, 8152);
		putUpcase(8145, 8153);
		putDowncase(8152, 8144);
		putDowncase(8153, 8145);
		putDowncase(8154, 8054);
		putDowncase(8155, 8055);
		putUpcase(8160, 8168);
		putUpcase(8161, 8169);
		putUpcase(8165, 8172);
		putDowncase(8168, 8160);
		putDowncase(8169, 8161);
		putDowncase(8170, 8058);
		putDowncase(8171, 8059);
		putDowncase(8172, 8165);
		putUpcase(8179, 8188);
		putDowncase(8184, 8056);
		putDowncase(8185, 8057);
		putDowncase(8186, 8060);
		putDowncase(8187, 8061);
		putDowncase(8188, 8179);
		putDowncase(8544, 8560);
		putDowncase(8545, 8561);
		putDowncase(8546, 8562);
		putDowncase(8547, 8563);
		putDowncase(8548, 8564);
		putDowncase(8549, 8565);
		putDowncase(8550, 8566);
		putDowncase(8551, 8567);
		putDowncase(8552, 8568);
		putDowncase(8553, 8569);
		putDowncase(8554, 8570);
		putDowncase(8555, 8571);
		putDowncase(8556, 8572);
		putDowncase(8557, 8573);
		putDowncase(8558, 8574);
		putDowncase(8559, 8575);
		putUpcase(8560, 8544);
		putUpcase(8561, 8545);
		putUpcase(8562, 8546);
		putUpcase(8563, 8547);
		putUpcase(8564, 8548);
		putUpcase(8565, 8549);
		putUpcase(8566, 8550);
		putUpcase(8567, 8551);
		putUpcase(8568, 8552);
		putUpcase(8569, 8553);
		putUpcase(8570, 8554);
		putUpcase(8571, 8555);
		putUpcase(8572, 8556);
		putUpcase(8573, 8557);
		putUpcase(8574, 8558);
		putUpcase(8575, 8559);
		putDowncase(9398, 9424);
		putDowncase(9399, 9425);
		putDowncase(9400, 9426);
		putDowncase(9401, 9427);
		putDowncase(9402, 9428);
		putDowncase(9403, 9429);
		putDowncase(9404, 9430);
		putDowncase(9405, 9431);
		putDowncase(9406, 9432);
		putDowncase(9407, 9433);
		putDowncase(9408, 9434);
		putDowncase(9409, 9435);
		putDowncase(9410, 9436);
		putDowncase(9411, 9437);
		putDowncase(9412, 9438);
		putDowncase(9413, 9439);
		putDowncase(9414, 9440);
		putDowncase(9415, 9441);
		putDowncase(9416, 9442);
		putDowncase(9417, 9443);
		putDowncase(9418, 9444);
		putDowncase(9419, 9445);
		putDowncase(9420, 9446);
		putDowncase(9421, 9447);
		putDowncase(9422, 9448);
		putDowncase(9423, 9449);
		putUpcase(9424, 9398);
		putUpcase(9425, 9399);
		putUpcase(9426, 9400);
		putUpcase(9427, 9401);
		putUpcase(9428, 9402);
		putUpcase(9429, 9403);
		putUpcase(9430, 9404);
		putUpcase(9431, 9405);
		putUpcase(9432, 9406);
		putUpcase(9433, 9407);
		putUpcase(9434, 9408);
		putUpcase(9435, 9409);
		putUpcase(9436, 9410);
		putUpcase(9437, 9411);
		putUpcase(9438, 9412);
		putUpcase(9439, 9413);
		putUpcase(9440, 9414);
		putUpcase(9441, 9415);
		putUpcase(9442, 9416);
		putUpcase(9443, 9417);
		putUpcase(9444, 9418);
		putUpcase(9445, 9419);
		putUpcase(9446, 9420);
		putUpcase(9447, 9421);
		putUpcase(9448, 9422);
		putUpcase(9449, 9423);
		putDowncase(65313, 65345);
		putDowncase(65314, 65346);
		putDowncase(65315, 65347);
		putDowncase(65316, 65348);
		putDowncase(65317, 65349);
		putDowncase(65318, 65350);
		putDowncase(65319, 65351);
		putDowncase(65320, 65352);
		putDowncase(65321, 65353);
		putDowncase(65322, 65354);
		putDowncase(65323, 65355);
		putDowncase(65324, 65356);
		putDowncase(65325, 65357);
		putDowncase(65326, 65358);
		putDowncase(65327, 65359);
		putDowncase(65328, 65360);
		putDowncase(65329, 65361);
		putDowncase(65330, 65362);
		putDowncase(65331, 65363);
		putDowncase(65332, 65364);
		putDowncase(65333, 65365);
		putDowncase(65334, 65366);
		putDowncase(65335, 65367);
		putDowncase(65336, 65368);
		putDowncase(65337, 65369);
		putDowncase(65338, 65370);
		putUpcase(65345, 65313);
		putUpcase(65346, 65314);
		putUpcase(65347, 65315);
		putUpcase(65348, 65316);
		putUpcase(65349, 65317);
		putUpcase(65350, 65318);
		putUpcase(65351, 65319);
		putUpcase(65352, 65320);
		putUpcase(65353, 65321);
		putUpcase(65354, 65322);
		putUpcase(65355, 65323);
		putUpcase(65356, 65324);
		putUpcase(65357, 65325);
		putUpcase(65358, 65326);
		putUpcase(65359, 65327);
		putUpcase(65360, 65328);
		putUpcase(65361, 65329);
		putUpcase(65362, 65330);
		putUpcase(65363, 65331);
		putUpcase(65364, 65332);
		putUpcase(65365, 65333);
		putUpcase(65366, 65334);
		putUpcase(65367, 65335);
		putUpcase(65368, 65336);
		putUpcase(65369, 65337);
		putUpcase(65370, 65338);

	}

	private static void putDowncase(int i, int j) {
		downcases.put((Integer) i, LispCharacter.makeCharacter((char) j));
	}

	private static void putUpcase(int i, int j) {
		upcases.put((Integer) i, LispCharacter.makeCharacter((char) j));
	}

	public static boolean isUpperCase(char c) {
		// TODO Auto-generated method stub
		if (Character.isUpperCase(c)) return true;
		return false;

	}

	public static boolean isLowerCase(char c) {
		if (Character.isLowerCase(c)) return true;
		return false;
	}

	public static char invertChar(char c) {
		if (LispCharacter.isUpperCase(c))
			return LispCharacter.toLowerCase(c);
		else if (LispCharacter.isLowerCase(c))
			return (LispCharacter.toUpperCase(c));
		return c;
    }
}
