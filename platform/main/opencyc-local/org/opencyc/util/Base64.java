package org.opencyc.util;

import java.io.FilterOutputStream;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.ObjectInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.OutputStream;
import org.opencyc.api.CfaslOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.opencyc.api.CfaslInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Base64
{
    public static final boolean ENCODE = true;
    public static final boolean DECODE = false;
    public static final boolean COMPRESS = true;
    public static final boolean DONT_COMPRESS = false;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte EQUALS_SIGN = 61;
    private static final byte NEW_LINE = 10;
    private static final byte[] ALPHABET;
    private static final byte[] DECODABET;
    private static final byte BAD_ENCODING = -9;
    private static final byte WHITE_SPACE_ENC = -5;
    private static final byte EQUALS_SIGN_ENC = -1;
    
    protected byte[] getAlphabet() {
        return Base64.ALPHABET;
    }
    
    protected byte[] getDecodabet() {
        return Base64.DECODABET;
    }
    
    public Object decodeCycObject(final String base64String, final int trace) throws IOException {
        final byte[] base64Bytes = base64String.getBytes();
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(base64Bytes);
        final InputStream base64InputStream = new InputStream(byteArrayInputStream, this);
        final CfaslInputStream cfaslInputStream = new CfaslInputStream((java.io.InputStream)base64InputStream);
        cfaslInputStream.trace = trace;
        return cfaslInputStream.readObject();
    }
    
    public String encodeCycObject(final Object obj, final int trace) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final CfaslOutputStream cfaslOutputStream = new CfaslOutputStream((java.io.OutputStream)byteArrayOutputStream);
        cfaslOutputStream.trace = trace;
        cfaslOutputStream.writeObject(obj);
        cfaslOutputStream.flush();
        final ByteArrayOutputStream base64ByteStream = new ByteArrayOutputStream();
        final OutputStream base64OutputStream = new OutputStream(base64ByteStream, this);
        base64OutputStream.write(byteArrayOutputStream.toByteArray());
        base64OutputStream.flush();
        cfaslOutputStream.close();
        base64OutputStream.close();
        return base64ByteStream.toString();
    }
    
    private byte[] encode3to4(final byte[] threeBytes) {
        return this.encode3to4(threeBytes, 3);
    }
    
    private byte[] encode3to4(final byte[] threeBytes, final int numSigBytes) {
        final byte[] dest = new byte[4];
        this.encode3to4(threeBytes, 0, numSigBytes, dest, 0);
        return dest;
    }
    
    private byte[] encode3to4(final byte[] source, final int srcOffset, final int numSigBytes, final byte[] destination, final int destOffset) {
        final int inBuff = ((numSigBytes > 0) ? (source[srcOffset] << 24 >>> 8) : 0) | ((numSigBytes > 1) ? (source[srcOffset + 1] << 24 >>> 16) : 0) | ((numSigBytes > 2) ? (source[srcOffset + 2] << 24 >>> 24) : 0);
        final byte[] alphabet = this.getAlphabet();
        switch (numSigBytes) {
            case 3: {
                destination[destOffset] = alphabet[inBuff >>> 18];
                destination[destOffset + 1] = alphabet[inBuff >>> 12 & 0x3F];
                destination[destOffset + 2] = alphabet[inBuff >>> 6 & 0x3F];
                destination[destOffset + 3] = alphabet[inBuff & 0x3F];
                return destination;
            }
            case 2: {
                destination[destOffset] = alphabet[inBuff >>> 18];
                destination[destOffset + 1] = alphabet[inBuff >>> 12 & 0x3F];
                destination[destOffset + 2] = alphabet[inBuff >>> 6 & 0x3F];
                destination[destOffset + 3] = 61;
                return destination;
            }
            case 1: {
                destination[destOffset] = alphabet[inBuff >>> 18];
                destination[destOffset + 1] = alphabet[inBuff >>> 12 & 0x3F];
                destination[destOffset + 3] = (destination[destOffset + 2] = 61);
                return destination;
            }
            default: {
                return destination;
            }
        }
    }
    
    public String encodeObject(final Serializable serializableObject) {
        return this.encodeObject(serializableObject, true);
    }
    
    public String encodeObject(final Serializable serializableObject, final boolean breakLines) {
        ByteArrayOutputStream baos = null;
        java.io.OutputStream b64os = null;
        ObjectOutputStream oos = null;
        try {
            baos = new ByteArrayOutputStream();
            b64os = new OutputStream(baos, this, true, breakLines);
            oos = new ObjectOutputStream(b64os);
            oos.writeObject(serializableObject);
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try {
                oos.close();
            }
            catch (Exception ex) {}
            try {
                b64os.close();
            }
            catch (Exception ex2) {}
            try {
                baos.close();
            }
            catch (Exception ex3) {}
        }
        return new String(baos.toByteArray());
    }
    
    public String encodeBytes(final byte[] source) {
        return this.encodeBytes(source, 0, source.length, true);
    }
    
    public String encodeBytes(final byte[] source, final boolean breakLines) {
        return this.encodeBytes(source, 0, source.length, breakLines);
    }
    
    public String encodeBytes(final byte[] source, final int off, final int len) {
        return this.encodeBytes(source, off, len, true);
    }
    
    protected String encodeBytes(final byte[] source, final int off, final int len, final boolean breakLines) {
        final int len2 = len * 4 / 3;
        final byte[] outBuff = new byte[len2 + ((len % 3 > 0) ? 4 : 0) + (breakLines ? (len2 / 76) : 0)];
        int d = 0;
        int e = 0;
        final int len3 = len - 2;
        int lineLength = 0;
        while (d < len3) {
            this.encode3to4(source, d + off, 3, outBuff, e);
            lineLength += 4;
            if (breakLines && lineLength == 76) {
                outBuff[e + 4] = 10;
                ++e;
                lineLength = 0;
            }
            d += 3;
            e += 4;
        }
        if (d < len) {
            this.encode3to4(source, d + off, len - d, outBuff, e);
            e += 4;
        }
        return new String(outBuff, 0, e);
    }
    
    public String encodeString(final String s) {
        return this.encodeString(s, true);
    }
    
    public String encodeString(final String s, final boolean breakLines) {
        return this.encodeBytes(s.getBytes(), breakLines);
    }
    
    public byte[] readFile(final String file, final boolean encode) {
        return this.readFile(new File(file), encode);
    }
    
    public byte[] readFile(final File file, final boolean encode) {
        byte[] data = new byte[100];
        byte[] returnValue = null;
        int nextIndex = 0;
        int b = -1;
        InputStream bis = null;
        try {
            bis = new InputStream(new BufferedInputStream(new FileInputStream(file)), this, encode);
            while ((b = bis.read()) >= 0) {
                if (nextIndex >= data.length) {
                    final byte[] temp = new byte[data.length << 1];
                    System.arraycopy(data, 0, temp, 0, data.length);
                    data = temp;
                }
                data[nextIndex++] = (byte)b;
            }
            returnValue = new byte[nextIndex];
            System.arraycopy(data, 0, returnValue, 0, nextIndex);
        }
        catch (IOException e) {
            returnValue = null;
        }
        finally {
            try {
                bis.close();
            }
            catch (Exception ex) {}
        }
        return returnValue;
    }
    
    public boolean writeFile(final byte[] data, final String file, final boolean encode) {
        return this.writeFile(data, 0, data.length, new File(file), encode);
    }
    
    public boolean writeFile(final byte[] data, final File file, final boolean encode) {
        return this.writeFile(data, 0, data.length, file, encode);
    }
    
    public boolean writeFile(final byte[] data, final int offset, final int length, final File file, final boolean encode) {
        OutputStream bos = null;
        boolean success = false;
        try {
            bos = new OutputStream(new BufferedOutputStream(new FileOutputStream(file)), this, encode);
            bos.write(data, offset, length);
            success = true;
        }
        catch (IOException e) {
            success = false;
        }
        finally {
            try {
                bos.close();
            }
            catch (Exception ex) {}
        }
        return success;
    }
    
    public String encodeFromFile(final String rawfile) {
        final byte[] ebytes = this.readFile(rawfile, true);
        return (ebytes == null) ? null : new String(ebytes);
    }
    
    public byte[] decodeFromFile(final String encfile) {
        return this.readFile(encfile, false);
    }
    
    public boolean encodeToFile(final byte[] rawdata, final String file) {
        return this.writeFile(rawdata, file, true);
    }
    
    public boolean decodeToFile(final byte[] encdata, final String file) {
        return this.writeFile(encdata, file, false);
    }
    
    private byte[] decode4to3(final byte[] fourBytes) {
        final byte[] outBuff1 = new byte[3];
        final int count = this.decode4to3(fourBytes, 0, outBuff1, 0);
        final byte[] outBuff2 = new byte[count];
        for (int i = 0; i < count; ++i) {
            outBuff2[i] = outBuff1[i];
        }
        return outBuff2;
    }
    
    private int decode4to3(final byte[] source, final int srcOffset, final byte[] destination, final int destOffset) {
        final byte[] decodabet = this.getDecodabet();
        if (source[srcOffset + 2] == 61) {
            final int outBuff = (decodabet[source[srcOffset]] & 0xFF) << 18 | (decodabet[source[srcOffset + 1]] & 0xFF) << 12;
            destination[destOffset] = (byte)(outBuff >>> 16);
            return 1;
        }
        if (source[srcOffset + 3] == 61) {
            final int outBuff = (decodabet[source[srcOffset]] & 0xFF) << 18 | (decodabet[source[srcOffset + 1]] & 0xFF) << 12 | (decodabet[source[srcOffset + 2]] & 0xFF) << 6;
            destination[destOffset] = (byte)(outBuff >>> 16);
            destination[destOffset + 1] = (byte)(outBuff >>> 8);
            return 2;
        }
        try {
            final int outBuff = (decodabet[source[srcOffset]] & 0xFF) << 18 | (decodabet[source[srcOffset + 1]] & 0xFF) << 12 | (decodabet[source[srcOffset + 2]] & 0xFF) << 6 | (decodabet[source[srcOffset + 3]] & 0xFF);
            destination[destOffset] = (byte)(outBuff >> 16);
            destination[destOffset + 1] = (byte)(outBuff >> 8);
            destination[destOffset + 2] = (byte)outBuff;
            return 3;
        }
        catch (Exception e) {
            System.out.println("" + source[srcOffset] + ": " + decodabet[source[srcOffset]]);
            System.out.println("" + source[srcOffset + 1] + ": " + decodabet[source[srcOffset + 1]]);
            System.out.println("" + source[srcOffset + 2] + ": " + decodabet[source[srcOffset + 2]]);
            System.out.println("" + source[srcOffset + 3] + ": " + decodabet[source[srcOffset + 3]]);
            return -1;
        }
    }
    
    public byte[] decode(final String s) {
        final byte[] bytes = s.getBytes();
        return this.decode(bytes, 0, bytes.length);
    }
    
    public String decodeToString(final String s) {
        return new String(this.decode(s));
    }
    
    public Object decodeToObject(final String encodedObject) {
        final byte[] objBytes = this.decode(encodedObject);
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            bais = new ByteArrayInputStream(objBytes);
            ois = new ObjectInputStream(bais);
            return ois.readObject();
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
        finally {
            try {
                bais.close();
            }
            catch (Exception ex) {}
            try {
                ois.close();
            }
            catch (Exception ex2) {}
        }
    }
    
    public byte[] decode(final byte[] source, final int off, final int len) {
        final int len2 = len * 3 / 4;
        final byte[] outBuff = new byte[len2];
        int outBuffPosn = 0;
        final byte[] b4 = new byte[4];
        int b4Posn = 0;
        int i = 0;
        byte sbiCrop = 0;
        byte sbiDecode = 0;
        for (i = off; i < off + len; ++i) {
            sbiCrop = (byte)(source[i] & 0x7F);
            sbiDecode = this.getDecodabet()[sbiCrop];
            if (sbiDecode < -5) {
                Logger.getLogger(Base64.class.getCanonicalName()).log(Level.FINE, "Bad Base64 input character at {0}: {1}(decimal)", new Object[] { i, source[i] });
                return null;
            }
            if (sbiDecode >= -1) {
                b4[b4Posn++] = sbiCrop;
                if (b4Posn > 3) {
                    outBuffPosn += this.decode4to3(b4, 0, outBuff, outBuffPosn);
                    b4Posn = 0;
                    if (sbiCrop == 61) {
                        break;
                    }
                }
            }
        }
        final byte[] out = new byte[outBuffPosn];
        System.arraycopy(outBuff, 0, out, 0, outBuffPosn);
        return out;
    }
    
    static {
        ALPHABET = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        DECODABET = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9 };
    }
    
    public static class InputStream extends FilterInputStream
    {
        private boolean encode;
        private int position;
        private byte[] buffer;
        private int bufferLength;
        private int numSigBytes;
        private int lineLength;
        private boolean breakLines;
        private Base64 base64;
        
        public InputStream(final java.io.InputStream in, final Base64 base64) {
            this(in, base64, false);
        }
        
        public InputStream(final java.io.InputStream in, final Base64 base64, final boolean encode) {
            this(in, base64, encode, true);
        }
        
        public InputStream(final java.io.InputStream in, final Base64 base64, final boolean encode, final boolean breakLines) {
            super(in);
            this.breakLines = breakLines;
            this.encode = encode;
            this.bufferLength = (encode ? 4 : 3);
            this.buffer = new byte[this.bufferLength];
            this.position = -1;
            this.lineLength = 0;
            this.base64 = base64;
        }
        
        @Override
        public int read() throws IOException {
            if (this.position < 0) {
                if (this.encode) {
                    final byte[] b3 = new byte[3];
                    int numBinaryBytes = 0;
                    for (int i = 0; i < 3; ++i) {
                        try {
                            final int b4 = this.in.read();
                            if (b4 >= 0) {
                                b3[i] = (byte)b4;
                                ++numBinaryBytes;
                            }
                        }
                        catch (IOException e) {
                            if (i == 0) {
                                throw e;
                            }
                        }
                    }
                    if (numBinaryBytes <= 0) {
                        return -1;
                    }
                    this.base64.encode3to4(b3, 0, numBinaryBytes, this.buffer, 0);
                    this.position = 0;
                    this.numSigBytes = 4;
                }
                else {
                    final byte[] b5 = new byte[4];
                    int j;
                    int b6;
                    for (j = 0, j = 0; j < 4; ++j) {
                        b6 = 0;
                        do {
                            b6 = this.in.read();
                        } while (b6 >= 0 && this.base64.getDecodabet()[b6 & 0x7F] <= -5);
                        if (b6 < 0) {
                            break;
                        }
                        b5[j] = (byte)b6;
                    }
                    if (j == 4) {
                        this.numSigBytes = this.base64.decode4to3(b5, 0, this.buffer, 0);
                        this.position = 0;
                    }
                    else {
                        if (j == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                }
            }
            if (this.position < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            }
            if (this.position >= this.numSigBytes) {
                return -1;
            }
            if (this.encode && this.breakLines && this.lineLength >= 76) {
                this.lineLength = 0;
                return 10;
            }
            ++this.lineLength;
            final int b7 = this.buffer[this.position++];
            if (this.position >= this.bufferLength) {
                this.position = -1;
            }
            return b7 & 0xFF;
        }
        
        @Override
        public int read(final byte[] dest, final int off, final int len) throws IOException {
            int i = 0;
            while (i < len) {
                final int b = this.read();
                if (b >= 0) {
                    dest[off + i] = (byte)b;
                    ++i;
                }
                else {
                    if (i == 0) {
                        return -1;
                    }
                    break;
                }
            }
            return i;
        }
    }
    
    public static class OutputStream extends FilterOutputStream
    {
        private boolean encode;
        private int position;
        private byte[] buffer;
        private int bufferLength;
        private int lineLength;
        private boolean breakLines;
        private Base64 base64;
        
        public OutputStream(final java.io.OutputStream out, final Base64 base64) {
            this(out, base64, true);
        }
        
        public OutputStream(final java.io.OutputStream out, final Base64 base64, final boolean encode) {
            this(out, base64, encode, true);
        }
        
        public OutputStream(final java.io.OutputStream out, final Base64 base64, final boolean encode, final boolean breakLines) {
            super(out);
            this.breakLines = breakLines;
            this.encode = encode;
            this.bufferLength = (encode ? 3 : 4);
            this.buffer = new byte[this.bufferLength];
            this.position = 0;
            this.lineLength = 0;
            this.base64 = base64;
        }
        
        @Override
        public void write(final int theByte) throws IOException {
            if (this.encode) {
                this.buffer[this.position++] = (byte)theByte;
                if (this.position >= this.bufferLength) {
                    this.out.write(this.base64.encode3to4(this.buffer, this.bufferLength));
                    this.lineLength += 4;
                    if (this.breakLines && this.lineLength >= 76) {
                        this.out.write(10);
                        this.lineLength = 0;
                    }
                    this.position = 0;
                }
            }
            else if (this.base64.getDecodabet()[theByte & 0x7F] > -5) {
                this.buffer[this.position++] = (byte)theByte;
                if (this.position >= this.bufferLength) {
                    this.out.write(this.base64.decode4to3(this.buffer));
                    this.position = 0;
                }
            }
            else if (this.base64.getDecodabet()[theByte & 0x7F] != -5) {
                throw new IOException("Invalid character in Base64 data.");
            }
        }
        
        @Override
        public void write(final byte[] theBytes, final int off, final int len) throws IOException {
            for (int i = 0; i < len; ++i) {
                this.write(theBytes[off + i]);
            }
        }
        
        @Override
        public void flush() throws IOException {
            super.flush();
            if (this.position > 0) {
                if (!this.encode) {
                    throw new IOException("Base64 input not properly padded.");
                }
                this.out.write(this.base64.encode3to4(this.buffer, this.position));
                this.position = 0;
            }
            this.out.flush();
        }
        
        @Override
        public void close() throws IOException {
            super.close();
            this.out.close();
            this.buffer = null;
            this.out = null;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 308 ms
	
	Decompiled with Procyon 0.5.32.
*/