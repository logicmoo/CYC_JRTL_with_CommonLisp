package org.appdapter.core.matdat;

import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3A!\tQ2kY1o+JcUj3fYJ+o\\*qKV-3fe*1B[$H-;1B2peT!a\bZ1qi(\"A=xmaCABA\bUIen;bY2\f'\r\\3Ta'+Z1eKJDQ!I\taP5oSRtD#A\n5\"B\t2AB4fiCHF!\tAR$D\tQ2$mC:<'\"\t)\fg/Y=eaa;sS:<\"\t\nD7bWV\r]8TaG&aU\"!D\n!aF*dC:,&#je6{G-7SKB|7]3d1s1(\r5!rcBA-Q#\"AM\r\\1\n5RA)sK,g-_)QFc}\rAMCJ<7E*gJ!(/Y=\tYzA\rd5E9wuj!um\tA!;jY&A(&H}%q(\f2\f7o'pC,'")
public class ScanURLModelRepoSpecReader extends InstallableSpecReader
{
    @Override
	public String getExt() {
        return "scanttl";
    }
    
    @Override
	public ScanURLDirModelRepoSpec makeRepoSpec(final String path, final String[] args, final List<ClassLoader> cLs) {
        return new ScanURLDirModelRepoSpec(path, (List)cLs);
    }
}

/*

	Total time: 9 ms
	
*/