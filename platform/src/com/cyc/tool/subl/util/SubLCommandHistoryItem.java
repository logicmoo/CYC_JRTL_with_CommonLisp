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

package com.cyc.tool.subl.util;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
//// External Imports
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public class SubLCommandHistoryItem {

	//// Constructors

	private static boolean SHOW_TIMES = true;

	//// Public Area

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	private String command = "";

	private String results = "";

	private int historyNum;

	private String packageName;

	private long evalTimeMSecs;

	/** Creates a new instance of SubLCommandHistoryItem. */
	public SubLCommandHistoryItem(int historyNum, String packageName) {
		this.historyNum = historyNum;
		this.packageName = packageName;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public String getCommand() {
		return this.command;
	}

	public String getCommandPrompt() {
		return this.packageName + "(" + this.historyNum + "): ";
	}

	public String getResultsString() {
		StringBuilder buf = new StringBuilder();
		if (this.evalTimeMSecs >= 0 && SubLCommandHistoryItem.SHOW_TIMES)
			buf.append("[Time: ").append(this.evalTimeMSecs / 1000.0).append(" secs]\n");
		buf.append(this.results);
		return buf.toString();
	}

	public void setCommand(String command) {
		if (command == null)
			command = "";
		if (!command.endsWith("\n"))
			command += "\n";
		this.command = command;
	}

	public void setResults(String results, long evalTimeMSecs) {
		if (results == null)
			results = "";
		this.results = results;
		this.evalTimeMSecs = evalTimeMSecs;
	}

	public void setResultValues(SubLList resultValues, long evalTimeMSecs) {
		if (resultValues == null)
			resultValues = SubLNil.NIL;

		StringBuilder buf = new StringBuilder();
		SubLObject val = SubLNil.NIL;
		int i = 0;
		for (val = conses_high.first(resultValues); SubLNil.NIL == Types
				.sublisp_null(resultValues); resultValues = (SubLList) conses_high.rest(resultValues), val = conses_high
						.first(resultValues), i++) {
			if (i > 0)
				buf.append("\n");
			buf.append(print_high.prin1_to_string(val).getString());
		}
		this.setResults(buf.toString(), evalTimeMSecs);
	}

	//// Main

	public String toString() {
		String commandPrompt = this.getCommandPrompt();
		String command = this.getCommand();
		String results = this.getResultsString();
		return commandPrompt + command + results;
	}

}
