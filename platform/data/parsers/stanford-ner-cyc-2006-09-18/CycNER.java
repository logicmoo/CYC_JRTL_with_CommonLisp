
/** This is a demo of calling CRFClassifier programmatically.
 *  <p>
 *  Usage: <code> java -cp stanford-ner.jar:. -mx1000m NERDemo {serializedClassifier} [fileName]</code>
 *  <p>
 *  If arguments aren't specified, they default to ner-eng-ie.crf-3-all2006.ser.gz  and
 *  some hardcoded sample text.
 *  <p> *
 *  To use CRFClassifier from the command line:
 *  java -mx1000m edu.stanford.nlp.ie.crf.CRFClassifier -loadClassifier
 *      [classifier] -textFile [file]
 *  Or if the file is already tokenized and one word per line, use the
 *  version below (note the 's' instead of the 'x'):
 *  java -mx1000m edu.stanford.nlp.ie.crf.CRFClassifier -loadClassifier
 *      [classifier] -testFile [file]
 *
 *  @author Jenny Finkel
 */

import edu.stanford.nlp.ie.crf.*;
import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ling.FeatureLabel;
import edu.stanford.nlp.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

import org.logicmoo.system.Startup;

import com.cyc.tool.subl.util.SubLFiles.LispMethod;

import java.io.IOException;

public class CycNER {
	private static final String[] SringArray0 = new String[0];
	static Thread NerServer;
	static Thread NerGUI;
	private static int DEFAULT_PORT;

	/**

	 <pre>
	 (cunwind-protect
	  (format t "Starting Named Entity Recognizer.~%")
	  (csetq *stanford-ner-host* "localhost")
	  (csetq *stanford-ner-port* 6666)
	  (run-external-process
	"java"
	   `("-server" "-Xmx1024m"
	           "-XX:MaxPermSize=512m"
	           "-cp" "data/parsers/stanford-ner-cyc-2006-09-18/stanford-ner.jar"
	           "edu.stanford.nlp.ie.NERServer"
	           "-loadClassifier" "data/parsers/stanford-ner-cyc-2006-09-18/classifiers/ner-eng-ie.crf-7-muc-distsim.ser.gz"
	           ,(to-string *stanford-ner-port*)) *NULL-INPUT* *NULL-OUTPUT* *ERROR-OUTPUT*)
	 (sleep 20)
	 (progn))
	 </pre>

	 */
	public static void start_ner_server() {
		if (NerServer == null) {
			NerServer = new Thread(null, () -> {
				try {
					ner_server(SringArray0);
				} catch (Exception e) {
					Startup.uncaughtException(e);
				}
			}, "NerServer " + DEFAULT_PORT);
			NerServer.setDaemon(true);
		}
		if (!NerServer.isAlive()) {
			NerServer.start();
		}
	}

	@LispMethod
	public static void start_ner_server(int defaultPort) {
		DEFAULT_PORT = defaultPort;
		start_ner_server();
	}

	@LispMethod
	public static void start_ner_gui() {
		if (NerGUI == null) {
			NerGUI = new Thread(null, () -> {
				try {
					ner_gui(SringArray0);
				} catch (Exception e) {
					Startup.uncaughtException(e);
				}
			}, "NerGUI");
			NerGUI.setDaemon(true);
		}
		if (!NerGUI.isAlive()) {
			NerGUI.start();
		}
	}

	static String serializedClassifier = "data/parsers/stanford-ner-cyc-2006-09-18/classifiers/ner-eng-ie.crf-7-muc-distsim.ser.gz";

	public static void main(String[] args) throws IOException, Exception {
		if (args == null) {
			args = SringArray0;
		} else if (args.length > 0) {
			final String arg1 = args[0].toLowerCase().replace("--", "-");
			if (arg1.equals("-demo")) {
				ner_demo(offsetArgs(1, args));
				return;
			}
			if (arg1.equals("-server")) {
				ner_server(offsetArgs(1, args));
				return;
			}
			if (arg1.equals("-gui")) {
				ner_gui(offsetArgs(1, args));
				return;
			}
			if (arg1.equals("-crf")) {
				ner_crf(offsetArgs(1, args));
				return;
			}
		}
		ner_server(args);
	}

	public static void ner_server(String[] args) throws Exception {
		if (args == null || args.length == 0) {
			args = new String[] { "-loadClassifier", serializedClassifier, "" + DEFAULT_PORT };
		} else {
			final int length = args.length;
			if (length != 3) {
				if (length == 1) {
					serializedClassifier = args[0];
				}
				args = new String[] { "-loadClassifier", serializedClassifier, "" + DEFAULT_PORT };
			}
		}
		edu.stanford.nlp.ie.NERServer.main(args);
	}

	private static String[] offsetArgs(int i, String[] args) {
		if (i == 0) {
			return args;
		}
		ArrayList<String> av = new ArrayList();
		for (; i < args.length; i++) {
			av.add(args[i]);
		}
		return av.toArray(SringArray0);
	}

	public static void ner_gui(String[] args) {
		edu.stanford.nlp.ie.crf.NERGUI.main(args);
	}

	public static void ner_crf(String[] args) throws Exception {
		//edu.stanford.nlp.ie.crf.CRFClassifier -loadClassifier classifiers\ner-eng-ie.crf-3-all2006.ser.gz -textFile %1
		if (args == null || args.length == 0) {
			args = new String[] { "-loadClassifier", serializedClassifier, "-textFile", "sample.txt" };
		} else if (args.length == 1) {
			final String fileName = fileName(0, args);
			args = new String[] { "-loadClassifier", serializedClassifier, "-textFile", args[0] };
		} else if (args.length == 2) {
			args = new String[] { "-loadClassifier", args[0], "-textFile", args[1] };
		}
		CRFClassifier.main(args);
	}

	static String serializedClassifierDemoMain = "data/parsers/stanford-ner-cyc-2006-09-18/classifiers/ner-eng-ie.crf-3-all2006.ser.gz";

	public static void ner_demo(String[] argsOffset) throws IOException {

		if (argsOffset.length > 0) {
			serializedClassifierDemoMain = argsOffset[0];
		}

		AbstractSequenceClassifier classifier = CRFClassifier.getClassifierNoExceptions(serializedClassifierDemoMain);

		if (argsOffset.length > 1) {

			final String fileName = fileName(1, argsOffset);

			String fileContents = StringUtils.slurpFile(fileName);

			List<List<FeatureLabel>> outTS = classifier.testSentences(fileContents);

			for (List<FeatureLabel> sentence : outTS) {
				for (FeatureLabel word : sentence) {
					System.out.print(word.word() + "/" + word.answer() + " ");
				}
				System.out.println();
			}

			List<List<FeatureLabel>> outTF = classifier.testFile(fileName);
			for (List<FeatureLabel> sentence : outTF) {
				for (FeatureLabel word : sentence) {
					System.out.print(word.word() + "/" + word.answer() + " ");
				}
				System.out.println();
			}

		} else {
			String s1 = "Good afternoon Rajat Raina, how are you today?";
			String s2 = "I go to school at Stanford University, which is located in California.";
			System.out.println(classifier.testString(s1));
			System.out.println(classifier.testStringInlineXML(s2));
		}
	}

	/**
	 * @param offset
	 * @param argsOffset
	 * @return
	 */
	public static String fileName(int offset, String[] argsOffset) {
		final int length = argsOffset.length;
		if (offset + 1 == length) {
			return "sample.txt";
		}
		if (offset + 2 == length) {
			return argsOffset[1 + offset];
		}
		return argsOffset[length - 1];
	}

}
