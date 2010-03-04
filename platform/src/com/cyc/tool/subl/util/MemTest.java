/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.util;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

//// Internal Imports

//// External Imports

public  class MemTest {
  
  //// Constructors
  
  /** Creates a new instance of MemTest. */
  public MemTest() {
  }
  
  //// Public Area
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private static final int OBJECTS_TO_ALLOCATE = 260000000;
  private static final int MAX_ARRAY_LENTH = 260000000;
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Starting...");
    try {
      int objectsToAllocateSize = OBJECTS_TO_ALLOCATE;
      if (args.length >= 1) {
        try {
          objectsToAllocateSize = Integer.parseInt(args[0]);
        } catch (Exception e) {} //ignore
      }
      int nArrays = (int)Math.floor(objectsToAllocateSize/MAX_ARRAY_LENTH);
      if ((objectsToAllocateSize % MAX_ARRAY_LENTH) != 0) {
        nArrays++;
      }
      ArrayList[] items = new ArrayList[nArrays];
      for (int i = 0; i < nArrays; i++) {
        System.out.println("Allocating array of size: " + MAX_ARRAY_LENTH);
        items[i] = new ArrayList(MAX_ARRAY_LENTH); // @note this is potentially very wasteful -APB
      }
      long origTime = System.currentTimeMillis();
      Runtime.getRuntime().gc();
      long origSpace = Runtime.getRuntime().freeMemory();
      int curPowNum = (int)Math.pow(1, 0);
      DateFormat formatter =
        DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG);
      for (int i = 1, curPower = 1; i <= objectsToAllocateSize; i++) {
        int index = (int)Math.floor((i-1)/MAX_ARRAY_LENTH);
        items[index].add(new Object());
        if (curPowNum == i) {
          curPowNum = (int)Math.pow(2, ++curPower);
          //Runtime.getRuntime().gc();
          long curSpace = Runtime.getRuntime().freeMemory();
          System.out.println("Objects created: " + i);
          System.out.println("Available heap space: " + curSpace + " bytes");
          System.out.println("Space per object: " + ((origSpace - curSpace)/(double)i) + " bytes");
          long curTime = System.currentTimeMillis();
          System.out.println("Time per object allocation: " + ((curTime - origTime)/(double)i) + " msecs");
          System.out.println("Time: " + formatter.format(new Date()));
          System.out.println("*******************************");
        }
      }
      long curSpace = Runtime.getRuntime().freeMemory();
      System.out.println("Objects created: " + objectsToAllocateSize);
      System.out.println("Available heap space: " + curSpace + " bytes");
      System.out.println("Space per object: " + ((origSpace - curSpace)/(double)objectsToAllocateSize) + " bytes");
      long curTime = System.currentTimeMillis();
      System.out.println("Time per object allocation: " + ((curTime - origTime)/(double)objectsToAllocateSize) + " msecs");
      System.out.println("Time: " + formatter.format(new Date()));
      System.out.println("*******************************");
      
      for (int i = 1; i <= 10; i++) {
        origTime = System.currentTimeMillis();
        Runtime.getRuntime().gc();
        curTime = System.currentTimeMillis();
        System.out.println("Time to do nop GC with memory full: " + ((curTime - origTime)/(double)i));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Finished.");
  }
  
}
