/* For LarKC */
package com.cyc.tool.subl.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class UUID implements Serializable, Comparable {
	private UUID(byte[] data) {
		version = -1;
		variant = -1;
		timestamp = -1L;
		sequence = -1;
		node = -1L;
		hashCode = -1;
		long msb = 0L;
		long lsb = 0L;
		assert data.length == 16;
		for (int i = 0; i < 8; ++i)
			msb = msb << 8 | data[i] & 0xFF;
		for (int i = 8; i < 16; ++i)
			lsb = lsb << 8 | data[i] & 0xFF;
		mostSigBits = msb;
		leastSigBits = lsb;
	}

	public UUID(long mostSigBits, long leastSigBits) {
		version = -1;
		variant = -1;
		timestamp = -1L;
		sequence = -1;
		node = -1L;
		hashCode = -1;
		this.mostSigBits = mostSigBits;
		this.leastSigBits = leastSigBits;
	}

	private static String digits(long val, int digits) {
		long hi = 1L << digits * 4;
		return Long.toHexString(hi | val & hi - 1L).substring(1);
	}

	public static UUID fromString(String name) {
		String[] components = name.split("-");
		if (components.length != 5)
			throw new IllegalArgumentException("Invalid UUID string: " + name);
		long mostSigBits = Long.parseLong(components[0], 16);
		mostSigBits <<= 16;
		mostSigBits |= Long.parseLong(components[1], 16);
		mostSigBits <<= 16;
		mostSigBits |= Long.parseLong(components[2], 16);
		long leastSigBits = Long.parseLong(components[3], 16);
		leastSigBits <<= 48;
		leastSigBits |= Long.parseLong(components[4], 16);
		return new UUID(mostSigBits, leastSigBits);
	}

	public static UUID nameUUIDFromBytes(byte[] name) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException nsae) {
			throw new InternalError("MD5 not supported");
		}
		byte[] digest;
		byte[] md5Bytes = digest = md.digest(name);
		int n = 6;
		digest[n] &= 0xF;
		byte[] array = md5Bytes;
		int n2 = 6;
		array[n2] |= 0x30;
		byte[] array2 = md5Bytes;
		int n3 = 8;
		array2[n3] &= 0x3F;
		byte[] array3 = md5Bytes;
		int n4 = 8;
		array3[n4] |= (byte) 128;
		return new UUID(md5Bytes);
	}

	public static UUID randomUUID() {
		SecureRandom ng = UUID.numberGenerator;
		if (ng == null)
			ng = UUID.numberGenerator = new SecureRandom();
		byte[] randomBytes = new byte[16];
		ng.nextBytes(randomBytes);
		byte[] array = randomBytes;
		int n = 6;
		array[n] &= 0xF;
		byte[] array2 = randomBytes;
		int n2 = 6;
		array2[n2] |= 0x40;
		byte[] array3 = randomBytes;
		int n3 = 8;
		array3[n3] &= 0x3F;
		byte[] array4 = randomBytes;
		int n4 = 8;
		array4[n4] |= (byte) 128;
		UUID result = new UUID(randomBytes);
		return new UUID(randomBytes);
	}

	private long mostSigBits;
	private long leastSigBits;
	private transient int version;
	private transient int variant;
	private transient volatile long timestamp;
	private transient int sequence;
	private transient long node;
	private transient int hashCode;
	private static long serialVersionUID = -4856846361193249489L;
	private static volatile SecureRandom numberGenerator;
	static {
		UUID.numberGenerator = null;
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		version = -1;
		variant = -1;
		timestamp = -1L;
		sequence = -1;
		node = -1L;
		hashCode = -1;
	}

	public int clockSequence() {
		if (version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		if (sequence < 0)
			sequence = (int) ((leastSigBits & 0x3FFF000000000000L) >>> 48);
		return sequence;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj == null || !(obj instanceof UUID))
			throw new RuntimeException("Can't compare UUIDs to non-UUIDs: " + obj);
		UUID val = (UUID) obj;
		return mostSigBits < val.mostSigBits ? -1
				: mostSigBits > val.mostSigBits ? 1
						: leastSigBits < val.leastSigBits ? -1 : leastSigBits > val.leastSigBits ? 1 : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof UUID))
			return false;
		if (((UUID) obj).variant() != variant())
			return false;
		UUID id = (UUID) obj;
		return mostSigBits == id.mostSigBits && leastSigBits == id.leastSigBits;
	}

	public long getLeastSignificantBits() {
		return leastSigBits;
	}

	public long getMostSignificantBits() {
		return mostSigBits;
	}

	@Override
	public int hashCode() {
		if (hashCode == -1)
			hashCode = (int) (mostSigBits >> 32 ^ mostSigBits ^ leastSigBits >> 32 ^ leastSigBits);
		return hashCode;
	}

	public long node() {
		if (version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		if (node < 0L)
			node = leastSigBits & 0xFFFFFFFFFFFFL;
		return node;
	}

	public long timestamp() {
		if (version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		long result = timestamp;
		if (result < 0L) {
			result = (mostSigBits & 0xFFFL) << 48;
			result |= (mostSigBits >> 16 & 0xFFFFL) << 32;
			result |= mostSigBits >>> 32;
			timestamp = result;
		}
		return result;
	}

	@Override
	public String toString() {
		return digits(mostSigBits >> 32, 8) + "-" + digits(mostSigBits >> 16, 4) + "-" + digits(mostSigBits, 4) + "-"
				+ digits(leastSigBits >> 48, 4) + "-" + digits(leastSigBits, 12);
	}

	public int variant() {
		if (variant < 0)
			if (leastSigBits >>> 63 == 0L)
				variant = 0;
			else if (leastSigBits >>> 62 == 2L)
				variant = 2;
			else
				variant = (int) (leastSigBits >>> 61);
		return variant;
	}

	public int version() {
		if (version < 0)
			version = (int) (mostSigBits >> 12 & 0xFL);
		return version;
	}
}
