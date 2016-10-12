/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 *
 * A class that represents an immutable universally unique identifier (UUID). A
 * UUID represents a 128-bit value.
 *
 * <p>
 * There exist different variants of these global identifiers. The methods of
 * this class are for manipulating the Leach-Salz variant, although the
 * constructors allow the creation of any variant of UUID (described below).
 *
 * <p>
 * The layout of a variant 2 (Leach-Salz) UUID is as follows:
 *
 * The most significant long consists of the following unsigned fields:
 *
 * <pre>
 * 0xFFFFFFFF00000000 time_low
 * 0x00000000FFFF0000 time_mid
 * 0x000000000000F000 version
 * 0x0000000000000FFF time_hi
 * </pre>
 *
 * The least significant long consists of the following unsigned fields:
 *
 * <pre>
 * 0xC000000000000000 variant
 * 0x3FFF000000000000 clock_seq
 * 0x0000FFFFFFFFFFFF node
 * </pre>
 *
 * <p>
 * The variant field contains a value which identifies the layout of the
 * <tt>UUID</tt>. The bit layout described above is valid only for a
 * <tt>UUID</tt> with a variant value of 2, which indicates the Leach-Salz
 * variant.
 *
 * <p>
 * The version field holds a value that describes the type of this
 * <tt>UUID</tt>. There are four different basic types of UUIDs: time-based, DCE
 * security, name-based, and randomly generated UUIDs. These types have a
 * version value of 1, 2, 3 and 4, respectively.
 *
 * <p>
 * For more information including algorithms used to create <tt>UUID</tt>s, see
 * the Internet-Draft <a href=
 * "http://www.ietf.org/internet-drafts/draft-mealling-uuid-urn-03.txt">UUIDs
 * and GUIDs</a> or the standards body definition at
 * <a href="http://www.iso.ch/cate/d2229.html">ISO/IEC 11578:1996</a>.
 *
 * @version 1.14, 07/12/04
 * @since 1.5
 */
public class UUID implements java.io.Serializable, Comparable {

	/**
	 * Explicit serialVersionUID for interoperability.
	 */
	private static long serialVersionUID = -4856846361193249489L;

	/*
	 * The random number generator used by this class to create random based
	 * UUIDs.
	 */
	private static volatile SecureRandom numberGenerator = null;

	/** Returns val represented by the specified number of hex digits. */
	private static String digits(long val, int digits) {
		long hi = 1L << digits * 4;
		return Long.toHexString(hi | val & hi - 1).substring(1);
	}

	/**
	 * Creates a <tt>UUID</tt> from the string standard representation as
	 * described in the {@link #toString} method.
	 *
	 * @param name
	 *            a string that specifies a <tt>UUID</tt>.
	 * @return a <tt>UUID</tt> with the specified value.
	 * @throws IllegalArgumentException
	 *             if name does not conform to the string representation as
	 *             described in {@link #toString}.
	 */
	public static UUID fromString(String name) {
		String[] components = name.split("-");
		if (components.length != 5)
			throw new IllegalArgumentException("Invalid UUID string: " + name);

		long mostSigBits = Long.parseLong(components[0], 16);// Long.decode(components[0]).longValue();
		mostSigBits <<= 16;
		mostSigBits |= Long.parseLong(components[1], 16);// Long.decode(components[1]).longValue();
		mostSigBits <<= 16;
		mostSigBits |= Long.parseLong(components[2], 16);// Long.decode(components[2]).longValue();

		long leastSigBits = Long.parseLong(components[3], 16);// Long.decode(components[3]).longValue();
		leastSigBits <<= 48;
		leastSigBits |= Long.parseLong(components[4], 16);// Long.decode(components[4]).longValue();

		return new UUID(mostSigBits, leastSigBits);
	}

	/**
	 * Static factory to retrieve a type 3 (name based) <tt>UUID</tt> based on
	 * the specified byte array.
	 *
	 * @param name
	 *            a byte array to be used to construct a <tt>UUID</tt>.
	 * @return a <tt>UUID</tt> generated from the specified array.
	 */
	public static UUID nameUUIDFromBytes(byte[] name) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException nsae) {
			throw new InternalError("MD5 not supported");
		}
		byte[] md5Bytes = md.digest(name);
		md5Bytes[6] &= 0x0f; /* clear version */
		md5Bytes[6] |= 0x30; /* set to version 3 */
		md5Bytes[8] &= 0x3f; /* clear variant */
		md5Bytes[8] |= 0x80; /* set to IETF variant */
		return new UUID(md5Bytes);
	}

	/**
	 * Static factory to retrieve a type 4 (pseudo randomly generated) UUID.
	 *
	 * The <code>UUID</code> is generated using a cryptographically strong
	 * pseudo random number generator.
	 *
	 * @return a randomly generated <tt>UUID</tt>.
	 */
	public static UUID randomUUID() {
		SecureRandom ng = UUID.numberGenerator;
		if (ng == null)
			UUID.numberGenerator = ng = new SecureRandom();

		byte[] randomBytes = new byte[16];
		ng.nextBytes(randomBytes);
		randomBytes[6] &= 0x0f; /* clear version */
		randomBytes[6] |= 0x40; /* set to version 4 */
		randomBytes[8] &= 0x3f; /* clear variant */
		randomBytes[8] |= 0x80; /* set to IETF variant */
		UUID result = new UUID(randomBytes);
		return new UUID(randomBytes);
	}

	/*
	 * The most significant 64 bits of this UUID.
	 *
	 * @serial
	 */
	private long mostSigBits;

	/*
	 * The least significant 64 bits of this UUID.
	 *
	 * @serial
	 */
	private long leastSigBits;

	/*
	 * The version number associated with this UUID. Computed on demand.
	 */
	private transient int version = -1;

	/*
	 * The variant number associated with this UUID. Computed on demand.
	 */
	private transient int variant = -1;

	// Constructors and Factories

	/*
	 * The timestamp associated with this UUID. Computed on demand.
	 */
	private transient volatile long timestamp = -1;

	/*
	 * The clock sequence associated with this UUID. Computed on demand.
	 */
	private transient int sequence = -1;

	/*
	 * The node number associated with this UUID. Computed on demand.
	 */
	private transient long node = -1;

	/*
	 * The hashcode of this UUID. Computed on demand.
	 */
	private transient int hashCode = -1;

	/*
	 * Private constructor which uses a byte array to construct the new UUID.
	 */
	private UUID(byte[] data) {
		long msb = 0;
		long lsb = 0;
		assert data.length == 16;
		for (int i = 0; i < 8; i++)
			msb = msb << 8 | data[i] & 0xff;
		for (int i = 8; i < 16; i++)
			lsb = lsb << 8 | data[i] & 0xff;
		this.mostSigBits = msb;
		this.leastSigBits = lsb;
	}

	// Field Accessor Methods

	/**
	 * Constructs a new <tt>UUID</tt> using the specified data.
	 * <tt>mostSigBits</tt> is used for the most significant 64 bits of the
	 * <tt>UUID</tt> and <tt>leastSigBits</tt> becomes the least significant 64
	 * bits of the <tt>UUID</tt>.
	 *
	 * @param mostSigBits
	 * @param leastSigBits
	 */
	public UUID(long mostSigBits, long leastSigBits) {
		this.mostSigBits = mostSigBits;
		this.leastSigBits = leastSigBits;
	}

	/**
	 * The clock sequence value associated with this UUID.
	 *
	 * <p>
	 * The 14 bit clock sequence value is constructed from the clock sequence
	 * field of this UUID. The clock sequence field is used to guarantee
	 * temporal uniqueness in a time-based UUID.
	 * <p>
	 *
	 * The clockSequence value is only meaningful in a time-based UUID, which
	 * has version type 1. If this UUID is not a time-based UUID then this
	 * method throws UnsupportedOperationException.
	 *
	 * @return the clock sequence of this <tt>UUID</tt>.
	 * @throws UnsupportedOperationException
	 *             if this UUID is not a version 1 UUID.
	 */
	public int clockSequence() {
		if (this.version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		if (this.sequence < 0)
			this.sequence = (int) ((this.leastSigBits & 0x3FFF000000000000L) >>> 48);
		return this.sequence;
	}

	/**
	 * Compares this UUID with the specified UUID.
	 *
	 * <p>
	 * The first of two UUIDs follows the second if the most significant field
	 * in which the UUIDs differ is greater for the first UUID.
	 *
	 * @param val
	 *            <tt>UUID</tt> to which this <tt>UUID</tt> is to be compared.
	 * @return -1, 0 or 1 as this <tt>UUID</tt> is less than, equal to, or
	 *         greater than <tt>val</tt>.
	 */
	public int compareTo(Object obj) {
		if (obj == null || !(obj instanceof UUID))
			throw new RuntimeException("Can't compare UUIDs to non-UUIDs: " + obj);
		UUID val = (UUID) obj;
		// The ordering is intentionally set up so that the UUIDs
		// can simply be numerically compared as two numbers
		return this.mostSigBits < val.mostSigBits ? -1
				: this.mostSigBits > val.mostSigBits ? 1
						: this.leastSigBits < val.leastSigBits ? -1 : this.leastSigBits > val.leastSigBits ? 1 : 0;
	}

	/**
	 * Compares this object to the specified object. The result is <tt>true</tt>
	 * if and only if the argument is not <tt>null</tt>, is a <tt>UUID</tt>
	 * object, has the same variant, and contains the same value, bit for bit,
	 * as this <tt>UUID</tt>.
	 *
	 * @param obj
	 *            the object to compare with.
	 * @return <code>true</code> if the objects are the same; <code>false</code>
	 *         otherwise.
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof UUID))
			return false;
		if (((UUID) obj).variant() != this.variant())
			return false;
		UUID id = (UUID) obj;
		return this.mostSigBits == id.mostSigBits && this.leastSigBits == id.leastSigBits;
	}

	/**
	 * Returns the least significant 64 bits of this UUID's 128 bit value.
	 *
	 * @return the least significant 64 bits of this UUID's 128 bit value.
	 */
	public long getLeastSignificantBits() {
		return this.leastSigBits;
	}

	/**
	 * Returns the most significant 64 bits of this UUID's 128 bit value.
	 *
	 * @return the most significant 64 bits of this UUID's 128 bit value.
	 */
	public long getMostSignificantBits() {
		return this.mostSigBits;
	}

	/**
	 * Returns a hash code for this <code>UUID</code>.
	 *
	 * @return a hash code value for this <tt>UUID</tt>.
	 */
	public int hashCode() {
		if (this.hashCode == -1)
			this.hashCode = (int) (this.mostSigBits >> 32 ^ this.mostSigBits ^ this.leastSigBits >> 32
					^ this.leastSigBits);
		return this.hashCode;
	}

	// Object Inherited Methods

	/**
	 * The node value associated with this UUID.
	 *
	 * <p>
	 * The 48 bit node value is constructed from the node field of this UUID.
	 * This field is intended to hold the IEEE 802 address of the machine that
	 * generated this UUID to guarantee spatial uniqueness.
	 * <p>
	 *
	 * The node value is only meaningful in a time-based UUID, which has version
	 * type 1. If this UUID is not a time-based UUID then this method throws
	 * UnsupportedOperationException.
	 *
	 * @return the node value of this <tt>UUID</tt>.
	 * @throws UnsupportedOperationException
	 *             if this UUID is not a version 1 UUID.
	 */
	public long node() {
		if (this.version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		if (this.node < 0)
			this.node = this.leastSigBits & 0x0000FFFFFFFFFFFFL;
		return this.node;
	}

	/**
	 * Reconstitute the <tt>UUID</tt> instance from a stream (that is,
	 * deserialize it). This is necessary to set the transient fields to their
	 * correct uninitialized value so they will be recomputed on demand.
	 */
	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {

		in.defaultReadObject();

		// Set "cached computation" fields to their initial values
		this.version = -1;
		this.variant = -1;
		this.timestamp = -1;
		this.sequence = -1;
		this.node = -1;
		this.hashCode = -1;
	}

	/**
	 * The timestamp value associated with this UUID.
	 *
	 * <p>
	 * The 60 bit timestamp value is constructed from the time_low, time_mid,
	 * and time_hi fields of this <tt>UUID</tt>. The resulting timestamp is
	 * measured in 100-nanosecond units since midnight, October 15, 1582 UTC.
	 * <p>
	 *
	 * The timestamp value is only meaningful in a time-based UUID, which has
	 * version type 1. If this <tt>UUID</tt> is not a time-based UUID then this
	 * method throws UnsupportedOperationException.
	 *
	 * @throws UnsupportedOperationException
	 *             if this UUID is not a version 1 UUID.
	 */
	public long timestamp() {
		if (this.version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		long result = this.timestamp;
		if (result < 0) {
			result = (this.mostSigBits & 0x0000000000000FFFL) << 48;
			result |= (this.mostSigBits >> 16 & 0xFFFFL) << 32;
			result |= this.mostSigBits >>> 32;
			this.timestamp = result;
		}
		return result;
	}

	/**
	 * Returns a <code>String</code> object representing this <code>UUID</code>.
	 *
	 * <p>
	 * The UUID string representation is as described by this BNF :
	 *
	 * <pre>
	 *  UUID                   = <time_low> "-" <time_mid> "-"
	 *                           <time_high_and_version> "-"
	 *                           <variant_and_sequence> "-"
	 *                           <node>
	 *  time_low               = 4*<hexOctet>
	 *  time_mid               = 2*<hexOctet>
	 *  time_high_and_version  = 2*<hexOctet>
	 *  variant_and_sequence   = 2*<hexOctet>
	 *  node                   = 6*<hexOctet>
	 *  hexOctet               = <hexDigit><hexDigit>
	 *  hexDigit               =
	 *        "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
	 *        | "a" | "b" | "c" | "d" | "e" | "f"
	 *        | "A" | "B" | "C" | "D" | "E" | "F"
	 * </pre>
	 *
	 * @return a string representation of this <tt>UUID</tt>.
	 */
	public String toString() {
		return UUID.digits(this.mostSigBits >> 32, 8) + "-" + UUID.digits(this.mostSigBits >> 16, 4) + "-"
				+ UUID.digits(this.mostSigBits, 4) + "-" + UUID.digits(this.leastSigBits >> 48, 4) + "-"
				+ UUID.digits(this.leastSigBits, 12);
	}

	// Comparison Operations

	/**
	 * The variant number associated with this <tt>UUID</tt>. The variant number
	 * describes the layout of the <tt>UUID</tt>.
	 *
	 * The variant number has the following meaning:
	 * <p>
	 * <ul>
	 * <li>0 Reserved for NCS backward compatibility
	 * <li>2 The Leach-Salz variant (used by this class)
	 * <li>6 Reserved, Microsoft Corporation backward compatibility
	 * <li>7 Reserved for future definition
	 * </ul>
	 *
	 * @return the variant number of this <tt>UUID</tt>.
	 */
	public int variant() {
		if (this.variant < 0)
			// This field is composed of a varying number of bits
			if (this.leastSigBits >>> 63 == 0)
			this.variant = 0;
			else if (this.leastSigBits >>> 62 == 2)
			this.variant = 2;
			else
			this.variant = (int) (this.leastSigBits >>> 61);
		return this.variant;
	}

	/**
	 * The version number associated with this <tt>UUID</tt>. The version number
	 * describes how this <tt>UUID</tt> was generated.
	 *
	 * The version number has the following meaning:
	 * <p>
	 * <ul>
	 * <li>1 Time-based UUID
	 * <li>2 DCE security UUID
	 * <li>3 Name-based UUID
	 * <li>4 Randomly generated UUID
	 * </ul>
	 *
	 * @return the version number of this <tt>UUID</tt>.
	 */
	public int version() {
		if (this.version < 0)
			// Version is bits masked by 0x000000000000F000 in MS long
			this.version = (int) (this.mostSigBits >> 12 & 0x0f);
		return this.version;
	}
}
