package org.appdapter.core.matdat;

import org.appdapter.help.repo.RepoClientImpl;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.store.Repo;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "m3Q!-BU3q_NXm\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sO1C\r!\ti#Dy!B:dC2\fBA\t\te.*fM\")1C)1A(8jiz\"!\t-iA11\t!G\t[\\WMU3q_R\t!C9AdH;)aBgR|'/ZAu\tAAU3q_&!e\t/&$\bR5sK$xN]=j\"B\t1!E4fiK'/Z2u_JLXj3fYR\tq)k5\tF+W)Qn3fY*A&Le4'B0QWM\\1A\na5qY*!gMQBTNG>lB*iuZ3mA\":9im[3SKB|7\t\\5f]R$2A\"D!\tY)D=\tid(sKB|'BA AW\r9\nc$A*fa>E.[3oi&k{]\rA\t^\r!RO$HI7u#JL8K]2He\b.(b[\"AR%59B%&/3fM&!j'RN\\4!s\"\tiECOiD\n1!\"Q+\tC*X&B+VaM\\4YAA[1wC&!j3!\tAWO$HI7u)$xI]1qQNM]9m-h*Y7f+)")
public abstract class RepoSpec
{
    public abstract Repo.WithDirectory makeRepo();
    
    public Model getDirectoryModel() {
        return this.makeRepo().getDirectoryModel();
    }
    
    public RepoClientImpl makeRepoClient(final Repo.WithDirectory repo, final String getDfltQrySrcGraphQName) {
        return new RepoClientImpl(repo, this.getDfltTgtGraphSparqlVarName(), getDfltQrySrcGraphQName);
    }
    
    public RepoClientImpl makeRepoClient(final Repo.WithDirectory repo) {
        return new RepoClientImpl(repo, this.getDfltTgtGraphSparqlVarName(), this.getDfltQrySrcGraphQName());
    }
    
    public String getDfltQrySrcGraphQName() {
        return RepoSpecDefaultNames$.MODULE$.DFLT_QRY_SRC_GRAPH_TYPE();
    }
    
    public String getDfltTgtGraphSparqlVarName() {
        return RepoSpecDefaultNames$.MODULE$.DFLT_TGT_GRAPH_SPARQL_VAR();
    }
}

/*

	Total time: 8 ms
	
*/