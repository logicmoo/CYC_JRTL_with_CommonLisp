package eu.larkc.plugin.reason.urbancomputing.ubl.support;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;

//import com.hp.hpl.jena.query.QuerySolution;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.VariableBinding;
//import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;
//import eu.larkc.plugin.reason.urbanCity.RdfTest.PathVariableBinding.PathBinding;

/**
 * @author: Luka Bradesko, Daniele Dell'Aglio
 * 
 */

class PathVariableBinding implements VariableBinding
	{
		ArrayList<String> variables;
		ArrayList<Binding> bindings;
		
		public PathVariableBinding(List<NamedWeightedEdge> lst, double weight)
		{
//			final String xsd = "http://www.w3.org/2001/XMLSchema#";
			variables = new ArrayList<String>();
			variables.add("p");
			variables.add("w");
			variables.add("n1");
			variables.add("l");
			variables.add("n2");
			bindings = new ArrayList<Binding>();
			
			if(!Double.isInfinite(weight)){
				Iterator<NamedWeightedEdge> it = lst.iterator();
				while(it.hasNext()){
					NamedWeightedEdge qs = it.next();
					bindings.add(new PathBinding(
					    new URIImpl("_:p1"), //new MyRdfIri((qs.get("?p")).toString()),
					   	ValueFactoryImpl.getInstance().createLiteral(weight),//,new URIImpl( xsd + "double")), //MyRdfLiteral.createTyped((qs.get("?w")).toString(), xsd + "double"),
						new URIImpl((qs.getFrom()).toString()),
						new URIImpl((qs.getLabel()).toString()),
						new URIImpl((qs.getTo()).toString())
					));
				}
			}
		}
		
		 public List<String> getVariables() { return variables; }
		 public CloseableIterator<Binding> iterator() { return new SimpleCloseableIterator<Binding>( bindings.iterator()); }
		
		static class PathBinding implements VariableBinding.Binding 
		{
			ArrayList<Value> values;
			
			PathBinding(Value... values_) 
			{ 
				values = new ArrayList<Value>();
				for (Value value : values_) values.add(value); 
			}
		
			public List<Value> getValues() {
				return values;
			}
		}
	}
