package org.appdapter.core.matdat;

import org.appdapter.core.store.Repo;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "52Q!-ACU3q_NXm$peK'/Z2u_JL(BAi\r3bi*QABG>XM\bI\r9eCB$XMqN]4M\t9iAA\tBU3q_NXm#!\tAEy%t M\"!\tUA\t\f5\f7.*fa>$a\taI!!MCW-;SKB|\"B\ra!E4fiK'/Z2u_JLXj3fYR\tQW5\tqD!C)Qn3fY*!eIe4'B&QWM\\1:a5qY*&KQBTAKG>lB iuZ3m")
public abstract class RepoSpecForDirectory extends RepoSpec
{
    public SheetRepo makeRepo() {
        return (SheetRepo)FancyRepoLoader$.MODULE$.makeRepoWithDirectory((RepoSpec)this, this.getDirectoryModel(), (List)null, FancyRepoLoader$.MODULE$.makeRepoWithDirectory$default$4());
    }
    
    public abstract Model getDirectoryModel();
}

/*

	Total time: 6 ms
	
*/