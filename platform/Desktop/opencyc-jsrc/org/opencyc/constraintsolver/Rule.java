package org.opencyc.constraintsolver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;

import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.UnitTest;

/**
 * <tt>Rule</tt> object to model the attributes and behavior of a constraint rule.<p>
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
 * @see UnitTest#testRule
 */
public class Rule  implements Comparable{

    /**
     * The constraint rule formula as an OpenCyc query.
     */
    protected CycList formula;

    /**
     * The collection of <tt>CycVariables</tt> used in the rule.  There should
     * be at least one, because if there are no variables, then the rule is
     * either always true or always false and has no effect on the
     * constraint problem's solution.
     */
    protected ArrayList variables;

    /**
     * The depth of backchaining when this rule was introduced.  For rules that originate
     * from the input constraint problem, this value is 0.  When this value equals the
     * maximum depth of backchain limit, then this rule cannot be the subject of a further
     * backchain inference step.
     */
    protected int backchainDepth = 0;

    /**
     * Value which indicates that a given rule subsumes another given rule.
     */
    public static final int SUBSUMES = 1;

    /**
     * Value which indicates that a given rule is subsumed by another given rule.
     */
    public static final int SUBSUMED_BY = 2;

    /**
     * Value which indicates that a given rule neither subsumes another given rule or is
     * subsumed by another given rule.
     */
    public static final int NO_SUBSUMPTION = 3;


    /**
     * Constructs a new <tt>Rule</tt> object from a <tt>CycList</tt> <tt>String</tt>
     * representation.<p>
     *
     * @param formulaString the rule's formula <tt>String</tt>, which must be a well formed OpenCyc
     * query represented by a <tt>CycList</tt>.
     */
    public Rule (String formulaString) {
        formula = CycAccess.current().makeCycList(formulaString);
        gatherVariables();
    }

    /**
     * Constructs a new <tt>Rule</tt> object from a <tt>CycList</tt>.<p>
     *
     * <pre>
     *  String ruleAsString = "(#$isa ?x #$Cathedral)";
     *  Rule rule1 = new Rule (cycAccess.makeCycList(ruleAsString));
     * </pre>
     *
     * @param formula the rule's formula, which must be a well formed OpenCyc
     * query represented by a <tt>CycList</tt>.
     */
    public Rule(CycList formula) {
        this.formula = formula;
        gatherVariables();
    }

    /**
     * Constructs a new <tt>Rule</tt> object from a <tt>CycList</tt> at the given
     * backchain depth.<p>
     *
     * <pre>
     *  String ruleAsString = "(#$isa ?x #$Cathedral)";
     *  Rule rule1 = new Rule (new CycList(ruleAsString), 2);
     * </pre>
     *
     * @param formula the rule's formula, which must be a well formed OpenCyc
     * query represented by a <tt>CycList</tt>.
     * @param backchainDepth the depth of backchaining when this rule is introduced
     */
    public Rule(CycList formula, int backchainDepth) {
        this.formula = formula;
        this.backchainDepth = backchainDepth;
        gatherVariables();
    }

    /**
     * Simplifies a rule expression.<p>
     * (#$and (<rule1> <rule2> ... <ruleN>) becomes <rule1> <rule2> ... <ruleN>
     *
     * @param cycList the rule expression that is simplified
     * @return an <tt>ArrayList</tt> of <tt>Rule</tt> objects.
     * @see UnitTest#testRule
     */
    public static ArrayList simplifyRuleExpression(CycList cycList) throws IOException {
        ArrayList rules = new ArrayList();
        if (cycList.size() < 2)
            throw new RuntimeException("Invalid rule: " + cycList);
        Object object = cycList.first();
        if (object instanceof CycConstant &&
            ((CycConstant) object).equals(CycAccess.and))
            for (int i = 1; i < cycList.size(); i++)
                rules.add(new Rule((CycList) cycList.get(i)));
        else
            rules.add(new Rule(cycList));
        return rules;
    }

    /**
     * Gathers the unique variables from the rule's formula.
     */
    protected void gatherVariables() {
        HashSet uniqueVariables = new HashSet();
        Enumeration e = formula.cycListVisitor();
        while (true) {
            if (! e.hasMoreElements())
                break;
            Object element = e.nextElement();
            if (element instanceof CycVariable)
                uniqueVariables.add(element);
        }
        variables = new ArrayList(uniqueVariables);
    }


    /**
     * Gets the rule's formula.
     *
     * @return a <tt>CycList</tt> which is the rule's formula.
     */
    public CycList getFormula() {
        return formula;
    }

    /**
     * Returns the rule's variables.
     *
     * @return the <tt>ArrayList</tt> which lists the unique <tt>CycVariables</tt> that are
     * used in the rule's formula.
     */
    public ArrayList getVariables() {
        return variables;
    }

    /**
     * Returns the rule's arity which is defined to be the number of variables, not
     * necessarily equalling the arity of the rule's first predicate.
     *
     * @return rule's arity which is defined to be the number of variables, not
     * necessarily equalling the arity of the rule's first predicate
     */
    public int getArity() {
        return variables.size();
    }

    /**
     * Returns the backchain depth when this rule was introduced.
     *
     * @return the backchain depth when this rule was introduced
     */
    public int getBackchainDepth() {
        return this.backchainDepth;
    }

    /**
     * Returns <tt>true</tt> if the object equals this object.
     *
     * @param object the object for comparison
     * @return <tt>boolean</tt> indicating equality of an object with this object.
     */
    public boolean equals(Object object) {
        if (! (object instanceof Rule))
            return false;
        Rule thatRule = (Rule) object;
        return this.formula.equals(thatRule.getFormula());
    }

    /**
     * Compares this object with the specified object for order.
     * Returns a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object.
     *
     * @param object the reference object with which to compare.
     * @return a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object
     */
     public int compareTo (Object object) {
        if (! (object instanceof Rule))
            throw new ClassCastException("Must be a Rule object");
        return (new Integer(this.getArity())).compareTo(new Integer(((Rule) object).getArity()));
     }

    /**
     * Returns a value indicating the subsumption relationship, or lack of subsumption
     * relationship between this rule and another rule.
     *
     * @param rule the rule for subsumption determination
     * @return <tt>Rule.SUBSUMES</tt> if this rule subsumes the given rule,
     * <tt>Rule.SUBSUMED_BY</tt> if this rule is subsumed by the given rule,
     * <tt>Rule.NO_SUBSUMPTION</tt> if this rule is neither subsumed by the given rule, nor
     * subsumes the given rule
     */
    public int determineSubsumption(Rule rule) throws IOException {
        if (this.equals(rule))
            return SUBSUMES;
        if (! (this.getPredicate().equals(rule.getPredicate())))
            return NO_SUBSUMPTION;
        if (this.getArity() != rule.getArity())
            return NO_SUBSUMPTION;
        int answer = 0;
        for (int i = 0; i < this.getArguments().size(); i++) {
            Object thisArgument = this.getArguments().get(i);
            Object thatArgument = rule.getArguments().get(i);
            if (thisArgument.equals(thatArgument))
                continue;
            if (thisArgument instanceof CycVariable) {
                if (thatArgument instanceof CycVariable) {
                    if (! (thisArgument.equals(thatArgument)))
                        return NO_SUBSUMPTION;
                }
                else if (answer == SUBSUMED_BY)
                    return NO_SUBSUMPTION;
                else if (answer == 0) {
                    answer = SUBSUMES;
                    continue;
                }
            }
            if (thatArgument instanceof CycVariable) {
                if (answer == SUBSUMES)
                    return NO_SUBSUMPTION;
                else
                    answer = SUBSUMED_BY;
            }
            if (! (thisArgument instanceof CycConstant) ||
                ! (thatArgument instanceof CycConstant))
                return NO_SUBSUMPTION;
            if (! (CycAccess.current().isCollection_Cached((CycConstant) thisArgument)))
                return NO_SUBSUMPTION;
            if (! (CycAccess.current().isCollection_Cached((CycConstant) thatArgument)))
                return NO_SUBSUMPTION;
            if (CycAccess.current().isGenlOf_Cached((CycConstant) thisArgument,
                                                    (CycConstant) thatArgument)) {
                if (answer == SUBSUMED_BY)
                    return NO_SUBSUMPTION;
                else if (answer == 0) {
                    answer = SUBSUMES;
                    continue;
                }
            }
            if (CycAccess.current().isGenlOf_Cached((CycConstant) thatArgument,
                                                    (CycConstant) thisArgument)) {
                if (answer == SUBSUMES)
                    return NO_SUBSUMPTION;
                else if (answer == 0) {
                    answer = SUBSUMED_BY;
                    continue;
                }
            }
            return NO_SUBSUMPTION;
        }
        if (answer == 0)
            return SUBSUMES;
        else
            return answer;
    }

    /**
     * Returns whether this rule is subsumed by the given rule.
     *
     * @param rule the given rule for subsumption determination.
     * @return <tt>true</tt> iff this rule is subsumed by the given <tt>Rule</tt> object.
     */
    public boolean isSubsumedBy(Rule rule) throws IOException {
        if (this.equals(rule))
            return true;
        else
            return this.determineSubsumption(rule) == Rule.SUBSUMED_BY;
    }

    /**
     * Returns whether this rule subsumes the given rule.
     *
     * @param rule the given rule for subsumption determination.
     * @return <tt>true</tt> iff this rule subsumes the given <tt>Rule</tt> object.
     */
    public boolean subsumes(Rule rule) throws IOException {
        return this.determineSubsumption(rule) == Rule.SUBSUMES;
    }


    /**
     * Creates and returns a copy of this <tt>Rule</tt>.
     *
     * @return a clone of this instance
     */
    public Object clone() {
        return new Rule((CycList) this.formula.clone());
    }

    /**
     * Returns the predicate of this <tt>Rule</tt> object.
     *
     * @return the predicate <tt>CycConstant</tt> or <tt>CycSymbol</tt>
     * of this <tt>Rule</tt> object
     */
    public CycConstant getPredicate() {
        return (CycConstant) formula.first();
    }

    /**
     * Returns the arguments of this <tt>Rule</tt> object.
     *
     * @return the arguments of this <tt>Rule</tt> object
     */
    public CycList getArguments() {
        return (CycList) formula.rest();
    }

    /**
     * Substitutes an object for a variable.
     *
     * @param oldVariable the variable to replaced
     * @parma newObject the <tt>Object</tt> to be substituted for the variable
     */
    public void substituteVariable(CycVariable variable, Object newObject) {
        if (! (variables.contains(variable)))
            throw new RuntimeException(variable + " is not a variable of " + this);
        variables.remove(variable);
        if (newObject instanceof CycVariable)
            variables.add(newObject);
        formula = formula.subst(newObject, variable);
    }

    /**
     * Returns <tt>true</tt> if this is a variable domain populating <tt>Rule</tt>.
     *
     * @return <tt>boolean</tt> indicating if this is a variable domain populating
     * <tt>Rule</tt>.
     */
    public boolean isVariableDomainPopulatingRule() throws IOException {
        return isIntensionalVariableDomainPopulatingRule() ||
               isExtensionalVariableDomainPopulatingRule();
    }

    /**
     * Returns <tt>true</tt> if this <tt>Rule</tt> is a #$different constraint rule.
     *
     * @return <tt>boolean</tt> indicating if this <tt>Rule</tt> is a #$different
     * constraint rule
     */
    public boolean isAllDifferent() throws IOException{
        if (this.getArity() < 2)
            return false;
        if (this.getPredicate().equals(CycAccess.different))
            return true;
        else
            return false;
    }

    /**
     * Returns <tt>true</tt> if this <tt>Rule</tt> is a simple evaluatable constraint rule,
     * which can be answered without KB lookup.  Typically an evaluatable constraint
     * rule is a relational operator applied to a primitive data type.
     *
     *
     * @return <tt>true</tt> if this <tt>Rule</tt> is a simple evaluatable constraint rule,
     * which can be answered without KB lookup
     */
    public boolean isEvaluatable() throws IOException {
        if (this.getArguments().size() < 2)
            return false;
        if (this.getPredicate().equals(CycAccess.numericallyEqual))
            return hasEvaluatableNumericalArgs();
        else if (this.getPredicate().toString().equals("or") ||
                 this.getPredicate().toString().equals("and")) {
            for (int i = 0; i < this.getArguments().size(); i++) {
                Rule orArgument = new Rule((CycList) this.getArguments().get(i));
                if (! orArgument.isEvaluatable())
                    return false;
            }
            return true;
        }
        else
            return false;
    }

    /**
     * Returns <tt>true</tt> if this <tt>Rule</tt> has simple evaluatable numerical arguments.
     * Numbers and variables return <tt>true</tt> and functional expressions return
     * <tt>true</tt> iff their arguments are simple numerical expressions.
     *
     *
     * @return <tt>true</tt> if this <tt>Rule</tt> has simple evaluatable numerical arguments
     */
    public boolean hasEvaluatableNumericalArgs() throws IOException {
        CycList args = (CycList) this.getFormula().rest();
        for (int i = 0; i < args.size(); i++) {
            Object arg = args.get(i);
            if (arg instanceof CycVariable)
                continue;
            else if (arg instanceof Integer)
                continue;
            else if (arg instanceof CycNart) {
                CycNart cycNart = (CycNart) arg;
                if (cycNart.getFunctor().equals(CycAccess.plusFn)) {
                    Object plusFnArg = cycNart.getArguments().get(0);
                    if (plusFnArg instanceof CycVariable)
                        continue;
                    if (plusFnArg instanceof Integer)
                        continue;
                }
            }
            else if (arg instanceof CycList) {
                CycList cycList = (CycList) arg;
                if (cycList.first().equals(CycAccess.plusFn)) {
                    Object plusFnArg = cycList.second();
                    if (plusFnArg instanceof CycVariable)
                        continue;
                    if (plusFnArg instanceof Integer)
                        continue;
                }
            }
            else
                return false;
        }
        return true;
    }

    /**
     * Evaluates the instantiated constraint rule locally without asking OpenCyc.
     *
     * @param instantiatedRule the fully instantiated constraint rule whose predicates
     * can be evaluated locally without asking OpenCyc.
     * @return the truth value of the fully instantiated constraint rule
     */
    public static boolean evaluateConstraintRule(CycList instantiatedRule) throws IOException {
        CycConstant predicate = (CycConstant) instantiatedRule.first();
        if (predicate.equals(CycAccess.numericallyEqual)) {
            int value = numericallyEvaluateExpression(instantiatedRule.second());
            for (int i = 2; i < instantiatedRule.size(); i++) {
                if (numericallyEvaluateExpression(instantiatedRule.get(i)) != value)
                    return false;
            }
            return true;
        }
        else if (predicate.equals(CycAccess.or)) {
            CycList args = (CycList)instantiatedRule.rest();
            for (int i = 0; i < args.size(); i++) {
                CycList arg = (CycList) args.get(i);
                if (evaluateConstraintRule(arg))
                    return true;
            }
            return false;
        }
        else if (predicate.equals(CycAccess.and)) {
            CycList args = (CycList)instantiatedRule.rest();
            for (int i = 0; i < args.size(); i++) {
                CycList arg = (CycList) args.get(i);
                if (! evaluateConstraintRule(arg))
                    return false;
            }
            return true;
        }
        else
            throw new RuntimeException(instantiatedRule + "Cannot be evaluated");
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
     * Returns <tt>true</tt> iff this is a ground formula having no variables.
     *
     * @return <tt>true</tt> iff this is a ground formula having no variables
     */
    public boolean isGround() {
        return this.getArity() == 0;
    }

    /**
     * Returns <tt>true</tt> iff this is a formula having one variable.
     *
     * @return <tt>true</tt> iff this is a formula having one variable
     */
    public boolean isUnary() {
        return this.getArity() == 1;
    }

    /**
     * Returns <tt>true</tt> iff the predicate has the irreflexive property:
     * (#$isa ?PRED #$IrreflexsiveBinaryPredicate).
     *
     * @param mt the microtheory in which the irreflexive property is sought
     * @return <tt>true</tt> iff the predicate has the irreflexive property:
     * (#$isa ?PRED #$IrreflexsiveBinaryPredicate)
     */
    public boolean isIrreflexive(CycFort mt) throws IOException {
        return CycAccess.current().isIrreflexivePredicate(this.getPredicate(), mt);
    }

    /**
     * Returns <tt>true</tt> if this is an intensional variable domain populating <tt>Rule</tt>.
     * An extensional rule is one in which values are queried from the OpenCyc KB.
     *
     * @return <tt>boolean</tt> indicating if this is an intensional variable domain populating
     * <tt>Rule</tt>.
     */
    public boolean isIntensionalVariableDomainPopulatingRule() throws IOException {
        return this.getArity() == 1;
    }

    /**
     * Returns <tt>true</tt> if this is an extensional variable domain populating <tt>Rule</tt>.
     * An extensional rule is one in which all the values are listed.
     *
     * @return <tt>boolean</tt> indicating if this is an extensional variable domain populating
     * <tt>Rule</tt>.
     */
    public boolean isExtensionalVariableDomainPopulatingRule() throws IOException {
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
     * Returns a string representation of the <tt>Rule</tt>.
     *
     * @return the rule's formula formated as a <tt>String</tt>.
     */
    public String toString() {
        return formula.toString();
    }

    /**
     * Returns a cyclified string representation of the rule's formula.
     * Embedded constants are prefixed with ""#$".
     *
     * @return a cyclified <tt>String</tt>.
     */
    public String cyclify() {
        return formula.cyclify();
    }

    /**
     * Returns a new <tt>Rule</tt> which is the result of substituting the given
     * <tt>Object</tt> value for the given <tt>CycVariable</tt>.
     *
     * @param cycVariable the variable for substitution
     * @param value the value which is substituted for each occurrance of the variable
     * @return a new <tt>Rule</tt> which is the result of substituting the given
     * <tt>Object</tt> value for the given <tt>CycVariable</tt>
     */
    public Rule instantiate(CycVariable cycVariable, Object value) {
        if (! variables.contains(cycVariable))
            throw new RuntimeException("Cannot instantiate " + cycVariable +
                                       " in rule " + this);
        CycList newRule = formula.subst(value, cycVariable);
        return new Rule(newRule);
    }

    /**
     * Returns <tt>true</tt> iff the given <tt>CycList</tt> is a valid representation of a constraint
     * rule.  Specifically, an expression is not a valid constraint rule if its predicate is not a
     * <tt>CycConstant</tt> object.
     *
     * @param cycListRule the representation of a constraint rule to be validated
     * @return <tt>true</tt> iff the given <tt>CycList</tt> is a valid representation of a constraint
     * rule
     */
    public static boolean isValidRuleExpression(CycList cycListRule) {
        if (cycListRule.size() < 2)
            return false;
        return cycListRule.first() instanceof CycConstant;
    }
}