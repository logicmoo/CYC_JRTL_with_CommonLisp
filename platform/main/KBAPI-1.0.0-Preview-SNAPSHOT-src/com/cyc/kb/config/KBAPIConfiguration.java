package com.cyc.kb.config;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.Fort;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.client.Constants;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.exception.KBApiException;


/**
 * A class to hold the configuration parameters such as, transcript flag, current cyclist 
 * and current project. 
 * 
 * A cleaner configuration project is being worked on. This class will be deprecated 
 * by that in the next few months.
 * @author vijay
 * 
 * 
 */
public class KBAPIConfiguration {

  /**
   * Gates whether KB operations are transcripted.
   */
  private static ThreadLocal<Boolean> shouldTranscriptOperations =
          new ThreadLocal<Boolean>() {
    @Override
    protected Boolean initialValue() {
      return true;
    }
  };
  
  /**
   * Sets an initial default context for assertions and queries.
   * 
   * Initially, the default contexts are:
   *  forAssertion: null
   *  forQuery: null
   * These are set to null values to encourage developers to set the defaults
   * explicitly.
   * 
   * If the program does not have an application specific default, the following
   * could be used.
   * 	forAssertion: #$UniversalVocabularyMt
   * 	forQuery: #$InferencePSC
   */
  private static ThreadLocal<DefaultContext> defaultContext =
		  new ThreadLocal<DefaultContext>() {
	  @Override
	  protected DefaultContext initialValue() {
		  // return new KBAPIDefaultContext(Constants.uvMt(), Constants.inferencePSCMt());
		  return new KBAPIDefaultContext(null, null);
	  }
  };
  
  /**
   * Sets the default context ThreadLocal
   * @param defaultCtxs
   */
  public static void setDefaultContext(DefaultContext defaultCtxs) {
	  defaultContext.set(defaultCtxs);
  }
  
  /**
   * Returns the current default contexts
   * @return the contents of the DefaultContest ThreadLocal
   */
  public static DefaultContext getDefaultContext() {
	  return defaultContext.get();
  }

  /**
   * Declare that KB operations performed in this thread should or shouldn't be
   * transcripted by the Cyc server.
   */
  public static void setShouldTranscriptOperations(final boolean b) {
    shouldTranscriptOperations.set(b);
  }
  
  /**
   * Will actions in the current thread that modify the KB be transcripted by
   * the Cyc server?
   *
   * @return will KB operations from the current thread be transcripted?
   */
  public static boolean getShouldTranscriptOperations() {
    return shouldTranscriptOperations.get();
  }

  @SuppressWarnings("deprecation")
public static KBIndividual getCurrentCyclist() throws KBApiException {
    // Since the KB API does not provide any method to set Cyclist per CycAccess,
    // boldly assuming that what we return is always the thread version of Cyclist.
    Fort cyclist = CycAccessManager.get().getCurrentAccess().getCyclist();
    return KBIndividualImpl.get(cyclist);
  }
  
  /**
   * Declare that KB operations performed in this thread were done by the user i.
   * The user could be an individual #$Cyclist or an instance of #$ComputerUser, 
   * such as, (UserOfProgramFn CycBrowser CAEUser). Applications written on top 
   * of KB API should login an user and create an instance of UserOfProgramFn, based
   * on the application and the user.
   * This will set #$myCreator for constants and :ASSERT-INFO for assertions
   */  
  public static KBIndividual setCurrentCyclist(KBIndividualImpl i) {
    CycAccessManager.get().getCurrentAccess().setCyclist((Fort)i.getCore());
    return i;
  }
  
  /**
   * Declare that KB operations performed in this thread were done by the user iStr.
   * The user could be an individual #$Cyclist or an instance of #$ComputerUser, 
   * such as, (UserOfProgramFn CycBrowser CAEUser). Applications written on top 
   * of KB API should login an user and create an instance of UserOfProgramFn, based
   * on the application and the user. 
   * This will set #$myCreator for constants and :ASSERT-INFO for assertions
   */
  @SuppressWarnings("deprecation")
public static KBIndividual setCurrentCyclist(String iStr) throws KBApiException {
    try {
      String cyclist = CycAccessManager.get().getCurrentAccess().cyclifyString(iStr);
      CycAccessManager.get().getCurrentAccess().setCyclist(cyclist);
      return KBIndividualImpl.get(cyclist);
    } catch (Exception ex) {
      throw new KBApiException(ex.getMessage(), ex);
    }
  }

  /**
   * Declare that the KB operations performed in this thread are related to the specified
   * project. The project should be an instance of #$Cyc-BasedProject. Applications written
   * on top of KB API should set the purpose on their own or by asking the user at login time.
   * 
   * Sets the #$myCreationPurpose for constants and :ASSERT-INFO for assertions.
   * @param project an instance of #$Cyc-BasedProject
   * @throws Exception 
   */
  public static void setProject (KBIndividual project) throws Exception {
    CycAccessManager.get().getCurrentAccess().setKePurpose((Fort)project.getCore());
  }
  
  /**
   * Get the project that the KB operations performed in this thread are related to. 
   * The project will be an instance of #$Cyc-BasedProject.
   * 
   * @param project an instance of #$Cyc-BasedProject
   * @throws Exception 
   */  
  @SuppressWarnings("deprecation")
public KBIndividual getProject() throws KBApiException {
    return KBIndividualImpl.get(CycAccessManager.get().getCurrentAccess().getKePurpose());
  }
}
