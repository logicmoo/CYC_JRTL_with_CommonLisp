/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb;

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

import com.cyc.kb.TestUtils;
import com.cyc.kb.Query;
import com.cyc.kb.QueryReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author baxter
 */
public class QueryReaderTest {

  public QueryReaderTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
    TestUtils.ensureConstantsInitialized();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of queryFromXML method, of class QueryReader.
   */
  @Test
  public void testQueryFromXML() throws Exception {
    System.out.println("queryFromXML");
    InputStream stream = new ByteArrayInputStream(xml.getBytes());
    QueryReader instance = new QueryReader();
    Query query = instance.queryFromXML(stream);
    assertEquals("Wrong context.",
            "(AssistedReaderSourceSpindleCollectorForTaskFn GeneralCycKETask-Allotment)",
            query.getContext().toString());
    assertEquals("Wrong formula.", "(artifactTypeMadeMainlyOfType ?X ?Y ?Z)",
            query.getQuerySentenceCyc().toString());
    assertEquals("Wrong max time.", 60, (Object) query.getMaxTime());
  }
  private static final String xml = "<?xml version=\"1.0\" encoding=\"US-ASCII\" standalone=\"no\"?>"
          + "<cyclQuery xmlns=\"http://www.opencyc.org/xml/cyclQuery/\"><queryID>"
          + "<function reified=\"true\" xmlns=\"http://www.opencyc.org/xml/cycML/\">"
          + " <constant>"
          + "  <guid>8a8a8d13-4760-11db-8fd2-0002b3a85161</guid>"
          + "  <name>QueryTemplateFromSentenceAndIDFn</name>"
          + " </constant>"
          + " <function reified=\"false\">"
          + "  <constant>"
          + "   <guid>80605b12-436e-11d6-8000-00a0c9da2002</guid>"
          + "   <name>Quote</name>"
          + "  </constant>"
          + "  <sentence>"
          + "   <predicate>"
          + "    <constant>"
          + "     <guid>36ca436c-4932-4847-a70f-9d733d29b82d</guid>"
          + "     <name>artifactTypeMadeMainlyOfType</name>"
          + "    </constant>"
          + "   </predicate>"
          + "   <variable>?X</variable>"
          + "   <variable>?Y</variable>"
          + "   <variable>?Z</variable>"
          + "  </sentence>"
          + " </function>"
          + " <string>e0d0803c-430e-11e2-9de9-00219b4436b2</string>"
          + "</function>"
          + "  </queryID><queryFormula>"
          + "   <sentence xmlns=\"http://www.opencyc.org/xml/cycML/\">"
          + "    <predicate>"
          + "     <constant>"
          + "      <guid>36ca436c-4932-4847-a70f-9d733d29b82d</guid>"
          + "      <name>artifactTypeMadeMainlyOfType</name>"
          + "     </constant>"
          + "    </predicate>"
          + "    <variable>?X</variable>"
          + "    <variable>?Y</variable>"
          + "    <variable>?Z</variable>"
          + "   </sentence>"
          + "  </queryFormula><queryMt>"
          + "   <function reified=\"true\" xmlns=\"http://www.opencyc.org/xml/cycML/\">"
          + "    <constant>"
          + "     <guid>d5d71b27-24c5-4b0d-bcb5-072449b3e77e</guid>"
          + "     <name>AssistedReaderSourceSpindleCollectorForTaskFn</name>"
          + "    </constant>"
          + "    <constant>"
          + "     <guid>18ea376c-b788-11db-8000-000ea663fab7</guid>"
          + "     <name>GeneralCycKETask-Allotment</name>"
          + "    </constant>"
          + "   </function>"
          + "  </queryMt><queryComment>"
          + "   <string xmlns=\"http://www.opencyc.org/xml/cycML/\">Z is X made of Y.</string>"
          + "  </queryComment><queryInferenceProperties><queryInferenceProperty><propertySymbol>MAX-TRANSFORMATION-DEPTH"
          + "    </propertySymbol><propertyValue>"
          + "     <number xmlns=\"http://www.opencyc.org/xml/cycML/\">0</number>"
          + "    </propertyValue>"
          + "   </queryInferenceProperty><queryInferenceProperty><propertySymbol>ALLOW-INDETERMINATE-RESULTS?"
          + "    </propertySymbol><propertyValue>"
          + "     <symbol xmlns=\"http://www.opencyc.org/xml/cycML/\">"
          + "      <package>COMMON-LISP</package>"
          + "      <name>T</name>"
          + "     </symbol>"
          + "    </propertyValue>"
          + "   </queryInferenceProperty><queryInferenceProperty><propertySymbol>NEW-TERMS-ALLOWED?"
          + "    </propertySymbol><propertyValue>"
          + "     <symbol xmlns=\"http://www.opencyc.org/xml/cycML/\">"
          + "      <package>COMMON-LISP</package>"
          + "      <name>T</name>"
          + "     </symbol>"
          + "    </propertyValue>"
          + "   </queryInferenceProperty><queryInferenceProperty><propertySymbol>MAX-TIME"
          + "    </propertySymbol><propertyValue>"
          + "     <number xmlns=\"http://www.opencyc.org/xml/cycML/\">60</number>"
          + "    </propertyValue>"
          + "   </queryInferenceProperty><queryInferenceProperty><propertySymbol>DISJUNCTION-FREE-EL-VARS-POLICY"
          + "    </propertySymbol><propertyValue>"
          + "     <symbol xmlns=\"http://www.opencyc.org/xml/cycML/\">"
          + "      <package>KEYWORD</package>"
          + "      <name>COMPUTE-INTERSECTION</name>"
          + "     </symbol>"
          + "    </propertyValue>"
          + "   </queryInferenceProperty><queryInferenceProperty><propertySymbol>PRODUCTIVITY-LIMIT"
          + "    </propertySymbol><propertyValue>"
          + "     <number xmlns=\"http://www.opencyc.org/xml/cycML/\">2000000</number>"
          + "    </propertyValue>"
          + "   </queryInferenceProperty><queryInferenceProperty><propertySymbol>COMPUTE-ANSWER-JUSTIFICATIONS?"
          + "    </propertySymbol><propertyValue>"
          + "     <symbol xmlns=\"http://www.opencyc.org/xml/cycML/\">"
          + "      <package>COMMON-LISP</package>"
          + "      <name>T</name>"
          + "     </symbol>"
          + "    </propertyValue>"
          + "   </queryInferenceProperty>"
          + "  </queryInferenceProperties>"
          + " </cyclQuery>";
}
