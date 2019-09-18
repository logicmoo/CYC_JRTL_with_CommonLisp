/* $Id: Entry.java 150536 2014-04-15 20:54:59Z nwinant $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.baseclient.util;

//// Internal Imports

//// External Imports

/**
 * <P>Entry is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author mreimers
 * @date August 11, 2004, 1:00 PM
 * @version $Id: Entry.java 150536 2014-04-15 20:54:59Z nwinant $
 */
public interface Entry {
  
  public Object getKey();
  public Object getValue();
  
}
