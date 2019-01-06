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
	
	 public List<String> getVariables() { return variables; }
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
	
		public List<Value> getValues() {
			return values;
		}
	}
}