package org.appdapter.help.repo;

import scala.collection.mutable.Buffer;
import scala.collection.JavaConversions$;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.Query;
import org.appdapter.impl.store.FancyRepo;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3A!\tQ!+9pd/:\r!:fa>T!!\t!,G!\t\"9qIH/:%\t1a:h\"5R\"\b=\tQa]2bYL!!\b\rsPU3g\"aN\\5u}Q\tQ5\t!C\tIA\r\t5L8S5AacG9\tabU8mkRLwN%fYB,'IAG[f\n\tA!\t!IM&tGmU8mkRLwN\\:BgN{G.;j_:dn;\t\t*sf\t-\rJ!\nM{G.;j_:dn;\tzA\bC.I#B,Ho:f\tac!j[BdB*%1M\\2z%xC1?'AqCJX\rZ)IjT\"AQ*!B9vKJL(B8QWM\\1aJa5qY*!hOQBTPG>lB 4\tV/:zu1B1\tJ\\5u&tG-8h!\t$)Dg\ti+^3ssN{G.;j_:")
public class RepoHelper
{
    private final SolutionHelper mySH;
    
    public SolutionHelper mySH() {
        return this.mySH;
    }
    
    public SolutionList findSolutionsAsSolutionList(final FancyRepo fr, final Query parsedQ, final QuerySolution qInitBinding) {
        final Buffer natSL = JavaConversions$.MODULE$.asScalaBuffer(fr.findAllSolutions(parsedQ, qInitBinding));
        return this.mySH().makeSolutionList(JavaConversions$.MODULE$.bufferAsJavaList(natSL));
    }
    
    public RepoHelper() {
        this.mySH = new SolutionHelper();
    }
}

/*

	Total time: 7 ms
	
*/