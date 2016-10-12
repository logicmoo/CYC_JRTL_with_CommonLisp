/* $Id: LoadMap.java 126867 2009-01-20 19:22:58Z aldag $
 *
 * Copyright (c) 2009 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package com.cyc.tool.subl.jrtl.nativeCode.mapper;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.mapper.Snapshot.SnapShootingListener;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class LoadMap {

	static public class LoadMapEntry {

		public String pkgName;

		public String symbolName;
		public Long position;

		private LoadMapEntry(String pkgName, String symbolName, Long position) {
			this.pkgName = pkgName;
			this.symbolName = symbolName;
			this.position = position;
		}
	}

	private interface Pickler {

		void populate(ObjectInputStream ois, LoadMap loadMap) throws IOException, ClassNotFoundException;

		void serialize(ObjectOutputStream oos, LoadMap loadMap) throws IOException;
	}

	/**
	 * A helper class that represents a version tuple
	 */
	private static class VersionTuple {

		int majorVersion;

		int minorVersion;

		private VersionTuple(int major, int minor) {
			this.minorVersion = minor;
			this.majorVersion = major;
		}

		public boolean equals(Object other) {
			if (other != null)
				if (other instanceof VersionTuple) {
					VersionTuple otherTuple = (VersionTuple) other;
					return otherTuple.majorVersion == this.majorVersion && otherTuple.minorVersion == this.minorVersion;
				}
			return false;
		}

		public int hashCode() {
			return 37 * this.majorVersion + this.minorVersion;
		}

		public String toString() {
			return "[Version " + this.majorVersion + "." + this.minorVersion + "]";
		}
	}

	/**
	 * markers for the load map file representation
	 */
	static private String MAGIC_BYTES = "LoadMap";

	static private String COPYRIGHT_NOTICE = "(C)opyright by Cycorp Inc -- Use is Subject to License Terms";

	/**
	 * the current version, as integers and as a version tuple
	 */
	static public int MAJOR_VERSION = 1;
	static public int MINOR_VERSION = 0;

	private static VersionTuple CURRENT_VERSION = new VersionTuple(LoadMap.MAJOR_VERSION, LoadMap.MINOR_VERSION);

	private static Map<VersionTuple, Pickler> picklers = new HashMap<VersionTuple, Pickler>();

	static public LoadMap load(InputStream in) throws IOException {
		ObjectInputStream ois = new ObjectInputStream(in);
		try {
			LoadMap loadMap = new LoadMap();
			VersionTuple version = LoadMap.readHeader(ois);
			LoadMap.unpickle(ois, loadMap, version);
			return loadMap;
		} finally {
			// @note dont close the stream, will close the underlying stream
			// ois.close();
		}
	}

	static public void main(String[] args) {

		String mapFile = "/tmp/kbless-state.cfasl.map";

		try {
			InputStream in = new BufferedInputStream(new FileInputStream(mapFile));
			LoadMap loadMap = LoadMap.load(in);
			Iterator<LoadMapEntry> entryIterator = loadMap.iterator();
			while (entryIterator.hasNext()) {
				LoadMapEntry entry = entryIterator.next();
				System.out.println(";;; writing " + entry.pkgName + "::" + entry.symbolName + " at " + entry.position);
			}
			in.close();
		} catch (Exception xcpt) {
			xcpt.printStackTrace();
			System.exit(-1);
		}

	}

	static public LoadMap newLoadMap() {
		return new LoadMap();
	}

	static private void pickle(ObjectOutputStream oos, LoadMap loadMap, VersionTuple tuple) throws IOException {
		Pickler pickler = LoadMap.picklers.get(tuple);
		if (pickler == null)
			throw new IOException("Version " + tuple + " not supported");
		pickler.serialize(oos, loadMap);
	}

	/**
	 * A helper method that reads the header of an object input stream
	 * representation of the load map.
	 *
	 * @param ois
	 * @return VersionTuple a tuple of version information to help choose the
	 *         correct loader
	 * @throws java.io.IOException
	 */
	static private VersionTuple readHeader(ObjectInputStream ois) throws IOException {
		String magicBytes = ois.readUTF();
		if (LoadMap.MAGIC_BYTES.equals(magicBytes)) {
			int major = ois.readInt();
			int minor = ois.readInt();
			String copyRightNotice = ois.readUTF();
			if (LoadMap.COPYRIGHT_NOTICE.equals(copyRightNotice))
				return new VersionTuple(major, minor);
			else
				throw new IOException("Invalid format: expected copyright notice, got " + copyRightNotice);
		} else
			throw new IOException("Invalid format: expected magic bytes, got " + magicBytes);
	}

	static private void unpickle(ObjectInputStream ois, LoadMap loadMap, VersionTuple tuple) throws IOException {
		Pickler pickler = LoadMap.picklers.get(tuple);
		if (pickler == null)
			throw new IOException("Version " + tuple + " not supported");
		try {
			pickler.populate(ois, loadMap);
		} catch (ClassNotFoundException xcpt) {
			throw new IOException("Could not populate map due to missing class.", xcpt);
		}
	}

	/**
	 * Trampoline for writing the current header
	 *
	 * @param oos
	 *            the object stream to write to
	 * @throws java.io.IOException
	 */
	static private void writeCurrentHeader(ObjectOutputStream oos) throws IOException {
		LoadMap.writeHeader(oos, LoadMap.CURRENT_VERSION);
	}

	/**
	 * Helper method for writing a load map header
	 *
	 * @param oos
	 *            the object stream
	 * @param version
	 *            the version of the output format
	 * @throws java.io.IOException
	 */
	static private void writeHeader(ObjectOutputStream oos, VersionTuple version) throws IOException {
		oos.writeUTF(LoadMap.MAGIC_BYTES);
		LoadMap.writeVersion(oos, version);
		oos.writeUTF(LoadMap.COPYRIGHT_NOTICE);
	}

	/**
	 * Helper method for writing a version tuple
	 *
	 * @param oos
	 *            the object output stream
	 * @param version
	 *            the version tuple to write
	 * @throws java.io.IOException
	 */
	static private void writeVersion(ObjectOutputStream oos, VersionTuple version) throws IOException {
		oos.writeInt(version.majorVersion);
		oos.writeInt(version.minorVersion);
	}

	{
		LoadMap.picklers.put(new VersionTuple(1, 0), new Pickler() {

			private String PACKAGE_NAME_SENTINEL = "";
			private String SYMBOL_NAME_SENTINEL = "";
			private Long FILE_POSITION_SENTINEL = Long.valueOf(-1L);

			private boolean isSentinel(String pkgName, String symbolName, Long position) {
				return this.FILE_POSITION_SENTINEL.equals(position) && this.SYMBOL_NAME_SENTINEL.equals(symbolName)
						&& this.PACKAGE_NAME_SENTINEL.equals(pkgName);
			}

			public void populate(ObjectInputStream ois, LoadMap loadMap) throws IOException, ClassNotFoundException {
				boolean done = false;
				while (!done) {
					String pkgName = ois.readUTF();
					String symbolName = ois.readUTF();
					Long position = Long.valueOf(ois.readLong());
					done = this.isSentinel(pkgName, symbolName, position);
					if (!done)
						loadMap.noteSymbolEntry(pkgName, symbolName, position);
				}
			}

			/**
			 * This serializer uses a symbolic rather than an implementation
			 * approach
			 *
			 * @todo rewrite once a better incremental iterator or visitor is
			 *       available
			 */

			public void serialize(ObjectOutputStream oos, LoadMap loadMap) throws IOException {
				for (String pkgName : LoadMap.this.entries.keySet()) {
					Map<String, Long> symbolEntries = LoadMap.this.entries.get(pkgName);
					for (String symbolName : symbolEntries.keySet()) {
						Long position = symbolEntries.get(symbolName);
						this.serializeSymbol(oos, pkgName, symbolName, position);
					}
				}
				// use a sentinel approach
				this.serializeSentinel(oos);
			}

			private void serializeSentinel(ObjectOutputStream oos) throws IOException {
				this.serializeSymbol(oos, this.PACKAGE_NAME_SENTINEL, this.SYMBOL_NAME_SENTINEL,
						this.FILE_POSITION_SENTINEL);
			}

			private void serializeSymbol(ObjectOutputStream oos, String pkgName, String symbolName, Long position)
					throws IOException {
				oos.writeUTF(pkgName);
				oos.writeUTF(symbolName);
				oos.writeLong(position.longValue());
			}
		});
	}

	/**
	 * the entries in the load map, mapping package names to maps of symbo names
	 * to file positions
	 */
	private Map<String, Map<String, Long>> entries;

	private LoadMap() {
		this.entries = this.newPackageEntries();
	}

	/**
	 * Obtain a connector that gives modification access to this load map via
	 * the snap shooting listener interface.
	 *
	 * @see Snapshot
	 * @return A snop shooting listener connected to this load map.
	 */
	public SnapShootingListener getListener() {
		return new SnapShootingListener() {

			public void noteSymbol(String pkgName, String symbolName, SubLObject filePosition) {
				try {
					Long position = Long.valueOf(filePosition.longValue());
					LoadMap.this.noteSymbolEntry(pkgName, symbolName, position);
				} catch (Exception xcpt) {
					this.skippedSymbol(pkgName, symbolName, xcpt);
				}
			}

			public void skippedSymbol(String pkgName, String symbolName, Exception xcpt) {
			}
		};
	}

	public Iterator<LoadMapEntry> iterator() {
		List<LoadMapEntry> mapEntries = new ArrayList<LoadMapEntry>();
		for (String pkgName : this.entries.keySet()) {
			Map<String, Long> symbolEntries = this.entries.get(pkgName);
			for (String symbolName : symbolEntries.keySet()) {
				Long position = symbolEntries.get(symbolName);
				mapEntries.add(new LoadMapEntry(pkgName, symbolName, position));
			}
		}
		return mapEntries.iterator();
	}

	/**
	 * Resolve a symbol to its load map file position.
	 *
	 * @param pkgName
	 *            the name of the package under which the object was indexed
	 * @param symbolName
	 *            the name of symbol under which the object was indexed
	 * @return the file position object
	 */
	public Long lookup(String pkgName, String symbolName) {
		return this.lookupSymbolEntry(pkgName, symbolName);
	}

	/**
	 * Helper wrapper around lookup(String pkgName, String symbolName) that is
	 * more SubL-like in its data types expected.
	 *
	 * @param symbol
	 * @return either an NON-NEGATIVE-INTEGER-P for the file position or NIL if
	 *         the entry was not found
	 */
	public SubLObject lookup(SubLSymbol symbol) {
		String pkgName = symbol.getPackage().getName();
		String symName = symbol.getName();
		Long position = this.lookup(pkgName, symName);
		if (position == null)
			return CommonSymbols.NIL;
		else
			return SubLObjectFactory.makeInteger(position.longValue());
	}

	/**
	 * Resolve an entry against a populated load map.
	 *
	 * @param pkgName
	 *            the name of the package
	 * @param symbolName
	 *            the name of the symbol
	 * @return either the file position as a Long or <tt>null</tt> if no such
	 *         entry was found
	 */
	protected Long lookupSymbolEntry(String pkgName, String symbolName) {
		synchronized (this.entries) {
			Map<String, Long> symbolEntries = this.entries.get(pkgName);
			if (symbolEntries != null)
				return symbolEntries.get(symbolName);
		}
		return null;
	}

	/**
	 * factory method for allocating the package level of the load map
	 *
	 * @return the map for mapping package name to its load map entries
	 */
	protected Map<String, Map<String, Long>> newPackageEntries() {
		return new HashMap<String, Map<String, Long>>();
	}

	/**
	 * factory method for allocating the symbol level entries of the load map
	 *
	 * @return the symbol level mapping for entries
	 */
	protected Map<String, Long> newSymbolEntries() {
		return new HashMap<String, Long>();
	}

	/**
	 * Add an entry to the load map
	 *
	 * @param pkgName
	 *            the name of the package under which to index it
	 * @param symbolName
	 *            the name of the symbol under which to index it
	 * @param filePosition
	 *            the file position under which to index it
	 */
	protected void noteSymbolEntry(String pkgName, String symbolName, Long filePosition) {
		synchronized (this.entries) {
			Map<String, Long> symbolEntries = this.entries.get(pkgName);
			if (symbolEntries == null) {
				symbolEntries = this.newSymbolEntries();
				this.entries.put(pkgName, symbolEntries);
			}
			symbolEntries.put(symbolName, filePosition);
		}
	}

	/**
	 * Serialization method for the load map.
	 *
	 * @param out
	 * @throws java.io.IOException
	 */
	public void save(OutputStream out) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(out);
		try {
			LoadMap.writeCurrentHeader(oos);
			LoadMap.pickle(oos, this, LoadMap.CURRENT_VERSION);
			oos.flush();
		} finally {
			// @note dont close the stream, will close the underlying stream
			// out.close
		}
	}
}
