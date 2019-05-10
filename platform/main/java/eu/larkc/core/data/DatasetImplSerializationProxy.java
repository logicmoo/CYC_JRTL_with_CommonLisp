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
package eu.larkc.core.data;

import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openrdf.model.URI;
import org.openrdf.query.impl.DatasetImpl;

/**
 * Serialization proxy for the unserializable org.openrdf.query.impl.DatasetImpl
 * 
 * @see org.openrdf.query.impl.DatasetImpl
 * @author Christoph Fuchs
 */
public class DatasetImplSerializationProxy extends DatasetImpl implements
		Serializable {

	/** Generated serial version UID. */
	private static final long serialVersionUID = -5190322296593277023L;

	/** The default graphs. */
	protected Set<URI> defaultGraphs = new LinkedHashSet<URI>();

	/** The named graphs. */
	protected Set<URI> namedGraphs = new LinkedHashSet<URI>();

	/**
	 * Write object.
	 * 
	 * @param out
	 *            the out
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		// note, here we don't need out.defaultWriteObject(); because
		// Dataset has no other state to serialize
		out.writeObject(this.defaultGraphs);
		out.writeObject(this.namedGraphs);

	}

	/**
	 * Read object.
	 * 
	 * @param in
	 *            the in
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 */
	@SuppressWarnings("unchecked")
	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		// note, here we don't need in.defaultReadObject();
		// because Dataset has no other state to deserialize
		this.defaultGraphs = (Set<URI>) in.readObject();
		this.namedGraphs = (Set<URI>) in.readObject();

		for (URI dg : this.defaultGraphs) {
			super.addDefaultGraph(dg);
		}
		for (URI ng : this.namedGraphs) {
			super.addNamedGraph(ng);
		}
	}

}
