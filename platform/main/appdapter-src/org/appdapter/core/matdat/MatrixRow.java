package org.appdapter.core.matdat;

import scala.Option;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "A2q!1BANCR*po*1B[$H-;1B2peT!a\bZ1qi(\"A=xmaCAq!\"A\bM\r\\1\nEq!AB!osJ+g\rCA#%S:LG\n+AQBF/9A!8ji\")D5ar-;Q_NN7f>dW/8WC2,Xm;sS:<GCA&!\riADH;9aa9uS>tCA#\ti%\"1K]3eKL!a\t\rM#(/8h\t\tcC'1q%d_2LE\r\t!J!!\b%sGC,A&\fhKRvn]:jE2,7i7v[:u.8u)9\"\ty3v[B$A\b")
public interface MatrixRow
{
    Option<String> getPossibleColumnValueString(final int p0);
    
    int getPossibleColumnCount();
    
    String dump();
}

/*

	Total time: 6 ms
	
*/