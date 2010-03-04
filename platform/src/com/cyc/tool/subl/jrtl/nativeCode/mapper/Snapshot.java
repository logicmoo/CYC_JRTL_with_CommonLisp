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

package  com.cyc.tool.subl.jrtl.nativeCode.mapper;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <P>Snapshot represents the state of the :world initialized variables
 * from the relevant packages.
 *
 * <P>Copyright (c) 2009 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author rck
 * @date January 14th, 2009 09:45 AM
 * @version $Id: Snapshot.java 126867 2009-01-20 19:22:58Z aldag $
 */
final public class Snapshot {

  public Snapshot(SubLStream out) {
    this.out = out;
    this.serializerFunction = SubLPackage.CYC_PACKAGE.retrieveSymbol("CFASL-OUTPUT");
    this.positionFunction = SubLPackage.CYC_PACKAGE.retrieveSymbol("FILE-POSITION");
    this.listeners = new ArrayList<SnapShootingListener>();
  }
  
  public interface SnapShootingListener {
    
    public void noteSymbol( String pkgName, String symbolName, SubLObject filePosition);
    
    public void skippedSymbol(String pkgName, String symbolName, Exception xcpt);
    
  }
  
  public void addListener(SnapShootingListener listener) {
    synchronized (listeners) {
      listeners.add(listener);
    }
  }
  
  public void removeListener(SnapShootingListener listener) {
    synchronized (listeners) {
      listeners.remove(listener);
    }
  }
  
  /**
   * Conveniene method that tramnpolines to the static version
   * @throws java.io.IOException
   */
  public void snapShoot() throws IOException {
    snapShoot(this);
  }
  
  static public void snapShoot(Snapshot snapShot) throws IOException {
    // @todo this should iterate over all packages, not just the well-known
    // main packages 
    // @todo do the SubL package as well 
    // snapShot.snapShootPackage(SubLPackage.SUBLISP_PACKAGE);
    snapShot.snapShootPackage(SubLPackage.CYC_PACKAGE);
  }
  
  
  private void snapShootPackage(SubLPackage pkg) throws IOException {
    final String packageName = pkg.getName();
    final List<SubLSymbol> candidates = pkg.worldInitializedSymbols();
    for (final SubLSymbol symbol : candidates) {
      final String symbolName = symbol.getName();
      final SubLObject value = symbol.getGlobalValue();
      try {
        final SubLObject position = Functions.funcall(positionFunction, out);
        Functions.funcall(serializerFunction, value, out);
        notifyListeners(packageName, symbolName, position);
      } catch (Exception xcpt) {
        notifyListeners(packageName, symbolName, xcpt);
      }
    }
  }
  
  private void notifyListeners(String pkgName, String symbolName, SubLObject filePosition) {
    synchronized (listeners) {
      for (final SnapShootingListener l : listeners) {
        try {
          l.noteSymbol(pkgName, symbolName, filePosition);
        } catch (Exception xcpt) {
          System.err.println("Failed to notify listener " + l + " for "
                  + pkgName + ":" + symbolName + " of file position " + filePosition);
          xcpt.printStackTrace();
        }
      }
    }
  }
  
  private void notifyListeners(String pkgName, String symbolName, Exception xcpt) {
    synchronized (listeners) {
      for (final SnapShootingListener l : listeners) {
        try {
          l.skippedSymbol(pkgName, symbolName, xcpt);
        } catch (Exception e) {
          System.err.println("Failed to notify listener " + l + " of skipped symbol "
                  + pkgName + ":" + symbolName + " due to the following exception: ");
          xcpt.printStackTrace();
          System.err.println("Notifying the listerner caused the following exception:");
          e.printStackTrace();
        }
      }
    }    
  }
  
  final private SubLStream out;
  final private SubLSymbol serializerFunction;
  final private SubLSymbol positionFunction;
  final private List<SnapShootingListener> listeners;
}
