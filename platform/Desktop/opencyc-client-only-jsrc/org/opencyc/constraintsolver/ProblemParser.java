package org.opencyc.constraintsolver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.ConstraintRule;
import org.opencyc.inferencesupport.UnitTest;

/**
 * <tt>ProblemParser</tt> object to model the attributes and behavior of
 * a parser which inputs the constraint problem representation and sets up
 * the parent <tt>ConstraintProblem</tt> object.<p>
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
public class ProblemParser {
    /**
     * Reference to the parent <tt>ConstraintProblem</tt> object.
     */
    protected ConstraintProblem constraintProblem;

    /**
     * Reference to the parent list of simplified constraint rules.
     */
    protected ArrayList simplifiedRules;

    /**
     * Reference to the parent list of domain populating constraint rules.
     */
    protected ArrayList domainPopulationRules;

    /**
     * Reference to the parent list of constraint rules.
     */
    protected ArrayList constraintRules;

    /**
     * Reference to the constraint problem's ArgumentTypeConstrainer object.
     */
    protected ArgumentTypeConstrainer argumentTypeConstrainer;

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = ConstraintProblem.DEFAULT_VERBOSITY;

    /**
     * Constructs a new <tt>ProblemParser</tt> object for the parent
     * <tt>ConstraintProblem</tt>.
     *
     * @param constraintProblem the parent constraint problem
     */
    public ProblemParser(ConstraintProblem constraintProblem) {
        this.constraintProblem = constraintProblem;
        simplifiedRules = constraintProblem.simplifiedRules;
        domainPopulationRules = constraintProblem.domainPopulationRules;
        constraintRules = constraintProblem.constraintRules;
        argumentTypeConstrainer = constraintProblem.argumentTypeConstrainer;
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
     * Simplifies the input problem into its constituent <tt>Rule</tt> objects,
     * then divides the input rules into those which populate the variable
     * domains, and those which subsequently constrain the search for
     * one or more solutions.
     */
    protected void extractRulesAndDomains() throws IOException, CycApiException {
        constraintProblem.simplifiedRules =
            ConstraintRule.simplifyConstraintRuleExpression(constraintProblem.problem);
        constraintProblem.domainPopulationRules = new ArrayList();
        constraintProblem.constraintRules = new ArrayList();
        for (int i = 0; i < constraintProblem.simplifiedRules.size(); i++) {
            ConstraintRule rule = (ConstraintRule) constraintProblem.simplifiedRules.get(i);
            if (rule.isVariableDomainPopulatingRule())
                constraintProblem.domainPopulationRules.add(rule);
            else
                constraintProblem.constraintRules.add(rule);
        }
        if (verbosity > 1)
            constraintProblem.displayConstraintRules();
    }

    /**
     * Initializes the value domains for each variable.
     */
    protected void initializeDomains() throws IOException, CycApiException {
        for (int i = 0; i < constraintProblem.domainPopulationRules.size(); i++) {
            ConstraintRule rule = (ConstraintRule) constraintProblem.domainPopulationRules.get(i);
            if (rule.isExtensionalVariableDomainPopulatingConstraintRule()) {
                CycVariable cycVariable = (CycVariable) rule.getVariables().get(0);
                if (constraintProblem.valueDomains.domains.containsKey(cycVariable))
                    throw new RuntimeException("Duplicate domain specifying rule for " + cycVariable);
                constraintProblem.valueDomains.domains.put(cycVariable, null);
                if (constraintProblem.valueDomains.varsDictionary.containsKey(cycVariable))
                    throw new RuntimeException("Duplicate varsDictionary entry for " + cycVariable);
                CycList theSet =  (CycList) rule.getFormula().third();
                if (! (theSet.first().toString().equals("TheSet")))
                    throw new RuntimeException("Invalid TheSet entry for " + cycVariable);
                ArrayList domainValues = new ArrayList((CycList) theSet.rest());
                constraintProblem.valueDomains.varsDictionary.put(cycVariable, domainValues);
                if (verbosity > 8)
                    System.out.println("Initializing domain for " + cycVariable +
                                       "\n  with " + domainValues);
           }
        }
        if (verbosity > 1)
            constraintProblem.valueDomains.displayVariablesAndDomains();
    }

    /**
     * Gathers the unique variables used in this constraint problem.
     */
    public void gatherVariables() {
        HashSet uniqueVariables = new HashSet();
        for (int i = 0; i < constraintProblem.simplifiedRules.size(); i++) {
            ConstraintRule rule = (ConstraintRule) constraintProblem.simplifiedRules.get(i);
            uniqueVariables.addAll(rule.getVariables());
        }
        constraintProblem.variables.addAll(uniqueVariables);
    }


}