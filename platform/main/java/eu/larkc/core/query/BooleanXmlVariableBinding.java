/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
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
