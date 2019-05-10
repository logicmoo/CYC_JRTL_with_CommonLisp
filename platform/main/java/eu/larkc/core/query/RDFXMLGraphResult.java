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
