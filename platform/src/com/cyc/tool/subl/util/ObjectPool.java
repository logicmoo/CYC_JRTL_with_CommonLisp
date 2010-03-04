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
import java.util.ArrayList;

public  abstract class ObjectPool {
  
  //// Constructors

  public ObjectPool() {
    this(DEFAULT_POOL_SIZE);
  }
  
  public ObjectPool(int initialSize) {
    pool = new ArrayList<Object>(initialSize);
    currentCapacity = initialSize;
  }
  
  //// Public Area
  
  public abstract void resetPoolItem(Object item);
  
  public abstract Object makePoolItem();
  
  // @todo add background task for shrinking pools -APB
  
  public final Object acquire() {
    init();
    int size = pool.size();
    if (size == 0) {
      int previousCapacity = currentCapacity;
      currentCapacity  = (currentCapacity * 3)/2 + 1;
      pool.ensureCapacity(currentCapacity);
      for (int i = 0, curSize = (currentCapacity - previousCapacity); i < curSize; i++) {
        Object obj = makePoolItem();
        pool.add(obj);
      }
      size = pool.size();
    }
    final Object result = pool.remove(size - 1);
    return result;
  }
  
  public final void release(Object item) {
    resetPoolItem(item);
    pool.add(item);
  }
  
  public ObjectPool init() {
    if (!isInitialized) {
      for (int i = 0; i < currentCapacity; i++) {
        Object obj = makePoolItem();
        pool.add(obj);
      }
      isInitialized = true;
    }
    return this;
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private ArrayList<Object> pool = new ArrayList<Object>();
  
  private int currentCapacity;
  
  private static final int DEFAULT_POOL_SIZE = 64;
  
  private boolean isInitialized = false;
  
  //// Main
  
}
