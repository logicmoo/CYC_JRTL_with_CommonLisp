/* $Id: InferenceAnswerIdentifierI.java 151223 2014-05-14 16:44:27Z jmoszko $
 *
 * Copyright (c) 2012 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.base.inference;

//// Internal Imports

import com.cyc.base.cycobject.CycList;
//// Internal Imports
//// External Imports
/**
 * <P>InferenceAnswerIdentifierI is designed to...
 *
 * <P>Copyright (c) 2012 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : May 13, 2014, 5:54:59 PM
 * Author     : jmoszko
 * @version $Id: InferenceAnswerIdentifierI.java 151223 2014-05-14 16:44:27Z jmoszko $
 */
public interface InferenceAnswerIdentifierI {

  CycList<Integer> cycListApiValue();

  int getAnswerID();

  InferenceIdentifier getInferenceID();

  String stringApiValue();
  
}
