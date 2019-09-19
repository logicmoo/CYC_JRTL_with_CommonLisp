/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
 * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ***/
package net.wimpi.telnetd.util;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

/**
 * Dummy Security Manager that permits to catch calls
 * to System.exit();
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class NoExitSecurityManager
    extends SecurityManager {

  private SecurityManager m_SecurityMgr;


  public NoExitSecurityManager(SecurityManager sm) {
    m_SecurityMgr = sm;
  }//constructor

  public SecurityManager getSystemSecurityManager() {
    return m_SecurityMgr;
  }//getSystemSecurityManager

  public void checkExit(int i)
      throws SecurityException {
    throw new SecurityException("Exit not allowed.");
  }//checkExit


  public Object getSecurityContext() throws SecurityException {
    if (m_SecurityMgr == null) {
      return null;
    } else {
      return m_SecurityMgr.getSecurityContext();
    }
  }//getSecurityContext

  public void checkPermission(Permission permission)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkPermission(permission);
    }
  }//checkPermission

  public void checkPermission(Permission permission, Object o)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkPermission(permission, o);
    }
  }

  public void checkCreateClassLoader()
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkCreateClassLoader();
    }
  }//checkCreateClassLoader

  public void checkAccess(Thread thread)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkAccess(thread);
    }
  }//checkAccess

  public void checkAccess(ThreadGroup threadGroup)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkAccess(threadGroup);
    }
  }


  public void checkExec(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkExec(s);
    }
  }

  public void checkLink(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkLink(s);
    }
  }

  public void checkRead(FileDescriptor fileDescriptor)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkRead(fileDescriptor);
    }
  }

  public void checkRead(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkRead(s);
    }
  }

  public void checkRead(String s, Object o)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkRead(s, o);
    }
  }

  public void checkWrite(FileDescriptor fileDescriptor)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkWrite(fileDescriptor);
    }
  }

  public void checkWrite(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkWrite(s);
    }
  }

  public void checkDelete(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkDelete(s);
    }
  }

  public void checkConnect(String s, int i)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkConnect(s, i);
    }
  }

  public void checkConnect(String s, int i, Object o)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkConnect(s, i, o);
    }
  }

  public void checkListen(int i)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkListen(i);
    }
  }

  public void checkAccept(String s, int i)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkAccept(s, i);
    }
  }

  public void checkMulticast(InetAddress inetAddress)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkMulticast(inetAddress);
    }
  }


  public void checkPropertiesAccess()
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkPropertiesAccess();
    }
  }

  public void checkPropertyAccess(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkPropertyAccess(s);
    }
  }

  public boolean checkTopLevelWindow(Object o)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return true;
    } else {
      return m_SecurityMgr.checkTopLevelWindow(o);
    }
  }

  public void checkPrintJobAccess()
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkPrintJobAccess();
    }
  }

  public void checkSystemClipboardAccess()
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkSystemClipboardAccess();
    }
  }

  public void checkAwtEventQueueAccess()
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkAwtEventQueueAccess();
    }
  }


  public void checkPackageAccess(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkPackageAccess(s);
    }
  }

  public void checkPackageDefinition(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkPackageDefinition(s);
    }
  }

  public void checkSetFactory()
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkSetFactory();
    }
  }

  public void checkMemberAccess(Class aClass, int i)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkMemberAccess(aClass, i);
    }
  }

  public void checkSecurityAccess(String s)
      throws SecurityException {
    if (m_SecurityMgr == null) {
      return;
    } else {
      m_SecurityMgr.checkSecurityAccess(s);
    }
  }


}//class NoExitSecurityManager
