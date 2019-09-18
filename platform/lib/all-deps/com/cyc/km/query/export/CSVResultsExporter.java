/*
 */
package com.cyc.km.query.export;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.baseclient.export.ExportException;
import com.cyc.kb.Query;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

//import org.opencyc.cycobject.CycVariable;
//import org.opencyc.export.ExportException;
//import org.opencyc.inference.InferenceAnswer;

/**
 * Exports query results in Comma-Separated-Values format
 * @author baxter
 */
public class CSVResultsExporter extends ResultsExporter {

  private static final String DOUBLE_QUOTE = "\"\"";
  private static final String QUOTE = "\"";

  /**
   * Construct a new exporter whose output will go to the specified stream.
   * @param printStream
   */
  public CSVResultsExporter(PrintStream printStream) {
    super(printStream);
  }

  /**
   *
   * @return the delimiter character.
   */
  protected char getDelimiterChar() {
    return ',';
  }

  @Override
  protected void printHeader() throws ExportException, CycConnectionException {
    final RowPrinter printer = new RowPrinter() {

      @Override
      String stringForVar(CycVariableI var) throws ExportException, CycConnectionException {
        return var.getName();
      }
    };
    printer.printRow();
  }

  @Override
  protected void finalizeState() throws ExportException {
    super.finalizeState();
    vars.clear();
  }

  @Override
  protected void initializeState(Query object) throws ExportException {
    super.initializeState(object);
    vars.addAll(object.getQueryVariablesCyc());
  }

  @Override
  protected void printAnswer(final InferenceAnswer answer) throws CycConnectionException, ExportException {
    final RowPrinter printer = new RowPrinter() {

      @Override
      String stringForVar(CycVariableI var) throws CycConnectionException {
        return answer.getBinding(var).toString();
      }
    };
    printer.printRow();
  }

  private abstract class RowPrinter {

    private void printRow() throws CycConnectionException, ExportException {
      boolean started = false;
      for (final CycVariableI var : vars) {
        try {
          if (started) {
            append(getDelimiterChar());
          }
          started = true;
          append(encodeString(stringForVar(var)));
        } catch (IOException ex) {
          throw new ExportException("Caught exception printing " + var, ex);
        }
      }
      println();
    }

    abstract String stringForVar(CycVariableI var) throws CycConnectionException, ExportException;
  }

  private String encodeString(final String rawString) {
    String result = escapeQuotes(rawString);
    if (mustQuote(result)) {
      result = QUOTE + result + QUOTE;
    }
    return result;
  }

  private boolean mustQuote(String string) {
    return string.indexOf(QUOTE) >= 0
            || string.indexOf(getDelimiterChar()) >= 0;
  }

  static private String escapeQuotes(String rawString) {
    return rawString.replace(QUOTE, DOUBLE_QUOTE);
  }
  final private List<CycVariableI> vars = new ArrayList<CycVariableI>();
}
