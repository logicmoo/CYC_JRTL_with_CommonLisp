/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.baseclient.nl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author baxter
 */
public class ParaphraseTest {
  
  public ParaphraseTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of compareTo method, of class Paraphrase.
   */
  @Test
  public void testCompareTo() {
    System.out.println("compareTo");
    final Paraphrase<Integer> firstOne = new Paraphrase<Integer>("one", 1);
    final Paraphrase<Integer> secondOne = new Paraphrase<Integer>("one", 1);
    final Paraphrase<Integer> two = new Paraphrase<Integer>("two", 2);
    assertEquals(0, firstOne.compareTo(secondOne));
    final List<Paraphrase<Integer>> paraphrases = Arrays.asList(two, firstOne);
    Collections.sort(paraphrases);
    assertEquals(two, paraphrases.get(1));
  }
}
