package org.appdapter.registry.basic;

import org.appdapter.api.registry.Finder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.appdapter.api.registry.ResultSequence;
import org.appdapter.api.registry.Receiver;
import org.appdapter.api.registry.Pattern;
import org.appdapter.api.registry.SimpleFinder;

public class BasicFinder<OT> implements SimpleFinder<OT>
{
    private BasicRegistry myBasicRegistry;
    private Class<OT> myObjClz;

    public BasicFinder(final BasicRegistry br, final Class<OT> otClz) {
        this.myBasicRegistry = br;
        this.myObjClz = otClz;
    }

    protected ResultSequence<OT> makeResultSequence(final Pattern p, final Receiver<OT> r) {
        final ResultSequence<OT> rseq = (ResultSequence<OT>)new ResultSequence();
        rseq.myFinder = (Finder)this;
        rseq.myPattern = p;
        rseq.myReceiver = r;
        return rseq;
    }

    @Override
	public ResultSequence<OT> deliverMatchesUntilDone(final Pattern p, final Receiver<OT> r) {
        final ResultSequence<OT> rseq = this.makeResultSequence(p, r);
        final List<OT> brutishMatches = (List<OT>)this.myBasicRegistry.brutishlyCollectAllMatches((Class)this.myObjClz, p);
        Receiver.Status stat = Receiver.Status.SEEKING;
        for (final OT obj : brutishMatches) {
            stat = rseq.deliverResult((OT)obj);
            if (stat.equals((Object)Receiver.Status.DONE)) {
                break;
            }
        }
        return rseq;
    }

    protected List<OT> collectMatches(final Pattern p) {
        final List<OT> matches = new ArrayList<OT>();
        final Receiver<OT> collector = (Receiver<OT>)new Receiver<OT>() {
            @Override
			public Receiver.Status receiveMatch(final OT match, final ResultSequence<OT> seq, final long seqIndex) {
                matches.add(match);
                return Receiver.Status.SEEKING;
            }
        };
        this.deliverMatchesUntilDone(p, collector);
        return matches;
    }

    protected void verifyMatchCount(final int matchCount, final int minAllowed, final int maxAllowed, final Pattern patForError) throws Exception {
        if (matchCount < minAllowed || matchCount > maxAllowed) {
            throw new Exception("Expected between " + minAllowed + " and " + maxAllowed + " matches for " + patForError + ", but got " + matchCount);
        }
    }

    @Override
	public OT findFirstMatch(final Pattern p, final int minAllowed, final int maxAllowed) throws Exception {
        final List<OT> matches = this.collectMatches(p);
        final int matchCount = matches.size();
        this.verifyMatchCount(matchCount, minAllowed, maxAllowed, p);
        return (matchCount > 0) ? matches.get(0) : null;
    }

    @Override
	public List<OT> findAllMatches(final Pattern p, final int minAllowed, final int maxAllowed) throws Exception {
        final List<OT> matches = this.collectMatches(p);
        final int matchCount = matches.size();
        this.verifyMatchCount(matchCount, minAllowed, maxAllowed, p);
        return matches;
    }

    @Override
	public long countMatches(final Pattern p, final int maxAllowed) throws Exception {
        final List<OT> matches = this.collectMatches(p);
        final int matchCount = matches.size();
        this.verifyMatchCount(matchCount, 0, maxAllowed, p);
        return matches.size();
    }

    @Override
	public void killDeliverySequence(final ResultSequence resultSeq) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

/*

	Total time: 41 ms

*/