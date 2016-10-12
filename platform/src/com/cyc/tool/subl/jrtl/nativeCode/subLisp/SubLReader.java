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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.ReaderUtilities;
import com.cyc.tool.subl.util.SubLCommandHistory;
import com.cyc.tool.subl.util.SubLCommandHistoryItem;

//// Internal Imports

//// External Imports

public class SubLReader implements CommonSymbols {

	//// Constructors

	public static Errors.RestartMethod CONTINUE_RESTART_METHOD = new Errors.RestartMethod() {

		public boolean process(SubLReader reader, String message, SubLException se) {
			return false;
		}
	};

	static synchronized void addRestartChoices(List<String> choices) {
		SubLList restarts = Errors.$restarts$.getValue().toList();
		for (SubLList cur = restarts; cur != CommonSymbols.NIL; cur = (SubLList) cur.rest()) {
			SubLList restart = cur.first().toList();
			if (restart.size() < 2)
				Errors.error("Unable to parse *restarts*.");
			SubLString formatString = restart.second().toStr();
			SubLList args = restart.cddr().toList();
			String choice = PrintLow.format(CommonSymbols.NIL, formatString, args.toSubLObjectArray()).getString();
			choices.add(choice);
		}
	}

	//// Public Area

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	static synchronized void throwToRestartChoiceTag(int restartIndex) {
		SubLList restarts = Errors.$restarts$.getValue().toList();
		SubLSymbol tag = restarts.get(restartIndex).first().toSymbol();
		CatchableThrow.throwToCatch(tag);
	}

	private BufferedReader reader;

	private PrintWriter writer;

	private boolean quitOnExit;

	private boolean shouldReadloopExit = false;

	private SubLCommandHistory history = new SubLCommandHistory();

	private int historyCount = 1;

	private boolean isBusy = false;

	private SubLInputTextStream inputStream;

	private SubLThread thread;

	/** Creates a new instance of SubLReader. */
	public SubLReader() {
		this(true, System.in, System.out);
	}

	/** Creates a new instance of SubLReader. */
	public SubLReader(boolean quitOnExit, InputStream is, OutputStream os) {
		// @hack following code assumes only 1 reader per image -APB
		/*
		 * if (!(os instanceof BufferedOutputStream)) { os = new
		 * BufferedOutputStream(os); }
		 */
		if (!(is instanceof BufferedInputStream))
			is = new BufferedInputStream(is);
		System.setIn(is);
		PrintStream ps = null;
		if (os instanceof PrintStream)
			ps = (PrintStream) os;
		else
			ps = new PrintStream(os, true);
		System.setOut(ps);
		System.setErr(ps);

		SubLOutputTextStream standardOutputStream = SubLStreamFactory.makeOutputTextStream(System.out);
		SubLInputTextStream standardInputStream = this.inputStream = SubLStreamFactory.makeInputTextStream(System.in);
		SubLInOutTextStream ioStream = SubLStreamFactory.makeInOutTextStream(standardInputStream, standardOutputStream);
		SubLObjectFactory.makeSublispSymbol("*TERMINAL-IO*").setValue(ioStream);

		// end hack
		this.reader = new BufferedReader(new InputStreamReader(is));
		this.writer = new PrintWriter(os, false);
		this.quitOnExit = quitOnExit;
	}

	public int askMultiChoiceQuestion(String header, List<String> choices, String prompt, String optionsStr,
			SubLOutputTextStream out) {
		if (!this.isInReaderThread())
			throw new RuntimeException("Unable to ask multichoice question from alternate thread.");
		this.clearInput();
		this.multiChoiceWrite("", out);
		this.multiChoiceWrite(header, out);
		this.multiChoiceWrite(optionsStr, out);
		int choiceNum = 1;
		for (String choice : choices)
			this.multiChoiceWrite("    " + choiceNum++ + ": " + choice, out);
		int result = -1;
		boolean isFirstTime = true;
		while (result < 1 || result > choices.size()) {
			this.multiChoiceWritePrompt("    " + prompt, out);
			String statement = this.readLine();
			statement = statement.trim();
			if (statement.startsWith(":")) {
				int loc = statement.indexOf(" ");
				if (loc < 0) {
					this.multiChoiceWrite("", out);
					this.multiChoiceWrite("    Expected integer (1 to " + choices.size() + ") but got: " + statement,
							out);
					continue;
				} else
					statement = statement.substring(loc + 1);
			}
			try {
				result = Integer.parseInt(statement);
				if (result < 1 || result > choices.size()) {
					this.multiChoiceWrite("", out);
					this.multiChoiceWrite("    Expected integer (1 to " + choices.size() + ") but got: " + statement,
							out);
					continue;
				}
			} catch (Exception e) {
				this.multiChoiceWrite("", out);
				this.multiChoiceWrite("    Expected integer (1 to " + choices.size() + ") but got: " + statement, out);
				continue;
			}
		}
		return result;
	}

	public Errors.RestartMethod askRestartChoiceQuestion(String message, String continueString,
			List<Errors.Restarter> restarters, boolean addConfigurableRestarters, SubLException se) {
		SubLReader reader = SubLMain.getMainReader();
		if (!reader.isInReaderThread())
			Errors.error(message);
		boolean hasContinueChoice = continueString != null;
		final int initialCount = hasContinueChoice ? 1 : 0;
		List<String> choices = new ArrayList<String>();
		if (hasContinueChoice)
			choices.add(continueString); // add continue choice if available
		if (addConfigurableRestarters)
			SubLReader.addRestartChoices(choices); // add configurable restart
													// choices
		int restartsCount = choices.size() - initialCount;
		for (Errors.Restarter restarter : restarters)
			// choices
			choices.add(restarter.toString());
		final int result = reader.askMultiChoiceQuestion(message, choices, "? ", "Restart options:",
				StreamsLow.$error_output$.toOutputTextStream());
		if (hasContinueChoice & result == initialCount)
			// choice
			return SubLReader.CONTINUE_RESTART_METHOD;
		else if (result > initialCount && result <= restartsCount + initialCount)
			// configurable
			// restart
			// choice
			return new Errors.RestartMethod() {

				public boolean process(SubLReader reader, String message, SubLException se) {
					SubLReader.throwToRestartChoiceTag(result - 1 - initialCount);
					Errors.error("Unexpected situation.");
					return false;
				}
			};
		else if (result > initialCount && result <= choices.size()) { // handle
																		// given
																		// restart
																		// choice
			int index = result - restartsCount - 1 - initialCount;
			return restarters.get(index).getRestartMethod();
		}
		Errors.error("Unexpected situation.");
		return null;
	}

	public void clearInput() {
		; // @todo implement me!!!!!!!!!!!!
	}

	public void doReadLoop() {
		this.setThread(SubLProcess.currentSubLThread());
		SubLEnvironment env = SubLEnvironment.currentEnvironment();
		SubLObject form;
		SubLCommandHistoryItem historyItem;
		SubLList resultValues;
		SubLObject result;
		String statement = "";
		SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
		Exception lastException = null;
		while (!this.shouldReadloopExit())
			try {
				if (lastException != null)
					try {
						Errors.handleError(lastException instanceof SubLException ? lastException.getMessage()
								: lastException.toString() + "\nWhile processing readloop statement \n        "
										+ statement + "",
								lastException);
					} finally {
						lastException = null;
					}
				historyItem = new SubLCommandHistoryItem(this.historyCount++, env.getCurrentPackage().getName());
				this.history.add(historyItem);
				this.writePrompt(historyItem.getCommandPrompt());
				streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue());
				historyItem.setCommand(statement = this.getNextSubLStatementToProcess());
				this.writeCommand(historyItem.getCommand());
				String command = historyItem.getCommand();
				SubLString commandTyped = SubLObjectFactory.makeString(command);
				form = com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string(commandTyped,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				// @Note use System.nanoTime() when we switch to Java 1.5 -APB
				long startTime = System.currentTimeMillis();
				this.setIsBusy(true);
				resultValues = Values.multiple_value_list_eval(form, env);
				long evalTime = System.currentTimeMillis() - startTime;
				result = resultValues.first();
				historyItem.setResultValues(resultValues, evalTime);
				streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue());
				this.writeResults(historyItem.getResultsString());
				streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue());
				this.maintainStar(result);
			} catch (ResumeException re) {
				this.writeResults("[ Resuming via jump to top level read loop... ]");
			} catch (SubLProcess.TerminationRequest tr) { // @hack
				; // ignore
			} catch (SubLException e) {
				lastException = e;
			} catch (Exception e) {
				lastException = e;
			} finally {
				this.setIsBusy(false);
			}
		System.out.println("Exiting SubL read loop..." + "\n");
		if (this.quitOnExit)
			SubLMain.me.doSystemCleanupAndExit(0);
	}

	public synchronized void exitReadloop() {
		this.shouldReadloopExit = true;
	}

	//// Protected Area

	public String getNextSubLStatementToProcess() {
		String statement = "";
		statement = this.readStatement();
		return statement;
	}

	public SubLThread getThread() {
		return this.thread;
	}

	public boolean isBusy() {
		return this.isBusy;
	}

	//// Private Area

	public boolean isInReaderThread() {
		return SubLProcess.currentSubLThread() == this.getThread();
	}

	/*
	 * public static SubLObject read_line(SubLObject stream, SubLObject
	 * eof_error_p, SubLObject eof_value, SubLObject recursive_p) { if (stream
	 * == UNPROVIDED) { stream = StreamsLow.$standard_input$.getValue(); } if
	 * (eof_error_p == UNPROVIDED) { eof_error_p = T; } if (eof_value ==
	 * UNPROVIDED) { eof_value = NIL; } SubLInputTextStream streamTyped =
	 * stream.toInputTextStream(); StringBuilder buf = new StringBuilder(256);
	 * String eolChars = streamTyped.getNewline(); int eolCharsSize =
	 * eolChars.length(); int currentChar = 0, i, j; boolean isEOL = false;
	 * while (currentChar != streams_high.EOF_CHAR) { // EOF currentChar =
	 * streamTyped.readChar(); if (currentChar == streams_high.EOF_CHAR) {
	 * break; } if (currentChar != streams_high.EOF_CHAR) {
	 * buf.append((char)currentChar); } isEOL = true; for (i = buf.length()-1, j
	 * = eolCharsSize-1; (j >= 0) && (i >= 0); i--, j--) { if (buf.charAt(i) !=
	 * eolChars.charAt(j)) { isEOL = false; } } isEOL = isEOL && (j < 0); if
	 * (isEOL) { break; } } if ((buf.length() <= 0) && (currentChar ==
	 * streams_high.EOF_CHAR)) { // EOF if (eof_error_p != NIL) {
	 * //reader.end_of_file_error(stream); } return Values.values(eof_value, T);
	 * } String result = isEOL ? buf.substring(0, buf.length() - eolCharsSize) :
	 * buf.toString(); return
	 * Values.values(SubLObjectFactory.makeString(result),
	 * SubLObjectFactory.makeBoolean(currentChar == streams_high.EOF_CHAR)); }
	 */

	private void maintainStar(SubLObject latestResult) {
		SubLSpecialOperatorDeclarations.tripleStar
				.setDynamicValue(SubLSpecialOperatorDeclarations.doubleStar.getValue());
		SubLSpecialOperatorDeclarations.doubleStar.setDynamicValue(SubLSpecialOperatorDeclarations.star.getValue());
		SubLSpecialOperatorDeclarations.star.setDynamicValue(latestResult);
	}

	public void multiChoiceWrite(String message, SubLOutputTextStream out) {
		this.writeResults(message);
		// PrintLow.format(out, SubLObjectFactory.makeString(message + "\n"));
		// out.flush();
	}

	public void multiChoiceWritePrompt(String prompt, SubLOutputTextStream out) {
		this.writePrompt(prompt);
		// PrintLow.format(out, SubLObjectFactory.makeString(prompt));
		// out.flush();
	}

	//// Internal Rep

	private String readLine() {
		String line = "";
		try {
			// line = read_line(inputStream, UNPROVIDED, UNPROVIDED,
			// UNPROVIDED).getString();
			line = this.reader.readLine();
		} catch (Exception ioe) {
			Errors.cerror("Continue.", "Failed to read from stream in readloop.", ioe);
		}
		return line;
	}

	private String readStatement() {
		String statement = this.readLine();
		do {
			if (ReaderUtilities.shouldProcessSubLStatementNow(statement))
				return statement;
			statement += "\n" + this.readLine();
		} while (true);
	}

	protected void setIsBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

	void setThread(SubLThread thread) {
		this.thread = thread;
	}

	public synchronized boolean shouldReadloopExit() {
		return this.shouldReadloopExit;
	}

	public void showStackTrace(Throwable e) {
		PrintLow.format(StreamsLow.$error_output$.toOutputTextStream(),
				SubLObjectFactory.makeString(SubLException.getStringForException(e)));
		StreamsLow.$error_output$.toOutputTextStream().flush();
	}

	public void writeCommand(String command) {
		System.out.flush();
		this.writer.flush();
	}

	public void writePrompt(String prompt) {
		System.out.print(prompt);
		System.out.flush();
		this.writer.flush();
	}

	public void writeResults(String results) {
		if (!this.shouldReadloopExit()) {
			System.out.println(results);
			this.writer.flush();
		}
	}

	//// Main

	public void writeResultValues(SubLList resultValues) {
		if (!this.shouldReadloopExit()) {
			SubLObject val = CommonSymbols.NIL;
			for (val = conses_high.first(resultValues); CommonSymbols.NIL == Types.sublisp_null(
					resultValues); resultValues = (SubLList) conses_high.rest(resultValues), val = conses_high
							.first(resultValues))
				System.out.println("" + val);
			this.writer.flush();
		}
	}

}
