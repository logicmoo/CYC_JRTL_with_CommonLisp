/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.xml.bind.JAXBException;

import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.cyc.km.query.export.Utils.*;

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.kb.exception.KBApiException;

//import org.opencyc.inference.InferenceAnswer;

/**
 *
 * @author baxter
 */
public class QueryResultMarshallerTest {

  public QueryResultMarshallerTest() {
  }

  @BeforeClass
  public static void setUpClass() 
		  throws IOException, UnknownHostException, JAXBException, KBApiException, CycApiException, CycTimeOutException, CycConnectionException {
    setup();
    queryResult = new QueryResultFromQuery(query);
    for (final InferenceAnswer answer : query.getAnswers()) {
        queryResult.addAnswer(answer);
    }
  }

  @AfterClass
  public static void tearDownClass() {
    teardown();
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }
  private static QueryResultFromQuery queryResult;

  /**
   * Test of marshal method, of class QueryResultMarshaller.
   */
  @Test
  public void testMarshal_QueryResult_Writer() throws Exception {
    System.out.println("\nmarshal to writer");
    final File destination = File.createTempFile("queryResultTest", ".xml");
    System.out.println("Marshaling query result to " + destination);
    assertNotNull("Failed to get query result.", queryResult);
    new QueryResultMarshaller().marshal(queryResult, new FileWriter(destination));
  }

  /**
   * Test of marshal method, of class QueryResultMarshaller.
   */
  @Test
  public void testMarshal_QueryResult_OutputStream() throws Exception {
    System.out.println("\nmarshal to stream");
    assertNotNull("Failed to get query result.", queryResult);
    new QueryResultMarshaller().marshal(queryResult, System.out);
  }

  /**
   * Test round-trip marshalling and unmarshalling.
   */
//  @Test
//  public void testMarshalUnmarshalRoundTrip() throws Exception {
//    System.out.println("\nTest marshal-unmarshal round trip.");
//    final File file1 = File.createTempFile("queryResultTest", ".xml");
//    final QueryResultMarshaller marshaller = new QueryResultMarshaller();
//    marshaller.marshal(queryResult, new FileWriter(file1));
//    final QueryResult queryResult2 = new QueryResultUnmarshaller().unmarshalProofview(new FileInputStream(
//            file1));
//    final File file2 = File.createTempFile("queryResultTest", ".xml");
//    marshaller.marshal(queryResult2, new FileWriter(file2));
//    System.out.println("Marshalled query results to " + file1 + "\n and " + file2);
//    assertEquals("Proof view did not survive marshalling/unmarshalling.",
//            readFile(file1), readFile(file2));
//  }

//  private static String readFile(File file) throws IOException {
//    FileInputStream stream = new FileInputStream(file);
//    try {
//      FileChannel fc = stream.getChannel();
//      MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
//      /* Instead of using default, pass in a decoder. */
//      return Charset.defaultCharset().decode(bb).toString();
//    } finally {
//      stream.close();
//    }
//  }
}
