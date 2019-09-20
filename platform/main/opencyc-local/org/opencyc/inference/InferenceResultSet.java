package org.opencyc.inference;

import java.sql.SQLException;
import org.opencyc.inference.params.InferenceParameters;
import org.opencyc.api.CycAccess;
import java.util.Iterator;
import org.opencyc.cycobject.CycSymbol;
import java.util.Date;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycVariable;
import java.io.IOException;
import java.util.List;
import java.sql.ResultSet;

public final class InferenceResultSet extends AbstractResultSet implements ResultSet {
	private static final long MSECS_TO_WAIT_FOR_CLOSE = 10000L;
	private final InferenceWorker inferenceWorker;

	public InferenceResultSet(final List<Object> results, final InferenceWorker inferenceWorker) {
		this.calcRows(results);
		this.inferenceWorker = inferenceWorker;
	}

	public InferenceResultSet(final List<Object> results) {
		this.calcRows(results);
		this.inferenceWorker = null;
	}

	public boolean isInferenceComplete() {
		return this.inferenceWorker == null || this.inferenceWorker.isDone();
	}

	public InferenceIdentifier getInferenceIdentifier() {
		if (this.inferenceWorker != null) {
			return this.inferenceWorker.getInferenceIdentifier();
		}
		return null;
	}

	public synchronized void close() {
		if (this.isClosed()) {
			return;
		}
		this.setIsClosed(true);
		if (this.inferenceWorker != null) {
			try {
				this.inferenceWorker.releaseInferenceResources(10000L);
			} catch (IOException ioe) {
				throw new RuntimeException(ioe.getMessage(), ioe);
			}
		}
	}

	public Object getObject(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException {
		return this.getObject(this.findColumnStrict(col));
	}

	public CycDenotationalTerm getDenotationalTerm(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getDenotationalTerm(this.findColumnStrict(col));
	}

	public String getString(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getString(this.findColumnStrict(col));
	}

	public long getLong(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getLong(this.findColumnStrict(col));
	}

	public int getInt(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getInt(this.findColumnStrict(col));
	}

	public double getDouble(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getDouble(this.findColumnStrict(col));
	}

	public float getFloat(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getFloat(this.findColumnStrict(col));
	}

	public boolean getBoolean(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getBoolean(this.findColumnStrict(col));
	}

	public CycConstant getConstant(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getConstant(this.findColumnStrict(col));
	}

	public CycObject getCycObject(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getCycObject(this.findColumnStrict(col));
	}

	public CycFort getFort(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getFort(this.findColumnStrict(col));
	}

	public CycList<Object> getList(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return (CycList<Object>) this.getList(this.findColumnStrict(col));
	}

	public CycNart getNart(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getNart(this.findColumnStrict(col));
	}

	public CycNaut getNaut(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getNaut(this.findColumnStrict(col));
	}

	public Date getDate(final CycVariable col) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
		return this.getDate(this.findColumnStrict(col));
	}

	public int findColumn(final CycVariable col) throws IllegalArgumentException {
		return this.findColumn(col.toString());
	}

	protected int findColumnStrict(final CycVariable col) throws IllegalArgumentException {
		if (col == null) {
			throw new IllegalArgumentException("Got null column name.");
		}
		return this.findColumnStrict(col.toString());
	}

	protected void calcRows(final List results) {
		if (results.size() == 0) {
			this.setTruthValue(Boolean.FALSE);
			return;
		}
		if (results.size() == 1) {
			final Object val = results.get(0);
			if (val instanceof CycSymbol && ((CycSymbol) val).toString().equalsIgnoreCase("nil")) {
				this.setTruthValue(Boolean.TRUE);
				return;
			}
		}
		for (final Object bindingSet0 : results) {
			List<CycList> bindingSet = (List<CycList>) bindingSet0;
			final List<Object> row = (List<Object>) this.addEmptyRow();
			for (final CycList binding : bindingSet) {
				final CycVariable colVar = (CycVariable) binding.get(0);
				final int colIndex = this.possiblyAddColVar(colVar);
				final String col = colVar.toString();
				final Object val2 = binding.rest();
				row.set(colIndex, val2);
			}
		}
	}

	protected int possiblyAddColVar(final CycVariable colVar) {
		final String col = colVar.toString();
		int colIndex = -1;
		final List<String> columnNames = (List<String>) this.getColumnNamesUnsafe();
		if ((colIndex = columnNames.indexOf(col)) < 0) {
			columnNames.add(col);
			for (final List<Object> row : this.getRS()) {
				row.add(null);
			}
			return columnNames.size() - 1;
		}
		return colIndex;
	}

	protected void waitTillProcessingDone() {
		if (this.inferenceWorker == null) {
			return;
		}
		if (this.inferenceWorker.isDone()) {
			return;
		}
		while (true) {
			synchronized (this.inferenceWorker) {
				try {
					this.inferenceWorker.wait(10L);
				} catch (InterruptedException ie) {
					return;
				}
				if (this.inferenceWorker.isDone()) {
					return;
				}
				continue;
			}
		}
	}

	public static void main(final String[] args) {
		System.out.println("Starting");
		CycAccess access = null;
		try {
			access = new CycAccess("public1", 3660);
			final String query = "(#$and (#$isa ?X #$Dog) (#$isa ?Y #$Cat))";
			final InferenceWorkerSynch worker = (InferenceWorkerSynch) new DefaultInferenceWorkerSynch(query, CycAccess.inferencePSC, (InferenceParameters) null, access, 50000L);
			final InferenceResultSet rs = worker.executeQuery();
			try {
				final int indexOfX = rs.findColumn("?X");
				final int indexOfY = rs.findColumn("?Y");
				while (rs.next()) {
					final CycObject curDog = rs.getCycObject(indexOfX);
					final CycObject curCat = rs.getCycObject(indexOfY);
					System.out.println("Got dog/cat pair: " + curDog.cyclify() + " " + curCat.cyclify());
				}
				System.out.println("Result Set: " + rs);
			} finally {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (access != null) {
				access.close();
			}
		}
		System.out.println("Finished");
		System.out.flush();
		System.exit(0);
	}

	public <T> T getObject(final int columnIndex, final Class<T> type) throws SQLException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public <T> T getObject(final String columnLabel, final Class<T> type) throws SQLException {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 94 ms
	
	Decompiled with Procyon 0.5.32.
*/