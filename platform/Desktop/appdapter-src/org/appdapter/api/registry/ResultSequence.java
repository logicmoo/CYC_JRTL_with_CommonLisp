package org.appdapter.api.registry;

public class ResultSequence<OT>
{
    public Receiver<OT> myReceiver;
    public Finder<OT> myFinder;
    public Pattern myPattern;
    private long mySeqNum;
    private Receiver.Status myLastStatus;

    public ResultSequence() {
        this.mySeqNum = 0L;
        this.myLastStatus = Receiver.Status.SEEKING;
    }

    public synchronized Receiver.Status deliverResult(final OT obj) {
        final org.appdapter.api.registry.Receiver<OT> myReceiver = this.myReceiver;
        final long mySeqNum = this.mySeqNum + 1L;
        this.mySeqNum = mySeqNum;
        return myReceiver.receiveMatch((OT)obj, this, mySeqNum);
    }

    public synchronized long getLastResultCount() {
        return this.mySeqNum;
    }

    public synchronized Receiver.Status getLastReceiverStatus() {
        return this.myLastStatus;
    }
}

/*

	Total time: 7 ms

*/