/*
 * Class for exporting query results.
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
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.baseclient.export.ExportException;
import com.cyc.baseclient.export.PrintWriterExporter;
import com.cyc.kb.Query;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

//import org.opencyc.export.ExportException;
//import org.opencyc.export.PrintWriterExporter;
//import org.opencyc.inference.InferenceAnswer;

/**
 *
 * @author baxter
 */
public abstract class ResultsExporter extends PrintWriterExporter<Query> {

    /**
     *
     */
    public ResultsExporter() {
        super();
    }

    public ResultsExporter(PrintWriter printWriter) {
        super(printWriter);
    }

    public ResultsExporter(PrintStream printStream) {
        super(printStream);
    }

    @Override
    final protected void doExport() throws ExportException {
        try {
            printHeader();
            printQueryData();
            printAnswers(object.getAnswers());
            printFooter();
            finishExport();
        } catch (Exception e) {
            throw new ExportException("Caught exception while exporting " + object, e);
        }
    }

    /**
     * Print any data that goes at the beginning of the export.
     *
     * @throws ExportException
     */
    protected void printHeader() throws ExportException, CycConnectionException {
    }

    /**
     * Print any data that goes at the end of the export.
     *
     * @throws ExportException
     */
    protected void printFooter() throws ExportException {
    }

    /**
     * Print data about the query itself.
     *
     * @throws ExportException
     */
    protected void printQueryData() throws ExportException {
    }

    /**
     * Export the answers of the query.
     *
     * @param answers
     * @throws ExportException
     * @throws CycConnectionException 
     */
    final protected void printAnswers(List<InferenceAnswer> answers) throws CycConnectionException, ExportException {
        heraldStartOfAnswers();
        for (final InferenceAnswer answer : answers) {
            printAnswer(answer);
        }
        heraldEndOfAnswers();
    }

    /**
     * Print something right before printing all the answer data.
     */
    protected void heraldStartOfAnswers() {
    }

    /**
     * Print one answer
     *
     * @param answer the answer
     * @throws ExportException
     */
    protected abstract void printAnswer(InferenceAnswer answer) throws CycConnectionException, ExportException;

    /**
     * Print something right after printing all the answer data.
     */
    protected void heraldEndOfAnswers() {
    }

    /**
     * After we've printed everything, finish things up.
     *
     * @throws ExportException
     */
    protected void finishExport() throws ExportException {
    }
}
