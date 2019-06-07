package org.opencyc.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.opencyc.util.Hierarchy.HierarchyComparator;

/**
 *
 * @author baxter
 */
public class HierarchyTest {

  public HierarchyTest() {
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

  @Test
  public void testHierarchyBuilder() {
    System.out.println("Testing hierarchy builder.");
    final List<Integer> numbers = new ArrayList<Integer>();
    for (int i = 2; i <= 100; i++) {
      numbers.add(i);
    }
    //Collections.shuffle(numbers);
    final Hierarchy.Builder<Integer> builder = new Hierarchy.Builder<Integer>() {
      @Override
      public boolean isSuperior(Integer obj1, Integer obj2) {
        return obj2 > obj1 && obj2 % obj1 == 0;
      }
    };
    final List<Hierarchy<Integer>> hierarchies = new ArrayList(builder.organize(
            numbers));
    Collections.sort(hierarchies, new HierarchyComparator<Integer>());
    for (final Hierarchy<Integer> hierarchy : hierarchies) {
      final Integer rootNumber = hierarchy.getRoot().getContent();
      assertTrue(rootNumber + " is not prime!", isPrime(rootNumber));
      //hierarchy.printIndented(System.out);
    }
  }

  boolean isPrime(int n) {
    //check if n is a multiple of 2
    if (n % 2 == 0) {
      return n == 2;
    }
    //if not, then just check the odds
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
