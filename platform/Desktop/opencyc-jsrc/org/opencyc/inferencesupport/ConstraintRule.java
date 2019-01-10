package org.opencyc.inferencesupport;

import java.util.*;
import org.opencyc.cycobject.*;
import org.opencyc.api.*;
import java.io.IOException;

/**
 * <tt>ConstraintRule</tt> object to model the attributes and behavior of a constraint rule.<p>
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
 * @see UnitTest#testConstraintRule
 */
public class ConstraintRule extends Literal implements Comparable{
    /**
     * Constructs a new <tt>ConstraintRule</tt> object from a <tt>CycList</tt> <tt>String</tt>
     * representation.<p>
     *
     * @param formulaString the rule's formula <tt>String</tt>, which must be a well formed OpenCyc
     * query represented by a <tt>CycList</tt>.
     */
    public ConstraintRule (String formulaString) throws CycApiException {
        formula = CycAccess.current().makeCycList(formulaString);
        gatherVariables();
    }

    /**
     * Constructs a new <tt>ConstraintRule</tt> object from a <tt>CycList</tt>.<p>
     *
     * <pre>
     *  String ruleAsString = "(#$isa ?x #$Cathedral)";
     *  ConstraintRule rule1 = new ConstraintRule (cycAccess.makeCycList(ruleAsString));
     * </pre>
     *
     * @param formula the rule's formula, which must be a well formed OpenCyc
     * query represented by a <tt>CycList</tt>.
     */
    public ConstraintRule(CycList formula) {
        this.formula = formula;
        gatherVariables();
    }

    /**
     * Simplifies a rule expression.<p>
     * (#$and (<rule1> <rule2> ... <ruleN>) becomes <rule1> <rule2> ... <ruleN>
     *
     * @param cycList the rule expression that is simplified
     * @return an <tt>ArrayList</tt> of <tt>ConstraintRule</tt> objects.
     * @see UnitTest#testConstraintRule
     */
    public static ArrayList simplifyConstraintRuleExpression(CycList cycList) throws IOException {
        ArrayList rules = new ArrayList();
        if (cycList.size() < 2)
            throw new RuntimeException("Invalid rule: " + cycList);
        Object object = cycList.first();
        if (object instanceof CycConstant &&
            ((CycConstant) object).equals(CycAccess.and))
            for (int i = 1; i < cycList.size(); i++)
                rules.add(new ConstraintRule((CycList) cycList.get(i)));
        else
            rules.add(new ConstraintRule(cycList));
        return rules;
    }

    /**
     * Creates and returns a copy of this <tt>ConstraintRule</tt>.
     *
     * @return a clone of this instance
     */
    public Object clone() {
        return new ConstraintRule((CycList) this.formula.clone());
    }


    /**
     * Evaluates the instantiated constraint rule locally without asking OpenCyc.
     *
     * @param instantiatedConstraintRule the fully instantiated constraint rule whose predicates
     * can be evaluated locally without asking OpenCyc.
     * @return the truth value of the fully instantiated constraint rule
     */
    public static boolean evaluateConstraintRule(CycList instantiatedConstraintRule) throws IOException {
        CycConstant predicate = (CycConstant) instantiatedConstraintRule.first();
        if (predicate.equals(CycAccess.numericallyEqual)) {
            int value = numericallyEvaluateExpression(instantiatedConstraintRule.second());
            for (int i = 2; i < instantiatedConstraintRule.size(); i++) {
                if (numericallyEvaluateExpression(instantiatedConstraintRule.get(i)) != value)
                    return false;
            }
            return true;
        }
        else if (predicate.equals(CycAccess.or)) {
            CycList args = (CycList) instantiatedConstraintRule.rest();
            for (int i = 0; i < args.size(); i++) {
                CycList arg = (CycList) args.get(i);
                if (evaluateConstraintRule(arg))
                    return true;
            }
            return false;
        }
        else if (predicate.equals(CycAccess.and)) {
            CycList args = (CycList) instantiatedConstraintRule.rest();
            for (int i = 0; i < args.size(); i++) {
                CycList arg = (CycList) args.get(i);
                if (! evaluateConstraintRule(arg))
                    return false;
            }
            return true;
        }
        else
            throw new RuntimeException(instantiatedConstraintRule + "Cannot be evaluated");
    }

    /**
     * Returns the numerical value of the expression.
     *
     * @param expression the expression to be evaluated which can be a <tt>Integer</tt> value,
     * or a <tt>CycList</tt>
     * @return the numerical value of the expression
     */
    public static int numericallyEvaluateExpression(Object expression) throws IOException {
        if (expression instanceof Integer)
            return ((Integer) expression).intValue();
        else if (expression instanceof CycNart) {
            CycNart cycNart = (CycNart) expression;
            CycFort functor = cycNart.getFunctor();
            Object arg = cycNart.getArguments().get(0);
            if (functor.equals(CycAccess.plusFn)) {
                return numericallyEvaluateExpression(arg) + 1;
            }
        }
        else if (expression instanceof CycList) {
            CycList cycList = (CycList) expression;
            CycConstant functor = (CycConstant) cycList.first();
            Object arg = cycList.get(1);
            if (functor.equals(CycAccess.plusFn)) {
                return numericallyEvaluateExpression(arg) + 1;
            }
        }
        throw new RuntimeException(expression + "Cannot be evaluated");
    }

    /**
     * Returns <tt>true</tt> if this is a variable domain populating <tt>Rule</tt>.
     *
     * @return <tt>boolean</tt> indicating if this is a variable domain populating
     * <tt>Rule</tt>.
     */
    public boolean isVariableDomainPopulatingRule() throws IOException, CycApiException {
        return isExtensionalVariableDomainPopulatingConstraintRule();
    }

    /**
     * Returns <tt>true</tt> if this is an extensional variable domain populating <tt>ConstraintRule</tt>.
     * An extensional rule is one in which all the values are listed.
     *
     * @return <tt>boolean</tt> indicating if this is an extensional variable domain populating
     * <tt>ConstraintRule</tt>.
     */
    public boolean isExtensionalVariableDomainPopulatingConstraintRule()
        throws IOException, CycApiException {
        if (this.getArity() != 1)
            // Only unary rules can populate a domain.
            return false;
        if (! this.getPredicate().equals(CycAccess.elementOf))
            return false;
        if (! (this.getArguments().get(0) instanceof CycVariable))
            return false;
        Object arg2 = this.getArguments().get(1);
        if (! (arg2 instanceof CycList))
            return false;
        CycList elementList = (CycList) arg2;
        if (elementList.size() < 2)
           return false;
        return elementList.first().equals(CycAccess.current().getKnownConstantByName("TheSet"));
    }

    /**
     * Returns a new <tt>ConstraintRule</tt> which is the result of substituting the given
     * <tt>Object</tt> value for the given <tt>CycVariable</tt>.
     *
     * @param cycVariable the variable for substitution
     * @param value the value which is substituted for each occurrance of the variable
     * @return a new <tt>ConstraintRule</tt> which is the result of substituting the given
     * <tt>Object</tt> value for the given <tt>CycVariable</tt>
     */
    public ConstraintRule instantiate(CycVariable cycVariable, Object value) {
        if (! variables.contains(cycVariable))
            throw new RuntimeException("Cannot instantiate " + cycVariable +
                                       " in rule " + this);
        CycList newConstraintRule = formula.subst(value, cycVariable);
        return new ConstraintRule(newConstraintRule);
    }

}