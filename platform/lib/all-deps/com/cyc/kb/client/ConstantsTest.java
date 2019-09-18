package com.cyc.kb.client;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.kb.Context;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.ContextImpl;

import java.util.logging.Logger;

import org.junit.*;

import static org.junit.Assert.*;

/**
 *
 * @author vijay
 */
public class ConstantsTest {

    
    private static Logger log = null;

    @BeforeClass
    public static void setUp() throws Exception {
        log = Logger.getLogger(ConstantsTest.class.getName());
        TestConstants.ensureInitialized();
    }

    @AfterClass
    public static void tearDown() throws Exception {
    }
    
    @Test
    public void testGetInstance() throws Exception {
        System.out.println("getInstance");
    }

    @Test
    public void testDataMt() throws Exception {
        System.out.println("dataMt");
    }

    @Test
    public void testBaseKbMt() throws Exception {
        System.out.println("baseKbMt");
    }

    @Test
    public void testEverythingPSCMt() throws Exception {
        System.out.println("everythingPSCMt");
        Context result = Constants.everythingPSCMt();
        assertEquals(ContextImpl.get("EverythingPSC"), result);
    }

    @Test
    public void testInferencePSCMt() throws Exception {
        System.out.println("inferencePSCMt");
        Context result = Constants.inferencePSCMt();
        assertEquals(ContextImpl.get("InferencePSC"), result);
        assertFalse(ContextImpl.get("EverythingPSC").equals(result));
    }
}
