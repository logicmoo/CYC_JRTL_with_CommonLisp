package org.opencyc.constraintsolver;

import java.io.IOException;
import java.util.ArrayList;

import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.ConstraintRule;
import org.opencyc.inferencesupport.UnitTest;

/**
 * The <tt>NodeConsistencyAchiever</tt> object achieves node consistency
 * for the parent <tt>ConstraintProblem</tt> object.  Node consistency is
 * the application of all unary constraint rules and the subsequent propagation
 * of domain value reductions through applicable all-different rules<p>
 *
 * @version $Id$
 * @author Stephen L. Reed
 *
 * <p>Copyright 2001 Cycorp, Inc., license is open source GNU LGPL.
 * <p><a href="http://www.opencyc.org/license.txt">the license</a>
 * <p><a href="http://www.opencyc.org">www.opencyc.org</a>
 * <p><a href="http://www.sourceforge.net/projects/opencyc">OpenCyc at SourceForge</a>
 * <p>
 * THIS SOFTWARE AND KNOWLEDGE BASE CONTENT ARE PROVIDED ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE OPENCYC
 * ORGANIZATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE AND KNOWLEDGE
 * BASE CONTENT, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * @see UnitTest#testConstraintProblem
 */
public class NodeConsistencyAchiever {

    /**
     * Reference to the parent <tt>ConstraintProblem</tt> object.
     */
    protected ConstraintProblem constraintProblem;

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = ConstraintProblem.DEFAULT_VERBOSITY;

    /**
     * The <tt>ArrayList</tt> of unary constraint rules belonging to the
     * parent <tt>ConstraintProblem</tt>.
     */
    protected ArrayList unaryConstraintRules = new ArrayList();

    /**
     * The <tt>ArrayList</tt> of <tt>CycVariable</tt> variables
     * which are affected by unary constraint rules belonging to the
     * parent <tt>ConstraintProblem</tt>.
     */
    protected ArrayList affectedVariables = new ArrayList();

    /**
     * The <tt>ArrayList</tt> of #$different constraint rules.
     */
    protected ArrayList allDifferentRules = new ArrayList();

    /**
     * The <tt>ArrayList</tt> of variables having only one domain value
     * after achieving node consistency.
     */
    protected ArrayList singletons = new ArrayList();

    /**
     * Constructs a new <tt>NodeConsistencyAchiever</tt> object for the parent
     * <tt>ConstraintProblem</tt>.
     *
     * @param constraintProblem the parent constraint problem
     */
    public NodeConsistencyAchiever(ConstraintProblem constraintProblem) {
        this.constraintProblem = constraintProblem;
    }

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     *
     * @param verbosity 0 --> quiet ... 9 -> maximum diagnostic input
     */
    public void setVerbosity(int verbosity) {
        this.verbosity = verbosity;
    }

    /**
     * Apply the unary constraint rules to restrict domain values and subsequently
     * propagate the effects through any #$different constraint rules.
     */
    public void applyUnaryRulesAndPropagate() throws IOException, CycApiException {
        CycVariable affectedVariable;
        ArrayList inputDomainValues;
        ArrayList outputDomainValues;
        ConstraintRule instantiatedRule;
        boolean instantiatedRuleResult;
        // Select the unary constraint rules.
        for (int i = 0; i < constraintProblem.getNbrConstraintRules(); i++) {
            ConstraintRule rule = (ConstraintRule) constraintProblem.constraintRules.get(i);
            if (rule.getArity() == 1)
                unaryConstraintRules.add(rule);
        }
        // Apply the unary constraint rules.
        for (int i = 0; i < unaryConstraintRules.size(); i++) {
            ConstraintRule rule = (ConstraintRule) unaryConstraintRules.get(i);
            if (verbosity > 5) {
                System.out.println("\nApplying unary constraint rule to acheive node consistency:");
                System.out.println(rule);
            }
            affectedVariable = (CycVariable) rule.getVariables().get(0);
            affectedVariables.add(affectedVariable);
            inputDomainValues = constraintProblem.valueDomains.getDomainValues(affectedVariable);
            outputDomainValues = new ArrayList();
            for (int j = 0; j < inputDomainValues.size(); j++) {
                Object value = inputDomainValues.get(j);
                instantiatedRule = rule.instantiate(affectedVariable, value);
                instantiatedRuleResult = constraintProblem.ruleEvaluator.ask(instantiatedRule);
                constraintProblem.nbrAsks++;
                if (verbosity > 7)
                    System.out.println("  " + instantiatedRule + " --> " +
                                       instantiatedRuleResult);
                if (instantiatedRuleResult)
                    outputDomainValues.add(value);
            }
            // Update the affected variable's domain values.
            constraintProblem.valueDomains.setDomainValues(affectedVariable,
                                                           outputDomainValues);
            // No longer consider the unary constraint after its one-time application.
            constraintProblem.constraintRules.remove(rule);

            if (verbosity > 5) {
                if (inputDomainValues.size() > outputDomainValues.size())
                    System.out.println("domain of " + affectedVariable +
                                       " restricted from " + inputDomainValues +
                                       " to " + outputDomainValues);
                else
                    System.out.println("domain of " + affectedVariable +
                                       " unchanged ");
                System.out.println("unary rule\n" + rule.cyclify() +
                                   "  dropped after one-time application");
            }
        }
        achieveAllDifferentConsistencyWrtSingletons();
        if (verbosity > 1) {
            System.out.println("\nAfter node consistency and all-different rule propagation.");
            constraintProblem.valueDomains.displayVariablesAndDomains();
        }
    }

    /**
     * Achieves all-different consistency with regard to singletons, by propagating
     * the affects of single-valued variables through all #$different
     * constraint rules.
     */
    protected void achieveAllDifferentConsistencyWrtSingletons() throws IOException {
        ArrayList differentVariables;
        Object singletonValue;
        // Gather the singleton variables.
        for (int i = 0; i < constraintProblem.variables.size(); i++) {
            CycVariable cycVariable = (CycVariable) constraintProblem.variables.get(i);
            if (constraintProblem.valueDomains.getDomainValues(cycVariable).size() == 1)
                singletons.add(cycVariable);
        }
        // Gather the applicable #$different rules.
        for (int i = 0; i < constraintProblem.constraintRules.size(); i++) {
            ConstraintRule rule = (ConstraintRule) constraintProblem.constraintRules.get(i);
            if (rule.isAllDifferent())
                allDifferentRules.add(rule);
        }
        // Propagate singleton variables through the #$different rules.
        for (int i = 0; i < allDifferentRules.size(); i++) {
            ConstraintRule rule = (ConstraintRule) allDifferentRules.get(i);
            if (verbosity > 7)
                System.out.println("\nPropagating through rule " + rule);
            for (int j = 0; j < singletons.size(); j++) {
                CycVariable singleton = (CycVariable) singletons.get(j);
                if (rule.getVariables().contains(singleton)) {
                    differentVariables = (ArrayList) rule.getVariables().clone();
                    differentVariables.remove(singleton);
                    singletonValue = constraintProblem.valueDomains.getDomainValues(singleton).get(0);
                    if (verbosity > 7)
                        System.out.println("singleton: " + singleton);
                    for (int k = 0; k < differentVariables.size(); k++) {
                        // Remove singleton's value from all other domains in the #$different constraint.
                        CycVariable differentVariable = (CycVariable) differentVariables.get(k);
                        if (verbosity > 7)
                            System.out.println("  removing singleton value " + singletonValue +
                                               " from " + differentVariable);
                        constraintProblem.valueDomains.removeFromValue(differentVariable, singletonValue);
                    }
                }
            }
        }
    }
}