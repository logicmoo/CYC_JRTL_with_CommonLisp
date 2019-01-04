package org.appdapter.core.matdat;

import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "y2Q!-Q#8tidG.2mKNXm*fC,'O\t1Q.;eCRT!!\t\r|'/!\t\"9qIH/:%\t1a:h\"5R\"\b=\tQa]2bYL!!\b\rsPU3g\"aN\\5u}Q\tQ5\t!C$hKR,5A1D\b\bqI!!\b\b\rAX\rZ3g\tyETiJLgn;9AQA\t\r\nA\"\\1lKJ+o\\*qK$BJ*]Aa#JM\tBU3q_NXmQ\rAGa$\bC+C1&be\bcA-5%QFJ-_\rMG2\bcA7q5\t!G4i!Q^5m)6bmL!a\t1K7\tsqjAwQ\nA\\1oO&QH\f2\f7o'pC,'")
public abstract class InstallableSpecReader
{
    public abstract String getExt();
    
    public abstract RepoSpec makeRepoSpec(final String p0, final String[] p1, final List<ClassLoader> p2);
}

/*

	Total time: 9 ms
	
*/