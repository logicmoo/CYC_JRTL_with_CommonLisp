package org.appdapter.core.matdat;

import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3A!\t1RK'N_,GNU3q_NXm*fC,'O\t1Q.;eCRT!!\t\r|'/!\t\"9qIH/:%\t1a:h\"5qQ\"\n=!!F%ogR\fG\\1cY/Z2SK$WM#!\tAEy%t M\"!\tUA\t\f\r,G/=u)9C\rI\"BaM\\4q\tAA[1wC&a$'RN\\4\tAI5\f7.*fa>/Z2\t\t*'\t\rJ!\n'UF\nR5s>$W\r*fa>/Z2\tzA\tA\fG\tQ9r!!)RaKg\fG.Y[)\na:fI4B0\ti#C2?!'be\bcA4O%AGJ-m}\raNG2\bc<{5\tH;7!Q^5m\taHMSN$\bC\r?\tyDADY8T8bI\b")
public class URLModelRepoSpecReader extends InstallableSpecReader
{
    @Override
	public String getExt() {
        return "ttl";
    }
    
    @Override
	public URLDirModelRepoSpec makeRepoSpec(final String path, final String[] args, final List<ClassLoader> cLs) {
        return new URLDirModelRepoSpec(path, (List)cLs);
    }
}

/*

	Total time: 8 ms
	
*/