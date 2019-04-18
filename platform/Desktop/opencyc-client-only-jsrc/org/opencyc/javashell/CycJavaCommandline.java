package org.opencyc.javashell;

/**
 * Description TODO
 *
 * @version $Id$
 * @author Douglas R. Miles
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

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.lang.Thread;
import org.opencyc.api.*;
import org.opencyc.cycobject.*;
import org.opencyc.cyclobject.*;



public class CycJavaCommandline extends Thread {

    public CycJavaCommandline()  {
    }

    public static void main(String[] arg) throws Exception {
	String clientKey = "localhost";
	CycAccess cycAccess = new CycAccess(clientKey,CycConnection.DEFAULT_BASE_PORT);
	cycAccess.setCyclist(cycAccess.makeCycConstant("CycAdministrator"));
	cycAccess.setKePurpose(cycAccess.makeCycConstant("OpenCycProject"));
	CycJavaShell clientJshell = new CycJavaShell();
	clientJshell.ensureClientSupportsShell(cycAccess,
					       cycAccess.findOrCreate("JavaDataMt"),
					       cycAccess.findOrCreate("JavaVocabularyMt"),
					       cycAccess.findOrCreate("JavaMappingMt"),
					       cycAccess.findOrCreate("JavaTheoryMt"));

	//System.out.println(clientJshell.toCycClass(com.globalinfotek.coabsgrid.GridService.class));
	System.out.println(clientJshell.toCycClass(cycAccess.getClass()));
	/*
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while( true ) {
	    try {

		CycListParser cyclp = new CycListParser(cycAccess); 
		CycList todo = cyclp.read(in.readLine());
        	Object result = clientJshell.invoke(todo);        
		if( result instanceof CycObject ) {
		    System.out.println("200 "+((CycObject)result).cyclify());
		} else if( result instanceof String ) {
		    System.out.println("200 \""+result+"\"");
		} else {
		    System.out.println("200 "+result);
		}
	    } catch( Exception e ) {
		System.out.println("500 \""+e+"\"");
	    }
	}
*/

    }
}