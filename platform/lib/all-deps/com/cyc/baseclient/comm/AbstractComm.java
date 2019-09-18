/* $Id: AbstractComm.java 150536 2014-04-15 20:54:59Z nwinant $
 *
 * Copyright (c) 2013 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.baseclient.comm;

//// Internal Imports

import com.cyc.base.conn.CycConnectionInterface;


//// External Imports

/** 
 * <P>AbstractComm is designed to provide a convient location for methods that
 * can be used across all Comm implementations.
 *
 * <P>Copyright (c) 2013 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : May 7, 2013, 12:19:20 PM
 * Author     : tbrussea
 * @version $Id: AbstractComm.java 150536 2014-04-15 20:54:59Z nwinant $
 */
public abstract class AbstractComm implements Comm {

  //// Constructors

  /** Creates a new instance of AbstractComm. */
  public AbstractComm() {}

  //// Public Area
  
  @Override
  public synchronized CycConnectionInterface getCycConnection() {
    return cycConnection;
  }
  
  @Override
  public synchronized void setCycConnection(CycConnectionInterface conn){
    if (conn == this.cycConnection) {
      return;
    }
    this.cycConnection = conn;
  }

  //// Protected Area

  //// Private Area

  //// Internal Rep
  
  private CycConnectionInterface cycConnection;

}
