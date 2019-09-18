package com.cyc.nl;

import com.cyc.kb.KBObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.DefaultCycObject;
import org.opencyc.nl.Paraphrase;
import org.opencyc.nl.Paraphraser;

/**
 * Reference KBObject paraphraser.
 *
 * @author baxter
 */
public class KBObjectParaphraser implements Paraphraser<KBObject> {

  public KBObjectParaphraser(Paraphraser<CycObject> cycObjectParaphraser) {
    super();
    this.cycObjectParaphraser = cycObjectParaphraser;
  }

  @Override
  public KBObjectParaphrase paraphrase(final KBObject KBObject) {
    try {
      final CycObject cycObject = getCycObject(KBObject);
      return new KBObjectParaphrase(KBObject, cycObjectParaphraser.paraphrase(
              cycObject));
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  }
  private final Paraphraser<CycObject> cycObjectParaphraser;

  @Override
  public List<KBObjectParaphrase> paraphraseWithDisambiguation(
          List<KBObject> KBObjects) {
    try {
      final int objectCount = KBObjects.size();
      final List<CycObject> cycObjects = new ArrayList<CycObject>(
              objectCount);
      for (final KBObject KBObject : KBObjects) {
        cycObjects.add(getCycObject(KBObject));
      }
      final List<? extends Paraphrase<CycObject>> paraphrases = 
              cycObjectParaphraser.paraphraseWithDisambiguation(cycObjects);
      final List<KBObjectParaphrase> result = new ArrayList<KBObjectParaphrase>(
              objectCount);
      for (int i = 0; i < objectCount; i++) {
        result.add(new KBObjectParaphrase(KBObjects.get(i), paraphrases.get(i)));
      }
      return result;
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  }

  private CycObject getCycObject(final KBObject KBObject) throws IOException {
    return (CycObject) DefaultCycObject.fromCompactExternalId(KBObject.getId(),
            CycAccess.getCurrent());
  }

  public static class KBObjectParaphrase extends Paraphrase<KBObject> {

    public Paraphrase<? extends CycObject> getCycObjectParaphrase() {
      return cp;
    }
    private final Paraphrase<? extends CycObject> cp;

    public KBObjectParaphrase(final KBObject query,
            final Paraphrase<? extends CycObject> cp) {
      super(cp.getString(), query);
      this.cp = cp;
    }
  }
}
