package org.logicmoo.system;

public class ServerTerminal {
	static int[] negotiate = new int[] { 255, 253, 34, /* IAC DO LINEMODE */
			255, 250, 34, 1, 0, 255, 240, /* IAC SB LINEMODE MODE 0 IAC SE */
			255, 251, 1, /* IAC WILL ECHO */ };

}
