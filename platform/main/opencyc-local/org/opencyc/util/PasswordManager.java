package org.opencyc.util;

import java.util.HashMap;
import org.opencyc.cycobject.Guid;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import org.opencyc.api.CycApiException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.cycobject.DefaultCycObject;
import org.opencyc.cycobject.CycDenotationalTerm;
import java.util.Map;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.api.CycAccess;

public class PasswordManager
{
    private final CycAccess cycAccess;
    private static final CycConstant testUser;
    private static int successCount;
    private static int testCount;
    private static final Base64 base64;
    private static final Map<CacheKey, String> CACHE;
    
    public PasswordManager(final CycAccess cycAccess) {
        this.cycAccess = cycAccess;
    }
    
    public boolean areLoginCredentialsValid(final CycConstant user, final CycDenotationalTerm applicationTerm, final char[] unencryptedPassword) {
        boolean isValid = false;
        final String encryptedPassword = encryptPassword(unencryptedPassword, user);
        final String command = "(PROGN(AUTHENTICATE-THE-CYCLIST " + DefaultCycObject.stringApiValue((Object)user.getName()) + " " + DefaultCycObject.stringApiValue((Object)encryptedPassword) + " " + applicationTerm.stringApiValue() + ")" + "(CNOT (THE-CYCLIST-IS-GUEST?)))";
        try {
            isValid = CommUtils.convertResponseToBoolean(CommUtils.performApiCommand(command, this.cycAccess));
            if (isValid) {
                this.noteValidPassword(user, applicationTerm, encryptedPassword);
            }
        }
        catch (IOException ex) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (TimeOutException ex2) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, (Throwable)ex2);
        }
        catch (CycApiException ex3) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, (Throwable)ex3);
        }
        catch (OpenCycTaskInterruptedException ex4) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, (Throwable)ex4);
        }
        return isValid;
    }
    
    public Boolean isPasswordRequired() throws IOException {
        return CommUtils.convertResponseToBoolean(CommUtils.performApiCommand("(image-requires-authentication?)", this.cycAccess));
    }
    
    public boolean updatePassword(final CycConstant user, final CycDenotationalTerm applicationTerm, final char[] unencryptedPassword) {
        final String encryptedPassword = encryptPassword(unencryptedPassword, user);
        final String command = "(SPECIFY-AUTHENTICATION-INFO-FOR-USER " + user.stringApiValue() + " " + DefaultCycObject.stringApiValue((Object)encryptedPassword) + " " + applicationTerm.stringApiValue() + ")";
        try {
            final boolean success = CommUtils.convertResponseToBoolean(CommUtils.performApiCommand(command, this.cycAccess));
            if (success) {
                this.noteValidPassword(user, applicationTerm, encryptedPassword);
            }
            return success;
        }
        catch (IOException ex) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (TimeOutException ex2) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, (Throwable)ex2);
        }
        catch (CycApiException ex3) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, (Throwable)ex3);
        }
        catch (OpenCycTaskInterruptedException ex4) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, (Throwable)ex4);
        }
        return false;
    }
    
    public static String encryptPassword(final char[] unencryptedPassword, final CycConstant user) {
        try {
            final MessageDigest encryptor = MessageDigest.getInstance("SHA-1");
            final String charSet = "iso-8859-1";
            encryptor.update(user.getName().getBytes("iso-8859-1"));
            encryptor.update(passwordCharsToBytes(unencryptedPassword, "iso-8859-1"));
            return PasswordManager.base64.encodeBytes(encryptor.digest());
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException("Failed to encrypt password", ex);
        }
        catch (UnsupportedEncodingException ex2) {
            throw new RuntimeException("Failed to encrypt password", ex2);
        }
    }
    
    public String lookupPassword(final CycConstant user, final CycDenotationalTerm applicationTerm) {
        return PasswordManager.CACHE.get(new CacheKey(user, applicationTerm, this.cycAccess));
    }
    
    private static byte[] passwordCharsToBytes(final char[] unencryptedPassword, final String charSet) throws UnsupportedEncodingException {
        final String unencryptedPasswordString = new String(unencryptedPassword);
        final byte[] passwordBytes = unencryptedPasswordString.getBytes(charSet);
        return passwordBytes;
    }
    
    private void noteValidPassword(final CycConstant user, final CycDenotationalTerm applicationTerm, final String encryptedPassword) {
        PasswordManager.CACHE.put(new CacheKey(user, applicationTerm, this.cycAccess), encryptedPassword);
    }
    
    public static void main(final String[] args) {
        PasswordManager.testCount = (PasswordManager.successCount = 0);
        checkOne("D", "c4W9SqCQVJfGGLjEehulnXTOCpM=");
        checkOne("dog", "ERaE0f2BsQ8hg2udao8mJakTiPY=");
        System.out.println(PasswordManager.successCount + " of " + PasswordManager.testCount + " tests passed.");
    }
    
    private static void checkOne(final String unencryptedPassword, final String encryptedPassword) {
        final String actual = encryptPassword(unencryptedPassword.toCharArray(), PasswordManager.testUser);
        if (actual.equals(encryptedPassword)) {
            ++PasswordManager.successCount;
        }
        else {
            System.out.println("Wanted " + encryptedPassword + " Got " + actual);
        }
        ++PasswordManager.testCount;
    }
    
    static {
        testUser = new CycConstant("Baxter", new Guid("beeac37c-9c29-11b1-9dad-c379636f7270"));
        PasswordManager.successCount = 0;
        PasswordManager.testCount = 0;
        base64 = new Base64();
        CACHE = new HashMap<CacheKey, String>();
    }
    
    private class CacheKey
    {
        private final CycDenotationalTerm user;
        private final CycDenotationalTerm applicationTerm;
        private final CycAccess cyc;
        
        private CacheKey(final CycConstant user, final CycDenotationalTerm applicationTerm, final CycAccess cyc) {
            this.user = (CycDenotationalTerm)user;
            this.applicationTerm = applicationTerm;
            this.cyc = cyc;
        }
        
        @Override
        public int hashCode() {
            return this.user.hashCode() + this.applicationTerm.hashCode() + this.cyc.hashCode();
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            final CacheKey other = (CacheKey)obj;
            return (this.user == other.user || (this.user != null && this.user.equals(other.user))) && (this.applicationTerm == other.applicationTerm || (this.applicationTerm != null && this.applicationTerm.equals(other.applicationTerm))) && (this.cyc == other.cyc || (this.cyc != null && this.cyc.equals(other.cyc)));
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 98 ms
	
	Decompiled with Procyon 0.5.32.
*/