package org.appdapter.core.matdat;

import java.util.Map;
import org.appdapter.help.repo.Solution;
import scala.collection.mutable.HashMap;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\t;Q!\t-\t!S3maJ+o\\#yit7/[8og*1B[$H-;1B2peT!a\bZ1qi(\"A=xm1iQ\"9A\b%!+G*fa>,^3og&|gn]\nA\"!IQaEg\fG.Y+Ia!8z%4\"B\f\tAAj]&$h\bF\fQR\"AwN<feR$vNS1wC6/OQQ\t=\r*'D \t%vi&d'\"\t)\fg/YI}1!T1q!\t1s!J\"AQ\"AKEYBqu5j]\"!\n=\"aA!osBGNe)1NexN6\r!.7q\t9$GT_2,H/[8oI1;!8-7b\bBAKAj{y\nq!\\;uC\ndWM@%Q1m7mK$n8\nc$a%bg\"l\r")
public final class HelpRepoExtensions
{
    public static <T> Map<T, Solution> convertToJavaMap(final HashMap<T, Solution> scalaMap) {
        return HelpRepoExtensions$.MODULE$.convertToJavaMap(scalaMap);
    }
}

/*

	Total time: 19 ms
	
*/