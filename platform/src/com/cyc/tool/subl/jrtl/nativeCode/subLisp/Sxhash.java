/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Sxhash extends SubLTrampolineFile {
  private static int sxhashRotateValue(int num, int highBits) {
    if (highBits >= Sxhash.SXHASH_BIT_LIMIT2)
      return num;
    int restBits = Sxhash.SXHASH_BIT_LIMIT2 - highBits - 1;
    int highFixnum = num >>> restBits;
    int restMask = (1 << restBits) - 1;
    int rest = (num & restMask) << highBits;
    int result = Numbers.truncateToFixnum(highFixnum) | rest;
    //if (result > SubLNumberFactory.MAX_FIXNUM || result < SubLNumberFactory.MIN_FIXNUM)int i = 0;
    return result;
  }

  public static int compositeUpdate(int compositeHash, int partHash, int state) {
    int updatedCompositeHash = compositeHash ^ sxhashRotateValue(partHash, state);
    return updatedCompositeHash;
  }

  public static SubLObject sxhash(SubLObject obj) {
    int rawHashCode = 0;
    if (obj.isStructure()) {
      UnaryFunction func = Sxhash.structHashMeths[obj.toStruct().id()];
      if (func != null)
        rawHashCode = Numbers.truncateToFixnum(func.processItem(obj).intValue());
    } else {
      rawHashCode = Numbers.truncateToFixnum(obj.hashCode(0));
    }
    int hashCode = Math.abs(rawHashCode);
    return SubLNumberFactory.makeInteger(hashCode);
  }

  public static SubLObject sxhash_rot(SubLObject fixnum, SubLObject high_bits) {
    int result = sxhashRotateValue(fixnum.intValue(), high_bits.intValue());
    return SubLNumberFactory.makeInteger(result);
  }

  public static int updateCompositeState(int compositeState) {
    return Sxhash.updateCompositeStateTable[compositeState];
  }

  public static SubLFile me;
  public static SubLSymbol $sxhash_method_table$;
  public static SubLVector hashVector;
  public static int MAX_STRUCT_DECLARATIONS = 2048;
  public static UnaryFunction[] structHashMeths;
  public static SubLInteger SXHASH_BIT_LIMIT;
  public static int SXHASH_BIT_LIMIT2;
  public static int INITIAL_COMPOSITE_STATE = 4;
  private static int[] updateCompositeStateTable;
  static {
    me = new Sxhash();
    Sxhash.$sxhash_method_table$ = null;
    hashVector = SubLObjectFactory.makeVector(256, SubLNil.NIL);
    structHashMeths = new UnaryFunction[2048];
    SXHASH_BIT_LIMIT = SubLObjectFactory.makeInteger(SubLNumberFactory.FIXNUM_BIT_SIZE);
    SXHASH_BIT_LIMIT2 = Sxhash.SXHASH_BIT_LIMIT.intValue();
    updateCompositeStateTable = new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 0, 1, 2, 3, 4, 5, 6 };
  }

  @Override
  public void declareFunctions() {
    SubLFiles.declareFunction(Sxhash.me, "sxhash", "SXHASH", 1, 0, false);
    SubLFiles.declareFunction(Sxhash.me, "sxhash_rot", "SXHASH-ROT", 2, 0, false);
  }

  @Override
  public void initializeVariables() {
    Sxhash.$sxhash_method_table$ = SubLFiles.deflexical(Sxhash.me, "*SXHASH-METHOD-TABLE*", Sxhash.hashVector);
  }

  @Override
  public void runTopLevelForms() {
  }
}
