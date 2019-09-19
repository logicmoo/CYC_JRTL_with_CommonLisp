/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
 * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ***/

package net.wimpi.telnetd.io.terminal;

import java.nio.charset.Charset;

/**
 * Singleton utility class for translating
 * internal color/style markup into ANSI defined
 * escape sequences. It uses a very simple but effective
 * lookup table, and does the job without sophisticated
 * parsing routines. It should therefore perform quite
 * fast.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public final class Colorizer {

	//Constants
	private static final int S = 30; //black
	private static final int s = 40;
	private static final int R = 31; //red
	private static final int r = 41;
	private static final int G = 32; //green
	private static final int g = 42;
	private static final int Y = 33; //yellow
	private static final int y = 43;
	private static final int B = 34; //blue
	private static final int b = 44;
	private static final int M = 35; //magenta
	private static final int m = 45;
	private static final int C = 36; //cyan
	private static final int c = 46;
	private static final int W = 37; //white
	private static final int w = 47;

	private static final int f = 1; /*bold*/

	private static final int d = 22; /*!bold*/ //normal color or normal intensity
	private static final int i = 3; /*italic*/
	private static final int j = 23; /*!italic*/
	private static final int u = 4; /*underlined*/
	private static final int v = 24; /*!underlined*/
	private static final int e = 5; /*blink*/
	private static final int n = 25; /*steady = !blink*/
	private static final int h = 8; /*hide = concealed characters*/
	private static final int a = 0; /*all out*/

	private static int[] c_ColorMapping; //translation table

	/**
	 * Constructs a Colorizer with its translation table.
	 */
	static {

		c_ColorMapping = new int[128];

		c_ColorMapping[83] = S;
		c_ColorMapping[82] = R;
		c_ColorMapping[71] = G;
		c_ColorMapping[89] = Y;
		c_ColorMapping[66] = B;
		c_ColorMapping[77] = M;
		c_ColorMapping[67] = C;
		c_ColorMapping[87] = W;

		c_ColorMapping[115] = s;
		c_ColorMapping[114] = r;
		c_ColorMapping[103] = g;
		c_ColorMapping[121] = y;
		c_ColorMapping[98] = b;
		c_ColorMapping[109] = m;
		c_ColorMapping[99] = c;
		c_ColorMapping[119] = w;

		c_ColorMapping[102] = f;
		c_ColorMapping[100] = d;
		c_ColorMapping[105] = i;
		c_ColorMapping[106] = j;
		c_ColorMapping[117] = u;
		c_ColorMapping[118] = v;
		c_ColorMapping[101] = e;
		c_ColorMapping[110] = n;
		c_ColorMapping[104] = h;
		c_ColorMapping[97] = a;

	}//static initializer

	public int getColor(String color) {
		if (color != null && color.length() == 1) {
			int key = color.charAt(0);
			return c_ColorMapping[key];
		} else {
			return -1;
		}
	}//getColor

	/**
	 * Translates all internal markups within the String
	 * into ANSI Escape sequences.<br>
	 * The method is hooked into BasicTerminalIO.write(String str), so
	 * it is not necessary to call it directly.
	 *
	 * @param str     String with internal color/style markups.
	 * @param support boolean that represents Terminals ability to support GR sequences.
	 *                if false, the internal markups are ripped out of the string.
	 * @return String with ANSI escape sequences (Graphics Rendition), if support is true,
	 *         String without internal markups or ANSI escape sequences if support is false.
	 */
	public static String colorize(String str, boolean support) {
		return colorize(str, support, false);
	}//colorize

	/**
	 * Translates all internal markups within the String
	 * into ANSI Escape sequences.<br>
	 * The method is hooked into BasicTerminalIO.write(String str), so
	 * it is not necessary to call it directly.
	 *
	 * @param str       String with internal color/style markups.
	 * @param support   boolean that represents Terminals ability to support GR sequences.
	 *                  if false, the internal markups are ripped out of the string.
	 * @param forcebold boolean that forces the output to be bold at any time.
	 * @return String with ANSI escape sequences (Graphics Rendition), if support is true,
	 *         String without internal markups or ANSI escape sequences if support is false.
	 */
	public static String colorize(String str, boolean support, boolean forcebold) {

		StringBuffer out = new StringBuffer(str.length() + 20);
		int parsecursor = 0;
		int foundcursor = 0;

		boolean done = false;
		while (!done) {
			foundcursor = str.indexOf(ColorHelper.MARKER_CODE, parsecursor);
			if (foundcursor != -1) {
				out.append(str.substring(parsecursor, foundcursor));
				if (support) {
					out.append(addEscapeSequence(str.substring(foundcursor + 1, foundcursor + 2), forcebold));
				}
				parsecursor = foundcursor + 2;
			} else {
				out.append(str.substring(parsecursor, str.length()));
				done = true;
			}
		}

		/*
		 * This will always add a "reset all" escape sequence
		 * behind the input string.
		 * Basically this is a good idea, because developers tend to
		 * forget writing colored strings properly.
		 */
		if (support)
			out.append(addEscapeSequence("a", false));

		return out.toString();
	}//colorize

	private static String addEscapeSequence(String attribute, boolean forcebold) {

		StringBuffer tmpbuf = new StringBuffer(10);

		byte[] tmpbytes = attribute.getBytes();
		int key = (int) tmpbytes[0];

		tmpbuf.append((char) 27);
		tmpbuf.append((char) 91);
		//tmpbuf.append((new Integer(c_ColorMapping[key])).toString());
		int attr = c_ColorMapping[key];
		tmpbuf.append(attr);
		if (forcebold && attr != f) {
			tmpbuf.append((char) 59);
			tmpbuf.append(f);
		}
		tmpbuf.append((char) 109);

		return tmpbuf.toString();
	}//addEscapeSequence

	/**
	 * Test Harness *
	 */

	private static void announceResult(boolean res) {
		if (res) {
			System.out.println("[#" + testcount + "] ok.");
		} else {
			System.out.println("[#" + testcount + "] failed (see possible StackTrace).");
		}
	}//announceResult

	private static int testcount = 0;

	private static void announceTest(String what) {
		testcount++;
		System.out.println("Test #" + testcount + " [" + what + "]:");
	}//announceTest

	private static void bfcolorTest(String color) {
		System.out.println("->" + colorize(ColorHelper.boldcolorizeText("COLOR", color), true) + "<-");
	}//bfcolorTest

	private static void fcolorTest(String color) {
		System.out.println("->" + colorize(ColorHelper.colorizeText("COLOR", color), true) + "<-");
	}//fcolorTest

	private static void bcolorTest(String color) {
		System.out.println("->" + colorize(ColorHelper.colorizeBackground("     ", color), true) + "<-");
	}//bcolorTest

	/**
	 * Invokes the build in test harness, and will produce styled and colored
	 * output directly on the terminal.
	 */
	public static void main(String[] args) {
		try {
			announceTest("Instantiation");

			announceResult(true);

			announceTest("Textcolor Tests");
			fcolorTest(ColorHelper.BLACK);
			fcolorTest(ColorHelper.RED);
			fcolorTest(ColorHelper.GREEN);
			fcolorTest(ColorHelper.YELLOW);
			fcolorTest(ColorHelper.BLUE);
			fcolorTest(ColorHelper.MAGENTA);
			fcolorTest(ColorHelper.CYAN);
			fcolorTest(ColorHelper.WHITE);
			announceResult(true);

			announceTest("Bold textcolor Tests");
			bfcolorTest(ColorHelper.BLACK);
			bfcolorTest(ColorHelper.RED);
			bfcolorTest(ColorHelper.GREEN);
			bfcolorTest(ColorHelper.YELLOW);
			bfcolorTest(ColorHelper.BLUE);
			bfcolorTest(ColorHelper.MAGENTA);
			bfcolorTest(ColorHelper.CYAN);
			bfcolorTest(ColorHelper.WHITE);
			announceResult(true);

			announceTest("Background Tests");
			bcolorTest(ColorHelper.BLACK);
			bcolorTest(ColorHelper.RED);
			bcolorTest(ColorHelper.GREEN);
			bcolorTest(ColorHelper.YELLOW);
			bcolorTest(ColorHelper.BLUE);
			bcolorTest(ColorHelper.MAGENTA);
			bcolorTest(ColorHelper.CYAN);
			bcolorTest(ColorHelper.WHITE);
			announceResult(true);

			announceTest("Mixed Color Tests");
			System.out.println("->" + colorize(ColorHelper.colorizeText("COLOR", ColorHelper.WHITE, ColorHelper.BLUE), true) + "<-");
			System.out.println("->" + colorize(ColorHelper.colorizeText("COLOR", ColorHelper.YELLOW, ColorHelper.GREEN), true) + "<-");
			System.out.println("->" + colorize(ColorHelper.boldcolorizeText("COLOR", ColorHelper.WHITE, ColorHelper.BLUE), true) + "<-");
			System.out.println("->" + colorize(ColorHelper.boldcolorizeText("COLOR", ColorHelper.YELLOW, ColorHelper.GREEN), true) + "<-");

			announceResult(true);

			announceTest("Style Tests");
			System.out.println("->" + colorize(ColorHelper.boldText("Bold"), true) + "<-");
			System.out.println("->" + colorize(ColorHelper.italicText("Italic"), true) + "<-");
			System.out.println("->" + colorize(ColorHelper.underlinedText("Underlined"), true) + "<-");
			System.out.println("->" + colorize(ColorHelper.blinkingText("Blinking"), true) + "<-");

			announceResult(true);

			announceTest("Mixed Color/Style Tests");
			System.out.println("->" + colorize(ColorHelper.boldText(ColorHelper.colorizeText("RED", ColorHelper.RED, false) + ColorHelper.colorizeText("BLUE", ColorHelper.BLUE, false) + ColorHelper.colorizeText("GREEN", ColorHelper.GREEN, false)), true) + "<-");
			System.out.println("->" + colorize(ColorHelper.boldText(ColorHelper.colorizeBackground("RED", ColorHelper.RED, false) + ColorHelper.colorizeBackground("BLUE", ColorHelper.BLUE, false) + ColorHelper.colorizeBackground("GREEN", ColorHelper.GREEN, false)), true) + "<-");
			System.out.println("->" + colorize(ColorHelper.boldText(ColorHelper.colorizeText("RED", ColorHelper.WHITE, ColorHelper.RED, false) + ColorHelper.colorizeText("BLUE", ColorHelper.WHITE, ColorHelper.BLUE, false) + ColorHelper.colorizeText("GREEN", ColorHelper.WHITE, ColorHelper.GREEN, false)), true) + "<-");

			announceResult(true);

			announceTest("Visible length test");
			String colorized = ColorHelper.boldcolorizeText("STRING", ColorHelper.YELLOW);

			System.out.println("->" + colorize(colorized, true) + "<-");
			System.out.println("Visible length=" + ColorHelper.getVisibleLength(colorized));

			colorized = ColorHelper.boldcolorizeText("BANNER", ColorHelper.WHITE, ColorHelper.BLUE) + ColorHelper.colorizeText("COLOR", ColorHelper.WHITE, ColorHelper.BLUE) + ColorHelper.underlinedText("UNDER");
			System.out.println("->" + colorize(colorized, true) + "<-");
			System.out.println("Visible length=" + ColorHelper.getVisibleLength(colorized));

			announceResult(true);

			System.out.println("Forcing bold");
			System.out.println(Colorizer.colorize(ColorHelper.colorizeText("RED", ColorHelper.RED), true, true));

			String tred = new String(new byte[] { -17, -65, -67, -17, -65, -67, -17, -65, -67, }, Charset.forName("UTF-8"));
			System.out.println(Colorizer.colorize(ColorHelper.colorizeText(tred, ColorHelper.RED), true, true));

		} catch (Exception ex) {
			announceResult(false);
			ex.printStackTrace();
		}
	}//main (test routine)

}//class Colorizer
