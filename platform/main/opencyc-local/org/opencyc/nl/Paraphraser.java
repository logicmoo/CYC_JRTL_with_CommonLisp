package org.opencyc.nl;

import java.util.List;

public interface Paraphraser<E>
{
    Paraphrase<? extends E> paraphrase(final E p0);
    
    List<? extends Paraphrase<E>> paraphraseWithDisambiguation(final List<E> p0);
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 4 ms
	
	Decompiled with Procyon 0.5.32.
*/