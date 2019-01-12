/*

 */
package org.opencyc.nl;

import java.net.URL;
import java.text.Format;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.cycobject.ELMt;

/**
 * * Interface for generating structured paraphrases of terms.
 *
 * See {@link org.opencyc.nl.NLFormat} for generation
 * of unstructured paraphrases (i.e. just strings) and features of
 * {@link java.text.Format}.
 * @author baxter
 */

//@todo move up into KBAPI project, so we can get rid of setDomainMt in favor of setDomainContext ??
public abstract class Paraphraser<E> {

  private static Map<String, Boolean> classAvailability = new HashMap<String, Boolean>();
  
  /**
   * Returns a paraphrase of the specified object.
   *
   * @param object an object to paraphrase.
   * @return a paraphrase of the specified object.
   */
 public abstract Paraphrase<? extends E> paraphrase(final E object);

  /**
   * Returns a list of paraphrases of the specified objects, attempting to minimize
   * ambiguity.
   *
   * @param objects
   * @return list of paraphrases
   */
 public abstract List<? extends Paraphrase<E>> paraphraseWithDisambiguation(List<E> objects);

 abstract public void setDomainMt(ELMt mt);

  static public Paraphraser getInstance(final ParaphrasableType type) {
    //this should only check once to see if these other classes are available...
    //if they're not there, it needs to give back some kind of stupid paraphrase that doesn't work well...
    try {
      switch (type) {
        case QUERY:
          if (isClassAvailable("com.cyc.nl.QueryParaphraser")) {
            return (Paraphraser) Class.forName("com.cyc.nl.QueryParaphraser").newInstance(); //new QueryParaphraser
          } else {
            return new BasicParaphraser();
          }
        //new QueryParaphraser
        case FORMULA:
           if (isClassAvailable("com.cyc.nl.FormulaParaphraser")) {
             return (Paraphraser) Class.forName("com.cyc.nl.FormulaParaphraser").newInstance();
             } else {
            return new BasicParaphraser();
          }
        case KBOBJECT:
           if (isClassAvailable("com.cyc.nl.KBObjectParaphraser")) {
             return (Paraphraser) Class.forName("com.cyc.nl.KBObjectParaphraser").newInstance();
             } else {
            return new BasicParaphraser();
          }
        case DEFAULT:
           if (isClassAvailable("com.cyc.nl.DefaultParaphraser")) {
             return (Paraphraser) Class.forName("com.cyc.nl.DefaultParaphraser").newInstance();
             } else {
            return new BasicParaphraser();
          }
      }
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(Paraphraser.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(Paraphraser.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(Paraphraser.class.getName()).log(Level.SEVERE, null, ex);
    }
    throw new UnsupportedOperationException("Unable to produce a Paraphraser for " + type);
  }
  

  private static boolean isClassAvailable(String binaryClassName) {
    if (!classAvailability.containsKey(binaryClassName)) {
        URL url = Paraphraser.class.getClassLoader().getResource(binaryClassName);
        if (url instanceof URL) {
        classAvailability.put(binaryClassName, true);
        } else {
        classAvailability.put(binaryClassName, false);          
        }

    }
    return classAvailability.get(binaryClassName);
  }
  
  public enum ParaphrasableType {
    QUERY, FORMULA, KBOBJECT, DEFAULT;
  }
  
  private static class BasicParaphraser<E> extends Paraphraser<E> {

    @Override
    public Paraphrase<E> paraphrase(E object) {
      return new Paraphrase<E>(object.toString(), object);
    }

    @Override
    public List<? extends Paraphrase<E>> paraphraseWithDisambiguation(List<E> objects) {
      List<Paraphrase<E>> result = new ArrayList<Paraphrase<E>>();
      for (E obj : objects) {
        result.add(paraphrase(obj));
      }
      return result;
    }

    @Override
    public void setDomainMt(ELMt mt) {
    }
  
};
  
}
