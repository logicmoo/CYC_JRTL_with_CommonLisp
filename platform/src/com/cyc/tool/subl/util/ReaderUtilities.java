/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//// Internal Imports

//// External Imports

public  final class ReaderUtilities {
  
  //// Constructors
  
  /** Creates a new instance of ReaderUtilities. */
  public ReaderUtilities() {
  }
  
  //// Public Area
  
  public static boolean shouldProcessSubLStatementNow(String subLStatement) {
    subLStatement = subLStatement.trim();
    boolean notIsEmptyString = !"".equals(subLStatement);
    int parenthesisMatchType = areParenthesesBalanced(subLStatement); // 0 == same, 1 = unmatched open, 2 = unmatched closed
    boolean isFinalQuoteComplete = isFinalQuoteComplete(subLStatement);
    boolean isFinalStringComplete = isFinalStringComplete(subLStatement);
    if (parenthesisMatchType == 2) {
      return true; // invalid subl -- return true so don't tie up readloop 
                   // forever expecting it to become valid, which it can't because 
                   // the reader is line based
    }
    return notIsEmptyString && (parenthesisMatchType == 0) 
      && isFinalQuoteComplete & isFinalStringComplete;
  }
  
  /** returns 0 == same, 1 = unmatched open, 2 = unmatched closed */
  public static int areParenthesesBalanced(String subLStatement) {
    // @note this is not very efficient -APB
    int curIndex = 0;
    do {
      curIndex = subLStatement.indexOf('(', curIndex);
      if (curIndex >= 0) {
        if (!isInsideString(curIndex, subLStatement)) {
          if (findMatchToOpenParen(curIndex, subLStatement) < 0) {
            return 1;
          }
        }
        curIndex++;
      }
    } while (curIndex >= 0);
    curIndex = 0;
    do {
      curIndex = subLStatement.indexOf(')', curIndex);
      if (curIndex >= 0) {
        if (!isInsideString(curIndex, subLStatement)) {
          if (findMatchToCloseParen(curIndex, subLStatement) < 0) {
            return 2;
          }
        }
        curIndex++;
      }
    } while (curIndex >= 0);
    return 0;
  }
  
  public static boolean isFinalQuoteComplete(String subLStatement) {
    if (subLStatement.endsWith("'")  || subLStatement.endsWith("#(") 
      || subLStatement.endsWith("`") || subLStatement.endsWith(",@") 
      || subLStatement.endsWith(",") || subLStatement.endsWith("#")
      || subLStatement.endsWith("#\\")) {
      return false;
    }
    return true;
  }
  
  public static boolean isFinalStringComplete(String subLStatement) {
    return !isInsideString(subLStatement.length() - 1, subLStatement);
  }
  
  public static int findMatchToCloseParen(int loc, String str) {
    try {
      int parenCount = 1;
      int i = loc - 1;
      int insideOfQuotes = 0;
      for(; i >= 0; i--) {
        char c = str.charAt(i);
        switch(c) {
          case ')':
            if (insideOfQuotes != 0) { break; }
            parenCount++;
            break;
          case '(':
            if (insideOfQuotes != 0) { break; }
            parenCount--;
            break;
          case '"':
            try {
              if (str.charAt(i-1) == '\\') { break; }
            } catch (Exception e) {} //ignore
            if (insideOfQuotes == 0) {
              insideOfQuotes++;
            } else {
              insideOfQuotes--;
            }
            break;
        }
        if(parenCount == 0)
          break;
      }
      return i;
    } catch (Exception e) { return -1; }
  }
  
  public static int findMatchToOpenParen(int loc, String str) {
    try {
      int parenCount = 1;
      int i = loc + 1;
      int insideOfQuotes = 0;
      for(int size = str.length(); i <= size; i++) {
        char c = str.charAt(i);
        switch(c) {
          case ')':
            if (insideOfQuotes != 0) { break; }
            parenCount--;
            break;
          case '(':
            if (insideOfQuotes != 0) { break; }
            parenCount++;
            break;
          case '"':
            try {
              if (str.charAt(i-1) == '\\') { break; }
            } catch (Exception e) {} //ignore
            if (insideOfQuotes == 0) {
              insideOfQuotes++;
            } else {
              insideOfQuotes--;
            }
            break;
        }
        if(parenCount == 0)
          break;
      }
      return (i > str.length()) ? -1 : i;
    } catch (Exception e) { return -1; }
  }
  
  public static boolean isWordBreakChar(char c) {
    if (Character.isLetterOrDigit(c)) { return false; }
    switch (c) {
      case '+': case '.': case '-': case '_':
      case '?': case '#': case '$': case ':':
        return false;
      default:
        return true;
    }
  }
  
  public static boolean isConstantChar(char curChar) {
    if (Character.isLetterOrDigit(curChar) || (curChar == '-')
    || (curChar == '_') || (curChar == '#') || (curChar == '$')
    || (curChar == '*') || (curChar == '?') || (curChar == '\\')) {
      return true;
    }
    return false;
  }
  
  public static int getStartOfWordAtLoc(int pos, String str) {
    if ((str == null) || (str.length() == 0)) { return -1; }
    int i = pos;
    if ((pos == str.length()) || (!isConstantChar(str.charAt(i)))) { i--; }
    for (; i >= 0; i--) {
      char c = str.charAt(i);
      if (isWordBreakChar(c)) { i++; break; }
    }
    if (i < 0) { i = 0; }
    return i;
  }
  
  public static int getEndOfWordAtLoc(int pos, String str) {
    if ((str == null) || (str.length() == 0)) { return -1; }
    int i = pos;
    for (int size = str.length(); i < size; i++) {
      char c = str.charAt(i);
      if (isWordBreakChar(c)) { break; }
    }
    if (i >= str.length()) { i = str.length(); }
    return i;
  }
  
  public static int getLocInTextFromLineCol(String text, int line, int col) {
    try {
      line--;
      Pattern pattern = (line == 0) ?
        Pattern.compile("\\A.{" + col + "}")
        : Pattern.compile("\\A(.*?$\\s){" + line + "}.{" + col + "}", Pattern.MULTILINE);
      Matcher matcher = pattern.matcher(text);
      if (matcher.find()) {
        //System.out.println("Got match: '" + matcher.group() + "'.");
        return matcher.end() - 1;
      } else {
        //System.out.println("Failed loc find.");
      }
    } catch (Exception e) { } //ignore
    return -1;
  }
  
  public static boolean isInsideString(int loc, String str) {
    try {
      int i = loc;
      int insideOfQuotes = 0;
      for(; i >= 0; i--) {
        char c = str.charAt(i);
        switch(c) {
          case '"':
            try { if (str.charAt(i-1) == '\\') { break; } } catch (Exception e) {} //ignore
            if (insideOfQuotes == 0) { insideOfQuotes++; } else { insideOfQuotes--; }
            break;
        }
      }
      return (insideOfQuotes == 1);
    } catch (Exception e) { return false; }
  }
  
  public static String getIndentationOfPreviousLine(int loc, String text) {
    if ((text == null) || (text.length() <= 0) ||
      (loc < 0) || (loc >= text.length())) {
      return "";
    }
    StringBuilder buf = new StringBuilder("");
    text = text.substring(0, loc + 1);
    
    //get rid of everything after the last newline
    int aLoc = text.lastIndexOf('\n');
    if (aLoc >= 0) {
      text = text.substring(0, aLoc);
      while (text.endsWith("\n")) {
        text = text.substring(0,text.length() - 1);
      }
    } else {
      return "";
    }
    
    //trim the string so only include from new last newline to end of string
    int endLoc = text.lastIndexOf('\n', loc) + 1;
    if (endLoc < 0) {
      return "";
    } else {
      text = text.substring(endLoc, text.length());
    }
    
    for (int i = 0, size = text.length(); i < size; i++) {
      char c = text.charAt(i);
      if (Character.isWhitespace(c) && (c != '\n') && (c != '\r')) {
        buf.append(c);
      } else {
        break;
      }
    }
    return buf.toString();
  }
  
  
  
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String str;
    System.out.println("Starting.");
    try {
      str = "ad < sad 32.235 kjds ()";
      System.out.println("Parenthesis are balanced '" 
        + str + "': " + areParenthesesBalanced(str));
      str = "aasdfas";
      System.out.println("Parenthesis are balanced '" 
        + str + "': " + areParenthesesBalanced(str));
      str = "()";
      System.out.println("Parenthesis are balanced '" 
        + str + "': " + areParenthesesBalanced(str));
      str = "(isa (?X dog))";
      System.out.println("Parenthesis are balanced '" 
        + str + "': " + areParenthesesBalanced(str));
      str = "( asdfa ) asdf ( asdf )";
      System.out.println("Parenthesis are balanced '" 
        + str + "': " + areParenthesesBalanced(str));
      str = "( asdf ( asdf ) \")\"";
      System.out.println("Parenthesis are balanced '" 
        + str + "': " + areParenthesesBalanced(str));
      str = ") ( asdf ( asdf ) \")\" )";
      System.out.println("Parenthesis are balanced '" 
        + str + "': " + areParenthesesBalanced(str));
      str = "( asdf ( asdf ) \")\" )";
      System.out.println("Parenthesis are balanced '" 
        + str + "': " + areParenthesesBalanced(str));
      str = "\"asfdaff";
      System.out.println("Final string complete? '" 
        + str + "': " + isFinalStringComplete(str));
      str = "( asdf ( asdf ) \")\" )";
      System.out.println("Final string complete? '" 
        + str + "': " + isFinalStringComplete(str));
      str = "\"a\nb\"";
      System.out.println("Final string complete? '" 
        + str + "': " + isFinalStringComplete(str));
      str = "\"a\nb";
      System.out.println("Final string complete? '" 
        + str + "': " + isFinalStringComplete(str));
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Finished.");
  }
  
}
