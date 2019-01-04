package org.appdapter.help.repo;

import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.query.QuerySolutionMap;
import org.appdapter.core.store.ModelClient;
import scala.reflect.ScalaSignature;
import org.appdapter.core.store.InitialBinding;

@ScalaSignature(bytes = "i4A!\tJ\\5uSd')8eS:<*9m\tA!sKB|'BAAW\r9A!C1qa\f^3sIaA8sO1c\r)AQBE)qEYtwMCQM^1\nMq!AB(cUG55\taC1)1^8sK*DBG>X--\tqJ\\5uSd')8eS:<CI5LXj3fYc.8u+yCA!\t\tcCAN_,Gn7jK:$\bCB5LXj3fYc.8uA!)QCM1A(8jiz\"\"aJ!Q\"\tu!A\t-!!CYiQ._*pYV$n8NCB,!\f\t]eja\faE\nQ!];fefT!AM\t),g.iU\n19m\t1t'ia*\t(Ad_6L!AO!E+XM]=T_2,H/[8o\bBA%Q&\bnsN{G.;j_:l\r\tyAA ,G/U*NCB$!\f!\tAQ\tE&tGMT8eKR1)*;U\"A#Qa]2bYL!S#\tUs\raSm:W.\t>s!R'\n9+A)sK,g-Q#\n11:j]T!AT#\tM+\t9|G-\t+jkA/bQ!\\8eK2T!!WI$g-\\-\n9!$O_,\"B/\tq!2j]\ff*Y7f)\ru\fr\raCr\raS\teKT1nK\")1\rCI9!-8e+JKEcA\"fM\")!Ja\")qMa1!/Z:V%&CQ!)\fBY5oI&#WM;\r[GCKQ1\nCnQa.jIBqN]a*G]lW-ta\n)\nZ3oi\")QCm\t\"-8e&$XM]1m'RN\\4\r;\bCKi1\nCzi1*AmSRFO]5oO")
public class InitialBindingImpl implements InitialBinding
{
    private final ModelClient myModelClient;
    private final QuerySolutionMap mySolutionMap;
    
    private ModelClient myModelClient() {
        return this.myModelClient;
    }
    
    private QuerySolutionMap mySolutionMap() {
        return this.mySolutionMap;
    }
    
    public QuerySolutionMap getQSMap() {
        return this.mySolutionMap();
    }
    
    public void bindNode(final String vName, final RDFNode node) {
        this.mySolutionMap().add(vName, node);
    }
    
    public void bindQName(final String vName, final String resQName) {
        this.bindNode(vName, (RDFNode)this.myModelClient().makeResourceForQName(resQName));
    }
    
    public void bindURI(final String vName, final String resURI) {
        this.bindNode(vName, (RDFNode)this.myModelClient().makeResourceForURI(resURI));
    }
    
    public void bindIdent(final String vName, final Ident id) {
        this.bindNode(vName, (RDFNode)this.myModelClient().makeResourceForIdent(id));
    }
    
    public void bindLiteralString(final String vName, final String litString) {
        this.bindNode(vName, (RDFNode)this.myModelClient().makeStringLiteral(litString));
    }
    
    public InitialBindingImpl(final ModelClient myModelClient) {
        this.myModelClient = myModelClient;
        this.mySolutionMap = new QuerySolutionMap();
    }
}

/*

	Total time: 10 ms
	
*/