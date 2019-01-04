package org.appdapter.core.matdat;

import scala.collection.mutable.StringBuilder;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.store.Repo;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3A!\t2+[7qY&HOU3q_NXm\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sO1C\r!\tia\"D\ty!ASKB|7]3d!\tA!b\nAA<e+C\t)$D\t9B!Ati>X--!!+9p\tYBDAXSRDG):fGR|'/3YAB\bIaEo\"\t\tAj]&$h\b#GAQ#}\raK!\tEJO$H):fGR|'/_'pIdG#A!*T\"A)Z!B7pId'B.\rHM]=\nAA[3oC*'MQBd'B4\tAOC5\rw.\\m%Q!T8eK2DQBe\n\"\\1lKJ+o'!)1\bC!yAAo\\*ue&tw\rF>!\tqDI@6\tICB8-7b\t)Qe$WMZaa;sS:<'BA\"A")
public class SimplistRepoSpec extends RepoSpec
{
    private final Repo.WithDirectory wd;
    
    public Repo.WithDirectory wd() {
        return this.wd;
    }
    
    public Model getDirectoryModel() {
        return this.wd().getDirectoryModel();
    }
    
    public Repo.WithDirectory makeRepo() {
        return this.wd();
    }
    
    public String toString() {
        return new StringBuilder().append((Object)"SimplestSpec[").append((Object)this.wd()).append((Object)"]").toString();
    }
    
    public SimplistRepoSpec(final Repo.WithDirectory wd) {
        this.wd = wd;
    }
}

/*

	Total time: 8 ms
	
*/