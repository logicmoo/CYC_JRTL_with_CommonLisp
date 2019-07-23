/* For LarKC */
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

import org.logicmoo.system.SystemCurrent;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.ReaderUtilities;
import com.cyc.tool.subl.util.SubLCommandHistory;
import com.cyc.tool.subl.util.SubLCommandHistoryItem;

public class SubLReader {
	public SubLReader() {
		this(true, SystemCurrent.in, SystemCurrent.out);
	}

	public SubLReader(boolean quitOnExit, InputStream is, OutputStream os) {
	        
		shouldReadloopExit = false;
		history = new SubLCommandHistory();
		historyCount = 1;
		isBusy = false;
		if (!(is instanceof BufferedInputStream))
			is = new BufferedInputStream(is);
		SystemCurrent.setIn(is);
		PrintStream ps = null;
		if (os instanceof PrintStream)
			ps = (PrintStream) os;
		else
			ps = new PrintStream(os, true);
		SystemCurrent.setOut(ps);
		SystemCurrent.setErr(ps);
		SubLOutputTextStream standardOutputStream = SubLStreamFactory.makeOutputTextStream(SystemCurrent.out);
		SubLInputTextStream inputTextStream = SubLStreamFactory.makeInputTextStream(SystemCurrent.in);
		inputStream = inputTextStream;
		SubLInputTextStream standardInputStream = inputTextStream;
		SubLInOutTextStream ioStream = SubLStreamFactory.makeInOutTextStream(standardInputStream, standardOutputStream);
		SubLObjectFactory.makeSublispSymbol("*TERMINAL-IO*").setValue(ioStream);
		reader = new BufferedReader(new InputStreamReader(is));
		writer = new PrintWriter(os, false);
		this.quitOnExit = quitOnExit;
	}

	public static void main(String[] args) {
	}

	static synchronized void addRestartChoices(List<String> choices) {
		SubLList cur;
		for (SubLList restarts = cur = Errors.$restarts$.getValue()
				.toList(); cur != SubLNil.NIL; cur = (SubLList) cur.rest()) {
			SubLList restart = cur.first().toList();
			if (restart.size() < 2)
				Errors.error("Unable to parse *restarts*.");
			SubLString formatString = restart.second().toStr();
			SubLList args = restart.cddr().toList();
			String choice = PrintLow.format(SubLNil.NIL, formatString, args.toSubLObjectArray()).getStringValue();
			choices.add(choice);
		}
	}

	static synchronized void throwToRestartChoiceTag(int restartIndex) {
		SubLList restarts = Errors.$restarts$.getValue().toList();
		SubLSymbol tag = restarts.get(restartIndex).first().toSymbol();
		CatchableThrow.throwToCatch(tag, SubLNil.NIL, true);
	}

	private BufferedReader reader;
	private PrintWriter writer;
	public boolean quitOnExit;
	public boolean shouldReadloopExit;
	private SubLCommandHistory history;
	private int historyCount;
	private boolean isBusy;
	private SubLInputTextStream inputStream;
	private SubLThread thread;
	private SubLObject result;
	public static Errors.RestartMethod CONTINUE_RESTART_METHOD;
	static {
		CONTINUE_RESTART_METHOD = new Errors.RestartMethod() {
			@Override
			public boolean process(SubLReader reader, String message, SubLException se) {
				return false;
			}
		};
	}

	private void maintainStar(SubLObject latestResult) {
		SubLSpecialOperatorDeclarations.tripleStar
				.setDynamicValue(SubLSpecialOperatorDeclarations.doubleStar.getValue());
		SubLSpecialOperatorDeclarations.doubleStar.setDynamicValue(SubLSpecialOperatorDeclarations.star.getValue());
		SubLSpecialOperatorDeclarations.star.setDynamicValue(latestResult);
	}

	private String readLine() {
		String line = "";
		try {
			line = reader.readLine();
		} catch (Exception ioe) {
			Errors.cerror("Continue.", "Failed to read from stream in readloop.", ioe);
		}
		return line;
	}

	private String readStatement() {
		String statement = "";
		while (!ReaderUtilities.shouldProcessSubLStatementNow(statement)) {
			String fragment = readLine();
			if (fragment == null)
				return "(quit)";
			if (statement.length() > 0)
				statement = statement + "\n" + fragment;
			else
				statement = fragment;
		}
		return statement;
	}

	public int askMultiChoiceQuestion(String header, List<String> choices, String prompt, String optionsStr,
			SubLOutputTextStream out) {
		if (!isInReaderThread())
			throw new RuntimeException("Unable to ask multichoice question from alternate thread.");
		clearInput();
		multiChoiceWrite("", out);
		multiChoiceWrite(header, out);
		multiChoiceWrite(optionsStr, out);
		int choiceNum = 1;
		for (String choice : choices)
			multiChoiceWrite("    " + choiceNum++ + ": " + choice, out);
		int result = -1;
		boolean isFirstTime = true;
		while (result < 1 || result > choices.size()) {
			multiChoiceWritePrompt("    " + prompt, out);
			String statement = readLine();
			statement = statement.trim();
			if (statement.startsWith(":")) {
				int loc = statement.indexOf(" ");
				if (loc < 0) {
					multiChoiceWrite("", out);
					multiChoiceWrite("    Expected integer (1 to " + choices.size() + ") but got: " + statement, out);
					continue;
				}
				statement = statement.substring(loc + 1);
			}
			try {
				result = Integer.parseInt(statement);
				if (result >= 1 && result <= choices.size())
					continue;
				multiChoiceWrite("", out);
				multiChoiceWrite("    Expected integer (1 to " + choices.size() + ") but got: " + statement, out);
			} catch (Exception e) {
				multiChoiceWrite("", out);
				multiChoiceWrite("    Expected integer (1 to " + choices.size() + ") but got: " + statement, out);
			}
		}
		return result;
	}

	public Errors.RestartMethod askRestartChoiceQuestion(String message, String continueString,
			List<Errors.Restarter> restarters, boolean addConfigurableRestarters, SubLException se) {
		SubLReader reader = SubLMain.getMainReader();
		if (!reader.isInReaderThread())
			Errors.error(message);
		final int initialCount;
		boolean hasContinueChoice = (initialCount = continueString != null ? 1 : 0) != 0;
		List<String> choices = new ArrayList<String>();
		if (hasContinueChoice)
			choices.add(continueString);
		if (addConfigurableRestarters)
			addRestartChoices(choices);
		int restartsCount = choices.size() - initialCount;
		for (Errors.Restarter restarter : restarters)
			choices.add(restarter.toString());
		final int result = reader.askMultiChoiceQuestion(message, choices, "? ", "Restart options:",
				StreamsLow.$error_output$.getDynamicValue().toOutputTextStream());
		if (hasContinueChoice & result == initialCount)
			return SubLReader.CONTINUE_RESTART_METHOD;
		if (result > initialCount && result <= restartsCount + initialCount)
			return new Errors.RestartMethod() {
				@Override
				public boolean process(SubLReader reader, String message, SubLException se) {
					SubLReader.throwToRestartChoiceTag(result - 1 - initialCount);
					Errors.error("Unexpected situation.");
					return false;
				}
			};
		if (result > initialCount && result <= choices.size()) {
			int index = result - restartsCount - 1 - initialCount;
			return restarters.get(index).getRestartMethod();
		}
		Errors.error("Unexpected situation.");
		return null;
	}

	public void clearInput() {
	}

	public void doReadLoop() {
		setThread(SubLProcess.currentSubLThread());
		SubLEnvironment env = SubLEnvironment.currentEnvironment();
		String statement = "";
		SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
		Throwable lastException = null;
		while (!shouldReadloopExit())
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

				final String packageName = env.getCurrentPackage().getName();
				SubLCommandHistoryItem historyItem = new SubLCommandHistoryItem(historyCount++,
						packageName);
				history.add(historyItem);
				writePrompt(historyItem.getCommandPrompt());
				streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue());
				statement = getNextSubLStatementToProcess();
				historyItem.setCommand(statement);
				writeCommand(historyItem.getCommand());
				String command = historyItem.getCommand();
				SubLString commandTyped = SubLObjectFactory.makeString(command);
				SubLObject form = com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string(commandTyped,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				long startTime = System.nanoTime();
				setIsBusy(true);
				SubLList resultValues = Values.multiple_value_list_eval(form, env);
				long evalTime = System.nanoTime() - startTime;
				result = resultValues.first();
				historyItem.setResultValues(resultValues, evalTime);
				streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue());
				writeResults(historyItem.getResultsString());
				streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue());
				maintainStar(result);
			} catch (ResumeException re) {
				writeResults("[ Resuming via jump to top level read loop... ]");
			} catch (SubLProcess.TerminationRequest tr) {
				shouldReadloopExit = true;
			} catch (org.armedbear.lisp.ProcessingTerminated tr) {
				shouldReadloopExit = true;
		    } catch (SubLException e) {
				lastException = e;
			} catch (Exception e2) {
				lastException = e2;
			} catch (StackOverflowError e3) {
				lastException = e3;
			} catch (AssertionError e4) {
				lastException = e4;
			} finally {
				setIsBusy(false);
			}
		SystemCurrent.out.println("Exiting SubL read loop...\n");
		SystemCurrent.out.println("quitOnExit = " + quitOnExit);
		if (quitOnExit)
			SubLMain.me.doSystemCleanupAndExit(0);
	}

	public synchronized void exitReadloop() {
		shouldReadloopExit = true;
	}

	public String getNextSubLStatementToProcess() {
		String statement = "";
		statement = readStatement();
		return statement;
	}

	public SubLThread getThread() {
		return thread;
	}

	public boolean isBusy() {
		return isBusy;
	}

	public boolean isInReaderThread() {
		return SubLProcess.currentSubLThread() == getThread();
	}

	public void multiChoiceWrite(String message, SubLOutputTextStream out) {
		writeResults(message);
	}

	public void multiChoiceWritePrompt(String prompt, SubLOutputTextStream out) {
		writePrompt(prompt);
	}

	public synchronized boolean shouldReadloopExit() {
		return shouldReadloopExit;
	}

	public void showStackTrace(Throwable e) {
		PrintLow.format(StreamsLow.$error_output$.getDynamicValue().toOutputTextStream(),
				SubLObjectFactory.makeString(SubLException.getStringForException(e)));
		StreamsLow.$error_output$.getDynamicValue().toOutputTextStream().flush();
	}

	public void writeCommand(String command) {
		SystemCurrent.out.flush();
		writer.flush();
	}

	public void writePrompt(String prompt) {
		SystemCurrent.out.print(prompt);
		SystemCurrent.out.flush();
		writer.flush();
	}

	public void writeResults(String results) {
		if (!shouldReadloopExit()) {
			SystemCurrent.out.println(results);
			writer.flush();
		}
	}

	public void writeResultValues(SubLList resultValues) {
		if (!shouldReadloopExit()) {
			SubLObject val = SubLNil.NIL;
			val = conses_high.first(resultValues);
			while (SubLNil.NIL == Types.sublisp_null(resultValues)) {
				SystemCurrent.out.println("" + val);
				resultValues = (SubLList) conses_high.rest(resultValues);
				val = conses_high.first(resultValues);
			}
			writer.flush();
		}
	}

	protected void setIsBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

	public void setThread(SubLThread thread) {
		this.thread = thread;
	}
}
