package ViolinStrings;

/*
 * @(#)Strings.java 0.90 98/02/12
 *
 * (C) Michael Schmeling 1998 - All Rights Reserved
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * THE AUTHOR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 * SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE AUTHOR SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */

import java.util.*;

/**
 * The <code>Strings</code> class provides a number of useful string manipulation
 * methods. It cannot be instantiated.
 * <p>
 * You would typically use it in the following manner:
 * <p><blockquote><pre>
 *    String s = "abcdefg";
 *    String x = Strings.leftJustify(s, 20);
 * </pre></blockquote><p>
 *
 * <p>
 * Some of the methods just call the equivalent methods from java.lang.String.
 * They are provided to collect all string methods in one place.
 *
 * @see          java.lang.String
 * @see          java.lang.StringBuffer
 * @see          java.lang.Character
 * @version      0.90 02/12/98
 * @author       Michael Schmeling
 */
public final class Strings
{
   private Strings()
   {
	  // No instantiation of this class permitted
   }   
   /*======================== private methods ================================*/
   private static Vector buildWordList(String s, int ls)
   {
	  int start = 0;
	  int end   = 0;
	  int words = 0;

	  Vector wordList = new Vector();

	  int pos = 0;

	  while (pos < ls)
	  {
	      // search for the beginning of a word
	      while ( pos < ls && Character.isWhitespace(s.charAt(pos)) ) pos++;
		 start = pos++;

		 if (pos < ls) {
		      // search for the end of the word
		      while ( pos < ls && !Character.isWhitespace(s.charAt(pos)) ) pos++;
	         end = pos++;

	         WordEntry e = new WordEntry(start, end-start, words++);
	         wordList.addElement(e);
		 }
	  }

	  return wordList;
   }   
	/**
	* Centers the string within a string of the specified length, padding
   * it with blanks.
	*
	* @param      s         the original string
	* @param      len       the length of the new string
	*
   * @return		a string with the original string centered in it.
	*/
   public static String center(String s, int len)
   {
	  return center(s, len, ' ');
   }   
	/**
	* Centers the string within a string of the specified length, padding
   * it with the specified character.
	*
	* @param      s         the original string
	* @param      len       the length of the new string
	* @param      pad       the pad character
	*
   * @return		a string with the original string centered in it.
	*/
   public static String center(String s, int len, char pad)
   {
	  int start;
	  int ls = s.length();
	  if (len < 1) {
		 return "";
	  }

	  char[] buf = new char[len];
	  for (int i = 0; i < len; i++)
	  {
		 buf[i] = pad;
	  }

	  if (len > ls) {
		 start = (len-ls)/2;
		 s.getChars(0, ls, buf, start);
	  }
	  else {
		 start = (ls-len)/2;
		 s.getChars(start, start+len, buf, 0);
	  }

	  return new String(buf);
   }   
	/**
	* Changes occurrences of a specified character to a replacement character.
	*
	* @param      s          the input string
	* @param      oldc       the pattern to be replaced
	* @param      newc       the replacement string
	*
   * @return		a string with the specified characters changed.
	*
	* @see java.lang.string#replace(char, char)
	*/
   public static String change(String s, char oldc, char newc)
   {
	  return s.replace(oldc, newc);
   }   
	/**
	* Changes occurrences of a specified character to a replacement character.
   * A starting position can be specified.
	*
	* @param      s          the input string
	* @param      oldc       the pattern to be replaced
	* @param      newc       the replacement string
	* @param      start      the starting position for the search
	*
   * @return		a string with the specified characters changed.
	*/
   public static String change(String s, char oldc, char newc, int start)
   {
	  return change(s, oldc, newc, start, Integer.MAX_VALUE, false);
   }   
	/**
	* Changes occurrences of a specified character to a replacement character.
   * The maximum number of changes and a starting position can be specified.
	*
	* @param      s          the input string
	* @param      oldc       the pattern to be replaced
	* @param      newc       the replacement string
	* @param      start      the starting position for the search
	* @param      maxChanges the maximum number of changes
	*
   * @return		a string with the specified characters changed.
	*/
   public static String change(String s, char oldc, char newc, int start,
   									 int maxChanges)
   {
	  return change(s, oldc, newc, start, maxChanges, false);
   }   
	/**
	* Changes occurrences of a specified character to a replacement character.
   * The maximum number of changes and a starting position can be specified.
   * You can specify that case should be ignored.
	*
	* @param      s          the input string
	* @param      oldc       the pattern to be replaced
	* @param      newc       the replacement string
	* @param      start      the starting position for the search
	* @param      maxChanges the maximum number of changes
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		a string with the specified characters changed.
	*/
   public static String change(String s, char oldc, char newc, int start,
   									 int maxChanges, boolean ignoreCase)
   {
	  int ls = s.length();
	  int lastPos;
	  int lastDest;
	  int fpos;
	  int nchg = 0;

	  if (start >= ls) {
		 return s;
	  }

	  if (start < 0) {
		 start = 0;
	  }

	  lastPos = start;

	  char[] buf = new char[ls];

	  s.getChars(0, start, buf, 0);
	  lastDest = start;

	  while ( (fpos = indexOf(s, oldc, lastPos, ignoreCase)) >= 0 && nchg++ < maxChanges)
	  {
		 s.getChars(lastPos, fpos, buf, lastPos);
		 buf[fpos] = newc;
		 lastPos = fpos+1;
	  }

	  s.getChars(lastPos, ls, buf, lastPos);

	  return new String(buf, 0, ls);
   }   
	/**
	* Changes occurrences of a specified character to a replacement character.
   * The starting position can be specified.
   * You can specify that case should be ignored.
	*
	* @param      s          the input string
	* @param      oldc       the pattern to be replaced
	* @param      newc       the replacement string
	* @param      start      the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		a string with the specified characters changed.
	*/
   public static String change(String s, char oldc, char newc, int start,
   									 boolean ignoreCase)
   {
	  return change(s, oldc, newc, start, Integer.MAX_VALUE, ignoreCase);
   }   
	/**
	* Changes occurrences of a specified pattern to a replacement string.
	*
	* @param      s         the input string
	* @param      oldp      the pattern to be replaced
	* @param      newp      the replacement string
	*
   * @return		a string with the specified patterns changed.
	*/
   public static String change(String s, String oldp, String newp)
   {
	  return change(s, oldp, newp, 0, Integer.MAX_VALUE, false);
   }   
	/**
	* Changes occurrences of a specified pattern to a replacement string.
   * A starting position can be specified.
	*
	* @param      s         the input string
	* @param      oldp      the pattern to be replaced
	* @param      newp      the replacement string
	* @param      start     the starting position for the search
	*
   * @return		a string with the specified patterns changed.
	*/
   public static String change(String s, String oldp, String newp, int start)
   {
	  return change(s, oldp, newp, start, Integer.MAX_VALUE);
   }   
	/**
	* Changes occurrences of a specified pattern to a replacement string.
   * The maximum number of changes and a starting position can be specified.
	*
	* @param      s          the input string
	* @param      oldp       the pattern to be replaced
	* @param      newp       the replacement string
	* @param      start      the starting position for the search
	* @param      maxChanges the maximum number of changes
	*
   * @return		a string with the specified patterns changed.
	*/
   public static String change(String s, String oldp, String newp, int start,
   									 int maxChanges)
   {
	  return change(s, oldp, newp, start, maxChanges, false);
   }   
	/**
	* Changes occurrences of a specified pattern to a replacement string.
   * The maximum number of changes and a starting position can be specified.
   * You can specify that case should be ignored.
	*
	* @param      s          the input string
	* @param      oldp       the pattern to be replaced
	* @param      newp       the replacement string
	* @param      start      the starting position for the search
	* @param      maxChanges the maximum number of changes
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		a string with the specified patterns changed.
	*/
   public static String change(String s, String oldp, String newp, int start,
   									 int maxChanges, boolean ignoreCase)
   {
	  int lo = oldp.length();
	  int ln = newp.length();
	  int ls = s.length();
	  int newlen = ls;
	  int lastPos;
	  int lastDest;
	  int fpos;
	  int nchg = 0;

	  if (lo == 0 || start >= ls) {
		 return s;
	  }

	  if (start < 0) {
		 start = 0;
	  }

	  lastPos = start;

	  if (ln > lo) {
	      int n = occurrencesOf(s, oldp, start, ignoreCase);
		 newlen = ls+n*(ln-lo);
	  }

	  char[] buf = new char[newlen];

	  s.getChars(0, start, buf, 0);
	  lastDest = start;

	  while ( (fpos = indexOf(s, oldp, lastPos, ignoreCase)) >= 0 && nchg++ < maxChanges)
	  {
		 s.getChars(lastPos, fpos, buf, lastDest);
		 lastDest += fpos-lastPos;
		 newp.getChars(0, ln, buf, lastDest);
		 lastPos = fpos+lo;
		 lastDest += ln;
	  }

	  s.getChars(lastPos, ls, buf, lastDest);

	  return new String(buf, 0, lastDest-lastPos+ls);
   }   
	/**
	* Changes occurrences of a specified pattern to a replacement string.
   * The starting position can be specified.
   * You can specify that case should be ignored.
	*
	* @param      s          the input string
	* @param      oldp       the pattern to be replaced
	* @param      newp       the replacement string
	* @param      start      the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		a string with the specified patterns changed.
	*/
   public static String change(String s, String oldp, String newp, int start,
   									 boolean ignoreCase)
   {
	  return change(s, oldp, newp, start, Integer.MAX_VALUE, ignoreCase);
   }   
	/**
	* Changes occurrences of a specified pattern to a replacement string.
   * You can specify that case should be ignored.
	*
	* @param      s          the input string
	* @param      oldp       the pattern to be replaced
	* @param      newp       the replacement string
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		a string with the specified patterns changed.
	*/
   public static String change(String s, String oldp, String newp, boolean ignoreCase)
   {
	  return change(s, oldp, newp, 0, Integer.MAX_VALUE, ignoreCase);
   }   
	/**
	* Compares two strings.
	*
	* @param      s1        the first string
   * @param      s2         second string
	*
   * @return      0 if the two strings are equal, a value less than zero if
	*					<code>s1</code> is lexicographically less than <code>s2</code>,
	*					and a value greater than
	*					zero if <code>s1</code> is lexicographically greater than <code>s2</code>.
	*
	* @see java.lang.string#compareTo(String)
	*
	*/
	public static int compare(String s1, String s2)
	{
   	return s1.compareTo(s2);
	}
	/**
	* Returns true if the specified search string is contained in the original
   * string.
	*
	* @param      s         the original string
	* @param      search    the search string
	*
   * @return	  true if the search string is contained in the input string
	*
	* @see java.lang.string#indexOf(String)
	*/
   public static boolean contains(String s, String search)
   {
	  return s.indexOf(search) >= 0;
   }   
	/**
	* Returns true if the specified search string is contained in the original
   * string.
   * You can specify that case should be ignored.
	*
	* @param      s         the input string
	* @param      search    the search string
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  true if the search string is contained in the input string
	*
	* @see java.lang.string#indexOf(String)
	*/
   public static boolean contains(String s, String search, boolean ignoreCase)
   {
	  return indexOf(s, search, ignoreCase) >= 0;
   }   
	/**
	* Returns a string consisting of the specified number of copies of the
   * input string.
	*
	* @param      s          the input string
	* @param      nCopies    the number of copies
	*
   * @return		a string consisting of the specified number of copies of the
	*					input string.
	*
	* @see java.lang.stringBuffer#append(String)
	*/
   public static String copies(String s, int nCopies)
   {
	  int ls = s.length();

	  if (nCopies < 1) {
		 return "";
	  }

	  StringBuffer buf = new StringBuffer(ls*nCopies);

	  for (int n = 0; n < nCopies; n++)
	  {
		 buf.append(s);
	  }

	  return buf.toString();
   }   
	/**
	* Returns true if the string ends with the specified suffix.
	*
	* @param      s         the input string
	* @param      suffix    the suffix
	*
   * @return		true if the string ends with the specified suffix.
	*
	* @see java.lang.string#endsWith(String)
	*
	*/
	public static boolean endsWith(String s, String suffix)
	{
   	return s.endsWith(suffix);
	}
	/**
	* Returns true if the string ends with the specified suffix.
	*
	* @param      s         the input string
	* @param      suffix    the suffix
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		true if the string ends with the specified suffix.
	*
	* @see java.lang.string#endsWith(String)
	* @see java.lang.string#regionMatches(boolean, int, String, int, int)
	*
	*/
   public static boolean endsWith(String s, String suffix, boolean ignoreCase)
	{
	  int pos = s.length()-suffix.length();
	  return s.regionMatches(ignoreCase, pos, suffix, 0, suffix.length());
	}
   /**
   * Checks if two characters are equal.
   * You can specify that case should be ignored.
   *
   *
   * @param      c1         first character
   * @param      c2         second character
	* @param      ignoreCase if true case is ignored when comparing characters
   *
   * @return		true if the characters are equal, false otherwise
	*
   * @see          java.lang.string#equalsIgnoreCase(String)
   */
   public static boolean equals(char c1, char c2, boolean ignoreCase)
   {
	  if (ignoreCase) {
	      return Character.toUpperCase(c1) == Character.toUpperCase(c2) ||
   	          Character.toLowerCase(c1) == Character.toLowerCase(c2);
	  }
	  else {
		 return c1 == c2;
	  }
   }   
   /**
   * Checks if two strings are equal.
   * You can specify that case should be ignored.
   *
   *
   * @param      s1         first string
   * @param      s2         second string
	* @param      ignoreCase if true case is ignored when comparing characters
   *
   * @return		true if the strings are equal, false otherwise
	*
   * @see          java.lang.string#equalsIgnoreCase(String)
   */
   public static boolean equals(String s1, String s2, boolean ignoreCase)
   {
	  if (ignoreCase) {
	      return s1.equalsIgnoreCase(s2);
	  }
	  else {
		 return s1.equals(s2);
	  }
   }   
	/**
	* Returns the index of the first ocurrence of the specified character.
	*
	* @param      s         the string to be inspected
	* @param      c         the character to be searched for
	*
   * @return		the index of the first ocurrence of the specified character.
	*					If the specified character is not found -1 is returned.
	*
	* @see java.lang.string#indexOf(char)
	*
	*/
   public static int indexOf(String s, char c)
   {
	  return s.indexOf(c);
   }   
	/**
	* Returns the index of the first ocurrence of the specified character.
	*
	* @param      s         the string to be inspected
	* @param      c         the character to be searched for
	* @param      start     the starting position for the search
	*
   * @return		the index of the first ocurrence of the specified character.
	*					If the specified character is not found -1 is returned.
	*
	* @see java.lang.string#indexOf(char, int)
	*
	*/
   public static int indexOf(String s, char c, int start)
   {
	  return s.indexOf(c, start);
   }   
	/**
	* Returns the index of the first ocurrence of the specified character, starting
   * at the specified position.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the character to be searched for
	* @param      start     the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the first ocurrence of the specified character.
	*					If the specified character is not found -1 is returned.
	*
	* @see java.lang.string#indexOf(char, int)
	*/
   public static int indexOf(String s, char c, int start, boolean ignoreCase)
   {
	  if (ignoreCase) {
	      int ls = s.length();

	      if (start < 0) {
	         start = 0;
	      }

	      if (start >= ls) {
	         return -1;
	      }

	      for (int n = start; n < ls; n++)
	      {
	         if ( equals(s.charAt(n), c, ignoreCase) ) {
	            return n;
	         }
	      }

	      return -1;
	  }
	  else {
		 return s.indexOf(c, start);
	  }
   }   
	/**
	* Returns the index of the first ocurrence of the specified character.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the character to be searched for
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the first ocurrence of the specified character.
	*					If the specified character is not found -1 is returned.
	*
	*/
   public static int indexOf(String s, char c, boolean ignoreCase)
   {
	  return indexOf(s, c, 0, ignoreCase);
   }   
	/**
	* Returns the index of the first ocurrence of the specified string.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to be searched for
	*
   * @return		the index of the first ocurrence of the specified string.
	*					If the specified string is not found -1 is returned.
	*
	* @see java.lang.string#indexOf(String)
	*
	*/
   public static int indexOf(String s, String c)
   {
	  return s.indexOf(c);
   }   
	/**
	* Returns the index of the first ocurrence of the specified string.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to be searched for
	* @param      start     the starting position for the search
	*
   * @return		the index of the first ocurrence of the specified string.
	*					If the specified string is not found -1 is returned.
	*
	* @see java.lang.string#indexOf(String, int)
	*
	*/
	public static int indexOf(String s, String c, int start)
	{
   	return s.indexOf(c, start);
	}
	/**
	* Returns the index of the first ocurrence of the specified string.
   * You can specify that case should be ignored.
	*
	* @param      s          the string to be inspected
	* @param      c          the string to be searched for
	* @param      start      the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the first ocurrence of the specified string.
	*					If the specified string is not found -1 is returned.
	*
	* @see java.lang.string#indexOf(String, int)
	*
	*/
   public static int indexOf(String s, String c, int start, boolean ignoreCase)
   {
	  if (ignoreCase) {
		 int ls = s.length();
		 int lc = c.length();
		 int lc1 = lc-1;
		 int le  = ls-lc;

	      if (lc == 0 || start > le) {
	         return -1;
	      }

		 int ns = start < 0 ? 0 : start;
		 char c0 = c.charAt(0);

		 while( ns < le )
		 {
			if ( equals(s.charAt(ns), c0, ignoreCase) ) {
			   if ( s.regionMatches(ignoreCase, ns+1, c, 1, lc1) ) {
				  return ns;
			   }
			}
			ns++;
		 }

		 return -1;
	  }
	  else {
	      return s.indexOf(c, start);
	  }
   }   
	/**
	* Returns the index of the first ocurrence of the specified string, starting
   * at the beginning of the string.
   * You can specify that case should be ignored.
	*
	* @param      s          the string to be inspected
	* @param      c          the string to be searched for
	* @param      ignoreCase if true case is ignored when comparing characters
   *
   * @return		the index of the first ocurrence of the specified string.
	*					If the specified string is not found -1 is returned.
	*
	*/
   public static int indexOf(String s, String c, boolean ignoreCase)
   {
	  return indexOf(s, c, 0, ignoreCase);
   }   
	/**
	* Returns the index of the first character that is not contained in the
   * specified set of characters.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	*
   * @return		the index of the first character that is not contained in the
	*					specified set of characters.
   * 					If no such character is found -1 is returned.
	*
	*/
   public static int indexOfAnyBut(String s, String c)
   {
	  return indexOfAnyBut(s, c, 0, false);
   }   
	/**
	* Returns the index of the first character that is not contained in the
   * specified set of characters.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      start     the starting position for the search
	*
   * @return		the index of the first character that is not contained in the
	*					specified set of characters.
   * 					If no such character is found -1 is returned.
	*
	*/
   public static int indexOfAnyBut(String s, String c, int start)
   {
	  return indexOfAnyBut(s, c, start, false);
   }   
	/**
	* Returns the index of the first character that is not contained in the
   * specified set of characters.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      start     the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the first character that is not contained in the
	*					specified set of characters.
   * 					If no such character is found -1 is returned.
	*
	*/
   public static int indexOfAnyBut(String s, String c, int start, boolean ignoreCase)
   {
	  int ls = s.length();
	  int pos = -1;

	  for (int n = start; n < ls; n++)
	  {
		 char ch = s.charAt(n);
		 if (indexOf(c, ch, ignoreCase) < 0) {
			pos = n;
			break;
		 }
	  }

	  return pos;
   }   
	/**
	* Returns the index of the first character that is not contained in the
   * specified set of characters.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the first character that is not contained in the
	*					specified set of characters.
   * 					If no such character is found -1 is returned.
	*
	*/
   public static int indexOfAnyBut(String s, String c, boolean ignoreCase)
   {
	  return indexOfAnyBut(s, c, 0, ignoreCase);
   }   
	/**
	* Returns the index of the first character that is contained in the
   * specified set of characters.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	*
   * @return		the index of the first character that is contained in the
	*					specified set of characters.
   * 					If no character from the string is in the specified set of
	*					characters -1 is returned.
	*
	*/
   public static int indexOfAnyOf(String s, String c)
   {
	  return indexOfAnyOf(s, c, 0);
   }   
	/**
	* Returns the index of the first character that is contained in the
   * specified set of characters.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      start     the starting position for the search
	*
   * @return		the index of the first character that is contained in the
	*					specified set of characters.
   * 					If no character from the string is in the specified set of
	*					characters -1 is returned.
	*
	*
	*/
   public static int indexOfAnyOf(String s, String c, int start)
   {
	  int lc = c.length();
	  int ls = s.length();
	  int pos = ls;

	  for (int n = 0; n < lc; n++)
	  {
		 char ch = c.charAt(n);
		 int  i  = s.indexOf(ch, start);
		 if (i >= 0 && i < pos) {
			pos = i;
		 }
	  }
	  return (pos < ls ? pos : -1);
   }   
	/**
	* Returns the index of the first character that is contained in the
   * specified set of characters.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      start     the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the first character that is contained in the
	*					specified set of characters.
   * 					If no character from the string is in the specified set of
	*					characters -1 is returned.
	*
	*/
   public static int indexOfAnyOf(String s, String c, int start, boolean ignoreCase)
   {
	  int lc = c.length();
	  int ls = s.length();
	  int pos = ls;

	  for (int n = 0; n < lc; n++)
	  {
		 char ch = c.charAt(n);
		 int  i  = indexOf(s, ch, start, ignoreCase);
		 if (i >= 0 && i < pos) {
			pos = i;
		 }
	  }
	  return (pos < ls ? pos : -1);
   }   
	/**
	* Returns the index of the first character that is contained in the
   * specified set of characters.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the first character that is contained in the
	*					specified set of characters.
   * 					If no character from the string is in the specified set of
	*					characters -1 is returned.
	*
	*/
   public static int indexOfAnyOf(String s, String c, boolean ignoreCase)
   {
	  return indexOfAnyOf(s, c, 0, ignoreCase);
   }   
	/**
	* Returns the index of the first occurrence of the specified phrase within
   * the string.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
	*
	* @param      s          the input string
	* @param      p          the phrase to be searched for
	* @param      startWord  the word number where the search is to start. The
   *                        first word has number 0.
	*
   * @return	  the index of the first occurrence of the specified phrase within
   * 				  the string.
   * 				  Returns -1 if the phrase is not found.
	*/
   public static int indexOfPhrase(String s, String p, int startWord)
   {
	  return indexOfPhrase(s, p, startWord, false);
   }   
	/**
	* Returns the index of the first occurrence of the specified phrase within
   * the string.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
   * You can specify that case should be ignored.
	*
	* @param      s          the input string
	* @param      p          the phrase to be searched for
	* @param      startWord  the word number where the search is to start. The
   *                        first word has number 0.
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  the index of the first occurrence of the specified phrase within
   * 				  the string.
   * 				  Returns -1 if the phrase is not found.
	*/
   public static int indexOfPhrase(String s, String p, int startWord, boolean ignoreCase)
   {
	  WordEntry e = wordEntryOfPhrase(s, p, startWord, ignoreCase);

	  if (e == null) {
		 return -1;
	  }

	  return e.start;
   }   
	/**
	* Returns the index of the first character of the specified nth word within
   * the string. Word numbers start at 0.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
	*
	* @param      s          the input string
	* @param      wordNum    the number of the word
	*
   * @return	  the index of the first character of the specified nth word within
   * 				  the string.
   * 				  Returns -1 if the word is not found.
	*/
   public static int indexOfWord(String s, int wordNum)
   {
	  int ls = s.length();

	  if (wordNum < 0) {
		 return -1;
	  }

	  wordNum++;
	  int pos = 0;

	  while (pos < ls)
	  {
	      // search for the beginning of a word
	      while ( pos < ls && Character.isWhitespace(s.charAt(pos)) ) pos++;

		 if (pos < ls) {
	         if (--wordNum == 0) break;
		      pos++;

		      // search for the end of the word
		      while ( pos < ls && !Character.isWhitespace(s.charAt(pos)) ) pos++;
	         pos++;
		 }
	  }

	  if (wordNum > 0) {
		 pos = -1;
	  }

	  return pos;
   }   
	/**
	* Inserts a string after the specified position.
	* If the position is beyond the length of the original string, the result
	* string is padded with blanks.
	*
	* @param      s          the input string
	* @param      ins        the string to be inserted
	* @param      start      the starting position for the insert
	*
   * @return		a string with the input string inserted after the specified
	*					position.
	*/
   public static String insert(String s, String ins, int start)
   {
	  return insert(s, ins, start, ' ');
   }   
	/**
	* Inserts a string after the specified position.
	* If the position is beyond the length of the original string, the result
	* string is padded with the specified pad character.
	*
	* @param      s          the input string
	* @param      ins        the string to be inserted
	* @param      start      the starting position for the insert
	* @param      pad        the pad character
	*
   * @return		a string with the input string inserted after the specified
	*					position.
	*/
   public static String insert(String s, String ins, int start, char pad)
   {
	  int ls = s.length();
	  int li = ins.length();
	  int newlen;

	  if (start < 0) {
		 return "";
	  }

	  if (start > ls) {
		 newlen = li+start;
	  }
	  else {
		 newlen = ls+li;
	  }

	  int sPos = start > ls ? ls : start;
	  int sRest = sPos;

	  char[] buf = new char[newlen];

	  s.getChars(0, sPos, buf, 0);

	  while(sPos < start)
	  {
		 buf[sPos++] = pad;
	  }

	  ins.getChars(0, li, buf, sPos);
	  s.getChars(sRest, ls, buf, sPos+li);

	  return new String(buf);
   }   
	/**
	* Returns true if the string is a valid abbreviation of another string.
	* A string <code>s</code> is considered an abbreviation of another string
	* <code>full</code> if
   * the string <code>s</code> is a prefix of string <code>full</code> and its length is at least
   * <code>minLength</code>.
	*
	* @param      s          the string to test
	* @param      full       the full string
	* @param      minLength  the minimum length
	*
   * @return	  true if the string <code>s</code> is an abbreviation of string <code>full</code>.
	*/
   public static boolean isAbbreviationOf(String s, String full, int minLength)
   {
	  return isAbbreviationOf(s, full, minLength, false);
   }   
	/**
	* Returns true if the string is a valid abbreviation of another string.
	* A string <code>s</code> is considered an abbreviation of another string
	* <code>full</code> if
   * the string <code>s</code> is a prefix of string <code>full</code> and its length is at least
   * <code>minLength</code>.
   * You can specify that case should be ignored.
	*
	* @param      s          the string to test
	* @param      full       the full string
	* @param      minLength  the minimum length
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  true if the string <code>s</code> is an abbreviation of string <code>full</code>.
	*/
   public static boolean isAbbreviationOf(String s, String full, int minLength,
   													boolean ignoreCase)
   {
	  int ls = s.length();

	  if (minLength > ls || minLength < 0) {
		 return false;
	  }

	  if (minLength == 0) {
		 minLength = ls;
	  }

	  return s.regionMatches(ignoreCase, 0, full, 0, minLength);
   }   
	/**
	* Returns true if the string is a valid abbreviation of another string.
	* A string <code>s</code> is considered an abbreviation of another string
	* <code>full</code> if
   * the string <code>s</code> is a prefix of string <code>full</code>.
   * You can specify that case should be ignored.
	*
	* @param      s          the string to test
	* @param      full       the full string
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  true if the string <code>s</code> is an abbreviation of string <code>full</code>.
	*
	* @see java.lang.string#regionMatches(boolean, int, String, int, int)
	*/
   public static boolean isAbbreviationOf(String s, String full, boolean ignoreCase)
   {
	  return s.regionMatches(ignoreCase, 0, full, 0, s.length());
   }   
	/**
	* Returns true if the string consists of digits.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of digits.
	*
	* @see java.lang.Character#isDigit(char).
	*/
   public static boolean isDigit(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isDigit( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string consists of ignorable characters in a Java
   * identifier or a Unicode identifier.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of ignorable characters in a Java
   * 					identifier or a Unicode identifier.
	*
	* @see java.lang.Character#isIdentifierIgnorable(char).
	*/
   public static boolean isIdentifierIgnorable(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isIdentifierIgnorable( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string consists of ISO control characters.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of ISO control characters.
	*
	* @see java.lang.Character#isISOControls(char).
	*/
   public static boolean isISOControl(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isISOControl( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string is a valid Java identifier.
	* @param      s          the input string
	*
   * @return	  true if the string is a valid Java identifier.
	*
	* @see java.lang.Character#isJavaIdentifierStart(char)
   * @see java.lang.Character#isJavaIdentifierPart(char).
	*/
   public static boolean isJavaIdentifier(String s)
   {
	  int ls = s.length();

	  if ( ls == 0 || !Character.isJavaIdentifierStart(s.charAt(0)) ) {
		 return false;
	  }

	  for (int i = 1; i < ls; i++)
	  {
		 if (!Character.isJavaIdentifierPart( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string consists of letters.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of letters.
	*
	* @see java.lang.Character#isLetter(char).
	*/
   public static boolean isLetter(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isLetter( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string consists of letters or digits.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of letters or digits.
	*
	* @see java.lang.Character#isLetterOrDigit(char).
	*/
   public static boolean isLetterOrDigit(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isLetterOrDigit( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string matches the specified pattern.
   * The pattern may contain two wildcard characters, where '*'
   * matches any sequence of characters and '?'
   * matches an arbitrary single character.
	*
	* @param      s          the string to test
	* @param      pattern    the pattern string
	*
   * @return	  true if the string matches the specified pattern.
	*/
   public static boolean isLike(String s, String pattern)
   {
	  return isLike(s, pattern, 0, '*', '?', false);
   }   
	/**
	* Returns true if the string matches the specified pattern.
   * The pattern may contain two wildcard characters, where '*'
   * matches any sequence of characters and '?'
   * matches an arbitrary single character.
	*
	* @param      s          the string to test
	* @param      pattern    the pattern string
	* @param      start      the starting position
	*
   * @return	  true if the string matches the specified pattern.
	*/
   public static boolean isLike(String s, String pattern, int start)
   {
	  return isLike(s, pattern, start, '*', '?', false);
   }   
	/**
	* Returns true if the string matches the specified pattern.
   * The pattern may contain two wildcard characters, where the first wildcard
   * character matches any sequence of characters and the second wildcard
   * character matches an arbitrary single character.
   * You can specify that case should be ignored.
	*
	* @param      s          the string to test
	* @param      pattern    the pattern string
	* @param      start      the starting position
	* @param      wAnySeq    the wildcard character which matches any sequence of characters
	* @param      wAnyChar   the wildcard character which matches any character
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  true if the string matches the specified pattern.
	*/
   public static boolean isLike(String s, String pattern, int start, char wAnySeq,
										  char wAnyChar, boolean ignoreCase)
   {
	  int ls = s.length();
	  int lp = pattern.length();

	  if (lp == 0) {
		 return false;
	  }

	  char p = ' ';
	  int ns = start;
	  int np = 0;
	  int startp = -1;
	  int starts = 0;

	  while (np <= lp && ns <= ls)
	  {
		 if (np < lp) {
	         p = pattern.charAt(np);

	         if (p == wAnySeq) {
	            startp = np++;
			   starts = ns;
	         }
	         else if (ns < ls) {
	            if (p == wAnyChar || equals(s.charAt(ns), pattern.charAt(np), ignoreCase)) {
			         np++;
				  ns++;
	            }
	            else if (startp < 0) {
	               // there was no wAnySeq in the pattern
	               return false;
	            }
			   else {
				  // we have to return to the last wAnySeq
				  np = startp;
				  ns = ++starts;
			   }
			}
			else {
			   // At end of s and no match found
			   return false;
			}
		 }
		 else {
	         if (p == wAnySeq) {
			   return true;
			}
			if (ns < ls && startp >= 0) {
			   // we have to return to the last wAnySeq
			   np = startp+1;
			   ns = ++starts;
			}
			else {
			   return (ns >= ls);
			}
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string matches the specified pattern.
   * The pattern may contain two wildcard characters, where '*'
   * matches any sequence of characters and '?'
   * matches an arbitrary single character.
   * You can specify that case should be ignored.
	*
	* @param      s          the string to test
	* @param      pattern    the pattern string
	* @param      start      the starting position
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  true if the string matches the specified pattern.
	*/
   public static boolean isLike(String s, String pattern, int start, boolean ignoreCase)
   {
	  return isLike(s, pattern, start, '*', '?', ignoreCase);
   }   
	/**
	* Returns true if the string consists of lowercase characters.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of lowercase characters.
	*
	* @see java.lang.Character#isLowercase(char).
	*/
   public static boolean isLowerCase(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isLowerCase( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string consists of Unicode space characters.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of Unicode space characters.
	*
	* @see java.lang.Character#isSpaceChar(char).
	*/
   public static boolean isSpaceChar(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isSpaceChar( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string consists of title case characters.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of Unicode title case characters.
	*
	* @see java.lang.Character#isTitleCase(char).
	*/
   public static boolean isTitleCase(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isTitleCase( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string is a valid Unicode identifier.
	* @param      s          the input string
	*
   * @return	  true if the string is a valid Unicode identifier.
	*
	* @see java.lang.Character#isJavaIdentifierStart(char)
   * @see java.lang.Character#isJavaIdentifierPart(char)
	*/
   public static boolean isUnicodeIdentifier(String s)
   {
	  int ls = s.length();

	  if ( ls == 0 || !Character.isUnicodeIdentifierStart(s.charAt(0)) ) {
		 return false;
	  }

	  for (int i = 1; i < ls; i++)
	  {
		 if (!Character.isUnicodeIdentifierPart( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string consists of uppercase characters.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of uppercase characters.
	*
	* @see java.lang.Character#isUpperCase(char).
	*/
   public static boolean isUpperCase(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isUpperCase( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns true if the string consists of whitespace characters.
	* @param      s          the input string
	*
   * @return	  true if the string consists only of whitespace characters.
	*
	* @see java.lang.Character#isWhitespace(char).
	*/
   public static boolean isWhitespace(String s)
   {
	  int ls = s.length();

	  for (int i = 0; i < ls; i++)
	  {
		 if (!Character.isWhitespace( s.charAt(i) )) {
			return false;
		 }
	  }

	  return true;
   }   
	/**
	* Returns the index of the last ocurrence of the specified character.
   * The search is performed backwards from the end of the string.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to be searched for
	*
   * @return		the index of the last ocurrence of the specified character.
   * 					If the specified character is not found -1 is returned.
	*
	* @see java.lang.string#lastIndexOf(char)
	*
	*/
   public static int lastIndexOf(String s, char c)
   {
	  return s.lastIndexOf(c);
   }   
	/**
	* Returns the index of the last ocurrence of the specified character.
   * The search is performed backwards from the specified starting position.
	*
	* @param      s         the string to be inspected
	* @param      c         the character to be searched for
	* @param      start     the starting position for the search
	*
   * @return		the index of the last ocurrence of the specified character.
   * 					If the specified character is not found -1 is returned.
	*
	* @see java.lang.string#lastIndexOf(char, int)
	*
	*/
   public static int lastIndexOf(String s, char c, int start)
   {
	  return s.lastIndexOf(c, start);
   }   
	/**
	* Returns the index of the last ocurrence of the specified character.
   * The search is performed backwards from the specified starting position.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the character to be searched for
	* @param      start     the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the last ocurrence of the specified character.
   * 					If the specified character is not found -1 is returned.
	*
	* @see java.lang.string#lastIndexOf(char, int)
	*
	*/
   public static int lastIndexOf(String s, char c, int start, boolean ignoreCase)
   {
	  if (ignoreCase) {
		 int ls = s.length();

	      if (start < 0) {
	         return -1;
	      }

		 if (start >= ls) {
			start = ls-1;
		 }

		 for (int n = start; n >= 0; n--)
		 {
			if ( equals(s.charAt(n), c, ignoreCase) ) {
			   return n;
			}
		 }

		 return -1;
	  }
	  else {
	      return s.lastIndexOf(c, start);
	  }
   }   
	/**
	* Returns the index of the last ocurrence of the specified string.
   * The search is performed backwards from the end of the string.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to be searched for
	*
   * @return		the index of the last ocurrence of the specified string.
   * 					If the specified string is not found -1 is returned.
	*
	* @see java.lang.string#lastIndexOf(String)
	*
	*/
   public static int lastIndexOf(String s, String c)
   {
	  return s.lastIndexOf(c);
   }   
	/**
	* Returns the index of the last ocurrence of the specified string.
   * The search is performed backwards from the specified starting position.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to be searched for
	* @param      start     the starting position for the search
	*
   * @return		the index of the last ocurrence of the specified string.
   * 					If the specified string is not found -1 is returned.
	*
	* @see java.lang.string#lastIndexOf(String, int)
	*
	*/
   public static int lastIndexOf(String s, String c, int start)
   {
	  return s.lastIndexOf(c, start);
   }   
	/**
	* Returns the index of the last ocurrence of the specified string.
   * The search is performed backwards from the specified starting position.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to be searched for
	* @param      start     the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the last ocurrence of the specified string.
   * 					If the specified string is not found -1 is returned.
	*
	* @see java.lang.string#lastIndexOf(String, int)
	*
	*/
   public static int lastIndexOf(String s, String c, int start, boolean ignoreCase)
   {
	  if (ignoreCase) {
		 int ls = s.length();
		 int lc = c.length();
		 int lc1 = lc-1;
		 int le  = ls-lc;

	      if (lc == 0 || start < 0) {
	         return -1;
	      }

		 int ns  = start >= le ? le : start;
		 char c0 = c.charAt(0);

		 while( ns >= 0 )
		 {
			if ( equals(s.charAt(ns), c0, ignoreCase) ) {
			   if ( s.regionMatches(ignoreCase, ns+1, c, 1, lc1) ) {
				  return ns;
			   }
			}
			ns--;
		 }

		 return -1;
	  }
	  else {
	      return s.lastIndexOf(c, start);
	  }
   }   
	/**
	* Returns the index of the last ocurrence of the specified string.
   * The search is performed backwards from the end of the string.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to be searched for
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the last ocurrence of the specified string.
   * 					If the specified string is not found -1 is returned.
	*
	*/
   public static int lastIndexOf(String s, String c, boolean ignoreCase)
   {
	  return lastIndexOf(s, c, Integer.MAX_VALUE, ignoreCase);
   }   
	/**
	* Returns the index of the last character that is not contained in the
   * specified set of characters.
   * The search is performed backwards from the end of the string.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	*
   * @return		the index of the last character that is not contained in the
   * 					specified set of characters.
   * 					If no such character is found -1 is returned.
	*
	*/
   public static int lastIndexOfAnyBut(String s, String c)
   {
	  return lastIndexOfAnyBut(s, c, Integer.MAX_VALUE, false);
   }   
	/**
	* Returns the index of the last character that is not contained in the
   * specified set of characters.
   * The search is performed backwards from the specified starting position.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      start     the starting position for the search
	*
   * @return		the index of the last character that is not contained in the
   * 					specified set of characters.
   * 					If no such character is found -1 is returned.
	*
	*/
   public static int lastIndexOfAnyBut(String s, String c, int start)
   {
	  return lastIndexOfAnyBut(s, c, start, false);
   }   
	/**
	* Returns the index of the last character that is not contained in the
   * specified set of characters.
   * The search is performed backwards from the specified starting position.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      start     the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the last character that is not contained in the
   * 					specified set of characters.
   * 					If no such character is found -1 is returned.
	*
	*/
   public static int lastIndexOfAnyBut(String s, String c, int start, boolean ignoreCase)
   {
	  int ls = s.length()-1;
	  int pos = -1;
	  start = start < ls ? start : ls;

	  for (int n = start; n >= 0; n--)
	  {
		 char ch = s.charAt(n);
		 if (indexOf(c, ch, ignoreCase) < 0) {
			pos = n;
			break;
		 }
	  }

	  return pos;
   }   
	/**
	* Returns the index of the last character that is contained in the
   * specified set of characters.
   * The search is performed backwards from the end of the string.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	*
   * @return		the index of the last character that is contained in the
   * 					specified set of characters.
   * 					If no character from the string is in the specified set of
	*					characters -1 is returned.
	*
	*/
   public static int lastIndexOfAnyOf(String s, String c)
   {
	  return lastIndexOfAnyOf(s, c, Integer.MAX_VALUE, false);
   }   
	/**
	* Returns the index of the last character that is contained in the
   * specified set of characters.
   * The search is performed backwards from the specified starting position.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      start     the starting position for the search
	*
   * @return		the index of the last character that is contained in the
   * 					specified set of characters.
   * 					If no character from the string is in the specified set of
	*					characters -1 is returned.
	*
	*/
   public static int lastIndexOfAnyOf(String s, String c, int start)
   {
	  return lastIndexOfAnyOf(s, c, start, false);
   }   
	/**
	* Returns the index of the last character that is contained in the
   * specified set of characters.
   * The search is performed backwards from the specified starting position.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the set of characters
	* @param      start     the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the index of the last character that is contained in the
   * 					specified set of characters.
   * 					If no character from the string is in the specified set of
	*					characters -1 is returned.
	*
	*/
   public static int lastIndexOfAnyOf(String s, String c, int start, boolean ignoreCase)
   {
	  int lc = c.length();
	  int ls = s.length();
	  int pos = -1;

	  for (int n = 0; n < lc; n++)
	  {
		 char ch = c.charAt(n);
		 int  i  = lastIndexOf(s, ch, start, ignoreCase);
		 if (i >= 0 && i > pos) {
			pos = i;
		 }
	  }
	  return pos;
   }   
	/**
	* Left-justifies the string in a string of the specified length.
   * If the specified length is greater than the length of the string, the
   * string is padded with blanks.
	*
	* @param      s          the input string
	* @param      len        the length of the new string
	*
   * @return		a string with the input string left-justified in it.
	*/
   public static String leftJustify(String s, int len)
   {
	  return leftJustify(s, len, ' ');
   }   
	/**
	* Left-justifies the string in a string of the specified length.
   * If the specified length is greater than the length of the string, the
   * string is padded with the specified pad character.
	*
	* @param      s          the input string
	* @param      len        the length of the new string
	* @param      pad        the pad character
	*
   * @return		a string with the input string left-justified in it.
	*/
   public static String leftJustify(String s, int len, char pad)
   {
	  int ls = s.length();
	  int ln = len < ls ? len : ls;

	  if (len < 1) {
		 return "";
	  }

	  char[] buf = new char[len];

	  s.getChars(0, ln, buf, 0);

	  while (ln < len)
	  {
		 buf[ln++] = pad;
	  }
	  return new String(buf);
   }   
	/**
	* Returns the number of words in the string.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
	*
	* @param      s          the input string
	* @param      p          the phrase to be searched for
	* @param      startWord  the word number where the search is to start. The
   *                        first word has number 0.
	*
   * @return	  the number of words in the string.
	*/
   public static int numWords(String s)
   {
	  int ls = s.length();
	  int wordNum = 0;

	  int pos = 0;

	  while (pos < ls)
	  {
	      // search for the beginning of a word
	      while ( pos < ls && Character.isWhitespace(s.charAt(pos)) ) pos++;

	      if (pos++ < ls) wordNum++;

	      // search for the end of the word
	      while ( pos < ls && !Character.isWhitespace(s.charAt(pos)) ) pos++;
		 pos++;
	  }

	  return wordNum;
   }   
	/**
	* Returns the number of occurrences of the specified string.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to search for
	* @param      start     the starting position for the search
	*
   * @return		the number  of occurrences of the specified string.
   * 					If the string is not found -1 is returned.
	*
	*/
   public static int occurrencesOf(String s, String c)
   {
	  return occurrencesOf(s, c, 0, false);
   }   
	/**
	* Returns the number of occurrences of the specified string.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to search for
	* @param      start     the starting position for the search
	*
   * @return		the number  of occurrences of the specified string.
   * 					If the string is not found -1 is returned.
	*
	*/
   public static int occurrencesOf(String s, String c, int start)
   {
	  return occurrencesOf(s, c, start, false);
   }   
	/**
	* Returns the number of occurrences of the specified string.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to search for
	* @param      start     the starting position for the search
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the number  of occurrences of the specified string.
   * 					If the string is not found -1 is returned.
	*
	*/
   public static int occurrencesOf(String s, String c, int start, boolean ignoreCase)
   {
	  int lc = c.length();
	  int i;
	  int n = 0;

	  if (start > s.length()-lc) {
		 return 0;
	  }

	  if (lc > 0) {
	      while ( (i = indexOf(s, c, start, ignoreCase)) >= 0 )
	      {
	         n++;
	         start = i+lc;
	      }
	  }
	  return n;
   }   
	/**
	* Returns the number of occurrences of the specified string.
   * You can specify that case should be ignored.
	*
	* @param      s         the string to be inspected
	* @param      c         the string to search for
	* @param      ignoreCase if true ignore case when comparing characters
	*
   * @return		the number  of occurrences of the specified string.
   * 					If the string is not found -1 is returned.
	*
	*/
   public static int occurrencesOf(String s, String c, boolean ignoreCase)
   {
	  return occurrencesOf(s, c, 0, ignoreCase);
   }   
	/**
	* Replaces part of the string with the specified string, starting at a
   * specified position. If the starting position is beyond the end of the
   * string, it is padded with blanks.
	*
	* @param      s         the original string
	* @param      o         the string to be overlayed over the original string
	* @param      start     the starting position for the overlay
	*
   * @return	  a string with part of it replaced by the overlay string.
	*/
   public static String overlayWith(String s, String o, int start)
   {
	  return overlayWith(s, o, start, ' ');
   }   
	/**
	* Replaces part of the string with the specified string, starting at a
   * specified position. If the starting position is beyond the end of the
   * string, it is padded with the specified pad character.
	*
	* @param      s         the original string
	* @param      o         the string to be overlayed over the original string
	* @param      start     the starting position for the overlay
	* @param      pad       the padding character
	*
   * @return	  a string with part of it replaced by the overlay string.
	*/
   public static String overlayWith(String s, String o, int start, char pad)
   {
	  int ls = s.length();
	  int lo = o.length();

	  if (start < 0) {
		 return "";
	  }

	  int ln = start+lo;
	  int pos = start >= ls ? ls : start;
	  int newlen = ln < ls ? ls : ln;

	  char[] buf = new char[newlen];

	  s.getChars(0, pos, buf, 0);

	  for (int i = ls; i < start; i++)
	  {
		 buf[i] = pad;
	  }

	  o.getChars(0, lo, buf, start);

	  if (ln < ls) {
		 s.getChars(ln, ls, buf, ln);
	  }

	  return new String(buf);
   }   
	/**
	* Removes the specified number of characters from the string, starting
   * at the specified position.
	*
	* @param      s         the original string
	* @param      start     the starting position
	* @param      numChars  the number of characters to be removed
	*
   * @return	  a string with the specified number of characters removed.
	*/
   public static String remove(String s, int start, int numChars)
   {
	  int ls = s.length();

	  if (start >= ls || start < 0 || numChars < 1) {
		 return s;
	  }

	  if (start > ls-numChars) {
		 numChars = ls-start;
	  }

	  int newlen = ls-numChars;

	  char[] buf = new char[newlen];

	  s.getChars(0, start, buf, 0);
	  s.getChars(start+numChars, ls, buf, start);

	  return new String(buf);
   }   
	/**
	* Removes the specified number of words from the string, starting with the
   * specified word number.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
	*
	* @param      s          the input string
	* @param      startWord  the number of the first word to be removed
	* @param      numWords   the number of words to be removed.
	*
   * @return	  a string with the specified number of words removed.
	*/
   public static String removeWords(String s, int startWord, int numWords)
   {
	  if (startWord < 0 || numWords <= 0) {
		 return s;
	  }

	  int startPos = indexOfWord(s, startWord);

	  if (startPos >= 0) {
		 int lastPos = indexOfWord(s.substring(startPos), numWords);

		 if (lastPos >= 0) {
			return remove(s, startPos, lastPos);
		 }
		 else {
			return s.substring(0, startPos);
		 }
	  }

	  return s;
   }   
	/**
	* Reverses the sequence of characters contained in the string.
	*
	* @param      s         the original string
	*
   * @return	  a string with the characters from the original string reversed.
	*
   * @see java.lang.stringBuffer#reverse()
	*/
   public static String reverse(String s)
   {
	  StringBuffer buf = new StringBuffer(s);
	  buf.reverse();
	  return buf.toString();
   }   
	/**
	* Right-justifies the string in a string of the specified length.
   * If the specified length is greater than the length of the string, the
   * string is padded with blanks.
	*
	* @param      s          the input string
	* @param      len        the length of the new string
	*
   * @return		a string with the input string right-justified in it.
	*/
   public static String rightJustify(String s, int len)
   {
	  return rightJustify(s, len, ' ');
   }   
	/**
	* Right-justifies the string in a string of the specified length.
   * If the specified length is greater than the length of the string, the
   * string is padded with the specified pad character.
	*
	* @param      s          the input string
	* @param      len        the length of the new string
	* @param      pad        the pad character
	*
   * @return		a string with the input string right-justified in it.
	*/
   public static String rightJustify(String s, int len, char pad)
   {
	  int ls = s.length();
	  int lp;

	  if (len < 1) {
		 return "";
	  }

	  char[] buf = new char[len];

	  if (len > ls) {
		 lp = len-ls;
	      s.getChars(0, ls, buf, lp);

	      while (lp > 0)
	      {
	         buf[--lp] = pad;
	      }
	  }
	  else {
		 lp = ls-len;
		 s.getChars(lp, ls, buf, 0);
	  }

	  return new String(buf);
   }   
	/**
	* Returns true if the string starts with the specified prefix.
	*
	* @param      s         the input string
	* @param      prefix    the prefix
	*
   * @return		true if the string starts with the specified prefix.
	*
	* @see java.lang.string#startsWith(String)
	*
	*/
   public static boolean startsWith(String s, String prefix)
	{
	  return s.startsWith(prefix);
	}
	/**
	* Returns true if the string starts with the specified prefix.
	*
	* @param      s         the input string
	* @param      prefix    the prefix
	* @param      start     the starting position for the test
	*
   * @return		true if the string starts with the specified prefix.
	*
	* @see java.lang.string#startsWith(String, int)
	*
	*/
	public static boolean startsWith(String s, String prefix, int start)
	{
   	return s.startsWith(prefix, start);
	}
	/**
	* Returns true if the string starts with the specified prefix.
	*
	* @param      s         the input string
	* @param      prefix    the prefix
	* @param      start     the starting position for the test
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		true if the string starts with the specified prefix.
	*
	* @see java.lang.string#startsWith(String, int)
	* @see java.lang.string#regionMatches(boolean, int, String, int, int)
	*
	*/
   public static boolean startsWith(String s, String prefix, int start, boolean ignoreCase)
	{
	  return s.regionMatches(ignoreCase, start, prefix, 0, prefix.length());
	}
	/**
	* Returns true if the string starts with the specified prefix.
	*
	* @param      s         the input string
	* @param      prefix    the prefix
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		true if the string starts with the specified prefix.
	*
	* @see java.lang.string#startsWith(String)
	* @see java.lang.string#regionMatches(boolean, int, String, int, int)
	*
	*/
   public static boolean startsWith(String s, String prefix, boolean ignoreCase)
	{
	  return s.regionMatches(ignoreCase, 0, prefix, 0, prefix.length());
   }   
	/**
	* Strips the specified character from both ends of the string.
	*
	* @param      s         the string of which the character should be
   *								stripped off
	* @param      c         the character to be stripped off
	*
   * @return		the original string with the specified character stripped
   * 					off both ends.
	*/
   public static String strip(String s, char c)
   {
	  return strip(s, c, false);
   }   
	/**
	* Strips the specified character from both ends of the string.
   * You can specify that case should be ignored.
	*
	* @param      s         the string of which the character should be
   *								stripped off
	* @param      c         the character to be stripped off
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the original string with the specified character stripped
   * 					off both ends.
	*/
   public static String strip(String s, char c, boolean ignoreCase)
   {
	  String s1 = stripLeading(s, c, ignoreCase);
	  return stripTrailing(s1, c, ignoreCase);
   }   
	/**
	* Strips the specified characters from both ends of the string.
	*
	* @param      s         the string of which characters should be
   *								stripped off
	* @param      c         the characters to be stripped off
	*
   * @return		the original string with the specified characters stripped
   * 					off both ends.
	*/
   public static String strip(String s, String c)
   {
	  return strip(s, c, false);
   }   
	/**
	* Strips the specified characters from both ends of the string.
   * You can specify that case should be ignored.
	*
	* @param      s         the string of which characters should be
   *								stripped off
	* @param      c         the characters to be stripped off
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the original string with the specified characters stripped
   * 					off both ends.
	*/
   public static String strip(String s, String c, boolean ignoreCase)
   {
	  String s1 = stripLeading(s, c, ignoreCase);
	  return stripTrailing(s1, c, ignoreCase);
   }   
	/**
	* Strips white space characters from both ends of the string.
	* All characters for which Character#isWhitespace() returns true are considered
	* white space characters.
	*
	* @param      s         the string of which white space is to be stripped off
	*
   * @return		the original string with white space stripped
   * 					off both ends.
	*
	* @see java.lang.Character#isWhitespace()
	*/
   public static String stripBlanks(String s)
   {
	  return s.trim();
   }   
	/**
	* Strips the specified leading character.
	*
	* @param      s         the string of which the leading character should be
   *								stripped off
	* @param      c         the character to be stripped off
	*
   * @return		the original string with the specified leading character stripped
   * 					off.
	*/
   public static String stripLeading(String s, char c)
   {
	  return stripLeading(s, c, false);
   }   
	/**
	* Strips the specified leading character.
   * You can specify that case should be ignored.
	*
	* @param      s         the string of which the leading character should be
   *								stripped off
	* @param      c         the character to be stripped off
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the original string with the specified leading character stripped
   * 					off.
	*/
   public static String stripLeading(String s, char c, boolean ignoreCase)
   {
	  int ls = s.length();
	  int pos = 0;

	  while ( pos < ls && equals(s.charAt(pos), c, ignoreCase) )
	  {
		 pos++;
	  }
	  return s.substring(pos);
   }   
	/**
	* Strips the specified leading characters.
	*
	* @param      s         the string of which the leading characters should be
   *								stripped off
	* @param      c         the characters to be stripped off
	*
   * @return		the original string with the specified leading characters stripped
   * 					off.
	*/
   public static String stripLeading(String s, String c)
   {
	  return stripLeading(s, c, false);
   }   
	/**
	* Strips the specified leading characters.
   * You can specify that case should be ignored.
	*
	* @param      s         the string of which the leading characters should be
   *								stripped off
	* @param      c         the characters to be stripped off
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the original string with the specified leading characters stripped
   * 					off.
	*
	*/
   public static String stripLeading(String s, String c, boolean ignoreCase)
   {
	  int ls = s.length();
	  int pos = 0;

	  while ( pos < ls && indexOf(c, s.charAt(pos), ignoreCase) >= 0 )
	  {
		 pos++;
	  }
	  return s.substring(pos);
   }   
	/**
	* Strips leading white space characters.
	* All characters for which Character#isWhitespace() returns true are considered
	* white space characters.
	*
	* @param      s         the string of which white space is to be stripped off
	*
   * @return		the original string with leading white space characters stripped
   * 					off.
	*
	* @see java.lang.Character#isWhitespace()
	*/
   public static String stripLeadingBlanks(String s)
   {
	  int ls = s.length();
	  int pos = 0;

	  while ( pos < ls && Character.isWhitespace(s.charAt(pos)) )
	  {
		 pos++;
	  }
	  return s.substring(pos);
   }   
	/**
	* Strips the specified trailing character.
	*
	* @param      s         the string of which trailing characters should be
   *								stripped off
	* @param      c         the character to be stripped off
	*
   * @return		the original string with the specified trailing character stripped
   * 					off.
	*/
   public static String stripTrailing(String s, char c)
   {
	  return stripTrailing(s, c, false);
   }   
	/**
	* Strips the specified trailing character.
   * You can specify that case should be ignored.
	*
	* @param      s         the string of which the trailing character should be
   *								stripped off
	* @param      c         the character to be stripped off
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the original string with the specified trailing character stripped
   * 					off.
	*/
   public static String stripTrailing(String s, char c, boolean ignoreCase)
   {
	  int pos = s.length()-1;

	  while ( pos >= 0 && equals(s.charAt(pos), c, ignoreCase) )
	  {
		 pos--;
	  }
	  return s.substring(0, pos+1);
   }   
	/**
	* Strips the specified trailing characters.
	*
	* @param      s         the string of which trailing characters should be
   *								stripped off
	* @param      c         the characters to be stripped off
	*
   * @return		the original string with the specified trailing characters stripped
   * 					off.
	*/
   public static String stripTrailing(String s, String c)
   {
	  return stripTrailing(s, c, false);
   }   
	/**
	* Strips the specified trailing characters.
   * You can specify that case should be ignored.
	*
	* @param      s         the string of which trailing characters should be
   *								stripped off
	* @param      c         the characters to be stripped off
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return		the original string with the specified trailing characters stripped
   * 					off.
	*/
   public static String stripTrailing(String s, String c, boolean ignoreCase)
   {
	  int pos = s.length()-1;

	  while ( pos >= 0 && indexOf(c, s.charAt(pos), ignoreCase) >= 0 )
	  {
		 pos--;
	  }
	  return s.substring(0, pos+1);
   }   
	/**
	* Strips trailing white space characters.
	* All characters for which Character#isWhitespace() returns true are considered
	* white space characters.
	*
	* @param      s         the string of which white space is to be stripped off
	*
   * @return		the original string with trailing white space characters stripped
   * 					off.
	*
	* @see java.lang.Character#isWhitespace()
	*/
   public static String stripTrailingBlanks(String s)
   {
	  int pos = s.length()-1;

	  while ( pos >= 0 && Character.isWhitespace(s.charAt(pos)) )
	  {
		 pos--;
	  }
	  return s.substring(0, pos+1);
   }   
	/**
	* Returns a substring of the specified string, starting at a specified
   * position, and extending to the end of the string.
	*
	* @param      s         the original string
	* @param      start     the starting position
	* @exception  StringIndexOutOfBoundsException  if
   *             <code>start</code> is out of range.
	*
   * @return	  a substring of the input string.
	*
   * @see java.lang.string#substring(int)
	*/
   public static String substring(String s, int start)
   {
	  return s.substring(start);
   }   
	/**
	* Returns a substring of the specified string, starting at a specified
   * position, with the specified length. If the specified length reaches beyond
   * the length of the string, the result is padded with blanks.
	*
	* @param      s         the original string
	* @param      start     the starting position
	* @param      len       the length of the substring
	* @exception  StringIndexOutOfBoundsException  if
   *             <code>start</code> is out of range.
	*
   * @return	  a substring of the input string.
	*
	* @see java.lang.string#substring(int, int)
	*/
   public static String substring(String s, int start, int len)
   {
	  return substring(s, start, len, ' ');
   }   
	/**
	* Returns a substring of the specified string, starting at a specified
   * position, with the specified length. If the specified length reaches beyond
   * the length of the string, the result is padded with the specified
   * pad character.
	*
	* @param      s         the original string
	* @param      start     the starting position
	* @param      len       the length of the substring
	* @param      pad       the padding character
	* @exception  StringIndexOutOfBoundsException  if
   *             <code>start</code> is out of range or <code>len</code> is
   *             less than zero.
	*
   * @return	  a substring of the input string.
	*
	* @see java.lang.string#substring(int, int)
	*/
   public static String substring(String s, int start, int len, char pad)
   {
	  int ls = s.length();

	  if (start < 0 || start >= ls) {
		 throw new StringIndexOutOfBoundsException(start);
	  }

	  if (len < 0) {
		 throw new StringIndexOutOfBoundsException(len);
	  }

	  if (len > ls-start) {
		 char[] buf = new char[len];

		 s.getChars(start, ls, buf, 0);

		 for (int i = ls-start; i < len; i++)
		 {
			buf[i] = pad;
		 }

		 return new String(buf);
	  }
	  else {
		 return s.substring(start, start+len);
	  }
   }   
	/**
	* Returns a substring of the string which starts at a specified word and
   * contains the specified number of words.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
	*
	* @param      s          the input string
	* @param      startWord  the word number of the first word
	* @param      numWords   the number of words to be returned
	*
   * @return	  a substring of the input string containing the specified number
   * 				  of words.
	*/
   public static String subWords(String s, int startWord, int numWords)
   {
	  int ls = s.length();

	  if (startWord < 0 || numWords <= 0) {
		 return "";
	  }

	  int startPos = indexOfWord(s, startWord);

	  if (startPos >= 0) {
		 int lastPos = indexOfWord(s.substring(startPos), numWords-1);

		 if (lastPos >= 0) {
		      // search for the end of the word
	         int pos = startPos+lastPos;
		      while ( pos < ls && !Character.isWhitespace(s.charAt(pos)) ) pos++;
			return s.substring(startPos, pos);
		 }
		 else {
			return stripTrailingBlanks(s.substring(startPos));
		 }
	  }

	  return "";
   }   
	/**
	* Returns true if the string represents the word "true".
	* @param      s          the input string
	*
   * @return	  true if the string contains the characters "true" (ignoring case).
	*
	* @see java.lang.Boolean#valueOf(String).
	*/
   public static boolean toBoolean(String s)
   {
	  return (Boolean.valueOf(s)).booleanValue();
   }   
	/**
	* If the string represents a valid byte value, returns this value as a
   * byte.
	* @param      s          the input string
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as a byte.
	*
   * @return	  the value of the string represented as a byte.
	*
	* @see java.lang.Byte#valueOf(String).
	*/
   public static byte toByte(String s) throws NumberFormatException
   {
	  return (Byte.valueOf(s)).byteValue();
   }   
	/**
	* If the string represents a valid byte value, returns this value as a
   * byte.
   * You can specify the desired radix.
	* @param      s          the input string
	* @param      radix      the radix of the number
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as a byte.
	*
   * @return	  the value of the string represented as a byte.
	*
	* @see java.lang.Byte#valueOf(String, int).
	*/
   public static byte toByte(String s, int radix) throws NumberFormatException
   {
	  return (Byte.valueOf(s, radix)).byteValue();
   }   
	/**
	* If the string represents a valid double number, returns this number as a
   * double value.
	* @param      s          the input string
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as a double.
	*
   * @return	  the value of the string represented as a double.
	*
	* @see java.lang.Double#valueOf(String).
	*/
   public static double toDouble(String s) throws NumberFormatException
   {
	  return (Double.valueOf(s)).doubleValue();
   }   
	/**
	* If the string represents a valid float number, returns this number as a
   * float value.
	* @param      s          the input string
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as a float.
	*
   * @return	  the value of the string represented as a float.
	*
	* @see java.lang.Float#valueOf(String).
	*/
   public static float toFloat(String s) throws NumberFormatException
   {
	  return (Float.valueOf(s)).floatValue();
   }   
	/**
	* If the string represents a valid integer number, returns this number as an
   * int value.
	* @param      s          the input string
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as an int.
	*
   * @return	  the value of the string represented as an int.
	*
	* @see java.lang.Integer#valueOf(String).
	*/
   public static int toInt(String s) throws NumberFormatException
   {
	  return (Integer.valueOf(s)).intValue();
   }   
	/**
	* If the string represents a valid integer number, returns this number as an
   * int value.
   * You can specify the desired radix.
	* @param      s          the input string
	* @param      radix      the radix of the number
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as an int.
	*
   * @return	  the value of the string represented as an int.
	*
	* @see java.lang.Integer#valueOf(String, int).
	*/
   public static int toInt(String s, int radix) throws NumberFormatException
   {
	  return (Integer.valueOf(s, radix)).intValue();
   }   
	/**
	* If the string represents a valid long integer, returns this number as a
   * long value.
	* @param      s          the input string
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as a long.
	*
   * @return	  the value of the string represented as a long.
	*
	* @see java.lang.Long#valueOf(String).
	*/
   public static long toLong(String s) throws NumberFormatException
   {
	  return (Long.valueOf(s)).longValue();
   }   
	/**
	* If the string represents a valid long integer, returns this number as a
   * long value.
   * You can specify the desired radix.
	* @param      s          the input string
	* @param      radix      the radix of the number
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as a long.
	*
   * @return	  the value of the string represented as a long.
	*
	* @see java.lang.Long#valueOf(String, int).
	*/
   public static long toLong(String s, int radix) throws NumberFormatException
   {
	  return (Long.valueOf(s, radix)).longValue();
   }   
	/**
	* Converts the string to lower case.
	*
	* @param      s          the input string
	*
   * @return	  a string with all characters converted to lower case.
	*
   * @see java.lang.string#toLowerCase()
	*/
   public static String toLowerCase(String s)
   {
	  return s.toLowerCase();
   }   
	/**
	* Converts the string to lower case using the given Locale.
	*
	* @param      s          the input string
	*
   * @return	  a string with all characters converted to lower case.
	*
   * @see java.lang.string#toLowerCase(Locale)
	*/
   public static String toLowerCase(String s, Locale locale)
   {
	  return s.toLowerCase(locale);
   }   
	/**
	* If the string represents a valid short number, returns this number as a
   * short value.
	* @param      s          the input string
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as a short.
	*
   * @return	  the value of the string represented as a short.
	*
	* @see java.lang.Short#valueOf(String, int).
	*/
   public static short toShort(String s) throws NumberFormatException
   {
	  return (Short.valueOf(s)).shortValue();
   }   
	/**
	* If the string represents a valid short number, returns this number as a
   * short value.
   * You can specify the desired radix.
	* @param      s          the input string
	* @param      radix      the radix of the number
   * @exception  NumberFormatException  if the string cannot be represented
   *                        as a short.
	*
   * @return	  the value of the string represented as a short.
	*
	* @see java.lang.Short#valueOf(String).
*/
   public static short toShort(String s, int radix) throws NumberFormatException
   {
	  return (Short.valueOf(s, radix)).shortValue();
   }   
	/**
	* Converts the string to titlecase.
	* @param      s          the input string
	*
   * @return	  a string with all characters converted to title case.
	*
   * @see java.lang.Character#toTitleCase(char)
	*/
   public static String toTitleCase(String s)
   {
	  int ls = s.length();

	  char[] buf = new char[ls];

	  s.getChars(0, ls, buf, 0);

	  for (int i = 0; i < ls; i++)
	  {
		 Character.toTitleCase(buf[i]);
	  }

	  return new String(buf);
   }   
	/**
	* Converts the string to upper case.
	*
	* @param      s          the input string
	*
   * @return	  a string with all characters converted to upper case.
	*
   * @see java.lang.string#toUpperCase()
	*/
   public static String toUpperCase(String s)
   {
	  return s.toUpperCase();
   }   
	/**
	* Converts the string to upper case using the given Locale.
	*
	* @param      s          the input string
	*
   * @return	  a string with all characters converted to upper case.
	*
   * @see java.lang.string#toUpperCase(Locale)
	*/
   public static String toUpperCase(String s, Locale locale)
   {
	  return s.toUpperCase(locale);
   }   
	/**
	* Converts all of the string's characters which are contained in the input
   * set of characters to the corresponding character in the output set of
   * characters.
   * If the output set of characters is shorter than the input set of
   * characters, it is padded with blanks.
   *
   * The method can be used to reorder characters in a string:
   *
   *     Strings.translate("3421", "1234", "abcd")  returns "cdba"
   *
	*
	* @param      s         the original string
	* @param      setin     the input set of characters
	* @param      setout    the output set of characters
	*
   * @return	  a string with the specified characters tramslated.
	*/
   public static String translate(String s, String setin, String setout)
   {
	  return translate(s, setin, setout, ' ');
   }   
	/**
	* Converts all of the string's characters which are contained in the input
   * set of characters to the corresponding character in the output set of
   * characters.
   * If the output set of characters is shorter than the input set of
   * characters, it is padded with the specified pad character.
   *
   * The method can be used to reorder characters in a string:
   *
   *     Strings.translate("3421", "1234", "abcd", ' ')  returns "cdba"
   *
	*
	* @param      s         the original string
	* @param      setin     the input set of characters
	* @param      setout    the output set of characters
	* @param      pad       the pad character
	*
   * @return	  a string with the specified characters tramslated.
	*/
   public static String translate(String s, String setin, String setout, char pad)
   {
	  return translate(s, setin, setout, pad, false);
   }   
	/**
	* Converts all of the string's characters which are contained in the input
   * set of characters to the corresponding character in the output set of
   * characters.
   * If the output set of characters is shorter than the input set of
   * characters, it is padded with the specified pad character.
   * You can specify that case should be ignored.
   *
   * The method can be used to reorder characters in a string:
   *
   *     Strings.translate("3421", "1234", "abcd", ' ')  returns "cdba"
   *
	*
	* @param      s         the original string
	* @param      setin     the input set of characters
	* @param      setout    the output set of characters
	* @param      pad       the pad character
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  a string with the specified characters tramslated.
	*/
   public static String translate(String s, String setin, String setout,
   										 char pad, boolean ignoreCase)
   {
	  int ls   = s.length();
	  int lout = setout.length();

	  char[] buf = new char[ls];

	  s.getChars(0, ls, buf, 0);

	  int pos = 0;
	  int n;

	  while ( (pos = indexOfAnyOf(s, setin, pos, ignoreCase)) >= 0 )
	  {
		 n = indexOf(setin, buf[pos], ignoreCase);
		 if (n >= lout) {
			buf[pos] = pad;
		 }
		 else {
			buf[pos] = setout.charAt(n);
		 }
		 pos++;
	  }

	  return new String(buf);
   }   
	/**
	* Converts all of the string's characters which are contained in the input
   * set of characters to the corresponding character in the output set of
   * characters.
   * If the output set of characters is shorter than the input set of
   * characters, it is padded with blanks.
   * You can specify that case should be ignored.
   *
   * The method can be used to reorder characters in a string:
   *
   *     Strings.translate("3421", "1234", "abcd", ' ')  returns "cdba"
   *
	*
	* @param      s         the original string
	* @param      setin     the input set of characters
	* @param      setout    the output set of characters
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  a string with the specified characters tramslated.
	*/
   public static String translate(String s, String setin, String setout,
   										 boolean ignoreCase)
   {
	  return translate(s, setin, setout, ' ', ignoreCase);
   }   
	/**
	* Returns the nth word in the string.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
	*
	* @param      s          the input string
	* @param      wordNum    the number of the word to be returned
	*
   * @return	  a string representing the nth word from the input string.
	*/
   public static String word(String s, int wordNum)
   {
	  int ls = s.length();
	  int i;

	  if (wordNum < 0) {
		 return "";
	  }

	  int startPos = indexOfWord(s, wordNum);

	  if (startPos >= 0) {
	      // search for the end of the word
		 int pos = startPos;
	      while ( pos < ls && !Character.isWhitespace(s.charAt(pos)) ) pos++;

		 return s.substring(startPos, pos);
	  }

	  return "";
   }   
   private static WordEntry wordEntryOfPhrase(String s, String p, int startWord, boolean ignoreCase)
   {
	  int ls = s.length();
	  int lp = p.length();

	  if (ls == 0 || lp == 0) {
		 return null;
	  }

	  if (startWord < 0) {
		 startWord = 0;
	  }

	  Vector sList = buildWordList(s, ls);
	  Vector pList = buildWordList(p, lp);

	  int ns = sList.size();
	  int np = pList.size();
	  int si = startWord;
	  int pi = 0;
	  int lastsi = startWord;
	  int start  = -1;

	  while (si < ns && pi < np)
	  {
		 WordEntry es = (WordEntry)sList.elementAt(si);
		 WordEntry ep = (WordEntry)pList.elementAt(pi);

		 if ( s.regionMatches(ignoreCase, es.start, p, ep.start, ep.len) )
		 {
			si++;
			pi++;
		 }
		 else
		 {
	         si = ++lastsi;
			pi = 0;
		 }
	  }

	  if (pi == np)
	  {
		 return (WordEntry)sList.elementAt(lastsi);
	  }

	  return null;
   }   
	/**
	* Returns the number of the first word of the first occurrence of the
   * specified phrase within the string.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
	*
	* @param      s          the input string
	* @param      p          the phrase to be searched for
	* @param      startWord  the word number where the search is to start. The
   *                        first word has number 0.
	*
   * @return	  the number of the first word of the first occurrence of the
   * 				  specified phrase within the string.
	*/
   public static int wordIndexOfPhrase(String s, String p, int startWord)
   {
	  return wordIndexOfPhrase(s, p, startWord, false);
   }   
	/**
	* Returns the number of the first word of the first occurrence of the
   * specified phrase within the string.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
   * You can specify that case should be ignored.
	*
	* @param      s          the input string
	* @param      p          the phrase to be searched for
	* @param      startWord  the word number where the search is to start. The
   *                        first word has number 0.
	* @param      ignoreCase if true case is ignored when comparing characters
	*
   * @return	  the number of the first word of the first occurrence of the
   * 				  specified phrase within the string.
	*/
   public static int wordIndexOfPhrase(String s, String p, int startWord, boolean ignoreCase)
   {
	  WordEntry e = wordEntryOfPhrase(s, p, startWord, ignoreCase);

	  if (e == null) {
		 return -1;
	  }

	  return e.wordNum;
   }   
	/**
	* All whitespace between the words of the string is replaced by the
   * specified number of blanks.
   * Words are sequences of characters separated by white space. White space is
   * any character for which java.lang.Character#isWhitespace() returns true.
	*
	* @param      s          the input string
	* @param      spaces     the number of blanks between the words
	*
   * @return	  a string with the words separated by the specifed number of blanks
	*/
   public static String wordSpace(String s, int spaces)
   {
	  int ls = s.length();
	  int i;

	  if (spaces < 0) {
		 return s;
	  }

	  Vector wordList = buildWordList(s, ls);

	  int nWords = wordList.size();

	  if (nWords == 0) {
		 return "";
	  }

	  // Calculate length of new string
	  int newsize = 0;

	  for (i = 0; i < nWords; i++)
	  {
		 WordEntry e = (WordEntry)wordList.elementAt(i);
		 newsize += e.len;
	  }

	  char[] buf = new char[newsize+(nWords-1)*spaces];

	  int pos = 0;

	  for (i = 0; i < nWords; i++)
	  {
		 WordEntry e = (WordEntry)wordList.elementAt(i);
		 s.getChars(e.start, e.start+e.len, buf, pos);
		 pos += e.len;

		 if (i < nWords-1) {
	         for (int j = 0; j < spaces; j++)
	         {
	            buf[pos++] = ' ';
	         }
		 }
	  }

	  return new String(buf);
   }   
	/**
	* Builds a string consisting of all characters between 'start' and 'end'.
   * Both the start and end characters are included in the string.
	*
	* @param      start     the starting character
	* @param      end       the ending character
	*
   * @return	  a string consisting of all the specified characters.
	*/
   public static String xRange(char start, char end)
   {
	  if (start <= end) {
		 int l = end-start+1;
	      char[] buf = new char[l];

	      for (int i = 0; i < l; i++)
	      {
			buf[i] = (char)(start+i);
		 }
		 return new String(buf);
	  }
	  else {
		 return "";
	  }
   }   
}
