package org.opencyc.constraintsolver;

import java.util.HashMap;

import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.UnitTest;

/**
 * <tt>HighCardinalityDomains</tt> object to model the attributes and behavior of
 * those value domains of variables, where the cardinality of the value domain
 * exceeds a size limit.  These value domains can be handled more efficiently
 * by the constraint solver as a special case.<p>
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
public class HighCardinalityDomains {

    /**
     * The value of the variable value domain size beyond which the initial values are not
     * all fetched from the KB using #$isa, rather some other more specific constraint
     * rule populates the variable domain as needed.
     */
    protected int domainSizeThreshold = 100;

    /**
     * variable --> item<br>
     * where item is the object array
     * {<tt>Integer</tt> domain size, domain populating <tt>Rule</tt>}<p>
     *
     * Dictionary of items describing whether the domain of the key
     * variable is too large to handle efficiently.  For high cardinality
     * domains, the domain size is determined from the KB without asking
     * for all of the values.  For variables not exceeding the <tt>domainSizeThreshold</tt>,
     * the dictionary contains a value of <tt>null</tt>.
     */
    protected HashMap highCardinalityDomains = new HashMap();

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = 9;

    /**
     * Constructs a new <tt>HighCardinalityDomains</tt> object.
     */
    public HighCardinalityDomains() {
    }

    /**
     * Initializes the high cardinality domain item for the given constraint variable.
     * where item is the object array
     * {<tt>Integer</tt> domain size, domain populating <tt>Rule</tt>}
     *
     * @param cycVariable the variable under consideration
     */
    public void initialize(CycVariable cycVariable) {
        Object[] item = {null, null};
        highCardinalityDomains.put(cycVariable, item);
    }

    /**
     * Returns <tt>true</tt> iff this variable's domain was specified via an #$isa
     * domain population rule, and this variables domain is too large for efficient
     * processing.  The constraint solver will employ other rules to populate
     * domain values via OpenCyc KB queries.
     *
     * @param cycVariable the variable under consideration
     * @return <tt>true</tt> iff this variable's domain was specified via an #$isa
     * domain population rule, and this variables domain is too large for efficient
     * processing
     */
    public boolean contains(CycVariable cycVariable) {
        boolean answer = highCardinalityDomains.containsKey(cycVariable);
        if (verbosity > 8)
            System.out.println("\nhigh cardinality domain for " + cycVariable + " --> " + answer);
        return answer;
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
     * Returns <tt>true</tt> iff the given <tt>Rule</tt> was used to populate the domain
     * of the given high cardinality variable.
     *
     * @param rule the rule under consideration
     * @param cycVariable the variable under consideration
     * @return <tt>true</tt> iff the given <tt>Rule</tt> was used to populate the domain
     * of the given high cardinality variable
     */
    public boolean isPopulatingRule(Rule rule, CycVariable cycVariable) {
        return rule.equals(getPopulatingRule(cycVariable));
    }

    /**
     * Sets the domain size of the high cardinality variable.
     *
     * @param cycVariable the high cardinality variable under consideration
     * @param size the new domain size of the high cardinality variable
     */
    public void setDomainSize(CycVariable cycVariable, Integer size) {
        if (! contains(cycVariable))
            this.initialize(cycVariable);
        Object[] item = (Object[]) highCardinalityDomains.get(cycVariable);
        item[0] = size;
        if (verbosity > 8)
            System.out.println("\nset high cardinality domain for " +
                               cycVariable + " to " + size);
    }

    /**
     * Gets the domain size of the high cardinality variable.
     *
     * @param cycVariable the variable under consideration
     * @return <tt>int</tt> the domain size of the high cardinality variable
     */
    public int getDomainSize(CycVariable cycVariable) {
        Object[] item = (Object[]) highCardinalityDomains.get(cycVariable);
        return ((Integer) item[0]).intValue();
    }

    /**
     * Sets the domain-populating <tt>Rule</tt> of the high cardinality variable.
     *
     * @param cycVariable the high-cardinality variable under consideration
     * @parma rule the domain-populating rule
     */
    public void setPopulatingRule(CycVariable cycVariable, Rule rule) {
        if (! contains(cycVariable))
            this.initialize(cycVariable);
        Object[] item = (Object[]) highCardinalityDomains.get(cycVariable);
        item[1] = rule;
        if (verbosity > 8)
            System.out.println("\nset high cardinality populating rule for " +
                               cycVariable.cyclify() + " to " + rule.cyclify());
    }

    /**
     * Gets the domain-populating <tt>Rule</tt> of the high cardinality variable.
     *
     * @param cycVariable the variable under consideration
     * @return the domain-populating <tt>Rule</tt> of the high cardinality variable
     */
    public Rule getPopulatingRule(CycVariable cycVariable) {
        Object[] item = (Object[]) highCardinalityDomains.get(cycVariable);
        return (Rule) item[1];
    }
}