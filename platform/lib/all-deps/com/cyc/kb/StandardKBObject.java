package com.cyc.kb;

import com.cyc.kb.exception.KBApiException;
import static com.cyc.kb.KBObject.log;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;
import java.io.IOException;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycFormulaSentence;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.DefaultCycObject;

/**
 * Abstract common supertype of several classes that share initialization code.
 *
 * @author baxter
 * @todo DaveS review Documentation
 */
abstract class StandardKBObject extends KBObject {

  StandardKBObject() throws KBApiException {
    super();
  }

  StandardKBObject(String cycObjStr, String hlid) throws KBApiException {
    super(cycObjStr, hlid);
    try {
      if (!isValidCore(core)) {
        String msg = "The term \"" + core.toString() + "\" is not a " + getTypeString() + ".";
        log.fine(msg);
        throw new KBApiException(msg);
      }
    } catch (Exception ex) {
      throw new KBApiException(ex);
    }
  }

  StandardKBObject(CycObject cycObj) throws KBApiException {
    this();
    setCore(cycObj);
  }

  StandardKBObject(String name) throws KBApiException {
    this();
    setCore(name);
  }

  StandardKBObject(String name, LookupType lookup) throws KBApiException {
    this();
    setCore(name, lookup);
  }

  /**
   * This is not a part of the KB API.
   * Return the string representation of the Cyc term that underlies this class.  
   * For example, calling this on a <code>SCollection</code> object will return "#$Collection".
   *
   * @return the type string.
   */
  abstract String getTypeString();

  /**
   * This is not part of the KB API.
   * Check that the candidate core object is valid for this type.
   *
   * @param tempCore
   * @return
   * @throws CycApiException
   * @throws IOException
   */
  boolean isValidCore(CycObject tempCore) throws KBApiException {
    try {
      String command = "(quick-quiet-has-type? " + tempCore.stringApiValue() + " " + getTypeString() + ")";
      return CycAccess.getCurrent().converseBoolean(command);
      //return cyc.isa(tempCore, getTypeString());
    } catch (Exception e) {
      throw new KBApiException(e.getMessage(), e);
    }
  }

  private void setCore(String name) throws KBApiException {
    setCore(name, LookupType.FIND_OR_CREATE);
  }

  private void setCore(String name, LookupType lookup) throws KBApiException {
    CycObject tempCore = null;
    try {
      Object o = null;
      try {
        o = DefaultCycObject.fromPossibleCompactExternalId(name, CycAccess.getCurrent());
      } catch (Exception ex) {
        //do nothing--this wasn't an hlid.
      }
      if (o instanceof CycObject) {
        tempCore = (CycObject) o;
      } else {
        String cyclifiedIndStr = CycAccess.getCurrent().cyclifyString(name);
        tempCore = null;
        try {
          tempCore = getTempCore(cyclifiedIndStr);
        
        } catch (Exception e) {
          if (lookup.equals(LookupType.FIND)) {
            String msg = "The term '" + name + "' was not found.";
            log.fine(msg);
            throw new KBObjectNotFoundException(msg);
          } else if (lookup.equals(LookupType.FIND_OR_CREATE)) {
            if (cyclifiedIndStr.charAt(0) == '(') {
              // NART creation check if the operator (first argument) is reifiable.
              // If not, it throws an exception. 
              tempCore = CycAccess.getCurrent().makeCycNaut(cyclifiedIndStr);
            } else {
              try {
                tempCore = makeConstant(cyclifiedIndStr);
              } catch (CycApiException ex) {
                if (ex.getMessage().contains("Cannot create new constant")) {
                  throw new InvalidNameException("Unable to make a constant with the name '" + name + "'.", ex);
                } else {
                  throw ex;
                }
              }
              String factString = "(#$isa " + tempCore.stringApiValue() + " " + getTypeString()
                      + ")";
              assertSentence(factString, "#$UniversalVocabularyMt");
            }
          }
        }
      }
      if (tempCore != null && isValidCore(tempCore)) {
        core = tempCore;
      } else {

        KBStatus status = KBObjectFactory.getStatus(name, this.getClass());
        if (status == KBStatus.EXISTS_WITH_COMPATIBLE_TYPE && lookup == LookupType.FIND_OR_CREATE) {
          assertSentence("(#$isa " + tempCore.cyclify() + " " + getTypeString() + ")", "#$UniversalVocabularyMt"); //@todo where should this really be asserted???
          core = tempCore;
        } else if (status == KBStatus.EXISTS_WITH_COMPATIBLE_TYPE) {
          throw new KBTypeException(tempCore + " is not a " + this.getClass());
        } else if (status == KBStatus.EXISTS_AS_TYPE) {
          core = tempCore;
        } else if (status == KBStatus.EXISTS_WITH_TYPE_CONFLICT) {
          throw new KBTypeConflictException("Unable to convert " + tempCore.cyclify() + " to a " + this.getClass());
        } else {
          String msg = "The term '" + name + "' is not a " + getTypeString() + ".";
          log.fine(msg);
          throw new KBApiException(msg);
        }
      }
    } catch (KBApiException sae) {
      throw sae;
    } catch (Exception e) {
      e.printStackTrace();
      throw new KBApiException(
              "Failed to create new " + getTypeString() + " named " + name, e);
    }
  }

  private CycObject getTempCore(String cyclifiedIndStr) throws IOException {
    CycObject tempCore;
    try {
      tempCore = CycAccess.getCurrent().getTermByName(cyclifiedIndStr);
    } catch (CycApiException e) {
      tempCore = CycFormulaSentence.makeCycSentence(cyclifiedIndStr);
    }
    if (tempCore instanceof CycNart) {
      ((CycNart) tempCore).ensureReified();
    }
    return tempCore;
  }

  @Override
  void setCore(CycObject cycObj) throws KBApiException {
    try {
      if (isValidCore(cycObj)) {
        core = cycObj;
      } else {
        String msg = "The term \"" + cycObj.toString() + "\" is not a " + getTypeString() + ".";
        log.fine(msg);
        throw new KBApiException(msg);
      }
    } catch (CycApiException ex) {
      throw new KBApiException(ex);
    }
  }
}
