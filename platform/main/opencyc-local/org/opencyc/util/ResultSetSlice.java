package org.opencyc.util;

import java.sql.SQLException;
import java.sql.ResultSet;

public class ResultSetSlice
{
    private ResultSet rs;
    private int rowCount;
    private int sliceRowCount;
    private int columnCount;
    private int first;
    private int last;
    
    public ResultSetSlice(final ResultSet rs, final Integer lo, final Integer hi) throws SQLException {
        this.rs = rs;
        this.rowCount = (rs.last() ? rs.getRow() : 0);
        this.columnCount = rs.getMetaData().getColumnCount();
        this.first = lo;
        this.last = Math.min(hi, this.rowCount);
        this.sliceRowCount = this.last + 1 - this.first;
    }
    
    public ResultSet resultSet() {
        return this.rs;
    }
    
    public int rowCount() {
        return this.rowCount;
    }
    
    public int sliceRowCount() {
        return this.sliceRowCount;
    }
    
    public int columnCount() {
        return this.columnCount;
    }
    
    public int first() {
        return this.first;
    }
    
    public int last() {
        return this.last;
    }
    
    public void beforeFirst() throws SQLException {
        if (this.first == 1) {
            this.rs.beforeFirst();
        }
        else {
            this.rs.absolute(this.first - 1);
        }
    }
    
    @Override
    public String toString() {
        final StringBuffer string = new StringBuffer("(" + this.first + " (");
        try {
            this.beforeFirst();
            for (int row = this.first; row <= this.last; ++row) {
                this.rs.next();
                string.append("(");
                for (int column = 1; column <= this.columnCount; ++column) {
                    if (this.rs.getObject(column) == null) {
                        string.append("NULL");
                    }
                    else {
                        string.append(this.rs.getObject(column).toString());
                    }
                    if (column != this.columnCount) {
                        string.append(" ");
                    }
                }
                string.append(")");
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        string.append(") " + this.rowCount + ")");
        return new String(string);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 55 ms
	
	Decompiled with Procyon 0.5.32.
*/