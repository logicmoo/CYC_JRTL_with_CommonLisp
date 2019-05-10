/*
 *  Copyright 2011 by The Appdapter Project (www.appdapter.org).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.appdapter.gui.repo;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.event.TableModelListener;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.store.Repo.GraphStat;
import org.appdapter.core.store.RepoBox;
import org.appdapter.gui.table.SafeJTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.appdapter.gui.table.RowTableModel;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class RepoGraphTableModel extends RowTableModel {
	protected RepoGraphTableModel() {
		super(GraphStat.class);
	}

	static Logger theLogger = LoggerFactory.getLogger(RepoGraphTableModel.class);
	static String theColNames[] = { "x", "name", "size", "type",/*"age-update", "strength/status", "content summary"*/};
	static Class theColClasses[] = { Component.class, String.class, Long.class, String.class /*Double.class, String.class, String.class*/};

	//private List<GraphStat> modelData = new ArrayList<GraphStat>();

	private RepoBox myFocusRB;
	private JTable myTable;

	@Override public void addTableModelListener(TableModelListener l) {
		if (l instanceof JTable) {
			if (myTable == null) {
				this.myTable = (JTable) l;
				SafeJTable.setComponentRenderers(myTable, this);
			}
		}
		super.addTableModelListener(l);
	}

	protected void refreshStats(RepoBox repoBox) {
		modelData = repoBox.getAllGraphStats();
		fireTableDataChanged();
	}

	protected void focusOnRepo(RepoBox repoBox) {
		theLogger.info("Focusing on repo-box: " + repoBox);
		myFocusRB = repoBox;
		refreshStats(repoBox);
	}

	@Override public String getColumnName(int cidx) {
		return theColNames[cidx];
	}

	@Override public Class getColumnClass(int colIndex) {
		return theColClasses[colIndex];
	}

	@Override public int getRowCount() {
		if (modelData == null)
			return 0;
		return modelData.size();
	}

	@Override public int getColumnCount() {
		return theColNames.length;
	}

	@Override public Object getElementAt(int row) {
		return getValueAt(row, -1);
	}

	@Override public Object getValueAt(int rowIndex, int columnIndex) {
		GraphStat stat = (GraphStat) modelData.get(rowIndex);
		switch (columnIndex) {
		case -1:
		case 0: {
			if (myFocusRB != null) {
				Box subBox = myFocusRB.findGraphBox(stat.graphURI);
				if (subBox != null)
					return subBox;
			}
			return null;//stat.graphURI;
		}
		case 1:
			return stat.graphURI;
		case 2:
			return new Long(stat.getStatementCount());
		default:
			return new Double(-1.0);
		}
	}

	// This sub box can be a source of triggers (for popup-menu), which might lead to another panel opening/refreshing.
	// Currently it is only the row that matters (column is ignored).
	public Box findSubBox(int rowIndex, int columnIndex) {
		Box subBox = null;
		GraphStat stat = (GraphStat) modelData.get(rowIndex);
		if (stat != null) {
			String graphURI = stat.graphURI;
			if (myFocusRB != null) {
				subBox = myFocusRB.findGraphBox(graphURI);
			}
		}
		return subBox;
	}

}
