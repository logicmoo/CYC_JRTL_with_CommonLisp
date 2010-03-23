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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.UUID;

//// Internal Imports

//// External Imports

public  final class SubLGuid extends AbstractSubLObject implements SubLObject, Comparable<SubLGuid> {
  
	// common lisp additions
	@Override
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  
  /** Creates a new instance of SubLGuid. */
  
  SubLGuid() {
    this(UUID.randomUUID());
  }
  
  SubLGuid(UUID guid) {
    this(guid, guid.toString());
  }
  
  SubLGuid(String guidString) {
    this(UUID.fromString(guidString), guidString);
  }
  
 SubLGuid(SubLVector data) {
    this(new UUID(guidMSB(data), guidLSB(data)));
  }
    
  SubLGuid(UUID guid, String guidString) {
    this.guid       = guid;
    this.guidString = guidString;
  }
  
  //// Public Area
  
  /** Method created to avoid casting */
  public final SubLGuid toGuid() {
    return this;
  }
  
  public boolean equals(Object obj) {
    if (obj == null) { return false; }
    if (obj == this ) { return true; }
    if (!(obj instanceof SubLGuid)) {
      return false;
    }
    return (compareTo((SubLGuid)obj) == 0);
  }
  
  public boolean equalp(SubLObject obj) {
    if (obj == null) { return false; }
    if (obj == this ) { return true; }
    if (!obj.isGuid()) { return false; }
    return (compareTo(obj.toGuid()) == 0);
  }
  
  public int hashCode(int depth) {
    return guid.hashCode();
  }
  
  public static final String GUID_TYPE_NAME = "GUID";
  
  public String toTypeName() {
    return GUID_TYPE_NAME;
  }
  
  public String toString() {
    return "#G\"" + stringRepresentation() + "\"";
  }
  
  public SubLString getGuidString() {
    return SubLObjectFactory.makeString(stringRepresentation());
  }
  
  public static boolean isGuidString(String string) {
    // @hack this is incredibly expensive ....
    boolean isValid = false;
    try {
      final UUID testUUID = UUID.fromString(string);
      isValid = true;
    } catch (Exception xcpt) {      
    }
    return isValid;
  }
  
  public int compareTo(SubLGuid obj) {
    if (obj == null) {
      throw new NullPointerException();
    }
    // this will throw the required class-cast exception if it fails
    SubLGuid otherGuid = (SubLGuid)obj;  
    final int thisVersion = guid.version();
    final int otherVersion = otherGuid.getNativeGuid().version();
    // perform the comparison
    if (thisVersion != otherVersion) {
      // they can already not be equal at this point
      return thisVersion > otherVersion ? 1 : -1;
    }
    // at this point we are comparing compatible versions
    if (guid.version() == 1) {
      return compareTimeVersionedGUIDs(guid,otherGuid.getNativeGuid());
    } else if (guid.version() == 4) {
      return stringRepresentation().compareTo(otherGuid.stringRepresentation());
    } else {
      return guid.compareTo(otherGuid.getNativeGuid());
    }
  }
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_guid$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.ONE_HUNDRED_TWENTY_SEVEN_INTEGER;
  }
    
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return true; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  protected UUID getNativeGuid() {
    return guid;
  }
  
  protected String stringRepresentation() {
    return guidString;
  }
  
  static protected int compareTimeVersionedGUIDs( UUID guid1, UUID guid2) {
    final int var1 = guid1.variant();
    final int var2 = guid2.variant();
    if (var1 != var2) {
      return var1 > var2 ? 1 : -1;
    }
    final int seq1 = guid1.clockSequence();
    final int seq2 = guid2.clockSequence();
    if (seq1 != seq2) {
      return seq1 > seq2 ? 1 : -1;
    }
    final long stamp1 = guid1.timestamp();
    final long stamp2 = guid2.timestamp();
    if (stamp1 != stamp2) {
      return stamp1 > stamp2 ? 1 : -1;
    }
    final long node1 = guid1.node();
    final long node2 = guid2.node();
    if (node1 != node2) {
      return node1 > node2 ? 1 : -1;
    }
    return 0;
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  public void fillByteVector(SubLVector byteVector) {
    assert byteVector.size() == 16;

    // Assume the GUID layout in the GUID string is  like so :
    // M7 M6 M5 M4 M3 M2 M1 M0  L7 L6 L5 L4 L3 L2 L1 L0
    //  0  1  2  3  4  5  6  7   8  9 10 11 12 13 14 15
    long msb = guid.getMostSignificantBits();
    for (int i=7; i >= 0; i--) {
      final int nextByte = (int) msb & 0xff;
      final SubLInteger nextSubLByte = SubLNumberFactory.makeSmallInteger(nextByte);
      byteVector.set(i, nextSubLByte);
      msb >>= 8;
    }

    long lsb = guid.getLeastSignificantBits();
     for (int i=15; i >= 8; i--) {
      final int nextByte = (int) lsb & 0xff;
      final SubLInteger nextSubLByte = SubLNumberFactory.makeSmallInteger(nextByte);
      byteVector.set(i, nextSubLByte);
      lsb >>= 8;
    }
 }
  
  //// Private Area
  
  private static final long guidMSB(SubLVector data) {
    long msb = 0;
    assert data.size() == 16;
    for (int i=0; i<8; i++)
      msb = (msb << 8) | (((byte) data.get(i).toInteger().intValue()) & 0xff);
    return msb;
  }
  
  private static final long guidLSB(SubLVector data) {
    long lsb = 0;
    assert data.size() == 16;
    for (int i=8; i<16; i++)
      lsb = (lsb << 8) | (((byte) data.get(i).toInteger().intValue()) & 0xff);
    return lsb;
  }
  
  
  //// Internal Rep
  
  final private UUID guid;  
  final private String guidString;
}
