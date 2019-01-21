package eu.larkc.core.query;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class BooleanXmlVariableBinding {

	private Boolean result;
	private DefaultHandlerHelper dh;
	private final static long serialVersionUID = 1L;

	public synchronized DefaultHandler getDefaultHandler() {
		if (dh == null) {
			dh = new DefaultHandlerHelper();
		}
		return dh;
	}

	public synchronized boolean getResult() {
		while (true) {
			try {
				if (result == null) {
					wait();
				}
				return result;
			} catch (InterruptedException ie) {
			}
		}
	}

	private synchronized void setResult(Boolean result) {
		this.result = result;
		notifyAll();
	}

	/**
	 * Helper class to mimic multiple class inheritance.
	 * 
	 * @author vassil
	 * 
	 */
	public class DefaultHandlerHelper extends DefaultHandler {

		private boolean inBoolean = false;

		@Override
		public void startElement(String uri, String localName, String qname,
				Attributes attr) {
			if (qname.equals("boolean")) {
				inBoolean = true;
			}
		}

		@Override
		public void characters(char[] ch, int start, int length) {
			if (inBoolean && result != null) {
				return;
			}
			String s = new String(ch, start, length);
			if (s.trim().length() == 0) {
				return;
			}
			setResult(new Boolean(s));
		}
	}
}
