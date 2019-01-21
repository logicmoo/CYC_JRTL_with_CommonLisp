package System::Cyc::EnterpriseCyc::Java::CycLParserUtil;

use PerlLib::SwissArmyKnife;
use Moose;

use Inline Java => <<'END_OF_JAVA_CODE',
package org.opencyc.parser;

//// Internal Imports
import org.opencyc.api.*;
import org.opencyc.cycobject.*;
import org.opencyc.parser.CycLParserUtil;

//// External Imports
import java.io.*;
import java.util.*;

/**
 * <P>CycLParserUtil is designed to be the main entry point into parsing
 * CycL expressions.
 *
 * @version $Id: CycLParserUtil.java 138070 2012-01-10 19:46:08Z sbrown $
 * @author Tony Brusseau
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
 */
public class FRDCSACycLParserUtil {
  
  //// Constructors
  
  /** Creates a new instance of CycLParserUtil. */
  public FRDCSACycLParserUtil() {
      
  }
  
  //// Public Area
  
  public static CycFormulaSentence parseCycLSentence(String toParse)
  throws ParseException, IOException, CycApiException, CycApiServerSideException, 
  InvalidConstantNameException, InvalidConstantGuidException,
  UnsupportedVocabularyException, TokenMgrError {
    CycAccess cycAccess = new CycAccess();
    return CycLParserUtil.parseCycLSentence(new StringReader(toParse), true, cycAccess);
  }
}
END_OF_JAVA_CODE
  AUTOSTUDY => 1,
  CLASSPATH => '/var/lib/myfrdcsa/sandbox/opencyc-4.0/opencyc-4.0/api/java/lib/opencyc-4.0.140336.jar',
  EXTRA_JAVA_ARGS => '-Djava.library.path=/var/lib/myfrdcsa/sandbox/opencyc-4.0/opencyc-4.0/api/java/lib',
  DIRECTORY => "$ENV{HOME}/.Inline";

has 'frdcsacyclparserutil' =>
  (
   is      => 'rw',
   lazy    => 1,
   default => sub { System::Cyc::EnterpriseCyc::Java::CycLParserUtil::org::opencyc::parser::FRDCSACycLParserUtil->new() },
   handles => {
	       parseCycLSentence => 'parseCycLSentence',
	       
	      },
  );

__PACKAGE__->meta->make_immutable;
no Moose;
1;
