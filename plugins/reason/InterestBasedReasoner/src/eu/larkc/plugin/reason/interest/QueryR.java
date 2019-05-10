package eu.larkc.plugin.reason.interest;

import java.io.*;
import java.util.*;
import java.util.regex.*;

import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.util.*;

public class QueryR {

	Query query;
	
	public QueryR(){		
	}
	
	public QueryR(String qs){		
		query = QueryFactory.create(qs);
	}

	public QueryR(Query q){
		query =q;
	}
	
	
	/** 20091124
	 * @param uis : user interests
	 * @param IRP : Interests Related Property/Predicate
	 * @return a query refined with user interests info , or original query
	 */
	public Query refine(UserInterests uis,String IRP) {
			
			if(query.isSelectType()){
//				get the result variables 
				List<String> rv=query.getResultVars();
				
//				IRPV: the variable binding of IRP	
				String irpv= getIrpVar(IRP);

//				if IRPV is a result variable
				if(rv.contains(irpv)){
//					get the search pattern string corresponding to IRP
					String irpSearchStr=getVarRegex(irpv);	
//					generate a FILTER clause for refinement with User Interest Refinement
					String nsp=genNewRegex(irpSearchStr,uis);
					String sfc=genNewFilterClause("?"+irpv,nsp);
		
//					if the search pattern string has not been refined(includes all interest items)
					if(!includeInterests(irpSearchStr,uis)){
						String ofc=getTargetFilter(irpv);
						String nq=null;
						if(ofc!=null){
//							replace old Filter with generated FILTER 
							nq=query.toString().replace(ofc, sfc);
						}else{
//							add generated FILTER clause to original query for refinement
							nq=addFilterClause(irpv,sfc);
							
						}

//						if nq is not null,create a new query and return it	
						if(nq!=null){
//							System.out.println(nq);
							return  QueryFactory.create(nq);
						}
					}
				}
			}	
//			if needn't refine, return original query
			return  query;			
	}


	/** 20091124
	 * get the variable corresponding to IRP(INTERESTS REFINEMENT PROPERTY)
	 * @param IRP : Interests Related Property/Predicate
	 * @return the variable binding of IRP(INTERESTS REFINEMENT PROPERTY)
	 */
	public String getIrpVar(String IRP){
//		get the query pattern, in which URIs are expressed as complete format(not short by prefix), then easy to extract IRPV
		com.hp.hpl.jena.sparql.syntax.Element e1=query.getQueryPattern();
		
		Pattern p=Pattern.compile(IRP+"\\s*\\?(\\w*)\\s");
		Matcher m=p.matcher(e1.toString());
		if(m.find()){			
			return m.group(1);
		}
		return null;
	}
	
	
//	/** 20091117
//	 * generate a FILTER clause for refinement with User Interest Refinement
//	 * @param IRPV : the variable binding of IRP
//	 * @param uis : user interests
//	 * @return a FILTER clause like 'FILTER regex(?title,"interests1|interests2|interests3","i")'
//	 */
//	private String genUIRFilterClause(String IRPV,UserInterests uis){
//		if (IRPV != null) {
//			String uis_expr = "";
//			int n=uis.interests.size();
//			for (int i = 0; i < n; i++) {
//				uis_expr = uis_expr + uis.interests.get(i);
//				if (i < n - 1)
//					uis_expr += "|";
//			}
//			String fc = " FILTER regex(" + IRPV + ",\"" + uis_expr
//					+ "\",\"i\") ";
//			return fc;
//		}
//		return null;		
//	}
	
	/** 20091126
	 * @param var : a variable name
	 * @return the search pattern string corresponding to var
	 */
	public String getVarRegex(String var){
		String filIRP="FILTER\\s*regex.*"+var+"\\s*,\\s*\"([^,]*)\"";
		
		Pattern p=Pattern.compile(filIRP);
		Matcher m=p.matcher(query.toString());
		if(m.find()){	
			return m.group(1);
		}
		return null;
	}

	private String genNewRegex(String searchStr, UserInterests uis){
		int n=uis.interests.size();
		if (searchStr != null && n>0) {
			String uis_expr = "";
	
			for (int i = 0; i < n; i++) {
				uis_expr = uis_expr + uis.interests.get(i);
				if (i < n - 1)
					uis_expr += "|";
			}
			String newRegex=searchStr+".*"+"("+uis_expr+")|("+uis_expr+").*"+searchStr;			
			return newRegex;
		}		
		return null;
	}

	/** 20091210
	 * generate a FILTER clause for refinement with User Interest Refinement
	 * @param IRPV : the variable binding of IRP
	 * @param uis : user interests
	 * @return a FILTER clause like 'FILTER regex(?title,"interests1|interests2|interests3","i")'
	 */
	private String genNewFilterClause(String IRPV,String newSearchPattern){
		if (IRPV != null) {
			String fc = " FILTER regex(" + IRPV + ",\"" + newSearchPattern
					+ "\",\"i\") ";
			return fc;
		}
		return null;		
	}
	
	/** 20091126
	 * @param searchString
	 * @param uis
	 * @return true if the search String includes all interest items; otherwise, false.
	 */
	private boolean includeInterests(String searchString, UserInterests uis){
		int n=uis.interests.size();
		for(int i=0;i<n;i++){
			Pattern pi=Pattern.compile(uis.interests.get(i),Pattern.CASE_INSENSITIVE);
			Matcher m=pi.matcher(searchString);
			
			if(!m.find()){
				return false;
			}
		}
		return true;
	}	

	
	/** 20091126
	 * add generated FILTER clause to original query string for refinement
	 * @param fc
	 * @return the refined query
	 * note: the position of the additional clause need further consideration
	 */ 
	private String addFilterClause(String irpv,String fc){
		String sq=query.toString();
		Pattern pf=Pattern.compile("\\?"+irpv+".*?\\.\\s",Pattern.CASE_INSENSITIVE);
		Matcher m=pf.matcher(sq);
		
		if(m.find()){
			int n=m.end();
			
			String s1=sq.substring(0,n);
			String s2=sq.substring(n);
			return s1+"    "+fc+s2;			
		}		
		return null;		
	}

	/** 20091210
	 * get the FILTER need to be rewrite
	 * @return the string of FILTER need to be rewrite
	 */
	private String getTargetFilter(String irpv){
		String sq=query.toString();
		Pattern pf=Pattern.compile("FILTER +?regex *?\\( *?\\?"+irpv+".*?\\)",Pattern.CASE_INSENSITIVE);
		Matcher m=pf.matcher(sq);
		
		if(m.find()){
			return m.group();			
		}		
		return null;		
	}
	
}
