package org.opencyc.parser;

//// Internal Imports
import java.io.*;
import junit.framework.AssertionFailedError;
import static org.junit.Assert.*;
import org.junit.Test;
import org.opencyc.api.*;
import org.opencyc.cycobject.*;
import org.opencyc.parser.UnitTest;

/**
 * <P>This junit test file will test the functionality of the CycL parser.
 *
 * @version $Id: UnitTest.java 133075 2010-12-21 16:04:12Z baxter $
 * @author Tony Brusseau
 *
 * <p>Copyright 2001 Cycorp, Inc., license is open source GNU LGPL.
 * <p><a href="http://www.opencyc.org/license.txt">the license</a>
 * <p><a href="http://www.opencyc.org">www.opencyc.org</a>
 * <p><a href="http://www.sourceforge.net/projects/opencyc">OpenCyc at SourceForge</a>
 * <p>
 * THIS SOFTWARE AND KNOWLEDGE BASE CONTENT ARE PROVIDED ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE OPENCYC
 * ORGANIZATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE AND KNOWLEDGE
 * BASE CONTENT, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
public class UnitTest {

  //// Public Area
  public void testConstants() {
    System.out.println();
    String[] constantsToTest = {"True", "False", "and", "or", "xor", "not", "equiv", "implies", "forAll",
      "thereExists", "thereExistExactly", "thereExistAtMost", "thereExistAtLeast",
      "Dog", "Cat", "Collection", "foo:bar", "#$foo:bar",
      "#$True", "#$False", "#$and", "#$or", "#$xor", "#$not", "#$equiv",
      "#$implies", "#$forAll", "#$thereExists", "#$thereExistExactly",
      "#$thereExistAtMost", "#$thereExistAtLeast",
      "#$Dog", "#$Cat", "#$Collection", "#$1-TheDigit", "#Gbd5880d9-9c29-11b1-9dad-c379636f7270",
      "#GBD5880D9-9C29-11B1-9dad-c379636F7270", "#G\"bd5880d9-9c29-11b1-9dad-c379636f7270\"",
      "#G\"BD5880d9-9c29-11b1-9dad-c379636F7270\"", "#gbd5880d9-9c29-11b1-9dad-c379636f7270",
      "#gBD5880D9-9C29-11B1-9dad-c379636F7270", "#g\"bd5880d9-9c29-11b1-9dad-c379636f7270\"",
      "#g\"BD5880d9-9c29-11b1-9dad-c379636F7270\"", "qawerpiouasdf", "#$234a2354dsf", "#$234-"};
    String[] constantsThatShouldFail = {"", "ExpandSubLFn", "SubLQuoteFn",
      "#$ExpandSubLFn", "#$SubLQuoteFn", "#$-", "#$?", "#$?234", "#$234?",
      "#$1", "#$.", "#$@", "#$!", "#GXbd5880d9-9c29-11b1-9dad-c379636f7270"};
    new Tester(constantsToTest, constantsThatShouldFail) {
      @Override
      Object parse() throws ParseException, IOException, UnsupportedVocabularyException {
        return parser.constant(true);
      }

      @Override
      boolean isValid(Object result) {
        return result instanceof CycConstant;
      }
    }.test();
  }

  @Test
  public void testVariables() {
    System.out.println();
    String[] testStrings = {"?X", "?XX", "?X-X", "?ABC-234", "?ABC-ABC", "?UIO-123-UIO",
      "??X", "??XX", "??X-X", "??ABC-234", "??ABC-ABC", "??UIO-123-UIO", "?a"};
    String[] testsThatShouldFail = {"?-", "??234", "", "XX", "qawerpiouasdf", "??",
      "?1", "?.", "?@", "?!", "?234a2354dsf", "?234-ABC", "??234-ABC"};
    new Tester(testStrings, testsThatShouldFail) {
      @Override
      Object parse() throws ParseException, IOException, UnsupportedVocabularyException {
        return parser.simpleVariable(true);
      }

      @Override
      boolean isValid(Object result) {
        return result instanceof CycVariable;
      }
    }.test();
  }

  @Test
  public void testMetaVariables() {
    System.out.println();
    String[] testStrings = {":X", ":XX", ":X-X", ":ABC-234", ":ABC-ABC", ":UIO-123-UIO", ":a"};
    String[] testsThatShouldFail = {":-", "::234", "", "XX", "qawerpiouasdf", "::",
      "::X", ":1", ":.", ":@", ":!", ":234a2354dsf", ":234-ABC", "::234-ABC"};
    new Tester(testStrings, testsThatShouldFail) {
      @Override
      Object parse() throws ParseException, IOException, UnsupportedVocabularyException {
        return parser.metaVariable(true);
      }

      @Override
      boolean isValid(Object result) {
        return result instanceof CycVariable;
      }
    }.test();
  }

  @Test
  public void testStrings() {
    System.out.println();
    String[] testStrings = {"\"\"", "\"hi\"", "\"HI\"", "\"1\"", "\"\n\"", "\"\\n\"", 
        "\"\nhi\n\"", "\"\\\"\"", "\"\t\"", "\"fužine\""};
    String[] testsThatShouldFail = {"", "\"", "00\"", "\"pp", "asdf", "asdf\"sdf\""};
    new Tester(testStrings, testsThatShouldFail) {
      @Override
      Object parse() throws ParseException, IOException, UnsupportedVocabularyException {
        return parser.string(true);
      }

      @Override
      boolean isValid(Object result) {
        return result instanceof String;
      }
    }.test();
  }

  @Test
  public void testIntegers() {
    System.out.println();
    String[] testStrings = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
      "001", "1123", "-2123", "-03", "+41234", "54444444444444444", "-9876543210", "+0123456789"};
    String[] testsThatShouldFail = {"", "asdf", "#$AR", ":SDF", "?SDF", "??SDF"};
    new Tester(testStrings, testsThatShouldFail) {
      @Override
      Object parse() throws ParseException, IOException, UnsupportedVocabularyException {
        return parser.number(true);
      }

      @Override
      boolean isValid(Object result) {
        return result instanceof Integer || result instanceof Long;
      }
    }.test();
  }

  @Test
  public void testFloats() {
    System.out.println();
    String[] testStrings = {"0.0", "001.001", "2.12", "3.1e123", "-3.1e-123", "+3.1e+123", "-3.1e+123", "+3.1e1123",
      "+32354235.1234523e+123", "9876543210.1234522", "1123.234234",
      "3.1d123", "-3.1d-123", "+3.1d+123", "-3.1d+123", "+3.1d1123",
      "+32354235.1234523d+123"};
    String[] testsThatShouldFail = {"", "asdf", "#$AR", ":SDF", "?SDF", "??SDF"};
    new Tester(testStrings, testsThatShouldFail) {
      @Override
      Object parse() throws ParseException, IOException, UnsupportedVocabularyException {
        return parser.number(true);
      }

      @Override
      boolean isValid(Object result) {
        return result instanceof Float || result instanceof Double;
      }
    }.test();
  }

  @Test
  public void testSentences() {
    System.out.println();
    String[] testStrings = {"TheAssertionSentence", "(and)", "(#$and)", "(and . ?X)", "(and . :X)", "(and #$Dog . ?X)", "(#$and Cat #$Dog . ?X)",
      "(blah)", "(#$blah)", "(blah . ?X)", "(blah . :X)", "(blah #$Dog . ?X)", "(#$blah Cat #$Dog . ?X)",
      "(hasName Tony \"\\)\")",
      "(predTrivialForJustificationParaphrase ?PRED)", "(implies (and (predTrivialForJustificationParaphrase ?PRED) (argN ?PREDICATE 0 ?SENTENCE)) (sentenceTrivialForJustificationParaphrase ?SENTENCE))", "(forAll ?X (isa ?X Dog))", "(implies (isa ?INSTANCE Dog) (thereExists ?TYPE (and (isa ?TYPE ?COLLECTION-TYPE) (isa ?INSTANCE ?TYPE))))", "True", "False", "#$True", "#$False", ":X", "?X", "(#$isa ?X #$Dog)", "(#$isa \"adsf\" #$Dog)", "(#$isa 3.24e34 #$Dog)", "(not True)",
      "(not ?X)", "(:X :X :X)", "(not (#$isa ?X #$Dog))", "(#$not (not (?Y ?X #$Dog)))", "((#$SomeFn #$Predicate) \"adsf\" #$Dog)",
      "(#$isa //asdf asdf jasdf 89234 2lajf02 \n\"/*\" \";\" \"//\"\n?X ;asdfas 230n90 ?.las fqw #$ \n/*asdf82 ?. aa */#$Dog)"};
    String[] testsThatShouldFail = {"", "(", ")", "(\"and\")", "45.023d23", "23", "Dog Cat", "(isa ?X Dog)1234"};
    new Tester(testStrings, testsThatShouldFail) {
      @Override
      Object parse() throws ParseException, IOException, UnsupportedVocabularyException {
        return parser.sentence(true);
      }

      @Override
      boolean isValid(Object result) {
        return result instanceof CycList
                || result instanceof CycVariable
                || result instanceof CycConstant;
      }
    }.test();
  }

  private abstract class Tester {

    final String[] shouldSucceed;
    final String[] shouldFail;

    public Tester(String[] shouldSucceed, String[] shouldFail) {
      this.shouldSucceed = shouldSucceed;
      this.shouldFail = shouldFail;
    }

    abstract Object parse() throws ParseException, IOException, UnsupportedVocabularyException;

    @Test
    public void test() {
      java.io.Reader reader = null;
      String[] curTests = shouldSucceed;
      try {
        for (int j = 0; j < 2; j++) {
          final boolean expectSuccess = j == 0;
          if (expectSuccess) {
            System.out.println(
                    "!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
          } else {
            System.out.println(
                    "!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
            curTests = shouldFail;
          }
          for (int i = 0; i < curTests.length; i++) {
            try {
              String curTest = curTests[i];
              System.out.println("Input: '" + curTest + "'.");
              reader = new java.io.StringReader(curTest);
              parser.ReInit(reader);
              Object result = parse();
              if (result == null) {
                System.out.println("Output: " + result);
              } else {
                System.out.println("Output (" + result.getClass().getSimpleName()
                        + "): " + DefaultCycObject.cyclify(result));
              }
              if (expectSuccess) {
                assertNotNull(result);
                assertTrue("Invalid result " + result
                        + " of type " + result.getClass().getSimpleName()
                        + " for " + curTest, isValid(result));
              } else {
                fail(null);
              }
            } catch (AssertionFailedError afe) {
              afe.printStackTrace(System.out);
              throw afe;
            } catch (Throwable e) {
              if (expectSuccess) {
                e.printStackTrace(System.out);
                assertNotNull(null);
              } else {
                String msg = e.getLocalizedMessage();
                if (msg.contains("\n")) {
                  msg = msg.substring(0, msg.indexOf("\n"));
                }
                System.out.println(
                        "Output (" + e.getClass().getSimpleName() + "): " + msg);
              }
            } finally {
              System.out.println();
            }
          }
        }

      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    abstract boolean isValid(Object result);
  }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private static CycLParser parser;

  static {
    try {
      parser = new CycLParser(new StringReader(""),
              TestUtils.getCyc());
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }
  }
}
