package com.cyc.baseclient;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.conn.CycConnectionInterface;
import com.cyc.base.conn.LeaseManager;
import com.cyc.base.conn.LeaseManager.LeaseEventObject;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.Naut;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.cyc.baseclient.CommonConstants.*;
import static com.cyc.baseclient.CycObjectFactory.*;
import com.cyc.baseclient.comm.SocketComm;
import com.cyc.baseclient.comm.SocketCommRoundRobin;
import com.cyc.baseclient.cycobject.ByteArray;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycFort;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycListParser;
import com.cyc.baseclient.cycobject.CycNart;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.baseclient.cycobject.DefaultCycObject;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.base.inference.InferenceResultSet;
import com.cyc.baseclient.api.CfaslInputStream;
import com.cyc.baseclient.api.CfaslOutputStream;
import com.cyc.baseclient.api.CompactHLIDConverter;
import com.cyc.baseclient.api.CycApiClosedConnectionException;
import com.cyc.base.CycApiException;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Nart;
import com.cyc.baseclient.api.CycLeaseManager;
import com.cyc.baseclient.api.DefaultSubLWorkerSynch;
import com.cyc.baseclient.api.SubLWorkerSynch;
import com.cyc.baseclient.api.TestUtils;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.inference.DefaultResultSet;
import com.cyc.baseclient.inference.params.DefaultInferenceParameters;
import com.cyc.baseclient.parser.CycLParserUtil;
import com.cyc.baseclient.datatype.StringUtils;
import com.cyc.baseclient.nl.Paraphraser;

/**
 * Provides a unit test suite for the <tt>com.cyc.baseclient.api</tt> package
 *
 * @version $Id: UnitTest.java 135027 2011-07-15 21:35:08Z daves $
 * @author Stefano Bertolo
 * @author Stephen L. Reed
 */
public class UnitTest implements CycLeaseManager.CycLeaseManagerListener {

    public static final String SUPERTAXONS_GUID_STRING = "bd58e36e-9c29-11b1-9dad-c379636f7270";
    /**
     * Indicates the use of a local CycConnection object to connect with a Cyc
     * server.
     */
    public static final int LOCAL_CYC_CONNECTION = 1;
    /**
     * Indicates the use of a java web service (SOAP XML) connection to the Cyc
     * server.
     */
    public static final int SOAP_CYC_CONNECTION = 3;
    /*
     * Indicates the use of Comm object as input to Cyc Access 
     */
    public static final int SOCKET_COMM_CYC_CONNECTION = 4;
    public static final int ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION = 5;
    /**
     * the connection mode
     */
    public static int connectionMode = LOCAL_CYC_CONNECTION;
//  public static int connectionMode = SOAP_CYC_CONNECTION;
    /**
     * the SOAP service url
     */
    public static final String endpointURLString = "http://207.207.9.187/axis/services/CycSOAPService";
    /**
     * the endpoint URL for the Cyc API web service
     */
    protected static URL endpointURL;
    /**
     * Indicates whether unit tests should be performed only in binary api mode.
     */
    public static boolean performOnlyBinaryApiModeTests = false;
    //public static boolean performOnlyBinaryApiModeTests = true;
    /**
     * indicates whether to enforce strict cyc-api function filtering
     */
    public static boolean enforceApiFunctions = false;
    private static final String AIR_BREATHING_VERTEBRATE_GUID_STRING = "bef7c9c1-9c29-11b1-9dad-c379636f7270";
    private static final String ALGERIA_GUID_STRING = "bd588c92-9c29-11b1-9dad-c379636f7270";
    private static final String ANIMAL_GUID_STRING = "bd58b031-9c29-11b1-9dad-c379636f7270";
    private static final String APPLE_TREE_GUID_STRING = "bd58c19d-9c29-11b1-9dad-c379636f7270";
    private static final String BIOLIGICAL_SPECIES_GUID_STRING = "bd58caeb-9c29-11b1-9dad-c379636f7270";
    private static final String BIOLOGY_VOCABULARY_MT_GUID_STRING = "bdd51776-9c29-11b1-9dad-c379636f7270";
    private static final String BRAZIL_GUID_STRING = "bd588f01-9c29-11b1-9dad-c379636f7270";
    private static final String BURNING_BUSH_GUID_STRING = "be846866-9c29-11b1-9dad-c379636f7270";
    private static final String CANINE_ANIMAL_GUID_STRING = "bd58d044-9c29-11b1-9dad-c379636f7270";
    private static final String CIA_WORLD_FACTBOOK_1995_MT_GUID_STRING = "c0a41a91-9c29-11b1-9dad-c379636f7270";
    private static final String CITY_NAMED_FN_GUID_STRING = "bd6870a6-9c29-11b1-9dad-c379636f7270";
    private static final String CONSTANT_NAME_GUID_STRING = "bd7183b0-9c29-11b1-9dad-c379636f7270";
    private static final String COUNTRY_GUID_STRING = "bd588879-9c29-11b1-9dad-c379636f7270";
    private static final String CYCL_TERM_GUID_STRING = "c107fffb-9c29-11b1-9dad-c379636f7270";
    private static final String DOMESTICATED_ANIMAL_GUID_STRING = "c10c22cd-9c29-11b1-9dad-c379636f7270";
    private static final String DONE_BY_GUID_STRING = "c0fd4798-9c29-11b1-9dad-c379636f7270";
    private static final String EXISTING_OBJECT_TYPE_GUID_STRING = "bd65d880-9c29-11b1-9dad-c379636f7270";
    private static final String FOX_GUID_STRING = "bd58be87-9c29-11b1-9dad-c379636f7270";
    private static final String FRUIT_FN_GUID_STRING = "bd58a976-9c29-11b1-9dad-c379636f7270";
    private static final String GENERAL_LEXICON_MT_GUID_STRING = "c109b867-9c29-11b1-9dad-c379636f7270";
    private static final String INTERNAL_PARTS_GUID_STRING = "bd58cf63-9c29-11b1-9dad-c379636f7270";
    private static final String JACKAL_GUID_STRING = "bd58c2de-9c29-11b1-9dad-c379636f7270";
    private static final String KE_REQUIREMENT_GUID_STRING = "c1141606-9c29-11b1-9dad-c379636f7270";
    private static final String LION_GUID_STRING = "bd58c467-9c29-11b1-9dad-c379636f7270";
    private static final String MALE_HUMAN_GUID_STRING = "bd58d6a1-9c29-11b1-9dad-c379636f7270";
    private static final String MICROTHEORY_GUID_STRING = "bd5880d5-9c29-11b1-9dad-c379636f7270";
    private static final String MODERN_MILITARY_MT_GUID_STRING = "c040a2f0-9c29-11b1-9dad-c379636f7270";
    private static final String MT_SPACE_GUID_STRING = "abb96eb5-e798-11d6-8ac9-0002b3a333c3";
    private static final String MT_TIME_WITH_GRANULARITY_DIM_FN_GUID_STRING = "47537943-331d-11d7-922f-0002b3a333c3";
    private static final String NEAREST_ISA_GUID_STRING = "bf411eed-9c29-11b1-9dad-c379636f7270";
    private static final String NON_PERSON_ANIMAL_GUID_STRING = "bd58e066-9c29-11b1-9dad-c379636f7270";
    private static final String NOW_GUID_STRING = "bd58a068-9c29-11b1-9dad-c379636f7270";
    private static final String OBJECT_TYPE_GUID_STRING = "bd58ab9d-9c29-11b1-9dad-c379636f7270";
    private static final String ORGANISM_CLASSIFICATION_TYPE_GUID_STRING = "bd58dfe4-9c29-11b1-9dad-c379636f7270";
    private static final String ORGANIZATION_GUID_STRING = "bd58d54f-9c29-11b1-9dad-c379636f7270";
    private static final String CAR_ACCIDENT_GUID_STRING = "bd58f4cd-9c29-11b1-9dad-c379636f7270";
    private static final String DOG_GUID_STRING = "bd58daa0-9c29-11b1-9dad-c379636f7270";
    private static final String PARAPHRASE_MT_GUID_STRING = "bf3ab672-9c29-11b1-9dad-c379636f7270";
    private static final String PENGUIN_GUID_STRING = "bd58a986-9c29-11b1-9dad-c379636f7270";
    private static final String PERCENT_OF_REGION_IS_GUID_STRING = "bfb0c6e5-9c29-11b1-9dad-c379636f7270";
    private static final String PERFORMED_BY_GUID_STRING = "bd58a962-9c29-11b1-9dad-c379636f7270";
    private static final String PHYSICAL_DEVICE_GUID_STRING = "bd58c72f-9c29-11b1-9dad-c379636f7270";
    private static final String PITTSBURGH_PENGUINS_GUID_STRING = "c08dec11-9c29-11b1-9dad-c379636f7270";
    private static final String PLANT_GUID_STRING = "bd58c6e1-9c29-11b1-9dad-c379636f7270";
    private static final String PLATO_GUID_STRING = "bd58895f-9c29-11b1-9dad-c379636f7270";
    private static final String RAINDROP_GUID_STRING = "bd58bec6-9c29-11b1-9dad-c379636f7270";
    private static final String RETRIEVER_DOG_GUID_STRING = "bd58e24b-9c29-11b1-9dad-c379636f7270";
    private static final String SIBLINGS_GUID_STRING = "bd58e3e9-9c29-11b1-9dad-c379636f7270";
    private static final String SINGLE_PURPOSE_DEVICE_GUID_STRING = "bd5897aa-9c29-11b1-9dad-c379636f7270";
    private static final String SWAZILAND_GUID_STRING = "bd588a92-9c29-11b1-9dad-c379636f7270";
    private static final String TAME_ANIMAL_GUID_STRING = "c0fcd4a1-9c29-11b1-9dad-c379636f7270";
    private static final String TARGET_GUID_STRING = "c10afaed-9c29-11b1-9dad-c379636f7270";
    private static final String TIMEPOINT_GUID_STRING = "bd58ca05-9c29-11b1-9dad-c379636f7270";
    private static final String TREATY_OAK_GUID_STRING = "bfc0aa80-9c29-11b1-9dad-c379636f7270";
    private static final String UNIVERSE_DATA_MT_GUID_STRING = "bd58d0f3-9c29-11b1-9dad-c379636f7270";
    private static final String VEGETABLE_MATTER_GUID_STRING = "bd58c455-9c29-11b1-9dad-c379636f7270";
    private static final String WOLF_GUID_STRING = "bd58c31f-9c29-11b1-9dad-c379636f7270";
    private static final String WORLD_GEOGRAPHY_MT_GUID_STRING = "bfaac020-9c29-11b1-9dad-c379636f7270";
    private static final String WHAT_IS_IN_AUSTIN = "(#$objectFoundInLocation ?WHAT #$CityOfAustinTX)";

    @BeforeClass
    public static void setUpClass() throws MalformedURLException, Exception {
        //TestUtils.ensureConstantsInitialized();
        //endpointURL = new URL(endpointURLString);

        CycAccess cycAccess = null;
        if (connectionMode == LOCAL_CYC_CONNECTION) {
            cycAccess = new CycClient(TestUtils.testHostName, TestUtils.testBasePort);
            System.out.println(cycAccess.getCycConnection().connectionInfo());
        } else if (connectionMode == SOAP_CYC_CONNECTION) {
            cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                    TestUtils.testBasePort);
        } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
            cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                    TestUtils.testBasePort));
        } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
            // SocketCommRoundRobin will create two socket connections to two 
            // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
            cycAccess = new CycClient(new SocketCommRoundRobin());
        } else {
            fail("Invalid connection mode " + connectionMode);
        }
        CycClientManager.get().setCurrentAccess(cycAccess);
    }

    /**
     * Compares expected object to the test object without causing a unit test
     * failure, reporting if the parameters are not equal.
     *
     * @param expectedObject the expected object
     * @param testObject the test object
     */
    public static void nofailAssertEquals(Object expectedObject,
            Object testObject) {
        if (!expectedObject.equals(testObject)) {
            System.out.println(
                    "Expected <" + expectedObject + "> \nfound <" + testObject);
        }
    }

    /**
     * Reports if the given boolean expression is false, without causing a unit
     * test failure.
     *
     * @param testExpression the test expression
     * @param message the message to display when the test fails
     */
    public static void nofailAssertTrue(boolean testExpression,
            String message) {
        if (!testExpression) {
            System.out.println("Test expression not true\n" + message);
        }
    }
    
    public static boolean isBasicParaphraser(Paraphraser p) {
      if (p != null) {
        // Checking the string value is a little hacky, but Paraphraser$BasicParaphraser is a private class... - nwinant, 2014-04-16
        return "com.cyc.baseclient.nl.Paraphraser$BasicParaphraser".equals(p.getClass().getName());
      }
     return false;
    }

    /**
     * Tests the makeValidConstantName method.
     */
    @Test
    public void testMakeValidConstantName() {
        System.out.println("\n**** testMakeValidConstantName ****");

        String candidateName = "abc";
        assertEquals(candidateName, CycConstant.makeValidConstantName(candidateName));
        candidateName = "()[]//abc";

        String expectedValidName = "______abc";
        assertEquals(expectedValidName, CycConstant.makeValidConstantName(
                candidateName));
        System.out.println("**** testMakeValidConstantName OK ****");
    }

    @Test
    public void testMerge() throws Exception {
        System.out.println("\n**** testMerge ****");

        String candidateName = "Abc";
        String candidateName2 = "abc2";
        CycAccess cyc = CycClient.getCurrent();
        CycConstantI c = cyc.getLookupTool().findOrCreate(candidateName);
        CycConstantI c2 = cyc.getLookupTool().findOrCreate(candidateName2);
        
        cyc.getAssertTool().assertIsa(c, CycClient.getCurrent().getLookupTool().findOrCreate("#$Person"));
        cyc.getAssertTool().assertIsa(c2, CycClient.getCurrent().getLookupTool().findOrCreate("#$BinaryPredicate"));
        
        cyc.getAssertTool().merge(c2, c);
        System.out.println("Constant: " + c2);
        System.out.println("**** testMakeValidConstantName OK ****");
        
        CycClient.getCurrent().getUnassertTool().killWithoutTranscript(c);
        CycClient.getCurrent().getUnassertTool().killWithoutTranscript(c2);
    }
    
    /**
     * Tests CycAccess initialization.
     */
    @Test
    public void testCycAccessInitialization() {
        System.out.println("\n**** testCycAccessInitialization ****");

        CycAccess cycAccess = null;

        System.out.println("creating CycAccess 1");
        try {
            if (connectionMode == LOCAL_CYC_CONNECTION) {
                cycAccess = new CycClient(TestUtils.testHostName, TestUtils.testBasePort);
                System.out.println(cycAccess.getCycConnection().connectionInfo());
            } else if (connectionMode == SOAP_CYC_CONNECTION) {
                cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                        TestUtils.testBasePort);
            } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                        TestUtils.testBasePort));
            } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                // SocketCommRoundRobin will create two socket connections to two 
                // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                cycAccess = new CycClient(new SocketCommRoundRobin());
            } else {
                fail("Invalid connection mode " + connectionMode);
            }
        } catch (ConnectException e) {
            System.out.println(
                    "Could not connect to host " + TestUtils.testHostName + " base port " + TestUtils.testBasePort);
            fail(e.toString());
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }

        System.out.println("CycAccess 1 closed, creating CycAccess 2");
        try {
            if (connectionMode == LOCAL_CYC_CONNECTION) {
                cycAccess = new CycClient(TestUtils.testHostName, TestUtils.testBasePort);
                System.out.println(cycAccess.getCycConnection().connectionInfo());
            } else if (connectionMode == SOAP_CYC_CONNECTION) {
                cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                        TestUtils.testBasePort);
            } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                        TestUtils.testBasePort));
            } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                // SocketCommRoundRobin will create two socket connections to two 
                // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                cycAccess = new CycClient(new SocketCommRoundRobin());
            } else {
                fail("Invalid connection mode " + connectionMode);
            }
        } catch (ConnectException e) {
            System.out.println(
                    "Could not connect to host " + TestUtils.testHostName + " base port " + TestUtils.testBasePort);
            fail(e.toString());
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }

        System.out.println("CycAccess 2 closed, creating CycAccess 3");
        try {
            if (connectionMode == LOCAL_CYC_CONNECTION) {
                cycAccess = new CycClient(TestUtils.testHostName, TestUtils.testBasePort);
                System.out.println(cycAccess.getCycConnection().connectionInfo());
            } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                        TestUtils.testBasePort));
            } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                // SocketCommRoundRobin will create two socket connections to two 
                // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                cycAccess = new CycClient(new SocketCommRoundRobin());
            } else if (connectionMode == SOAP_CYC_CONNECTION) {
                cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                        TestUtils.testBasePort);
            } else {
                fail("Invalid connection mode " + connectionMode);
            }
        } catch (ConnectException e) {
            System.out.println(
                    "Could not connect to host " + TestUtils.testHostName + " base port " + TestUtils.testBasePort);
            fail(e.toString());
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }

        System.out.println("CycAccess 3 closed, creating CycAccess 4");
        try {
            if (connectionMode == LOCAL_CYC_CONNECTION) {
                cycAccess = new CycClient(TestUtils.testHostName, TestUtils.testBasePort);
                System.out.println(cycAccess.getCycConnection().connectionInfo());
            } else if (connectionMode == SOAP_CYC_CONNECTION) {
                cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                        TestUtils.testBasePort);
            } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                        TestUtils.testBasePort));
            } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                // SocketCommRoundRobin will create two socket connections to two 
                // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                cycAccess = new CycClient(new SocketCommRoundRobin());
            } else {
                fail("Invalid connection mode " + connectionMode);
            }
        } catch (ConnectException e) {
            System.out.println(
                    "Could not connect to host " + TestUtils.testHostName + " base port " + TestUtils.testBasePort);
            fail(e.toString());
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }

        System.out.println("CycAccess 4 closed, creating CycAccess 5");
        try {
            if (connectionMode == LOCAL_CYC_CONNECTION) {
                cycAccess = new CycClient(TestUtils.testHostName, TestUtils.testBasePort);
                System.out.println(cycAccess.getCycConnection().connectionInfo());
            } else if (connectionMode == SOAP_CYC_CONNECTION) {
                cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                        TestUtils.testBasePort);
            } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                        TestUtils.testBasePort));
            } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                // SocketCommRoundRobin will create two socket connections to two 
                // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                cycAccess = new CycClient(new SocketCommRoundRobin());
            } else {
                fail("Invalid connection mode " + connectionMode);
            }
        } catch (ConnectException e) {
            System.out.println(
                    "Could not connect to host " + TestUtils.testHostName + " base port " + TestUtils.testBasePort);
            fail(e.toString());
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }

        System.out.println("CycAccess 5 closed, creating CycAccess 6");
        try {
            if (connectionMode == LOCAL_CYC_CONNECTION) {
                cycAccess = new CycClient(TestUtils.testHostName, TestUtils.testBasePort);
                System.out.println(cycAccess.getCycConnection().connectionInfo());
            } else if (connectionMode == SOAP_CYC_CONNECTION) {
                cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                        TestUtils.testBasePort);
            } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                        TestUtils.testBasePort));
            } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                // SocketCommRoundRobin will create two socket connections to two 
                // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                cycAccess = new CycClient(new SocketCommRoundRobin());
            } else {
                fail("Invalid connection mode " + connectionMode);
            }
        } catch (ConnectException e) {
            System.out.println(
                    "Could not connect to host " + TestUtils.testHostName + " base port " + TestUtils.testBasePort);
            fail(e.toString());
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }

        System.out.println("CycAccess 6 closed, creating CycAccess 7");
        try {
            if (connectionMode == LOCAL_CYC_CONNECTION) {
                cycAccess = new CycClient(TestUtils.testHostName, TestUtils.testBasePort);
                System.out.println(cycAccess.getCycConnection().connectionInfo());
            } else if (connectionMode == SOAP_CYC_CONNECTION) {
                cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                        TestUtils.testBasePort);
            } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                        TestUtils.testBasePort));
            } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                // SocketCommRoundRobin will create two socket connections to two 
                // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                cycAccess = new CycClient(new SocketCommRoundRobin());
            } else {
                fail("Invalid connection mode " + connectionMode);
            }
        } catch (ConnectException e) {
            System.out.println(
                    "Could not connect to host " + TestUtils.testHostName + " base port " + TestUtils.testBasePort);
            fail(e.toString());
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
            }
        }
        System.out.println("CycAccess 7 closed");

        System.out.println("**** testCycAccessInitialization OK ****");
    }

    /**
     * Tests the fundamental aspects of the binary (cfasl) api connection to the
     * OpenCyc server.
     */
    @Test
    public void testBinaryCycConnection1() {
        System.out.println("\n**** testBinaryCycConnection1 ****");

        CycClient cycAccess = null;
        CycConnectionInterface cycConnection = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }

                cycConnection = cycAccess.cycConnection;

                //cycConnection.trace = true;
            } catch (ConnectException e) {
                System.out.println(
                        "Could not connect to host " + TestUtils.testHostName + " base port " + TestUtils.testBasePort);
                fail(e.toString());
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            //cycAccess.traceOn();
            // Test return of atom.
            CycArrayList command = new CycArrayList();
            command.add(makeCycSymbol("+"));
            command.add(2);
            command.add(3);

            Object[] response = {0, ""};

            try {
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }

            assertEquals(true, response[0]);
            assertEquals(5, response[1]);


            // Test return of string.
            command = new CycArrayList();
            command.add(quote);
            command.add("abc");

            try {
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }

            assertEquals(true, response[0]);
            assertEquals("abc", response[1]);


            // Test return of symbolic expression.
            command = new CycArrayList();
            command.add(quote);

            CycList cycList2 = CycArrayList.makeCycList(makeCycSymbol("a"), makeCycSymbol(
                    "b"));
            command.add(cycList2);

            CycArrayList cycList3 = new CycArrayList();
            cycList2.add(cycList3);
            cycList3.add(makeCycSymbol("c"));
            cycList3.add(makeCycSymbol("d"));

            CycArrayList cycList4 = new CycArrayList();
            cycList3.add(cycList4);
            cycList4.add(makeCycSymbol("e"));
            cycList3.add(makeCycSymbol("f"));
            cycList3.add(makeCycSymbol("?my-var"));

            try {
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }

            assertEquals(true, response[0]);
            assertEquals("(A B (C D (E) F ?MY-VAR))", response[1].toString());


            // Test return of improper list.
            command = new CycArrayList();
            command.add(quote);
            cycList2 = new CycArrayList();
            command.add(cycList2);
            cycList2.add(makeCycSymbol("A"));
            cycList2.setDottedElement(makeCycSymbol("B"));

            try {
//      cycAccess.traceOn();
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }

            assertEquals(true, response[0]);
            assertEquals("(A . B)", response[1].toString());


            // Test error return
            command = new CycArrayList();
            command.add(nil);

            try {
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }
            assertTrue(response[1].toString().indexOf("NIL") > -1);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
            }
        }
        System.out.println("**** testBinaryCycConnection1 OK ****");
    }

    /**
     * Tests the fundamental aspects of the binary (cfasl) api connection to the
     * OpenCyc server. CycAccess is set to null;
     */
    @Test
    public void testBinaryCycConnection2() {
        if ((connectionMode == SOAP_CYC_CONNECTION)) {
            return;
        }

        System.out.println("\n**** testBinaryCycConnection2 ****");

        CycConnectionInterface cycConnection = null;
        CycClient cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode + "\n bailing on test.");

                    return;
                }

                cycConnection = cycAccess.cycConnection;
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // Test return of atom.
            CycArrayList command = new CycArrayList();
            command.add(makeCycSymbol("+"));
            command.add(2);
            command.add(3);

            Object[] response = {0, ""};

            try {
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }

            assertEquals(true, response[0]);
            assertEquals(5, response[1]);


            // Test return of string.
            command = new CycArrayList();
            command.add(quote);
            command.add("abc");

            try {
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }

            assertEquals(true, response[0]);
            assertEquals("abc", response[1]);


            // Test return of symbolic expression.
            command = new CycArrayList();
            command.add(quote);

            CycArrayList cycList2 = new CycArrayList();
            command.add(cycList2);
            cycList2.add(makeCycSymbol("a"));
            cycList2.add(makeCycSymbol("b"));

            CycArrayList cycList3 = new CycArrayList();
            cycList2.add(cycList3);
            cycList3.add(makeCycSymbol("c"));
            cycList3.add(makeCycSymbol("d"));

            CycArrayList cycList4 = new CycArrayList();
            cycList3.add(cycList4);
            cycList4.add(makeCycSymbol("e"));
            cycList3.add(makeCycSymbol("f"));

            try {
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }

            assertEquals(true, response[0]);
            assertEquals("(A B (C D (E) F))", response[1].toString());


            // Test return of improper list.
            command = new CycArrayList();
            command.add(quote);
            cycList2 = new CycArrayList();
            command.add(cycList2);
            cycList2.add(makeCycSymbol("A"));
            cycList2.setDottedElement(makeCycSymbol("B"));

            try {
                //cycConnection.trace = true;
                response = cycConnection.converse(command);

                //cycConnection.trace = false;
            } catch (Throwable e) {
                fail(e.toString());
            }

            assertEquals(true, response[0]);
            assertEquals("(A . B)", response[1].toString());


            // Test error return
            command = new CycArrayList();
            command.add(nil);

            try {
                response = cycConnection.converse(command);
            } catch (Throwable e) {
                fail(e.toString());
            }

            if (response[1].toString().indexOf("NIL") == -1) {
                System.out.println(response[1]);
            }


            // various error messages to effect that NIL is not defined in the API.
            assertTrue(response[1].toString().indexOf("NIL") > -1);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
            }
        }
        System.out.println("**** testBinaryCycConnection2 OK ****");
    }

    @Test
    public void testCycSymbolLocaleIndependence() {
        System.out.println("\n**** testCycSymbolLocaleIndependence ****");
        final Locale defaultLocale = Locale.getDefault();
        final String lowercaseName = "abcdefghijklmnopqrstuvwxyz1234567890-_";
        Locale.setDefault(Locale.ENGLISH);
        final CycSymbol englishSymbol = makeCycSymbol(lowercaseName);
        Locale.setDefault(new Locale("tr"));
        final CycSymbol turkishSymbol = makeCycSymbol(lowercaseName);
        Locale.setDefault(defaultLocale);
        assertEquals(englishSymbol.toString(), turkishSymbol.toString());
        System.out.println("**** testCycSymbolLocaleIndependence OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess1() {
        System.out.println("\n**** testBinaryCycAccess 1 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                System.out.println("\nException: " + e.getMessage());
                fail(e.toString());
            }


            //cycAccess.traceOn();
            doTestCycAccess1(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
            }
        }
        System.out.println("**** testBinaryCycAccess 1 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess1(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();

        resetCycConstantCaches();

        // getConstantByName.
        CycConstantI cycConstant = null;

        try {
            //cycAccess.traceOnDetailed();
            cycConstant = cycAccess.getLookupTool().getConstantByName("#$Dog");
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        assertNotNull(cycConstant);
        assertEquals(DOG_GUID_STRING, cycConstant.getGuid().toString());

        // getConstantByGuid.
        try {
            cycConstant = cycAccess.getLookupTool().getConstantByGuid(makeGuid(DOG_GUID_STRING));
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(cycConstant);
        assertEquals("#$Dog", cycConstant.cyclify());
        assertEquals("Dog", cycConstant.getName());


        // getComment.
        String comment = null;

        try {
            CycConstantI raindrop = cycAccess.getLookupTool().getKnownConstantByGuid(
                    RAINDROP_GUID_STRING);
            comment = cycAccess.getLookupTool().getComment(raindrop);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        assertNotNull(comment);
        assertEquals(
                "The collection of drops of liquid water emitted by clouds in instances of #$RainProcess.",
                comment);

        // getIsas.
        List isas = null;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            isas = cycAccess.getLookupTool().getIsas(dog);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        assertNotNull(isas);
        assertTrue(isas instanceof CycArrayList);
        isas = ((CycArrayList) isas).sort();

        try {
            CycConstantI biologicalSpecies = cycAccess.getLookupTool().getKnownConstantByGuid(
                    BIOLIGICAL_SPECIES_GUID_STRING);
            assertTrue(isas.contains(biologicalSpecies));
        } catch (Throwable e) {
            fail(e.toString());
        }


        isas = null;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            isas = cycAccess.getLookupTool().getIsas(dog);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        assertNotNull(isas);
        assertTrue(isas instanceof CycArrayList);
        isas = ((CycArrayList) isas).sort();

        try {
            CycConstantI biologicalSpecies = cycAccess.getLookupTool().getKnownConstantByGuid(
                    BIOLIGICAL_SPECIES_GUID_STRING);
            assertTrue(isas.contains(biologicalSpecies));
        } catch (Throwable e) {
            fail(e.toString());
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess2() {
        System.out.println("\n**** testBinaryCycAccess 2 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }


//    cycAccess.traceOnDetailed();
//    cycAccess.traceNamesOn();
            doTestCycAccess2(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 2 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess2(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();
        System.out.println(cycAccess.getCycConnection().connectionInfo());
        resetCycConstantCaches();

        // getGenls.
        List genls = null;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            genls = cycAccess.getLookupTool().getGenls(dog);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(genls);
        assertTrue(genls instanceof CycArrayList);
        genls = ((CycArrayList) genls).sort();
        assertTrue(genls.toString().indexOf("CanisGenus") > -1);
        assertTrue(genls.toString().indexOf("DomesticatedAnimal") > -1);

        // getGenlPreds.
        List genlPreds = null;

        try {
            CycConstantI target = cycAccess.getLookupTool().getKnownConstantByGuid(TARGET_GUID_STRING);
            genlPreds = cycAccess.getLookupTool().getGenlPreds(target);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(genlPreds);
        assertTrue((genlPreds.toString().equals("(preActors)")) || (genlPreds.toString().equals(
                "(actors)")));

        // getAllGenlPreds.
        List allGenlPreds = null;

        try {
            CycConstantI target = cycAccess.getLookupTool().getKnownConstantByGuid(TARGET_GUID_STRING);
            allGenlPreds = cycAccess.getLookupTool().getAllGenlPreds(target);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(allGenlPreds);
        assertTrue(allGenlPreds.size() > 2);

        // getArg1Formats.
        List arg1Formats = null;

        try {
            CycConstantI target = cycAccess.getLookupTool().getKnownConstantByGuid(TARGET_GUID_STRING);
            arg1Formats = cycAccess.getLookupTool().getArg1Formats(target);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(arg1Formats);
        assertEquals("(SetTheFormat)", arg1Formats.toString());


        // getArg1Formats.
        arg1Formats = null;

        try {
            CycConstantI constantName = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CONSTANT_NAME_GUID_STRING);
            arg1Formats = cycAccess.getLookupTool().getArg1Formats(constantName);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(arg1Formats);
        assertEquals("(singleEntryFormatInArgs)", arg1Formats.toString());

        // getArg2Formats.
        List arg2Formats = null;

        try {
            CycConstantI internalParts = cycAccess.getLookupTool().getKnownConstantByGuid(
                    INTERNAL_PARTS_GUID_STRING);
            arg2Formats = cycAccess.getLookupTool().getArg2Formats(internalParts);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(arg2Formats);
        assertEquals("(SetTheFormat)", arg2Formats.toString());

        // getDisjointWiths.
        List disjointWiths = null;

        try {
            CycConstantI vegetableMatter = cycAccess.getLookupTool().getKnownConstantByGuid(
                    VEGETABLE_MATTER_GUID_STRING);
            disjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(disjointWiths);
        assertTrue(disjointWiths.toString().indexOf(
                "AnimalBLO") > 0);

        // getCoExtensionals.
        List coExtensionals = null;

        try {
            CycConstantI cycLTerm = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CYCL_TERM_GUID_STRING);
            if (!cycAccess.isOpenCyc()) {
                coExtensionals = cycAccess.getLookupTool().getCoExtensionals(cycLTerm);
                assertNotNull(coExtensionals);
                assertEquals("(CycLExpression)",
                        coExtensionals.toString());
            }
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }


        // getCoExtensionals.
        coExtensionals = null;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            coExtensionals = cycAccess.getLookupTool().getCoExtensionals(dog);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(coExtensionals);
        assertEquals("()", coExtensionals.toString());

        // getArg1Isas.
        List arg1Isas = null;

        try {
            CycConstantI doneBy = cycAccess.getLookupTool().getKnownConstantByGuid(DONE_BY_GUID_STRING);
            arg1Isas = cycAccess.getLookupTool().getArg1Isas(doneBy);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(arg1Isas);
        assertEquals("(Event)", arg1Isas.toString());

        // getArg2Isas.
        List arg2Isas = null;

        try {
            CycConstantI doneBy = cycAccess.getLookupTool().getKnownConstantByGuid(DONE_BY_GUID_STRING);
            arg2Isas = cycAccess.getLookupTool().getArg2Isas(doneBy);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(arg2Isas);
        CycConstantI somethingExisting = new CycConstant("SomethingExisting",
                new CycGuid("bd58b6e7-9c29-11b1-9dad-c379636f7270"));
        assertTrue(arg2Isas.contains(somethingExisting));

        // getArgNIsas.
        List argNIsas = null;

        try {
            CycConstantI doneBy = cycAccess.getLookupTool().getKnownConstantByGuid(DONE_BY_GUID_STRING);
            argNIsas = cycAccess.getLookupTool().getArgNIsas(doneBy, 1);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(argNIsas);
        assertEquals("(Event)", argNIsas.toString());

        // getArgNGenls.
        List argGenls = null;

        try {
            CycConstantI superTaxons = cycAccess.getLookupTool().getKnownConstantByGuid(
                    SUPERTAXONS_GUID_STRING);
            argGenls = cycAccess.getLookupTool().getArgNGenls(superTaxons, 2);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(argGenls);
        assertEquals("(Organism-Whole)", argGenls.toString());

        // isCollection.
        boolean answer = false;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            answer = cycAccess.getInspectorTool().isCollection(dog);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);


        // isCollection.
        answer = true;

        try {
            CycConstantI doneBy = cycAccess.getLookupTool().getKnownConstantByGuid(DONE_BY_GUID_STRING);
            answer = cycAccess.getInspectorTool().isCollection(doneBy);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(!answer);


        // isCollection on a NAUT
        answer = false;

        try {
            CycConstantI fruitFn = cycAccess.getLookupTool().getKnownConstantByGuid(
                    FRUIT_FN_GUID_STRING);
            CycConstantI appleTree = cycAccess.getLookupTool().getKnownConstantByGuid(
                    APPLE_TREE_GUID_STRING);
            CycNaut fruitFnAppleTreeNaut = new CycNaut(fruitFn, appleTree);
            answer = cycAccess.getInspectorTool().isCollection(fruitFnAppleTreeNaut);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);


        // isCollection on a NAUT
        answer = true;

        try {
            CycConstantI cityNamedFn = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CITY_NAMED_FN_GUID_STRING);
            CycConstantI swaziland = cycAccess.getLookupTool().getKnownConstantByGuid(
                    SWAZILAND_GUID_STRING);
            CycNaut cityNamedFnNaut = new CycNaut(cityNamedFn, "swaziville", swaziland);
            answer = cycAccess.getInspectorTool().isCollection(cityNamedFnNaut);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(!answer);


        // isCollection on a non-CycObject
        answer = true;

        try {
            answer = cycAccess.getInspectorTool().isCollection(7);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(!answer);


        // isBinaryPredicate.
        answer = false;

        try {
            CycConstantI doneBy = cycAccess.getLookupTool().getKnownConstantByGuid(DONE_BY_GUID_STRING);
            answer = cycAccess.getInspectorTool().isBinaryPredicate(doneBy);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);


        // isBinaryPredicate.
        answer = true;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            answer = cycAccess.getInspectorTool().isBinaryPredicate(dog);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(!answer);

        // getGeneratedPhrase.
        String phrase = null;

        try {
            Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.KBOBJECT);

            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            phrase = p.paraphrase(dog).getString();
            assertNotNull(phrase);
            if (cycAccess.isOpenCyc()) {
                assertEquals("dog", phrase);
            } else {
              if (isBasicParaphraser(p)) {
                assertEquals("Dog", phrase);
              } else {
                assertEquals("Canis familiaris", phrase);
              }
            }
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getSingularGeneratedPhrase.
        phrase = null;

        try {
            CycConstantI brazil = cycAccess.getLookupTool().getKnownConstantByGuid(BRAZIL_GUID_STRING);
            Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.KBOBJECT);
            phrase = p.paraphrase(brazil).getString();
        } catch (Throwable e) {
            fail(e.toString());
        }

        //@todo this should check to see what kind of paraphraser it got.  If basic, we can expect "#$Dog" back or perhaps "Dog"
        assertNotNull(phrase);
        assertTrue(phrase.toLowerCase().indexOf("bra") > -1);


        // getGeneratedPhrase.
        phrase = null;

        try {
            Paraphraser p = Paraphraser.getInstance(Paraphraser.ParaphrasableType.KBOBJECT);
            CycConstantI doneBy = cycAccess.getLookupTool().getKnownConstantByGuid(DONE_BY_GUID_STRING);
            phrase = p.paraphrase(doneBy).getString();
            assertNotNull(phrase);
            if (isBasicParaphraser(p)) {
              assertTrue(phrase.indexOf("doneBy") > -1);
            } else {
              assertTrue(phrase.indexOf("doer") > -1);
            }
        } catch (Throwable e) {
            fail(e.toString());
        }

        // denots-of-string


        try {
            String denotationString = "Brazil";
            CycList denotations = cycAccess.getLookupTool().getDenotsOfString(denotationString);
            System.out.println(denotations.cyclify());
            assertTrue(denotations.contains(cycAccess.getLookupTool().getKnownConstantByGuid(
                    "bd588f01-9c29-11b1-9dad-c379636f7270")));
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }
        try {
            String denotationString = "South Dakota";
            CycList denotations = cycAccess.getLookupTool().getDenotsOfString(denotationString);
            System.out.println(denotations.cyclify());
            assertTrue(denotations.contains(new CycConstant("SouthDakota-State",
                    new CycGuid("bd58b684-9c29-11b1-9dad-c379636f7270"))));
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }
        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess3() {
        System.out.println("\n**** testBinaryCycAccess 3 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                    /*
                     assert cycAccess.getLookupTool().getCycLeaseManager() != null : "CycLeaseManager must not be null";
                     cycAccess.getLookupTool().getCycLeaseManager().addListener(this);
                     */

                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        assert kv.getValue() != null : "CycLeaseManager must not be null";
                        kv.getValue().addListener(this);
                    }
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));

                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        assert kv.getValue() != null : "CycLeaseManager must not be null";
                        kv.getValue().addListener(this);
                    }
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());

                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        assert kv.getValue() != null : "CycLeaseManager must not be null";
                        kv.getValue().addListener(this);
                    }
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            doTestCycAccess3(cycAccess);

            // cycAccess.getLookupTool().getCycLeaseManager().removeListener(this);

            for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                kv.getValue().removeListener(this);
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 3 OK ****");
    }

    /**
     * Notifies the listener of the given Cyc API services lease event.
     *
     * @param evt the the given Cyc API services lease event
     */
    public void notifyCycLeaseEvent(
            LeaseEventObject evt) {
        System.out.println("Notified of: " + evt.toString());
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess3(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();
        resetCycConstantCaches();

        // getComment.
        String comment = null;

        try {
            CycConstantI brazil = cycAccess.getLookupTool().getKnownConstantByGuid(BRAZIL_GUID_STRING);
            comment = cycAccess.getLookupTool().getComment(brazil);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(comment);
        assertEquals("An instance of #$IndependentCountry.  #$Brazil is the "
                + "largest country in South America, and is bounded on the "
                + "northwest by #$Colombia; on the north by #$Venezuela, "
                + "#$Guyana, #$Suriname, and #$FrenchGuiana; on the east by "
                + "the #$AtlanticOcean; on the south by #$Uruguay; on the "
                + "southwest by #$Argentina and #$Paraguay; and on the west "
                + "by #$Bolivia and #$Peru.",
                comment);

        // getIsas.
        List isas = null;

        try {
            CycConstantI brazil = cycAccess.getLookupTool().getKnownConstantByGuid(BRAZIL_GUID_STRING);
            isas = cycAccess.getLookupTool().getIsas(brazil);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        assertNotNull(isas);
        assertTrue(isas instanceof CycArrayList);
        assertTrue(isas.toString().indexOf("IndependentCountry") > 0);
        isas = ((CycArrayList) isas).sort();
        assertTrue(isas.toString().indexOf("IndependentCountry") > 0);

        // getGenls.
        List genls = null;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            genls = cycAccess.getLookupTool().getGenls(dog);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        assertNotNull(genls);
        assertTrue(genls instanceof CycArrayList);
        genls = ((CycArrayList) genls).sort();
        assertTrue(genls.toString().indexOf("CanisGenus") > -1);
        assertTrue(genls.toString().indexOf("DomesticatedAnimal") > -1);

        // getMinGenls.
        List minGenls = null;

        try {
            CycConstantI lion = cycAccess.getLookupTool().getKnownConstantByGuid(LION_GUID_STRING);
            minGenls = cycAccess.getLookupTool().getMinGenls(lion);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(minGenls);
        assertTrue(minGenls instanceof CycArrayList);
        minGenls = ((CycArrayList) minGenls).sort();
        assertEquals("(FelidaeFamily)", minGenls.toString());


        // getMinGenls mt.
        minGenls = null;

        try {
            CycConstantI lion = cycAccess.getLookupTool().getKnownConstantByGuid(LION_GUID_STRING);


            // #$BiologyVocabularyMt
            minGenls = cycAccess.getLookupTool().getMinGenls(lion,
                    cycAccess.getLookupTool().getKnownConstantByGuid(BIOLOGY_VOCABULARY_MT_GUID_STRING));
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(minGenls);
        assertTrue(minGenls instanceof CycArrayList);
        minGenls = ((CycArrayList) minGenls).sort();
        assertEquals("(FelidaeFamily)", minGenls.toString());

        // getSpecs.
        List specs = null;

        try {
            CycConstantI canineAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CANINE_ANIMAL_GUID_STRING);
            specs = cycAccess.getLookupTool().getSpecs(canineAnimal);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(specs);
        assertTrue(specs instanceof CycArrayList);
        final String specsString = specs.toString();
        for (final String name : Arrays.asList("CanisGenus", "Coyote-Animal", "Dog",
                "Fox", "Jackal")) {
            assertTrue(specsString.indexOf(name) > 0);
        }

        // getMaxSpecs.
        List maxSpecs = null;

        try {
            CycConstantI canineAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CANINE_ANIMAL_GUID_STRING);
            maxSpecs = cycAccess.getLookupTool().getMaxSpecs(canineAnimal);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(maxSpecs);
        assertTrue(maxSpecs instanceof CycArrayList);
        maxSpecs = ((CycArrayList) maxSpecs).sort();
        assertTrue(maxSpecs.toString().indexOf("CanisGenus") > 0);
        assertTrue(maxSpecs.toString().indexOf("Fox") > 0);

        // getGenlSiblings.

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            List genlSiblings = cycAccess.getLookupTool().getGenlSiblings(dog);
            assertNotNull(genlSiblings);
            assertTrue(genlSiblings instanceof CycArrayList);
            genlSiblings = ((CycArrayList) genlSiblings).sort();
            if (!cycAccess.isOpenCyc()) {
                assertTrue(genlSiblings.toString().indexOf("JuvenileAnimal") > -1);
            }
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }


        /* long running.
         // getSiblings.
         List siblings = null;
         try {
         CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid("bd58daa0-9c29-11b1-9dad-c379636f7270");
         siblings = cycAccess.getLookupTool().getSiblings(dog);
         assertNotNull(siblings);
         assertTrue(siblings instanceof CycArrayList);
         CycConstantI gooseDomestic = cycAccess.getLookupTool().getKnownConstantByGuid("bd5ca864-9c29-11b1-9dad-c379636f7270");
         assertTrue(siblings.contains(gooseDomestic));
         CycConstantI goatDomestic = cycAccess.getLookupTool().getKnownConstantByGuid("bd58e278-9c29-11b1-9dad-c379636f7270");
         assertTrue(siblings.contains(goatDomestic));
         }
         catch (Throwable e) {
         e.printStackTrace();
         fail(e.toString());
         }
         // getSpecSiblings.
         List specSiblings = null;
         try {
         CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid("bd58daa0-9c29-11b1-9dad-c379636f7270");
         specSiblings = cycAccess.getLookupTool().getSpecSiblings(dog);
         assertNotNull(specSiblings);
         assertTrue(specSiblings instanceof CycArrayList);
         CycConstantI gooseDomestic = cycAccess.getLookupTool().getKnownConstantByGuid("bd5ca864-9c29-11b1-9dad-c379636f7270");
         assertTrue(specSiblings.contains(gooseDomestic));
         CycConstantI goatDomestic = cycAccess.getLookupTool().getKnownConstantByGuid("bd58e278-9c29-11b1-9dad-c379636f7270");
         assertTrue(specSiblings.contains(goatDomestic));
         }
         catch (Throwable e) {
         fail(e.toString());
         }
         */

        // getAllGenls.

        try {
            CycConstantI existingObjectType = cycAccess.getLookupTool().getKnownConstantByGuid(
                    EXISTING_OBJECT_TYPE_GUID_STRING);
            List allGenls = cycAccess.getLookupTool().getAllGenls(existingObjectType);
            assertNotNull(allGenls);
            assertTrue(allGenls instanceof CycArrayList);

            CycConstantI objectType = cycAccess.getLookupTool().getKnownConstantByGuid(
                    OBJECT_TYPE_GUID_STRING);

            assertTrue(allGenls.contains(objectType));
            assertTrue(allGenls.contains(thing));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getAllSpecs.

        try {
            CycConstantI canineAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CANINE_ANIMAL_GUID_STRING);
            List allSpecs = cycAccess.getLookupTool().getAllSpecs(canineAnimal);
            assertNotNull(allSpecs);
            assertTrue(allSpecs instanceof CycArrayList);

            CycConstantI jackal = cycAccess.getLookupTool().getKnownConstantByGuid(JACKAL_GUID_STRING);
            assertTrue(allSpecs.contains(jackal));

            CycConstantI retrieverDog = cycAccess.getLookupTool().getKnownConstantByGuid(
                    RETRIEVER_DOG_GUID_STRING);
            assertTrue(allSpecs.contains(retrieverDog));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getAllGenlsWrt.

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid(ANIMAL_GUID_STRING);
            List allGenlsWrt = cycAccess.getLookupTool().getAllGenlsWrt(dog, animal);
            assertNotNull(allGenlsWrt);
            assertTrue(allGenlsWrt instanceof CycArrayList);

            CycConstantI tameAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    TAME_ANIMAL_GUID_STRING);
            assertTrue(allGenlsWrt.contains(tameAnimal));

            CycConstantI airBreathingVertebrate = cycAccess.getLookupTool().getKnownConstantByGuid(
                    AIR_BREATHING_VERTEBRATE_GUID_STRING);
            assertTrue(allGenlsWrt.contains(airBreathingVertebrate));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getAllDependentSpecs.

        try {
            CycConstantI canineAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CANINE_ANIMAL_GUID_STRING);
            List allDependentSpecs = cycAccess.getLookupTool().getAllDependentSpecs(canineAnimal);
            assertNotNull(allDependentSpecs);

            CycConstantI fox = cycAccess.getLookupTool().getKnownConstantByGuid(FOX_GUID_STRING);
            assertTrue(allDependentSpecs instanceof CycArrayList);
            assertTrue(allDependentSpecs.contains(fox));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getSampleLeafSpecs.
        List sampleLeafSpecs = null;

        try {
            CycConstantI canineAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CANINE_ANIMAL_GUID_STRING);
            sampleLeafSpecs = cycAccess.getLookupTool().getSampleLeafSpecs(canineAnimal, 3);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(sampleLeafSpecs);
        assertTrue(sampleLeafSpecs instanceof CycArrayList);


        //System.out.println("sampleLeafSpecs: " + sampleLeafSpecsArrayList);
        assertTrue(sampleLeafSpecs.size() > 0);

        // isSpecOf.
        boolean answer = true;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid(ANIMAL_GUID_STRING);
            answer = cycAccess.getInspectorTool().isSpecOf(dog, animal);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);


        // isGenlOf.
        answer = true;

        try {
            CycConstantI wolf = cycAccess.getLookupTool().getKnownConstantByGuid(WOLF_GUID_STRING);
            CycConstantI canineAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CANINE_ANIMAL_GUID_STRING);
            answer = cycAccess.getInspectorTool().isGenlOf(canineAnimal, wolf);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);


        // areTacitCoextensional.
        answer = true;

        try {
            CycConstantI singlePurposeDevice = cycAccess.getLookupTool().getKnownConstantByGuid(
                    SINGLE_PURPOSE_DEVICE_GUID_STRING);
            CycConstantI physicalDevice = cycAccess.getLookupTool().getKnownConstantByGuid(
                    PHYSICAL_DEVICE_GUID_STRING);


            //cycAccess.traceOn();
            answer = cycAccess.getComparisonTool().areTacitCoextensional(singlePurposeDevice,
                    physicalDevice);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(!answer);


        // areAssertedCoextensional.
        answer = true;

        try {
            CycConstantI singlePurposeDevice = cycAccess.getLookupTool().getKnownConstantByGuid(
                    SINGLE_PURPOSE_DEVICE_GUID_STRING);
            CycConstantI physicalDevice = cycAccess.getLookupTool().getKnownConstantByGuid(
                    PHYSICAL_DEVICE_GUID_STRING);
            answer = cycAccess.getComparisonTool().areAssertedCoextensional(singlePurposeDevice,
                    physicalDevice);
            if (!cycAccess.isOpenCyc()) {
                assertTrue(answer);
            }
        } catch (Throwable e) {
            fail(e.toString());
        }

        // areIntersecting.
        answer = true;

        //cycAccess.traceOn();
        try {
            CycConstantI domesticatedAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    DOMESTICATED_ANIMAL_GUID_STRING);
            CycConstantI tameAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    TAME_ANIMAL_GUID_STRING);
            answer = cycAccess.getComparisonTool().areIntersecting(domesticatedAnimal, tameAnimal);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);


        //cycAccess.traceOff();
        // areHierarchical.
        answer = true;

        try {
            CycConstantI wolf = cycAccess.getLookupTool().getKnownConstantByGuid(WOLF_GUID_STRING);
            CycConstantI canineAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    CANINE_ANIMAL_GUID_STRING);
            answer = cycAccess.getComparisonTool().areHierarchical(canineAnimal, wolf);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);

    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess4() {
        System.out.println("\n**** testBinaryCycAccess 4 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }


            //cycAccess.traceOnDetailed();
            doTestCycAccess4(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
            }
        }
        System.out.println("**** testBinaryCycAccess 4 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess4(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();
        resetCycConstantCaches();

        // getCollectionLeaves.

        try {
            //cycAccess.traceOnDetailed();
            CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid(ANIMAL_GUID_STRING);
            List collectionLeaves = cycAccess.getLookupTool().getCollectionLeaves(animal);
            assertNotNull(collectionLeaves);
            assertTrue(collectionLeaves instanceof CycArrayList);
            //cycAccess.traceOff();
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getWhyGenl.
        CycList whyGenl = null;

        try {
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid(ANIMAL_GUID_STRING);
            whyGenl = cycAccess.getLookupTool().getWhyGenl(dog, animal);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(whyGenl);
        System.out.println("whyGenl " + whyGenl);

        /*
         CycSymbol whyGenlFirst = (CycSymbol) ((CycArrayList) ((CycArrayList) whyGenl.first()).first()).second();
         CycSymbol whyGenlLast = (CycSymbol) ((CycArrayList) ((CycArrayList) whyGenl.last()).first()).third();
         try {
         CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid("bd58daa0-9c29-11b1-9dad-c379636f7270");
         assertEquals(dog, whyGenlFirst);
         CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid("bd58b031-9c29-11b1-9dad-c379636f7270");
         assertEquals(animal, whyGenlLast);
         }
         catch (Throwable e) {
         fail(e.toString());
         }
         */

        // getWhyCollectionsIntersect.

        try {
            CycConstantI domesticatedAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    DOMESTICATED_ANIMAL_GUID_STRING);
            CycConstantI nonPersonAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    NON_PERSON_ANIMAL_GUID_STRING);
            List whyCollectionsIntersect = cycAccess.getLookupTool().getWhyCollectionsIntersect(
                    domesticatedAnimal, nonPersonAnimal);
            assertNotNull(whyCollectionsIntersect);
            assertTrue(whyCollectionsIntersect instanceof CycArrayList);
            System.out.println("whyCollectionsIntersect " + whyCollectionsIntersect);

            CycList expectedWhyCollectionsIntersect = cycAccess.getObjectTool().makeCycList(
                    "(((#$genls #$DomesticatedAnimal #$TameAnimal) :TRUE) "
                    + "((#$genls #$TameAnimal #$NonPersonAnimal) :TRUE))");

            /**
             * assertEquals(expectedWhyCollectionsIntersect.toString(),
             * whyCollectionsIntersect.toString());
             * assertEquals(expectedWhyCollectionsIntersect,
             * whyCollectionsIntersect);
             */
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getLocalDisjointWith.

        try {
            CycConstantI vegetableMatter = cycAccess.getLookupTool().getKnownConstantByGuid(
                    VEGETABLE_MATTER_GUID_STRING);
            List localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
            assertNotNull(localDisjointWiths);
            assertTrue(localDisjointWiths.toString().indexOf("AnimalBLO") > 0);
        } catch (Throwable e) {
            fail(e.toString());
        }

        // areDisjoint.
        boolean answer = true;

        try {
            CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid(ANIMAL_GUID_STRING);
            CycConstantI plant = cycAccess.getLookupTool().getKnownConstantByGuid(PLANT_GUID_STRING);
            answer = cycAccess.getComparisonTool().areDisjoint(animal, plant);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);

        // getMinIsas.

        try {
            CycConstantI wolf = cycAccess.getLookupTool().getKnownConstantByGuid(WOLF_GUID_STRING);
            List minIsas = cycAccess.getLookupTool().getMinIsas(wolf);

            CycConstantI organismClassificationType = cycAccess.getLookupTool().getKnownConstantByGuid(
                    ORGANISM_CLASSIFICATION_TYPE_GUID_STRING);
            assertTrue(minIsas.contains(organismClassificationType));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getInstances.

        try {
            CycConstantI maleHuman = cycAccess.getLookupTool().getKnownConstantByGuid(
                    MALE_HUMAN_GUID_STRING);
            List instances = cycAccess.getLookupTool().getInstances(maleHuman);
            assertTrue(instances instanceof CycArrayList);

            CycConstantI plato = cycAccess.getLookupTool().getKnownConstantByGuid(PLATO_GUID_STRING);
            assertTrue(((CycArrayList) instances).contains(plato));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getAllIsa.

        try {
            //cycAccess.traceOn();
            CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid(ANIMAL_GUID_STRING);
            List allIsas = cycAccess.getLookupTool().getAllIsa(animal);

            //System.out.println(allIsas);
            CycConstantI organismClassificationType = cycAccess.getLookupTool().getKnownConstantByGuid(
                    ORGANISM_CLASSIFICATION_TYPE_GUID_STRING);
            assertTrue(allIsas.contains(organismClassificationType));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // getAllInstances.

        try {
            if (!cycAccess.isOpenCyc()) {
                CycConstantI plant = cycAccess.getLookupTool().getKnownConstantByGuid(PLANT_GUID_STRING);
                List allPlants = cycAccess.getLookupTool().getAllInstances(plant);

                CycConstantI treatyOak = cycAccess.getLookupTool().getKnownConstantByGuid(
                        TREATY_OAK_GUID_STRING);
                assertTrue(allPlants.contains(treatyOak));

                CycConstantI burningBushOldTestament = cycAccess.getLookupTool().getKnownConstantByGuid(
                        BURNING_BUSH_GUID_STRING);
                assertTrue(allPlants.contains(burningBushOldTestament));
            }
        } catch (Throwable e) {
            fail(e.toString());
        }


        // isa.

        try {
            if (!cycAccess.isOpenCyc()) {
                CycConstantI plant = cycAccess.getLookupTool().getKnownConstantByGuid(PLANT_GUID_STRING);
                CycConstantI treatyOak = cycAccess.getLookupTool().getKnownConstantByGuid(
                        TREATY_OAK_GUID_STRING);
                answer = cycAccess.getInspectorTool().isa(treatyOak, plant);
                assertTrue(answer);

                final CycConstantI term1 = cycAccess.getLookupTool().getKnownConstantByName(
                        "NthSubSituationTypeOfTypeFn");
                final CycConstantI term2 = cycAccess.getLookupTool().getKnownConstantByName(
                        "PreparingFoodItemFn");
                final CycConstantI term3 = cycAccess.getLookupTool().getKnownConstantByName(
                        "SpaghettiMarinara");
                final CycConstantI term4 = cycAccess.getLookupTool().getKnownConstantByName(
                        "FluidFlow-Complete");
                final CycConstantI collection = cycAccess.getLookupTool().getKnownConstantByName(
                        "Collection");
                final CycConstantI mt = cycAccess.getLookupTool().getKnownConstantByName(
                        "HumanActivitiesMt");
                final CycNart nart1 = new CycNart(term2, term3);
                final CycArrayList nartList = new CycArrayList();
                nartList.add(term1);
                nartList.add(nart1);
                nartList.add(term4);
                nartList.add(2);
                final CycNart nart2 = new CycNart(nartList);

                //(ISA? (QUOTE (NthSubSituationTypeOfTypeFn (PreparingFoodItemFn SpaghettiMarinara) FluidFlow-Complete 2)) Collection HumanActivitiesMt)
                answer = cycAccess.getInspectorTool().isa(nart2, collection, mt);
                assertTrue(answer);
            }
        } catch (Throwable e) {
            fail(e.toString());
        }


        // getWhyCollectionsIntersectParaphrase.
        ArrayList whyCollectionsIntersectParaphrase = null;

        try {
            //cycAccess.traceOn();
            CycConstantI domesticatedAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    DOMESTICATED_ANIMAL_GUID_STRING);
            CycConstantI nonPersonAnimal = cycAccess.getLookupTool().getKnownConstantByGuid(
                    NON_PERSON_ANIMAL_GUID_STRING);
            System.out.println("bypassing getWhyCollectionsIntersectParaphrase");

            /*
             whyCollectionsIntersectParaphrase =
             cycAccess.getLookupTool().getWhyCollectionsIntersectParaphrase(domesticatedAnimal, nonPersonAnimal);
             */
        } catch (Throwable e) {
            fail(e.toString());
        }

        /*
         assertNotNull(whyCollectionsIntersectParaphrase);
         String oneExpectedCollectionsIntersectParaphrase =
         "every domesticated animal (tame animal) is a tame animal";
         //System.out.println(whyCollectionsIntersectParaphrase);
         assertTrue(whyCollectionsIntersectParaphrase.contains(oneExpectedCollectionsIntersectParaphrase));
         */

        // getWhyGenlParaphrase.
        ArrayList whyGenlParaphrase = null;

        try {
            //cycAccess.traceOn();
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid(ANIMAL_GUID_STRING);
            System.out.println("bypassing getWhyGenlParaphrase");

            /*
             whyGenlParaphrase = cycAccess.getLookupTool().getWhyGenlParaphrase(dog, animal);
             */
        } catch (Throwable e) {
            fail(e.toString());
        }

        /*
         assertNotNull(whyGenlParaphrase);
         String oneExpectedGenlParaphrase =
         "every tame animal is a non-human animal";
    
         //for (int i = 0; i < whyGenlParaphrase.size(); i++) {
         //    System.out.println(whyGenlParaphrase.get(i));
         //}
    
         assertTrue(whyGenlParaphrase.contains(oneExpectedGenlParaphrase));
         */
        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    @Test
    public void testExecuteQueryWithClosedCycAccess() {
        try {
            final CycAccess cyc = new CycClient(TestUtils.testHostName,
                    TestUtils.testBasePort);
            final FormulaSentence query = cyc.getObjectTool().makeCycSentence(WHAT_IS_IN_AUSTIN);
            final CycVariable what = CycObjectFactory.makeCycVariable("WHAT");
            cyc.getCycConnection().close();
            cyc.getInferenceTool().queryVariable(what, query, everythingPSC, null, 15000);
        } catch (CycApiClosedConnectionException e) {
            fail("Failed to recover from closed Cyc connection.");
        } catch (Throwable e) {
            fail(e.toString());
        }
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess5() {
        System.out.println("\n**** testBinaryCycAccess 5 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    // cycAccess = new CycClient(new SocketCommRoundRobin());
                    System.out.println("This test case does not work with SocketCommRoundRobin because the interleaved commands have dependency on each other.");
                    return;
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }


            //cycAccess.traceOnDetailed();
            doTestCycAccess5(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
            }
        }
        System.out.println("**** testBinaryCycAccess 5 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess5(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();
        resetCycConstantCaches();

        //cycAccess.traceOn();
        // createNewPermanent.
        CycConstantI cycConstant = null;
        //cycAccess.traceNamesOn();

        try {
            cycAccess.setCyclist("#$CycAdministrator");
            cycAccess.setKePurpose("#$GeneralCycKE");
            cycConstant = cycAccess.getAssertTool().createNewPermanent("CycAccessTestConstant");
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        assertNotNull(cycConstant);
        assertEquals("CycAccessTestConstant", cycConstant.getName());

        // kill.
        try {
            cycAccess.getUnassertTool().kill(cycConstant);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }


        // assertComment.
        cycConstant = null;

        try {
            cycConstant = cycAccess.getAssertTool().createNewPermanent("CycAccessTestConstant");
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        assertNotNull(cycConstant);
        assertEquals("CycAccessTestConstant", cycConstant.getName());

        CycConstantI baseKb = null;

        try {
            baseKb = cycAccess.getLookupTool().getConstantByName("BaseKB");
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(baseKb);
        assertEquals("BaseKB", baseKb.getName());

        String assertedComment = "A test comment";

        try {
            cycAccess.getAssertTool().assertComment(cycConstant, assertedComment, baseKb);
        } catch (Throwable e) {
            fail(e.toString());
        }

        String comment = null;

        try {
            comment = cycAccess.getLookupTool().getComment(cycConstant);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertEquals(assertedComment, comment);

        try {
            cycAccess.getUnassertTool().kill(cycConstant);
        } catch (Throwable e) {
            fail(e.toString());
        }

        try {
            assertNull(cycAccess.getLookupTool().getConstantByName("CycAccessTestConstant"));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // isValidConstantName.
        boolean answer = true;

        try {
            answer = cycAccess.getInspectorTool().isValidConstantName("abc");
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);

        answer = true;

        try {
            answer = cycAccess.getInspectorTool().isValidConstantName(" abc");
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(!answer);

        answer = true;

        try {
            answer = cycAccess.getInspectorTool().isValidConstantName("[abc]");
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(!answer);


        // isConstantNameAvailable
        answer = true;

        try {
            answer = cycAccess.getInspectorTool().isConstantNameAvailable("Agent-PartiallyTangible");
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(!answer);

        answer = false;

        try {
            answer = cycAccess.getInspectorTool().isConstantNameAvailable("myAgent");
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(answer);

        // createMicrotheory.
        CycConstantI mt = null;
        ArrayList genlMts = new ArrayList();

        try {
            CycConstantI modernMilitaryMt = cycAccess.getLookupTool().getKnownConstantByGuid(
                    MODERN_MILITARY_MT_GUID_STRING);
            CycConstantI microtheory = cycAccess.getLookupTool().getKnownConstantByGuid(
                    MICROTHEORY_GUID_STRING);
            genlMts.add(modernMilitaryMt);
            mt = cycAccess.getAssertTool().createMicrotheory("CycAccessTestMt",
                    "a unit test comment for the CycAccessTestMt microtheory.",
                    microtheory, genlMts);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertNotNull(mt);

        try {
            cycAccess.getUnassertTool().kill(mt);
        } catch (Throwable e) {
            fail(e.toString());
        }

        try {
            assertNull(cycAccess.getLookupTool().getConstantByName("CycAccessTestMt"));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // createMicrotheorySystem.
        CycConstantI[] mts = {null, null, null};
        genlMts = new ArrayList();

        try {
            genlMts.add(baseKB);
            mts = cycAccess.getAssertTool().createMicrotheorySystem("CycAccessTest",
                    "a unit test comment for the CycAccessTestMt microtheory.",
                    genlMts);
        } catch (Throwable e) {
            fail(e.toString());
        }

        assertTrue(mts.length == 3);
        assertNotNull(mts[0]);
        assertEquals("#$CycAccessTestMt", mts[0].cyclify());
        assertNotNull(mts[1]);
        assertEquals("#$CycAccessTestVocabMt", mts[1].cyclify());
        assertNotNull(mts[2]);
        assertEquals("#$CycAccessTestDataMt", mts[2].cyclify());

        try {
            cycAccess.getUnassertTool().kill(mts);
        } catch (Throwable e) {
            fail(e.toString());
        }

        try {
            assertNull(cycAccess.getLookupTool().getConstantByName("CycAccessTestMt"));
        } catch (Throwable e) {
            fail(e.toString());
        }

        // executeQuery
        try {
            if (!cycAccess.isOpenCyc()) {
                FormulaSentence query = cycAccess.getObjectTool().makeCycSentence(WHAT_IS_IN_AUSTIN);
                mt = (CycConstant) everythingPSC;

                InferenceParameters queryProperties = new DefaultInferenceParameters(
                        cycAccess);
                InferenceResultSet response = cycAccess.getInferenceTool().executeQuery(query,
                        cycAccess.getObjectTool().makeELMt(mt), queryProperties, 20000);
                assertNotNull(response);


                //System.out.println("query: " + query + "\n  response: " + response);
                queryProperties.setMaxNumber(4);
                queryProperties.put(makeCycSymbol(":max-time"), 30);
                queryProperties.put(makeCycSymbol(":max-transformation-depth"), 1);
                queryProperties.put(makeCycSymbol(":max-proof-depth"), 20);
                response = cycAccess.getInferenceTool().executeQuery(query, cycAccess.getObjectTool().makeELMt(mt),
                        queryProperties, 20000);
                //System.out.println("query: " + query + "\n  response: " + response);  
                assertTrue(response.getCurrentRowCount() > 3);
            }
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }
        
        // executeQuery with query pragma
        try {
            if (!cycAccess.isOpenCyc()) {
                FormulaSentence query = cycAccess.getObjectTool().makeCycSentence(WHAT_IS_IN_AUSTIN);
                mt = (CycConstant) everythingPSC;

                InferenceParameters queryProperties = new DefaultInferenceParameters(
                        cycAccess);
                queryProperties.put(CycObjectFactory.makeCycSymbol(":non-explanatory-sentence"),
                        cycAccess.getObjectTool().makeCycSentence("(#$unknownSentence (#$isa ?WHAT #$FoodServiceOrganization))"));
                InferenceResultSet response = cycAccess.getInferenceTool().executeQuery(query,
                        cycAccess.getObjectTool().makeELMt(mt), queryProperties, 20000);
                assertNotNull(response);
            }
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        // queryResultsToXMLString
        try {
            FormulaSentence query = cycAccess.getObjectTool().makeCycSentence(
                    "(#$isa #$Person ?WHAT)");
            InferenceParameters queryProperties = new DefaultInferenceParameters(
                    cycAccess);
            final CycArrayList xmlSpec = null;
            final String xml = cycAccess.getInferenceTool().queryResultsToXMLString(query,
                    universalVocabularyMt, queryProperties, xmlSpec);
            System.out.println("xml from queryResultsToXMLStream:\n" + xml);
            assertNotNull(xml);
            assertTrue(xml.indexOf("<what>") > -1);
            assertTrue(xml.indexOf("</what>") > -1);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }


        // askWithVariable
        try {
            if (!cycAccess.isOpenCyc()) {
                FormulaSentence query = cycAccess.getObjectTool().makeCycSentence(
                        WHAT_IS_IN_AUSTIN);
                CycVariable variable = makeCycVariable("?WHAT");
                mt = (CycConstant) CommonConstants.everythingPSC;
                InferenceParameters queryProperties = new DefaultInferenceParameters(
                        cycAccess);
                CycList response = cycAccess.getInferenceTool().queryVariable(variable, query, mt,
                        queryProperties);
                assertNotNull(response);
                assertTrue(response.contains(cycAccess.getLookupTool().getConstantByName(
                        "#$UniversityOfTexasAtAustin")));
            }
        } catch (Throwable e) {
            fail(e.toString());
        }

        // askWithVariables
        try {
            if (!cycAccess.isOpenCyc()) {
                FormulaSentence query = cycAccess.getObjectTool().makeCycSentence(
                        "(#$objectFoundInLocation ?WHAT ?WHERE)");
                CycArrayList variables = new CycArrayList();
                variables.add(makeCycVariable("?WHAT"));
                variables.add(makeCycVariable("?WHERE"));
                InferenceParameters queryProperties = new DefaultInferenceParameters(
                        cycAccess);
                CycConstantI universeDataMt = cycAccess.getLookupTool().getKnownConstantByGuid(
                        UNIVERSE_DATA_MT_GUID_STRING);
                CycList response = cycAccess.getInferenceTool().queryVariables(variables, query,
                        universeDataMt, queryProperties);
                assertNotNull(response);
            }
        } catch (Throwable e) {
            fail(e.toString());
        }

        // isQueryTrue
        try {
            if (!cycAccess.isOpenCyc()) {
                //cycAccess.traceOn();
                FormulaSentence query = cycAccess.getObjectTool().makeCycSentence(
                        "(#$objectFoundInLocation #$UniversityOfTexasAtAustin #$CityOfAustinTX)");
                mt = (CycConstant) everythingPSC;
                InferenceParameters queryProperties = new DefaultInferenceParameters(
                        cycAccess);
                assertTrue(cycAccess.getInferenceTool().isQueryTrue(query, mt, queryProperties));
                query = cycAccess.getObjectTool().makeCycSentence(
                        "(#$objectFoundInLocation #$UniversityOfTexasAtAustin #$CityOfHoustonTX)");
                assertTrue(!cycAccess.getInferenceTool().isQueryTrue(query, mt, queryProperties));
            }
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        // countAllInstances
        try {
            CycConstantI country = cycAccess.getLookupTool().getKnownConstantByGuid(COUNTRY_GUID_STRING);
            CycConstantI worldGeographyMt = cycAccess.getLookupTool().getKnownConstantByGuid(
                    WORLD_GEOGRAPHY_MT_GUID_STRING);
            assertTrue(cycAccess.getInspectorTool().countAllInstances(country, worldGeographyMt) > 0);
        } catch (Throwable e) {
            fail(e.toString());
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess6() {
        System.out.println("\n**** testBinaryCycAccess 6 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }


            //cycAccess.traceOnDetailed();
            doTestCycAccess6(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
            }
        }
        System.out.println("**** testBinaryCycAccess 6 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess6(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();

        // Test sending a constant to Cyc.
        try {
            CycArrayList command = new CycArrayList();
            command.add(makeCycSymbol("identity"));
            command.add(collection);

            Object obj = cycAccess.converse().converseObject(command);
            assertNotNull(obj);
            assertTrue(obj instanceof CycConstant);
            assertEquals(obj, collection);
        } catch (Throwable e) {
            fail(e.toString());
        }

        // Test isBackchainRequired, isBackchainEncouraged, isBackchainDiscouraged, isBackchainForbidden
        try {
            if (!cycAccess.isOpenCyc()) {
                CycConstantI keRequirement = cycAccess.getLookupTool().getKnownConstantByGuid(
                        KE_REQUIREMENT_GUID_STRING);
                assertTrue(cycAccess.getInspectorTool().isBackchainRequired(keRequirement, baseKB));
                assertTrue(!cycAccess.getInspectorTool().isBackchainEncouraged(keRequirement, baseKB));
                assertTrue(!cycAccess.getInspectorTool().isBackchainDiscouraged(keRequirement, baseKB));
                assertTrue(!cycAccess.getInspectorTool().isBackchainForbidden(keRequirement, baseKB));

                CycConstantI nearestIsa = cycAccess.getLookupTool().getKnownConstantByGuid(
                        NEAREST_ISA_GUID_STRING);
                assertTrue(!cycAccess.getInspectorTool().isBackchainRequired(nearestIsa, baseKB));
                assertTrue(!cycAccess.getInspectorTool().isBackchainEncouraged(nearestIsa, baseKB));
                assertTrue(!cycAccess.getInspectorTool().isBackchainDiscouraged(nearestIsa, baseKB));
                assertTrue(cycAccess.getInspectorTool().isBackchainForbidden(nearestIsa, baseKB));
            }
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        // isWellFormedFormula
        try {
            assertTrue(cycAccess.getInspectorTool().isWellFormedFormula(cycAccess.getObjectTool().makeCycSentence(
                    "(#$genls #$Dog #$Animal)")));


            // Not true, but still well formed.
            assertTrue(cycAccess.getInspectorTool().isWellFormedFormula(cycAccess.getObjectTool().makeCycSentence(
                    "(#$genls #$Dog #$Plant)")));
            assertTrue(cycAccess.getInspectorTool().isWellFormedFormula(cycAccess.getObjectTool().makeCycSentence(
                    "(#$genls ?X #$Animal)")));
            assertTrue(!cycAccess.getInspectorTool().isWellFormedFormula(
                    cycAccess.getObjectTool().makeCycSentence("(#$genls #$Dog #$Brazil)")));
            assertTrue(!cycAccess.getInspectorTool().isWellFormedFormula(
                    cycAccess.getObjectTool().makeCycSentence("(#$genls ?X #$Brazil)")));
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        // isEvaluatablePredicate
        try {
            assertTrue(cycAccess.getInspectorTool().isEvaluatablePredicate(different));

            CycConstantI doneBy = cycAccess.getLookupTool().getKnownConstantByGuid(DONE_BY_GUID_STRING);
            assertTrue(!cycAccess.getInspectorTool().isEvaluatablePredicate(
                    doneBy));
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        // hasSomePredicateUsingTerm
        try {
            if (!cycAccess.isOpenCyc()) {
                CycConstantI algeria = cycAccess.getLookupTool().getKnownConstantByGuid(
                        ALGERIA_GUID_STRING);
                CycConstantI percentOfRegionIs = cycAccess.getLookupTool().getKnownConstantByGuid(
                        PERCENT_OF_REGION_IS_GUID_STRING);
                CycConstantI ciaWorldFactbook1995Mt = cycAccess.getLookupTool().getKnownConstantByGuid(
                        CIA_WORLD_FACTBOOK_1995_MT_GUID_STRING);

                assertTrue(cycAccess.getLookupTool().hasSomePredicateUsingTerm(
                        percentOfRegionIs,
                        algeria,
                        1,
                        ciaWorldFactbook1995Mt));

                assertTrue(cycAccess.getLookupTool().hasSomePredicateUsingTerm(
                        percentOfRegionIs,
                        algeria,
                        1,
                        inferencePSC));
                assertTrue(!cycAccess.getLookupTool().hasSomePredicateUsingTerm(
                        percentOfRegionIs,
                        algeria,
                        2,
                        ciaWorldFactbook1995Mt));
            }
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        // Test common constants.
        try {
            assertEquals(cycAccess.getLookupTool().getConstantByName("and"), and);
            assertEquals(cycAccess.getLookupTool().getConstantByName("BaseKB"), baseKB);
            assertEquals(cycAccess.getLookupTool().getConstantByName("BinaryPredicate"),
                    binaryPredicate);
            assertEquals(cycAccess.getLookupTool().getConstantByName("comment"), comment);
            assertEquals(cycAccess.getLookupTool().getConstantByName("different"), different);
            assertEquals(cycAccess.getLookupTool().getConstantByName("elementOf"), elementOf);
            assertEquals(cycAccess.getLookupTool().getConstantByName("genlMt"), genlMt);
            assertEquals(cycAccess.getLookupTool().getConstantByName("genls"), genls);
            assertEquals(cycAccess.getLookupTool().getConstantByName("isa"), isa);
            assertEquals(cycAccess.getLookupTool().getConstantByName("numericallyEquals"),
                    numericallyEqual);
            assertEquals(cycAccess.getLookupTool().getConstantByName("or"), or);
            assertEquals(cycAccess.getLookupTool().getConstantByName("PlusFn"), plusFn);

            resetCycConstantCaches();

            assertEquals(cycAccess.getLookupTool().getConstantByName("and"), and);
            assertEquals(cycAccess.getLookupTool().getConstantByName("BaseKB"), baseKB);
            assertEquals(cycAccess.getLookupTool().getConstantByName("BinaryPredicate"),
                    binaryPredicate);
            assertEquals(cycAccess.getLookupTool().getConstantByName("comment"), comment);
            assertEquals(cycAccess.getLookupTool().getConstantByName("different"), different);
            assertEquals(cycAccess.getLookupTool().getConstantByName("elementOf"), elementOf);
            assertEquals(cycAccess.getLookupTool().getConstantByName("genlMt"), genlMt);
            assertEquals(cycAccess.getLookupTool().getConstantByName("genls"), genls);
            assertEquals(cycAccess.getLookupTool().getConstantByName("isa"), isa);
            assertEquals(cycAccess.getLookupTool().getConstantByName("numericallyEquals"),
                    numericallyEqual);
            assertEquals(cycAccess.getLookupTool().getConstantByName("or"), or);
            assertEquals(cycAccess.getLookupTool().getConstantByName("PlusFn"), plusFn);
        } catch (Throwable e) {
            fail(e.toString());
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     *
     * TODO associated the Cyc user state with the java client uuid, then put
     * these tests back.
     */
    @Test
    public void testBinaryCycAccess7() {
        if (connectionMode == SOAP_CYC_CONNECTION) {
            System.out.println(
                    "\n**** bypassing testBinaryCycAccess 7 in XML SOAP usage ****");

            return;
        }

        System.out.println("\n**** testBinaryCycAccess 7 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    //cycAccess = new CycClient(new SocketCommRoundRobin());
                    System.out.println("This test case does not work with SocketCommRoundRobin because the interleaved commands have dependency on each other.");
                    return;
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }
            doTestCycAccess7(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
            }
        }
        System.out.println("**** testBinaryCycAccess 7 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * N O T E be sure that the test system is clean of the special symbols
     * introduced in the test. E.G. MY-MACRO, A, B, C
     *
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess7(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();
        resetCycConstantCaches();

        //cycAccess.traceOn();
        // SubL scripts
        try {
            if (!cycAccess.isOpenCyc()) {
                //cycAccess.traceNamesOn();
                String script = null;
                // Java ByteArray  and SubL byte-vector are used only in the binary api.
                script = "(csetq my-byte-vector (vector 0 1 2 3 4 255))";

                Object responseObject = cycAccess.converse().converseObject(script);
                assertNotNull(responseObject);
                assertTrue(responseObject instanceof ByteArray);

                byte[] myBytes = {0, 1, 2, 3, 4, -1};
                ByteArray myByteArray = new ByteArray(myBytes);
                assertEquals(myByteArray, responseObject);

                CycArrayList command = new CycArrayList();
                command.add(makeCycSymbol("equalp"));
                command.add(makeCycSymbol("my-byte-vector"));

                CycArrayList command1 = new CycArrayList();
                command.add(command1);
                command1.add(quote);
                command1.add(myByteArray);
                assertTrue(cycAccess.converse().converseBoolean(command));
            }
            String script;
            Object responseObject;
            CycList responseList;
            String responseString;
            boolean responseBoolean;

            // definition
            script = "(define my-copy-tree (tree) \n" + "  (ret \n" + "    (fif (atom tree) \n"
                    + "         tree \n" + "         ;; else \n"
                    + "         (cons (my-copy-tree (first tree)) \n"
                    + "               (my-copy-tree (rest tree))))))";
            testObjectScript(cycAccess, script, makeCycSymbol("my-copy-tree"));
            script = "(define my-floor (x y) \n" + "  (clet (results) \n"
                    + "    (csetq results (multiple-value-list (floor x y))) \n"
                    + "    (ret results)))";
            testObjectScript(cycAccess, script, makeCycSymbol("my-floor"));
            script = "(my-floor 5 3)";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 2)"));

            script = "(defmacro my-macro (a b c) \n" + "  (ret `(list ,a ,b ,c)))";
            testObjectScript(cycAccess, script, makeCycSymbol("my-macro"));
            script = "(my-macro #$Dog #$Plant #$Brazil)";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                    "(#$Dog #$Plant #$Brazil)"));

            script = "(defmacro my-floor-macro (x y) \n" + "  (ret `(floor ,x ,y)))";
            testObjectScript(cycAccess, script, makeCycSymbol("my-floor-macro"));
            script = "(define my-floor-macro-test (x y) \n" + "    (ret (multiple-value-list (my-floor-macro x y))))";
            testObjectScript(cycAccess, script, makeCycSymbol("my-floor-macro-test"));
            script = "(my-floor-macro-test 5 3)";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 2)"));

            script = "(defmacro my-floor-macro (x y) \n" + "  (ret `(floor ,x ,y)))";
            testObjectScript(cycAccess, script, makeCycSymbol("my-floor-macro"));
            script = "(my-floor-macro-test 5 3)";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 2)"));

            // assignment

            /**
             * TODO: Use of the task processor means that CSETQ statements
             * appear inside of a CLET wrapper. Need a way to set global
             * variables. Current method removes the effect of CSETQ if setting
             * a new variable.
             *
             */
            if (!cycAccess.isOpenCyc()) {
                script = "(csetq a '(1 #$Dog #$Plant))";
                cycAccess.converse().converseVoid(script);
                script = "(symbol-value 'a)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(1 #$Dog #$Plant)"));

                script = "(csetq a -1)";
                cycAccess.converse().converseVoid(script);
                script = "(symbol-value 'a)";
                testObjectScript(cycAccess, script, -1);

                script = "(csetq a '(1 #$Dog #$Plant) \n" + "       b '(2 #$Dog #$Plant) \n" + "       c 3)";
                cycAccess.converse().converseVoid(script);
                script = "(symbol-value 'a)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(1 #$Dog #$Plant)"));
                script = "(symbol-value 'b)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(2 #$Dog #$Plant)"));
                script = "(symbol-value 'c)";
                testObjectScript(cycAccess, script, 3);

                script = "(clet ((a 0)) (cinc a) a)";
                assertEquals(1, cycAccess.converse().converseObject(script));

                script = "(clet ((a 0)) (cinc a 10) a)";
                assertEquals(10, cycAccess.converse().converseObject(script));

                script = "(clet ((a 0)) (cdec a) a)";
                assertEquals(-1, cycAccess.converse().converseObject(script));

                script = "(clet ((a 0)) (cdec a 10) a)";
                assertEquals(-10, cycAccess.converse().converseObject(script));

                script = "(cpush 4 a)";
                cycAccess.converse().converseVoid(script);
                script = "(symbol-value 'a)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(4 1 #$Dog #$Plant)"));

                script = "(cpop a)";
                cycAccess.converse().converseVoid(script);
                script = "(symbol-value 'a)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(1 #$Dog #$Plant)"));

                script = "(fi-set-parameter 'my-parm '(1 #$Dog #$Plant))";
                cycAccess.converse().converseVoid(script);
                script = "(symbol-value 'my-parm)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(1 #$Dog #$Plant)"));

                script = "(clet (a b) \n" + "  (csetq a '(1 2 3)) \n" + "  (csetq b (cpop a)) \n" + "  (list a b))";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("((2 3) (2 3))"));
            }

            // boundp
            if (!cycAccess.isOpenCyc()) {
                final Random random = new Random();
                CycSymbol symbol = makeCycSymbol(
                        "test-symbol-for-value-binding" + random.nextInt());
                assertTrue(!cycAccess.converse().converseBoolean("(boundp '" + symbol + ")"));
                cycAccess.converse().converseVoid("(csetq " + symbol + " nil)");
                assertTrue(cycAccess.converse().converseBoolean("(boundp '" + symbol + ")"));
            }

            // fi-get-parameter
            if (!cycAccess.isOpenCyc()) {
                script = "(csetq my-parm '(2 #$Dog #$Plant))";
                cycAccess.converse().converseVoid(script);
                script = "(fi-get-parameter 'my-parm)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(2 #$Dog #$Plant)"));
            }

            // eval
            script = "(eval '(csetq a 4))";
            testObjectScript(cycAccess, script, 4);
            script = "(eval 'a)";
            testObjectScript(cycAccess, script, 4);

            script = "(eval (list 'csetq 'a 5))";
            testObjectScript(cycAccess, script, 5);
            script = "(eval 'a)";
            testObjectScript(cycAccess, script, 5);

            // apply
            script = "(apply #'+ '(1 2 3))";
            testObjectScript(cycAccess, script, 6);

            script = "(apply #'+ 1 2 '(3 4 5))";
            testObjectScript(cycAccess, script, 15);

            script = "(apply (function +) '(1 2 3))";
            testObjectScript(cycAccess, script, 6);

            script = "(apply (function +) 1 2 '(3 4 5))";
            testObjectScript(cycAccess, script, 15);

            script = "(apply #'my-copy-tree '((1 (2 (3)))))";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 (2 (3)))"));


            // funcall
            script = "(funcall #'+ 1 2 3)";
            testObjectScript(cycAccess, script, 6);

            script = "(funcall (function +) 1 2 3)";
            final int expected = 6;
            testObjectScript(cycAccess, script, expected);

            script = "(funcall #'first '(1 (2 (3))))";
            responseObject = cycAccess.converse().converseObject(script);
            assertEquals("1", responseObject.toString());

            script = "(funcall #'my-copy-tree '(1 (2 (3))))";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 (2 (3)))"));

            // multiple values
            script = "(multiple-value-list (floor 5 3))";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 2)"));

            if (!cycAccess.isOpenCyc()) {
                script = "(csetq answer nil)";
                testObjectScript(cycAccess, script, nil);

                script = "(cmultiple-value-bind (a b) \n" + "    (floor 5 3) \n" + "  (csetq answer (list a b)))";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 2)"));
                script = "(symbol-value 'answer)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 2)"));

                script = "(define my-multiple-value-fn (arg1 arg2) \n"
                        + "  (ret (values arg1 arg2 (list arg1 arg2) 0)))";
                testObjectScript(cycAccess, script, makeCycSymbol(
                        "my-multiple-value-fn"));

                script = "(my-multiple-value-fn #$Brazil #$Dog)";
                testObjectScript(cycAccess, script, cycAccess.getLookupTool().getKnownConstantByGuid(
                        BRAZIL_GUID_STRING));

                script = "(cmultiple-value-bind (a b c d) \n" + "    (my-multiple-value-fn #$Brazil #$Dog) \n"
                        + "  (csetq answer (list a b c d)))";
                testListScript(
                        cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(#$Brazil #$Dog (#$Brazil #$Dog) 0)"));
                script = "(symbol-value 'answer)";
                testListScript(
                        cycAccess, script, cycAccess.getObjectTool().makeCycList(
                        "(#$Brazil #$Dog (#$Brazil #$Dog) 0)"));
            }

            // arithmetic
            script = "(add1 2)";
            testObjectScript(cycAccess, script, 3);

            script = "(eq (add1 2) 3)";
            assertTrue(cycAccess.converse().converseBoolean(script));

            script = "(sub1 10)";
            testObjectScript(cycAccess, script, 9);

            script = "(eq (sub1 10) 9)";
            assertTrue(cycAccess.converse().converseBoolean(script));


            // sequence
            script = "(csetq a nil)";
            testObjectScript(cycAccess, script, nil);

            script = "(progn (csetq a nil) (csetq a (list a)) (csetq a (list a)))";
            cycAccess.converse().converseVoid(script);
            script = "(symbol-value 'a)";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("((nil))"));

            // sequence with variable bindings
            script = "(clet (a b) " + "  (csetq a 1) " + "  (csetq b (+ a 3)) " + "  b)";
            testObjectScript(cycAccess, script, 4);

            script = "(clet ((a nil)) " + "  (cpush 1 a) " + "  a)";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1)"));

            script = "(clet (a b) " + "  (csetq a '(1 2 3)) " + "  (csetq b (cpop a)) " + "  (list a b))";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("((2 3) (2 3))"));

            script = "(clet ((a 1) " + "       (b (add1 a)) " + "       (c (sub1 b))) " + "  c)";
            testObjectScript(cycAccess, script, 1);

            // boolean expressions
            script = "(cand t nil t)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(!responseBoolean);

            script = "(cand t t t)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(responseBoolean);

            script = "(cand t)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(responseBoolean);

            script = "(cand nil)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(!responseBoolean);

            script = "(cand t #$Dog)";
            testObjectScript(cycAccess, script, t);

            script = "(cor t nil t)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(responseBoolean);

            script = "(cor nil nil nil)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(!responseBoolean);

            script = "(cor t)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(responseBoolean);

            script = "(cor nil)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(!responseBoolean);

            script = "(cor nil #$Plant)";
            testObjectScript(cycAccess, script, t);

            script = "(cnot nil)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(responseBoolean);

            script = "(cnot t)";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(!responseBoolean);

            script = "(cnot (cand t nil))";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(responseBoolean);

            script = "(cand (cnot nil) (cor t nil))";
            responseBoolean = cycAccess.converse().converseBoolean(script);
            assertTrue(responseBoolean);


            // conditional sequencing
            if (!cycAccess.isOpenCyc()) {
                script = "(csetq answer nil)";
                testObjectScript(cycAccess, script, nil);
                script = "(pcond ((eq 0 0) \n" + "        (csetq answer \"clause 1 true\")) \n"
                        + "       ((> 1 4) \n" + "        (csetq answer \"clause 2 true\")) \n"
                        + "       (t \n" + "        (csetq answer \"clause 3 true\")))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 1 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 1 true",
                        responseString);

                script = "(pcond ((eq 1 0) \n" + "        (csetq answer \"clause 1 true\")) \n"
                        + "       ((> 5 4) \n" + "        (csetq answer \"clause 2 true\")) \n"
                        + "       (t \n" + "        (csetq answer \"clause 3 true\")))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);

                script = "(pcond ((eq 1 0) \n" + "        (csetq answer \"clause 1 true\")) \n"
                        + "       ((> 1 4) \n" + "        (csetq answer \"clause 2 true\")) \n"
                        + "       (t \n" + "        (csetq answer \"clause 3 true\")))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 3 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 3 true",
                        responseString);

                script = "(pif (string= \"abc\" \"abc\") \n" + "     (csetq answer \"clause 1 true\") \n"
                        + "     ;; else \n" + "     (csetq answer \"clause 2 true\"))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 1 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 1 true",
                        responseString);

                script = "(pif (string> \"abc\" \"abc\") \n" + "     (csetq answer \"clause 1 true\") \n"
                        + "     ;; else \n" + "     (csetq answer \"clause 2 true\"))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);

                script = "(csetq answer \n" + "       (fif (string= \"abc\" \"abc\") \n"
                        + "            \"clause 1 true\" \n" + "            ;; else \n"
                        + "            \"clause 2 true\"))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 1 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 1 true",
                        responseString);

                script = "(csetq answer \n" + "       (fif (string> \"abc\" \"abc\") \n"
                        + "            \"clause 1 true\" \n" + "            ;; else \n" + "            \"clause 2 true\"))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);

                script = "(progn \n" + "  (csetq answer \"clause 1 true\") \n"
                        + "  (pwhen (string= \"abc\" \"abc\") \n"
                        + "         (csetq answer \"clause 2 true\")))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);

                script = "(progn \n" + "  (csetq answer \"clause 1 true\") \n"
                        + "  (pwhen (string> \"abc\" \"abc\") \n"
                        + "         (csetq answer \"clause 2 true\")))";
                testObjectScript(cycAccess, script, nil);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 1 true",
                        responseString);

                script = "(progn \n" + "  (csetq answer \"clause 1 true\") \n"
                        + "  (punless (string> \"abc\" \"abc\") \n"
                        + "           (csetq answer \"clause 2 true\")))";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 2 true",
                        responseString);

                script = "(progn \n" + "  (csetq answer \"clause 1 true\") \n"
                        + "  (punless (string= \"abc\" \"abc\") \n"
                        + "           (csetq answer \"clause 2 true\")))";
                testObjectScript(cycAccess, script, nil);
                script = "(symbol-value 'answer)";
                responseString = cycAccess.converse().converseString(script);
                assertEquals("clause 1 true",
                        responseString);
            }

            // iteration
            if (!cycAccess.isOpenCyc()) {
                script = "(csetq answer nil)";
                testObjectScript(cycAccess, script, nil);

                script = "(clet ((i 11)) \n" + "  (csetq answer -10) \n"
                        + "  ;;(break \"environment\") \n" + "  (while (> i 0) \n"
                        + "    (cdec i) \n" + "    (cinc answer)))";
                cycAccess.converse().converseVoid(script);
                script = "(symbol-value 'answer)";
                testObjectScript(cycAccess, script, 1);

                script = "(csetq answer nil)";
                testObjectScript(cycAccess, script, nil);
                script = "(progn \n" + "  (cdo ((x 0 (add1 x)) \n" + "        (y (+ 0 1) (+ y 2)) \n"
                        + "        (z -10 (- z 1))) \n" + "       ((> x 3)) \n"
                        + "    (cpush (list 'x x 'y y 'z z) answer)) \n" + "  (csetq answer (nreverse answer)))";
                testListScript(cycAccess, script,
                        cycAccess.getObjectTool().makeCycList("((x 0 y 1 z -10) " + " (x 1 y 3 z -11) "
                        + " (x 2 y 5 z -12) " + " (x 3 y 7 z -13))"));

                script = "(csetq answer nil)";
                testObjectScript(cycAccess, script, nil);
                script = "(progn \n" + "  (clet ((x '(1 2 3))) \n" + "    (cdo nil ((null x) (csetq x 'y)) \n"
                        + "      (cpush x answer) \n" + "      (cpop x)) \n" + "    x) \n"
                        + "  (csetq answer (reverse answer)))";
                testListScript(cycAccess, script,
                        cycAccess.getObjectTool().makeCycList("((1 2 3) " + " (2 3) " + " (3))"));

                script = "(csetq answer nil)";
                testObjectScript(cycAccess, script, nil);
                script = "(cdolist (x '(1 2 3 4)) \n" + "  (cpush x answer))";
                assertEquals(nil, cycAccess.converse().converseObject(script));
                script = "(symbol-value 'answer)";
                testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(4 3 2 1)"));
            }

            // mapping
            script = "(mapcar #'list '(a b c))";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("((a) (b) (c))"));

            script = "(mapcar #'list '(a b c) '(d e f))";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList(
                    "((a d) (b e) (c f))"));

            script = "(mapcar #'eq '(a b c) '(d b f))";
            testListScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(nil t nil)"));

            if (!cycAccess.isOpenCyc()) {
                script = "(csetq answer nil)";
                testObjectScript(cycAccess, script, nil);

                script = "(csetq my-small-dictionary nil)";
                testObjectScript(cycAccess, script, nil);


                // Wrap the dictionary assignment in a progn that returns nil, to avoid sending the
                // dictionary itself back to the client, where it is not supported.
                cycAccess.converse().converseVoid(
                        "(progn (csetq my-small-dictionary (new-dictionary #'eq 3)) nil)");
                script = "(progn \n" + "  (dictionary-enter my-small-dictionary 'a 1) \n"
                        + "  (dictionary-enter my-small-dictionary 'b 2) \n"
                        + "  (dictionary-enter my-small-dictionary 'c 3))";
                testObjectScript(cycAccess, script, makeCycSymbol("c"));
                script = "(define my-mapdictionary-fn (key value) \n"
                        + "  (cpush (list key value) answer) \n"
                        + "  (ret nil))";
                testObjectScript(cycAccess, script, makeCycSymbol("my-mapdictionary-fn"));

                script = "(mapdictionary my-small-dictionary #'my-mapdictionary-fn)";
                testObjectScript(cycAccess, script, nil);
                script = "(symbol-value 'answer)";
                responseList = cycAccess.converse().converseList(script);
                assertTrue(responseList.contains(cycAccess.getObjectTool().makeCycList("(a 1)")));
                assertTrue(responseList.contains(cycAccess.getObjectTool().makeCycList("(b 2)")));
                assertTrue(responseList.contains(cycAccess.getObjectTool().makeCycList("(c 3)")));

                script = "(csetq my-large-dictionary nil)";
                testObjectScript(cycAccess, script, nil);
                script = "(progn (csetq my-large-dictionary (new-dictionary #'eq 200)) nil)";
                responseObject = cycAccess.converse().converseObject(script);
                script = "(clet ((cities (remove-duplicates \n" + "                 (with-all-mts \n"
                        + "                   (instances #$IndependentCountry)))) \n"
                        + "        capital-city) \n" + "  (cdolist (city cities) \n"
                        + "    (csetq capital-city (pred-values-in-any-mt city #$capitalCity)) \n"
                        + "    (dictionary-enter my-large-dictionary \n" + "                      city \n"
                        + "                      (fif (consp capital-city) \n"
                        + "                           (first capital-city) \n"
                        + "                           ;; else \n" + "                           nil))))";
                responseObject = cycAccess.converse().converseObject(script);

                script = "(mapdictionary my-large-dictionary #'my-mapdictionary-fn)";
                testObjectScript(cycAccess, script, nil);
                script = "(symbol-value 'answer)";
                responseList = cycAccess.converse().converseList(script);
                assertTrue(responseList.contains(cycAccess.getObjectTool().makeCycList(
                        "(#$France #$CityOfParisFrance)")));

                script = "(define my-parameterized-mapdictionary-fn (key value args) \n"
                        + "  (cpush (list key value args) answer) \n" + "  (ret nil))";
                testObjectScript(cycAccess, script, makeCycSymbol(
                        "my-parameterized-mapdictionary-fn"));

                script = "(mapdictionary-parameterized my-small-dictionary #'my-parameterized-mapdictionary-fn '(\"x\"))";
                testObjectScript(cycAccess, script, nil);
                script = "(symbol-value 'answer)";
                responseList = cycAccess.converse().converseList(script);
                assertTrue(responseList.contains(cycAccess.getObjectTool().makeCycList("(a 1 (\"x\"))")));
                assertTrue(responseList.contains(cycAccess.getObjectTool().makeCycList("(b 2 (\"x\"))")));
                assertTrue(responseList.contains(cycAccess.getObjectTool().makeCycList("(c 3 (\"x\"))")));

                script = "(mapdictionary-parameterized my-large-dictionary #'my-parameterized-mapdictionary-fn '(1 2))";
                testObjectScript(cycAccess, script, nil);
                script = "(symbol-value 'answer)";
                responseList = cycAccess.converse().converseList(script);
                assertTrue(responseList.contains(cycAccess.getObjectTool().makeCycList(
                        "(#$France #$CityOfParisFrance (1 2))")));
            }

            // ccatch and throw
            script = "(define my-super () \n" + "  (clet (result) \n" + "    (ccatch :abort \n"
                    + "      result \n" + "      (my-sub) \n" + "      (csetq result 0)) \n"
                    + "  (ret result)))";
            testObjectScript(cycAccess, script, makeCycSymbol("my-super"));

            script = "(define my-sub () \n" + "  (clet ((a 1) (b 2)) \n" + "  (ignore a b) \n"
                    + "  (ret (throw :abort 99))))";
            testObjectScript(cycAccess, script, makeCycSymbol("my-sub"));
            script = "(my-super)";
            testObjectScript(cycAccess, script, 99);


            // ignore-errors, cunwind-protect
            //cycAccess.traceOn();
            script = "(clet (result) \n" + "  (ignore-errors \n" + "    (cunwind-protect \n"
                    + "	(/ 1 0) \n" + "      (csetq result \"protected\"))) \n"
                    + "  result)";
            testObjectScript(cycAccess, script, "protected");


            // get-environment
            if (!cycAccess.isOpenCyc()) {
                script = "(csetq a nil)";
                testObjectScript(cycAccess, script, nil);
                script = "(csetq b -1)";
                testObjectScript(cycAccess, script, -1);
            }


            // cdestructuring-bind
            script = "(cdestructuring-bind () '() (print 'foo))";
            testObjectScript(cycAccess, script, makeCycSymbol("foo"));

            script = "(cdestructuring-bind (&whole a) () (print 'foo))";
            testObjectScript(cycAccess, script, makeCycSymbol("foo"));

            script = "(cdestructuring-bind (&whole a b c) '(1 2) (print (list a b c)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("((1 2) 1 2)"));

            script = "(cdestructuring-bind (a b . c) '(1 2 3 4) (print (list a b c)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("(1 2 (3 4))"));

            script = "(cdestructuring-bind (&optional a) '(1) (print (list a)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("(1)"));

            script = "(cdestructuring-bind (a &optional b) '(1 2) (print (list a b)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("(1 2)"));

            script = "(cdestructuring-bind (&whole a &optional b) '(1) (print (list a b)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("((1) 1)"));

            script = "(cdestructuring-bind (&rest a) '(1 2) (print (list a)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("((1 2))"));

            script = "(cdestructuring-bind (&whole a b &rest c) '(1 2 3) (print (list a b c)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("((1 2 3) 1 (2 3))"));

            script = "(cdestructuring-bind (&key a b) '(:b 2 :a 1) (print (list a b)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("(1 2)"));

            script = "(cdestructuring-bind (&key a b) '(:b 2 :allow-other-keys t :a 1 :c 3) (print (list a b)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("(1 2)"));

            script = "(cdestructuring-bind (&key ((key a) 23 b)) '(key 1) (print (list a b)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("(1 T)"));

            script = "(cdestructuring-bind (a &optional b &key c) '(1 2 :c 3) (print (list a b c)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList("(1 2 3)"));

            script = "(cdestructuring-bind (&whole a b &optional c &rest d &key e &allow-other-keys &aux f) '(1 2 :d 4 :e 3) (print (list a b c d e f)))";
            responseList = cycAccess.converse().converseList(script);
            assertEquals(responseList, cycAccess.getObjectTool().makeCycList(
                    "((1 2 :D 4 :E 3) 1 2 (:D 4 :E 3) 3 NIL)"));


            if (!cycAccess.isOpenCyc()) {
                // type testing
                script = "(csetq a 1)";
                testObjectScript(cycAccess, script, 1);
                script = "(numberp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(integerp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(stringp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(atom a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(floatp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(symbolp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(consp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(listp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(null a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));

                script = "(csetq a \"abc\")";
                testObjectScript(cycAccess, script, "abc");
                script = "(numberp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(integerp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(stringp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(atom a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(floatp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(symbolp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(consp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(listp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(null a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));

                script = "(csetq a 2.14)";
                responseObject = cycAccess.converse().converseObject(script);
                assertTrue(responseObject instanceof Double);
                assertTrue(((Double) responseObject).doubleValue() > 2.13999);
                assertTrue(((Double) responseObject).doubleValue() < 2.14001);
                script = "(numberp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(integerp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(stringp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(atom a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(floatp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(symbolp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(consp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(listp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(null a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));

                script = "(csetq a 'my-symbol)";
                testObjectScript(cycAccess, script, makeCycSymbol(
                        "my-symbol"));
                script = "(numberp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(integerp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(stringp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(atom a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(floatp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(symbolp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(consp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(listp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(null a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));

                script = "(csetq a '(1 . 2))";
                testObjectScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 . 2)"));
                script = "(numberp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(integerp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(stringp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(atom a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(floatp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(symbolp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(consp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(listp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(null a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));

                script = "(csetq a '(1 2))";
                testObjectScript(cycAccess, script, cycAccess.getObjectTool().makeCycList("(1 2)"));
                script = "(numberp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(integerp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(stringp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(atom a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(floatp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(symbolp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(consp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(listp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(null a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));

                script = "(csetq a nil)";
                testObjectScript(cycAccess, script, nil);
                script = "(numberp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(integerp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(stringp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(atom a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(floatp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(symbolp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(consp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(listp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(null a)";
                assertTrue(cycAccess.converse().converseBoolean(script));

                // empty list is treated the same as nil.
                CycArrayList command = new CycArrayList();
                command.add(makeCycSymbol("csetq"));
                command.add(makeCycSymbol("a"));
                command.add(new CycArrayList());
                testObjectScript(cycAccess, command, nil);
                script = "(numberp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(integerp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(stringp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(atom a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(floatp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(symbolp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(consp a)";
                assertTrue(!cycAccess.converse().converseBoolean(script));
                script = "(listp a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
                script = "(null a)";
                assertTrue(cycAccess.converse().converseBoolean(script));
            }


            /*
             // constant name with embedded slash
             //cycAccess.traceOn();
             script =
             "(rtp-parse-exp-w/vpp \"Symptoms of EEE begin 4-10 days after infection\" \n" +
             "(fort-for-string \"STemplate\") \n" +
             "(fort-for-string \"AllEnglishTemplateMt\") \n" +
             "(fort-for-string \"RKFParsingMt\"))";
             responseList = cycAccess.converse().converseList(script);
             */

            // check-type
            script =
                    "(clet (result) \n" + "  (ignore-errors \n" + "    (/ 1 1) \n"
                    + "    (csetq result t)) \n" + "  result)";
            assertEquals((Object) t, cycAccess.converse().converseObject(script));
            script =
                    "(clet (result) \n" + "  (ignore-errors \n" + "    (/ 1 0) \n"
                    + "    (csetq result t)) \n" + "  result)";
            assertEquals((Object) nil, cycAccess.converse().converseObject(script));

            //cycAccess.traceOn();
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.toString());
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess8() {
        System.out.println("\n**** testBinaryCycAccess 8 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    // cycAccess = new CycClient(new SocketCommRoundRobin());
                    System.out.println("This test case does not work with SocketCommRoundRobin because the interleaved commands have dependency on each other.");
                    return;
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }


            //cycAccess.traceOnDetailed();
            doTestCycAccess8(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 8 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess8(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();

        try {

            // List containing null is coerced to list containing NIL.
            String script = "(put-api-user-variable 'a '(nil 1))";
            Object responseObject = cycAccess.converse().converseObject(script);
            assertEquals(nil, responseObject);

            script = "(get-api-user-variable 'a)";

            CycList responseList = cycAccess.converse().converseList(script);
            assertEquals(cycAccess.getObjectTool().makeCycList("(nil 1)"), responseList);

            if (!cycAccess.isOpenCyc()) {
                // rkfPhraseReader
                Fort rkfEnglishLexicalMicrotheoryPsc = cycAccess.getLookupTool().getKnownConstantByGuid(
                        "bf6df6e3-9c29-11b1-9dad-c379636f7270");
                String text = "penguins";
                final CycClient cycClient = CycClientManager.get().fromCycAccess(cycAccess);
                CycList parseExpressions = cycClient.getRKFTool().rkfPhraseReader(
                        text,
                        rkfEnglishLexicalMicrotheoryPsc,
                        (CycFort) inferencePSC);
                CycArrayList parseExpression = (CycArrayList) parseExpressions.first();
                CycArrayList spanExpression = (CycArrayList) parseExpression.first();
                CycArrayList terms = (CycArrayList) parseExpression.second();

                // #$Penguin
                Fort penguin = cycAccess.getLookupTool().getKnownConstantByGuid(PENGUIN_GUID_STRING);
                assertTrue(terms.contains(penguin));

                // #$PittsburghPenguins
                Fort pittsburghPenguins = cycAccess.getLookupTool().getKnownConstantByGuid(
                        PITTSBURGH_PENGUINS_GUID_STRING);
                assertTrue(terms.contains(pittsburghPenguins));

                // generateDisambiguationPhraseAndTypes
                CycArrayList objects = new CycArrayList();
                objects.add(penguin);
                objects.add(pittsburghPenguins);

                CycList disambiguationExpression = cycAccess.getObjectTool().generateDisambiguationPhraseAndTypes(
                        objects);
                System.out.println(
                        "disambiguationExpression\n" + disambiguationExpression);
                assertEquals(2, disambiguationExpression.size());

                CycArrayList penguinDisambiguationExpression = (CycArrayList) disambiguationExpression.first();
                System.out.println(
                        "penguinDisambiguationExpression\n" + penguinDisambiguationExpression);
                assertTrue(penguinDisambiguationExpression.contains("penguin"));

                CycArrayList pittsburghPenguinDisambiguationExpression =
                        (CycArrayList) disambiguationExpression.second();
                System.out.println(
                        "pittsburghPenguinDisambiguationExpression\n" + pittsburghPenguinDisambiguationExpression);
                assertTrue(pittsburghPenguinDisambiguationExpression.contains(
                        "the Pittsburgh Penguins"));
                assertTrue(pittsburghPenguinDisambiguationExpression.contains(
                        "ice hockey team"));
            }
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess9() {
        System.out.println("\n**** testBinaryCycAccess 9 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

            System.out.println(cycAccess.getCycConnection().connectionInfo());


            //cycAccess.traceOn();
            doTestCycAccess9(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 9 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess9(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();

        try {
            CycConstantI brazil = cycAccess.getLookupTool().getKnownConstantByGuid(BRAZIL_GUID_STRING);
            CycConstantI country = cycAccess.getLookupTool().getKnownConstantByGuid(COUNTRY_GUID_STRING);
            CycConstantI worldGeographyMt = cycAccess.getLookupTool().getKnownConstantByGuid(
                    WORLD_GEOGRAPHY_MT_GUID_STRING);
            CycConstantI dog = cycAccess.getLookupTool().getKnownConstantByGuid(DOG_GUID_STRING);
            HashSet hashSet = new HashSet();
            hashSet.add(dog);
            assertTrue(hashSet.contains(dog));

            CycConstantI animal = cycAccess.getLookupTool().getKnownConstantByGuid(ANIMAL_GUID_STRING);
            CycConstantI biologyVocabularyMt = cycAccess.getLookupTool().getKnownConstantByGuid(
                    BIOLOGY_VOCABULARY_MT_GUID_STRING);
            CycConstantI performedBy = cycAccess.getLookupTool().getKnownConstantByGuid(
                    PERFORMED_BY_GUID_STRING);
            CycConstantI doneBy = cycAccess.getLookupTool().getKnownConstantByGuid(DONE_BY_GUID_STRING);
            CycConstantI siblings = cycAccess.getLookupTool().getKnownConstantByGuid(
                    SIBLINGS_GUID_STRING);
            CycConstantI generalLexiconMt = cycAccess.getLookupTool().getKnownConstantByGuid(
                    GENERAL_LEXICON_MT_GUID_STRING);
            CycConstantI paraphraseMt = cycAccess.getLookupTool().getKnownConstantByGuid(
                    PARAPHRASE_MT_GUID_STRING);
            CycConstantI mtTimeWithGranularityDimFn = cycAccess.getLookupTool().getKnownConstantByGuid(
                    MT_TIME_WITH_GRANULARITY_DIM_FN_GUID_STRING);
            CycConstantI mtSpace = cycAccess.getLookupTool().getKnownConstantByGuid(
                    MT_SPACE_GUID_STRING);
            CycConstantI now = cycAccess.getLookupTool().getKnownConstantByGuid(NOW_GUID_STRING);
            CycConstantI timePoint = cycAccess.getLookupTool().getKnownConstantByGuid(
                    TIMEPOINT_GUID_STRING);
            //(#$MtSpace (#$MtTimeWithGranularityDimFn #$Now #$TimePoint) #$WorldGeographyMt)
            ELMt worldGeographyMtNow =
                    cycAccess.getObjectTool().makeELMt(
                    new CycNaut(
                    mtSpace, new CycNaut(mtTimeWithGranularityDimFn, now, timePoint),
                    worldGeographyMt));


            // isa
            assertTrue(cycAccess.getInspectorTool().isa(brazil, country, worldGeographyMt));
            assertTrue(cycAccess.getInspectorTool().isa(brazil, country, worldGeographyMtNow));
            assertTrue(cycAccess.getInspectorTool().isa(brazil, country));

            // isGenlOf
            assertTrue(cycAccess.getInspectorTool().isGenlOf(animal, dog, biologyVocabularyMt));
            assertTrue(cycAccess.getInspectorTool().isGenlOf(animal, dog));


            // isGenlPredOf
            assertTrue(cycAccess.getInspectorTool().isGenlPredOf(doneBy, performedBy, baseKB));
            assertTrue(cycAccess.getInspectorTool().isGenlPredOf(doneBy, performedBy));


            // isGenlInverseOf
            assertTrue(cycAccess.getInspectorTool().isGenlInverseOf(siblings, siblings,
                    biologyVocabularyMt));
            assertTrue(cycAccess.getInspectorTool().isGenlInverseOf(siblings, siblings));


            // isGenlMtOf
            if (!cycAccess.isOpenCyc()) {
                assertTrue(cycAccess.getInspectorTool().isGenlMtOf(baseKB, biologyVocabularyMt));
            }

            /*
             // tests proper receipt of narts from the server.
             String script = "(csetq all-narts nil)";
             cycAccess.converse().converseVoid(script);
             script = "(progn \n" +
             "  (do-narts (nart) \n" +
             "    (cpush nart all-narts)) \n" +
             "  nil)";
             cycAccess.converse().converseVoid(script);
             script = "(clet (nart) \n" +
             "  (csetq nart (first all-narts)) \n" +
             "  (csetq all-narts (rest all-narts)) \n" +
             "  nart)";
             long numberGood = 0;
             long numberNil = 0;
             while (true) {
             Object obj = cycAccess.converse().converseObject(script);
             if (obj.equals(nil))
             break;
             assertTrue(obj instanceof CycNart);
             CycNart cycNart = (CycNart) obj;
             assertTrue(cycNart.cyclify() instanceof String);
             String script2 = "(find-nart " + cycNart.stringApiValue() + ")";
             Object obj2 = cycAccess.converse().converseObject(script2);
             if (cycNart.equals(obj))
             numberGood++;
             else
             numberNil++;
             }
             assertTrue(numberGood > 20 * numberNil);
             script = "(csetq all-narts nil)";
             cycAccess.converse().converseVoid(script);
             */
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess10() {
        System.out.println("\n**** testBinaryCycAccess 10 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

            System.out.println(cycAccess.getCycConnection().connectionInfo());


            //cycAccess.traceOn();
            doTestCycAccess10(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 10 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess10(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();

        try {
            // demonstrate quoted strings
            //cycAccess.traceOn();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("a");
            stringBuffer.append('"');
            stringBuffer.append("b");
            stringBuffer.append('"');
            stringBuffer.append("c");

            String expectedString = stringBuffer.toString();
            CycArrayList command = new CycArrayList();
            command.add(makeCycSymbol("identity"));
            command.add(expectedString);

            String resultString = cycAccess.converse().converseString(command);
            assertEquals(expectedString, resultString);

            CycList cycList53 = cycAccess.getObjectTool().makeCycList("(\"abc\")");
            assertEquals(1,
                    cycAccess.converse().converseInt(
                    "(length '" + cycList53.cycListApiValue() + ")"));
            assertEquals(3,
                    cycAccess.converse().converseInt(
                    "(length (first '" + cycList53.cycListApiValue() + "))"));

            String string = "abc";
            CycArrayList cycList54 = new CycArrayList();
            cycList54.add(makeCycSymbol("length"));
            cycList54.add(string);
            assertEquals(3, cycAccess.converse().converseInt(cycList54));

            String quotedString = "\"abc\" def";
            CycArrayList cycList55 = new CycArrayList();
            cycList55.add(makeCycSymbol("length"));
            cycList55.add(quotedString);


            // Note that in binary mode, that Cyc's cfasl input will insert the required escape
            // chars for embedded quotes.
            // And in ascii mode note that CycConnection will insert the required escape
            // chars for embedded quotes.  While in binary mode, CfaslOutputStream will insert
            // the required escapes.
            //
            // Cyc should see (length "\"abc\" def") and return 9
            assertEquals(9, cycAccess.converse().converseInt(cycList55));

            // demonstrate quoted strings with the CycListParser
            CycList cycList56 = cycAccess.getObjectTool().makeCycList("(\"" + string + "\")");
            assertEquals(1,
                    cycAccess.converse().converseInt(
                    "(length " + cycList56.stringApiValue() + ")"));
            assertEquals(3,
                    cycAccess.converse().converseInt(
                    "(length (first " + cycList56.stringApiValue() + "))"));

            String embeddedQuotesString = "(" + "\"\\\"abc\\\" def\"" + ")";
            CycList cycList57 = cycAccess.getObjectTool().makeCycList(embeddedQuotesString);
            String script = "(length " + cycList57.stringApiValue() + ")";
            int actualLen = cycAccess.converse().converseInt(script);
            assertEquals(1, actualLen);
            assertEquals(9,
                    cycAccess.converse().converseInt(
                    "(length (first " + cycList57.stringApiValue() + "))"));

            script = "(identity (quote (#$givenNames #$Guest \"\\\"The\\\" Guest\")))";

            String script1 = "(IDENTITY (QUOTE (#$givenNames #$Guest \"\"The\" Guest\")))";

            //CycListParser.verbosity = 3;
            CycList scriptCycList = cycAccess.getObjectTool().makeCycList(script);


            // Java strings do not escape embedded quote chars
            assertEquals(script1, scriptCycList.cyclify());

            CycList answer = cycAccess.converse().converseList(script);
            Object third = answer.third();
            assertTrue(third instanceof String);
            assertEquals(11, ((String) third).length());

            answer = cycAccess.converse().converseList(scriptCycList);
            third = answer.third();
            assertTrue(third instanceof String);
            assertEquals(11, ((String) third).length());

            // isFormulaWellFormed
            if (!cycAccess.isOpenCyc()) {
                FormulaSentence formula1 = cycAccess.getObjectTool().makeCycSentence(
                        "(#$isa #$Brazil #$IndependentCountry)");
                CycConstantI mt = cycAccess.getLookupTool().getKnownConstantByName(
                        "WorldPoliticalGeographyDataVocabularyMt");
                assertTrue(cycAccess.getInspectorTool().isFormulaWellFormed(formula1, mt));
                FormulaSentence formula2 = cycAccess.getObjectTool().makeCycSentence(
                        "(#$genls #$Brazil #$Collection)");
                assertTrue(!cycAccess.getInspectorTool().isFormulaWellFormed(formula2, mt));
            }

            // isCycLNonAtomicReifableTerm
            Naut formula3 = cycAccess.getObjectTool().makeCycNaut(
                    "(#$TheCovering #$Watercraft-Surface #$Watercraft-Subsurface)");
            assertTrue(cycAccess.getInspectorTool().isCycLNonAtomicReifableTerm(formula3));

            FormulaSentence formula4 = cycAccess.getObjectTool().makeCycSentence(
                    "(#$isa #$Plant #$Animal)");
            assertTrue(!cycAccess.getInspectorTool().isCycLNonAtomicReifableTerm(formula4));

            Naut formula5 = cycAccess.getObjectTool().makeCycNaut("(#$PlusFn 1)");
            assertTrue(!cycAccess.getInspectorTool().isCycLNonAtomicReifableTerm(formula5));

            // isCycLNonAtomicUnreifableTerm
            Naut formula6 = cycAccess.getObjectTool().makeCycNaut(
                    "(#$TheCovering #$Watercraft-Surface #$Watercraft-Subsurface)");
            assertTrue(!cycAccess.getInspectorTool().isCycLNonAtomicUnreifableTerm(formula6));

            FormulaSentence formula7 = cycAccess.getObjectTool().makeCycSentence(
                    "(#$isa #$Plant #$Animal)");
            assertTrue(!cycAccess.getInspectorTool().isCycLNonAtomicUnreifableTerm(formula7));

            Naut formula8 = cycAccess.getObjectTool().makeCycNaut("(#$PlusFn 1)");
            assertTrue(cycAccess.getInspectorTool().isCycLNonAtomicUnreifableTerm(formula8));
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess11() {
        System.out.println("\n**** testBinaryCycAccess 11 ****");
        resetCaches();

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);

                    //cycAccess.getLookupTool().getCycLeaseManager().addListener(this);

                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        kv.getValue().addListener(this);
                    }

                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        kv.getValue().addListener(this);
                    }
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        kv.getValue().addListener(this);
                    }
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }


            //cycAccess.traceOnDetailed();
            try {
                if (!cycAccess.isOpenCyc()) {
                    doTestCycAccess11(cycAccess);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // cycAccess.getLookupTool().getCycLeaseManager().removeAllListeners();
            for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                kv.getValue().removeAllListeners();
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 11 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess11(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();

        try {
            String script = "(+ 1 2)";
            int answer = cycAccess.converse().converseInt(script);
            assertEquals(3, answer);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }
//    cycAccess.getLookupTool().getCycLeaseManager().setLeaseDurationMilliseconds(100000);
//    cycAccess.getLookupTool().getCycLeaseManager().immediatelyRenewLease();

        System.out.println("Concurrent API requests.");

        ArrayList apiRequestors = new ArrayList();

        apiRequestors.add(new LongApiRequestor(cycAccess));
        for (int i = 1; i < 8; i++) {
            apiRequestors.add(new ShortApiRequestor(cycAccess));
        }

        int iterationsUntilCancel = 10;
        boolean isCancelled = false;
        while (true) {
            boolean apiRequestorTheadRunning = false;

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                break;
            }

            System.out.println("-----------------------");
            for (int i = 0; i < apiRequestors.size(); i++) {
                final ApiRequestor apiRequestor = (ApiRequestor) apiRequestors.get(i);

                if (!apiRequestor.done) {
                    apiRequestorTheadRunning = true;

                    if ((iterationsUntilCancel-- < 0) && apiRequestor instanceof LongApiRequestor && !isCancelled) {
                        System.out.println("Cancelling " + apiRequestor.name);
                        isCancelled = true;
                        try {
                            apiRequestor.cancel();
                        } catch (Throwable e) {
                            e.printStackTrace();
                            fail(e.getMessage());
                        }
                    }
                }
            }

            if (!apiRequestorTheadRunning) {
                break;
            }
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    private void testListScript(CycAccess cycAccess, String script,
            final CycList<Object> expected) throws CycConnectionException, CycApiException {
        assertEquals(expected, cycAccess.converse().converseList(script));
    }

    private void testObjectScript(CycAccess cycAccess, String script,
            final Object expected) throws CycConnectionException, CycApiException {
        assertEquals(expected, cycAccess.converse().converseObject(script));
    }

    private void testObjectScript(CycAccess cycAccess, CycArrayList script,
            Object expected) throws CycConnectionException {
        assertEquals(expected, cycAccess.converse().converseObject(script));
    }

    /**
     * Class ApiRequestor.
     */
    static protected class ApiRequestor extends Thread {

        /**
         * the connection to Cyc
         */
        final private CycAccess cycAccess;
        /**
         * the name of the api requestor process
         */
        final public String name;
        /**
         * the api request repeat count
         */
        final private int repeatCount;
        /**
         * the api request duration factor
         */
        final private String durationFactor;
        /**
         * the process completion indicator
         */
        public boolean done = false;
        public SubLWorkerSynch worker;

        /**
         * Constructs and starts a ApiRequestor object.
         *
         * @param name the name of the api requestor process
         * @param repeatCount the api request repeat count
         * @param durationFactor the api request duration factor
         * @param cycAccess the connection to Cyc
         */
        public ApiRequestor(final String name,
                final int repeatCount,
                final String durationFactor,
                final CycAccess cycAccess) {
            this.name = name;
            this.repeatCount = repeatCount;
            this.durationFactor = durationFactor;
            this.cycAccess = cycAccess;
            start();
        }

        /**
         * Makes some API requests.
         *
         * @throws RuntimeException when wrong answer detected
         */
        public void run() {

            try {
                for (int i = 0; i < repeatCount; i++) {
                    final String testPhrase = name + "-" + Integer.toString(i + 1);
                    final String script = (name.equals("Long"))
                            ? "(catch-task-processor-termination-quietly (progn (do-assertions (assertion))\n"
                            + " \"" + testPhrase + "\"))"
                            : "(catch-task-processor-termination-quietly (progn (cdotimes (x "
                            + durationFactor + "))\n" + " \"" + testPhrase + "\"))";
                    worker = new DefaultSubLWorkerSynch(script, cycAccess);
                    final Object answer = worker.getWork();
                    if (answer.toString().equals(":CANCEL")) {
                        System.out.println(name + " returned :CANCEL");
                        done = true;
                        return;
                    } else {
                        if (!answer.equals(testPhrase)) {
                            throw new RuntimeException(testPhrase + " not equal to " + answer);
                        }
                    }
                }
            } catch (Throwable e) {
                System.out.println(
                        "ApiRequestor " + name + " exception: " + e.toString());
                e.printStackTrace();
                done = true;
                return;
            }

            done = true;
        }

        /**
         * Cancels this thread at the Cyc Server.
         *
         * @throws CycApiException when an api error occurs
         * @throws IOException when a communication error occurs
         */
        public void cancel() throws CycApiException, CycConnectionException {
            cycAccess.getCycConnection().cancelCommunication(worker);
        }
    }

    static private class LongApiRequestor extends ApiRequestor {

        public LongApiRequestor(CycAccess cycAccess) {
            super("Long", 1, "1", cycAccess);
        }
    }

    static private class ShortApiRequestor extends ApiRequestor {

        static private int i = 0;

        public ShortApiRequestor(CycAccess cycAccess) {
            super("Short" + ++i, 4, "150000", cycAccess);
        }
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess12() {
        System.out.println("\n**** testBinaryCycAccess 12 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

            doTestCycAccess12(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 12 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess12(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();

        try {
            //cycAccess.traceOn();

            String utf8String = "ABCdef";
            assertEquals(utf8String,
                    cycAccess.converse().converseString("(identity \"" + utf8String + "\")"));

            InputStreamReader inputStreamReader = null;

            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(
                        new File("utf8-sample.html")),
                        "UTF-8");
            } catch (IOException e) {
                return;
            }

            StringBuffer utf8StringBuffer = new StringBuffer();

            while (true) {
                int ch = inputStreamReader.read();

                if (ch == -1) {
                    break;
                }

                if ((ch == '\n') || (ch == '\r')) {
                    utf8StringBuffer.append(' ');
                } else {
                    utf8StringBuffer.append((char) ch);
                }
            }

            utf8String = utf8StringBuffer.toString();

            PrintWriter utf8Output = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream("utf8-sample-without-newlines.html"), "UTF8"));
            utf8Output.print(utf8String);
            utf8Output.close();

            CycArrayList command = new CycArrayList();
            command.add(makeCycSymbol("identity"));
            command.add(utf8String);

            String echoUtf8Sting = cycAccess.converse().converseString(command);

            utf8Output = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream("utf8-sample-from-cyc.html"), "UTF8"));
            utf8Output.print(utf8String);
            utf8Output.close();

            System.out.println("utf8String\n" + utf8String);
            System.out.println("echoUtf8Sting\n" + echoUtf8Sting);
            assertEquals(utf8String,
                    echoUtf8Sting);

            Fort myTerm = cycAccess.getLookupTool().getConstantByName("my-term");

            if (myTerm != null) {
                cycAccess.getUnassertTool().kill(myTerm);
            }

            myTerm = cycAccess.getLookupTool().findOrCreate("my-term");
            cycAccess.getAssertTool().assertComment(myTerm, utf8String, baseKB);
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess13() {
        System.out.println("\n**** testBinaryCycAccess 13 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

//    cycAccess.traceOn();

            // canonicalizeHLMT
            try {
                if (!(cycAccess.isOpenCyc())) {
                    // NART case
                    {
                        //cycAccess.traceNamesOn();
                        final String elmtString = "(#$LexicalMtForLanguageFn #$AzeriLanguage)";
                        final Naut mt = cycAccess.getObjectTool().makeCycNaut(elmtString);
                        final ELMt hlmtObject = cycAccess.getObjectTool().canonicalizeHLMT(mt);
                        assertNotNull(hlmtObject);
                        assertTrue(hlmtObject instanceof CycNart);
                        assertEquals(elmtString, hlmtObject.cyclify());
                    }

                    // NAUT case
                    {
                        final String elmtString = "(#$MtSpace #$BaseKB (#$MtTimeDimFn #$Now))";
                        final Naut mt = cycAccess.getObjectTool().makeCycNaut(elmtString);
                        final ELMt hlmtObject = cycAccess.getObjectTool().canonicalizeHLMT(mt);
                        assertNotNull(hlmtObject);
                        assertTrue(hlmtObject instanceof CycNaut);
                        assertEquals(elmtString, hlmtObject.cyclify());
                    }

                    // Constant case
                    {
                        final String elmtString = "(#$MtSpace #$BaseKB (#$MtTimeWithGranularityDimFn #$Always-TimeInterval #$Null-TimeParameter))";
                        final Naut mt = cycAccess.getObjectTool().makeCycNaut(elmtString);
                        final ELMt hlmtObject = cycAccess.getObjectTool().canonicalizeHLMT(mt);
                        assertNotNull(hlmtObject);
                        assertTrue(hlmtObject instanceof CycConstant);
                        assertEquals("#$BaseKB", hlmtObject.cyclify());
                    }

                    // Nonsense case
                    {
                        final String elmtString = "(#$PlusFn 1 1)";
                        final Naut mt = cycAccess.getObjectTool().makeCycNaut(elmtString);
                        final CycObject hlmtObject = cycAccess.getObjectTool().canonicalizeHLMT(mt);
                        assertNotNull(hlmtObject);
                        assertTrue(hlmtObject instanceof CycNaut);
                        assertEquals(elmtString,
                                hlmtObject.cyclify());
                    }
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // makeELMt
            try {
                if (!(cycAccess.isOpenCyc())) {
                    // NART case
                    String elmtString = "(#$LexicalMtForLanguageFn #$AzeriLanguage)";
                    Naut naut = cycAccess.getObjectTool().makeCycNaut(elmtString);
                    ELMt elmt = cycAccess.getObjectTool().makeELMt(naut);
                    assertNotNull(elmt);
                    assertTrue(elmt instanceof CycNart);
                    assertEquals(elmtString, elmt.cyclify());


                    // Nonsense case
                    elmtString = "(#$PlusFn 1 1)";
                    naut = cycAccess.getObjectTool().makeCycNaut(elmtString);
                    elmt = cycAccess.getObjectTool().makeELMt(naut);
                    assertNotNull(elmt);
                    assertTrue(elmt instanceof CycNaut);
                    assertEquals(elmtString, elmt.cyclify());


                    // Constant case
                    elmtString = "BaseKB";
                    Fort baseKB = cycAccess.getLookupTool().getKnownConstantByName(elmtString);
                    elmt = cycAccess.getObjectTool().makeELMt(baseKB);
                    assertNotNull(elmt);
                    assertTrue(elmt instanceof CycConstant);
                    assertEquals(elmtString, elmt.toString());
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // getHLCycTerm
            try {
                Object obj = cycAccess.getObjectTool().getHLCycTerm("1");
                assertTrue(obj instanceof Integer);
                obj = cycAccess.getObjectTool().getHLCycTerm("\"abc\"");
                assertTrue(obj instanceof String);
                {
                    CycConstantI randomConstant = cycAccess.getLookupTool().getRandomConstant();
                    obj = cycAccess.getObjectTool().getHLCycTerm(randomConstant.cyclify());
                    assertEquals(randomConstant, obj);
                }
                {
                    boolean ok = true;
                    Nart randomNart = null;
                    for (int count = 0; (count < 1000) && (ok == true); count++) {
                        while (randomNart == null || !(cycAccess.getInspectorTool().isGround(randomNart))) { //Non-ground NARTs can have canonicalization issues.
                            randomNart = cycAccess.getLookupTool().getRandomNart();
                        }
                        obj = cycAccess.getObjectTool().getHLCycTerm(randomNart.cyclify());
                        if (!randomNart.equalsAtEL(obj)) {
                            cycAccess.getObjectTool().getHLCycTerm(randomNart.cyclify());
                            randomNart.equalsAtEL(obj);
                            ok = false;
                        }
                    }
                    assertTrue(randomNart.cyclify() + " is not equal (at EL) to " + obj,
                            ok);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }


            // getELCycTerm
            try {
                Object obj = cycAccess.getObjectTool().getELCycTerm("1");
                assertTrue(obj instanceof Integer);
                obj = cycAccess.getObjectTool().getELCycTerm("\"abc\"");
                assertTrue(obj instanceof String);

                CycConstantI randomConstant = cycAccess.getLookupTool().getRandomConstant();
                obj = cycAccess.getObjectTool().getHLCycTerm(randomConstant.cyclify());
                assertEquals(randomConstant, obj);

                Nart randomNart = cycAccess.getLookupTool().getRandomNart();
                obj = cycAccess.getObjectTool().getHLCycTerm(randomNart.cyclify());
                assertEquals(randomNart, obj);
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // canonicalizeList
            try {
                String query = "(#$isa (#$DayFn 1 (#$MonthFn #$March (#$YearFn 2004))) #$Event)";
                CycList queryList = cycAccess.getObjectTool().makeCycList(query);
                //System.out.println(queryList.cyclify());
                CycList canonicalizedList = cycAccess.getObjectTool().canonicalizeList(queryList);
                //System.out.println(canonicalizedList.cyclify());
                assertTrue(canonicalizedList.second() instanceof CycArrayList);
                InferenceParameters queryProperties = new DefaultInferenceParameters(
                        cycAccess);
                assertTrue(!cycAccess.getInferenceTool().isQueryTrue(canonicalizedList,
                        universalVocabularyMt, queryProperties));

                query = "(#$isa (#$DayFn 1 (#$MonthFn #$March (#$YearFn 2004))) #$CalendarDay)";
                queryList = cycAccess.getObjectTool().makeCycList(query);
                //System.out.println(queryList.cyclify());
                canonicalizedList = cycAccess.getObjectTool().canonicalizeList(queryList);
                //System.out.println(canonicalizedList.cyclify());
                assertTrue(canonicalizedList.second() instanceof CycArrayList);
                assertTrue(cycAccess.getInferenceTool().isQueryTrue(canonicalizedList,
                        universalVocabularyMt, queryProperties));

                query = "(#$isa (#$DayFn 1 (#$MonthFn #$March (#$YearFn 2004))) #$CalendarDay)";
                final FormulaSentence sentence = cycAccess.getObjectTool().makeCycSentence(query);
                //System.out.println(queryList.cyclify());
                assertTrue(cycAccess.getInferenceTool().isQueryTrue(sentence, universalVocabularyMt,
                        queryProperties));
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // assertions containing hl variables
            try {
                if (!cycAccess.isOpenCyc()) {
                    FormulaSentence query = cycAccess.getObjectTool().makeCycSentence(
                            "(#$salientAssertions #$performedBy ?ASSERTION)");
                    InferenceParameters queryProperties = cycAccess.getInferenceTool().getHLQueryProperties();
                    queryProperties.put(makeCycSymbol(":answer-language"), makeCycSymbol(
                            ":hl"));
                    InferenceResultSet resultSet = cycAccess.getInferenceTool().executeQuery(query, baseKB,
                            queryProperties);
                    resultSet.next();
                    CycAssertion cycAssertion = (CycAssertion) resultSet.getCycObject(1);
                    System.out.println("cycAssertion= " + cycAssertion.cyclify());
                    assertTrue(cycAssertion.cyclify().indexOf("?VAR0") > -1);
                    CycArrayList command = new CycArrayList();
                    command.add(makeCycSymbol("identity"));
                    command.add(cycAssertion);
                    //cycAccess.traceOnDetailed();
                    Object result = cycAccess.converse().converseObject(command);
                    assertTrue(result instanceof CycAssertion);
                    assertTrue(((CycAssertion) result).cyclify().indexOf("?VAR0") > -1);
                    //System.out.println("cycAssertion= " + ((CycAssertion) result).cyclify());
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 13 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     */
    @Test
    public void testBinaryCycAccess14() {
        System.out.println("\n**** testBinaryCycAccess 14 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                System.out.println("\nException: " + e.getMessage());
                fail(e.toString());
            }

            assertNotNull(cycAccess.getCycConnection());
            doTestCycAccess14(cycAccess);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 14 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the given api connection.
     *
     * @param cycAccess the server connection handler
     */
    protected void doTestCycAccess14(CycAccess cycAccess) {
        long startMilliseconds = System.currentTimeMillis();

        if (cycAccess.getCycConnection() != null) {
            System.out.println(cycAccess.getCycConnection().connectionInfo());
        } else {
            System.out.println("CycConnection info is null.");
        }

        resetCycConstantCaches();

        try {
            // second call should access the cache by GUID
            cycAccess.traceOn();
            System.out.println("------------");

            CycGuid organizationGuid = new CycGuid(ORGANIZATION_GUID_STRING);
            CycConstantI organization = cycAccess.getLookupTool().getConstantByGuid(organizationGuid);
            System.out.println("------------");
            organization = cycAccess.getLookupTool().getConstantByGuid(organizationGuid);
            System.out.println("------------");
            cycAccess.traceOff();
        } catch (Throwable e) {
            e.printStackTrace();
            fail(e.getMessage());
        }

        List localDisjointWiths = null;


        /*
         // complete received objects immediately
         cycAccess.deferObjectCompletion = false;
         System.out.println("deferObjectCompletion = false");
    
         // trace should show the use of the CycConstantCache to avoid redundant server
         // accesses for the term name.
         // getLocalDisjointWith.
         try {
         CycConstantI vegetableMatter =
         cycAccess.getLookupTool().getKnownConstantByGuid("bd58c455-9c29-11b1-9dad-c379636f7270");
         localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
         assertNotNull(localDisjointWiths);
         assertTrue(localDisjointWiths.toString().indexOf("AnimalBLO") > 0);
         localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
         localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
         localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
         }
         catch (Throwable e) {
         fail(e.toString());
         }
         */

        // getLocalDisjointWith.
        localDisjointWiths = null;

        try {
            CycConstantI vegetableMatter = cycAccess.getLookupTool().getKnownConstantByGuid(
                    VEGETABLE_MATTER_GUID_STRING);
            localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
            assertNotNull(localDisjointWiths);


            //System.out.println("localDisjointWiths.toString()");
            //assertTrue(localDisjointWiths.toString().indexOf("AnimalBLO") > 0);
            //System.out.println("localDisjointWiths.toString()");
            //assertTrue(localDisjointWiths.toString().indexOf("AnimalBLO") > 0);
            localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
            localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
            localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
        } catch (Throwable e) {
            fail(e.toString());
        }

        // makeUniqueCycConstant
        try {
            final String constantName = "MyConstant";
            CycConstantI cycConstant1 = cycAccess.getObjectTool().makeUniqueCycConstant(constantName);
            System.out.println(cycConstant1.cyclify());
            assertTrue(cycConstant1.getName().startsWith(constantName));
            CycConstantI cycConstant2 = cycAccess.getObjectTool().makeUniqueCycConstant(constantName);
            System.out.println(cycConstant2.cyclify());
            assertTrue(cycConstant2.getName().startsWith(constantName));
            assertTrue(!cycConstant1.getName().equals(cycConstant2.getName()));
            CycConstantI cycConstant3 = cycAccess.getObjectTool().makeUniqueCycConstant(constantName);
            System.out.println(cycConstant3.cyclify());
            assertTrue(cycConstant3.getName().startsWith(constantName));
            assertTrue(!cycConstant3.getName().equals(cycConstant1.getName()));
            assertTrue(!cycConstant3.getName().equals(cycConstant2.getName()));
        } catch (Throwable e) {
            fail(e.toString());
        }

        long endMilliseconds = System.currentTimeMillis();
        System.out.println(
                "  " + (endMilliseconds - startMilliseconds) + " milliseconds");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     * This test case specifically is used to test cfasl id versus guid constant
     * encoding, and the eager obtaining of constant names.
     */
    @Test
    public void testBinaryCycAccess15() {
        System.out.println("\n**** testBinaryCycAccess 15 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    // cycAccess = new CycClient(new SocketCommRoundRobin());
                    System.out.println("This test case does not work with SocketCommRoundRobin because the interleaved commands have dependency on each other.");
                    return;

                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

            // backquote
            String command =
                    "(identity " + "`(,(canonicalize-term \'(#$CollectionUnionFn (#$TheSet #$Tourist (#$GroupFn #$Tourist)))) ,#$ComputationalSystem))";
            Object result;
            try {
                //cycAccess.traceOn();
                result = cycAccess.converse().converseObject(command);
                assertNotNull(result);
                assertTrue(result instanceof CycArrayList);
                System.out.println("backquoted nart: " + ((CycArrayList) result).cyclify());
                System.out.println(
                        "embedded obj class: " + ((CycArrayList) result).first().getClass().toString());
                assertTrue(((CycArrayList) result).first() instanceof CycNart);
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // getComment with CycNart
            CycNart nart = null;
            String comment = null;
            try {
                if (!cycAccess.isOpenCyc()) {
                    nart = (CycNart) cycAccess.converse().converseObject(
                            "(find-nart '(#$JuvenileFn #$Dog))");
                    comment = cycAccess.getLookupTool().getComment(nart);
                    assertNotNull(comment);
                    //assertEquals("", comment);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // newlines in strings

            try {
                command = "(nart-substitute \"first text line\nsecond text line\")";
                System.out.println("string with newlines: " + command);
                System.out.println(cycAccess.converse().converseObject(command));
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            //cycAccess.traceOnDetailed();
            // getLocalDisjointWith.
            List localDisjointWiths = null;

            try {
                CycConstantI vegetableMatter = cycAccess.getLookupTool().getKnownConstantByGuid(
                        VEGETABLE_MATTER_GUID_STRING);
                localDisjointWiths = cycAccess.getLookupTool().getDisjointWiths(vegetableMatter);
                assertNotNull(localDisjointWiths);

                //assertTrue(localDisjointWiths.toString().indexOf("AnimalBLO") > 0);
            } catch (Throwable e) {
                fail(e.toString());
            }

            // ensure that constants have names
            try {
                String physicalDeviceGuidString = PHYSICAL_DEVICE_GUID_STRING;
                CycConstantI physicalDevice = cycAccess.getLookupTool().getKnownConstantByGuid(
                        physicalDeviceGuidString);
                final CycList constants = cycAccess.getLookupTool().getAllInstances(physicalDevice);
                if (constants.size() > 0 && constants.first() instanceof CycConstant) {
                    assertNotNull(((CycConstant) constants.first()).name);
                }
                if (constants.size() > 1 && constants.second() instanceof CycConstant) {
                    assertNotNull(((CycConstant) constants.second()).name);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            try {
                Nart nart1 = cycAccess.getLookupTool().getRandomNart();
                assertNotNull(nart1);
                assertNotNull(nart1.getFunctor());
                assertTrue(nart1.getFunctor() instanceof CycFort);
                assertNotNull(nart1.getArguments());
                assertTrue(nart1.getArguments() instanceof CycArrayList);

                //System.out.println(nart1.cyclify());
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            // Narts in a list.
            try {
                //cycAccess.traceOn();
                Nart nart1 = cycAccess.getLookupTool().getRandomNart();
                Nart nart2 = new CycNart(nart1.toCycList());
                assertEquals(nart1, nart2);

                CycArrayList nartList = new CycArrayList();
                nartList.add(nart1);
                nartList.add(nart2);

                Object object = null;
                CycSymbol a = makeCycSymbol("a");
                cycAccess.getObjectTool().setSymbolValue(a, nartList);

                object = cycAccess.getObjectTool().getSymbolValue(a);
                assertNotNull(object);
                assertTrue(object instanceof CycArrayList);

                CycArrayList nartList1 = (CycArrayList) object;
                Object element1 = nartList1.first();
                assertTrue(
                        (element1 instanceof CycNart) || (element1 instanceof CycArrayList));

                if (element1 instanceof CycArrayList) {
                    element1 = CycNart.coerceToCycNart(element1);
                }

                CycNart nart3 = (CycNart) element1;
                assertNotNull(nart3.getFunctor());
                assertTrue(nart3.getFunctor() instanceof CycFort);
                assertNotNull(nart3.getArguments());
                assertTrue(nart3.getArguments() instanceof CycArrayList);

                Object element2 = nartList1.second();
                assertTrue(
                        (element2 instanceof CycNart) || (element2 instanceof CycArrayList));

                if (element2 instanceof CycArrayList) {
                    element2 = CycNart.coerceToCycNart(element2);
                }

                CycNart nart4 = (CycNart) element2;
                assertNotNull(nart4.getFunctor());
                assertTrue(nart4.getFunctor() instanceof CycFort);
                assertNotNull(nart4.getArguments());
                assertTrue(nart4.getArguments() instanceof CycArrayList);

                assertEquals(nart1.cyclify(), nart3.cyclify());
                assertEquals(nart1.cyclify(), nart4.cyclify());
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 15 OK ****");
    }

    /**
     * Tests a portion of the CycAccess methods using the binary api connection.
     * This test case specifically is used to test soap service handling of an
     * xml response from Cyc.
     */
    @Test
    public void testBinaryCycAccess16() {
        System.out.println("\n**** testBinaryCycAccess 16 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

            //cycAccess.traceOnDetailed();
            try {
                if (!(cycAccess.isOpenCyc())) {
                    List genls = null;
                    CycConstantI carAccident = null;
                    carAccident = cycAccess.getLookupTool().getKnownConstantByGuid(
                            CAR_ACCIDENT_GUID_STRING);
                    genls = cycAccess.getLookupTool().getGenls(carAccident);
                    assertNotNull(genls);
                    assertTrue(genls instanceof CycArrayList);

                    Iterator iter = genls.iterator();

                    while (iter.hasNext()) {
                        Object obj = iter.next();
                        assertTrue(obj instanceof CycFort);
                    }

                    List coExtensionals = null;
                    coExtensionals = cycAccess.getLookupTool().getCoExtensionals(carAccident);
                    assertNotNull(coExtensionals);
                    assertTrue(coExtensionals instanceof CycArrayList);
                    iter = coExtensionals.iterator();

                    while (iter.hasNext()) {
                        Object obj = iter.next();
                        assertTrue(obj instanceof CycFort);
                    }
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testBinaryCycAccess 16 OK ****");
    }

    /**
     * Tests the api getting of gafs (Ground Atomic Formula).
     */
    @Test
    public void testGetGafs() {
        System.out.println("\n**** testGetGafs ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

            try {
                CycListParser parser = new CycListParser(cycAccess);
                CycArrayList nart = parser.read(
                        "(#$RemotelyExploitableFn #$VulnerableToDTMLMethodExecution)");
                System.out.println("Nart: " + nart);

                CycList gafs = cycAccess.getLookupTool().getGafs(CycNart.coerceToCycNart(nart), isa);
                assertTrue(gafs.size() > 0);
            } catch (Throwable e) {
                fail(e.toString());
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testGetGafs OK ****");
    }

    /**
     * Tests the getCycImageID() api method.
     */
    @Test
    public void testGetCycImage() {
        System.out.println("\n**** testGetCycImage ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

            try {
                if (!cycAccess.isOpenCyc()) {
                    String id = cycAccess.getCycImageID();
                    assertTrue(id != null);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testGetCycImage OK ****");
    }

    /**
     * Tests the ggetELCycTerm method.
     */
    @Test
    public void testGetELCycTerm() {
        System.out.println("\n**** testGetELCycTerm ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }

            try {
                Object obj = cycAccess.getObjectTool().getELCycTerm("(#$JuvenileFn #$Dog)");
                assertTrue(obj != null);
            } catch (Throwable e) {
                fail(e.toString());
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testGetELCycTerm OK ****");
    }

    /**
     * Tests the assertWithTranscriptAndBookkeeping method.
     */
    @Test
    public void testAssertWithTranscriptAndBookkeeping() {
        System.out.println("\n**** testAssertWithTranscriptAndBookkeeping ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(StringUtils.getStringForException(e));
            }

            try {
                CycConstantI cycAdministrator = cycAccess.getLookupTool().getKnownConstantByName(
                        "CycAdministrator");
                cycAccess.setCyclist(cycAdministrator);
                String assertionString = "(#$isa #$CycAdministrator #$Person)";
                ELMt mt = universalVocabularyMt;
                cycAccess.getAssertTool().assertWithTranscriptAndBookkeeping(assertionString, mt);
            } catch (Throwable e) {
                fail(e.toString());
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testAssertWithTranscriptAndBookkeeping OK ****");
    }

    /**
     * Tests the getArg2 method.
     */
    @Test
    public void testGetArg2() {
        System.out.println("\n**** testGetArg2 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(StringUtils.getStringForException(e));
            }

            try {
                Fort cycAdministrator = cycAccess.getLookupTool().getKnownConstantByName(
                        "CycAdministrator");
                Object obj = cycAccess.getLookupTool().getArg2(isa, cycAdministrator);
                assertNotNull(obj);
                assertTrue(obj instanceof CycFort || obj instanceof CycArrayList);
                if (!cycAccess.isOpenCyc()) {
                    final String predName = "scientificName";
                    final String termName = "Emu";
                    final String mtName = "AllEnglishValidatedLexicalMicrotheoryPSC";
                    obj = cycAccess.getLookupTool().getArg2(predName, termName, mtName);
                    System.out.println(obj);
                    assertNotNull(obj);
                    Fort predicate = cycAccess.getLookupTool().getKnownConstantByName(predName);
                    Fort arg1 = cycAccess.getLookupTool().getKnownConstantByName(termName);
                    Fort mt = cycAccess.getLookupTool().getKnownConstantByName(mtName);
                    obj = cycAccess.getLookupTool().getArg2(predicate, arg1, mt);
                    System.out.println(obj);
                    assertNotNull(obj);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testGetArg2 OK ****");
    }

    @Test
    public void testManyQuickQueries() throws Exception {
        System.out.println("manyQuickQueries");
        final String varName = "?X";
        final CycVariable var = CycObjectFactory.makeCycVariable(varName);
        final CycObject mt = inferencePSC;
        final CycAccess cyc = CycClient.getCurrent();
        final InferenceParameters params = getOneShotQueryParams(cyc);
        final CycList regions = cyc.getInferenceTool().queryVariable(var,
                cyc.getObjectTool().makeCycSentence("(#$geopoliticalSubdivision #$Texas-State " + var + ")"),
                mt, params);
        assertFalse("Couldn't find any geopolitical subdivisions of Texas!", regions.isEmpty());
        final FormulaSentence qSentenceTemplate = cyc.getObjectTool().makeCycSentence(
                "(#$nameString :THING " + var + ")");
        final int maxThreads = Runtime.getRuntime().availableProcessors();
        /*
         * Test and compare two different ways to do a bunch of query-variables:
         * 1) Using CycClient#queryVariable()
         * 2) Using CycClient.#converseList(...QUERY-VARIABLE...)
         */
        final MultiThreadTester nameTester1 = new MultiThreadTester() {
            @Override
            List getValues(Object region) throws Exception {
                final FormulaSentence querySentence = qSentenceTemplate.deepCopy();
                querySentence.getArgs().set(1, region);
                final CycList<Object> names = cyc.getInferenceTool().queryVariable(var, querySentence, mt, params);
                return names;
            }
        }.run(regions, maxThreads);
        final MultiThreadTester nameTester2 = new MultiThreadTester() {
            final String mtStringApiValue = mt.stringApiValue();
            final String paramsStringApiValue = params.stringApiValue();

            @Override
            List getValues(Object region) throws Exception {
                final FormulaSentence querySentence = qSentenceTemplate.deepCopy();
                querySentence.getArgs().set(1, region);
                final CycList<Object> names = cyc.converse().converseList(
                        "(query-variable '" + var + " "
                        + querySentence.stringApiValue() + " "
                        + mtStringApiValue + " "
                        + paramsStringApiValue + ")");
                return names;
            }
        }.run(regions, maxThreads);
        assertEquals(nameTester1.lastResultCount, nameTester2.lastResultCount);
        final float ratio = (1f * nameTester1.lastElapsedMillis) / (1f * nameTester2.lastElapsedMillis);
        System.out.println("Ratio: " + ratio);
        assertTrue("queryVariable took " + ratio + " times as long as converseList", ratio < 2);
    }

    private InferenceParameters getOneShotQueryParams(final CycAccess cyc) {
        final DefaultInferenceParameters params = new DefaultInferenceParameters(cyc);
        params.setBrowsable(false);
        params.setContinuable(false);
        params.setAllowIndeterminateResults(false);
        params.put(CycObjectFactory.makeCycSymbol(":ALLOW-ABNORMALITY-CHECKING?"), CycObjectFactory.nil);
        params.put(CycObjectFactory.makeCycSymbol(":NEW-TERMS-ALLOWED?"), CycObjectFactory.nil);
        params.put(CycObjectFactory.makeCycSymbol(":COMPUTE-ANSWER-JUSTIFICATIONS?"), CycObjectFactory.nil);
        params.put(CycObjectFactory.makeCycSymbol(":MAX-PROBLEM-COUNT"),
                CycObjectFactory.makeCycSymbol(":POSITIVE-INFINITY"));
        params.put(CycObjectFactory.makeCycSymbol(":PRODUCTIVITY-LIMIT"),
                CycObjectFactory.makeCycSymbol(":POSITIVE-INFINITY"));
        params.put(CycObjectFactory.makeCycSymbol(":ANSWER-LANGUAGE"),
                CycObjectFactory.makeCycSymbol(":HL"));
        params.setMaxTime(600);
        params.setMaxTransformationDepth(0);
        return params;
    }

    /**
     * See how long it takes to run a number of tasks using a particular method.
     */
    private abstract class MultiThreadTester {

        private long lastElapsedMillis;
        private int lastResultCount;

        public MultiThreadTester() throws Exception {
        }                               

        /**
         * Get values for the specified input.
         *
         * @param input
         * @return
         * @throws Exception
         */
        abstract List getValues(final Object input) throws Exception;

        /**
         * Test the specified list of inputs with the specified max number of
         * threads.
         *
         * @param inputs
         * @param maxThreads
         * @throws Exception
         */
        MultiThreadTester run(List inputs, int maxThreads) throws Exception {

            final long startTime = System.currentTimeMillis();
            lastResultCount = 0;
            final ExecutorService executorService = Executors.newFixedThreadPool(maxThreads);
            final Deque<Future<List>> results = new LinkedList<Future<List>>();
            for (final Object thing : inputs) {
                final Callable<List> task = new Callable<List>() {
                    @Override
                    public List call() throws Exception {
                        return getValues(thing);
                    }
                };
                final Future<List> future = executorService.submit(task);
                results.offer(future);
            }
            while (!results.isEmpty()) {
                lastResultCount += results.poll().get().size();
            }
            lastElapsedMillis = System.currentTimeMillis() - startTime;
            System.out.println("Found " + lastResultCount + " values for " + inputs.size()
                    + " inputs using max of " + maxThreads + " threads in "
                    + lastElapsedMillis + "ms.");
            return this;
        }
    }

    @Test
    public void testBigCycList() {
        System.out.println("\n**** testBigCycList ****");

        CycAccess cycAccess = null;
        CycArrayList cycList = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                System.out.println("\nException: " + e.getMessage());
                fail(e.toString());
            }
            cycList = new CycListParser(cycAccess).read(
                    "(0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "
                    + "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0)");
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println(
                "**** testBigCycList OK (length = " + cycList.size() + ") ****");
    }

    @Test
    public void testUnicodeCFASL() {
        System.out.println("\n**** testUnicodeCFASL ****");
        CFASLStringTest("abc", 15);
        CFASLStringTest("", 15);
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append((char) 0x401);
        CFASLStringTest(sb.toString(), 53);
        System.out.println("**** testUnicodeCFASL OK ****");
    }

    private boolean CFASLStringTest(String str, int opcode) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(4096);
            CfaslOutputStream cos = new CfaslOutputStream(baos);
            cos.writeObject(str);
            cos.flush();
            byte[] ba = baos.toByteArray();
            if (ba == null || ba.length == 0) {
                fail("Null Byte Array Return");
            }
            //System.out.println("BA test: "+ba.length);
            //for(int i=0;i<ba.length;i++)
            //  System.out.println("ba check "+i+" "+Integer.toHexString(0xff & (int)ba[i]));
            assertEquals((int) ba[0], opcode);  // make sure opcode is correct
            ByteArrayInputStream bais = new ByteArrayInputStream(ba);

            CfaslInputStream cis = new CfaslInputStream(bais);
            Object obj = cis.readObject();
            assertTrue(obj instanceof String);
            String result = (String) obj;
            assertTrue(result.equals(str));
        } catch (IOException e) {
            fail("IOException CFASLStringTest for: " + str);
        }
        return true;

    }

    @Test
    public void testUnicodeCycSentence() throws Exception {
        System.out.println("UnicodeCycSentence");
        final CycAccess cyc = CycClient.getCurrent();
        final String georgžine = "Georgžine";
        final String sentence = "(#$nameString #$GeorgeWashington \"" + georgžine + "\")";
        checkUnicodeName(cyc.getObjectTool().makeCycSentence(sentence), georgžine);
        checkUnicodeName(CycLParserUtil.parseCycLSentence(sentence, true, cyc), georgžine);
    }

    private void checkUnicodeName(final FormulaSentence cycSentence,
            final String name) throws Exception {
        final int arity = cycSentence.getArity();
        assertEquals("Sentence has " + arity + " args.", 2, arity);
        assertEquals(name, cycSentence.getArg(2));
        final CycAccess cyc = CycClient.getCurrent();
        final ELMt mt = baseKB;
        cyc.getAssertTool().assertGaf(cycSentence, mt);
        final CycVariable var = CycObjectFactory.makeCycVariable("?X");
        final FormulaSentence qSentence = cycSentence.deepCopy();
        qSentence.getArgs().set(2, var);
        final CycList<Object> knownNames = cyc.getInferenceTool().queryVariable(var, qSentence, mt);
        assertTrue("Couldn't find " + name + " in " + knownNames, knownNames.contains(name));
    }

    @Test
    public void testHLIDGeneration() {
        System.out.println("\n**** testHLIDGeneration ****");
        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(e.toString());
            }
            HLIDGenerationTest(1, cycAccess);
            HLIDGenerationTest(0, cycAccess);
            HLIDGenerationTest(-1, cycAccess);
            //the following two tests are broken because of an apparent problem
            //in sending 1.0 over to Cyc via the API (it seems to come out on the
            //Cyc side as 1 instead of 1.0 or 1.0d0
//    HLIDGenerationTest(-1.0, cycAccess);
//    HLIDGenerationTest(1.0, cycAccess);
            HLIDGenerationTest(-1.1231231, cycAccess);
            HLIDGenerationTest(-12385341.1231231, cycAccess);

            HLIDGenerationTest("", cycAccess);
            HLIDGenerationTest("The quick brown fox jumps over the lazy dog",
                    cycAccess);

            System.out.println("**** testHLIDGeneration OK ****");
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
    }

    private boolean HLIDGenerationTest(Object obj, CycAccess cyc) {
        try {
            String cmd = "(compact-hl-external-id-string "
                    + DefaultCycObject.stringApiValue(obj) + ")";
            String cycId = cyc.converse().converseString(cmd);
            String apiId = null;
            if (obj instanceof String) {
                apiId = CompactHLIDConverter.converter().toCompactHLId((String) obj);
                assertTrue(CompactHLIDConverter.converter().isStringCompactHLId(apiId));
            } else if (obj instanceof Number) {
                apiId = CompactHLIDConverter.converter().toCompactHLId((Number) obj);
                assertTrue(CompactHLIDConverter.converter().isNumberCompactHLId(apiId));
            }
            assertTrue(apiId.equals(cycId));
        } catch (Throwable e) {
            fail(e.toString());
        }
        return true;
    }

    @Test
    public void testHLIDRoundTripConversion() {
        System.out.println("\n**** testHLIDRoundTripConversion ****");
        HLIDRoundTripConversionTest(1);
        HLIDRoundTripConversionTest(0);
        HLIDRoundTripConversionTest(-1);
        HLIDRoundTripConversionTest(-1.0);
        HLIDRoundTripConversionTest(1.0);
        HLIDRoundTripConversionTest(-1.1231231);
        HLIDRoundTripConversionTest(-12385341.1231231);

        HLIDRoundTripConversionTest("");
        HLIDRoundTripConversionTest("This is a string");

        System.out.println("**** testHLIDRoundTripConversion OK ****");
    }

    private boolean HLIDRoundTripConversionTest(Object obj) {
        try {
            String apiId = null;
            if (obj instanceof String) {
                apiId = CompactHLIDConverter.converter().toCompactHLId((String) obj);
            } else if (obj instanceof Number) {
                apiId = CompactHLIDConverter.converter().toCompactHLId((Number) obj);
            }
            Object roundTripObj = CompactHLIDConverter.converter().fromCompactHLId(
                    apiId);
            assertTrue(obj.equals(roundTripObj));
        } catch (Throwable e) {
            fail(e.toString());
        }
        return true;
    }

    /**
     * Tests the CycLeaseManager.
     */
    @Test
    public void testCycLeaseManager() {
        System.out.println("\n**** testCycLeaseManager ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                    // cycAccess.getLookupTool().getCycLeaseManager().addListener(this);
                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        kv.getValue().addListener(this);
                    }
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        kv.getValue().addListener(this);
                    }
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                    for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                        kv.getValue().addListener(this);
                    }

                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(StringUtils.getStringForException(e));
            }

            try {
                Thread.sleep(6000);
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

            /*
             if (cycAccess.getLookupTool().getCycLeaseManager() != null) {
             cycAccess.getLookupTool().getCycLeaseManager().removeAllListeners();
             }
             */

            for (Map.Entry<InputStream, LeaseManager> kv : cycAccess.getCycConnection().getCycLeaseManagerCommMap().entrySet()) {
                if (kv.getValue() != null) {
                    kv.getValue().removeAllListeners();
                }
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testCycLeaseManager OK ****");
    }

    /**
     * Tests the CycLeaseManager.
     */
    @Test
    public void testCycLeaseManager2() throws Exception {
        System.out.println("\n**** testCycLeaseManager2 ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                    cycAccess.getCycLeaseManager().addListener(this);
                }  else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(StringUtils.getStringForException(e));
            }

            try {
                Thread.sleep(6000);
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }

             if (cycAccess.getCycLeaseManager() != null) {
                cycAccess.getCycLeaseManager().removeAllListeners();
             }
        } catch (Exception e) {
          e.printStackTrace();
          throw new Exception(e);
        } 
        finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testCycLeaseManager2 OK ****");
    }

    /**
     * Tests inference problem store reuse.
     */
    @Test
    public void testInferenceProblemStoreReuse() {
        System.out.println("\n**** testInferenceProblemStoreReuse ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(StringUtils.getStringForException(e));
            }

            try {
                if (!cycAccess.isOpenCyc()) {
                    final String inferenceProblemStoreName = "my-problem-store";
                    cycAccess.getInferenceTool().initializeNamedInferenceProblemStore(
                            inferenceProblemStoreName, null);
                    FormulaSentence query = cycAccess.getObjectTool().makeCycSentence(
                            "(#$objectFoundInLocation ?WHAT ?WHERE)");
                    CycArrayList variables = new CycArrayList();
                    variables.add(makeCycVariable("?WHAT"));
                    variables.add(makeCycVariable("?WHERE"));
                    InferenceParameters queryProperties = new DefaultInferenceParameters(
                            cycAccess);
                    CycConstantI universeDataMt = cycAccess.getLookupTool().getKnownConstantByGuid(
                            UNIVERSE_DATA_MT_GUID_STRING);
                    CycList response = cycAccess.getInferenceTool().queryVariables(variables, query,
                            universeDataMt, queryProperties, inferenceProblemStoreName);
                    assertNotNull(response);
                    response = cycAccess.getInferenceTool().queryVariables(variables, query, universeDataMt,
                            queryProperties, inferenceProblemStoreName);
                    assertNotNull(response);
                    response = cycAccess.getInferenceTool().queryVariables(variables, query, universeDataMt,
                            queryProperties, inferenceProblemStoreName);
                    assertNotNull(response);
                    cycAccess.getInferenceTool().destroyInferenceProblemStoreByName(inferenceProblemStoreName);
                }
            } catch (Throwable e) {
                e.printStackTrace();
                fail(e.toString());
            }
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }
        System.out.println("**** testInferenceProblemStoreReuse OK ****");
    }

    /**
     * Tests inference problem store reuse.
     */
    @Test
    public void testInvalidTerms() {
        System.out.println("\n**** testInvalidTerms ****");

        CycAccess cycAccess = null;
        try {
            try {
                if (connectionMode == LOCAL_CYC_CONNECTION) {
                    cycAccess = new CycClient(TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOAP_CYC_CONNECTION) {
                    cycAccess = new CycClient(endpointURL, TestUtils.testHostName,
                            TestUtils.testBasePort);
                } else if (connectionMode == SOCKET_COMM_CYC_CONNECTION) {
                    cycAccess = new CycClient(new SocketComm(TestUtils.testHostName,
                            TestUtils.testBasePort));
                } else if (connectionMode == ROUND_ROBIN_SOCKET_COMM_CYC_CONNECTION) {
                    // SocketCommRoundRobin will create two socket connections to two 
                    // Cyc servers on 3600 and 3620. This is hardcoded in SocketCommRoundRobin
                    cycAccess = new CycClient(new SocketCommRoundRobin());
                } else {
                    fail("Invalid connection mode " + connectionMode);
                }
            } catch (Throwable e) {
                fail(StringUtils.getStringForException(e));
            }
            if (cycAccess.isOpenCyc()) {
                System.out.println("Can't test invalid terms on OpenCyc image.");
            } else {
                // invalid constant
                {
                    final boolean invalidConstantCfaslWorks = false; // Until system 1.131015.
                    if (invalidConstantCfaslWorks) {
                        try {
                            final String command = "(list \"a\" 1 #$Brazil (cfasl-invalid-constant) \"z\")";
                            cycAccess.converse().converseList(command);
                            fail("Expected CycApiException not thrown.");
                        } catch (CycApiException e) {
                        } catch (CycConnectionException e) {
                            fail(StringUtils.getStringForException(e));
                        } catch (Throwable t) {
                            fail(t.getLocalizedMessage());
                        }
                        try {
                            final String command = "(list \"a\" 1 #$Brazil \"z\")";
                            final CycList result = cycAccess.converse().converseList(command);
                            assertEquals(result.toString(), "(\"a\" 1 Brazil \"z\")");
                        } catch (Throwable e) {
                            fail(StringUtils.getStringForException(e));
                        }
                    }
                }

                // invalid nart
                try {
                    final String command = "(list \"a\" 1 #$Brazil (cfasl-invalid-nart) \"z\")";
                    final CycList result = cycAccess.converse().converseList(command);
                    fail("Expected CycApiException not thrown.");
                } catch (CycApiException e) {
                } catch (CycConnectionException e) {
                    fail(StringUtils.getStringForException(e));
                }
                try {
                    final String command = "(list \"a\" 1 #$Brazil \"z\")";
                    final CycList result = cycAccess.converse().converseList(command);
                    assertEquals(result.toString(), "(\"a\" 1 Brazil \"z\")");
                } catch (Throwable e) {
                    fail(StringUtils.getStringForException(e));
                }

                // invalid assertion
                try {
                    final String command = "(list \"a\" 1 #$Brazil (create-sample-invalid-assertion) \"z\")";
                    final CycList result = cycAccess.converse().converseList(command);
                    fail("Expected CycApiException not thrown.");
                } catch (CycApiException e) {
                    //System.out.println(e.getMessage());
                } catch (CycConnectionException e) {
                    fail(StringUtils.getStringForException(e));
                }
                try {
                    final String command = "(list \"a\" 1 #$Brazil \"z\")";
                    final CycList result = cycAccess.converse().converseList(command);
                    assertEquals(result.toString(), "(\"a\" 1 Brazil \"z\")");
                } catch (Throwable e) {
                    fail(StringUtils.getStringForException(e));
                }
            }
        } catch (Throwable t) {
            System.out.println("Caught " + t);
        } finally {
            if (cycAccess != null) {
                cycAccess.close();
                cycAccess = null;
            }
        }

        System.out.println("**** testInvalidTerms OK ****");
    }
}
