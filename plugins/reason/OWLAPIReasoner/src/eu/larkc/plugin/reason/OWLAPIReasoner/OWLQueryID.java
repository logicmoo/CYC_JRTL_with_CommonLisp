package eu.larkc.plugin.reason.OWLAPIReasoner;

	
import com.hp.hpl.jena.graph.Triple;


	public class OWLQueryID {
		
		public static String ID;
		public static String currentVar;
		public static String currentLiteral;
		
		public OWLQueryID(String id){
			this.ID = id;
		}
		
	     public static Triple getTripleFromQueryID(){
			
//			System.out.println("String ID="+ID);
			Triple answer = null;
			int l = ID.length();
			String s = ID.substring(4,l-1);
			int i = s.indexOf(" ");
			
			if (i>0)
			{
			String subject = s.substring(0,i);
			s = s.substring(i+1);
			i = s.indexOf(" ");
			String predicate = s.substring(0,i);
			String object = s.substring(i+1);
			
			com.hp.hpl.jena.graph.Node snode;
			com.hp.hpl.jena.graph.Node onode;
			if (subject.startsWith("?")) {
				snode = com.hp.hpl.jena.graph.Node.createVariable(subject.substring(1));
				currentVar= subject;
			}
			else{
				snode = com.hp.hpl.jena.graph.Node.createLiteral(subject);
				currentLiteral = subject;
			}
			
			com.hp.hpl.jena.graph.Node pnode = com.hp.hpl.jena.graph.Node.createURI(predicate);		
			if (object.startsWith("?")) {
				onode = com.hp.hpl.jena.graph.Node.createVariable(object.substring(1));
				currentVar= object;
			}
			else{
				onode = com.hp.hpl.jena.graph.Node.createLiteral(object);
				currentLiteral = object;
			};
			
			answer = Triple.create(snode, pnode, onode);
			};
			
			return answer;
		}

	}


