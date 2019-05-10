package eu.larkc.plugin.reason.sparqldlreasoner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.mindswap.pellet.jena.PelletReasonerFactory;
import org.openrdf.model.Literal;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.BNodeImpl;
import org.openrdf.model.impl.LiteralImpl;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;

import com.clarkparsia.pellet.sparqldl.jena.SparqlDLExecutionFactory;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.StmtIterator;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.RdfGraphInMemory;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;


public abstract class SPARQLDLReasoner implements Reasoner {

	@Override
	public Context createContext() {
		return null;
	}


		@Override
		public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
				SetOfStatements statements, Contract ctr, Context cxt) {
			Model m = getModel(statements);
			com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery
					.toString());

			// Create a SPARQL-DL query execution for the given query and
			// ontology model
			QueryExecution qe = SparqlDLExecutionFactory.create(query, m);

			// We want to execute an ASK query, do it, and return a Boolean value
			Boolean result = qe.execAsk();

			return new BooleanInformationSetImpl(result);

		}

		@Override
		public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
				SetOfStatements statements, Contract contract, Context context) {
			Model m = getModel(statements);
			com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery
					.toString());

			// Create a SPARQL-DL query execution for the given query and
			// ontology model
			QueryExecution qe = SparqlDLExecutionFactory.create(query, m);

			// We want to execute a construction query, do it, and return a model
			Model result = qe.execConstruct();
			URI target = new URIImpl("http://example.org#ts1");
			return resultFromJenaModel(target, result);
		}

		@Override
		public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
				SetOfStatements statements, Contract contract, Context context) {
			Model m = getModel(statements);
			com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery
					.toString());

			// Create a SPARQL-DL query execution for the given query and
			// ontology model
			QueryExecution qe = SparqlDLExecutionFactory.create(query, m);

			// We want to execute a construction query, do it, and return a model
			Model result = qe.execDescribe();
			URI target = new URIImpl("http://example.org#ts1");
			return resultFromJenaModel(target, result);
		}

		@Override
		public VariableBinding sparqlSelect(SPARQLQuery theQuery,
				SetOfStatements statements, Contract contract, Context cntx) {
			Model m = getModel(statements);
			com.hp.hpl.jena.query.Query query = QueryFactory.create(theQuery
					.toString());

			// Create a SPARQL-DL query execution for the given query and
			// ontology model
			QueryExecution qe = SparqlDLExecutionFactory.create(query, m);

			// We want to execute a SELECT query, do it, and return the result set
			ResultSet rs = qe.execSelect();

			return convertJenaQueryResult(rs);
		}

		@Override
		public URI getIdentifier() {
			return new URIImpl(
					"http://eu.larkc.plugin.reason.pellet.PelletSPARQLDLReasoner");
		}

		public MetaData getMetaData() {
			throw new UnsupportedOperationException();
		}

		@Override
		public QoSInformation getQoSInformation() {
			throw new UnsupportedOperationException();
		}

		private SetOfStatements resultFromJenaModel(URI target, Model result) {
			final StmtIterator modelData = result.listStatements();
			return new RdfGraphInMemory(target, new Iterable<Statement>() {

				public Iterator<Statement> iterator() {
					return new Iterator<Statement>() {

						public boolean hasNext() {
							return modelData.hasNext();
						}

						public Statement next() {
							if (hasNext() == false) {
								throw new NoSuchElementException();
							}
							com.hp.hpl.jena.rdf.model.Statement st = modelData
									.nextStatement();

							return new StatementImpl((Resource) convert(st
									.getSubject()),
									(URI) convert(st.getPredicate()), convert(st
											.getObject()));
						}

						public void remove() {
						}
					};
				}
			});
		}

		/**
		 * converts Jena RDF nodes to Sesame ones
		 * 
		 * @param jena
		 *            RDF value
		 * @return corresponding Sesame instance
		 */
		private Value convert(RDFNode value) {
			if (value instanceof com.hp.hpl.jena.rdf.model.Literal) {
				return new LiteralImpl(value.toString());
			} else if (value instanceof com.hp.hpl.jena.rdf.model.Resource) {
				String str = ((com.hp.hpl.jena.rdf.model.Resource) value).getURI();
				if (str != null)
					return new URIImpl(str);
				else {
					str = ((com.hp.hpl.jena.rdf.model.Resource) value).getId()
							.getLabelString();
					return new BNodeImpl(str);
				}
			} else {
				String str = ((com.hp.hpl.jena.rdf.model.Property) value).getURI();
				return new URIImpl(str);
			}
		}

		private Model getModel(SetOfStatements statements) {
			OntModel m = ModelFactory
					.createOntologyModel(PelletReasonerFactory.THE_SPEC);
			Model model = ModelFactory.createDefaultModel();
			CloseableIterator<Statement> iter = statements.getStatements();

			while (iter.hasNext()) {
				Statement s = iter.next();
				com.hp.hpl.jena.rdf.model.Resource r = model.createResource(s
						.getSubject().stringValue());
				Property p = model.createProperty(s.getPredicate().stringValue());
				RDFNode n = null;
				if (s.getObject() instanceof Resource) {
					n = model.createResource(s.getObject().stringValue());
				} else if (s.getObject() instanceof Literal) {
					n = model.createLiteral(s.getObject().stringValue());
				}
				com.hp.hpl.jena.rdf.model.Statement js = model.createStatement(r,
						p, n);
				model.add(js);
			}
			m.add(model);
			return m;
		}

		private VariableBinding convertJenaQueryResult(final ResultSet rs) {
			return new VariableBinding() {

				private static final long serialVersionUID = 1;

				@SuppressWarnings("unchecked")
				public List<String> getVariables() {
					List list = rs.getResultVars();
					return list;
				}

				@SuppressWarnings("unchecked")
				public CloseableIterator<Binding> iterator() {
					
					List<Binding> newResult = new ArrayList<Binding>();
					
					Binding currentBindings = null;
					if (rs.hasNext()) {
						final QuerySolution solution = rs.nextSolution();
						final List<Value> result = new ArrayList<Value>();
						Iterator names = solution.varNames();
						while (names.hasNext()) {
							String current = (String) names.next();
							result.add(convert(solution.get(current)));
						}
						currentBindings = new Binding() {
							public List<Value> getValues() {
//								System.out.println("return the result "+ result);
								return result;
							}
						};
						
						newResult.add(currentBindings);
					}
					return new WrappedIterator(newResult);
				}
			};
		}

	public class WrappedIterator implements CloseableIterator<Binding> {
			
			List<Binding> res;
			Iterator<Binding> iter;

			public WrappedIterator(List<Binding> currentBindings) {
				res = currentBindings;
				iter = res.iterator();
			}

			public void close() {
			}

			public boolean hasNext() {
				return iter.hasNext();
			}

			public boolean isClosed() {
				return false;
			}

			public Binding next() {
				try {
					return iter.next();
				} finally {
					res = null;
				}
			}

			public void remove() {
			}
		}

}
