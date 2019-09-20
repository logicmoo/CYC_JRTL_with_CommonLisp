package org.opencyc.inference;

import java.sql.SQLXML;
import java.sql.NClob;
import java.sql.RowId;
import java.net.URL;
import java.util.Calendar;
import java.sql.Array;
import java.sql.Clob;
import java.sql.Blob;
import java.sql.Ref;
import java.util.Map;
import java.sql.Statement;
import java.io.Reader;
import java.sql.ResultSetMetaData;
import java.sql.SQLWarning;
import java.io.InputStream;
import java.sql.Timestamp;
import java.sql.Time;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Collection;
import java.sql.SQLException;
import org.opencyc.api.CycApiException;
import org.opencyc.util.DateConverter;
import java.sql.Date;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.cycobject.CycDenotationalTerm;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public abstract class AbstractResultSet implements ResultSet
{
    private static final long MSECS_TO_WAIT_FOR_CLOSE = 10000L;
    private final List<List<Object>> rs;
    private final List<String> columnNames;
    private int cursor;
    private List<Object> curRow;
    private volatile boolean isClosed;
    private Boolean truthValue;
    
    public AbstractResultSet() {
        this.rs = new ArrayList<List<Object>>(128);
        this.columnNames = new ArrayList<String>(8);
        this.cursor = -1;
        this.curRow = null;
        this.isClosed = false;
        this.truthValue = null;
    }
    
    @Override
    public synchronized void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
    }
    
    @Override
    public boolean isClosed() {
        return this.isClosed;
    }
    
    @Override
    public boolean isBeforeFirst() {
        this.ensureOpen("isBeforeFirst");
        return this.cursor == -1;
    }
    
    @Override
    public boolean isAfterLast() {
        this.ensureOpen("isAfterLast");
        this.waitTillProcessingDone();
        return this.cursor == this.getCurrentRowCount();
    }
    
    @Override
    public boolean isFirst() {
        this.ensureOpen("isFirst");
        return this.cursor == 0;
    }
    
    @Override
    public boolean isLast() {
        this.ensureOpen("isLast");
        this.waitTillProcessingDone();
        return this.cursor == this.getCurrentRowCount() - 1;
    }
    
    @Override
    public void beforeFirst() {
        this.ensureOpen("beforeFirst");
        this.cursor = -1;
        this.curRow = null;
    }
    
    @Override
    public void afterLast() {
        this.ensureOpen("afterLast");
        this.waitTillProcessingDone();
        this.cursor = this.getCurrentRowCount();
        this.curRow = null;
    }
    
    @Override
    public int getRow() {
        this.ensureOpen("getRow");
        return (this.cursor < 0) ? 0 : (this.cursor + 1);
    }
    
    @Override
    public boolean absolute(int row) {
        this.ensureOpen("absolute");
        if (row < 1 || row > this.rs.size()) {
            this.waitTillProcessingDone();
            if (row < 0) {
                row = this.rs.size() + row + 1;
            }
        }
        if (row < 0) {
            row = 0;
        }
        if (row > this.rs.size()) {
            row = this.rs.size() + 1;
            this.cursor = this.rs.size();
            this.curRow = null;
            return false;
        }
        this.cursor = row - 1;
        this.curRow = this.rs.get(this.cursor);
        return true;
    }
    
    @Override
    public boolean relative(final int row) {
        this.ensureOpen("relative");
        return this.absolute(this.getRow() + row);
    }
    
    @Override
    public boolean first() {
        this.ensureOpen("first");
        return this.absolute(1);
    }
    
    @Override
    public boolean last() {
        this.ensureOpen("last");
        this.waitTillProcessingDone();
        return this.absolute(this.getCurrentRowCount() - 1);
    }
    
    @Override
    public boolean previous() {
        this.ensureOpen("previous");
        return this.relative(-1);
    }
    
    @Override
    public boolean next() {
        this.ensureOpen("next");
        return this.relative(1);
    }
    
    @Override
    public Object getObject(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        return this.getObject(this.findColumnStrict(col));
    }
    
    @Override
    public Object getObject(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        this.ensureOpen("getObject");
        if (colIndex <= 0 || colIndex > this.getMaxColumns()) {
            throw new IllegalArgumentException("Invalid column index: " + colIndex);
        }
        return this.curRow.get(colIndex - 1);
    }
    
    public CycDenotationalTerm getDenotationalTerm(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getDenotationalTerm(this.findColumnStrict(col));
    }
    
    public CycDenotationalTerm getDenotationalTerm(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getDenotationalTerm");
        return (CycDenotationalTerm)this.getObject(colIndex);
    }
    
    @Override
    public String getString(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getString(this.findColumnStrict(col));
    }
    
    @Override
    public String getString(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getString");
        return (String)this.getObject(colIndex);
    }
    
    @Override
    public long getLong(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getLong(this.findColumnStrict(col));
    }
    
    @Override
    public long getLong(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getLong");
        return ((Number)this.getObject(colIndex)).longValue();
    }
    
    @Override
    public int getInt(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getInt(this.findColumnStrict(col));
    }
    
    @Override
    public int getInt(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getInt");
        return ((Number)this.getObject(colIndex)).intValue();
    }
    
    @Override
    public double getDouble(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getDouble(this.findColumnStrict(col));
    }
    
    @Override
    public double getDouble(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getDouble");
        return ((Number)this.getObject(colIndex)).doubleValue();
    }
    
    @Override
    public float getFloat(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getFloat(this.findColumnStrict(col));
    }
    
    @Override
    public float getFloat(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getFloat");
        return ((Number)this.getObject(colIndex)).floatValue();
    }
    
    @Override
    public boolean getBoolean(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getBoolean(this.findColumnStrict(col));
    }
    
    @Override
    public boolean getBoolean(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getBoolean");
        final Object val = this.getObject(colIndex);
        return val instanceof CycSymbol && !((CycSymbol)val).getSymbolName().equalsIgnoreCase("nil");
    }
    
    public CycConstant getConstant(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getConstant(this.findColumnStrict(col));
    }
    
    public CycConstant getConstant(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getConstant");
        return (CycConstant)this.getObject(colIndex);
    }
    
    public CycObject getCycObject(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getCycObject(this.findColumnStrict(col));
    }
    
    public CycObject getCycObject(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getCycObject");
        return (CycObject)this.getObject(colIndex);
    }
    
    public CycFort getFort(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getFort(this.findColumnStrict(col));
    }
    
    public CycFort getFort(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getFort");
        return (CycFort)this.getObject(colIndex);
    }
    
    public CycList<Object> getList(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getList(this.findColumnStrict(col));
    }
    
    public CycList<Object> getList(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getList");
        return (CycList<Object>)this.getObject(colIndex);
    }
    
    public CycNart getNart(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getNart(this.findColumnStrict(col));
    }
    
    public CycNart getNart(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getNart");
        return (CycNart)this.getObject(colIndex);
    }
    
    public CycNaut getNaut(final String col) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        return this.getNaut(this.findColumnStrict(col));
    }
    
    public CycNaut getNaut(final int colIndex) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        this.ensureOpen("getCycNaut");
        return (CycNaut)this.getObject(colIndex);
    }
    
    @Override
    public Date getDate(final int colIndex) throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
        final Object obj = this.getObject(colIndex);
        return new Date(DateConverter.parseCycDate((CycNaut)CycNaut.convertIfPromising(obj)).getTime());
    }
    
    @Override
    public Date getDate(final String columnLabel) throws SQLException {
        return this.getDate(this.findColumnStrict(columnLabel));
    }
    
    @Override
    public int findColumn(final String col) throws IllegalArgumentException {
        this.ensureOpen("findColumn");
        final int colIndex = this.columnNames.indexOf(col);
        if (colIndex < 0) {
            throw new IllegalArgumentException("Unable to find column: " + col);
        }
        return colIndex + 1;
    }
    
    public int getMaxColumns() {
        this.waitTillProcessingDone();
        return this.columnNames.size();
    }
    
    public List<String> getColumnNames() {
        final List<String> results = new ArrayList<String>(this.columnNames.size());
        results.addAll(this.columnNames);
        return results;
    }
    
    public int getCurrentRowCount() {
        return this.rs.size();
    }
    
    @Override
    public String toString() {
        if (this.hasTruthValue()) {
            return "" + this.getTruthValue();
        }
        final StringBuffer buf = new StringBuffer("(");
        int count = 0;
        if (this.rs != null) {
            for (final List<Object> row : this.rs) {
                if (count++ > 15) {
                    buf.append("...");
                    break;
                }
                if (count > 1) {
                    buf.append(", ");
                }
                buf.append("[row:" + (count - 1) + " ");
                int col = 0;
                for (final Object val : row) {
                    if (col > 15) {
                        buf.append("...");
                        break;
                    }
                    if (col > 0) {
                        buf.append(", ");
                    }
                    buf.append("{");
                    buf.append(this.columnNames.get(col++));
                    buf.append("->").append(val);
                    buf.append("}");
                }
                buf.append("]");
            }
        }
        buf.append(")");
        return buf.toString();
    }
    
    public boolean hasTruthValue() {
        return this.truthValue != null;
    }
    
    public boolean getTruthValue() {
        if (!this.hasTruthValue()) {
            throw new RuntimeException("Attempt to get the truth value for a result set with non-truth value data.");
        }
        return this.truthValue;
    }
    
    @Override
    public boolean wasNull() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public byte getByte(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public short getShort(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public BigDecimal getBigDecimal(final int columnIndex, final int scale) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public byte[] getBytes(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Time getTime(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Timestamp getTimestamp(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public InputStream getAsciiStream(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public InputStream getUnicodeStream(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public InputStream getBinaryStream(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public byte getByte(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public short getShort(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public BigDecimal getBigDecimal(final String columnLabel, final int scale) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public byte[] getBytes(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Time getTime(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Timestamp getTimestamp(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public InputStream getAsciiStream(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public InputStream getUnicodeStream(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public InputStream getBinaryStream(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public SQLWarning getWarnings() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void clearWarnings() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getCursorName() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Reader getCharacterStream(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Reader getCharacterStream(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public BigDecimal getBigDecimal(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public BigDecimal getBigDecimal(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setFetchDirection(final int direction) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public int getFetchDirection() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setFetchSize(final int rows) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public int getFetchSize() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public int getType() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public int getConcurrency() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean rowUpdated() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean rowInserted() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean rowDeleted() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNull(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBoolean(final int columnIndex, final boolean x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateByte(final int columnIndex, final byte x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateShort(final int columnIndex, final short x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateInt(final int columnIndex, final int x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateLong(final int columnIndex, final long x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateFloat(final int columnIndex, final float x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateDouble(final int columnIndex, final double x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBigDecimal(final int columnIndex, final BigDecimal x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateString(final int columnIndex, final String x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBytes(final int columnIndex, final byte[] x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateDate(final int columnIndex, final Date x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateTime(final int columnIndex, final Time x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateTimestamp(final int columnIndex, final Timestamp x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateAsciiStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBinaryStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateCharacterStream(final int columnIndex, final Reader x, final int length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateObject(final int columnIndex, final Object x, final int scaleOrLength) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateObject(final int columnIndex, final Object x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNull(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBoolean(final String columnLabel, final boolean x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateByte(final String columnLabel, final byte x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateShort(final String columnLabel, final short x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateInt(final String columnLabel, final int x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateLong(final String columnLabel, final long x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateFloat(final String columnLabel, final float x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateDouble(final String columnLabel, final double x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBigDecimal(final String columnLabel, final BigDecimal x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateString(final String columnLabel, final String x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBytes(final String columnLabel, final byte[] x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateDate(final String columnLabel, final Date x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateTime(final String columnLabel, final Time x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateTimestamp(final String columnLabel, final Timestamp x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateAsciiStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBinaryStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateCharacterStream(final String columnLabel, final Reader reader, final int length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateObject(final String columnLabel, final Object x, final int scaleOrLength) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateObject(final String columnLabel, final Object x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void insertRow() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateRow() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void deleteRow() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void refreshRow() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void cancelRowUpdates() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void moveToInsertRow() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void moveToCurrentRow() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Statement getStatement() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Object getObject(final int columnIndex, final Map<String, Class<?>> map) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Ref getRef(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Blob getBlob(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Clob getClob(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Array getArray(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Object getObject(final String columnLabel, final Map<String, Class<?>> map) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Ref getRef(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Blob getBlob(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Clob getClob(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Array getArray(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getDate(final int columnIndex, final Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getDate(final String columnLabel, final Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Time getTime(final int columnIndex, final Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Time getTime(final String columnLabel, final Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Timestamp getTimestamp(final int columnIndex, final Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Timestamp getTimestamp(final String columnLabel, final Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public URL getURL(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public URL getURL(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateRef(final int columnIndex, final Ref x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateRef(final String columnLabel, final Ref x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBlob(final int columnIndex, final Blob x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBlob(final String columnLabel, final Blob x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateClob(final int columnIndex, final Clob x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateClob(final String columnLabel, final Clob x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateArray(final int columnIndex, final Array x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateArray(final String columnLabel, final Array x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public RowId getRowId(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public RowId getRowId(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateRowId(final int columnIndex, final RowId x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateRowId(final String columnLabel, final RowId x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public int getHoldability() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNString(final int columnIndex, final String nString) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNString(final String columnLabel, final String nString) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNClob(final int columnIndex, final NClob nClob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNClob(final String columnLabel, final NClob nClob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public NClob getNClob(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public NClob getNClob(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public SQLXML getSQLXML(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public SQLXML getSQLXML(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateSQLXML(final int columnIndex, final SQLXML xmlObject) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateSQLXML(final String columnLabel, final SQLXML xmlObject) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getNString(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getNString(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Reader getNCharacterStream(final int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Reader getNCharacterStream(final String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateAsciiStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBinaryStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateAsciiStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBinaryStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBlob(final int columnIndex, final InputStream inputStream, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBlob(final String columnLabel, final InputStream inputStream, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNCharacterStream(final int columnIndex, final Reader x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateAsciiStream(final int columnIndex, final InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBinaryStream(final int columnIndex, final InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateCharacterStream(final int columnIndex, final Reader x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateAsciiStream(final String columnLabel, final InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBinaryStream(final String columnLabel, final InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateCharacterStream(final String columnLabel, final Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBlob(final int columnIndex, final InputStream inputStream) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateBlob(final String columnLabel, final InputStream inputStream) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateClob(final int columnIndex, final Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateClob(final String columnLabel, final Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNClob(final int columnIndex, final Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void updateNClob(final String columnLabel, final Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public <T> T unwrap(final Class<T> iface) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean isWrapperFor(final Class<?> iface) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    protected void waitTillProcessingDone() {
    }
    
    protected int findColumnStrict(final String col) throws IllegalArgumentException {
        if (col == null) {
            throw new IllegalArgumentException("Got null column name.");
        }
        final int val = this.columnNames.indexOf(col);
        if (val < 0) {
            throw new IllegalArgumentException("Invalid column: " + col);
        }
        return val + 1;
    }
    
    protected List<Object> addEmptyRow() {
        final List<Object> row = new ArrayList<Object>();
        this.rs.add(row);
        for (int i = 0, size = this.columnNames.size(); i < size; ++i) {
            row.add(null);
        }
        return row;
    }
    
    protected void ensureOpen(final String methodName) {
        if (this.isClosed) {
            throw new RuntimeException(methodName + "() called on a closed AbstractResultSet.");
        }
    }
    
    protected void setIsClosed(final boolean newVal) {
        this.isClosed = newVal;
    }
    
    protected List<List<Object>> getRS() {
        return this.rs;
    }
    
    protected void setTruthValue(final Boolean newVal) {
        this.truthValue = newVal;
    }
    
    protected List<String> getColumnNamesUnsafe() {
        return this.columnNames;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 268 ms
	
	Decompiled with Procyon 0.5.32.
*/