//
// For LarKC
//
package com.cyc.tool.subl.parser;

import java.io.Reader;
import java.io.StringReader;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThreadPool;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class UnitTest extends TestCase {
	public UnitTest(String name) {
		super(name);
	}

	public static void main(final String[] args) {
		SubLProcess subLProcess = new SubLProcess("Unit Tester") {
			@Override
			public void safeRun() {
				SubLEnvironment env = SubLEnvironment.currentEnvironment();
				SubLMain me = SubLMain.me;
				SubLMain.initializeSubL(args);
				try {
					TestRunner.run(UnitTest.suite());
					System.exit(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		try {
			SubLThreadPool.getDefaultPool().execute(subLProcess);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Test suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTest(new UnitTest("testAtoms"));
		testSuite.addTest(new UnitTest("testForms"));
		testSuite.addTest(new UnitTest("testTerms"));
		testSuite.addTest(new UnitTest("testTermLists"));
		testSuite.addTest(new UnitTest("testQuoting"));
		testSuite.addTest(new UnitTest("testVectors"));
		testSuite.addTest(new UnitTest("testRegressions"));
		testSuite.addTest(new UnitTest("testComments"));
		testSuite.addTest(new UnitTest("testReadTimeEvaluation"));
		return testSuite;
	}

	private static SubLParser parser;
	static {
		try {
			UnitTest.parser = new SubLParser(new StringReader(""));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public void testAtoms() {
		System.out.println();
		String[] testStrings = { "#\\1", "#\\a", "#\\A", "#\\.", "#\\;", "#\\!", "#\\#", "#\\@", "#\\%", "#\\!", "#\\)",
				"#\\(", "?X", "?XX", "?X-X", "?ABC-234", "?ABC-ABC", "?UIO-123-UIO", "??X", "??XX", "??X-X",
				"??ABC-234", "??ABC-ABC", "??UIO-123-UIO", "?a", "True", "False", "and", "or", "xor", "not", "equiv",
				"implies", "forAll", "thereExists", "thereExistExactly", "thereExistAtMost", "thereExistAtLeast", "Dog",
				"Cat", "Collection", "1-TheDigit", "234a2354dsf", "234-", "True", "False", "and", "or", "xor", "not",
				"equiv", "implies", "forAll", "thereExists", "thereExistExactly", "thereExistAtMost",
				"thereExistAtLeast", "Dog", "Cat", "Collection", "3a", "do-all", "do-10-times/w-bindings?",
				"qawerpiouasdf", "SL::+", "+", "-", "/", "*", ":BLAH", "|SUBLISP|:|NIL|", "|NIL|",
				"|Case Sensitive Name|", "SL:|N i L|", "|a\\|a|", "|a\\\\\\|a|", "\"\"", "\"hi\"", "\"HI\"", "\"1\"",
				"\"\n\"", "\"\\n\"", "\"\nhi\n\"", "\"\\\"\"", "\"\t\"", "0", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "001", "1123", "-2123", "-03", "+41234", "54444444444444444", "-9876543210", "+0123456789", "0.0",
				"001.001", "2.12", "3.1e123", "-3.1e-123", "+3.1e+123", "-3.1e+123", "+3.1e1123",
				"+32354235.1234523e+123", "9876543210.1234522", "1123.234234", "3.1d123", "-3.1d-123", "+3.1d+123",
				"-3.1d+123", "+3.1d1123", "+32354235.1234523d+123" };
		String[] testsThatShouldFail = { "()", "(adsf arm 23.34 \"asdf\")", "\"", "'", "#" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: " + curTest);
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.atom(true, true);
						if (result == null)
							System.out.println("Output: " + result);
						else
							System.out.println("Output: " + result + " of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof Number || result instanceof SubLCharacter
									|| result instanceof SubLString || result instanceof SubLSymbol);
						} else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testCharacters() {
		System.out.println();
		String[] testStrings = { "#\\1", "#\\a", "#\\A", "#\\.", "#\\;", "#\\!", "#\\#", "#\\@", "#\\%", "#\\!", "#\\)",
				"#\\(", "#\\c-m-a", "#\\control-meta-a", "#\\Space" };
		String[] testsThatShouldFail = { "", "#\\", "#", "a", "'a'", "#\\ab", "d234", ".e234", "asdf", "#$AR", ":SDF",
				"?SDF", "??SDF" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.character(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof SubLCharacter);
						} else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testComments() {
		System.out.println();
		String[] testStrings = { "a ; (\n", "a #| ( |#" };
		String[] testsThatShouldFail = { "|#", "|#" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.term(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0)
							Assert.assertNotNull(result);
						else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testFloats() {
		System.out.println();
		String[] testStrings = { "0.0", "001.001", "2.12", "3.1e123", "-3.1e-123", "+3.1e+123", "-3.1e+123",
				"+3.1e1123", "+32354235.1234523e+123", "9876543210.1234522", "1123.234234", "3.1d123", "-3.1d-123",
				"+3.1d+123", "-3.1d+123", "+3.1d1123", "+32354235.1234523d+123" };
		String[] testsThatShouldFail = { "d234", ".e234", "asdf", "#$AR", ":SDF", "?SDF", "??SDF" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.number(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof SubLDoubleFloat);
						} else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testForms() {
		System.out.println();
		String[] testStrings = { "(and)", "(and)", "(and . ?X)", "(and . :X)", "(and Dog . ?X)", "(and Cat Dog . ?X)",
				"(blah)", "(blah)", "(blah . ?X)", "(blah . :X)", "(blah Dog . ?X)", "(blah Cat Dog . ?X)",
				"(hasName Tony \"\\)\")", "(predTrivialForJustificationParaphrase ?PRED)",
				"(implies (and (predTrivialForJustificationParaphrase ?PRED) (argN ?PREDICATE 0 ?SENTENCE)) (sentenceTrivialForJustificationParaphrase ?SENTENCE))",
				"(forAll ?X (isa ?X Dog))",
				"(implies (isa? ?INSTANCE Dog) (thereExists ?TYPE (and (isa ?TYPE ?COLLECTION-TYPE) (isa ?INSTANCE ?TYPE))))",
				"(isa ?X Dog)", "(isa \"adsf\" Dog)", "(isa 3.24e34 Dog)", "(not True)", "(not ?X)", "(:X :X :X)",
				"(not (isa ?X Dog))", "(not (not (?Y ?X Dog)))", "((SomeFn Predicate) \"adsf\" Dog)",
				"(isa //asdf asdf jasdf 89234 2lajf02 \n\"/*\" \";\" \"//\"\n?X ;asdfas 230n90 ?.las fqw  \n/*asdf82 ?. aa */Dog)" };
		String[] testsThatShouldFail = { "", "(", ")", "45.023d23", "23", "Dog Cat", "(isa ?X Dog)1234" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.form(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof SubLList);
						} else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testIntegers() {
		System.out.println();
		String[] testStrings = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"99999999999999999999999999999999999999999999999999", "461168601842738790", "#22R0101", "#3R0101",
				"#4R0101", "#5R0101", "#6R0101", "#7R0101", "#8R0101", "#9R0101", "#10R0101", "#5R0101", "#11R0101",
				"#12R0101", "#13R0101", "#14R0101", "#15R0101", "#16R0101", "#17R0101", "#18R0101", "#19R0101",
				"#20R0101", "#21R0101", "#22R0101", "#23R0101", "#24R0101", "#25R0101", "#26R0101", "#27R0101",
				"#28R0101", "#29R0101", "#30R0101", "#31r0101", "#32r0101", "#33r0101", "#34r0101", "#35r0101",
				"#36r0101", "#o1334567", "#XDEADBEEF", "#b0100101111111111111111111111111111111111111111111111111111",
				"001", "1123", "-2123", "-03", "+41234", "54444444", "-9876543210", "+0123456789" };
		String[] testsThatShouldFail = { "", ".", "e323", "3e3e3", "asdf", "#$AR", ":SDF", "?SDF", "??SDF", "#0r0101",
				"#ar0101", "#0101", "#37r0101", "#2r0201", "#16r0101V" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.number(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof Number);
						} else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testQuoting() {
		System.out.println();
		String[] testStrings = { "'a", "'?a34", "'123", "'\"1\"", "'(a b c)", "'a", "'1.34e10", "`a", "`?a34", "`123",
				"`\"1\"", "`(a b c)", "`a", "`1.34e10", "''a", "''?a34", "''123", "''\"1\"", "''(a b c)", "'''a",
				"'1.34e10", "'`a", "'`?a34", "'`123", "'`\"1\"", "'`(a b c)", "'`a", "'`1.34e10", ",a", ",?a34", ",123",
				",\"1\"", ",(a b c)", ",a", ",1.34e10", "#'a" };
		String[] testsThatShouldFail = { "#'123", "#'\"1\"", "#'(a b c)", "#'#$a", "#'1.34e10" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.term(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0)
							Assert.assertNotNull(result);
						else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testReadTimeEvaluation() {
		System.out.println();
		String[] testStrings = { "#.(+ 1 3)" };
		String[] testsThatShouldFail = new String[0];
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.term(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0)
							Assert.assertNotNull(result);
						else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testRegressions() {
		testUnusualSpaceRegression();
	}

	public void testStrings() {
		System.out.println();
		String[] testStrings = { "\"\"", "\"hi\"", "\"HI\"", "\"1\"", "\"\n\"", "\"\\n\"", "\"\nhi\n\"", "\"\\\"\"",
				"\"\t\"" };
		String[] testsThatShouldFail = { "", "\"", "00\"", "\"pp", "asdf", "asdf\"sdf\"" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.string(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof SubLString);
						} else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testSymbols() {
		System.out.println();
		String[] constantsToTest = { "#:argh", "::true", "sublisp::true", "True", "False", "and", "or", "xor", "not",
				"equiv", "implies", "forAll", "thereExists", "thereExistExactly", "thereExistAtMost",
				"thereExistAtLeast", "Dog", "Cat", "Collection", "3a", "do-all", "do-10-times/w-bindings?",
				"qawerpiouasdf", "SL:+", "+", "-", "/", "*", ":BLAH", "|SUBLISP|:|NIL|", "|NIL|",
				"|Case Sensitive Name|", "SL:|N i L|", "|a\\|a|", "|a\\\\\\|a|" };
		String[] constantsThatShouldFail = { "", "#$Dog", "3", ".", ";", "#", "#$", "#'", "|", "|\\\\\\\\||" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					constantsToTest = constantsThatShouldFail;
				}
				for (int i = 0; i < constantsToTest.length; ++i)
					try {
						String curTest = constantsToTest[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.symbol(true, true);
						if (result == null)
							System.out.println("Output: " + result);
						else
							System.out.println("Output: " + result + " of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof SubLSymbol);
						} else
							Assert.fail((String) null);
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testTermLists() {
		System.out.println();
		String[] testStrings = { "(a b (c d e) 123 456.34 654.34d543 \"asdf\" ?asdf)",
				"a b (c d e) 123 456.34 654.34d543 \"asdf\" ?asdf", "()", "nil", "t", "() nil t",
				"(a) (b c) (d (e f (g)))" };
		String[] testsThatShouldFail = { "(", ")", "\"", ",", "#" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.termList(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0)
							Assert.assertNotNull(result);
						else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testTerms() {
		System.out.println();
		String[] testStrings = { "?X", "?XX", "?X-X", "?ABC-234", "?ABC-ABC", "?UIO-123-UIO", "??X", "??XX", "??X-X",
				"??ABC-234", "??ABC-ABC", "??UIO-123-UIO", "?a", "True", "False", "and", "or", "xor", "not", "equiv",
				"implies", "forAll", "thereExists", "thereExistExactly", "thereExistAtMost", "thereExistAtLeast", "Dog",
				"Cat", "Collection", "1-TheDigit", "234a2354dsf", "234-", "True", "False", "and", "or", "xor", "not",
				"equiv", "implies", "forAll", "thereExists", "thereExistExactly", "thereExistAtMost",
				"thereExistAtLeast", "Dog", "Cat", "Collection", "3a", "do-all", "do-10-times/w-bindings?",
				"qawerpiouasdf", "SUBLISP:+", "+", "-", "/", "*", ":BLAH", "|SL|:|NIL|", "|NIL|",
				"|Case Sensitive Name|", "SL::|N i L|", "|a\\|a|", "|a\\\\\\|a|", "\"\"", "\"hi\"", "\"HI\"", "\"1\"",
				"\"\n\"", "\"\\n\"", "\"\nhi\n\"", "\"\\\"\"", "\"\t\"", "0", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "001", "1123", "-2123", "-03", "+41234", "54444444444444444", "-9876543210", "+0123456789", "0.0",
				"001.001", "2.12", "3.1e123", "-3.1e-123", "+3.1e+123", "-3.1e+123", "+3.1e1123",
				"+32354235.1234523e+123", "9876543210.1234522", "1123.234234", "3.1d123", "-3.1d-123", "+3.1d+123",
				"-3.1d+123", "+3.1d1123", "+32354235.1234523d+123", "(and)", "(and)", "(and . ?X)", "(and . :X)",
				"(and Dog . ?X)", "(and Cat Dog . ?X)", "(blah)", "(blah)", "(blah . ?X)", "(blah . :X)",
				"(blah Dog . ?X)", "(blah Cat Dog . ?X)", "(hasName Tony \"\\)\")",
				"(predTrivialForJustificationParaphrase ?PRED)",
				"(implies (and (predTrivialForJustificationParaphrase ?PRED) (argN ?PREDICATE 0 ?SENTENCE)) (sentenceTrivialForJustificationParaphrase ?SENTENCE))",
				"(forAll ?X (isa ?X Dog))",
				"(implies (isa? ?INSTANCE Dog) (thereExists ?TYPE (and (isa ?TYPE ?COLLECTION-TYPE) (isa ?INSTANCE ?TYPE))))",
				"(isa ?X Dog)", "(isa \"adsf\" Dog)", "(isa 3.24e34 Dog)", "(not True)", "(not ?X)", "(:X :X :X)",
				"(not (isa ?X Dog))", "(not (not (?Y ?X Dog)))", "((SomeFn Predicate) \"adsf\" Dog)",
				"(isa //asdf asdf jasdf 89234 2lajf02 \n\"/*\" \";\" \"//\"\n?X ;asdfas 230n90 ?.las fqw  \n/*asdf82 ?. aa */Dog)" };
		String[] testsThatShouldFail = { "\"", "'", "#" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: " + curTest);
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.term(true, true);
						if (result == null)
							System.out.println("Output: " + result);
						else
							System.out.println("Output: " + result + " of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof SubLObject);
						} else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void testUnusualSpaceRegression() {
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalError("(identity:foo)");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalError(" keyword : foo ");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalError("keyword: foo");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalError("keyword :foo");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalEquals(" :foo", ":foo");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalEquals(" :foo", "    :foo");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalError(": foo");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalEquals("(identity :foo)", ":foo");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalEquals(" ( identity :foo ) ", ":foo");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalEquals("'  a", "'a");
		com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest.testEvalEquals("'  a", "   '   a");
	}

	public void testVectors() {
		System.out.println();
		String[] testStrings = { "#()", "    #(    )   ", "#(1 2 3)", "    #(    1     2    3    )    ", "#(and)",
				"#(and)", "#(and ?X)", "#(and Dog ?X)", "#(blah)", "#(blah)", "#(hasName Tony \"\\)\")",
				"#(predTrivialForJustificationParaphrase ?PRED)",
				"#(implies #(and #(predTrivialForJustificationParaphrase ?PRED) #(argN ?PREDICATE 0 ?SENTENCE)) #(sentenceTrivialForJustificationParaphrase ?SENTENCE))",
				"#(forAll ?X #(isa ?X Dog))",
				"#(implies (isa? ?INSTANCE Dog) (thereExists ?TYPE (and (isa ?TYPE ?COLLECTION-TYPE) (isa ?INSTANCE ?TYPE))))",
				"#(isa ?X Dog)", "#(isa \"adsf\" Dog)", "#(isa 3.24e34 Dog)", "#(not True)", "#(not ?X)", "#(:X :X :X)",
				"#(not #(isa ?X Dog))", "#(not #(not (?Y ?X Dog)))", "#(#(SomeFn Predicate) \"adsf\" Dog)",
				"#(isa //asdf asdf jasdf 89234 2lajf02 \n\"/*\" \";\" \"//\"\n?X ;asdfas 230n90 ?.las fqw  \n/*asdf82 ?. aa */Dog)" };
		String[] testsThatShouldFail = { "", "#(", "#)", "45.023d23", "23", "Dog Cat", "(isa ?X Dog)" };
		Reader reader = null;
		try {
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.println("!!!!!!!!!!!!!!!!! These tests should succeed. !!!!!!!!!!!!!!!!!");
				else {
					System.out.println("!!!!!!!!!!!!!!!!! These tests should fail. !!!!!!!!!!!!!!!!!");
					testStrings = testsThatShouldFail;
				}
				for (int i = 0; i < testStrings.length; ++i)
					try {
						String curTest = testStrings[i];
						System.out.println("Input: '" + curTest + "'.");
						reader = new StringReader(curTest);
						UnitTest.parser.ReInit(reader);
						Object result = UnitTest.parser.vector(true, true);
						if (result == null)
							System.out.println("Output: '" + result + "'.");
						else
							System.out.println("Output: '" + result + "' of type: " + result.getClass() + ".");
						if (j == 0) {
							Assert.assertNotNull(result);
							Assert.assertTrue(result instanceof SubLVector);
						} else
							Assert.fail();
					} catch (AssertionFailedError afe) {
						afe.printStackTrace(System.out);
						throw afe;
					} catch (Throwable e) {
						if (j == 0) {
							e.printStackTrace(System.out);
							Assert.assertNotNull((Object) null);
						} else {
							System.out.println("Output: ");
							e.printStackTrace(System.out);
						}
					} finally {
						System.out.println();
					}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
