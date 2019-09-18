package com.cyc.baseclient.inference;

import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.InformationSource;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.base.inference.InferenceAnswerIdentifierI;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.cyc.baseclient.CommonConstants;

import static com.cyc.baseclient.api.TestUtils.getCyc;

import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycInformationSource;
import com.cyc.baseclient.cycobject.CycGuid;

import static com.cyc.baseclient.inference.InferenceAnswerTest.WHAT_IS_ONE_PLUS_ONE;

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
  public void testGetId() throws CycConnectionException {
    System.out.println("getId");
    InferenceAnswer instance = getFirstInferenceAnswer(WHAT_IS_ONE_PLUS_ONE, CommonConstants.baseKB);
    InferenceAnswerIdentifierI identifier = instance.getId();
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
      final Collection<InformationSource> sources = inferenceAnswer.getSources(new CycInformationSource.CycCitationGenerator(new CycConstant("CycorpStyleSpecificationStandard", new CycGuid("695e691c-e82b-11d9-8000-0002b3a85caa"))));
      assertFalse(sources.isEmpty());
      for (final InformationSource source : sources) {
        assertNotNull("No citation string for " + source.getCycL(), source.getCitationString());
        assertNotNull("No icon for " + source.getCycL(), source.getIconURL());
      }
    }
  }

  @Override
  protected InferenceAnswer constructFirstInferenceAnswer(DefaultInferenceWorker worker) {
    return new CycBackedInferenceAnswer(new InferenceAnswerIdentifier(
           worker.getInferenceIdentifier(), 0));
  }
}
