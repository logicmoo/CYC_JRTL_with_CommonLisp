package org.appdapter.core.matdat;

import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3A!\ti2kY1o+JcE):N_,GNU3q_NXm*fC,'O\t1Q.;eCRT!!\t\r|'/!\t\"9qIH/:%\t1a:h\"5qQ\"\n=!!F%ogR\fG\\1cY/Z2SK$WM#!\tAEy%t M\"!\tUA\t\f\r,G/=u)9C\rI\"BaM\\4q\tAA[1wC&a$'RN\\4\tAI5\f7.*fa>/Z2\t\t*'\t\rJ!\n/MM\\+SK'/T8eK2V\r]8Ta\" 99bi\"\"%bS\"-\nQa]2bYL!!\f\rAX\rZ3g\tqrF.U!)g\bae!M]4t!\rI3gJi)Q!:sCfDQANA]\n1a't!\rA4(Ps)!hGkRLG.=s\t!A*[:u!\tAb(@3\tY1\t\\1tg2{\rZ3s")
public class ScanURLDirModelRepoSpecReader extends InstallableSpecReader
{
    @Override
	public String getExt() {
        return "scandir";
    }
    
    @Override
	public ScanURLDirModelRepoSpec makeRepoSpec(final String path, final String[] args, final List<ClassLoader> cLs) {
        return new ScanURLDirModelRepoSpec(path, (List)cLs);
    }
}

/*

	Total time: 9 ms
	
*/