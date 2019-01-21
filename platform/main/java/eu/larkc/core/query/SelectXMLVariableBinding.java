package eu.larkc.core.query;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.openrdf.model.BNode;
import org.openrdf.model.Literal;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.BNodeImpl;
import org.openrdf.model.impl.LiteralImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.query.impl.ListBindingSet;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SelectXMLVariableBinding extends VariableBindingBase {

	private DefaultHandlerHelper dh;
	private final static long serialVersionUID = 1L;

	public synchronized DefaultHandler getDefaultHandler() {
		if (dh == null) {
			dh = new DefaultHandlerHelper();
		}
		return dh;
	}

	private synchronized void notifySuper() {
		super.notifyAll();
	}

	// Custom serialization is disabled for now
	private void writeObject(ObjectOutputStream out) throws IOException {
		throw new NotSerializableException("Not implemented!");
	}

	private void readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		throw new NotSerializableException("Not implemented!");
	}

	/**
	 * Helper class to mimic multiple class inheritance.
	 * 
	 * @author vassil
	 * 
	 */
	public class DefaultHandlerHelper extends DefaultHandler {

		private List<String> varNames = new ArrayList<String>();
		private String inBindName;
		private Class<?> bindType;
		private String literType;
		private Value[] values;
		private int pos;
		private StringBuffer buffer = new StringBuffer();

		@Override
		public void startElement(String uri, String localName, String qname,
				Attributes attr) {
			if (qname.equals("variable")) {
				varNames.add(attr.getValue("name"));
			} else if (qname.equals("result")) {
				values = new Value[bindNames.length];
			} else if (qname.equals("binding")) {
				inBindName = attr.getValue("name");
			} else if (qname.equals("uri")) {
				bindType = URI.class;
			} else if (qname.equals("bnode")) {
				bindType = BNode.class;
			} else if (qname.equals("literal")) {
				bindType = Literal.class;
				literType = attr.getValue("datatype");
			}
		}

		@Override
		public void endElement(String uri, String localName, String qname) {
			if (qname.equals("head")) {
				bindNames = varNames.toArray(new String[varNames.size()]);
				notifySuper();
			} else if (qname.equals("result")) {
				while (true) {
					try {
						results.put(new ListBindingSet(varNames, values));
						return;
					} catch (InterruptedException ie) {
					}
				}
			} else if (qname.equals("uri")) {
				values[pos] = new URIImpl(buffer.toString());
				buffer.delete(0, buffer.length());
			} else if (qname.equals("bnode")) {
				values[pos] = new BNodeImpl(buffer.toString());
				buffer.delete(0, buffer.length());
			} else if (qname.equals("literal")) {
				if (literType == null) {
					values[pos] = new LiteralImpl(buffer.toString());
				} else {
					values[pos] = new LiteralImpl(buffer.toString(),
							new URIImpl(literType));
				}
				buffer.delete(0, buffer.length());
			}
		}

		@Override
		public void characters(char[] ch, int start, int length) {
			if (bindType == null) {
				return;
			}
			pos = varNames.indexOf(inBindName);
			String s = new String(ch, start, length);
			if (s.trim().length() == 0) {
				return;
			}
			buffer.append(s);
		}

		@Override
		public void endDocument() {
			while (true) {
				try {
					results.put(new FinalBindingSet());
					return;
				} catch (InterruptedException ie) {
				}
			}
		}
	}
}
