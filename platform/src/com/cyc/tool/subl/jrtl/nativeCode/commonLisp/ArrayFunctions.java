/*
 * make_array.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: make_array.java 12431 2010-02-08 08:05:15Z mevenson $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */
package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

/**
 *  Description of the Class
 *
 * @author    Administrator
 */
public final class ArrayFunctions {

	// ### arrayp
	private static final Primitive ARRAYP = new pf_arrayp();

	// ### array-has-fill-pointer-p
	private static final Primitive ARRAY_HAS_FILL_POINTER_P = new pf_array_has_fill_pointer_p();

	// ### vectorp
	private static final Primitive VECTORP = new pf_vectorp();

	// ### simple-vector-p
	private static final Primitive SIMPLE_VECTOR_P = new pf_simple_vector_p();

	// ### bit-vector-p
	private static final Primitive BIT_VECTOR_P = new pf_bit_vector_p();

	// ### simple-bit-vector-p
	private static final Primitive SIMPLE_BIT_VECTOR_P = new pf_simple_bit_vector_p();

	// ### shrink-vector vector new-size => vector
	// Destructively alters the vector, changing its length to NEW-SIZE, which
	// must be less than or equal to its current length.
	// shrink-vector vector new-size => vector
	private static final Primitive SHRINK_VECTOR = new pf_shrink_vector();

	// ### vector-delete-eq item vector => result-vector
	private static final Primitive VECTOR_DELETE_EQ = new pf_vector_delete_eq();

	// ### vector-delete-eql item vector => result-vector
	private static final Primitive VECTOR_DELETE_EQL = new pf_vector_delete_eql();

	// ### simple-vector-search pattern vector => position
	// Searches vector for pattern.
	private static final Primitive SIMPLE_VECTOR_SEARCH = new pf_simple_vector_search();

	// ### %make-array dimensions element-type initial-element initial-element-p
	// initial-contents adjustable fill-pointer displaced-to displaced-index-offset
	// => new-array
	private static final Primitive _MAKE_ARRAY = new make_array();

	private static final Primitive _ADJUST_ARRAY = new adjust_array();

	// ### upgraded-array-element-type typespec &optional environment
	// => upgraded-typespec
	private static final Primitive UPGRADED_ARRAY_ELEMENT_TYPE = new pf_upgraded_array_element_type();

	// ### array-rank array => rank
	private static final Primitive ARRAY_RANK = new pf_array_rank();

	// ### array-dimensions array => dimensions
	// Returns a list of integers. Fill pointer (if any) is ignored.
	private static final Primitive ARRAY_DIMENSIONS = new pf_array_dimensions();

	// ### array-dimension array axis-number => dimension
	private static final Primitive ARRAY_DIMENSION = new pf_array_dimension();

	// ### array-total-size array => size
	private static final Primitive ARRAY_TOTAL_SIZE = new pf_array_total_size();

	// ### array-element-type
	// array-element-type array => typespec
	private static final Primitive ARRAY_ELEMENT_TYPE = new pf_array_element_type();

	// ### adjustable-array-p
	private static final Primitive ADJUSTABLE_ARRAY_P = new pf_adjustable_array_p();

	// ### array-displacement array => displaced-to, displaced-index-offset
	private static final Primitive ARRAY_DISPLACEMENT = new pf_array_displacement();

	// ### array-in-bounds-p array &rest subscripts => generalized-boolean
	private static final Primitive ARRAY_IN_BOUNDS_P = new pf_array_in_bounds_p();

	// ### %array-row-major-index array subscripts => index
	private static final Primitive _ARRAY_ROW_MAJOR_INDEX = new pf__array_row_major_index();

	// ### aref array &rest subscripts => element
	private static final Primitive AREF = new pf_aref();

	// ### aset array subscripts new-element => new-element
	private static final Primitive ASET = new pf_aset();

	// ### row-major-aref array index => element
	private static final Primitive ROW_MAJOR_AREF = new pf_row_major_aref();

	// ### vector
	private static final Primitive VECTOR = new pf_vector();

	// ### fill-pointer
	private static final Primitive FILL_POINTER = new pf_fill_pointer();

	// ### %set-fill-pointer vector new-fill-pointer
	private static final Primitive _SET_FILL_POINTER = new pf__set_fill_pointer();

	// ### vector-push new-element vector => index-of-new-element
	private static final Primitive VECTOR_PUSH = new pf_vector_push();

	// ### vector-push-extend new-element vector &optional extension
	// => index-of-new-element
	private static final Primitive VECTOR_PUSH_EXTEND = new pf_vector_push_extend();

	// ### vector-pop vector => element
	private static final Primitive VECTOR_POP = new pf_vector_pop();

	// ### %simple-bit-vector-bit-and
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_AND = new JavaPrimitive("%simple-bit-vector-bit-and",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_AND_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_AND_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).and(checkBitVector(second), (checkBitVector(third)));
	}

	// ### %simple-bit-vector-bit-ior
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_IOR = new JavaPrimitive("%simple-bit-vector-bit-ior",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_IOR_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_IOR_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).ior(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-xor
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_XOR = new JavaPrimitive("%simple-bit-vector-bit-xor",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_XOR_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_XOR_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).xor(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-eqv
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_EQV = new JavaPrimitive("%simple-bit-vector-bit-eqv",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_EQV_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_EQV_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).eqv(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-nand
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_NAND = new JavaPrimitive("%simple-bit-vector-bit-nand",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_NAND_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_NAND_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).nand(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-nor
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_NOR = new JavaPrimitive("%simple-bit-vector-bit-nor",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_NOR_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_NOR_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).nor(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-andc1
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_ANDC1 = new JavaPrimitive("%simple-bit-vector-bit-andc1",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_ANDC1_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_ANDC1_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).andc1(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-andc2
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_ANDC2 = new JavaPrimitive("%simple-bit-vector-bit-andc2",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_ANDC2_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_ANDC2_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).andc2(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-orc1
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_ORC1 = new JavaPrimitive("%simple-bit-vector-bit-orc1",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_ORC1_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_ORC1_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).orc1(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-orc2
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_ORC2 = new JavaPrimitive("%simple-bit-vector-bit-orc2",
			PACKAGE_SYS, false, "bit-vector1 bit-vector2 result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return _SIMPLE_BIT_VECTOR_BIT_ORC2_execute(first, second, third);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_ORC2_execute(SubLObject first, SubLObject second,
			SubLObject third) {
		return checkBitVector(first).orc2(checkBitVector(second), checkBitVector(third));
	}

	// ### %simple-bit-vector-bit-not
	private static final Primitive _SIMPLE_BIT_VECTOR_BIT_NOT = new JavaPrimitive("%simple-bit-vector-bit-not",
			PACKAGE_SYS, false, "bit-vector result-bit-vector") {
		//@override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return _SIMPLE_BIT_VECTOR_BIT_NOT_execute(first, second);
		}
	};

	@InlinableMethod
	static final public SubLObject _SIMPLE_BIT_VECTOR_BIT_NOT_execute(SubLObject first, SubLObject second) {
		SimpleBitVector v = checkBitVector(first);
		SimpleBitVector result = checkBitVector(second);
		for (int i = v.bits.length; i-- > 0;) {
			result.bits[i] = ~v.bits[i];
		}
		return result;
	}

	/**
	 *  Description of the Method
	 *
	 * @param  obj  Description of Parameter
	 * @return      Description of the Returned Value
	 */
	static SimpleBitVector checkBitVector(SubLObject obj) {
		return (SimpleBitVector) obj;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	public static final class make_array extends JavaPrimitive {
		/**  Constructor for the make_array object */
		public make_array() {
			super("%make-array", PACKAGE_SYS, false);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		public SubLObject execute(SubLObject[] args) {
			return make_array_execute(args);
		}
	}

	@InlinableMethod
	static final public SubLObject make_array_execute(SubLObject[] args) {
		if (args.length != 9) {
			return wrongNumberOfArguments();
		}
		SubLObject dimensions = args[0];
		SubLObject elementType = args[1];
		SubLObject initialElement = args[2];
		SubLObject initialElementProvided = args[3];
		SubLObject initialContents = args[4];
		SubLObject adjustable = args[5];
		SubLObject fillPointer = args[6];
		SubLObject displacedTo = args[7];
		SubLObject displacedIndexOffset = args[8];
		if (initialElementProvided != NIL && initialContents != NIL) {
			return error(new LispError("MAKE-ARRAY: cannot specify both " + "initial element and initial contents."));
		}
		final int rank = dimensions.isList() ? dimensions.cl_length() : 1;
		int[] dimv = new int[rank];
		if (dimensions.isList()) {
			for (int i = 0; i < rank; i++) {
				SubLObject dim = dimensions.first();
				dimv[i] = dim.intValue();
				dimensions = dimensions.rest();
			}
		} else {
			dimv[0] = dimensions.intValue();
		}
		if (displacedTo != NIL) {
			// FIXME Make sure element type (if specified) is compatible with
			// displaced-to array.
			final AbstractArray array = checkArray(displacedTo);
			if (initialElementProvided != NIL) {
				return error(new LispError("Initial element must not be specified for a displaced array."));
			}
			if (initialContents != NIL) {
				return error(new LispError("Initial contents must not be specified for a displaced array."));
			}
			final int displacement;
			if (displacedIndexOffset != NIL) {
				displacement = displacedIndexOffset.intValue();
			} else {
				displacement = 0;
			}
			if (rank == 1) {
				AbstractVector v;
				SubLObject arrayElementType = array.getElementType();
				if (arrayElementType == LispSymbols.CHARACTER) {
					v = new ComplexString(dimv[0], array, displacement);
				} else if (arrayElementType == LispSymbols.BIT) {
					v = new ComplexBitVector(dimv[0], array, displacement);
				} else if (arrayElementType.equal(UNSIGNED_BYTE_8)) {
					v = new ComplexVector_UnsignedByte8(dimv[0], array, displacement);
				} else if (arrayElementType.equal(UNSIGNED_BYTE_32)) {
					v = new ComplexVector_UnsignedByte32(dimv[0], array, displacement);
				} else {
					v = new ComplexVector(dimv[0], array, displacement);
				}
				if (fillPointer != NIL) {
					v.setFillPointer(fillPointer);
				}
				return v;
			}
			return new ComplexArray(dimv, array, displacement);
		}
		SubLObject upgradedType = getUpgradedArrayElementType(elementType);
		if (rank == 0) {
			SubLObject data;
			if (initialElementProvided != NIL) {
				data = initialElement;
			} else {
				data = initialContents;
			}
			return new ZeroRankArray(upgradedType, data, adjustable != NIL);
		}
		if (rank == 1) {
			final int size = dimv[0];
			if (size < 0 || size >= ARRAY_DIMENSION_MAX) {
				StringBuilder sb = new StringBuilder();
				sb.append("The size specified for this array (");
				sb.append(size);
				sb.append(')');
				if (size >= ARRAY_DIMENSION_MAX) {
					sb.append(" is >= ARRAY-DIMENSION-LIMIT (");
					sb.append(ARRAY_DIMENSION_MAX);
					sb.append(").");
				} else {
					sb.append(" is negative.");
				}
				return error(new LispError(sb.toString()));
			}
			final AbstractVector v;
			if (upgradedType == LispSymbols.CHARACTER) {
				if (fillPointer != NIL || adjustable != NIL) {
					v = new ComplexString(size);
				} else {
					v = makeString(size);
				}
			} else if (upgradedType == LispSymbols.BIT) {
				if (fillPointer != NIL || adjustable != NIL) {
					v = new ComplexBitVector(size);
				} else {
					v = new SimpleBitVector(size);
				}
			} else if (upgradedType.equal(UNSIGNED_BYTE_8)) {
				if (fillPointer != NIL || adjustable != NIL) {
					v = new ComplexVector_UnsignedByte8(size);
				} else {
					v = new BasicVector_UnsignedByte8(size);
				}
			} else if (upgradedType.equal(UNSIGNED_BYTE_16) && fillPointer == NIL && adjustable == NIL) {
				v = new BasicVector_UnsignedByte16(size);
			} else if (upgradedType.equal(UNSIGNED_BYTE_32)) {
				if (fillPointer != NIL || adjustable != NIL) {
					v = new ComplexVector_UnsignedByte32(size);
				} else {
					v = new BasicVector_UnsignedByte32(size);
				}
			} else if (upgradedType == NIL) {
				v = new NilVector(size);
			} else {
				if (fillPointer != NIL || adjustable != NIL) {
					v = new ComplexVector(size);
				} else {
					v = makeSimpleVector(size);
				}
			}
			if (initialElementProvided != NIL) {
				// Initial element was specified.
				v.fillVoid(initialElement);
			} else if (initialContents != NIL) {
				if (initialContents.isList()) {
					SubLObject list = initialContents;
					for (int i = 0; i < size; i++) {
						v.aset(i, list.first());
						list = list.rest();
					}
				} else if (initialContents.isSequence()) { // was isVector
					for (int i = 0; i < size; i++) {
						v.aset(i, initialContents.elt(i));
					}
				} else {
					return type_error(initialContents, LispSymbols.SEQUENCE);
				}
			}
			if (fillPointer != NIL) {
				v.setFillPointer(fillPointer);
			}
			return v;
		}
		// rank > 1
		AbstractArray array;
		if (adjustable == NIL) {
			if (upgradedType.equal(UNSIGNED_BYTE_8)) {
				if (initialContents != NIL) {
					array = new SimpleArray_UnsignedByte8(dimv, initialContents);
				} else {
					array = new SimpleArray_UnsignedByte8(dimv);
					if (initialElementProvided != NIL) {
						array.fillVoid(initialElement);
					}
				}
			} else if (upgradedType.equal(UNSIGNED_BYTE_16)) {
				if (initialContents != NIL) {
					array = new SimpleArray_UnsignedByte16(dimv, initialContents);
				} else {
					array = new SimpleArray_UnsignedByte16(dimv);
					if (initialElementProvided != NIL) {
						array.fillVoid(initialElement);
					}
				}
			} else if (upgradedType.equal(UNSIGNED_BYTE_32)) {
				if (initialContents != NIL) {
					array = new SimpleArray_UnsignedByte32(dimv, initialContents);
				} else {
					array = new SimpleArray_UnsignedByte32(dimv);
					if (initialElementProvided != NIL) {
						array.fillVoid(initialElement);
					}
				}
			} else {
				if (initialContents != NIL) {
					array = new SimpleArray_T(dimv, upgradedType, initialContents);
				} else {
					array = new SimpleArray_T(dimv, upgradedType);
					if (initialElementProvided != NIL) {
						array.fillVoid(initialElement);
					}
				}
			}
		} else {
			// Adjustable.
			if (upgradedType.equal(UNSIGNED_BYTE_8)) {
				if (initialContents != NIL) {
					array = new ComplexArray_UnsignedByte8(dimv, initialContents);
				} else {
					array = new ComplexArray_UnsignedByte8(dimv);
					if (initialElementProvided != NIL) {
						array.fillVoid(initialElement);
					}
				}
			} else if (upgradedType.equal(UNSIGNED_BYTE_32)) {
				if (initialContents != NIL) {
					array = new ComplexArray_UnsignedByte32(dimv, initialContents);
				} else {
					array = new ComplexArray_UnsignedByte32(dimv);
					if (initialElementProvided != NIL) {
						array.fillVoid(initialElement);
					}
				}
			} else {
				if (initialContents != NIL) {
					array = new ComplexArray(dimv, upgradedType, initialContents);
				} else {
					array = new ComplexArray(dimv, upgradedType);
					if (initialElementProvided != NIL) {
						array.fillVoid(initialElement);
					}
				}
			}
		}
		return array;
	}

	// ### %adjust-array array new-dimensions element-type initial-element
	// initial-element-p initial-contents initial-contents-p fill-pointer
	// displaced-to displaced-index-offset => new-array
	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	public static final class adjust_array extends JavaPrimitive {
		/**  Constructor for the adjust_array object */
		public adjust_array() {
			super("%adjust-array", PACKAGE_SYS, false);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		public SubLObject execute(SubLObject[] args) {
			return adjust_array_execute(args);
		}
	}

	@InlinableMethod
	static final public SubLObject adjust_array_execute(SubLObject[] args) {
		if (args.length != 10) {
			return wrongNumberOfArguments();
		}
		AbstractArray array = checkArray(args[0]);
		SubLObject dimensions = args[1];
		SubLObject elementType = args[2];
		boolean initialElementProvided = args[4] != NIL;
		boolean initialContentsProvided = args[6] != NIL;
		SubLObject initialElement = initialElementProvided ? args[3] : null;
		SubLObject initialContents = initialContentsProvided ? args[5] : null;
		SubLObject fillPointer = args[7];
		SubLObject displacedTo = args[8];
		SubLObject displacedIndexOffset = args[9];
		if (initialElementProvided && initialContentsProvided) {
			return error(new LispError("ADJUST-ARRAY: cannot specify both initial element and initial contents."));
		}
		if (elementType != array.getElementType() && getUpgradedArrayElementType(elementType) != array.getElementType()) {
			return error(new LispError("ADJUST-ARRAY: incompatible element type."));
		}
		if (array.getRank() == 0) {
			return array.adjustArray(new int[0], initialElement, initialContents);
		}
		if (!initialElementProvided && array.getElementType() == T) {
			initialElement = Fixnum.ZERO;
		}
		if (array.getRank() == 1) {
			final int newSize;
			if (dimensions instanceof SubLCons && dimensions.cl_length() == 1) {
				newSize = dimensions.first().intValue();
			} else {
				newSize = dimensions.intValue();
			}
			if (array instanceof AbstractVector) {
				AbstractVector v = (AbstractVector) array;
				AbstractArray v2;
				if (displacedTo != NIL) {
					final int displacement;
					if (displacedIndexOffset == NIL) {
						displacement = 0;
					} else {
						displacement = displacedIndexOffset.intValue();
					}
					v2 = v.adjustArray(newSize, checkArray(displacedTo), displacement);
				} else {
					v2 = v.adjustArray(newSize, initialElement, initialContents);
				}
				if (fillPointer != NIL) {
					v2.setFillPointer(fillPointer);
				}
				return v2;
			}
		}
		// rank > 1
		final int rank = dimensions.isList() ? dimensions.cl_length() : 1;
		int[] dimv = new int[rank];
		if (dimensions.isList()) {
			for (int i = 0; i < rank; i++) {
				SubLObject dim = dimensions.first();
				dimv[i] = dim.intValue();
				dimensions = dimensions.rest();
			}
		} else {
			dimv[0] = dimensions.intValue();
		}

		if (displacedTo != NIL) {
			final int displacement;
			if (displacedIndexOffset == NIL) {
				displacement = 0;
			} else {
				displacement = displacedIndexOffset.intValue();
			}
			return array.adjustArray(dimv, checkArray(displacedTo), displacement);
		} else {
			return array.adjustArray(dimv, initialElement, initialContents);
		}
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_arrayp extends JavaPrimitive {
		/**  Constructor for the pf_arrayp object */
		pf_arrayp() {
			super(LispSymbols.ARRAYP, "object");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_arrayp_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_arrayp_execute(SubLObject arg) {
		return arg instanceof AbstractArray ? T : NIL;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_array_has_fill_pointer_p extends JavaPrimitive {
		/**  Constructor for the pf_array_has_fill_pointer_p object */
		pf_array_has_fill_pointer_p() {
			super(LispSymbols.ARRAY_HAS_FILL_POINTER_P, "array");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_array_has_fill_pointer_p_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_array_has_fill_pointer_p_execute(SubLObject arg) {
		return checkArray(arg).hasFillPointer() ? T : NIL;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_vectorp extends JavaPrimitive {
		/**  Constructor for the pf_vectorp object */
		pf_vectorp() {
			super(LispSymbols.VECTORP, "object");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_vectorp_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_vectorp_execute(SubLObject arg) {
		return arg.VECTORP();
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_simple_vector_p extends JavaPrimitive {
		/**  Constructor for the pf_simple_vector_p object */
		pf_simple_vector_p() {
			super(LispSymbols.SIMPLE_VECTOR_P, "object");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_simple_vector_p_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_simple_vector_p_execute(SubLObject arg) {
		return arg instanceof SimpleVector ? T : NIL;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_bit_vector_p extends JavaPrimitive {
		/**  Constructor for the pf_bit_vector_p object */
		pf_bit_vector_p() {
			super(LispSymbols.BIT_VECTOR_P, "object");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_bit_vector_p_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_bit_vector_p_execute(SubLObject arg) {
		return arg instanceof AbstractBitVector ? T : NIL;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_simple_bit_vector_p extends JavaPrimitive {
		/**  Constructor for the pf_simple_bit_vector_p object */
		pf_simple_bit_vector_p() {
			super(LispSymbols.SIMPLE_BIT_VECTOR_P, "object");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_simple_bit_vector_p_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_simple_bit_vector_p_execute(SubLObject arg) {
		return arg.typep(LispSymbols.SIMPLE_BIT_VECTOR);
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_shrink_vector extends JavaPrimitive {
		/**  Constructor for the pf_shrink_vector object */
		pf_shrink_vector() {
			super("shrink-vector", PACKAGE_SYS, true, "vector new-size");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_shrink_vector_execute(first, second);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_shrink_vector_execute(SubLObject first, SubLObject second) {
		checkVector(first).shrink(second.intValue());
		return first;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_vector_delete_eq extends JavaPrimitive {
		/**  Constructor for the pf_vector_delete_eq object */
		pf_vector_delete_eq() {
			super("vector-delete-eq", PACKAGE_SYS, true, "item vector");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  item    Description of Parameter
		 * @param  vector  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject item, SubLObject vector) {
			return pf_vector_delete_eq_execute(item, vector);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  item    Description of Parameter
							 * @param  vector  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_vector_delete_eq_execute(SubLObject item, SubLObject vector) {
		checkVector(vector).deleteEq(item);
		return vector;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_vector_delete_eql extends JavaPrimitive {
		/**  Constructor for the pf_vector_delete_eql object */
		pf_vector_delete_eql() {
			super("vector-delete-eql", PACKAGE_SYS, true, "item vector");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  item    Description of Parameter
		 * @param  vector  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject item, SubLObject vector) {
			return pf_vector_delete_eql_execute(item, vector);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  item    Description of Parameter
							 * @param  vector  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_vector_delete_eql_execute(SubLObject item, SubLObject vector) {
		checkVector(vector).deleteEql(item);
		return vector;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_simple_vector_search extends JavaPrimitive {
		/**  Constructor for the pf_simple_vector_search object */
		pf_simple_vector_search() {
			super("simple-vector-search", PACKAGE_SYS, false);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_simple_vector_search_execute(first, second);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_simple_vector_search_execute(SubLObject first, SubLObject second) {
		AbstractVector v = checkVector(second);
		if (first.cl_length() == 0) {
			return Fixnum.ZERO;
		}
		final int patternLength = first.cl_length();
		final int limit = v.cl_length() - patternLength;
		if (first instanceof AbstractVector) {
			AbstractVector pattern = (AbstractVector) first;
			SubLObject element = pattern.AREF(0);
			for (int i = 0; i <= limit; i++) {
				if (v.AREF(i).eql(element)) {
					// Found match for first element of pattern.
					boolean match = true;
					// We've already checked the first element.
					int j = i + 1;
					for (int k = 1; k < patternLength; k++) {
						if (v.AREF(j).eql(pattern.AREF(k))) {
							++j;
						} else {
							match = false;
							break;
						}
					}
					if (match) {
						return LispObjectFactory.makeInteger(i);
					}
				}
			}
		} else {
			// Pattern is a list.
			SubLObject element = first.first();
			for (int i = 0; i <= limit; i++) {
				if (v.AREF(i).eql(element)) {
					// Found match for first element of pattern.
					boolean match = true;
					// We've already checked the first element.
					int j = i + 1;
					for (SubLObject rest = first.rest(); rest != NIL; rest = rest.rest()) {
						if (v.AREF(j).eql(rest.first())) {
							++j;
						} else {
							match = false;
							break;
						}
					}
					if (match) {
						return LispObjectFactory.makeInteger(i);
					}
				}
			}
		}
		return NIL;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_upgraded_array_element_type extends JavaPrimitive {
		/**  Constructor for the pf_upgraded_array_element_type object */
		pf_upgraded_array_element_type() {
			super(LispSymbols.UPGRADED_ARRAY_ELEMENT_TYPE, "typespec &optional environment");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_upgraded_array_element_type_execute(arg);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_upgraded_array_element_type_execute(first, second);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_upgraded_array_element_type_execute(SubLObject arg) {
		return getUpgradedArrayElementType(arg);
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_upgraded_array_element_type_execute(SubLObject first, SubLObject second) {
		// Ignore environment.
		return getUpgradedArrayElementType(first);
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_array_rank extends JavaPrimitive {
		/**  Constructor for the pf_array_rank object */
		pf_array_rank() {
			super(LispSymbols.ARRAY_RANK, "array");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_array_rank_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_array_rank_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(checkArray(arg).getRank());
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_array_dimensions extends JavaPrimitive {
		/**  Constructor for the pf_array_dimensions object */
		pf_array_dimensions() {
			super(LispSymbols.ARRAY_DIMENSIONS, "array");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_array_dimensions_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_array_dimensions_execute(SubLObject arg) {
		return checkArray(arg).getDimensions();
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_array_dimension extends JavaPrimitive {
		/**  Constructor for the pf_array_dimension object */
		pf_array_dimension() {
			super(LispSymbols.ARRAY_DIMENSION, "array axis-number");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_array_dimension_execute(first, second);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_array_dimension_execute(SubLObject first, SubLObject second) {
		final AbstractArray array = checkArray(first);
		return LispObjectFactory.makeInteger(array.getDimension(second.intValue()));
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_array_total_size extends JavaPrimitive {
		/**  Constructor for the pf_array_total_size object */
		pf_array_total_size() {
			super(LispSymbols.ARRAY_TOTAL_SIZE, "array");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_array_total_size_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_array_total_size_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(checkArray(arg).getTotalSize());
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_array_element_type extends JavaPrimitive {
		/**  Constructor for the pf_array_element_type object */
		pf_array_element_type() {
			super(LispSymbols.ARRAY_ELEMENT_TYPE, "array");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_array_element_type_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_array_element_type_execute(SubLObject arg) {
		return checkArray(arg).getElementType();
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_adjustable_array_p extends JavaPrimitive {
		/**  Constructor for the pf_adjustable_array_p object */
		pf_adjustable_array_p() {
			super(LispSymbols.ADJUSTABLE_ARRAY_P, "array");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_adjustable_array_p_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_adjustable_array_p_execute(SubLObject arg) {
		return checkArray(arg).isAdjustable() ? T : NIL;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_array_displacement extends JavaPrimitive {
		/**  Constructor for the pf_array_displacement object */
		pf_array_displacement() {
			super(LispSymbols.ARRAY_DISPLACEMENT, "array");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_array_displacement_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_array_displacement_execute(SubLObject arg) {
		return checkArray(arg).arrayDisplacement();
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_array_in_bounds_p extends JavaPrimitive {
		/**  Constructor for the pf_array_in_bounds_p object */
		pf_array_in_bounds_p() {
			super(LispSymbols.ARRAY_IN_BOUNDS_P, "array &rest subscripts");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		public SubLObject execute(SubLObject[] args) {
			return pf_array_in_bounds_p_execute(args);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_array_in_bounds_p_execute(SubLObject[] args) {
		if (args.length < 1) {
			return wrongNumberOfArguments();
		}
		final AbstractArray array;
		SubLObject r = args[0];
		array = checkArray(r);
		int rank = array.getRank();
		if (rank != args.length - 1) {
			StringBuilder sb = new StringBuilder("ARRAY-IN-BOUNDS-P: ");
			sb.append("wrong number of subscripts (");
			sb.append(args.length - 1);
			sb.append(") for array of rank ");
			sb.append(rank);
			error(new ProgramError(sb.toString()));
		}
		for (int i = 0; i < rank; i++) {
			SubLObject arg = args[i + 1];
			if (arg instanceof Fixnum) {
				int subscript = ((Fixnum) arg).value;
				if (subscript < 0 || subscript >= array.getDimension(i)) {
					return NIL;
				}
			} else if (arg instanceof Bignum) {
				return NIL;
			} else {
				type_error(arg, LispSymbols.INTEGER);
			}
		}
		return T;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf__array_row_major_index extends JavaPrimitive {
		/**  Constructor for the pf__array_row_major_index object */
		pf__array_row_major_index() {
			super("%array-row-major-index", PACKAGE_SYS, false);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__array_row_major_index_execute(first, second);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf__array_row_major_index_execute(SubLObject first, SubLObject second) {
		final AbstractArray array;
		array = checkArray(first);
		SubLObject[] subscripts = second.copyToArray();
		return number(array.getRowMajorIndex(subscripts));
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_aref extends JavaPrimitive {
		/**  Constructor for the pf_aref object */
		pf_aref() {
			super(LispSymbols.AREF, "array &rest subscripts");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		public SubLObject execute() {
			return pf_aref_execute();
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_aref_execute(arg);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_aref_execute(first, second);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_aref_execute(first, second, third);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		public SubLObject execute(SubLObject[] args) {
			return pf_aref_execute(args);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_aref_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject pf_aref_execute(SubLObject arg) {
		final AbstractArray array;
		array = checkArray(arg);
		if (array.getRank() == 0) {
			return array.AREF(0);
		}
		StringBuilder sb = new StringBuilder("Wrong number of subscripts (0) for array of rank ");
		sb.append(array.getRank());
		sb.append('.');
		return error(new ProgramError(sb.toString()));
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_aref_execute(SubLObject first, SubLObject second) {
		return first.AREF(second);
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @param  third   Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_aref_execute(SubLObject first, SubLObject second, SubLObject third) {
		return checkArray(first).get(new int[] { second.intValue(), third.intValue() });
	}

	@InlinableMethod
	static final public SubLObject pf_aref_execute(SubLObject[] args) {
		final AbstractArray array = checkArray(args[0]);
		final int[] subs = new int[args.length - 1];
		for (int i = subs.length; i-- > 0;) {
			subs[i] = args[i + 1].intValue();
		}
		return array.get(subs);
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_aset extends JavaPrimitive {
		/**  Constructor for the pf_aset object */
		pf_aset() {
			super("aset", PACKAGE_SYS, true, "array subscripts new-element");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_aset_execute(first, second);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_aset_execute(first, second, third);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		public SubLObject execute(SubLObject[] args) {
			return pf_aset_execute(args);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_aset_execute(SubLObject first, SubLObject second) {
		// Rank zero array.
		final ZeroRankArray array;
		if (first instanceof ZeroRankArray) {
			array = (ZeroRankArray) first;
		} else {
			return error(new TypeError("The value " + first.writeToString() + " is not an array of rank 0."));
		}
		array.aset(0, second);
		return second;
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @param  third   Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_aset_execute(SubLObject first, SubLObject second, SubLObject third) {
		first.aset(second, third);
		return third;
	}

	@InlinableMethod
	static final public SubLObject pf_aset_execute(SubLObject[] args) {
		final AbstractArray array = checkArray(args[0]);
		final int nsubs = args.length - 2;
		final int[] subs = new int[nsubs];
		for (int i = nsubs; i-- > 0;) {
			subs[i] = args[i + 1].intValue();
		}
		final SubLObject newValue = args[args.length - 1];
		array.set(subs, newValue);
		return newValue;
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_row_major_aref extends JavaPrimitive {
		/**  Constructor for the pf_row_major_aref object */
		pf_row_major_aref() {
			super(LispSymbols.ROW_MAJOR_AREF, "array index");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_row_major_aref_execute(first, second);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_row_major_aref_execute(SubLObject first, SubLObject second) {
		return checkArray(first).AREF(second.intValue());
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_vector extends JavaPrimitive {
		/**  Constructor for the pf_vector object */
		pf_vector() {
			super(LispSymbols.VECTOR, "&rest objects");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		public SubLObject execute(SubLObject[] args) {
			return pf_vector_execute(args);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_vector_execute(SubLObject[] args) {
		return makeSimpleVector(args);
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_fill_pointer extends JavaPrimitive {
		/**  Constructor for the pf_fill_pointer object */
		pf_fill_pointer() {
			super(LispSymbols.FILL_POINTER, "vector");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_fill_pointer_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_fill_pointer_execute(SubLObject arg) {
		if (arg instanceof AbstractArray) {
			AbstractArray aa = (AbstractArray) arg;
			if (aa.hasFillPointer()) {
				return LispObjectFactory.makeInteger(aa.getFillPointer());
			}
		}
		return type_error(arg, list(LispSymbols.AND, LispSymbols.VECTOR, list(LispSymbols.SATISFIES,
				LispSymbols.ARRAY_HAS_FILL_POINTER_P)));
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf__set_fill_pointer extends JavaPrimitive {
		/**  Constructor for the pf__set_fill_pointer object */
		pf__set_fill_pointer() {
			super("%set-fill-pointer", PACKAGE_SYS, true);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_fill_pointer_execute(first, second);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf__set_fill_pointer_execute(SubLObject first, SubLObject second) {

		if (first instanceof AbstractVector) {
			AbstractVector v = (AbstractVector) first;
			if (v.hasFillPointer()) {
				v.setFillPointer(second);
			} else {
				v.noFillPointer();
			}
			return second;
		}

		return type_error(first, list(LispSymbols.AND, LispSymbols.VECTOR, list(LispSymbols.SATISFIES,
				LispSymbols.ARRAY_HAS_FILL_POINTER_P)));
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_vector_push extends JavaPrimitive {
		/**  Constructor for the pf_vector_push object */
		pf_vector_push() {
			super(LispSymbols.VECTOR_PUSH, "new-element vector");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_vector_push_execute(first, second);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_vector_push_execute(SubLObject first, SubLObject second) {
		final AbstractVector v = checkVector(second);
		int fillPointer = v.getFillPointer();
		if (fillPointer < 0) {
			v.noFillPointer();
		}
		if (fillPointer >= v.capacity()) {
			return NIL;
		}
		v.aset(fillPointer, first);
		v.setFillPointer(fillPointer + 1);
		return LispObjectFactory.makeInteger(fillPointer);
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_vector_push_extend extends JavaPrimitive {
		/**  Constructor for the pf_vector_push_extend object */
		pf_vector_push_extend() {
			super(LispSymbols.VECTOR_PUSH_EXTEND, "new-element vector &optional extension");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_vector_push_extend_execute(first, second);
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_vector_push_extend_execute(first, second, third);
		}
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_vector_push_extend_execute(SubLObject first, SubLObject second) {
		return second.VECTOR_PUSH_EXTEND(first);
	}

	@InlinableMethod
	static final/**
							 *  Description of the Method
							 *
							 * @param  first   Description of Parameter
							 * @param  second  Description of Parameter
							 * @param  third   Description of Parameter
							 * @return         Description of the Returned Value
							 */
	public SubLObject pf_vector_push_extend_execute(SubLObject first, SubLObject second, SubLObject third) {
		return second.VECTOR_PUSH_EXTEND(first, third);
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	private static final class pf_vector_pop extends JavaPrimitive {
		/**  Constructor for the pf_vector_pop object */
		pf_vector_pop() {
			super(LispSymbols.VECTOR_POP, "vector");
		}

		//@override
		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return pf_vector_pop_execute(arg);
		}
	}

	@InlinableMethod
	static final public SubLObject pf_vector_pop_execute(SubLObject arg) {
		final AbstractVector v = checkVector(arg);
		int fillPointer = v.getFillPointer();
		if (fillPointer < 0) {
			v.noFillPointer();
		}
		if (fillPointer == 0) {
			error(new LispError("nothing left to pop"));
		}
		int newFillPointer = v.checkIndex(fillPointer - 1);
		SubLObject element = v.AREF(newFillPointer);
		v.setFillPointer(newFillPointer);
		return element;
	}

	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(ArrayFunctions.class);
	}
}
