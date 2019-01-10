package org.opencyc.inferencesupport;

import org.opencyc.cycobject.*;

/**
 * <tt>Binding</tt> object to model the attributes and behavior of a variable binding to a
 * value.<p>
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
public class Binding implements Comparable {

    /**
     * The <tt>CycVariable</tt> which is bound.
     */
    protected CycVariable cycVariable;

    /**
     * The <tt>Object</tt> to which the <tt>CycVariable</tt> is bound.
     */
    protected Object value;

    /**
     * Constructs a new <tt>Binding</tt> object for the given <tt>CycVariable</tt> and
     * <tt>Object</tt>.
     *
     * @param cycVariable the variable which is bound
     * @param value the value to which the variable is bound
     */
    public Binding(CycVariable cycVariable, Object value) {
        this.cycVariable = cycVariable;
        this.value = value;
    }

    /**
     * Returns a <tt>String</tt> representation of the <tt>Binding</tt> object.
     *
     * @return a <tt>String</tt> representation of the <tt>Binding</tt> object.
     */
    public String toString() {
        if (value instanceof String)
            return cycVariable + " = \"" + value + "\"";
        else
            return cycVariable + " = " + value;
    }

    /**
     * Returns a cyclified <tt>String</tt> representation of the <tt>Binding</tt> object.
     *
     * @return a cyclified <tt>String</tt> representation of the <tt>Binding</tt> object.
     */
    public String cyclify() {
        if (value instanceof String)
            return cycVariable.cyclify() + " = \"" + value + "\"";
        else
            return cycVariable.cyclify() + " = " + value;
    }

    /**
     * Returns the <tt>CycVariable</tt> which is bound.
     *
     * @return the <tt>CycVariable</tt> which is bound.
     */
    public CycVariable getCycVariable() {
        return cycVariable;
    }

    /**
     * Returns the <tt>Object</tt> to which the <tt>CycVariable</tt> is bound.
     *
     * @return the <tt>Object</tt> to which the <tt>CycVariable</tt> is bound.
     */
    public Object getValue() {
        return value;
    }

    /**
     * Returns <tt>true</tt> if some other object is equal to this <tt>Binding</tt>
     *
     * @param object the reference object with which to compare.
     * @return <tt>true</tt> if some other object is equal to this <tt>Binding</tt>
     */
     public boolean equals (Object object) {
        if (! (object instanceof Binding))
            return false;
        if (! ((Binding) object).cycVariable.equals(cycVariable))
            return false;
        if (! ((Binding) object).value.equals(value))
            return false;
        else
            return true;
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
        if (! (object instanceof Binding))
            throw new ClassCastException("Must be a Binding object");
        return this.cycVariable.compareTo(((Binding) object).cycVariable);
     }

    /**
     * Creates and returns a copy of this <tt>Binding</tt>.
     *
     * @return a clone of this instance
     */
    public Object clone() {
        return new Binding(this.cycVariable, this.value);
    }

}