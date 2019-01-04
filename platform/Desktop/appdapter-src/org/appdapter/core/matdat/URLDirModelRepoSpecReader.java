package org.appdapter.core.matdat;

import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3A!\tIRK'ESJluZ3m%xn9fGJ+\rZ3s\tA!nCR$\r\tAaY8sK*qC\nCBH-9uKJT!C_J<7A\n1\"!\b\tI!a+%s7^1mYG.Z*qKV-3fe\")C%1A(8jiz\"a\tAQ!BY\taaZ3ub$H#A\faiR\"A\riY7b]THU4-3\t11:j]DQ\tB\nA\"\\1lKJ+o\\*qK$BAI1kAQbII\t1#*M\t&Xj3fYJ+o\\*qKDQAJA\nA]1uQBF\f\bS1jAW)1oY1mC&QFK!J,G-4\nyy#BA+\tt13\t'oZ:%t%5U\t)I:bs\")ag\bao1\rT:aZT(D:\tQ4$vi&dB:an;aqBA -E.Y:t>\fG-:")
public class URLDirModelRepoSpecReader extends InstallableSpecReader
{
    public String getExt() {
        return "dir";
    }
    
    public URLDirModelRepoSpec makeRepoSpec(final String path, final String[] args, final List<ClassLoader> cLs) {
        return new URLDirModelRepoSpec(path, (List)cLs);
    }
}

/*

	Total time: 8 ms
	
*/