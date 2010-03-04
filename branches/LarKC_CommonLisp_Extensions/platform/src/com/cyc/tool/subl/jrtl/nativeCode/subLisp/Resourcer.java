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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
//import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLIntegerBignum;
import com.cyc.tool.subl.util.ObjectPool;
import java.util.ArrayList;

import java.util.Arrays;

//// External Imports

public  final class Resourcer extends RuntimeException implements CommonSymbols {
  
  /* Examples:

  Object[] array = null;
  Resourcer resourcer = Resourcer.getInstance();
  try {
    array = resourcer.acquireObjectArray(2); //takes the size of the array
    //initialize array here
    //do something with array here
  } finally {
    resourcer.releaseObjectArray(args);
  }
   
  SubLListListIterator iter = null;
  Resourcer resourcer = Resourcer.getInstance();
  try {
    iter = resourcer.acquireSubLListListIterator(list); //takes the list you want to iterate over
    while (iter.hasNext()) {
      SubLObject item = iter.nextSubLObject();
      //do something with item here
    }
  } finally {
    resourcer.releaseSubLListListIterator(iter);
  }

  */
  
  //// Constructors
  
  /** Creates a new instance of Resourcer. */
  public Resourcer() {
    for (int i = 0, size = ObjectArrayObjectPool.MAX_ARRAY_SIZE; i < size; i++) {
      objectArrayObjectPools[i] = new ObjectArrayObjectPool(i).init();
    }
    for (int i = 0, size = SubLObjectArrayObjectPool.MAX_ARRAY_SIZE; i < size; i++) {
      sublObjectArrayObjectPools[i] = new SubLObjectArrayObjectPool(i).init();
    }
  }
  
  //// Public Area
  
  public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
  
  public static final SubLObject[] EMPTY_SUBL_OBJECT_ARRAY = new SubLObject[0];
  
  public static final Resourcer getInstance() {
    return ((SubLThread)Thread.currentThread()).getResourcer();
  }
  
  //// SubLListListIterators
  
  public SubLListListIterator acquireSubLListListIterator(SubLList list) {
    return acquireSubLListListIterator(list, 0, -1);
  }
  
  public SubLListListIterator acquireSubLListListIterator(SubLList list, int start) {
    return acquireSubLListListIterator(list, start, (list == null) ? 0 : -1);
  }
  
  public SubLListListIterator acquireSubLListListIterator(SubLList list, int start, int end) {
    SubLListListIterator iter = null;
    if (list.isArrayBased()) {
      iter = (SubLListListIterator)sublArrayListListIteratorPool.acquire();
    } else {
      iter = (SubLListListIterator)sublConsListListIteratorPool.acquire();
    }
    iter.init(list, start, end);
    return iter;
  }
  
  public void releaseSubLListListIterator(SubLListListIterator iter) {
    if (iter == null) { return; }
    if (iter.isArrayBased()) {
      sublArrayListListIteratorPool.release(iter);
    } else {
      sublConsListListIteratorPool.release(iter);
    }
  }
  
  //// Object Arrays
  
  public Object[] acquireObjectArray(int size) {
    if (size >= ObjectArrayObjectPool.MAX_ARRAY_SIZE) { return new Object[size]; }
    return (Object[])objectArrayObjectPools[size].acquire();
  }
  
  public void releaseObjectArray(Object[] array) {
    if (array == null) { return; }
    if (array.length >= ObjectArrayObjectPool.MAX_ARRAY_SIZE) { return; }
    objectArrayObjectPools[array.length].release(array);
  }
  
  //// SubLObject Arrays
  
  public SubLObject[] acquireSubLObjectArray(int size) {
    if (size <= 0) { return EMPTY_SUBL_OBJECT_ARRAY; }
    if (size >= SubLObjectArrayObjectPool.MAX_ARRAY_SIZE) { return new SubLObject[size]; }
    return (SubLObject[])sublObjectArrayObjectPools[size].acquire();
  }
  
  public SubLObject[] acquireSubLObjectArray(SubLList list) {
    if ((list == null) || (list.size() <= 0)) {
      return EMPTY_SUBL_OBJECT_ARRAY;
    }
    SubLObject[] result;
    int size = list.size();
    if (size >= SubLObjectArrayObjectPool.MAX_ARRAY_SIZE) { 
      result =  new SubLObject[size]; 
    } else {
      result = (SubLObject[])sublObjectArrayObjectPools[size].acquire();
    }
    return (SubLObject[])list.toArray(result);
  }
  
  public SubLObject[] acquireSubLObjectArray(ArrayList<SubLObject> list) {
    if ((list == null) || (list.size() <= 0)) {
      return EMPTY_SUBL_OBJECT_ARRAY;
    }
    SubLObject[] result;
    int size = list.size();
    if (size >= SubLObjectArrayObjectPool.MAX_ARRAY_SIZE) { 
      result =  new SubLObject[size]; 
    } else {
      result = (SubLObject[])sublObjectArrayObjectPools[size].acquire();
    }
    return (SubLObject[])list.toArray(result);
  }
  
  public void releaseSubLObjectArray(SubLObject[] array) {
    if (array == null) { return; }
    if (array.length == 0) { return; }
    if (array.length >= SubLObjectArrayObjectPool.MAX_ARRAY_SIZE) { return; }
    sublObjectArrayObjectPools[array.length].release(array);
  }
  
  /// SubL hashtable key entries
  
  public SubLHashtableKeyEntryImpl acquireHashtableKeyEntry() {
    final SubLHashtableKeyEntryImpl keyEntry = (SubLHashtableKeyEntryImpl)hashtableKeyEntryPool.acquire();
    return keyEntry;
  }
  
  public void releaseHashtableKeyEntry( SubLHashtableKeyEntry keyEntry) {
    if (keyEntry != null) {
      hashtableKeyEntryPool.release(keyEntry);
    }
  }
  
  /*public SubLIntegerBignum acquireSubLIntegerBignum() {
    return (SubLIntegerBignum)sublIntegerBignumPool.acquire();
  }
  
  public void releaseSubLIntegerBignum(SubLIntegerBignum num) {
    sublIntegerBignumPool.release(num);
  }*/
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //private ObjectPool sublIntegerBignumPool = new SubLIntegerBignumObjectPool().init();
           
  private ObjectPool sublArrayListListIteratorPool = new SubLArrayListListIteratorObjectPool().init();
  
  private ObjectPool sublConsListListIteratorPool = new SubLConsListListIteratorObjectPool().init();

  private ObjectPool hashtableKeyEntryPool = new HashtableKeyEntryPool().init();
  
  private ObjectPool[] objectArrayObjectPools = 
    new ObjectArrayObjectPool[ObjectArrayObjectPool.MAX_ARRAY_SIZE];
  
  private ObjectPool[] sublObjectArrayObjectPools = 
    new SubLObjectArrayObjectPool[SubLObjectArrayObjectPool.MAX_ARRAY_SIZE];
  
  private static final class SubLArrayListListIteratorObjectPool extends ObjectPool {
    public final void resetPoolItem(Object item) { ((SubLListListIterator)item).reset(); }
    public final Object makePoolItem() { return new SubLArrayListListIterator(); }
  }
  
  private static final class SubLConsListListIteratorObjectPool extends ObjectPool {
    public final void resetPoolItem(Object item) { ((SubLListListIterator)item).reset(); }
    public final Object makePoolItem() { return new SubLConsListListIterator(); }
  }
  
  static final class ObjectArrayObjectPool extends ObjectPool {
    ObjectArrayObjectPool(int size) { 
      super(32);
      arraySize = size; 
    }
    public final void resetPoolItem(Object item) { Arrays.fill((Object[])item, null); } //allow gc to work
    public final Object makePoolItem() { return new Object[arraySize]; }
    private int arraySize;
    public static final int MAX_ARRAY_SIZE = 24;
  }
  
  private static final class ArrayListPool extends ObjectPool {
    ArrayListPool() { super(16); }
    public final void resetPoolItem(Object item) {
      ((ArrayList)item).clear(); //allow gc to work
    }
    public final Object makePoolItem() { return new ArrayList(DEFAULT_SIZE); }
    public static final int DEFAULT_SIZE = 8192;
  }
  
  private static final class StringBuilderPool extends ObjectPool {
    StringBuilderPool(int size) { super(16); }
    public final void resetPoolItem(Object item) { ((StringBuilder)item).setLength(0); } //allow gc to work
    public final Object makePoolItem() { return new StringBuilder(DEFAULT_SIZE); }
    public static final int DEFAULT_SIZE = 8192;
  }
  
  static final class SubLObjectArrayObjectPool extends ObjectPool {
    SubLObjectArrayObjectPool(int size) { 
      super(32);
      arraySize = size; 
    }
    public final void resetPoolItem(Object item) { Arrays.fill((SubLObject[])item, null); } //allow gc to work
    public final Object makePoolItem() { return new SubLObject[arraySize]; }
    private int arraySize;
    public static final int MAX_ARRAY_SIZE = 24;
  }
  
  private static final class HashtableKeyEntryPool extends ObjectPool {
    HashtableKeyEntryPool() { super(16); }
    public final void resetPoolItem(Object item) { ((SubLHashtableKeyEntry)item).clear(); }
    public final Object makePoolItem() { return new SubLHashtableKeyEntryImpl(); }
  } 
  
  /*private static final class SubLIntegerBignumObjectPool extends ObjectPool {
    SubLIntegerBignumObjectPool() { super(1024 * 10); }
    public final void resetPoolItem(Object item) { }
    public final Object makePoolItem() { return new SubLIntegerBignum.MutableSubLIntegerBignum(0); }
  }*/
}
