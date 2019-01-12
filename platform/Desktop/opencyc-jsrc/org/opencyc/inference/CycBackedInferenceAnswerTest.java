package org.opencyc.inference;

import java.io.IOException;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.opencyc.api.CycAccess;
import static org.opencyc.api.TestUtils.getCyc;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycInformationSource;
import org.opencyc.cycobject.Guid;
import static org.opencyc.inference.InferenceAnswerTest.WHAT_IS_ONE_PLUS_ONE;

/**
 *
 * @author baxter
 */
public class CycBackedInferenceAnswerTest extends InferenceAnswerTest {

  public CycBackedInferenceAnswerTest() {
  }

  /**
   * Test of getId method, of class CycBackedInferenceAnswer.
   */
  @Test
  public void testGetId() throws IOException {
    System.out.println("getId");
    InferenceAnswer instance = getFirstInferenceAnswer(WHAT_IS_ONE_PLUS_ONE, CycAccess.baseKB);
    InferenceAnswerIdentifier identifier = instance.getId();
    assertNotNull(identifier);
    assertEquals(0, identifier.getAnswerID());
  }

  /**
   * Test of getSources method, of class CycBackedInferenceAnswer.
   */
  @Test
  public void testGetSources() throws Exception {
    System.out.println("getSources");
    // TODO -- Find or create a sourced query available in OpenCyc KB.
    if (!getCyc().isOpenCyc()) {
      InferenceAnswer inferenceAnswer = getFirstInferenceAnswer("(#$inputsDestroyed #$TerroristAttack-March-17-1992-Buenos-Aires " + "(#$EmbassyBuildingFn #$Israel #$CityOfBuenosAiresArgentina))", TKB_MT);
      final Collection<CycInformationSource> sources = inferenceAnswer.getSources(new CycInformationSource.CitationGenerator(new CycConstant("CycorpStyleSpecificationStandard", new Guid("695e691c-e82b-11d9-8000-0002b3a85caa"))));
      assertFalse(sources.isEmpty());
      for (final CycInformationSource source : sources) {
        assertNotNull("No citation string for " + source.getCycL(), source.getCitationString());
        assertNotNull("No icon for " + source.getCycL(), source.getIcon());
      }
    }
  }

  @Override
  protected InferenceAnswer constructFirstInferenceAnswer(DefaultInferenceWorker worker) {
    return new CycBackedInferenceAnswer(new InferenceAnswerIdentifier(
           worker.getInferenceIdentifier(), 0));
  }
}
