package org.appdapter.core.matdat;

import java.util.Map;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "!3A!\tRK'ESJluZ3m%xn9fG*1B[$H-;1B2peT!a\bZ1qi(\"A=xmaCABA\bQV\r]8Tagi:ESJ,7\r^8ss\"ABB%!#AeSJluZ3m+JcCA\n\t!r#D1!B:dC2\fB\r&/3fM&!d'RN\\4a)CLG.Z'pId7\tT:}!c%D!\t\t#%vi&d'\"A\t)\fg/YKAT5tiBqEKQ)FIYtw-,Q\tY1\t\\1tg2{\rZ3si\"/aN\\5u}QqM5\"B\t-\"B-q\"B\t\"!E4fiK'/Z2u_JLXj3fYR\tQ76\tqG9s)Qn3fY*!hOe4'B>QWM\\1yza5qY*)QQBTAQG>lB#8iuZ3m1\"H!!xn;sS:<G#\n")
public class URLDirModelRepoSpec extends RepoSpecForDirectory
{
    private final String dirModelURL;
    private final List<ClassLoader> fileModelCLs;
    
    @Override
	public Model getDirectoryModel() {
        return FancyRepoLoader.readDirectoryModelFromURL(this.dirModelURL, (Map)null, (List)this.fileModelCLs);
    }
    
    @Override
	public String toString() {
        return this.dirModelURL;
    }
    
    public URLDirModelRepoSpec(final String dirModelURL, final List<ClassLoader> fileModelCLs) {
        this.dirModelURL = dirModelURL;
        this.fileModelCLs = fileModelCLs;
    }
}

/*

	Total time: 17 ms
	
*/