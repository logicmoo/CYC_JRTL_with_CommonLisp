/* $Id: InformationSource.java 151212 2014-05-13 23:20:22Z jmoszko $
 *
 * Copyright (c) 2012 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.base.cycobject;

//// Internal Imports

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import java.net.URL;
//// Internal Imports
//// External Imports
/**
 * <P>InformationSource is designed to...
 *
 * <P>Copyright (c) 2012 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : May 13, 2014, 5:43:38 PM
 * Author     : jmoszko
 * @version $Id: InformationSource.java 151212 2014-05-13 23:20:22Z jmoszko $
 */
public interface InformationSource {

  /**
   * Returns a string suitable for citing this source.
   *
   * @return a string suitable for citing this source.
   */
  String getCitationString();

  /**
   *
   * @return the CycL term representing this source.
   */
  DenotationalTerm getCycL();

  /**
   * Returns a graphical representation of this source.
   *
   * @return a graphical representation of this source.
   */
  /*
  public Image getIcon() {
  return icon;
  }
   */
  URL getIconURL();
  
  public interface CitationGenerator {
    /**
     * Ask Cyc for an image for the citation string to use for the specified source.
     *
     * @param source
     * @param cycAccess
     * @return
     */
    public String getCitationStringForSource(DenotationalTerm source,
            CycAccess cycAccess) throws CycConnectionException;
    }
  
}
