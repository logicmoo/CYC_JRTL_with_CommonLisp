/*
 * QueryListener.java
 *
 * Created on August 10, 2004, 2:06 PM
 */

package com.cyc.baseclient.util.query;

import java.util.EventListener;

/**
 * @version $Id: QueryListener.java 150536 2014-04-15 20:54:59Z nwinant $
 * @author  mreimers
 */
public interface QueryListener extends EventListener {
  public void queryChanged(QueryChangeEvent e);
}
