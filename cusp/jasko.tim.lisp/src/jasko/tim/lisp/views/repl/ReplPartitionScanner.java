package jasko.tim.lisp.views.repl;

import jasko.tim.lisp.editors.*;

import org.eclipse.jface.text.*;
import org.eclipse.jface.text.rules.*;

public class ReplPartitionScanner extends RuleBasedPartitionScanner {
	public static final String SENT_COMMAND = "__sent_lisp_command";
	
	public static void connectPartitioner(IDocument doc) {
		IDocumentPartitioner partitioner = new FastPartitioner(
				new ReplPartitionScanner(), new String[] {
				LispPartitionScanner.LISP_STRING,
				LispPartitionScanner.LISP_COMMENT,
				SENT_COMMAND});
		partitioner.connect(doc);
		doc.setDocumentPartitioner(partitioner);
	}

	public ReplPartitionScanner() {

		IToken lispComment = new Token(LispPartitionScanner.LISP_COMMENT);
		IToken lispString = new Token(LispPartitionScanner.LISP_STRING);
		IToken sentCommand = new Token(SENT_COMMAND);
		
		IPredicateRule[] rules = new IPredicateRule[] {
				new EndOfLineRule(";", lispComment),
				new MultiLineRule("#|", "|#", lispComment),

				new MultiLineRule("\"", "\"", lispString, '\\'),
				new EndOfLineRule("\"", lispString),
				
				new EndOfLineRule(">", sentCommand),
				new EndOfLineRule("]>", sentCommand)
		};
		

		setPredicateRules(rules);
	}
}
