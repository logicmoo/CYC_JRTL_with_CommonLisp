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


//// Internal Imports
import com.cyc.tool.subl.util.SafeRunnable;

//// External Imports
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <P>SubLThreadPool is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date December 11, 2005, 2:19 PM
 * @version $Id: SubLThreadPool.java 127501 2009-03-30 20:35:37Z tbrussea $
 */
final public class SubLThreadPool extends ThreadPoolExecutor {
  
  //// Constructors
  
  /** Creates a new instance of SubLThreadPool. */
  public SubLThreadPool() {
    super (MIN_THREADS, MAX_THREADS, KEEP_ALIVE_TIME, KEEP_ALIVE_UNITS, 
      DEFAULT_WORK_QUEUE, DEFAULT_THREAD_FACTORY);
  }
  
  //// Public Area
  
  public static SubLThreadPool getDefaultPool() {
    return defaultSubLThreadPool;
  }
  
  public static ThreadGroup getDefaultThreadGroup() {
    return defaultThreadGroup;
  }
  
  /** ensure we only run the right type of runnables **/
  public void execute(Runnable runnable) {
    super.execute((SafeRunnable)runnable);
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private static int threadNum = 1;
  private static final ThreadGroup defaultThreadGroup = new ThreadGroup("SubL Thread Group");
  private static final int MIN_THREADS = 70;
  private static final int MAX_THREADS = 70;
  private static final int KEEP_ALIVE_TIME = 5  * 60;
  private static final TimeUnit KEEP_ALIVE_UNITS = TimeUnit.SECONDS;
  private static final ThreadFactory DEFAULT_THREAD_FACTORY = new ThreadFactory() {
      public Thread newThread(Runnable command) {
        return new SubLThread(defaultThreadGroup, command, "SubL Thread #" + threadNum++);
      }
    };
  private static final BlockingQueue<Runnable> DEFAULT_WORK_QUEUE = new ArrayBlockingQueue<Runnable>(1024);
  
  private static final SubLThreadPool defaultSubLThreadPool = new SubLThreadPool();
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}
