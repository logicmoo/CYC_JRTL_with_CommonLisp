/*
 * Test for ResultsExporter class.
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
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.baseclient.export.ExportException;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.kb.Query;

import static com.cyc.kb.TestUtils.*;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.*;

import static org.junit.Assert.*;

/**
 *
 * @author baxter
 */
public class ResultsExporterTest {

  private Query query = null;

  public ResultsExporterTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
    ensureConstantsInitialized();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
    if (query != null) {
      query.close();
    }
  }

  @Test
  public void testExport() {
    System.out.println("\ntestExport");
    final ResultsExporter exporter = new TestResultsExporter(System.out);
    exportOneQuery(exporter, birdsWithTypes);
  }

  @Test
  public void testCSVExport() {
    System.out.println("\ntestCSVExport");
    final ResultsExporter exporter = new CSVResultsExporter(
            System.out);
    final String result = exportOneQuery(exporter, birdsWithTypes);
    assertFalse(result.isEmpty());
    assertTrue(result.contains(","));
  }

  @Test
  public void testXMLExport() throws Exception {
    System.out.println("\ntestXMLExport");
    final ResultsExporter exporter = new XMLResultsExporter();
    final String xmlString = exportOneQuery(exporter, xIsaBird);
    assertFalse(xmlString.isEmpty());
  }

  @Test
  public void testXMLExport2Var() throws Exception {
    System.out.println("\ntestXMLExport2Var");
    final ResultsExporter exporter = new XMLResultsExporter(System.out);
    final String xmlString = exportOneQuery(exporter, birdsWithTypes);
    assertFalse(xmlString.isEmpty());
  }

  private String exportOneQuery(
          final com.cyc.km.query.export.ResultsExporter exporter,
          FormulaSentence sentence) {
    query = new Query(sentence, INFERENCE_PSC, new DefaultInferenceParameters(cyc));
    query.retainInference();
    try {
      return exporter.exportToString(query);
    } catch (ExportException ex) {
      ex.printStackTrace(System.err);
      fail("Got export exception exporting test query.");
    }
    return null;
  }

  private class TestResultsExporter extends ResultsExporter {

    public TestResultsExporter(PrintStream printStream) {
      super(new PrintWriter(printStream));
    }

    @Override
    protected void heraldEndOfAnswers() {
      println("Done printing answers.");
    }

    @Override
    protected void heraldStartOfAnswers() {
      try {
        println("Got " + object.getAnswerCount() + " answers.");
      } catch (CycConnectionException ex) {
        Logger.getLogger(ResultsExporterTest.class.getName()).log(Level.SEVERE,
                null, ex);
      }
    }

    @Override
    protected void printFooter() {
      println("...and that's your query results!");
    }

    @Override
    protected void printHeader() {
      println("Here's your query results:");
    }

    @Override
    protected void printQueryData() {
      println("CycL: " + object.getQuerySentenceCyc());
      println("Context: " + object.getContext());
      println("Status: " + object.getStatus());
    }

    @Override
    protected void printAnswer(InferenceAnswer answer) throws ExportException, CycConnectionException {
      println(" " + answer.getAnswerID() + ": " + answer.getBinding(X));
    }
  }
}
