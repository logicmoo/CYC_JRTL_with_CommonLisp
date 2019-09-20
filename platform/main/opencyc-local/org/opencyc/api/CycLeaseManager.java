package org.opencyc.api;

import java.util.EventListener;
import java.util.EventObject;
import java.util.logging.Level;
import org.opencyc.cycobject.CycList;
import org.opencyc.util.TimeOutException;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CycLeaseManager extends Thread
{
    public static long CYC_API_SERVICES_LEASE_REQUEST_TIMEOUT_MILLIS;
    public static final CycLeaseManagerReason CYC_DENIES_THE_LEASE_REQUEST;
    public static final CycLeaseManagerReason CYC_COMMUNICATION_ERROR;
    public static final CycLeaseManagerReason CYC_DOES_NOT_RESPOND_TO_LEASE_REQUEST;
    public static final CycLeaseManagerReason CYC_IMAGE_ID_HAS_CHANGED;
    public static final CycLeaseManagerReason LEASE_SUCCESSFULLY_RENEWED;
    private final Logger logger;
    private final CycConnection cycConnection;
    private String cycImageID;
    private final List listeners;
    private volatile boolean isLeaseRequestPending;
    private long leaseDurationMilliseconds;
    private volatile boolean hasValidLease;
    
    public CycLeaseManager(final CycConnection cycConnection) {
        this.cycImageID = null;
        this.listeners = Collections.synchronizedList(new ArrayList<Object>());
        this.isLeaseRequestPending = false;
        this.leaseDurationMilliseconds = 120000L;
        this.hasValidLease = true;
        if (cycConnection == null) {
            throw new InvalidParameterException("cycAccess must not be null");
        }
        this.logger = Logger.getLogger("org.opencyc.api.CycLeaseManager");
        this.cycConnection = cycConnection;
    }
    
    public synchronized void addListener(final CycLeaseManagerListener cycLeaseManagerListener) {
        if (cycLeaseManagerListener == null) {
            throw new InvalidParameterException("cycLeaseManagerListener must not be null");
        }
        if (this.listeners.contains(cycLeaseManagerListener)) {
            throw new InvalidParameterException("listener must not be currently registered");
        }
        assert this.listeners != null : "listeners must not be null";
        assert this.isAlive() : "the CycLeaseManager thread has died because a lease timed-out, errored or was denied";
        this.listeners.add(cycLeaseManagerListener);
    }
    
    public synchronized void removeListener(final CycLeaseManagerListener cycLeaseManagerListener) {
        if (cycLeaseManagerListener == null) {
            throw new InvalidParameterException("cycLeaseManagerListener must not be null");
        }
        assert this.listeners != null : "listeners must not be null";
        assert this.isAlive() : "the CycLeaseManager thread has died because a lease timed-out, errored or was denied";
        this.listeners.remove(cycLeaseManagerListener);
    }
    
    public boolean hasValidLease() {
        return this.hasValidLease;
    }
    
    public void removeAllListeners() {
        assert this.listeners != null : "listeners must not be null";
        assert this.isAlive() : "the CycLeaseManager thread has died because a lease timed-out, errored or was denied";
        this.listeners.clear();
    }
    
    @Override
    public void run() {
        assert this.listeners != null : "listeners must not be null";
        assert this.cycConnection != null : "cycConnection must not be null";
        Thread.currentThread().setName("Cyc API services lease manager");
        Thread.currentThread().setPriority(10);
        while (!this.cycConnection.isClosed()) {
            final String script = "(with-immediate-execution (acquire-api-services-lease " + this.getLeaseDurationMilliseconds() * 2L + " \"" + this.cycConnection.getUuid().toString() + "\"))";
            final CycList scriptList = this.cycConnection.cycAccess.makeCycList(script);
            String results = null;
            this.isLeaseRequestPending = true;
            this.logger.fine("Requesting API services lease");
            try {
                Object[] response = { null, null };
                response = this.cycConnection.converse((Object)scriptList);
                results = (String)response[1];
                this.logger.finest(results);
            }
            catch (TimeOutException toe) {
                this.isLeaseRequestPending = false;
                this.logger.fine("Cyc communications timeout encountered when attempting to renew the API services lease.\n" + toe.getMessage());
                this.notifyListeners(CycLeaseManager.CYC_DOES_NOT_RESPOND_TO_LEASE_REQUEST);
                try {
                    Thread.sleep(this.getLeaseDurationMilliseconds());
                }
                catch (InterruptedException ex) {}
                continue;
            }
            catch (Exception e) {
                this.isLeaseRequestPending = false;
                this.logger.fine("Cyc communications error encountered when attempting to renew the API services lease.\n" + e.getMessage());
                this.notifyListeners(CycLeaseManager.CYC_COMMUNICATION_ERROR);
                try {
                    Thread.sleep(this.getLeaseDurationMilliseconds());
                }
                catch (InterruptedException ex2) {}
                continue;
            }
            this.isLeaseRequestPending = false;
            if (results.equals("api services lease denied")) {
                this.logger.severe("The request to renew the API services lease was denied by the Cyc server.");
                this.notifyListeners(CycLeaseManager.CYC_DENIES_THE_LEASE_REQUEST);
            }
            else {
                final String currentImageID = this.extractImageID(results);
                if (this.cycImageID != null && !this.cycImageID.equals(currentImageID)) {
                    this.logger.info("The Cyc server image ID has changed.");
                    this.notifyListeners(CycLeaseManager.CYC_IMAGE_ID_HAS_CHANGED);
                }
                else {
                    this.logger.fine("API services lease renewed");
                    this.notifyListeners(CycLeaseManager.LEASE_SUCCESSFULLY_RENEWED);
                }
                this.cycImageID = currentImageID;
            }
            try {
                Thread.sleep(this.getLeaseDurationMilliseconds());
            }
            catch (InterruptedException ex3) {}
        }
    }
    
    public void immediatelyRenewLease() {
        this.logger.finest("immedidately renewing the lease");
        this.interrupt();
        try {
            Thread.sleep(250L);
        }
        catch (InterruptedException ex) {}
    }
    
    public boolean isLeaseRequestPending() {
        return this.isLeaseRequestPending;
    }
    
    public long getLeaseDurationMilliseconds() {
        return this.leaseDurationMilliseconds;
    }
    
    public void setLeaseDurationMilliseconds(final long leaseDurationMilliseconds) {
        if (leaseDurationMilliseconds < 2000L) {
            throw new InvalidParameterException("leaseDurationMilliseconds must be at least 2000");
        }
        this.leaseDurationMilliseconds = leaseDurationMilliseconds;
    }
    
    public String getCycImageId() {
        return this.cycImageID;
    }
    
    private String extractImageID(final String leaseDescription) {
        assert leaseDescription.startsWith("api services lease granted by ");
        String currentImageID = leaseDescription.substring(30);
        final int firstSpaceIndex = currentImageID.indexOf(" ");
        if (firstSpaceIndex > 0) {
            currentImageID = currentImageID.substring(0, firstSpaceIndex);
        }
        return currentImageID;
    }
    
    private void notifyListeners(final CycLeaseManagerReason cycLeaseManagerReason) {
        assert cycLeaseManagerReason != null : "cycLeaseManagerReason must not be null";
        assert this.listeners != null : "listeners must not be null";
        if (cycLeaseManagerReason == CycLeaseManager.CYC_COMMUNICATION_ERROR || cycLeaseManagerReason == CycLeaseManager.CYC_DENIES_THE_LEASE_REQUEST || cycLeaseManagerReason == CycLeaseManager.CYC_DOES_NOT_RESPOND_TO_LEASE_REQUEST) {
            this.hasValidLease = false;
        }
        else {
            this.hasValidLease = true;
        }
        for (int listeners_size = this.listeners.size(), i = 0; i < listeners_size; ++i) {
            final CycLeaseManagerListener cycLeaseManagerListener = (CycLeaseManagerListener) this.listeners.get(i);
            cycLeaseManagerListener.notifyCycLeaseEvent(new CycLeaseEventObject(this.cycConnection, cycLeaseManagerReason));
        }
    }
    
    public static void main(final String[] args) {
        try {
            Logger.getAnonymousLogger().info("Starting.");
            final CycAccess cycAccess = new CycAccess("public1.cyc.com", 3600);
            Logger.getAnonymousLogger().info("Connected to: " + cycAccess.getHostName() + ":" + cycAccess.getBasePort());
            for (int i = 0; i < 2; ++i) {
                Thread.sleep(2000L);
                final String script = "(sleep 1)";
                Logger.getAnonymousLogger().info("About to talk to Cyc: (sleep 1)");
                cycAccess.converseVoid((Object)"(sleep 1)");
                Logger.getAnonymousLogger().info("Finished talking to Cyc.");
            }
            Logger.getAnonymousLogger().info("About to close CycAccess.");
            cycAccess.close();
            Logger.getAnonymousLogger().info("Closed CycAccess.");
        }
        catch (Exception e) {
            Logger.getAnonymousLogger().log(Level.SEVERE, e.getMessage(), e);
            Logger.getAnonymousLogger().info("Finished.");
            System.exit(1);
        }
        Logger.getAnonymousLogger().info("Finished.");
    }
    
    static {
        CycLeaseManager.CYC_API_SERVICES_LEASE_REQUEST_TIMEOUT_MILLIS = 120000L;
        CYC_DENIES_THE_LEASE_REQUEST = new CycLeaseManagerReason("CYC_DENIES_THE_LEASE_REQUEST");
        CYC_COMMUNICATION_ERROR = new CycLeaseManagerReason("CYC_COMMUNICATION_ERROR");
        CYC_DOES_NOT_RESPOND_TO_LEASE_REQUEST = new CycLeaseManagerReason("CYC_DOES_NOT_RESPOND_TO_LEASE_REQUEST");
        CYC_IMAGE_ID_HAS_CHANGED = new CycLeaseManagerReason("CYC_IMAGE_ID_HAS_CHANGED");
        LEASE_SUCCESSFULLY_RENEWED = new CycLeaseManagerReason("LEASE_SUCCESSFULLY_RENEWED");
    }
    
    public static class CycLeaseManagerReason
    {
        private final String reason;
        
        public CycLeaseManagerReason(final String reason) {
            if (reason == null || reason.length() == 0) {
                throw new InvalidParameterException("reason must be a non-empty string");
            }
            this.reason = reason;
        }
        
        public String getReason() {
            return this.reason;
        }
        
        public boolean isGood() {
            return this == CycLeaseManager.LEASE_SUCCESSFULLY_RENEWED;
        }
    }
    
    public class CycLeaseEventObject extends EventObject
    {
        final CycLeaseManagerReason cycLeaseManagerReason;
        
        public CycLeaseEventObject(final Object source, final CycLeaseManagerReason reason) {
            super(source);
            if (reason == null) {
                throw new InvalidParameterException("cycLeaseManagerReason must not be null");
            }
            this.cycLeaseManagerReason = reason;
        }
        
        @Override
        public String toString() {
            return "CycLeaseEvent (" + this.cycLeaseManagerReason.getReason() + ")";
        }
        
        public CycLeaseManagerReason getReason() {
            return this.cycLeaseManagerReason;
        }
    }
    
    public interface CycLeaseManagerListener extends EventListener
    {
        void notifyCycLeaseEvent(final CycLeaseEventObject p0);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 126 ms
	
	Decompiled with Procyon 0.5.32.
*/