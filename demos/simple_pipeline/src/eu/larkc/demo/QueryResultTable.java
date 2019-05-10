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
package eu.larkc.demo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class QueryResultTable extends AbstractTableModel {

    private static final long serialVersionUID = 1;
    
    public QueryResultTable(List<List<String>> content) {
    	mContent = content;
    	
    	/*List<String> headings = new ArrayList<String>();
    	headings.add( "Empty" );
    	List<String> values = new ArrayList<String>();
    	values.add( "null" );
    	
    	mContent.add( headings );
    	mContent.add( values );*/
    }
    
    public void updateContent(List<List<String>> content)
    {
    	mContent.clear();
    	
    	mContent = content;
    }

    public String getColumnName(int col) {
        return mContent.get( 0 ).get( col );
    }

    public int getColumnCount() {
        if( mContent.size() == 0 )
        	return 0;
        return mContent.get( 0 ).size();
    }

    public int getRowCount() {
   		return mContent.size() - 1;
    }

    public Object getValueAt(int row, int col) {
    	return mContent.get( row + 1 ).get( col );
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    private List<List<String>> mContent = new ArrayList<List<String>>();
}
