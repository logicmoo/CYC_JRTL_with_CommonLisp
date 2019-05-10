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

import java.util.ArrayList;
import java.util.List;
import org.openrdf.model.Value;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;


/**
 * Default variable binding implementation. 
 * It creates new arrays out of input parameters.
 * 
 * @author Luka Bradesko
 */
public class VariableBindingImpl implements VariableBinding
{
	/**
	 * Default serial version
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<String> variables=new ArrayList<String>();
	ArrayList<Binding> bindings = new ArrayList<Binding>();
	
	public VariableBindingImpl(List<Binding> values, List<String> variableNames)
	{
		for (String string : variableNames) {
			variables.add(string);
		}

		bindings = new ArrayList<Binding>();
		for (Binding bind : values) {
			bindings.add(bind);
		}
	}
	
	 @Override
	public List<String> getVariables() { return variables; }
	 @Override
	public CloseableIterator<Binding> iterator() { return new SimpleCloseableIterator<Binding>( bindings.iterator()); }
	
	public static class BindingRow implements VariableBinding.Binding 
	{
		ArrayList<Value> values;
		
		public BindingRow(Value... values_) 
		{ 
			values = new ArrayList<Value>();
			for (Value value : values_) values.add(value); 
		}
		
		public BindingRow() 
		{ 
			values = new ArrayList<Value>(); 
		}
		
		public void addValue(Value v){
			values.add(v);
		}
	
		@Override
		public List<Value> getValues() {
			return values;
		}
	}
}