package org.opencyc.javacyc;

import java.io.IOException;
import java.net.UnknownHostException;

import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycConnection;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import org.opencyc.util.Log;
import org.opencyc.util.UUID;

/**
 * Provides the main function for JavaCyc, which is the Java VM coupled
 * with a Cyc server.  It provides a framework for Cyc server functions
 * to be implemented in the java environment.<p>
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
 */

public class JavaCyc {

    /**
     * The default verbosity of this object's output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    public static final int DEFAULT_VERBOSITY = 3;

    /**
     * Sets verbosity of this object's output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = DEFAULT_VERBOSITY;

    /**
     * CycAccess object which manages the Cyc connection and provides api methods
     */
    protected CycAccess cycAccess;

    /**
     * the Cyc server base tcp port
     */
    protected int cycBasePort = CycConnection.DEFAULT_BASE_PORT;

    /**
     * Constructs a new JavaCyc object.
     */
    public JavaCyc() {
    }

    /**
     * Provides the main function to execute the JavaCyc application.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Log.makeLog("JavaCyc.log");
        JavaCyc javaCyc = new JavaCyc();
        try {
            javaCyc.initialize();
        }
        catch (Exception e) {
            Log.current.println(e.getMessage());
            Log.current.printStackTrace(e);
            System.exit(1);
        }
    }

    /**
     * Initializes the JavaCyc object.
     */
    protected void initialize ()
        throws CycApiException, IOException, UnknownHostException {
        String cycBasePortProperty = System.getProperty("org.opencyc.javacyc.cycBasePort", "");
        if (! cycBasePortProperty.equalsIgnoreCase(""))
            cycBasePort = (new Integer(cycBasePortProperty)).intValue();
        cycAccess = new CycAccess(CycConnection.DEFAULT_HOSTNAME,
                                  cycBasePort);
        Log.current.println("JavaCyc connected to Cyc " + cycAccess.getCycImageID());
        Log.current.println("Cyc base tcp port is " + cycBasePort);
        cycAccess.traceOn();
        if (verbosity > 2)
            Log.current.println("Indentifying JavaCyc as a java client to Cyc.");
        UUID uuid = cycAccess.getCycConnection().getUuid();
        CycList command = new CycList();
        command.add(CycObjectFactory.makeCycSymbol("set-javacyc-guid"));
        command.add(uuid.toString());
        cycAccess.converseVoid(command);



    }

    /**
     * Sets verbosity of this object's output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     *
     * @param verbosity 0 --> quiet ... 9 -> maximum diagnostic input
     */
    public void setVerbosity(int verbosity) {
        this.verbosity = verbosity;
    }

}