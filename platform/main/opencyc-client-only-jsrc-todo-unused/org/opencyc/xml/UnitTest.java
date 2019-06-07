package org.opencyc.xml;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Provides a suite of JUnit test cases for the <tt>org.opencyc.xml</tt> package.<p>
 *
 * @version $Id: UnitTest.java 126640 2008-12-04 13:39:36Z builder $
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
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE OPENCYC
 * ORGANIZATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE AND KNOWLEDGE
 * BASE CONTENT, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
public class UnitTest {

  /**
   * Tests the TextUtil class.
   */
  @Test
  public void testTextUtil() {
    System.out.println("\n*** testTextUtil ***");
    String xmlText = "abc def";
    assertEquals(xmlText, TextUtil.doEntityReference(xmlText));
    assertEquals(xmlText, TextUtil.undoEntityReference(xmlText));
    xmlText = "abc&def<hij>klm";
    assertEquals("abc&amp;def&lt;hij&gt;klm",
            TextUtil.doEntityReference(xmlText));
    assertEquals(xmlText, TextUtil.undoEntityReference(
            "abc&amp;def&lt;hij&gt;klm"));
    System.out.println("*** testTextUtil OK ***");
  }
}
