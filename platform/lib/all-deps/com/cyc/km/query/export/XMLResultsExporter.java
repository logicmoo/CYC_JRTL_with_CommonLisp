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

import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.baseclient.export.ExportException;
import com.cyc.baseclient.nl.Paraphraser;
import com.cyc.baseclient.nl.Paraphraser.ParaphrasableType;
import com.cyc.kb.Query;
import com.cyc.xml.QueryResult;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.xml.bind.JAXBException;

//import org.opencyc.api.CycAccess;
//import org.opencyc.cycobject.ELMt;
//import org.opencyc.export.ExportException;
//import org.opencyc.inference.InferenceAnswer;
//import org.opencyc.nl.Paraphraser;
//import org.opencyc.nl.Paraphraser.ParaphrasableType;

/**
 * An exporter to output query results in XML. Uses the XML format from
 * {@link com.cyc.xml.QueryResult}.
 *
 * @author baxter
 */
public class XMLResultsExporter extends ResultsExporter {

    /**
     * Construct a new exporter whose output will go to the specified writer.
     *
     * @param printWriter
     */
    public XMLResultsExporter(PrintWriter printWriter) throws JAXBException {
        super(new PrintWriter(printWriter));
        marshaller = new QueryResultMarshaller();
    }

    /**
     * Construct a new exporter whose output will go to the specified stream.
     *
     * @param printStream
     */
    public XMLResultsExporter(PrintStream printStream) throws JAXBException {
        this(new PrintWriter(printStream));
    }

    /**
     *
     */
    public XMLResultsExporter() throws JAXBException {
        super();
        marshaller = new QueryResultMarshaller();
    }

    @Override
    protected void initializeState(Query object) throws ExportException {
        super.initializeState(object);
        try {
          CycAccessManager.get().setCurrentAccess(object.getCycAccess());
            final ELMt queryMt = object.getContext().asELMt();
            termParaphraser.setDomainMt(queryMt);
            sentenceParaphraser.setDomainMt(queryMt);
            queryResult = new QueryResultFromQuery(getQuery(), termParaphraser);
        } catch (Exception ex) {
            throw new ExportException("Failed to initialize exporter.", ex);
        }
    }

    @Override
    protected void finalizeState() throws ExportException {
        try {
            marshaller.marshal(queryResult, getPrintWriter());
        } catch (Exception ex) {
            throw new ExportException("Caught exception marshalling query result.", ex);
        } finally {
            super.finalizeState();
        }
    }

    private Query getQuery() {
        return object;
    }
    private final QueryResultMarshaller marshaller;
    private QueryResultFromQuery queryResult;
    private Paraphraser<Object> termParaphraser = Paraphraser.getInstance(ParaphrasableType.DEFAULT);
    private Paraphraser sentenceParaphraser = Paraphraser.getInstance(ParaphrasableType.FORMULA);

    @Override
    protected void printAnswer(InferenceAnswer answer) throws ExportException {
        queryResult.addAnswer(answer);
    }

    public void setTermParaphraser(Paraphraser<Object> paraphraser) {
        this.termParaphraser = paraphraser;
    }

    public Paraphraser<Object> getTermParaphraser() {
        return termParaphraser;
    }
}
