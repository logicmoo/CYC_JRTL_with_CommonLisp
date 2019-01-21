package eu.larkc.core.query;

import org.openrdf.model.Statement;
import org.openrdf.rio.RDFHandler;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.helpers.RDFHandlerBase;

public class RDFXMLGraphResult extends GraphResultBase {

	private RDFHandlerHelper handler;
	private final static long serialVersionUID = 1L;

	public synchronized RDFHandler getRDFHandler() {
		if (handler == null) {
			handler = new RDFHandlerHelper();
		}
		return handler;
	}

	public class RDFHandlerHelper extends RDFHandlerBase {
		@Override
		public void endRDF() throws RDFHandlerException {
			while (true) {
				try {
					results.put(new FinalStatement());
					return;
				} catch (InterruptedException ie) {
				}
			}
		}

		@Override
		public void handleStatement(Statement statement)
				throws RDFHandlerException {
			while (true) {
				try {
					results.put(statement);
					return;
				} catch (InterruptedException ie) {
				}
			}
		}
	}
}
