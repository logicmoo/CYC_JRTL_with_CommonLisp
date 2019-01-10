package org.opencyc.constraintsolver;

import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.ConstraintRule;
import org.opencyc.inferencesupport.UnitTest;

/**
 * <tt>VariablePopulationItem</tt> object to model the attributes of constraint variable value population by
 * candidate rules.<p>
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
public class VariablePopulationItem implements Comparable {

    /**
     * The variable whose value domain is to be populated.
     */
    protected CycVariable cycVariable;

    /**
     * The rule which populates this variable.
     */
    protected ConstraintRule rule;

    public VariablePopulationItem(CycVariable cycVariable, ConstraintRule rule) {
        this.cycVariable = cycVariable;
        this.rule = rule;
    }

    public int getNbrFormulaInstances () {
        return rule.nbrFormulaInstances;
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
        if (! (object instanceof VariablePopulationItem))
            throw new ClassCastException("Must be a VariablePopulation object");
        VariablePopulationItem thatVariablePopulationItem = (VariablePopulationItem) object;
        Integer thisNbrFormulaInstances = new Integer(this.getNbrFormulaInstances());
        Integer thatNbrFormulaInstances = new Integer(thatVariablePopulationItem.getNbrFormulaInstances());
        return thisNbrFormulaInstances.compareTo(thatNbrFormulaInstances);
     }

}