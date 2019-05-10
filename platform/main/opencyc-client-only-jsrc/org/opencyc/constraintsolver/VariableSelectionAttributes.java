package org.opencyc.constraintsolver;

import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.UnitTest;

/**
 * <tt>VariableSelectionAttributes</tt> object to model the attributes and sort behavior
 * of a variable and its associated selection attributes.  The first selection
 * attribute is the size of the remaining value domain.  The second selection
 * attribute is the number of forward constraint rules which apply to this variable.
 * A forward constraint rule is one which uses only the current variable and future
 * (yet to be considered) variables.<p>
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
 * @see UnitTest#testBinding
 */
public class VariableSelectionAttributes implements Comparable {

    /**
     * The constraint variable under consideration.
     */
    protected CycVariable cycVariable;

    /**
     * The size of the remaining value domain.
     */
    protected Integer remainingDomainSize;

    /**
     * The number of applicable forward rules.
     */
    protected Integer degree;

    /**
     * Construct a new <tt>VariableSelectionAttibutes</tt> object given the
     * variable, remaining domain size, and degree.
     */
    public VariableSelectionAttributes(CycVariable cycVariable,
                                       Integer remainingDomainSize,
                                       Integer degree) {
        this.cycVariable = cycVariable;
        this.remainingDomainSize = remainingDomainSize;
        this.degree = degree;
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
     @Override
	public int compareTo (Object object) {
        if (! (object instanceof VariableSelectionAttributes))
            throw new ClassCastException("Must be a VariableSelectionAttributes object");
        Integer remainingDomainSize2 = ((VariableSelectionAttributes) object).remainingDomainSize;
        if (remainingDomainSize.equals(remainingDomainSize2)) {
            Integer degree2 = ((VariableSelectionAttributes) object).degree;
            // Descending order.
            return degree2.compareTo(degree);
        }
        else
            // Ascending order.
            return remainingDomainSize.compareTo(remainingDomainSize2);
     }

    /**
     * Returns a <tt>String</tt> representation of the <tt>VariableSelectionAttributes</tt> object.
     *
     * @return a <tt>String</tt> representation of the <tt>VariableSelectionAttributes</tt> object.
     */
    @Override
	public String toString() {
        return cycVariable + "  domain: " + remainingDomainSize + "  degree: " + degree;
    }

}