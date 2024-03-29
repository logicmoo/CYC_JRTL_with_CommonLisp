/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb;

import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycObject;

/**
 *
 * @author vijay
 */
public class TestConstants {

  public static final String HOSTNAME = "localhost";
  public static final int PORT = 3600;
  public static CycAccess cyc = null;
  public static Context baseKB;
  public static Context universalVocabularyMt;

  public static void ensureInitialized() throws Exception {

    KBObject.setShouldTranscriptOperations(false);
    if (TestConstants.cyc == null) {
      TestConstants.cyc = CycAccess.getNewCycAccessInteractively(TestConstants.HOSTNAME, TestConstants.PORT);
      CycAccess.setCurrent(TestConstants.cyc);
    }
    universalVocabularyMt = new ImmutableContext("UniversalVocabularyMt");
    baseKB = new ImmutableContext("BaseKB");
  }

  private static class ImmutableContext extends Context {

    public ImmutableContext(CycObject cycCtx) throws Exception {
      super(cycCtx);
    }

    private ImmutableContext(String cycName) throws Exception {
      super(cycName);
    }

    public void setCore(CycObject core) {
      throw new UnsupportedOperationException();
    }

    @Override //Because we want to allow equality with mutable contexts.
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null) {
        return false;
      }
      if (!(obj instanceof Context)) {
        return false;
      }
      Context other = (Context) obj;
      if (core == null) {
        if (other.core != null) {
          return false;
        }
      } else if (!core.equals(other.core)) {
        return false;
      }
      return true;
    }
  }
}
