//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class reader extends SubLTranslatedFile {
	public static class $read_token_native extends SubLStructNative {
		public $read_token_native() {
			$pointer = SubLNil.NIL;
			$buffer = SubLNil.NIL;
			$escapes = SubLNil.NIL;
		}

		public SubLObject $pointer;
		public SubLObject $buffer;
		public SubLObject $escapes;
		private static SubLStructDeclNative structDecl;
		static {
			structDecl = Structures.makeStructDeclNative($read_token_native.class, reader.$sym119$READ_TOKEN,
					reader.$sym120$READ_TOKEN_P, reader.$list121, reader.$list122,
					new String[] { "$pointer", "$buffer", "$escapes" }, reader.$list123, reader.$list124,
					reader.$sym12$DEFAULT_STRUCT_PRINT_FUNCTION);
		}

		@Override
		public SubLObject getField2() {
			return $pointer;
		}

		@Override
		public SubLObject getField3() {
			return $buffer;
		}

		@Override
		public SubLObject getField4() {
			return $escapes;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return $read_token_native.structDecl;
		}

		@Override
		public SubLObject setField2(SubLObject value) {
			return $pointer = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return $buffer = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return $escapes = value;
		}
	}

	public static class $read_token_p$UnaryFunction extends UnaryFunction {
		public $read_token_p$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("READ-TOKEN-P"));
		}

		@Override
		public SubLObject processItem(SubLObject arg1) {
			return reader.read_token_p(arg1);
		}
	}

	public static class $readtable_native extends SubLStructNative {
		public $readtable_native() {
			$case = SubLNil.NIL;
			$character_syntax = SubLNil.NIL;
			$single_byte_char_syntax = SubLNil.NIL;
			$macro_functions = SubLNil.NIL;
			$single_byte_macro_functions = SubLNil.NIL;
			$constituent_traits = SubLNil.NIL;
			$single_byte_constit_traits = SubLNil.NIL;
			$dispatch_tables = SubLNil.NIL;
		}

		public SubLObject $case;
		public SubLObject $character_syntax;
		public SubLObject $single_byte_char_syntax;
		public SubLObject $macro_functions;
		public SubLObject $single_byte_macro_functions;
		public SubLObject $constituent_traits;
		public SubLObject $single_byte_constit_traits;
		public SubLObject $dispatch_tables;
		private static SubLStructDeclNative structDecl;
		static {
			structDecl = Structures.makeStructDeclNative($readtable_native.class, reader.$sym6$READTABLE,
					reader.$sym7$READTABLE_P, reader.$list8, reader.$list9,
					new String[] { "$case", "$character_syntax", "$single_byte_char_syntax", "$macro_functions",
							"$single_byte_macro_functions", "$constituent_traits", "$single_byte_constit_traits",
							"$dispatch_tables" },
					reader.$list10, reader.$list11, reader.$sym12$DEFAULT_STRUCT_PRINT_FUNCTION);
		}

		@Override
		public SubLObject getField2() {
			return $case;
		}

		@Override
		public SubLObject getField3() {
			return $character_syntax;
		}

		@Override
		public SubLObject getField4() {
			return $single_byte_char_syntax;
		}

		@Override
		public SubLObject getField5() {
			return $macro_functions;
		}

		@Override
		public SubLObject getField6() {
			return $single_byte_macro_functions;
		}

		@Override
		public SubLObject getField7() {
			return $constituent_traits;
		}

		@Override
		public SubLObject getField8() {
			return $single_byte_constit_traits;
		}

		@Override
		public SubLObject getField9() {
			return $dispatch_tables;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return $readtable_native.structDecl;
		}

		@Override
		public SubLObject setField2(SubLObject value) {
			return $case = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return $character_syntax = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return $single_byte_char_syntax = value;
		}

		@Override
		public SubLObject setField5(SubLObject value) {
			return $macro_functions = value;
		}

		@Override
		public SubLObject setField6(SubLObject value) {
			return $single_byte_macro_functions = value;
		}

		@Override
		public SubLObject setField7(SubLObject value) {
			return $constituent_traits = value;
		}

		@Override
		public SubLObject setField8(SubLObject value) {
			return $single_byte_constit_traits = value;
		}

		@Override
		public SubLObject setField9(SubLObject value) {
			return $dispatch_tables = value;
		}
	}

	public static class $readtable_p$UnaryFunction extends UnaryFunction {
		public $readtable_p$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("READTABLE-P"));
		}

		@Override
		public SubLObject processItem(SubLObject arg1) {
			return reader.readtable_p(arg1);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject _csetf_read_token_buffer(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != read_token_p(object) : object;
		return object.setField3(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject _csetf_read_token_escapes(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != read_token_p(object) : object;
		return object.setField4(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject _csetf_read_token_pointer(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != read_token_p(object) : object;
		return object.setField2(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_case(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.setField2(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_character_syntax(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.setField3(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_constituent_traits(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.setField7(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_dispatch_tables(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.setField9(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_macro_functions(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.setField5(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_single_byte_char_syntax(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.setField4(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_single_byte_constit_traits(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.setField8(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_single_byte_macro_functions(SubLObject object, SubLObject value) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.setField6(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 32281L)
	public static SubLObject add_to_token(SubLObject ch, SubLObject token, SubLObject escapep) {
		SubLObject buffer = read_token_buffer(token);
		SubLObject length = Sequences.length(buffer);
		if (read_token_pointer(token).numGE(length)) {
			SubLObject new_buffer = Strings.make_string(Numbers.multiply(length, CommonSymbols.TWO_INTEGER),
					CommonSymbols.UNPROVIDED);
			SubLObject i;
			for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
					.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
				Strings.set_char(new_buffer, i, Strings.sublisp_char(buffer, i));
			_csetf_read_token_buffer(token, new_buffer);
		}
		Strings.set_char(read_token_buffer(token), read_token_pointer(token), ch);
		if (SubLNil.NIL != escapep)
			_csetf_read_token_escapes(token, ConsesLow.cons(read_token_pointer(token), read_token_escapes(token)));
		_csetf_read_token_pointer(token, Numbers.add(read_token_pointer(token), CommonSymbols.ONE_INTEGER));
		return ch;
	}

	@SubL(source = "sublisp/reader.lisp", position = 11909L)
	public static SubLObject alphabetic_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return SubLObjectFactory
				.makeBoolean(
						Numbers.logand(
								reader.$alphabetic$
										.getGlobalValue(),
								character_traits(ch,
										reader.$readtable$
												.getDynamicValue(
														thread)))
								.isPositive()
								&& (!Numbers
										.logand(reader.$digit$.getGlobalValue(),
												character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
										.isPositive()
										|| SubLNil.NIL == Characters.digit_char_p(ch,
												reader.$read_base$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 12761L)
	public static SubLObject alphadigit_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return SubLObjectFactory.makeBoolean(Numbers
				.logand(reader.$alphabetic$.getGlobalValue(),
						character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
				.isPositive()
				&& Numbers.logand(reader.$digit$.getGlobalValue(),
						character_traits(ch, reader.$readtable$.getDynamicValue(thread))).isPositive());
	}

	@SubL(source = "sublisp/reader.lisp", position = 63550L)
	public static SubLObject backquote_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = SubLNil.NIL;
		SubLObject _prev_bind_0 = reader.$backquote_depth$.currentBinding(thread);
		try {
			reader.$backquote_depth$.bind(
					Numbers.add(reader.$backquote_depth$.getDynamicValue(thread), CommonSymbols.ONE_INTEGER), thread);
			thread.resetMultipleValues();
			SubLObject flag = backquotify(stream, read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T));
			SubLObject thing = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (flag.eql(reader.$bq_atsign$.getDynamicValue(thread))
					|| flag.eql(reader.$bq_dot$.getDynamicValue(thread)))
				simple_reader_error(reader.$str205$_A_read_after_backquote_in__S_, ConsesLow.list(flag, thing));
			result = backquotify_1(flag, thing);
		} finally {
			reader.$backquote_depth$.rebind(_prev_bind_0, thread);
		}
		return Values.values(result, reader.$sym187$LIST);
	}

	@SubL(source = "sublisp/reader.lisp", position = 60123L)
	public static SubLObject backquotify(SubLObject stream, SubLObject code) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (code.isAtom()) {
			if (SubLNil.NIL == code)
				return Values.values(SubLNil.NIL, SubLNil.NIL);
			if (SubLNil.NIL != self_evaluating_atom_p(code))
				return Values.values(CommonSymbols.T, code);
			return Values.values(reader.$sym184$QUOTE, code);
		} else {
			if (code.first().eql(reader.$bq_atsign$.getDynamicValue(thread))
					|| code.first().eql(reader.$bq_dot$.getDynamicValue(thread)))
				return Values.values(code.first(), code.rest());
			if (code.first().eql(reader.$bq_comma$.getDynamicValue(thread))) {
				thread.resetMultipleValues();
				SubLObject flag = comma(code.rest());
				SubLObject thing = thread.secondMultipleValue();
				thread.resetMultipleValues();
				return Values.values(flag, thing);
			}
			if (code.first().eql(reader.$bq_vector$.getDynamicValue(thread))) {
				thread.resetMultipleValues();
				SubLObject dflag = backquotify(stream, code.rest());
				SubLObject d = thread.secondMultipleValue();
				thread.resetMultipleValues();
				return Values.values(reader.$sym191$VECTOR, backquotify_1(dflag, d));
			}
			thread.resetMultipleValues();
			SubLObject aflag = backquotify(stream, code.first());
			SubLObject a = thread.secondMultipleValue();
			thread.resetMultipleValues();
			thread.resetMultipleValues();
			SubLObject dflag2 = backquotify(stream, code.rest());
			SubLObject d2 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (dflag2.eql(reader.$bq_atsign$.getDynamicValue(thread))
					|| dflag2.eql(reader.$bq_dot$.getDynamicValue(thread)))
				simple_reader_error(reader.$str198$_A_after_dot_in__S_, ConsesLow.list(dflag2, code));
			if (aflag.eql(reader.$bq_atsign$.getDynamicValue(thread)))
				return Values.values(reader.$sym189$APPEND, dflag2 == reader.$sym189$APPEND ? ConsesLow.cons(a, d2)
						: ConsesLow.list(a, backquotify_1(dflag2, d2)));
			if (aflag.eql(reader.$bq_dot$.getDynamicValue(thread)))
				return Values.values(reader.$sym190$NCONC, dflag2 == reader.$sym190$NCONC ? ConsesLow.cons(a, d2)
						: ConsesLow.list(a, backquotify_1(dflag2, d2)));
			if (SubLNil.NIL == dflag2) {
				if (SubLNil.NIL != conses_high.member(aflag, reader.$list199, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED))
					return Values.values(reader.$sym184$QUOTE, ConsesLow.list(a));
				return Values.values(reader.$sym187$LIST, ConsesLow.list(backquotify_1(aflag, a)));
			} else if (dflag2 == reader.$sym184$QUOTE || dflag2 == CommonSymbols.T) {
				if (SubLNil.NIL != conses_high.member(aflag, reader.$list199, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED))
					return Values.values(reader.$sym184$QUOTE, ConsesLow.cons(a, d2));
				return Values.values(reader.$sym188$LIST_,
						ConsesLow.list(backquotify_1(aflag, a), backquotify_1(dflag2, d2)));
			} else {
				a = backquotify_1(aflag, a);
				if (dflag2 == reader.$sym187$LIST || dflag2 == reader.$sym188$LIST_)
					return Values.values(dflag2, ConsesLow.cons(a, d2));
				return Values.values(reader.$sym188$LIST_, ConsesLow.list(a, backquotify_1(dflag2, d2)));
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 62912L)
	public static SubLObject backquotify_1(SubLObject flag, SubLObject thing) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (flag.eql(reader.$bq_comma$.getDynamicValue(thread)) || flag == CommonSymbols.T || flag == SubLNil.NIL)
			return thing;
		if (flag == reader.$sym184$QUOTE)
			return ConsesLow.list(reader.$sym184$QUOTE, thing);
		if (flag == reader.$sym188$LIST_) {
			if (SubLNil.NIL != conses_high.cddr(thing))
				return ConsesLow.cons(reader.$sym202$BQ_LIST_, thing);
			return ConsesLow.cons(reader.$sym203$BQ_CONS, thing);
		} else {
			if (flag == reader.$sym191$VECTOR)
				return ConsesLow.list(reader.$sym192$BQ_VECTOR, thing);
			return ConsesLow.cons(
					conses_high.assoc(flag, reader.$list204, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest(),
					thing);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 58059L)
	public static SubLObject bq_append(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject lists;
		SubLObject current = lists = datum;
		return bq_cons(reader.$sym189$APPEND, ConsesLow.append(lists, SubLNil.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 57755L)
	public static SubLObject bq_cons(SubLObject car, SubLObject cdr) {
		return ConsesLow.cons(car, cdr);
	}

	@SubL(source = "sublisp/reader.lisp", position = 57935L)
	public static SubLObject bq_list(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject objects;
		SubLObject current = objects = datum;
		return bq_cons(reader.$sym187$LIST, ConsesLow.append(objects, SubLNil.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 57996L)
	public static SubLObject bq_listX(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject objects;
		SubLObject current = objects = datum;
		return bq_cons(reader.$sym188$LIST_, ConsesLow.append(objects, SubLNil.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 58120L)
	public static SubLObject bq_nconc(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject lists;
		SubLObject current = lists = datum;
		return bq_cons(reader.$sym190$NCONC, ConsesLow.append(lists, SubLNil.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 58179L)
	public static SubLObject bq_vector(SubLObject contents) {
		return Functions.apply(Symbols.symbol_function(reader.$sym191$VECTOR), contents);
	}

	@SubL(source = "sublisp/reader.lisp", position = 58243L)
	public static SubLObject bq_vector_append(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject lists;
		SubLObject current = lists = datum;
		return ConsesLow.list(reader.$sym192$BQ_VECTOR,
				bq_cons(reader.$sym193$BQ_APPEND, ConsesLow.append(lists, SubLNil.NIL)));
	}

	@SubL(source = "sublisp/reader.lisp", position = 10130L)
	public static SubLObject character_function(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (SubLNil.NIL != single_byte_p(ch))
			return Vectors.aref(readtable_single_byte_macro_functions(readtable), Characters.char_code(ch));
		SubLObject func = Hashtables.gethash(ch, readtable_macro_functions(readtable), CommonSymbols.UNPROVIDED);
		return SubLNil.NIL != func ? func : reader.$sym50$CONSTITUENT_RMF;
	}

	@SubL(source = "sublisp/reader.lisp", position = 8992L)
	public static SubLObject character_syntax(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject ch = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list51);
		ch = current.first();
		current = current.rest();
		SubLObject readtable = current.isCons() ? current.first() : reader.$sym52$_READTABLE_;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, reader.$list51);
		current = current.rest();
		if (SubLNil.NIL == current)
			return ConsesLow.list(reader.$sym53$FIF, ConsesLow.list(reader.$sym54$SINGLE_BYTE_P, ch),
					ConsesLow.list(reader.$sym55$AREF,
							ConsesLow.list(reader.$sym19$READTABLE_SINGLE_BYTE_CHAR_SYNTAX, readtable),
							ConsesLow.list(reader.$sym56$CHAR_CODE, ch)),
					ConsesLow.listS(reader.$sym57$GETHASH, ch,
							ConsesLow.list(reader.$sym17$READTABLE_CHARACTER_SYNTAX, readtable), reader.$list58));
		cdestructuring_bind.cdestructuring_bind_error(datum, reader.$list51);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 10748L)
	public static SubLObject character_traits(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		return SubLNil.NIL != single_byte_p(ch)
				? Vectors.aref(readtable_single_byte_constit_traits(readtable), Characters.char_code(ch))
				: Hashtables.gethash(ch, readtable_constituent_traits(readtable), reader.$alphabetic$.getGlobalValue());
	}

	@SubL(source = "sublisp/reader.lisp", position = 62098L)
	public static SubLObject comma(SubLObject code) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (code.isAtom()) {
			if (SubLNil.NIL == code)
				return Values.values(SubLNil.NIL, SubLNil.NIL);
			if (SubLNil.NIL != self_evaluating_atom_p(code))
				return Values.values(CommonSymbols.T, code);
			return Values.values(reader.$bq_comma$.getDynamicValue(thread), code);
		} else {
			if (code.first() == reader.$sym184$QUOTE)
				return Values.values(code.first(), conses_high.cadr(code));
			if (SubLNil.NIL != conses_high.member(code.first(), reader.$list200, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				return Values.values(code.first(), code.rest());
			if (code.first() == reader.$sym201$CONS)
				return Values.values(reader.$sym188$LIST_, code.rest());
			return Values.values(reader.$bq_comma$.getDynamicValue(thread), code);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 63976L)
	public static SubLObject comma_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (!reader.$backquote_depth$.getDynamicValue(thread).isZero()) {
			SubLObject peek_char = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
			SubLObject result = SubLNil.NIL;
			SubLObject _prev_bind_0 = reader.$backquote_depth$.currentBinding(thread);
			try {
				reader.$backquote_depth$.bind(
						Numbers.subtract(reader.$backquote_depth$.getDynamicValue(thread), CommonSymbols.ONE_INTEGER),
						thread);
				SubLObject pcase_var = peek_char;
				if (pcase_var.eql(Characters.CHAR_at))
					result = ConsesLow.cons(reader.$bq_atsign$.getDynamicValue(thread),
							read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T));
				else if (pcase_var.eql(Characters.CHAR_period))
					result = ConsesLow.cons(reader.$bq_dot$.getDynamicValue(thread),
							read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T));
				else {
					streams_high.unread_char(peek_char, stream);
					result = ConsesLow.cons(reader.$bq_comma$.getDynamicValue(thread),
							read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T));
				}
			} finally {
				reader.$backquote_depth$.rebind(_prev_bind_0, thread);
			}
			return Values.values(result, reader.$sym187$LIST);
		}
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		simple_reader_error(reader.$str206$_S_read_outside_a_backquote_, ConsesLow.list(ch));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 52675L)
	public static SubLObject constituent_rmf(SubLObject stream, SubLObject ch) {
		SubLObject token = make_read_token(CommonSymbols.UNPROVIDED);
		_csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		_csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		_csetf_read_token_escapes(token, SubLNil.NIL);
		add_to_token(ch, token, SubLNil.NIL);
		return Values.values(parse_token(stream, read_token(stream, token, SubLNil.NIL)), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 10048L)
	public static SubLObject constituent_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(
				SubLNil.NIL != single_byte_p(ch)
						? Vectors.aref(readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
								Characters.char_code(ch))
						: Hashtables.gethash(ch, readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
								reader.$kw49$CONSTITUENT),
				reader.$kw49$CONSTITUENT);
	}

	@SubL(source = "sublisp/reader.lisp", position = 13018L)
	public static SubLObject copy_readtable(SubLObject from_readtable, SubLObject to_readtable) {
		if (from_readtable == CommonSymbols.UNPROVIDED)
			from_readtable = reader.$readtable$.getDynamicValue();
		if (to_readtable == CommonSymbols.UNPROVIDED)
			to_readtable = SubLNil.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == from_readtable)
			from_readtable = reader.$standard_readtable$.getDynamicValue(thread);
		if (SubLNil.NIL != to_readtable) {
			Hashtables.clrhash(readtable_character_syntax(to_readtable));
			Hashtables.clrhash(readtable_macro_functions(to_readtable));
			Hashtables.clrhash(readtable_constituent_traits(to_readtable));
		} else
			to_readtable = create_readtable();
		_csetf_readtable_case(to_readtable, readtable_case(from_readtable));
		Xcopy_hash_table(readtable_character_syntax(from_readtable), readtable_character_syntax(to_readtable));
		Xcopy_hash_table(readtable_macro_functions(from_readtable), readtable_macro_functions(to_readtable));
		Xcopy_hash_table(readtable_constituent_traits(from_readtable), readtable_constituent_traits(to_readtable));
		SubLObject i;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(reader.$single_byte_max_code$.getGlobalValue()); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			Vectors.set_aref(readtable_single_byte_char_syntax(to_readtable), i,
					Vectors.aref(readtable_single_byte_char_syntax(from_readtable), i));
			Vectors.set_aref(readtable_single_byte_macro_functions(to_readtable), i,
					Vectors.aref(readtable_single_byte_macro_functions(from_readtable), i));
			Vectors.set_aref(readtable_single_byte_constit_traits(to_readtable), i,
					Vectors.aref(readtable_single_byte_constit_traits(from_readtable), i));
		}
		SubLObject dispatch_table = SubLNil.NIL;
		SubLObject cdolist_list_var = readtable_dispatch_tables(from_readtable);
		SubLObject bucket = SubLNil.NIL;
		bucket = cdolist_list_var.first();
		while (SubLNil.NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = bucket;
			SubLObject ch = SubLNil.NIL;
			SubLObject table = SubLNil.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list69);
			ch = current.first();
			current = table = current.rest();
			dispatch_table = ConsesLow.cons(
					ConsesLow
							.cons(ch,
									Xcopy_hash_table(table,
											Hashtables.make_hash_table(Hashtables.hash_table_count(table),
													CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))),
					dispatch_table);
			cdolist_list_var = cdolist_list_var.rest();
			bucket = cdolist_list_var.first();
		}
		_csetf_readtable_dispatch_tables(to_readtable, dispatch_table);
		return to_readtable;
	}

	@SubL(source = "sublisp/reader.lisp", position = 8031L)
	public static SubLObject create_readtable() {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject readtable = make_readtable(CommonSymbols.UNPROVIDED);
		_csetf_readtable_case(readtable, reader.$kw48$UPCASE);
		_csetf_readtable_character_syntax(readtable,
				Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		_csetf_readtable_single_byte_char_syntax(readtable,
				Vectors.make_vector(reader.$single_byte_max_code$.getGlobalValue(), reader.$kw49$CONSTITUENT));
		_csetf_readtable_macro_functions(readtable,
				Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		_csetf_readtable_single_byte_macro_functions(readtable,
				Vectors.make_vector(reader.$single_byte_max_code$.getGlobalValue(), reader.$sym50$CONSTITUENT_RMF));
		_csetf_readtable_constituent_traits(readtable,
				Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		_csetf_readtable_single_byte_constit_traits(readtable, Vectors
				.make_vector(reader.$single_byte_max_code$.getGlobalValue(), reader.$alphabetic$.getGlobalValue()));
		_csetf_readtable_dispatch_tables(readtable, SubLNil.NIL);
		return readtable;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12471L)
	public static SubLObject decimal_point_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$decimal_point$.getGlobalValue(),
				character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	public static SubLObject declare_reader_file() {
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "loop", "LOOP");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "whitespace_1_char_p",
				"WHITESPACE-1-CHAR-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "whitespace_2_char_p",
				"WHITESPACE-2-CHAR-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_print_function_trampoline", "READTABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_p", "READTABLE-P",
				1, 0, false);
		new $readtable_p$UnaryFunction();
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_case",
				"READTABLE-CASE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_character_syntax",
				"READTABLE-CHARACTER-SYNTAX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_single_byte_char_syntax", "READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_macro_functions",
				"READTABLE-MACRO-FUNCTIONS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_single_byte_macro_functions", "READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_constituent_traits", "READTABLE-CONSTITUENT-TRAITS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_single_byte_constit_traits", "READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_dispatch_tables",
				"READTABLE-DISPATCH-TABLES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "_csetf_readtable_case",
				"_CSETF-READTABLE-CASE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_character_syntax", "_CSETF-READTABLE-CHARACTER-SYNTAX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_single_byte_char_syntax", "_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_macro_functions", "_CSETF-READTABLE-MACRO-FUNCTIONS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_single_byte_macro_functions", "_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_constituent_traits", "_CSETF-READTABLE-CONSTITUENT-TRAITS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_single_byte_constit_traits", "_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_dispatch_tables", "_CSETF-READTABLE-DISPATCH-TABLES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "make_readtable",
				"MAKE-READTABLE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "visit_defstruct_readtable",
				"VISIT-DEFSTRUCT-READTABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"visit_defstruct_object_readtable_method", "VISIT-DEFSTRUCT-OBJECT-READTABLE-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "create_readtable",
				"CREATE-READTABLE", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "single_byte_p",
				"SINGLE-BYTE-P", 1, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "character_syntax",
				"CHARACTER-SYNTAX");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_character_syntax",
				"SET-CHARACTER-SYNTAX", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "invalid_syntaxp",
				"INVALID-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "terminating_macro_syntaxp",
				"TERMINATING-MACRO-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"non_terminating_macro_syntaxp", "NON-TERMINATING-MACRO-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "multiple_escape_syntaxp",
				"MULTIPLE-ESCAPE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "single_escape_syntaxp",
				"SINGLE-ESCAPE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "whitespace_syntaxp",
				"WHITESPACE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "constituent_syntaxp",
				"CONSTITUENT-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "character_function",
				"CHARACTER-FUNCTION", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_character_function",
				"SET-CHARACTER-FUNCTION", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "character_traits",
				"CHARACTER-TRAITS", 1, 1, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "has_traitp", "HAS-TRAITP");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_trait", "SET-TRAIT", 3,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "reset_trait", "RESET-TRAIT",
				1, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "alphabetic_traitp",
				"ALPHABETIC-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "digit_traitp",
				"DIGIT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "package_marker_traitp",
				"PACKAGE-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "plus_sign_traitp",
				"PLUS-SIGN-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "minus_sign_traitp",
				"MINUS-SIGN-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "dot_traitp", "DOT-TRAITP", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "decimal_point_traitp",
				"DECIMAL-POINT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "ratio_marker_traitp",
				"RATIO-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "exponent_marker_traitp",
				"EXPONENT-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "invalid_traitp",
				"INVALID-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "alphadigit_traitp",
				"ALPHADIGIT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "Xcopy_hash_table",
				"%COPY-HASH-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "copy_readtable",
				"COPY-READTABLE", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"make_dispatch_macro_character", "MAKE-DISPATCH-MACRO-CHARACTER", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtablep", "READTABLEP", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"set_dispatch_macro_character", "SET-DISPATCH-MACRO-CHARACTER", 3, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"get_dispatch_macro_character", "GET-DISPATCH-MACRO-CHARACTER", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "get_macro_character",
				"GET-MACRO-CHARACTER", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_macro_character",
				"SET-MACRO-CHARACTER", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_syntax_from_char",
				"SET-SYNTAX-FROM-CHAR", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_syntax", "SET-SYNTAX", 3,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "simple_reader_error",
				"SIMPLE-READER-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "end_of_file_error",
				"END-OF-FILE-ERROR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "invalid_token_syntax_error",
				"INVALID-TOKEN-SYNTAX-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"unimplemented_reader_macro_error", "UNIMPLEMENTED-READER-MACRO-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "unnecessary_argument_error",
				"UNNECESSARY-ARGUMENT-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "illegal_argument_error",
				"ILLEGAL-ARGUMENT-ERROR", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_internal",
				"READ-INTERNAL", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_preserving_whitespace",
				"READ-PRESERVING-WHITESPACE", 0, 4, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read", "READ", 0, 4, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_delimited_list",
				"READ-DELIMITED-LIST", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_from_string",
				"READ-FROM-STRING", 1, 5, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "with_standard_io_syntax",
				"WITH-STANDARD-IO-SYNTAX");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"with_special_reader_error_handling", "WITH-SPECIAL-READER-ERROR-HANDLING");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_ignoring_errors",
				"READ-IGNORING-ERRORS", 0, 3, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"read_from_string_ignoring_errors", "READ-FROM-STRING-IGNORING-ERRORS", 1, 4, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"read_token_print_function_trampoline", "READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_p",
				"READ-TOKEN-P", 1, 0, false);
		new $read_token_p$UnaryFunction();
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_pointer",
				"READ-TOKEN-POINTER", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_buffer",
				"READ-TOKEN-BUFFER", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_escapes",
				"READ-TOKEN-ESCAPES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "_csetf_read_token_pointer",
				"_CSETF-READ-TOKEN-POINTER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "_csetf_read_token_buffer",
				"_CSETF-READ-TOKEN-BUFFER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "_csetf_read_token_escapes",
				"_CSETF-READ-TOKEN-ESCAPES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "make_read_token",
				"MAKE-READ-TOKEN", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "visit_defstruct_read_token",
				"VISIT-DEFSTRUCT-READ-TOKEN", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"visit_defstruct_object_read_token_method", "VISIT-DEFSTRUCT-OBJECT-READ-TOKEN-METHOD", 2, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "with_read_token",
				"WITH-READ-TOKEN");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "add_to_token",
				"ADD-TO-TOKEN", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_string",
				"READ-TOKEN-STRING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token", "READ-TOKEN", 3,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "potential_number_p",
				"POTENTIAL-NUMBER-P", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "parse_token", "PARSE-TOKEN",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "symbol_escapep",
				"SYMBOL-ESCAPEP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "reader_find_package",
				"READER-FIND-PACKAGE", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "frob_case", "FROB-CASE", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "parse_symbol_or_consing_dot",
				"PARSE-SYMBOL-OR-CONSING-DOT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "float_parse_integer",
				"FLOAT-PARSE-INTEGER", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "parse_number",
				"PARSE-NUMBER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "parse_integer",
				"PARSE-INTEGER", 1, 4, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "whitespace_rmf",
				"WHITESPACE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "constituent_rmf",
				"CONSTITUENT-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "invalid_rmf", "INVALID-RMF",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "single_escape_rmf",
				"SINGLE-ESCAPE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "multiple_escape_rmf",
				"MULTIPLE-ESCAPE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_capital_g_rmf",
				"SHARPSIGN-CAPITAL-G-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "left_paren_rmf",
				"LEFT-PAREN-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "right_paren_rmf",
				"RIGHT-PAREN-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "single_quote_rmf",
				"SINGLE-QUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "semicolon_rmf",
				"SEMICOLON-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "double_quote_rmf",
				"DOUBLE-QUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_cons", "BQ-CONS", 2, 0,
				false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_list", "BQ-LIST");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_listX", "BQ-LIST*");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_append", "BQ-APPEND");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_nconc", "BQ-NCONC");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_vector", "BQ-VECTOR", 1,
				0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_vector_append",
				"BQ-VECTOR-APPEND");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "backquotify", "BACKQUOTIFY",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "comma", "COMMA", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "self_evaluating_atom_p",
				"SELF-EVALUATING-ATOM-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "backquotify_1",
				"BACKQUOTIFY-1", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "backquote_rmf",
				"BACKQUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "comma_rmf", "COMMA-RMF", 2,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "dispatching_rmf",
				"DISPATCHING-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_backslash_rmf",
				"SHARPSIGN-BACKSLASH-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_single_quote_rmf",
				"SHARPSIGN-SINGLE-QUOTE-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_left_paren_rmf",
				"SHARPSIGN-LEFT-PAREN-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_asterisk_rmf",
				"SHARPSIGN-ASTERISK-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_colon_rmf",
				"SHARPSIGN-COLON-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_dot_rmf",
				"SHARPSIGN-DOT-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_number_in_radix",
				"READ-NUMBER-IN-RADIX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_b_rmf",
				"SHARPSIGN-B-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_o_rmf",
				"SHARPSIGN-O-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_x_rmf",
				"SHARPSIGN-X-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_r_rmf",
				"SHARPSIGN-R-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_c_rmf",
				"SHARPSIGN-C-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_a_rmf",
				"SHARPSIGN-A-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_s_rmf",
				"SHARPSIGN-S-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_p_rmf",
				"SHARPSIGN-P-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_lookup", "READ-LOOKUP",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_read_lookup",
				"SET-READ-LOOKUP", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_equals_rmf",
				"SHARPSIGN-EQUALS-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_sharpsign_rmf",
				"SHARPSIGN-SHARPSIGN-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "features_match",
				"FEATURES-MATCH", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "fix_features",
				"FIX-FEATURES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_features",
				"READ-FEATURES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_plus_rmf",
				"SHARPSIGN-PLUS-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_minus_rmf",
				"SHARPSIGN-MINUS-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_vertical_bar_rmf",
				"SHARPSIGN-VERTICAL-BAR-RMF", 3, 0, false);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12092L)
	public static SubLObject digit_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return SubLObjectFactory.makeBoolean(Numbers
				.logand(reader.$digit$.getGlobalValue(),
						character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
				.isPositive()
				&& SubLNil.NIL != Characters.digit_char_p(ch, reader.$read_base$.getDynamicValue(thread)));
	}

	@SubL(source = "sublisp/reader.lisp", position = 64612L)
	public static SubLObject dispatching_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject arg = SubLNil.NIL;
		SubLObject next_ch;
		for (next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED); SubLNil.NIL != Characters.digit_char_p(next_ch,
						CommonSymbols.TEN_INTEGER); next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)) {
			if (SubLNil.NIL == arg)
				arg = CommonSymbols.ZERO_INTEGER;
			arg = Numbers.add(Numbers.multiply(arg, CommonSymbols.TEN_INTEGER),
					Characters.digit_char_p(next_ch, CommonSymbols.TEN_INTEGER));
		}
		SubLObject function = get_dispatch_macro_character(ch, next_ch, CommonSymbols.UNPROVIDED);
		if (SubLNil.NIL != function) {
			thread.resetMultipleValues();
			SubLObject value = Functions.funcall(function, stream, next_ch, arg);
			SubLObject goodp = thread.secondMultipleValue();
			thread.resetMultipleValues();
			return Values.values(value, goodp);
		}
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		simple_reader_error(reader.$str207$Undefined_reader_macro__A_A_, ConsesLow.list(ch, next_ch));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12416L)
	public static SubLObject dot_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$dot$.getGlobalValue(),
				character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 56839L)
	public static SubLObject double_quote_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject state = reader.$kw185$NORMAL;
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread)) {
			while (true) {
				SubLObject next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				SubLObject pcase_var = state;
				if (pcase_var.eql(reader.$kw185$NORMAL)) {
					if (SubLNil.NIL != Characters.charE(next_ch, ch))
						break;
					if (SubLNil.NIL == single_escape_syntaxp(next_ch))
						continue;
					state = reader.$kw186$ESCAPE;
				} else {
					if (!pcase_var.eql(reader.$kw186$ESCAPE))
						continue;
					state = reader.$kw185$NORMAL;
				}
			}
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		}
		SubLObject token = make_read_token(CommonSymbols.UNPROVIDED);
		_csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		_csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		_csetf_read_token_escapes(token, SubLNil.NIL);
		while (true) {
			SubLObject next_ch2 = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
			SubLObject pcase_var2 = state;
			if (pcase_var2.eql(reader.$kw185$NORMAL)) {
				if (SubLNil.NIL != Characters.charE(next_ch2, ch))
					break;
				if (SubLNil.NIL != single_escape_syntaxp(next_ch2))
					state = reader.$kw186$ESCAPE;
				else
					add_to_token(next_ch2, token, SubLNil.NIL);
			} else {
				if (!pcase_var2.eql(reader.$kw186$ESCAPE))
					continue;
				add_to_token(next_ch2, token, SubLNil.NIL);
				state = reader.$kw185$NORMAL;
			}
		}
		return Values.values(read_token_string(token), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 23444L)
	public static SubLObject end_of_file_error(SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$throw_end_of_file_p$.getDynamicValue(thread))
			Dynamic.sublisp_throw(reader.$sym108$END_OF_FILE, CommonSymbols.T);
		else
			simple_reader_error(reader.$str109$End_of_file_on_stream__S_, ConsesLow.list(stream));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12619L)
	public static SubLObject exponent_marker_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$exponent_marker$.getGlobalValue(),
				character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 72418L)
	public static SubLObject features_match(SubLObject feature) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (!feature.isCons())
			return conses_high.member(feature, reader.$features$.getDynamicValue(thread), CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
		SubLObject pcase_var = feature.first();
		if (pcase_var.eql(reader.$kw216$NOT)) {
			if (SubLNil.NIL != conses_high.cddr(feature))
				simple_reader_error(reader.$str217$Bogus_feature_expression__S_, ConsesLow.list(feature));
			return SubLObjectFactory.makeBoolean(SubLNil.NIL == features_match(conses_high.cadr(feature)));
		}
		if (pcase_var.eql(reader.$kw218$AND)) {
			SubLObject cdolist_list_var = feature.rest();
			SubLObject subfeature = SubLNil.NIL;
			subfeature = cdolist_list_var.first();
			while (SubLNil.NIL != cdolist_list_var) {
				if (SubLNil.NIL == features_match(subfeature))
					return SubLNil.NIL;
				cdolist_list_var = cdolist_list_var.rest();
				subfeature = cdolist_list_var.first();
			}
			return CommonSymbols.T;
		}
		if (pcase_var.eql(reader.$kw219$OR)) {
			SubLObject cdolist_list_var = feature.rest();
			SubLObject subfeature = SubLNil.NIL;
			subfeature = cdolist_list_var.first();
			while (SubLNil.NIL != cdolist_list_var) {
				if (SubLNil.NIL != features_match(subfeature))
					return CommonSymbols.T;
				cdolist_list_var = cdolist_list_var.rest();
				subfeature = cdolist_list_var.first();
			}
			return SubLNil.NIL;
		}
		simple_reader_error(reader.$str220$Unknown_feature_operator__S_, ConsesLow.list(feature.first()));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 73066L)
	public static SubLObject fix_features(SubLObject features) {
		if (SubLNil.NIL == features)
			return features;
		if (features.isSymbol())
			return Symbols.make_keyword(features);
		if (features.isCons())
			return ConsesLow.cons(fix_features(features.first()), fix_features(features.rest()));
		return features;
	}

	@SubL(source = "sublisp/reader.lisp", position = 44896L)
	public static SubLObject float_parse_integer(SubLObject string, SubLObject start, SubLObject end,
			SubLObject radix) {
		SubLObject value = SubLNil.NIL;
		SubLObject i;
		SubLObject digit;
		for (i = SubLNil.NIL, i = start; !i.numGE(end); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			digit = Characters.digit_char_p(Strings.sublisp_char(string, i), radix);
			value = Numbers.add(Numbers.multiply(SubLNil.NIL != value ? value : reader.$float153$0_0, radix),
					Numbers.sublisp_float(digit, CommonSymbols.UNPROVIDED));
		}
		return value;
	}

	@SubL(source = "sublisp/reader.lisp", position = 39523L)
	public static SubLObject frob_case(SubLObject token) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject frobber = SubLNil.NIL;
		SubLObject pcase_var = readtable_case(reader.$readtable$.getDynamicValue(thread));
		if (!pcase_var.eql(reader.$kw147$PRESERVE))
			if (pcase_var.eql(reader.$kw48$UPCASE))
				frobber = reader.$kw48$UPCASE;
			else if (pcase_var.eql(reader.$kw145$DOWNCASE))
				frobber = reader.$kw145$DOWNCASE;
			else if (pcase_var.eql(reader.$kw148$INVERT)) {
				SubLObject buffer = read_token_buffer(token);
				SubLObject escapes = read_token_escapes(token);
				SubLObject upcase = SubLNil.NIL;
				SubLObject downcase = SubLNil.NIL;
				SubLObject cdotimes_end_var;
				SubLObject i;
				SubLObject escape_idx;
				SubLObject ch;
				for (cdotimes_end_var = read_token_pointer(
						token), i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
								.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
					escape_idx = escapes.first();
					if (SubLNil.NIL != escape_idx && escape_idx.numE(i))
						escapes = escapes.rest();
					else {
						ch = Strings.sublisp_char(buffer, i);
						if (SubLNil.NIL == Characters.charE(ch, Characters.char_downcase(ch)))
							upcase = CommonSymbols.T;
						if (SubLNil.NIL == Characters.charE(ch, Characters.char_upcase(ch)))
							downcase = CommonSymbols.T;
					}
				}
				if (SubLNil.NIL == upcase || SubLNil.NIL == downcase)
					if (SubLNil.NIL != upcase)
						frobber = reader.$kw145$DOWNCASE;
					else if (SubLNil.NIL != downcase)
						frobber = reader.$kw48$UPCASE;
			}
		if (SubLNil.NIL != frobber) {
			SubLObject buffer = read_token_buffer(token);
			SubLObject escapes = read_token_escapes(token);
			SubLObject cdotimes_end_var2;
			SubLObject j;
			SubLObject escape_idx2;
			SubLObject curr;
			for (cdotimes_end_var2 = read_token_pointer(token), j = SubLNil.NIL, j = CommonSymbols.ZERO_INTEGER; j
					.numL(cdotimes_end_var2); j = Numbers.add(j, CommonSymbols.ONE_INTEGER)) {
				escape_idx2 = escapes.first();
				if (SubLNil.NIL != escape_idx2 && escape_idx2.numE(j))
					escapes = escapes.rest();
				else {
					curr = Strings.sublisp_char(buffer, j);
					if (frobber == reader.$kw48$UPCASE)
						Strings.set_char(buffer, j, Characters.char_upcase(curr));
					else
						Strings.set_char(buffer, j, Characters.char_downcase(curr));
				}
			}
		}
		return token;
	}

	@SubL(source = "sublisp/reader.lisp", position = 15884L)
	public static SubLObject get_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char,
			SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		SubLObject bucket = conses_high.assoc(disp_char, readtable_dispatch_tables(readtable), CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
		if (SubLNil.NIL == bucket)
			Errors.error(reader.$str73$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);
		return Hashtables.gethash(Characters.char_upcase(sub_char), bucket.rest(), CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/reader.lisp", position = 16229L)
	public static SubLObject get_macro_character(SubLObject v_char, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		SubLObject syntax = SubLNil.NIL != single_byte_p(v_char)
				? Vectors.aref(readtable_single_byte_char_syntax(readtable), Characters.char_code(v_char))
				: Hashtables.gethash(v_char, readtable_character_syntax(readtable), reader.$kw49$CONSTITUENT);
		if (syntax == reader.$kw60$TERMINATING_MACRO || syntax == reader.$kw61$NON_TERMINATING_MACRO)
			return Values.values(character_function(v_char, readtable),
					Equality.eq(syntax, reader.$kw61$NON_TERMINATING_MACRO));
		return Values.values(SubLNil.NIL, SubLNil.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 11109L)
	public static SubLObject has_traitp(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject ch = SubLNil.NIL;
		SubLObject trait = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list65);
		ch = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list65);
		trait = current.first();
		current = current.rest();
		SubLObject readtable = current.isCons() ? current.first() : reader.$sym52$_READTABLE_;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, reader.$list65);
		current = current.rest();
		if (SubLNil.NIL == current)
			return ConsesLow.list(reader.$sym66$PLUSP, ConsesLow.list(reader.$sym67$LOGAND, trait,
					ConsesLow.list(reader.$sym68$CHARACTER_TRAITS, ch, readtable)));
		cdestructuring_bind.cdestructuring_bind_error(datum, reader.$list65);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 24136L)
	public static SubLObject illegal_argument_error(SubLObject stream, SubLObject ch, SubLObject arg) {
		simple_reader_error(reader.$str113$Illegal_argument__D_for_the__A_re, ConsesLow.list(arg, ch));
		return SubLNil.NIL;
	}

	public static SubLObject init_reader_file() {
		reader.$whitespace_1_chars$ = SubLFiles.defvar("*WHITESPACE-1-CHARS*",
				ConsesLow.list(Characters.CHAR_space, Characters.code_char(CommonSymbols.TEN_INTEGER),
						Characters.code_char(CommonSymbols.THIRTEEN_INTEGER), Characters.CHAR_tab, Characters.CHAR_page,
						Characters.CHAR_rubout));
		reader.$read_base$ = SubLFiles.defvar("*READ-BASE*", CommonSymbols.TEN_INTEGER);
		reader.$read_default_float_format$ = SubLFiles.defvar("*READ-DEFAULT-FLOAT-FORMAT*", reader.$sym2$DOUBLE_FLOAT);
		reader.$read_eval$ = SubLFiles.defvar("*READ-EVAL*", CommonSymbols.T);
		reader.$read_suppress$ = SubLFiles.defvar("*READ-SUPPRESS*", SubLNil.NIL);
		reader.$features$ = SubLFiles.defvar("*FEATURES*", reader.$list3);
		reader.$readtable$ = SubLFiles.defvar("*READTABLE*", SubLNil.NIL);
		reader.$initial_table_size$ = SubLFiles.defparameter("*INITIAL-TABLE-SIZE*", reader.$int4$32);
		reader.$single_byte_max_code$ = SubLFiles.defconstant("*SINGLE-BYTE-MAX-CODE*", reader.$int5$128);
		reader.$dtp_readtable$ = SubLFiles.defconstant("*DTP-READTABLE*", reader.$sym6$READTABLE);
		reader.$alphabetic$ = SubLFiles.defconstant("*ALPHABETIC*", CommonSymbols.ONE_INTEGER);
		reader.$digit$ = SubLFiles.defconstant("*DIGIT*", CommonSymbols.TWO_INTEGER);
		reader.$package_marker$ = SubLFiles.defconstant("*PACKAGE-MARKER*", CommonSymbols.FOUR_INTEGER);
		reader.$plus_sign$ = SubLFiles.defconstant("*PLUS-SIGN*", CommonSymbols.EIGHT_INTEGER);
		reader.$minus_sign$ = SubLFiles.defconstant("*MINUS-SIGN*", CommonSymbols.SIXTEEN_INTEGER);
		reader.$dot$ = SubLFiles.defconstant("*DOT*", reader.$int4$32);
		reader.$decimal_point$ = SubLFiles.defconstant("*DECIMAL-POINT*", reader.$int45$64);
		reader.$ratio_marker$ = SubLFiles.defconstant("*RATIO-MARKER*", reader.$int5$128);
		reader.$exponent_marker$ = SubLFiles.defconstant("*EXPONENT-MARKER*", reader.$int46$256);
		reader.$invalid$ = SubLFiles.defconstant("*INVALID*", reader.$int47$512);
		reader.$standard_readtable$ = SubLFiles.defvar("*STANDARD-READTABLE*", SubLNil.NIL);
		reader.$throw_reader_error_p$ = SubLFiles.defvar("*THROW-READER-ERROR-P*", SubLNil.NIL);
		reader.$throw_end_of_file_p$ = SubLFiles.defvar("*THROW-END-OF-FILE-P*", SubLNil.NIL);
		reader.$read_lookup_table$ = SubLFiles.defvar("*READ-LOOKUP-TABLE*", SubLNil.NIL);
		reader.$initial_token_size$ = SubLFiles.defconstant("*INITIAL-TOKEN-SIZE*", reader.$int4$32);
		reader.$dtp_read_token$ = SubLFiles.defconstant("*DTP-READ-TOKEN*", reader.$sym119$READ_TOKEN);
		reader.$consing_dot$ = SubLFiles.defparameter("*CONSING-DOT*", reader.$sym149$CONSING_DOT);
		reader.$keyword_package$ = SubLFiles.deflexical("*KEYWORD-PACKAGE*",
				Packages.find_package(reader.$str150$KEYWORD));
		reader.$reading_list$ = SubLFiles.defvar("*READING-LIST*", SubLNil.NIL);
		reader.$reading_fake_list$ = SubLFiles.defvar("*READING-FAKE-LIST*", SubLNil.NIL);
		reader.$right_paren$ = SubLFiles.defparameter("*RIGHT-PAREN*", reader.$sym174$RIGHT_PAREN);
		reader.$ignore_extra_right_parens$ = SubLFiles.defparameter("*IGNORE-EXTRA-RIGHT-PARENS*", SubLNil.NIL);
		reader.$bq_comma$ = SubLFiles.defparameter("*BQ-COMMA*", Symbols.make_symbol(reader.$str194$_));
		reader.$bq_atsign$ = SubLFiles.defparameter("*BQ-ATSIGN*", Symbols.make_symbol(reader.$str195$_));
		reader.$bq_dot$ = SubLFiles.defparameter("*BQ-DOT*", Symbols.make_symbol(reader.$str196$_));
		reader.$bq_vector$ = SubLFiles.defparameter("*BQ-VECTOR*", Symbols.make_symbol(reader.$str197$BQ_VECTOR));
		reader.$backquote_depth$ = SubLFiles.defvar("*BACKQUOTE-DEPTH*", CommonSymbols.ZERO_INTEGER);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 52843L)
	public static SubLObject invalid_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread)) {
			SubLObject token = make_read_token(CommonSymbols.UNPROVIDED);
			_csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
			_csetf_read_token_buffer(token,
					Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
			_csetf_read_token_escapes(token, SubLNil.NIL);
			return Values.values(read_token(stream, token, SubLNil.NIL), CommonSymbols.T);
		}
		simple_reader_error(reader.$str143$_A_is_an_invalid_character_, ConsesLow.list(ch));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 9521L)
	public static SubLObject invalid_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(
				SubLNil.NIL != single_byte_p(ch)
						? Vectors.aref(readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
								Characters.char_code(ch))
						: Hashtables.gethash(ch, readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
								reader.$kw49$CONSTITUENT),
				reader.$kw59$INVALID);
	}

	@SubL(source = "sublisp/reader.lisp", position = 23644L)
	public static SubLObject invalid_token_syntax_error(SubLObject stream, SubLObject token) {
		simple_reader_error(reader.$str110$_S_is_invalid_token_syntax_, ConsesLow.list(read_token_string(token)));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12698L)
	public static SubLObject invalid_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$invalid$.getGlobalValue(),
				character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 54272L)
	public static SubLObject left_paren_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject state = reader.$kw154$INITIAL;
		SubLObject list = SubLNil.NIL;
		SubLObject tail = SubLNil.NIL;
		SubLObject object = SubLNil.NIL;
		while (true) {
			SubLObject _prev_bind_0 = reader.$reading_list$.currentBinding(thread);
			try {
				reader.$reading_list$.bind(CommonSymbols.T, thread);
				object = read_internal(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			} finally {
				reader.$reading_list$.rebind(_prev_bind_0, thread);
			}
			SubLObject pcase_var = state;
			if (pcase_var.eql(reader.$kw154$INITIAL)) {
				if (object.eql(reader.$right_paren$.getDynamicValue(thread)))
					return Values.values(SubLNil.NIL, CommonSymbols.T);
				if (object.eql(reader.$consing_dot$.getDynamicValue(thread)))
					Errors.error(reader.$str175$Nothing_before_consing_dot_);
				else {
					if (SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
						list = tail = ConsesLow.cons(object, SubLNil.NIL);
					state = reader.$kw176$LIST;
				}
			} else if (pcase_var.eql(reader.$kw176$LIST)) {
				if (object.eql(reader.$right_paren$.getDynamicValue(thread)))
					return Values.values(list, CommonSymbols.T);
				if (object.eql(reader.$consing_dot$.getDynamicValue(thread)))
					state = reader.$kw177$CONSING_DOT;
				else {
					if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
						continue;
					ConsesLow.rplacd(tail, ConsesLow.cons(object, SubLNil.NIL));
					tail = tail.rest();
				}
			} else if (pcase_var.eql(reader.$kw177$CONSING_DOT)) {
				if (object.eql(reader.$right_paren$.getDynamicValue(thread)))
					simple_reader_error(reader.$str178$Nothing_after_consing_dot_, SubLNil.NIL);
				else if (object.eql(reader.$consing_dot$.getDynamicValue(thread)))
					simple_reader_error(reader.$str179$Too_many_consing_dots_, SubLNil.NIL);
				else {
					if (SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
						ConsesLow.rplacd(tail, object);
					state = reader.$kw180$AFTER_CONSING_DOT;
				}
			} else {
				if (!pcase_var.eql(reader.$kw180$AFTER_CONSING_DOT))
					continue;
				if (object.eql(reader.$right_paren$.getDynamicValue(thread)))
					return Values.values(list, CommonSymbols.T);
				simple_reader_error(reader.$str181$Too_many_objects_after_consing_do, SubLNil.NIL);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 4562L)
	public static SubLObject loop(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return ConsesLow.listS(reader.$sym0$CDO, SubLNil.NIL, reader.$list1,
				ConsesLow.append(body, SubLNil.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 14699L)
	public static SubLObject make_dispatch_macro_character(SubLObject v_char, SubLObject non_terminating_p,
			SubLObject readtable) {
		if (non_terminating_p == CommonSymbols.UNPROVIDED)
			non_terminating_p = SubLNil.NIL;
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		SubLThread thread = SubLProcess.currentSubLThread();
		_csetf_readtable_dispatch_tables(readtable,
				Sequences.delete(v_char, readtable_dispatch_tables(readtable),
						Symbols.symbol_function(CommonSymbols.EQL), Symbols.symbol_function(reader.$sym70$CAR),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		_csetf_readtable_dispatch_tables(readtable,
				ConsesLow.cons(
						ConsesLow.cons(v_char,
								Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
										CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)),
						readtable_dispatch_tables(readtable)));
		set_character_function(v_char, reader.$sym71$DISPATCHING_RMF, readtable);
		set_character_syntax(v_char, SubLNil.NIL != non_terminating_p ? reader.$kw61$NON_TERMINATING_MACRO
				: reader.$kw60$TERMINATING_MACRO, readtable);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject make_read_token(SubLObject arglist) {
		if (arglist == CommonSymbols.UNPROVIDED)
			arglist = SubLNil.NIL;
		SubLObject v_new = new $read_token_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = SubLNil.NIL, next = arglist; SubLNil.NIL != next; next = conses_high.cddr(next)) {
			current_arg = next.first();
			current_value = conses_high.cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql(reader.$kw133$POINTER))
				_csetf_read_token_pointer(v_new, current_value);
			else if (pcase_var.eql(reader.$kw134$BUFFER))
				_csetf_read_token_buffer(v_new, current_value);
			else if (pcase_var.eql(reader.$kw135$ESCAPES))
				_csetf_read_token_escapes(v_new, current_value);
			else
				Errors.error(reader.$str39$Invalid_slot__S_for_construction_, current_arg);
		}
		return v_new;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject make_readtable(SubLObject arglist) {
		if (arglist == CommonSymbols.UNPROVIDED)
			arglist = SubLNil.NIL;
		SubLObject v_new = new $readtable_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = SubLNil.NIL, next = arglist; SubLNil.NIL != next; next = conses_high.cddr(next)) {
			current_arg = next.first();
			current_value = conses_high.cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql(reader.$kw31$CASE))
				_csetf_readtable_case(v_new, current_value);
			else if (pcase_var.eql(reader.$kw32$CHARACTER_SYNTAX))
				_csetf_readtable_character_syntax(v_new, current_value);
			else if (pcase_var.eql(reader.$kw33$SINGLE_BYTE_CHAR_SYNTAX))
				_csetf_readtable_single_byte_char_syntax(v_new, current_value);
			else if (pcase_var.eql(reader.$kw34$MACRO_FUNCTIONS))
				_csetf_readtable_macro_functions(v_new, current_value);
			else if (pcase_var.eql(reader.$kw35$SINGLE_BYTE_MACRO_FUNCTIONS))
				_csetf_readtable_single_byte_macro_functions(v_new, current_value);
			else if (pcase_var.eql(reader.$kw36$CONSTITUENT_TRAITS))
				_csetf_readtable_constituent_traits(v_new, current_value);
			else if (pcase_var.eql(reader.$kw37$SINGLE_BYTE_CONSTIT_TRAITS))
				_csetf_readtable_single_byte_constit_traits(v_new, current_value);
			else if (pcase_var.eql(reader.$kw38$DISPATCH_TABLES))
				_csetf_readtable_dispatch_tables(v_new, current_value);
			else
				Errors.error(reader.$str39$Invalid_slot__S_for_construction_, current_arg);
		}
		return v_new;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12347L)
	public static SubLObject minus_sign_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$minus_sign$.getGlobalValue(),
				character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 53325L)
	public static SubLObject multiple_escape_rmf(SubLObject stream, SubLObject ch) {
		SubLObject token = make_read_token(CommonSymbols.UNPROVIDED);
		_csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		_csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		_csetf_read_token_escapes(token, SubLNil.NIL);
		read_token(stream, token, CommonSymbols.T);
		return Values.values(parse_token(stream, token), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9792L)
	public static SubLObject multiple_escape_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(
				SubLNil.NIL != single_byte_p(ch)
						? Vectors.aref(readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
								Characters.char_code(ch))
						: Hashtables.gethash(ch, readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
								reader.$kw49$CONSTITUENT),
				reader.$kw62$MULTIPLE_ESCAPE);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9690L)
	public static SubLObject non_terminating_macro_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(
				SubLNil.NIL != single_byte_p(ch)
						? Vectors.aref(readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
								Characters.char_code(ch))
						: Hashtables.gethash(ch, readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
								reader.$kw49$CONSTITUENT),
				reader.$kw61$NON_TERMINATING_MACRO);
	}

	@SubL(source = "sublisp/reader.lisp", position = 12202L)
	public static SubLObject package_marker_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$package_marker$.getGlobalValue(),
				character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 50470L)
	public static SubLObject parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix,
			SubLObject junk_allowed) {
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = SubLNil.NIL;
		if (radix == CommonSymbols.UNPROVIDED)
			radix = CommonSymbols.TEN_INTEGER;
		if (junk_allowed == CommonSymbols.UNPROVIDED)
			junk_allowed = SubLNil.NIL;
		if (SubLNil.NIL == end)
			end = Sequences.length(string);
		if (SubLNil.NIL == junk_allowed)
			return Numbers.jrtl_parse_integer(string, start, end, radix);
		SubLObject sign = CommonSymbols.MINUS_ONE_INTEGER;
		SubLObject i = start;
		SubLObject state = reader.$kw154$INITIAL;
		SubLObject value = SubLNil.NIL;
		while (!i.numGE(end)) {
			SubLObject ch = Strings.sublisp_char(string, i);
			SubLObject pcase_var = state;
			if (pcase_var.eql(reader.$kw154$INITIAL)) {
				if (SubLNil.NIL == whitespace_1_char_p(ch))
					if (SubLNil.NIL != Characters.charE(ch, Characters.CHAR_plus))
						state = reader.$kw156$SIGN;
					else if (SubLNil.NIL != Characters.charE(ch, Characters.CHAR_hyphen)) {
						sign = CommonSymbols.ONE_INTEGER;
						state = reader.$kw156$SIGN;
					} else if (SubLNil.NIL != Characters.digit_char_p(ch, radix)) {
						value = Numbers.minus(Characters.digit_char_p(ch, radix));
						state = reader.$kw168$DIGIT;
					} else {
						if (SubLNil.NIL != junk_allowed)
							return Values.values(SubLNil.NIL, i);
						simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
								ConsesLow.list(Sequences.subseq(string, start, end)));
					}
			} else if (pcase_var.eql(reader.$kw156$SIGN)) {
				if (SubLNil.NIL != Characters.digit_char_p(ch, radix)) {
					value = Numbers.minus(Characters.digit_char_p(ch, radix));
					state = reader.$kw168$DIGIT;
				} else {
					if (SubLNil.NIL != junk_allowed)
						return Values.values(SubLNil.NIL, i);
					simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
							ConsesLow.list(Sequences.subseq(string, start, end)));
				}
			} else if (pcase_var.eql(reader.$kw168$DIGIT)) {
				if (SubLNil.NIL != Characters.digit_char_p(ch, radix))
					value = Numbers.subtract(Numbers.multiply(value, radix), Characters.digit_char_p(ch, radix));
				else if (SubLNil.NIL != whitespace_1_char_p(ch))
					state = reader.$kw170$TRAILING_WHITESPACE;
				else {
					if (SubLNil.NIL != junk_allowed)
						return Values.values(Numbers.multiply(sign, value), i);
					simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
							ConsesLow.list(Sequences.subseq(string, start, end)));
				}
			} else if (pcase_var.eql(reader.$kw170$TRAILING_WHITESPACE))
				if (SubLNil.NIL == whitespace_1_char_p(ch)) {
					if (SubLNil.NIL != junk_allowed)
						return Values.values(Numbers.multiply(sign, value), i);
					simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
							ConsesLow.list(Sequences.subseq(string, start, end)));
				}
			i = Numbers.add(i, CommonSymbols.ONE_INTEGER);
		}
		if (state == reader.$kw168$DIGIT || state == reader.$kw170$TRAILING_WHITESPACE)
			return Values.values(Numbers.multiply(sign, value), i);
		if (SubLNil.NIL != junk_allowed)
			return Values.values(SubLNil.NIL, i);
		simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
				ConsesLow.list(Sequences.subseq(string, start, end)));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 45222L)
	public static SubLObject parse_number(SubLObject stream, SubLObject token) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject state = reader.$kw154$INITIAL;
		SubLObject buffer = read_token_buffer(token);
		SubLObject length = read_token_pointer(token);
		SubLObject sign = CommonSymbols.ONE_INTEGER;
		SubLObject exponent_sign = CommonSymbols.ONE_INTEGER;
		SubLObject start1 = SubLNil.NIL;
		SubLObject end1 = SubLNil.NIL;
		SubLObject start2 = SubLNil.NIL;
		SubLObject end2 = SubLNil.NIL;
		SubLObject start3 = SubLNil.NIL;
		SubLObject i;
		SubLObject ch;
		SubLObject pcase_var;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			ch = Strings.sublisp_char(buffer, i);
			pcase_var = state;
			if (pcase_var.eql(reader.$kw154$INITIAL)) {
				if (SubLNil.NIL != decimal_point_traitp(ch))
					state = reader.$kw155$DOT1;
				else if (SubLNil.NIL != plus_sign_traitp(ch))
					state = reader.$kw156$SIGN;
				else if (SubLNil.NIL != minus_sign_traitp(ch)) {
					sign = CommonSymbols.MINUS_ONE_INTEGER;
					state = reader.$kw156$SIGN;
				} else if (SubLNil.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start1 = i;
					state = reader.$kw157$DECIMALS;
				} else if (SubLNil.NIL != digit_traitp(ch)) {
					start1 = i;
					state = reader.$kw158$DIGITS;
				} else
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw156$SIGN)) {
				if (SubLNil.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start1 = i;
					state = reader.$kw157$DECIMALS;
				} else if (SubLNil.NIL != digit_traitp(ch)) {
					start1 = i;
					state = reader.$kw158$DIGITS;
				} else if (SubLNil.NIL != decimal_point_traitp(ch))
					state = reader.$kw155$DOT1;
				else
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw157$DECIMALS)) {
				if (SubLNil.NIL == Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					if (SubLNil.NIL != digit_traitp(ch))
						state = reader.$kw158$DIGITS;
					else if (SubLNil.NIL != exponent_marker_traitp(ch)) {
						end1 = i;
						state = reader.$kw159$EXPONENT;
					} else if (SubLNil.NIL != decimal_point_traitp(ch)) {
						end1 = i;
						state = reader.$kw160$DOT2;
					} else if (SubLNil.NIL != ratio_marker_traitp(ch)) {
						end1 = i;
						state = reader.$kw161$SLASH;
					} else
						invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw158$DIGITS)) {
				if (SubLNil.NIL == digit_traitp(ch))
					if (SubLNil.NIL != ratio_marker_traitp(ch)) {
						end1 = i;
						state = reader.$kw161$SLASH;
					} else
						invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw161$SLASH)) {
				if (SubLNil.NIL != digit_traitp(ch)) {
					start2 = i;
					state = reader.$kw162$DENOMINATOR;
				} else
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw162$DENOMINATOR)) {
				if (SubLNil.NIL == digit_traitp(ch))
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw155$DOT1)) {
				if (SubLNil.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start2 = i;
					state = reader.$kw163$FRACTION;
				} else
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw163$FRACTION)) {
				if (SubLNil.NIL == Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw160$DOT2)) {
				if (SubLNil.NIL != exponent_marker_traitp(ch)) {
					start2 = CommonSymbols.ZERO_INTEGER;
					end2 = CommonSymbols.ZERO_INTEGER;
					state = reader.$kw159$EXPONENT;
				} else if (SubLNil.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start2 = i;
					state = reader.$kw164$DECIMALS2;
				} else
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw164$DECIMALS2)) {
				if (SubLNil.NIL == Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					if (SubLNil.NIL != exponent_marker_traitp(ch)) {
						end2 = i;
						state = reader.$kw159$EXPONENT;
					} else
						invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw159$EXPONENT)) {
				if (SubLNil.NIL != plus_sign_traitp(ch))
					state = reader.$kw165$EXPONENT_SIGN;
				else if (SubLNil.NIL != minus_sign_traitp(ch)) {
					exponent_sign = CommonSymbols.MINUS_ONE_INTEGER;
					state = reader.$kw165$EXPONENT_SIGN;
				} else if (SubLNil.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start3 = i;
					state = reader.$kw166$EXPONENT_VALUE;
				} else
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw165$EXPONENT_SIGN)) {
				if (SubLNil.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start3 = i;
					state = reader.$kw166$EXPONENT_VALUE;
				} else
					invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw166$EXPONENT_VALUE)) {
				if (SubLNil.NIL == Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					invalid_token_syntax_error(stream, token);
			} else
				simple_reader_error(reader.$str167$Can_t_happen_, SubLNil.NIL);
		}
		SubLObject pcase_var2 = state;
		if (pcase_var2.eql(reader.$kw158$DIGITS))
			return Numbers.multiply(sign, parse_integer(buffer, start1, length,
					reader.$read_base$.getDynamicValue(thread), CommonSymbols.UNPROVIDED));
		if (pcase_var2.eql(reader.$kw157$DECIMALS))
			return Numbers.multiply(sign, parse_integer(buffer, start1, length,
					reader.$read_base$.getDynamicValue(thread), CommonSymbols.UNPROVIDED));
		if (pcase_var2.eql(reader.$kw160$DOT2))
			return Numbers.multiply(sign,
					parse_integer(buffer, start1, end1, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED));
		if (pcase_var2.eql(reader.$kw162$DENOMINATOR))
			return Numbers.multiply(sign,
					Numbers.divide(
							parse_integer(buffer, start1, end1, reader.$read_base$.getDynamicValue(thread),
									CommonSymbols.UNPROVIDED),
							parse_integer(buffer, start2, length, reader.$read_base$.getDynamicValue(thread),
									CommonSymbols.UNPROVIDED)));
		if (pcase_var2.eql(reader.$kw163$FRACTION))
			return Numbers.multiply(sign,
					math_utilities.bellerophon(
							parse_integer(buffer, start2, length, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED),
							Numbers.minus(Numbers.subtract(length, start2))));
		if (pcase_var2.eql(reader.$kw164$DECIMALS2)) {
			SubLObject left = parse_integer(buffer, start1, end1, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED);
			SubLObject right = parse_integer(buffer, start2, length, CommonSymbols.TEN_INTEGER,
					CommonSymbols.UNPROVIDED);
			return Numbers
					.multiply(sign,
							math_utilities
									.bellerophon(
											Numbers.add(Numbers.multiply(left,
													Numbers.expt(CommonSymbols.TEN_INTEGER,
															Numbers.subtract(length, start2))),
													right),
											Numbers.minus(Numbers.subtract(length, start2))));
		}
		if (!pcase_var2.eql(reader.$kw166$EXPONENT_VALUE))
			return invalid_token_syntax_error(stream, token);
		SubLObject left = SubLNil.NIL != start1
				? parse_integer(buffer, start1, end1, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED)
				: SubLNil.NIL;
		SubLObject right = SubLNil.NIL != start2
				? parse_integer(buffer, start2, end2, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED)
				: SubLNil.NIL;
		SubLObject exponent = parse_integer(buffer, start3, length, CommonSymbols.TEN_INTEGER,
				CommonSymbols.UNPROVIDED);
		if (SubLNil.NIL != left && SubLNil.NIL != right)
			return Numbers
					.multiply(sign,
							math_utilities
									.bellerophon(
											Numbers.add(Numbers.multiply(left,
													Numbers.expt(CommonSymbols.TEN_INTEGER,
															Numbers.subtract(end2, start2))),
													right),
											Numbers.subtract(Numbers.multiply(exponent_sign, exponent),
													Numbers.subtract(end2, start2))));
		if (SubLNil.NIL != left)
			return Numbers.multiply(sign, math_utilities.bellerophon(left, Numbers.multiply(exponent_sign, exponent)));
		if (SubLNil.NIL != right)
			return Numbers.multiply(sign, math_utilities.bellerophon(right,
					Numbers.subtract(Numbers.multiply(exponent_sign, exponent), Numbers.subtract(end2, start2))));
		return invalid_token_syntax_error(stream, token);
	}

	@SubL(source = "sublisp/reader.lisp", position = 41275L)
	public static SubLObject parse_symbol_or_consing_dot(SubLObject stream, SubLObject token) {
		SubLThread thread = SubLProcess.currentSubLThread();
		frob_case(token);
		SubLObject buffer = read_token_buffer(token);
		SubLObject length = read_token_pointer(token);
		SubLObject escapes = read_token_escapes(token);
		SubLObject pkg_idx1 = SubLNil.NIL;
		SubLObject pkg_idx2 = SubLNil.NIL;
		SubLObject dot_count = CommonSymbols.ZERO_INTEGER;
		SubLObject i;
		SubLObject ch;
		SubLObject escape_idx;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			ch = Strings.sublisp_char(buffer, i);
			escape_idx = escapes.first();
			if (SubLNil.NIL != escape_idx && escape_idx.numE(i))
				escapes = escapes.rest();
			else if (SubLNil.NIL != package_marker_traitp(ch)) {
				if (SubLNil.NIL != pkg_idx2)
					invalid_token_syntax_error(stream, token);
				else if (SubLNil.NIL != pkg_idx1)
					pkg_idx2 = i;
				else
					pkg_idx1 = i;
			} else if (SubLNil.NIL != dot_traitp(ch))
				dot_count = Numbers.add(dot_count, CommonSymbols.ONE_INTEGER);
		}
		if (dot_count.numE(length)) {
			if (length.numE(CommonSymbols.ONE_INTEGER)
					&& SubLNil.NIL != reader.$reading_list$.getDynamicValue(thread)
					&& SubLNil.NIL == reader.$reading_fake_list$.getDynamicValue(thread))
				return reader.$consing_dot$.getDynamicValue(thread);
			return invalid_token_syntax_error(stream, token);
		} else {
			if (SubLNil.NIL != pkg_idx1 && SubLNil.NIL == pkg_idx2
					&& pkg_idx1.numE(CommonSymbols.ZERO_INTEGER)) {
				if (!length.numG(CommonSymbols.ONE_INTEGER))
					invalid_token_syntax_error(stream, token);
				return Symbols.make_keyword(Sequences.subseq(buffer, CommonSymbols.ONE_INTEGER, length));
			}
			if (SubLNil.NIL != pkg_idx1 && SubLNil.NIL == pkg_idx2
					&& pkg_idx1.numL(Numbers.subtract(length, CommonSymbols.ONE_INTEGER))) {
				SubLObject v_package = reader_find_package(buffer, CommonSymbols.ZERO_INTEGER, pkg_idx1);
				SubLObject name = Sequences.subseq(buffer, Numbers.add(pkg_idx1, CommonSymbols.ONE_INTEGER), length);
				thread.resetMultipleValues();
				SubLObject symbol = Packages.find_symbol(name, v_package);
				SubLObject status = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (status == reader.$kw151$EXTERNAL)
					return symbol;
				if (v_package.eql(reader.$keyword_package$.getGlobalValue()))
					return Symbols.make_keyword(name);
				simple_reader_error(reader.$str152$_S_is_not_external_in__S_, ConsesLow.list(name, v_package));
				return SubLNil.NIL;
			} else {
				if (SubLNil.NIL != pkg_idx1 && SubLNil.NIL != pkg_idx2
						&& pkg_idx2.numE(Numbers.add(pkg_idx1, CommonSymbols.ONE_INTEGER))
						&& pkg_idx1.numG(CommonSymbols.ZERO_INTEGER)
						&& pkg_idx2.numL(Numbers.subtract(length, CommonSymbols.ONE_INTEGER)))
					return Packages.intern(
							Sequences.subseq(buffer, Numbers.add(pkg_idx2, CommonSymbols.ONE_INTEGER), length),
							reader_find_package(buffer, CommonSymbols.ZERO_INTEGER, pkg_idx1));
				if (SubLNil.NIL == pkg_idx1 && SubLNil.NIL == pkg_idx2 && length.isPositive())
					return Packages.intern(Sequences.subseq(buffer, CommonSymbols.ZERO_INTEGER, length),
							Packages.$package$.getDynamicValue(thread));
				return invalid_token_syntax_error(stream, token);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 37714L)
	public static SubLObject parse_token(SubLObject stream, SubLObject token) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return SubLNil.NIL;
		SubLObject escapes = Sequences.nreverse(read_token_escapes(token));
		_csetf_read_token_escapes(token, escapes);
		if (SubLNil.NIL == escapes
				&& SubLNil.NIL != potential_number_p(read_token_buffer(token), read_token_pointer(token)))
			return parse_number(stream, token);
		return parse_symbol_or_consing_dot(stream, token);
	}

	@SubL(source = "sublisp/reader.lisp", position = 12280L)
	public static SubLObject plus_sign_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$plus_sign$.getGlobalValue(),
				character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 34594L)
	public static SubLObject potential_number_p(SubLObject string, SubLObject length) {
		SubLObject letter_seen_p = SubLNil.NIL;
		SubLObject i;
		SubLObject ch;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			ch = Strings.sublisp_char(string, i);
			if (SubLNil.NIL != digit_traitp(ch) || SubLNil.NIL != plus_sign_traitp(ch)
					|| SubLNil.NIL != minus_sign_traitp(ch) || SubLNil.NIL != ratio_marker_traitp(ch)
					|| SubLNil.NIL != decimal_point_traitp(ch)
					|| SubLNil.NIL != Characters.charE(ch, Characters.CHAR_caret)
					|| SubLNil.NIL != Characters.charE(ch, Characters.CHAR_underbar))
				letter_seen_p = SubLNil.NIL;
			else if (SubLNil.NIL != exponent_marker_traitp(ch))
				letter_seen_p = CommonSymbols.T;
			else {
				if (SubLNil.NIL == alphadigit_traitp(ch) || SubLNil.NIL != letter_seen_p)
					return SubLNil.NIL;
				letter_seen_p = CommonSymbols.T;
			}
		}
		SubLObject decimal_point_p = SubLNil.NIL;
		SubLObject decimal_digit_p = SubLNil.NIL;
		SubLObject digit_p = SubLNil.NIL;
		SubLObject j;
		SubLObject ch2;
		for (j = SubLNil.NIL, j = CommonSymbols.ZERO_INTEGER; j
				.numL(length); j = Numbers.add(j, CommonSymbols.ONE_INTEGER)) {
			ch2 = Strings.sublisp_char(string, j);
			if (SubLNil.NIL != digit_traitp(ch2))
				digit_p = CommonSymbols.T;
			if (SubLNil.NIL != Characters.digit_char_p(ch2, CommonSymbols.TEN_INTEGER))
				decimal_digit_p = CommonSymbols.T;
			if (SubLNil.NIL != decimal_point_traitp(ch2))
				decimal_point_p = CommonSymbols.T;
		}
		if (SubLNil.NIL != decimal_point_p && SubLNil.NIL == decimal_digit_p
				|| SubLNil.NIL == digit_p)
			return SubLNil.NIL;
		SubLObject first = Strings.sublisp_char(string, CommonSymbols.ZERO_INTEGER);
		if (SubLNil.NIL == digit_traitp(first) && SubLNil.NIL == plus_sign_traitp(first)
				&& SubLNil.NIL == minus_sign_traitp(first) && SubLNil.NIL == decimal_point_traitp(first)
				&& SubLNil.NIL == Characters.charE(first, Characters.CHAR_caret)
				&& SubLNil.NIL == Characters.charE(first, Characters.CHAR_underbar))
			return SubLNil.NIL;
		if (SubLNil.NIL != package_marker_traitp(first))
			return SubLNil.NIL;
		SubLObject last = Strings.sublisp_char(string, Numbers.subtract(length, CommonSymbols.ONE_INTEGER));
		if (SubLNil.NIL != plus_sign_traitp(last) || SubLNil.NIL != minus_sign_traitp(last))
			return SubLNil.NIL;
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12546L)
	public static SubLObject ratio_marker_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$ratio_marker$.getGlobalValue(),
				character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 28046L)
	public static SubLObject read(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = SubLNil.NIL;
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = SubLNil.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = SubLNil.NIL;
		SubLObject value = read_preserving_whitespace(stream, eof_error_p, eof_value, recursivep);
		SubLObject ch = streams_high.read_char(stream, SubLNil.NIL, SubLNil.NIL, CommonSymbols.UNPROVIDED);
		if (SubLNil.NIL != ch && (SubLNil.NIL == whitespace_syntaxp(ch) || SubLNil.NIL != recursivep))
			streams_high.unread_char(ch, stream);
		return value;
	}

	@SubL(source = "sublisp/reader.lisp", position = 28443L)
	public static SubLObject read_delimited_list(SubLObject v_char, SubLObject stream, SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = SubLNil.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = SubLNil.NIL;
		SubLObject list = SubLNil.NIL;
		SubLObject tail = SubLNil.NIL;
		while (true) {
			SubLObject ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
			if (SubLNil.NIL != Characters.charE(ch, v_char))
				break;
			if (SubLNil.NIL != whitespace_syntaxp(ch))
				continue;
			streams_high.unread_char(ch, stream);
			SubLObject next = ConsesLow.cons(read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T),
					SubLNil.NIL);
			if (SubLNil.NIL != list) {
				ConsesLow.rplacd(tail, next);
				tail = tail.rest();
			} else
				list = tail = next;
		}
		return list;
	}

	@SubL(source = "sublisp/reader.lisp", position = 73341L)
	public static SubLObject read_features(SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject features = SubLNil.NIL;
		SubLObject _prev_bind_0 = reader.$reading_fake_list$.currentBinding(thread);
		try {
			reader.$reading_fake_list$.bind(CommonSymbols.T, thread);
			features = read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
		} finally {
			reader.$reading_fake_list$.rebind(_prev_bind_0, thread);
		}
		return features_match(fix_features(features));
	}

	@SubL(source = "sublisp/reader.lisp", position = 28913L)
	public static SubLObject read_from_string(SubLObject string, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject start, SubLObject end, SubLObject preserve_whitespace) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = SubLNil.NIL;
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = SubLNil.NIL;
		if (preserve_whitespace == CommonSymbols.UNPROVIDED)
			preserve_whitespace = SubLNil.NIL;
		SubLObject result = SubLNil.NIL;
		SubLObject index = SubLNil.NIL;
		SubLObject in = SubLNil.NIL;
		try {
			in = streams_high.make_private_string_input_stream(string, start, end);
			if (SubLNil.NIL != preserve_whitespace)
				result = read_preserving_whitespace(in, eof_error_p, eof_value, CommonSymbols.UNPROVIDED);
			else
				result = read(in, eof_error_p, eof_value, CommonSymbols.UNPROVIDED);
			index = streams_high.stream_input_index(in);
		} finally {
			SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
			try {
				Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
				SubLObject _values = Values.getValuesAsVector();
				streams_high.close(in, CommonSymbols.UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally {
				Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return Values.values(result, index);
	}

	@SubL(source = "sublisp/reader.lisp", position = 30932L)
	public static SubLObject read_from_string_ignoring_errors(SubLObject string, SubLObject eof_error_p,
			SubLObject eof_value, SubLObject start, SubLObject end) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = reader.$kw117$EOF;
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = SubLNil.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index = SubLNil.NIL;
		SubLObject value = SubLNil.NIL;
		SubLObject status = SubLNil.NIL;
		SubLObject stream = SubLNil.NIL;
		try {
			stream = streams_high.make_private_string_input_stream(string, start, end);
			thread.resetMultipleValues();
			SubLObject value_1 = read_ignoring_errors(stream, eof_error_p, eof_value);
			SubLObject status_1 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			value = value_1;
			status = status_1;
			index = streams_high.stream_input_index(stream);
		} finally {
			SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				Threads.$is_thread_performing_cleanupP$.bind(CommonSymbols.T, thread);
				SubLObject _values = Values.getValuesAsVector();
				streams_high.close(stream, CommonSymbols.UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally {
				Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			}
		}
		if (status == reader.$kw118$ERROR)
			return Values.values(value, status);
		return Values.values(value, index);
	}

	@SubL(source = "sublisp/reader.lisp", position = 30308L)
	public static SubLObject read_ignoring_errors(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = reader.$kw117$EOF;
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject end_of_file_p = SubLNil.NIL;
		SubLObject reader_error_p = SubLNil.NIL;
		SubLObject result = SubLNil.NIL;
		try {
			thread.throwStack.push(reader.$sym108$END_OF_FILE);
			try {
				thread.throwStack.push(reader.$sym106$READER_ERROR);
				SubLObject _prev_bind_0 = reader.$throw_end_of_file_p$.currentBinding(thread);
				SubLObject _prev_bind_2 = reader.$throw_reader_error_p$.currentBinding(thread);
				try {
					reader.$throw_end_of_file_p$.bind(
							SubLNil.NIL != reader.$throw_end_of_file_p$.getDynamicValue(thread) ? CommonSymbols.T
									: SubLObjectFactory.makeBoolean(SubLNil.NIL == eof_error_p),
							thread);
					reader.$throw_reader_error_p$.bind(CommonSymbols.T, thread);
					result = read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				} finally {
					reader.$throw_reader_error_p$.rebind(_prev_bind_2, thread);
					reader.$throw_end_of_file_p$.rebind(_prev_bind_0, thread);
				}
			} catch (Throwable ccatch_env_var) {
				
				reader_error_p = Errors.handleThrowable(ccatch_env_var, reader.$sym106$READER_ERROR);
			} finally {
				thread.throwStack.pop();
			}
		} catch (Throwable ccatch_env_var) {
			end_of_file_p = Errors.handleThrowable(ccatch_env_var, reader.$sym108$END_OF_FILE);
		} finally {
			thread.throwStack.pop();
		}
		if (SubLNil.NIL != reader_error_p)
			return Values.values(SubLNil.NIL, reader.$kw118$ERROR);
		if (SubLNil.NIL != end_of_file_p)
			return Values.values(eof_value, reader.$kw118$ERROR);
		return Values.values(result, SubLNil.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 24426L)
	public static SubLObject read_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = SubLNil.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		while (true) {
			final SubLObject ch = streams_high.read_char(stream, eof_error_p, SubLNil.NIL, CommonSymbols.UNPROVIDED);
			if (SubLNil.NIL == ch)
				return eof_value;
			final SubLObject func = character_function(ch, CommonSymbols.UNPROVIDED);
			SubLObject the_result = SubLNil.NIL;
			SubLObject good_p = SubLNil.NIL;
			if (func == reader.$sym50$CONSTITUENT_RMF) {
				thread.resetMultipleValues();
				SubLObject result = constituent_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym74$WHITESPACE_RMF) {
				thread.resetMultipleValues();
				SubLObject result = whitespace_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym77$LEFT_PAREN_RMF) {
				thread.resetMultipleValues();
				SubLObject result = left_paren_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym78$RIGHT_PAREN_RMF) {
				thread.resetMultipleValues();
				SubLObject result = right_paren_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym79$SINGLE_QUOTE_RMF) {
				thread.resetMultipleValues();
				SubLObject result = single_quote_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym81$DOUBLE_QUOTE_RMF) {
				thread.resetMultipleValues();
				SubLObject result = double_quote_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym82$BACKQUOTE_RMF) {
				thread.resetMultipleValues();
				SubLObject result = backquote_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym83$COMMA_RMF) {
				thread.resetMultipleValues();
				SubLObject result = comma_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym80$SEMICOLON_RMF) {
				thread.resetMultipleValues();
				SubLObject result = semicolon_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else {
				thread.resetMultipleValues();
				SubLObject result = Functions.funcall(func, stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			}
			if (SubLNil.NIL != good_p)
				return the_result;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 70892L)
	public static SubLObject read_lookup(SubLObject number) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$read_lookup_table$.getDynamicValue(thread)) {
			thread.resetMultipleValues();
			SubLObject value = Hashtables.gethash(number, reader.$read_lookup_table$.getDynamicValue(thread),
					CommonSymbols.UNPROVIDED);
			SubLObject valuep = thread.secondMultipleValue();
			thread.resetMultipleValues();
			return Values.values(value, valuep);
		}
		return Values.values(SubLNil.NIL, SubLNil.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 68539L)
	public static SubLObject read_number_in_radix(SubLObject stream, SubLObject radix) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject token = make_read_token(CommonSymbols.UNPROVIDED);
		_csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		_csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		_csetf_read_token_escapes(token, SubLNil.NIL);
		read_token(stream, token, SubLNil.NIL);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return SubLNil.NIL;
		SubLObject number = SubLNil.NIL;
		SubLObject _prev_bind_0 = reader.$read_base$.currentBinding(thread);
		try {
			reader.$read_base$.bind(radix, thread);
			number = parse_number(stream, token);
		} finally {
			reader.$read_base$.rebind(_prev_bind_0, thread);
		}
		return number;
	}

	@SubL(source = "sublisp/reader.lisp", position = 27576L)
	public static SubLObject read_preserving_whitespace(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = SubLNil.NIL;
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = SubLNil.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = SubLNil.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == recursivep) {
			SubLObject value = SubLNil.NIL;
			SubLObject _prev_bind_0 = reader.$read_lookup_table$.currentBinding(thread);
			try {
				reader.$read_lookup_table$.bind(SubLNil.NIL, thread);
				value = read_preserving_whitespace(stream, eof_error_p, eof_value, CommonSymbols.T);
			} finally {
				reader.$read_lookup_table$.rebind(_prev_bind_0, thread);
			}
			return value;
		}
		SubLObject value = read_internal(stream, eof_error_p, eof_value);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return SubLNil.NIL;
		return value;
	}

	@SubL(source = "sublisp/reader.lisp", position = 32966L)
	public static SubLObject read_token(SubLObject stream, SubLObject token, SubLObject escapep) {
		SubLThread thread = SubLProcess.currentSubLThread();
		while (true) {
			SubLObject ch = streams_high.read_char(stream, SubLNil.NIL, SubLNil.NIL,
					CommonSymbols.UNPROVIDED);
			if (SubLNil.NIL != escapep) {
				if (SubLNil.NIL == ch)
					end_of_file_error(stream);
				else if (SubLNil.NIL != constituent_syntaxp(ch)
						|| SubLNil.NIL != non_terminating_macro_syntaxp(ch)
						|| SubLNil.NIL != terminating_macro_syntaxp(ch)
						|| SubLNil.NIL != whitespace_syntaxp(ch))
					add_to_token(ch, token, CommonSymbols.T);
				else if (SubLNil.NIL != single_escape_syntaxp(ch))
					add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
				else if (SubLNil.NIL != multiple_escape_syntaxp(ch))
					escapep = SubLNil.NIL;
				else if (SubLNil.NIL != invalid_syntaxp(ch)
						&& SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
					simple_reader_error(reader.$str143$_A_is_an_invalid_character_, ConsesLow.list(ch));
				else
					simple_reader_error(reader.$str144$Fell_through_character_syntax_on_, ConsesLow.list(ch));
			} else {
				if (SubLNil.NIL == ch)
					return token;
				if (SubLNil.NIL != constituent_syntaxp(ch)
						|| SubLNil.NIL != non_terminating_macro_syntaxp(ch))
					add_to_token(ch, token, SubLNil.NIL);
				else if (SubLNil.NIL != single_escape_syntaxp(ch))
					add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
				else if (SubLNil.NIL != multiple_escape_syntaxp(ch))
					escapep = CommonSymbols.T;
				else if (SubLNil.NIL != invalid_syntaxp(ch)
						&& SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
					simple_reader_error(reader.$str143$_A_is_an_invalid_character_, ConsesLow.list(ch));
				else {
					if (SubLNil.NIL != terminating_macro_syntaxp(ch)
							|| SubLNil.NIL != whitespace_syntaxp(ch)) {
						streams_high.unread_char(ch, stream);
						return token;
					}
					simple_reader_error(reader.$str144$Fell_through_character_syntax_on_, ConsesLow.list(ch));
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_buffer(SubLObject object) {
		assert SubLNil.NIL != read_token_p(object) : object;
		return object.getField3();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_escapes(SubLObject object) {
		assert SubLNil.NIL != read_token_p(object) : object;
		return object.getField4();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_p(SubLObject object) {
		return object.getClass() == $read_token_native.class ? CommonSymbols.T : SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_pointer(SubLObject object) {
		assert SubLNil.NIL != read_token_p(object) : object;
		return object.getField2();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_print_function_trampoline(SubLObject object, SubLObject stream) {
		compatibility.default_struct_print_function(object, stream, CommonSymbols.ZERO_INTEGER);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 32850L)
	public static SubLObject read_token_string(SubLObject token) {
		return Sequences.subseq(read_token_buffer(token), CommonSymbols.ZERO_INTEGER, read_token_pointer(token));
	}

	@SubL(source = "sublisp/reader.lisp", position = 39263L)
	public static SubLObject reader_find_package(SubLObject string, SubLObject start, SubLObject end) {
		SubLObject v_package = Packages.find_package(Sequences.subseq(string, start, end));
		if (SubLNil.NIL == v_package)
			simple_reader_error(reader.$str146$_S_is_not_a_known_package_,
					ConsesLow.list(Sequences.subseq(string, start, end)));
		return v_package;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_case(SubLObject object) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.getField2();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_character_syntax(SubLObject object) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.getField3();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_constituent_traits(SubLObject object) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.getField7();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_dispatch_tables(SubLObject object) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.getField9();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_macro_functions(SubLObject object) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.getField5();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_p(SubLObject object) {
		return object.getClass() == $readtable_native.class ? CommonSymbols.T : SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_print_function_trampoline(SubLObject object, SubLObject stream) {
		compatibility.default_struct_print_function(object, stream, CommonSymbols.ZERO_INTEGER);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_single_byte_char_syntax(SubLObject object) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.getField4();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_single_byte_constit_traits(SubLObject object) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.getField8();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_single_byte_macro_functions(SubLObject object) {
		assert SubLNil.NIL != readtable_p(object) : object;
		return object.getField6();
	}

	@SubL(source = "sublisp/reader.lisp", position = 15307L)
	public static SubLObject readtablep(SubLObject object) {
		return readtable_p(object);
	}

	@SubL(source = "sublisp/reader.lisp", position = 11572L)
	public static SubLObject reset_trait(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (SubLNil.NIL != single_byte_p(ch))
			Vectors.set_aref(readtable_single_byte_constit_traits(readtable), Characters.char_code(ch),
					reader.$alphabetic$.getGlobalValue());
		Hashtables.remhash(ch, readtable_constituent_traits(readtable));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 55959L)
	public static SubLObject right_paren_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$reading_list$.getDynamicValue(thread))
			return Values.values(reader.$right_paren$.getDynamicValue(thread), CommonSymbols.T);
		if (SubLNil.NIL != reader.$ignore_extra_right_parens$.getDynamicValue(thread)) {
			Errors.warn(reader.$str182$Ignoring_unmatched_close_parenthe);
			return Values.values(SubLNil.NIL, SubLNil.NIL);
		}
		simple_reader_error(reader.$str183$Unmatched__A_, ConsesLow.list(ch));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 62673L)
	public static SubLObject self_evaluating_atom_p(SubLObject object) {
		return SubLObjectFactory.makeBoolean(object.isAtom() && (SubLNil.NIL == object
				|| CommonSymbols.T == object || object.isKeyword() || !object.isSymbol()));
	}

	@SubL(source = "sublisp/reader.lisp", position = 56489L)
	public static SubLObject semicolon_rmf(SubLObject stream, SubLObject ch) {
		SubLObject next_ch;
		do
			next_ch = streams_high.read_char(stream, SubLNil.NIL, SubLNil.NIL, CommonSymbols.UNPROVIDED);
		while (SubLNil.NIL != next_ch && SubLNil.NIL == Characters.charE(next_ch, Characters.CHAR_return)
				&& SubLNil.NIL == Characters.charE(next_ch, Characters.CHAR_newline));
		return Values.values(SubLNil.NIL, SubLNil.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 10477L)
	public static SubLObject set_character_function(SubLObject ch, SubLObject func, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		Hashtables.sethash(ch, readtable_macro_functions(readtable), func);
		if (SubLNil.NIL != single_byte_p(ch))
			Vectors.set_aref(readtable_single_byte_macro_functions(readtable), Characters.char_code(ch), func);
		return func;
	}

	@SubL(source = "sublisp/reader.lisp", position = 9244L)
	public static SubLObject set_character_syntax(SubLObject ch, SubLObject syntax, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		Hashtables.sethash(ch, readtable_character_syntax(readtable), syntax);
		if (SubLNil.NIL != single_byte_p(ch))
			Vectors.set_aref(readtable_single_byte_char_syntax(readtable), Characters.char_code(ch), syntax);
		return syntax;
	}

	@SubL(source = "sublisp/reader.lisp", position = 15377L)
	public static SubLObject set_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char,
			SubLObject new_function, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (SubLNil.NIL != Characters.digit_char_p(sub_char, CommonSymbols.UNPROVIDED))
			Errors.error(reader.$str72$Attempt_to_make_decimal_digit__A_, sub_char);
		SubLObject bucket = conses_high.assoc(disp_char, readtable_dispatch_tables(readtable), CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
		if (SubLNil.NIL == bucket)
			Errors.error(reader.$str73$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);
		Hashtables.sethash(Characters.char_upcase(sub_char), bucket.rest(), new_function);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 16611L)
	public static SubLObject set_macro_character(SubLObject v_char, SubLObject new_function,
			SubLObject non_terminating_p, SubLObject readtable) {
		if (non_terminating_p == CommonSymbols.UNPROVIDED)
			non_terminating_p = SubLNil.NIL;
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		set_character_function(v_char, new_function, readtable);
		set_character_syntax(v_char, SubLNil.NIL != non_terminating_p ? reader.$kw61$NON_TERMINATING_MACRO
				: reader.$kw60$TERMINATING_MACRO, readtable);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 71141L)
	public static SubLObject set_read_lookup(SubLObject number, SubLObject object) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == reader.$read_lookup_table$.getDynamicValue(thread))
			reader.$read_lookup_table$.setDynamicValue(
					Hashtables.make_hash_table(reader.$int4$32, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED),
					thread);
		Hashtables.sethash(number, reader.$read_lookup_table$.getDynamicValue(thread), object);
		return object;
	}

	@SubL(source = "sublisp/reader.lisp", position = 18313L)
	public static SubLObject set_syntax(SubLObject ch, SubLObject syntax, SubLObject function) {
		SubLThread thread = SubLProcess.currentSubLThread();
		set_macro_character(ch, function, SubLNil.NIL, reader.$standard_readtable$.getDynamicValue(thread));
		set_character_syntax(ch, syntax, reader.$standard_readtable$.getDynamicValue(thread));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 17001L)
	public static SubLObject set_syntax_from_char(SubLObject to_char, SubLObject from_char, SubLObject from_readtable,
			SubLObject to_readtable) {
		if (from_readtable == CommonSymbols.UNPROVIDED)
			from_readtable = SubLNil.NIL;
		if (to_readtable == CommonSymbols.UNPROVIDED)
			to_readtable = reader.$readtable$.getDynamicValue();
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == from_readtable)
			from_readtable = reader.$standard_readtable$.getDynamicValue(thread);
		SubLObject pcase_var;
		SubLObject syntax = pcase_var = SubLNil.NIL != single_byte_p(from_char)
				? Vectors.aref(readtable_single_byte_char_syntax(from_readtable), Characters.char_code(from_char))
				: Hashtables.gethash(from_char, readtable_character_syntax(from_readtable), reader.$kw49$CONSTITUENT);
		if (pcase_var.eql(reader.$kw60$TERMINATING_MACRO) || pcase_var.eql(reader.$kw61$NON_TERMINATING_MACRO)) {
			SubLObject rmf = character_function(from_char, from_readtable);
			if (rmf == reader.$sym71$DISPATCHING_RMF) {
				SubLObject from_table = conses_high.assoc(from_char, readtable_dispatch_tables(from_readtable),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest();
				SubLObject to_table = Hashtables.make_hash_table(Hashtables.hash_table_count(from_table),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				_csetf_readtable_dispatch_tables(to_readtable, ConsesLow.cons(
						ConsesLow.cons(to_char, Xcopy_hash_table(from_table, to_table)),
						Sequences.delete(to_char, readtable_dispatch_tables(to_readtable),
								Symbols.symbol_function(CommonSymbols.EQL), Symbols.symbol_function(reader.$sym70$CAR),
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)));
			}
			set_character_function(to_char, rmf, to_readtable);
		} else if (pcase_var.eql(reader.$kw49$CONSTITUENT))
			reset_trait(to_char, to_readtable);
		set_character_syntax(to_char, syntax, to_readtable);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 11245L)
	public static SubLObject set_trait(SubLObject ch, SubLObject readtable, SubLObject trait) {
		SubLObject new_traits = Numbers.logior(trait, character_traits(ch, readtable));
		Hashtables.sethash(ch, readtable_constituent_traits(readtable), new_traits);
		if (SubLNil.NIL != single_byte_p(ch))
			Vectors.set_aref(readtable_single_byte_constit_traits(readtable), Characters.char_code(ch), new_traits);
		return trait;
	}

	public static SubLObject setup_reader_file() {
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				reader.$dtp_readtable$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim(reader.$list14);
		Structures.def_csetf(reader.$sym15$READTABLE_CASE, reader.$sym16$_CSETF_READTABLE_CASE);
		Structures.def_csetf(reader.$sym17$READTABLE_CHARACTER_SYNTAX, reader.$sym18$_CSETF_READTABLE_CHARACTER_SYNTAX);
		Structures.def_csetf(reader.$sym19$READTABLE_SINGLE_BYTE_CHAR_SYNTAX,
				reader.$sym20$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX);
		Structures.def_csetf(reader.$sym21$READTABLE_MACRO_FUNCTIONS, reader.$sym22$_CSETF_READTABLE_MACRO_FUNCTIONS);
		Structures.def_csetf(reader.$sym23$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS,
				reader.$sym24$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS);
		Structures.def_csetf(reader.$sym25$READTABLE_CONSTITUENT_TRAITS,
				reader.$sym26$_CSETF_READTABLE_CONSTITUENT_TRAITS);
		Structures.def_csetf(reader.$sym27$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS,
				reader.$sym28$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS);
		Structures.def_csetf(reader.$sym29$READTABLE_DISPATCH_TABLES, reader.$sym30$_CSETF_READTABLE_DISPATCH_TABLES);
		Equality.identity(reader.$sym6$READTABLE);
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				reader.$dtp_readtable$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym44$VISIT_DEFSTRUCT_OBJECT_READTABLE_METHOD));
		reader.$standard_readtable$.setDynamicValue(create_readtable());
		SubLObject cdolist_list_var = reader.$whitespace_1_chars$.getDynamicValue();
		SubLObject v_char = SubLNil.NIL;
		v_char = cdolist_list_var.first();
		while (SubLNil.NIL != cdolist_list_var) {
			set_syntax(v_char, reader.$kw64$WHITESPACE, reader.$sym74$WHITESPACE_RMF);
			cdolist_list_var = cdolist_list_var.rest();
			v_char = cdolist_list_var.first();
		}
		set_syntax(Characters.CHAR_backslash, reader.$kw63$SINGLE_ESCAPE, reader.$sym75$SINGLE_ESCAPE_RMF);
		set_syntax(Characters.CHAR_vertical, reader.$kw62$MULTIPLE_ESCAPE, reader.$sym76$MULTIPLE_ESCAPE_RMF);
		set_macro_character(Characters.CHAR_lparen, reader.$sym77$LEFT_PAREN_RMF, SubLNil.NIL,
				reader.$standard_readtable$.getDynamicValue());
		set_macro_character(Characters.CHAR_rparen, reader.$sym78$RIGHT_PAREN_RMF, SubLNil.NIL,
				reader.$standard_readtable$.getDynamicValue());
		set_macro_character(Characters.CHAR_quote, reader.$sym79$SINGLE_QUOTE_RMF, SubLNil.NIL,
				reader.$standard_readtable$.getDynamicValue());
		set_macro_character(Characters.CHAR_semicolon, reader.$sym80$SEMICOLON_RMF, SubLNil.NIL,
				reader.$standard_readtable$.getDynamicValue());
		set_macro_character(Characters.CHAR_quotation, reader.$sym81$DOUBLE_QUOTE_RMF, SubLNil.NIL,
				reader.$standard_readtable$.getDynamicValue());
		set_macro_character(Characters.CHAR_backquote, reader.$sym82$BACKQUOTE_RMF, SubLNil.NIL,
				reader.$standard_readtable$.getDynamicValue());
		set_macro_character(Characters.CHAR_comma, reader.$sym83$COMMA_RMF, SubLNil.NIL,
				reader.$standard_readtable$.getDynamicValue());
		make_dispatch_macro_character(Characters.CHAR_hash, CommonSymbols.T,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_backslash,
				reader.$sym84$SHARPSIGN_BACKSLASH_RMF, reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_quote,
				reader.$sym85$SHARPSIGN_SINGLE_QUOTE_RMF, reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_lparen,
				reader.$sym86$SHARPSIGN_LEFT_PAREN_RMF, reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_asterisk,
				reader.$sym87$SHARPSIGN_ASTERISK_RMF, reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_colon, reader.$sym88$SHARPSIGN_COLON_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_period, reader.$sym89$SHARPSIGN_DOT_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_B, reader.$sym90$SHARPSIGN_B_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_O, reader.$sym91$SHARPSIGN_O_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_X, reader.$sym92$SHARPSIGN_X_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_R, reader.$sym93$SHARPSIGN_R_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_C, reader.$sym94$SHARPSIGN_C_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_A, reader.$sym95$SHARPSIGN_A_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_S, reader.$sym96$SHARPSIGN_S_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_P, reader.$sym97$SHARPSIGN_P_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_G, reader.$sym98$SHARPSIGN_CAPITAL_G_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_equal, reader.$sym99$SHARPSIGN_EQUALS_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_hash, reader.$sym100$SHARPSIGN_SHARPSIGN_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_plus, reader.$sym101$SHARPSIGN_PLUS_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_hyphen, reader.$sym102$SHARPSIGN_MINUS_RMF,
				reader.$standard_readtable$.getDynamicValue());
		set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_vertical,
				reader.$sym103$SHARPSIGN_VERTICAL_BAR_RMF, reader.$standard_readtable$.getDynamicValue());
		SubLObject cdolist_list_var2;
		SubLObject invalid = cdolist_list_var2 = reader.$list104;
		SubLObject ch = SubLNil.NIL;
		ch = cdolist_list_var2.first();
		while (SubLNil.NIL != cdolist_list_var2) {
			set_trait(ch, reader.$standard_readtable$.getDynamicValue(), reader.$invalid$.getGlobalValue());
			cdolist_list_var2 = cdolist_list_var2.rest();
			ch = cdolist_list_var2.first();
		}
		SubLObject alphadigit = cdolist_list_var2 = reader.$list105;
		ch = SubLNil.NIL;
		ch = cdolist_list_var2.first();
		while (SubLNil.NIL != cdolist_list_var2) {
			set_trait(ch, reader.$standard_readtable$.getDynamicValue(), reader.$alphabetic$.getGlobalValue());
			set_trait(ch, reader.$standard_readtable$.getDynamicValue(), reader.$digit$.getGlobalValue());
			cdolist_list_var2 = cdolist_list_var2.rest();
			ch = cdolist_list_var2.first();
		}
		set_trait(Characters.CHAR_colon, reader.$standard_readtable$.getDynamicValue(),
				reader.$package_marker$.getGlobalValue());
		set_trait(Characters.CHAR_plus, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		set_trait(Characters.CHAR_plus, reader.$standard_readtable$.getDynamicValue(),
				reader.$plus_sign$.getGlobalValue());
		set_trait(Characters.CHAR_hyphen, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		set_trait(Characters.CHAR_hyphen, reader.$standard_readtable$.getDynamicValue(),
				reader.$minus_sign$.getGlobalValue());
		set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(), reader.$dot$.getGlobalValue());
		set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(),
				reader.$decimal_point$.getGlobalValue());
		set_trait(Characters.CHAR_slash, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		set_trait(Characters.CHAR_slash, reader.$standard_readtable$.getDynamicValue(),
				reader.$ratio_marker$.getGlobalValue());
		set_trait(Characters.CHAR_D, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_d, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_E, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_e, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_F, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_f, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_L, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_l, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_S, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		set_trait(Characters.CHAR_s, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		if (SubLNil.NIL == Symbols.boundp(reader.$sym52$_READTABLE_)
				|| SubLNil.NIL == reader.$readtable$.getDynamicValue())
			reader.$readtable$.setDynamicValue(
					copy_readtable(reader.$standard_readtable$.getDynamicValue(), CommonSymbols.UNPROVIDED));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				reader.$dtp_read_token$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym125$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim(reader.$list126);
		Structures.def_csetf(reader.$sym127$READ_TOKEN_POINTER, reader.$sym128$_CSETF_READ_TOKEN_POINTER);
		Structures.def_csetf(reader.$sym129$READ_TOKEN_BUFFER, reader.$sym130$_CSETF_READ_TOKEN_BUFFER);
		Structures.def_csetf(reader.$sym131$READ_TOKEN_ESCAPES, reader.$sym132$_CSETF_READ_TOKEN_ESCAPES);
		Equality.identity(reader.$sym119$READ_TOKEN);
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				reader.$dtp_read_token$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym137$VISIT_DEFSTRUCT_OBJECT_READ_TOKEN_METHOD));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 69917L)
	public static SubLObject sharpsign_a_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (!arg.eql(CommonSymbols.ONE_INTEGER) && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unimplemented_reader_macro_error(stream, ch);
		SubLObject contents = SubLNil.NIL;
		SubLObject _prev_bind_0 = reader.$reading_fake_list$.currentBinding(thread);
		try {
			reader.$reading_fake_list$.bind(CommonSymbols.T, thread);
			contents = read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
		} finally {
			reader.$reading_fake_list$.rebind(_prev_bind_0, thread);
		}
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		if (!contents.isList()) {
			simple_reader_error(reader.$str213$The_form_after__A_reader_macro_wa, ConsesLow.list(ch));
			return SubLNil.NIL;
		}
		return Values.values(Functions.apply(Symbols.symbol_function(reader.$sym191$VECTOR), contents),
				CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 66736L)
	public static SubLObject sharpsign_asterisk_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else
			unimplemented_reader_macro_error(stream, ch);
		return Values.values(SubLNil.NIL, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 68984L)
	public static SubLObject sharpsign_b_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		return Values.values(read_number_in_radix(stream, CommonSymbols.TWO_INTEGER), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 65271L)
	public static SubLObject sharpsign_backslash_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		SubLObject token = make_read_token(CommonSymbols.UNPROVIDED);
		_csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		_csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		_csetf_read_token_escapes(token, SubLNil.NIL);
		add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
		read_token(stream, token, SubLNil.NIL);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		SubLObject name = read_token_string(token);
		SubLObject ch_$1 = Characters.name_character(name);
		if (SubLNil.NIL != ch_$1)
			return Values.values(ch_$1, CommonSymbols.T);
		simple_reader_error(reader.$str208$_S_is_not_the_name_of_a_character, ConsesLow.list(name));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 69740L)
	public static SubLObject sharpsign_c_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else
			unimplemented_reader_macro_error(stream, ch);
		return Values.values(SubLNil.NIL, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 53487L)
	public static SubLObject sharpsign_capital_g_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg)
			simple_reader_error(reader.$str171$The__S_reader_macro_does_not_take, ConsesLow.list(ch));
		SubLObject string = read(stream, SubLNil.NIL, SubLNil.NIL, CommonSymbols.T);
		if (!string.isString())
			simple_reader_error(reader.$str172$The__S_reader_macro_expected_a_st, ConsesLow.list(ch));
		if (SubLNil.NIL == Guids.guid_string_p(string))
			simple_reader_error(reader.$str173$The__S_reader_macro_could_not_int, ConsesLow.list(ch, string));
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		return Values.values(Guids.string_to_guid(string), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 66920L)
	public static SubLObject sharpsign_colon_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		SubLObject token = make_read_token(CommonSymbols.UNPROVIDED);
		_csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		_csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		_csetf_read_token_escapes(token, SubLNil.NIL);
		read_token(stream, token, SubLNil.NIL);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			Values.values(SubLNil.NIL, CommonSymbols.T);
		else {
			SubLObject escapes = Sequences.nreverse(read_token_escapes(token));
			_csetf_read_token_escapes(token, escapes);
			if (SubLNil.NIL == escapes
					&& SubLNil.NIL != potential_number_p(read_token_buffer(token), read_token_pointer(token)))
				invalid_token_syntax_error(stream, token);
			frob_case(token);
			SubLObject buffer = read_token_buffer(token);
			SubLObject length = read_token_pointer(token);
			SubLObject escapes_$2 = read_token_escapes(token);
			SubLObject dot_count = CommonSymbols.ZERO_INTEGER;
			SubLObject i;
			SubLObject ch_$3;
			SubLObject escape_idx;
			for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
					.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				ch_$3 = Strings.sublisp_char(buffer, i);
				escape_idx = escapes_$2.first();
				if (SubLNil.NIL != escape_idx && escape_idx.numE(i))
					escapes_$2 = escapes_$2.rest();
				else if (SubLNil.NIL != package_marker_traitp(ch_$3))
					invalid_token_syntax_error(stream, token);
				else if (SubLNil.NIL != dot_traitp(ch_$3))
					dot_count = Numbers.add(dot_count, CommonSymbols.ONE_INTEGER);
			}
			if (!dot_count.numE(length))
				return Values.values(Symbols.make_symbol(read_token_string(token)), CommonSymbols.T);
			invalid_token_syntax_error(stream, token);
		}
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 68100L)
	public static SubLObject sharpsign_dot_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		SubLObject subform = read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		if (SubLNil.NIL == reader.$read_eval$.getDynamicValue(thread)) {
			simple_reader_error(reader.$str210$Attempt_the_use_the__A_reader_mac,
					ConsesLow.list(ch, reader.$sym211$_READ_EVAL_, reader.$read_eval$.getDynamicValue(thread)));
			return SubLNil.NIL;
		}
		return Values.values(Eval.eval(subform), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 71330L)
	public static SubLObject sharpsign_equals_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			illegal_argument_error(stream, ch, arg);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		SubLObject subform = read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
		thread.resetMultipleValues();
		SubLObject old = read_lookup(arg);
		SubLObject oldp = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (SubLNil.NIL != oldp)
			simple_reader_error(reader.$str214$Label__S_appears_more_than_once_, ConsesLow.list(arg));
		else
			set_read_lookup(arg, subform);
		return Values.values(subform, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 66201L)
	public static SubLObject sharpsign_left_paren_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject elts = read_delimited_list(Characters.CHAR_rparen, stream, CommonSymbols.T);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		SubLObject length = Sequences.length(elts);
		if (SubLNil.NIL != arg)
			if (!arg.numE(length))
				if (length.numL(arg))
					elts = ConsesLow.append(elts, ConsesLow.make_list(Numbers.subtract(arg, length),
							conses_high.last(elts, CommonSymbols.UNPROVIDED).first()));
				else
					illegal_argument_error(stream, ch, arg);
		return Values.values(
				reader.$backquote_depth$.getDynamicValue(thread).numG(CommonSymbols.ZERO_INTEGER)
						? ConsesLow.cons(reader.$bq_vector$.getDynamicValue(thread), elts)
						: Functions.apply(Symbols.symbol_function(reader.$sym191$VECTOR), elts),
				CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 73958L)
	public static SubLObject sharpsign_minus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		if (SubLNil.NIL != read_features(stream)) {
			SubLObject _prev_bind_0 = reader.$read_suppress$.currentBinding(thread);
			try {
				reader.$read_suppress$.bind(CommonSymbols.T, thread);
				read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
			} finally {
				reader.$read_suppress$.rebind(_prev_bind_0, thread);
			}
			return Values.values(SubLNil.NIL, SubLNil.NIL);
		}
		return Values.values(read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 69165L)
	public static SubLObject sharpsign_o_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		return Values.values(read_number_in_radix(stream, CommonSymbols.EIGHT_INTEGER), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 70616L)
	public static SubLObject sharpsign_p_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		SubLObject subform = read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		return Values.values(subform, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 73631L)
	public static SubLObject sharpsign_plus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		if (SubLNil.NIL != read_features(stream))
			return Values.values(read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T), CommonSymbols.T);
		SubLObject _prev_bind_0 = reader.$read_suppress$.currentBinding(thread);
		try {
			reader.$read_suppress$.bind(CommonSymbols.T, thread);
			read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
		} finally {
			reader.$read_suppress$.rebind(_prev_bind_0, thread);
		}
		return Values.values(SubLNil.NIL, SubLNil.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 69556L)
	public static SubLObject sharpsign_r_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		if (SubLNil.NIL == arg || !arg.numGE(CommonSymbols.TWO_INTEGER) || !arg.numLE(reader.$int212$36))
			illegal_argument_error(stream, ch, arg);
		return Values.values(read_number_in_radix(stream, arg), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 70424L)
	public static SubLObject sharpsign_s_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else
			unimplemented_reader_macro_error(stream, ch);
		return Values.values(SubLNil.NIL, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 72044L)
	public static SubLObject sharpsign_sharpsign_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			illegal_argument_error(stream, ch, arg);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		thread.resetMultipleValues();
		SubLObject old = read_lookup(arg);
		SubLObject oldp = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (SubLNil.NIL != oldp)
			return Values.values(old, CommonSymbols.T);
		simple_reader_error(reader.$str215$Label__S_has_not_been_seen_, ConsesLow.list(arg));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 65876L)
	public static SubLObject sharpsign_single_quote_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		SubLObject subform = read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
		if (SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(SubLNil.NIL, CommonSymbols.T);
		return Values.values(ConsesLow.list(reader.$sym209$FUNCTION, subform), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 74286L)
	public static SubLObject sharpsign_vertical_bar_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		SubLObject depth = CommonSymbols.ONE_INTEGER;
		SubLObject state = reader.$kw154$INITIAL;
		SubLObject ch_$4 = SubLNil.NIL;
		ch_$4 = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
		while (true) {
			SubLObject pcase_var = state;
			if (pcase_var.eql(reader.$kw221$HASH)) {
				SubLObject pcase_var_$5 = ch_$4;
				if (pcase_var_$5.eql(Characters.CHAR_vertical)) {
					depth = Numbers.add(depth, CommonSymbols.ONE_INTEGER);
					state = reader.$kw154$INITIAL;
				} else if (!pcase_var_$5.eql(Characters.CHAR_hash))
					state = reader.$kw154$INITIAL;
			} else if (pcase_var.eql(reader.$kw222$VERTICAL_BAR)) {
				SubLObject pcase_var_$6 = ch_$4;
				if (!pcase_var_$6.eql(Characters.CHAR_vertical))
					if (pcase_var_$6.eql(Characters.CHAR_hash)) {
						depth = Numbers.subtract(depth, CommonSymbols.ONE_INTEGER);
						if (depth.isZero())
							break;
					} else
						state = reader.$kw154$INITIAL;
			} else if (pcase_var.eql(reader.$kw154$INITIAL)) {
				SubLObject pcase_var_$7 = ch_$4;
				if (pcase_var_$7.eql(Characters.CHAR_vertical))
					state = reader.$kw222$VERTICAL_BAR;
				else if (pcase_var_$7.eql(Characters.CHAR_hash))
					state = reader.$kw221$HASH;
			}
			ch_$4 = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
		}
		return Values.values(SubLNil.NIL, SubLNil.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 69360L)
	public static SubLObject sharpsign_x_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != arg && SubLNil.NIL == reader.$read_suppress$.getDynamicValue(thread))
			unnecessary_argument_error(stream, ch);
		return Values.values(read_number_in_radix(stream, CommonSymbols.SIXTEEN_INTEGER), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 23097L)
	public static SubLObject simple_reader_error(SubLObject format_control, SubLObject format_arguments) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != reader.$throw_reader_error_p$.getDynamicValue(thread))
			Dynamic.sublisp_throw(reader.$sym106$READER_ERROR, CommonSymbols.T);
		else
			Functions.apply(Symbols.symbol_function(reader.$sym107$ERROR), format_control, format_arguments);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 8876L)
	public static SubLObject single_byte_p(SubLObject ch) {
		return Numbers.numL(Characters.char_code(ch), reader.$single_byte_max_code$.getGlobalValue());
	}

	@SubL(source = "sublisp/reader.lisp", position = 53117L)
	public static SubLObject single_escape_rmf(SubLObject stream, SubLObject ch) {
		SubLObject token = make_read_token(CommonSymbols.UNPROVIDED);
		_csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		_csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		_csetf_read_token_escapes(token, SubLNil.NIL);
		add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
		read_token(stream, token, SubLNil.NIL);
		return Values.values(parse_token(stream, token), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9882L)
	public static SubLObject single_escape_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(
				SubLNil.NIL != single_byte_p(ch)
						? Vectors.aref(readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
								Characters.char_code(ch))
						: Hashtables.gethash(ch, readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
								reader.$kw49$CONSTITUENT),
				reader.$kw63$SINGLE_ESCAPE);
	}

	@SubL(source = "sublisp/reader.lisp", position = 56303L)
	public static SubLObject single_quote_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject object = read(stream, CommonSymbols.T, SubLNil.NIL, CommonSymbols.T);
		return Values.values(SubLNil.NIL != reader.$read_suppress$.getDynamicValue(thread) ? SubLNil.NIL
				: ConsesLow.list(reader.$sym184$QUOTE, object), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 38239L)
	public static SubLObject symbol_escapep(SubLObject symbol) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject name = Symbols.symbol_name(symbol);
		SubLObject length = Sequences.length(name);
		SubLObject escapep = SubLNil.NIL;
		SubLObject _prev_bind_0 = reader.$read_base$.currentBinding(thread);
		try {
			reader.$read_base$.bind(print_high.$print_base$.getDynamicValue(thread), thread);
			escapep = potential_number_p(name, length);
		} finally {
			reader.$read_base$.rebind(_prev_bind_0, thread);
		}
		if (SubLNil.NIL != escapep)
			return CommonSymbols.T;
		SubLObject non_consing_dot = SubLNil.NIL;
		SubLObject v_case = readtable_case(reader.$readtable$.getDynamicValue(thread));
		SubLObject i;
		SubLObject ch;
		for (i = SubLNil.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			ch = Strings.sublisp_char(name, i);
			if (!Characters.CHAR_vertical.equalp(ch) && SubLNil.NIL == constituent_syntaxp(ch))
				return CommonSymbols.T;
			if (SubLNil.NIL != package_marker_traitp(ch))
				return CommonSymbols.T;
			if (SubLNil.NIL == dot_traitp(ch))
				non_consing_dot = CommonSymbols.T;
			if (SubLNil.NIL != Characters.both_case_p(ch)) {
				if (SubLNil.NIL != Characters.lower_case_p(ch) && v_case == reader.$kw48$UPCASE)
					return CommonSymbols.T;
				if (SubLNil.NIL != Characters.upper_case_p(ch) && v_case == reader.$kw145$DOWNCASE)
					return CommonSymbols.T;
			}
		}
		return SubLObjectFactory.makeBoolean(SubLNil.NIL == non_consing_dot);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9596L)
	public static SubLObject terminating_macro_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(
				SubLNil.NIL != single_byte_p(ch)
						? Vectors.aref(readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
								Characters.char_code(ch))
						: Hashtables.gethash(ch, readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
								reader.$kw49$CONSTITUENT),
				reader.$kw60$TERMINATING_MACRO);
	}

	@SubL(source = "sublisp/reader.lisp", position = 23813L)
	public static SubLObject unimplemented_reader_macro_error(SubLObject stream, SubLObject ch) {
		simple_reader_error(reader.$str111$The__A_reader_macro_is_not_implem, ConsesLow.list(ch));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 23974L)
	public static SubLObject unnecessary_argument_error(SubLObject stream, SubLObject ch) {
		simple_reader_error(reader.$str112$The__A_reader_macro_does_not_take, ConsesLow.list(ch));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject visit_defstruct_object_read_token_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_read_token(obj, visitor_fn);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject visit_defstruct_object_readtable_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_readtable(obj, visitor_fn);
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject visit_defstruct_read_token(SubLObject obj, SubLObject visitor_fn) {
		Functions.funcall(visitor_fn, obj, reader.$kw40$BEGIN, reader.$sym136$MAKE_READ_TOKEN,
				CommonSymbols.THREE_INTEGER);
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw133$POINTER, read_token_pointer(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw134$BUFFER, read_token_buffer(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw135$ESCAPES, read_token_escapes(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw43$END, reader.$sym136$MAKE_READ_TOKEN,
				CommonSymbols.THREE_INTEGER);
		return obj;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject visit_defstruct_readtable(SubLObject obj, SubLObject visitor_fn) {
		Functions.funcall(visitor_fn, obj, reader.$kw40$BEGIN, reader.$sym41$MAKE_READTABLE,
				CommonSymbols.EIGHT_INTEGER);
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw31$CASE, readtable_case(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw32$CHARACTER_SYNTAX,
				readtable_character_syntax(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw33$SINGLE_BYTE_CHAR_SYNTAX,
				readtable_single_byte_char_syntax(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw34$MACRO_FUNCTIONS,
				readtable_macro_functions(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw35$SINGLE_BYTE_MACRO_FUNCTIONS,
				readtable_single_byte_macro_functions(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw36$CONSTITUENT_TRAITS,
				readtable_constituent_traits(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw37$SINGLE_BYTE_CONSTIT_TRAITS,
				readtable_single_byte_constit_traits(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw38$DISPATCH_TABLES,
				readtable_dispatch_tables(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw43$END, reader.$sym41$MAKE_READTABLE, CommonSymbols.EIGHT_INTEGER);
		return obj;
	}

	@SubL(source = "sublisp/reader.lisp", position = 4948L)
	public static SubLObject whitespace_1_char_p(SubLObject v_char) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return conses_high.member(v_char, reader.$whitespace_1_chars$.getDynamicValue(thread), CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/reader.lisp", position = 5249L)
	public static SubLObject whitespace_2_char_p(SubLObject v_char) {
		return whitespace_syntaxp(v_char);
	}

	@SubL(source = "sublisp/reader.lisp", position = 52444L)
	public static SubLObject whitespace_rmf(SubLObject stream, SubLObject ch) {
		return Values.values(SubLNil.NIL, SubLNil.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9968L)
	public static SubLObject whitespace_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(
				SubLNil.NIL != single_byte_p(ch)
						? Vectors.aref(readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
								Characters.char_code(ch))
						: Hashtables.gethash(ch, readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
								reader.$kw49$CONSTITUENT),
				reader.$kw64$WHITESPACE);
	}

	@SubL(source = "sublisp/reader.lisp", position = 32004L)
	public static SubLObject with_read_token(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject token = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list138);
		token = current.first();
		SubLObject body;
		current = body = current.rest();
		return ConsesLow.listS(reader.$sym114$CLET, ConsesLow.list(bq_cons(token, reader.$list139)), reader.$list140,
				reader.$list141, reader.$list142, ConsesLow.append(body, SubLNil.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 29570L)
	public static SubLObject with_special_reader_error_handling(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return bq_cons(reader.$sym116$PROGN, ConsesLow.append(body, SubLNil.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 29330L)
	public static SubLObject with_standard_io_syntax(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return ConsesLow.listS(reader.$sym114$CLET, reader.$list115, ConsesLow.append(body, SubLNil.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 12875L)
	public static SubLObject Xcopy_hash_table(SubLObject from, SubLObject to) {
		SubLObject k = SubLNil.NIL;
		SubLObject v = SubLNil.NIL;
		Iterator cdohash_iterator = Hashtables.getEntrySetIterator(from);
		try {
			while (Hashtables.iteratorHasNext(cdohash_iterator)) {
				Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
				k = Hashtables.getEntryKey(cdohash_entry);
				v = Hashtables.getEntryValue(cdohash_entry);
				Hashtables.sethash(k, to, v);
			}
		} finally {
			Hashtables.releaseEntrySetIterator(cdohash_iterator);
		}
		return to;
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader";
	@SubL(source = "sublisp/reader.lisp", position = 4653L)
	public static SubLSymbol $whitespace_1_chars$;
	@SubL(source = "sublisp/reader.lisp", position = 5476L)
	public static SubLSymbol $read_base$;
	@SubL(source = "sublisp/reader.lisp", position = 5623L)
	public static SubLSymbol $read_default_float_format$;
	@SubL(source = "sublisp/reader.lisp", position = 5688L)
	public static SubLSymbol $read_eval$;
	@SubL(source = "sublisp/reader.lisp", position = 5725L)
	public static SubLSymbol $read_suppress$;
	@SubL(source = "sublisp/reader.lisp", position = 5768L)
	public static SubLSymbol $features$;
	@SubL(source = "sublisp/reader.lisp", position = 5840L)
	public static SubLSymbol $readtable$;
	@SubL(source = "sublisp/reader.lisp", position = 5862L)
	private static SubLSymbol $initial_table_size$;
	@SubL(source = "sublisp/reader.lisp", position = 6222L)
	public static SubLSymbol $single_byte_max_code$;
	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLSymbol $dtp_readtable$;
	@SubL(source = "sublisp/reader.lisp", position = 7471L)
	private static SubLSymbol $alphabetic$;
	@SubL(source = "sublisp/reader.lisp", position = 7626L)
	private static SubLSymbol $digit$;
	@SubL(source = "sublisp/reader.lisp", position = 7671L)
	private static SubLSymbol $package_marker$;
	@SubL(source = "sublisp/reader.lisp", position = 7716L)
	private static SubLSymbol $plus_sign$;
	@SubL(source = "sublisp/reader.lisp", position = 7761L)
	private static SubLSymbol $minus_sign$;
	@SubL(source = "sublisp/reader.lisp", position = 7806L)
	private static SubLSymbol $dot$;
	@SubL(source = "sublisp/reader.lisp", position = 7851L)
	private static SubLSymbol $decimal_point$;
	@SubL(source = "sublisp/reader.lisp", position = 7896L)
	private static SubLSymbol $ratio_marker$;
	@SubL(source = "sublisp/reader.lisp", position = 7941L)
	private static SubLSymbol $exponent_marker$;
	@SubL(source = "sublisp/reader.lisp", position = 7986L)
	private static SubLSymbol $invalid$;
	@SubL(source = "sublisp/reader.lisp", position = 8844L)
	public static SubLSymbol $standard_readtable$;
	@SubL(source = "sublisp/reader.lisp", position = 22812L)
	private static SubLSymbol $throw_reader_error_p$;
	@SubL(source = "sublisp/reader.lisp", position = 23289L)
	private static SubLSymbol $throw_end_of_file_p$;
	@SubL(source = "sublisp/reader.lisp", position = 24300L)
	private static SubLSymbol $read_lookup_table$;
	@SubL(source = "sublisp/reader.lisp", position = 31841L)
	private static SubLSymbol $initial_token_size$;
	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLSymbol $dtp_read_token$;
	@SubL(source = "sublisp/reader.lisp", position = 40995L)
	private static SubLSymbol $consing_dot$;
	@SubL(source = "sublisp/reader.lisp", position = 41041L)
	public static SubLSymbol $keyword_package$;
	@SubL(source = "sublisp/reader.lisp", position = 41097L)
	private static SubLSymbol $reading_list$;
	@SubL(source = "sublisp/reader.lisp", position = 41126L)
	private static SubLSymbol $reading_fake_list$;
	@SubL(source = "sublisp/reader.lisp", position = 54191L)
	private static SubLSymbol $right_paren$;
	@SubL(source = "sublisp/reader.lisp", position = 55891L)
	public static SubLSymbol $ignore_extra_right_parens$;
	@SubL(source = "sublisp/reader.lisp", position = 58427L)
	private static SubLSymbol $bq_comma$;
	@SubL(source = "sublisp/reader.lisp", position = 59980L)
	private static SubLSymbol $bq_atsign$;
	@SubL(source = "sublisp/reader.lisp", position = 60025L)
	private static SubLSymbol $bq_dot$;
	@SubL(source = "sublisp/reader.lisp", position = 60070L)
	private static SubLSymbol $bq_vector$;
	@SubL(source = "sublisp/reader.lisp", position = 63520L)
	private static SubLSymbol $backquote_depth$;
	private static SubLSymbol $sym0$CDO;
	private static SubLList $list1;
	private static SubLSymbol $sym2$DOUBLE_FLOAT;
	private static SubLList $list3;
	private static SubLInteger $int4$32;
	private static SubLInteger $int5$128;
	private static SubLSymbol $sym6$READTABLE;
	private static SubLSymbol $sym7$READTABLE_P;
	private static SubLList $list8;
	private static SubLList $list9;
	private static SubLList $list10;
	private static SubLList $list11;
	private static SubLSymbol $sym12$DEFAULT_STRUCT_PRINT_FUNCTION;
	private static SubLSymbol $sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE;
	private static SubLList $list14;
	private static SubLSymbol $sym15$READTABLE_CASE;
	private static SubLSymbol $sym16$_CSETF_READTABLE_CASE;
	private static SubLSymbol $sym17$READTABLE_CHARACTER_SYNTAX;
	private static SubLSymbol $sym18$_CSETF_READTABLE_CHARACTER_SYNTAX;
	private static SubLSymbol $sym19$READTABLE_SINGLE_BYTE_CHAR_SYNTAX;
	private static SubLSymbol $sym20$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX;
	private static SubLSymbol $sym21$READTABLE_MACRO_FUNCTIONS;
	private static SubLSymbol $sym22$_CSETF_READTABLE_MACRO_FUNCTIONS;
	private static SubLSymbol $sym23$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS;
	private static SubLSymbol $sym24$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS;
	private static SubLSymbol $sym25$READTABLE_CONSTITUENT_TRAITS;
	private static SubLSymbol $sym26$_CSETF_READTABLE_CONSTITUENT_TRAITS;
	private static SubLSymbol $sym27$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS;
	private static SubLSymbol $sym28$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS;
	private static SubLSymbol $sym29$READTABLE_DISPATCH_TABLES;
	private static SubLSymbol $sym30$_CSETF_READTABLE_DISPATCH_TABLES;
	private static SubLSymbol $kw31$CASE;
	private static SubLSymbol $kw32$CHARACTER_SYNTAX;
	private static SubLSymbol $kw33$SINGLE_BYTE_CHAR_SYNTAX;
	private static SubLSymbol $kw34$MACRO_FUNCTIONS;
	private static SubLSymbol $kw35$SINGLE_BYTE_MACRO_FUNCTIONS;
	private static SubLSymbol $kw36$CONSTITUENT_TRAITS;
	private static SubLSymbol $kw37$SINGLE_BYTE_CONSTIT_TRAITS;
	private static SubLSymbol $kw38$DISPATCH_TABLES;
	private static SubLString $str39$Invalid_slot__S_for_construction_;
	private static SubLSymbol $kw40$BEGIN;
	private static SubLSymbol $sym41$MAKE_READTABLE;
	private static SubLSymbol $kw42$SLOT;
	private static SubLSymbol $kw43$END;
	private static SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_READTABLE_METHOD;
	private static SubLInteger $int45$64;
	private static SubLInteger $int46$256;
	private static SubLInteger $int47$512;
	private static SubLSymbol $kw48$UPCASE;
	private static SubLSymbol $kw49$CONSTITUENT;
	private static SubLSymbol $sym50$CONSTITUENT_RMF;
	private static SubLList $list51;
	private static SubLSymbol $sym52$_READTABLE_;
	private static SubLSymbol $sym53$FIF;
	private static SubLSymbol $sym54$SINGLE_BYTE_P;
	private static SubLSymbol $sym55$AREF;
	private static SubLSymbol $sym56$CHAR_CODE;
	private static SubLSymbol $sym57$GETHASH;
	private static SubLList $list58;
	private static SubLSymbol $kw59$INVALID;
	private static SubLSymbol $kw60$TERMINATING_MACRO;
	private static SubLSymbol $kw61$NON_TERMINATING_MACRO;
	private static SubLSymbol $kw62$MULTIPLE_ESCAPE;
	private static SubLSymbol $kw63$SINGLE_ESCAPE;
	private static SubLSymbol $kw64$WHITESPACE;
	private static SubLList $list65;
	private static SubLSymbol $sym66$PLUSP;
	private static SubLSymbol $sym67$LOGAND;
	private static SubLSymbol $sym68$CHARACTER_TRAITS;
	private static SubLList $list69;
	private static SubLSymbol $sym70$CAR;
	private static SubLSymbol $sym71$DISPATCHING_RMF;
	private static SubLString $str72$Attempt_to_make_decimal_digit__A_;
	private static SubLString $str73$_A_is_not_a_dispatching_macro_cha;
	private static SubLSymbol $sym74$WHITESPACE_RMF;
	private static SubLSymbol $sym75$SINGLE_ESCAPE_RMF;
	private static SubLSymbol $sym76$MULTIPLE_ESCAPE_RMF;
	private static SubLSymbol $sym77$LEFT_PAREN_RMF;
	private static SubLSymbol $sym78$RIGHT_PAREN_RMF;
	private static SubLSymbol $sym79$SINGLE_QUOTE_RMF;
	private static SubLSymbol $sym80$SEMICOLON_RMF;
	private static SubLSymbol $sym81$DOUBLE_QUOTE_RMF;
	private static SubLSymbol $sym82$BACKQUOTE_RMF;
	private static SubLSymbol $sym83$COMMA_RMF;
	private static SubLSymbol $sym84$SHARPSIGN_BACKSLASH_RMF;
	private static SubLSymbol $sym85$SHARPSIGN_SINGLE_QUOTE_RMF;
	private static SubLSymbol $sym86$SHARPSIGN_LEFT_PAREN_RMF;
	private static SubLSymbol $sym87$SHARPSIGN_ASTERISK_RMF;
	private static SubLSymbol $sym88$SHARPSIGN_COLON_RMF;
	private static SubLSymbol $sym89$SHARPSIGN_DOT_RMF;
	private static SubLSymbol $sym90$SHARPSIGN_B_RMF;
	private static SubLSymbol $sym91$SHARPSIGN_O_RMF;
	private static SubLSymbol $sym92$SHARPSIGN_X_RMF;
	private static SubLSymbol $sym93$SHARPSIGN_R_RMF;
	private static SubLSymbol $sym94$SHARPSIGN_C_RMF;
	private static SubLSymbol $sym95$SHARPSIGN_A_RMF;
	private static SubLSymbol $sym96$SHARPSIGN_S_RMF;
	private static SubLSymbol $sym97$SHARPSIGN_P_RMF;
	private static SubLSymbol $sym98$SHARPSIGN_CAPITAL_G_RMF;
	private static SubLSymbol $sym99$SHARPSIGN_EQUALS_RMF;
	private static SubLSymbol $sym100$SHARPSIGN_SHARPSIGN_RMF;
	private static SubLSymbol $sym101$SHARPSIGN_PLUS_RMF;
	private static SubLSymbol $sym102$SHARPSIGN_MINUS_RMF;
	private static SubLSymbol $sym103$SHARPSIGN_VERTICAL_BAR_RMF;
	private static SubLList $list104;
	private static SubLList $list105;
	private static SubLSymbol $sym106$READER_ERROR;
	private static SubLSymbol $sym107$ERROR;
	private static SubLSymbol $sym108$END_OF_FILE;
	private static SubLString $str109$End_of_file_on_stream__S_;
	private static SubLString $str110$_S_is_invalid_token_syntax_;
	private static SubLString $str111$The__A_reader_macro_is_not_implem;
	private static SubLString $str112$The__A_reader_macro_does_not_take;
	private static SubLString $str113$Illegal_argument__D_for_the__A_re;
	private static SubLSymbol $sym114$CLET;
	private static SubLList $list115;
	private static SubLSymbol $sym116$PROGN;
	private static SubLSymbol $kw117$EOF;
	private static SubLSymbol $kw118$ERROR;
	private static SubLSymbol $sym119$READ_TOKEN;
	private static SubLSymbol $sym120$READ_TOKEN_P;
	private static SubLList $list121;
	private static SubLList $list122;
	private static SubLList $list123;
	private static SubLList $list124;
	private static SubLSymbol $sym125$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE;
	private static SubLList $list126;
	private static SubLSymbol $sym127$READ_TOKEN_POINTER;
	private static SubLSymbol $sym128$_CSETF_READ_TOKEN_POINTER;
	private static SubLSymbol $sym129$READ_TOKEN_BUFFER;
	private static SubLSymbol $sym130$_CSETF_READ_TOKEN_BUFFER;
	private static SubLSymbol $sym131$READ_TOKEN_ESCAPES;
	private static SubLSymbol $sym132$_CSETF_READ_TOKEN_ESCAPES;
	private static SubLSymbol $kw133$POINTER;
	private static SubLSymbol $kw134$BUFFER;
	private static SubLSymbol $kw135$ESCAPES;
	private static SubLSymbol $sym136$MAKE_READ_TOKEN;
	private static SubLSymbol $sym137$VISIT_DEFSTRUCT_OBJECT_READ_TOKEN_METHOD;
	private static SubLList $list138;
	private static SubLList $list139;
	private static SubLList $list140;
	private static SubLList $list141;
	private static SubLList $list142;
	private static SubLString $str143$_A_is_an_invalid_character_;
	private static SubLString $str144$Fell_through_character_syntax_on_;
	private static SubLSymbol $kw145$DOWNCASE;
	private static SubLString $str146$_S_is_not_a_known_package_;
	private static SubLSymbol $kw147$PRESERVE;
	private static SubLSymbol $kw148$INVERT;
	private static SubLSymbol $sym149$CONSING_DOT;
	private static SubLString $str150$KEYWORD;
	private static SubLSymbol $kw151$EXTERNAL;
	private static SubLString $str152$_S_is_not_external_in__S_;
	private static SubLFloat $float153$0_0;
	private static SubLSymbol $kw154$INITIAL;
	private static SubLSymbol $kw155$DOT1;
	private static SubLSymbol $kw156$SIGN;
	private static SubLSymbol $kw157$DECIMALS;
	private static SubLSymbol $kw158$DIGITS;
	private static SubLSymbol $kw159$EXPONENT;
	private static SubLSymbol $kw160$DOT2;
	private static SubLSymbol $kw161$SLASH;
	private static SubLSymbol $kw162$DENOMINATOR;
	private static SubLSymbol $kw163$FRACTION;
	private static SubLSymbol $kw164$DECIMALS2;
	private static SubLSymbol $kw165$EXPONENT_SIGN;
	private static SubLSymbol $kw166$EXPONENT_VALUE;
	private static SubLString $str167$Can_t_happen_;
	private static SubLSymbol $kw168$DIGIT;
	private static SubLString $str169$_S_does_not_contain_an_integer_;
	private static SubLSymbol $kw170$TRAILING_WHITESPACE;
	private static SubLString $str171$The__S_reader_macro_does_not_take;
	private static SubLString $str172$The__S_reader_macro_expected_a_st;
	private static SubLString $str173$The__S_reader_macro_could_not_int;
	private static SubLSymbol $sym174$RIGHT_PAREN;
	private static SubLString $str175$Nothing_before_consing_dot_;
	private static SubLSymbol $kw176$LIST;
	private static SubLSymbol $kw177$CONSING_DOT;
	private static SubLString $str178$Nothing_after_consing_dot_;
	private static SubLString $str179$Too_many_consing_dots_;
	private static SubLSymbol $kw180$AFTER_CONSING_DOT;
	private static SubLString $str181$Too_many_objects_after_consing_do;
	private static SubLString $str182$Ignoring_unmatched_close_parenthe;
	private static SubLString $str183$Unmatched__A_;
	private static SubLSymbol $sym184$QUOTE;
	private static SubLSymbol $kw185$NORMAL;
	private static SubLSymbol $kw186$ESCAPE;
	private static SubLSymbol $sym187$LIST;
	private static SubLSymbol $sym188$LIST_;
	private static SubLSymbol $sym189$APPEND;
	private static SubLSymbol $sym190$NCONC;
	private static SubLSymbol $sym191$VECTOR;
	private static SubLSymbol $sym192$BQ_VECTOR;
	private static SubLSymbol $sym193$BQ_APPEND;
	private static SubLString $str194$_;
	private static SubLString $str195$_;
	private static SubLString $str196$_;
	private static SubLString $str197$BQ_VECTOR;
	private static SubLString $str198$_A_after_dot_in__S_;
	private static SubLList $list199;
	private static SubLList $list200;
	private static SubLSymbol $sym201$CONS;
	private static SubLSymbol $sym202$BQ_LIST_;
	private static SubLSymbol $sym203$BQ_CONS;
	private static SubLList $list204;
	private static SubLString $str205$_A_read_after_backquote_in__S_;
	private static SubLString $str206$_S_read_outside_a_backquote_;
	private static SubLString $str207$Undefined_reader_macro__A_A_;
	private static SubLString $str208$_S_is_not_the_name_of_a_character;
	private static SubLSymbol $sym209$FUNCTION;
	private static SubLString $str210$Attempt_the_use_the__A_reader_mac;
	private static SubLSymbol $sym211$_READ_EVAL_;
	private static SubLInteger $int212$36;
	private static SubLString $str213$The_form_after__A_reader_macro_wa;
	private static SubLString $str214$Label__S_appears_more_than_once_;
	private static SubLString $str215$Label__S_has_not_been_seen_;
	private static SubLSymbol $kw216$NOT;
	private static SubLString $str217$Bogus_feature_expression__S_;
	private static SubLSymbol $kw218$AND;
	private static SubLSymbol $kw219$OR;
	private static SubLString $str220$Unknown_feature_operator__S_;
	private static SubLSymbol $kw221$HASH;
	private static SubLSymbol $kw222$VERTICAL_BAR;
	static {
		me = new reader();
		reader.$whitespace_1_chars$ = null;
		reader.$read_base$ = null;
		reader.$read_default_float_format$ = null;
		reader.$read_eval$ = null;
		reader.$read_suppress$ = null;
		reader.$features$ = null;
		reader.$readtable$ = null;
		reader.$initial_table_size$ = null;
		reader.$single_byte_max_code$ = null;
		reader.$dtp_readtable$ = null;
		reader.$alphabetic$ = null;
		reader.$digit$ = null;
		reader.$package_marker$ = null;
		reader.$plus_sign$ = null;
		reader.$minus_sign$ = null;
		reader.$dot$ = null;
		reader.$decimal_point$ = null;
		reader.$ratio_marker$ = null;
		reader.$exponent_marker$ = null;
		reader.$invalid$ = null;
		reader.$standard_readtable$ = null;
		reader.$throw_reader_error_p$ = null;
		reader.$throw_end_of_file_p$ = null;
		reader.$read_lookup_table$ = null;
		reader.$initial_token_size$ = null;
		reader.$dtp_read_token$ = null;
		reader.$consing_dot$ = null;
		reader.$keyword_package$ = null;
		reader.$reading_list$ = null;
		reader.$reading_fake_list$ = null;
		reader.$right_paren$ = null;
		reader.$ignore_extra_right_parens$ = null;
		reader.$bq_comma$ = null;
		reader.$bq_atsign$ = null;
		reader.$bq_dot$ = null;
		reader.$bq_vector$ = null;
		reader.$backquote_depth$ = null;
		$sym0$CDO = SubLObjectFactory.makeSymbol("CDO");
		$list1 = ConsesLow.list(SubLNil.NIL);
		$sym2$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
		$list3 = ConsesLow.list(SubLObjectFactory.makeKeyword("SL2JAVA"));
		$int4$32 = SubLObjectFactory.makeInteger(32);
		$int5$128 = SubLObjectFactory.makeInteger(128);
		$sym6$READTABLE = SubLObjectFactory.makeSymbol("READTABLE");
		$sym7$READTABLE_P = SubLObjectFactory.makeSymbol("READTABLE-P");
		$list8 = ConsesLow.list(SubLObjectFactory.makeSymbol("CASE"), SubLObjectFactory.makeSymbol("CHARACTER-SYNTAX"),
				SubLObjectFactory.makeSymbol("SINGLE-BYTE-CHAR-SYNTAX"),
				SubLObjectFactory.makeSymbol("MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("SINGLE-BYTE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("CONSTITUENT-TRAITS"),
				SubLObjectFactory.makeSymbol("SINGLE-BYTE-CONSTIT-TRAITS"),
				SubLObjectFactory.makeSymbol("DISPATCH-TABLES"));
		$list9 = ConsesLow.list(SubLObjectFactory.makeKeyword("CASE"),
				SubLObjectFactory.makeKeyword("CHARACTER-SYNTAX"),
				SubLObjectFactory.makeKeyword("SINGLE-BYTE-CHAR-SYNTAX"),
				SubLObjectFactory.makeKeyword("MACRO-FUNCTIONS"),
				SubLObjectFactory.makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeKeyword("CONSTITUENT-TRAITS"),
				SubLObjectFactory.makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS"),
				SubLObjectFactory.makeKeyword("DISPATCH-TABLES"));
		$list10 = ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE-CASE"),
				SubLObjectFactory.makeSymbol("READTABLE-CHARACTER-SYNTAX"),
				SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX"),
				SubLObjectFactory.makeSymbol("READTABLE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("READTABLE-CONSTITUENT-TRAITS"),
				SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"),
				SubLObjectFactory.makeSymbol("READTABLE-DISPATCH-TABLES"));
		$list11 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CASE"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES"));
		$sym12$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
		$sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
				.makeSymbol("READTABLE-PRINT-FUNCTION-TRAMPOLINE");
		$list14 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"),
				SubLObjectFactory.makeSymbol("READTABLE-P"));
		$sym15$READTABLE_CASE = SubLObjectFactory.makeSymbol("READTABLE-CASE");
		$sym16$_CSETF_READTABLE_CASE = SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CASE");
		$sym17$READTABLE_CHARACTER_SYNTAX = SubLObjectFactory.makeSymbol("READTABLE-CHARACTER-SYNTAX");
		$sym18$_CSETF_READTABLE_CHARACTER_SYNTAX = SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX");
		$sym19$READTABLE_SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX");
		$sym20$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX");
		$sym21$READTABLE_MACRO_FUNCTIONS = SubLObjectFactory.makeSymbol("READTABLE-MACRO-FUNCTIONS");
		$sym22$_CSETF_READTABLE_MACRO_FUNCTIONS = SubLObjectFactory.makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS");
		$sym23$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory
				.makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");
		$sym24$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");
		$sym25$READTABLE_CONSTITUENT_TRAITS = SubLObjectFactory.makeSymbol("READTABLE-CONSTITUENT-TRAITS");
		$sym26$_CSETF_READTABLE_CONSTITUENT_TRAITS = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS");
		$sym27$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory
				.makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");
		$sym28$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");
		$sym29$READTABLE_DISPATCH_TABLES = SubLObjectFactory.makeSymbol("READTABLE-DISPATCH-TABLES");
		$sym30$_CSETF_READTABLE_DISPATCH_TABLES = SubLObjectFactory.makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES");
		$kw31$CASE = SubLObjectFactory.makeKeyword("CASE");
		$kw32$CHARACTER_SYNTAX = SubLObjectFactory.makeKeyword("CHARACTER-SYNTAX");
		$kw33$SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory.makeKeyword("SINGLE-BYTE-CHAR-SYNTAX");
		$kw34$MACRO_FUNCTIONS = SubLObjectFactory.makeKeyword("MACRO-FUNCTIONS");
		$kw35$SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory.makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS");
		$kw36$CONSTITUENT_TRAITS = SubLObjectFactory.makeKeyword("CONSTITUENT-TRAITS");
		$kw37$SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory.makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS");
		$kw38$DISPATCH_TABLES = SubLObjectFactory.makeKeyword("DISPATCH-TABLES");
		$str39$Invalid_slot__S_for_construction_ = SubLObjectFactory
				.makeString("Invalid slot ~S for construction function");
		$kw40$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
		$sym41$MAKE_READTABLE = SubLObjectFactory.makeSymbol("MAKE-READTABLE");
		$kw42$SLOT = SubLObjectFactory.makeKeyword("SLOT");
		$kw43$END = SubLObjectFactory.makeKeyword("END");
		$sym44$VISIT_DEFSTRUCT_OBJECT_READTABLE_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-READTABLE-METHOD");
		$int45$64 = SubLObjectFactory.makeInteger(64);
		$int46$256 = SubLObjectFactory.makeInteger(256);
		$int47$512 = SubLObjectFactory.makeInteger(512);
		$kw48$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
		$kw49$CONSTITUENT = SubLObjectFactory.makeKeyword("CONSTITUENT");
		$sym50$CONSTITUENT_RMF = SubLObjectFactory.makeSymbol("CONSTITUENT-RMF");
		$list51 = ConsesLow.list(SubLObjectFactory.makeSymbol("CH"), SubLObjectFactory.makeSymbol("&OPTIONAL"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE"), ConsesLow
						.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*READTABLE*"))));
		$sym52$_READTABLE_ = SubLObjectFactory.makeSymbol("*READTABLE*");
		$sym53$FIF = SubLObjectFactory.makeSymbol("FIF");
		$sym54$SINGLE_BYTE_P = SubLObjectFactory.makeSymbol("SINGLE-BYTE-P");
		$sym55$AREF = SubLObjectFactory.makeSymbol("AREF");
		$sym56$CHAR_CODE = SubLObjectFactory.makeSymbol("CHAR-CODE");
		$sym57$GETHASH = SubLObjectFactory.makeSymbol("GETHASH");
		$list58 = ConsesLow.list(SubLObjectFactory.makeKeyword("CONSTITUENT"));
		$kw59$INVALID = SubLObjectFactory.makeKeyword("INVALID");
		$kw60$TERMINATING_MACRO = SubLObjectFactory.makeKeyword("TERMINATING-MACRO");
		$kw61$NON_TERMINATING_MACRO = SubLObjectFactory.makeKeyword("NON-TERMINATING-MACRO");
		$kw62$MULTIPLE_ESCAPE = SubLObjectFactory.makeKeyword("MULTIPLE-ESCAPE");
		$kw63$SINGLE_ESCAPE = SubLObjectFactory.makeKeyword("SINGLE-ESCAPE");
		$kw64$WHITESPACE = SubLObjectFactory.makeKeyword("WHITESPACE");
		$list65 = ConsesLow.list(SubLObjectFactory.makeSymbol("CH"), SubLObjectFactory.makeSymbol("TRAIT"),
				SubLObjectFactory.makeSymbol("&OPTIONAL"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE"), ConsesLow
						.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*READTABLE*"))));
		$sym66$PLUSP = SubLObjectFactory.makeSymbol("PLUSP");
		$sym67$LOGAND = SubLObjectFactory.makeSymbol("LOGAND");
		$sym68$CHARACTER_TRAITS = SubLObjectFactory.makeSymbol("CHARACTER-TRAITS");
		$list69 = ConsesLow.cons(SubLObjectFactory.makeSymbol("CH"), SubLObjectFactory.makeSymbol("TABLE"));
		$sym70$CAR = SubLObjectFactory.makeSymbol("CAR");
		$sym71$DISPATCHING_RMF = SubLObjectFactory.makeSymbol("DISPATCHING-RMF");
		$str72$Attempt_to_make_decimal_digit__A_ = SubLObjectFactory
				.makeString("Attempt to make decimal digit ~A be a dispatching macro character.");
		$str73$_A_is_not_a_dispatching_macro_cha = SubLObjectFactory
				.makeString("~A is not a dispatching macro character in ~S.");
		$sym74$WHITESPACE_RMF = SubLObjectFactory.makeSymbol("WHITESPACE-RMF");
		$sym75$SINGLE_ESCAPE_RMF = SubLObjectFactory.makeSymbol("SINGLE-ESCAPE-RMF");
		$sym76$MULTIPLE_ESCAPE_RMF = SubLObjectFactory.makeSymbol("MULTIPLE-ESCAPE-RMF");
		$sym77$LEFT_PAREN_RMF = SubLObjectFactory.makeSymbol("LEFT-PAREN-RMF");
		$sym78$RIGHT_PAREN_RMF = SubLObjectFactory.makeSymbol("RIGHT-PAREN-RMF");
		$sym79$SINGLE_QUOTE_RMF = SubLObjectFactory.makeSymbol("SINGLE-QUOTE-RMF");
		$sym80$SEMICOLON_RMF = SubLObjectFactory.makeSymbol("SEMICOLON-RMF");
		$sym81$DOUBLE_QUOTE_RMF = SubLObjectFactory.makeSymbol("DOUBLE-QUOTE-RMF");
		$sym82$BACKQUOTE_RMF = SubLObjectFactory.makeSymbol("BACKQUOTE-RMF");
		$sym83$COMMA_RMF = SubLObjectFactory.makeSymbol("COMMA-RMF");
		$sym84$SHARPSIGN_BACKSLASH_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-BACKSLASH-RMF");
		$sym85$SHARPSIGN_SINGLE_QUOTE_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-SINGLE-QUOTE-RMF");
		$sym86$SHARPSIGN_LEFT_PAREN_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-LEFT-PAREN-RMF");
		$sym87$SHARPSIGN_ASTERISK_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-ASTERISK-RMF");
		$sym88$SHARPSIGN_COLON_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-COLON-RMF");
		$sym89$SHARPSIGN_DOT_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-DOT-RMF");
		$sym90$SHARPSIGN_B_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-B-RMF");
		$sym91$SHARPSIGN_O_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-O-RMF");
		$sym92$SHARPSIGN_X_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-X-RMF");
		$sym93$SHARPSIGN_R_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-R-RMF");
		$sym94$SHARPSIGN_C_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-C-RMF");
		$sym95$SHARPSIGN_A_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-A-RMF");
		$sym96$SHARPSIGN_S_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-S-RMF");
		$sym97$SHARPSIGN_P_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-P-RMF");
		$sym98$SHARPSIGN_CAPITAL_G_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-CAPITAL-G-RMF");
		$sym99$SHARPSIGN_EQUALS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-EQUALS-RMF");
		$sym100$SHARPSIGN_SHARPSIGN_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-SHARPSIGN-RMF");
		$sym101$SHARPSIGN_PLUS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-PLUS-RMF");
		$sym102$SHARPSIGN_MINUS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-MINUS-RMF");
		$sym103$SHARPSIGN_VERTICAL_BAR_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-VERTICAL-BAR-RMF");
		$list104 = ConsesLow.list(Characters.CHAR_backspace, Characters.CHAR_tab, Characters.CHAR_newline,
				Characters.CHAR_newline, Characters.CHAR_page, Characters.CHAR_return, Characters.CHAR_space,
				Characters.CHAR_rubout);
		$list105 = ConsesLow.list(new SubLObject[] { Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2,
				Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7,
				Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_a, Characters.CHAR_b, Characters.CHAR_c,
				Characters.CHAR_d, Characters.CHAR_e, Characters.CHAR_f, Characters.CHAR_g, Characters.CHAR_h,
				Characters.CHAR_i, Characters.CHAR_j, Characters.CHAR_k, Characters.CHAR_l, Characters.CHAR_m,
				Characters.CHAR_n, Characters.CHAR_o, Characters.CHAR_p, Characters.CHAR_q, Characters.CHAR_r,
				Characters.CHAR_s, Characters.CHAR_t, Characters.CHAR_u, Characters.CHAR_v, Characters.CHAR_w,
				Characters.CHAR_x, Characters.CHAR_y, Characters.CHAR_z, Characters.CHAR_A, Characters.CHAR_B,
				Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F, Characters.CHAR_G,
				Characters.CHAR_H, Characters.CHAR_I, Characters.CHAR_J, Characters.CHAR_K, Characters.CHAR_L,
				Characters.CHAR_M, Characters.CHAR_N, Characters.CHAR_O, Characters.CHAR_P, Characters.CHAR_Q,
				Characters.CHAR_R, Characters.CHAR_S, Characters.CHAR_T, Characters.CHAR_U, Characters.CHAR_V,
				Characters.CHAR_W, Characters.CHAR_X, Characters.CHAR_Y, Characters.CHAR_Z });
		$sym106$READER_ERROR = SubLObjectFactory.makeSymbol("READER-ERROR");
		$sym107$ERROR = SubLObjectFactory.makeSymbol("ERROR");
		$sym108$END_OF_FILE = SubLObjectFactory.makeSymbol("END-OF-FILE");
		$str109$End_of_file_on_stream__S_ = SubLObjectFactory.makeString("End of file on stream ~S.");
		$str110$_S_is_invalid_token_syntax_ = SubLObjectFactory.makeString("~S is invalid token syntax.");
		$str111$The__A_reader_macro_is_not_implem = SubLObjectFactory
				.makeString("The ~A reader macro is not implemented.");
		$str112$The__A_reader_macro_does_not_take = SubLObjectFactory
				.makeString("The ~A reader macro does not take an argument.");
		$str113$Illegal_argument__D_for_the__A_re = SubLObjectFactory
				.makeString("Illegal argument ~D for the ~A reader macro.");
		$sym114$CLET = SubLObjectFactory.makeSymbol("CLET");
		$list115 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-BASE*"), CommonSymbols.TEN_INTEGER),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"),
								SubLObjectFactory.makeSymbol("SINGLE-FLOAT"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-EVAL*"), CommonSymbols.T),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-SUPPRESS*"), SubLNil.NIL),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READTABLE*"),
						SubLObjectFactory.makeSymbol("*STANDARD-READTABLE*")));
		$sym116$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		$kw117$EOF = SubLObjectFactory.makeKeyword("EOF");
		$kw118$ERROR = SubLObjectFactory.makeKeyword("ERROR");
		$sym119$READ_TOKEN = SubLObjectFactory.makeSymbol("READ-TOKEN");
		$sym120$READ_TOKEN_P = SubLObjectFactory.makeSymbol("READ-TOKEN-P");
		$list121 = ConsesLow.list(SubLObjectFactory.makeSymbol("POINTER"), SubLObjectFactory.makeSymbol("BUFFER"),
				SubLObjectFactory.makeSymbol("ESCAPES"));
		$list122 = ConsesLow.list(SubLObjectFactory.makeKeyword("POINTER"), SubLObjectFactory.makeKeyword("BUFFER"),
				SubLObjectFactory.makeKeyword("ESCAPES"));
		$list123 = ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER"),
				SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER"), SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES"));
		$list124 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-POINTER"),
				SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-BUFFER"),
				SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-ESCAPES"));
		$sym125$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
				.makeSymbol("READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE");
		$list126 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"),
				SubLObjectFactory.makeSymbol("READ-TOKEN-P"));
		$sym127$READ_TOKEN_POINTER = SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER");
		$sym128$_CSETF_READ_TOKEN_POINTER = SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-POINTER");
		$sym129$READ_TOKEN_BUFFER = SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER");
		$sym130$_CSETF_READ_TOKEN_BUFFER = SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-BUFFER");
		$sym131$READ_TOKEN_ESCAPES = SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES");
		$sym132$_CSETF_READ_TOKEN_ESCAPES = SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-ESCAPES");
		$kw133$POINTER = SubLObjectFactory.makeKeyword("POINTER");
		$kw134$BUFFER = SubLObjectFactory.makeKeyword("BUFFER");
		$kw135$ESCAPES = SubLObjectFactory.makeKeyword("ESCAPES");
		$sym136$MAKE_READ_TOKEN = SubLObjectFactory.makeSymbol("MAKE-READ-TOKEN");
		$sym137$VISIT_DEFSTRUCT_OBJECT_READ_TOKEN_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-READ-TOKEN-METHOD");
		$list138 = ConsesLow.list(SubLObjectFactory.makeSymbol("TOKEN"), SubLObjectFactory.makeSymbol("&BODY"),
				SubLObjectFactory.makeSymbol("BODY"));
		$list139 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-READ-TOKEN")));
		$list140 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow
				.list(SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER"), SubLObjectFactory.makeSymbol("TOKEN")),
				CommonSymbols.ZERO_INTEGER);
		$list141 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER"),
						SubLObjectFactory.makeSymbol("TOKEN")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-STRING"),
						SubLObjectFactory.makeSymbol("*INITIAL-TOKEN-SIZE*")));
		$list142 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES"),
						SubLObjectFactory.makeSymbol("TOKEN")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLNil.NIL));
		$str143$_A_is_an_invalid_character_ = SubLObjectFactory.makeString("~A is an invalid character.");
		$str144$Fell_through_character_syntax_on_ = SubLObjectFactory
				.makeString("Fell through character syntax on ~A.");
		$kw145$DOWNCASE = SubLObjectFactory.makeKeyword("DOWNCASE");
		$str146$_S_is_not_a_known_package_ = SubLObjectFactory.makeString("~S is not a known package.");
		$kw147$PRESERVE = SubLObjectFactory.makeKeyword("PRESERVE");
		$kw148$INVERT = SubLObjectFactory.makeKeyword("INVERT");
		$sym149$CONSING_DOT = SubLObjectFactory.makeUninternedSymbol("CONSING-DOT");
		$str150$KEYWORD = SubLObjectFactory.makeString("KEYWORD");
		$kw151$EXTERNAL = SubLObjectFactory.makeKeyword("EXTERNAL");
		$str152$_S_is_not_external_in__S_ = SubLObjectFactory.makeString("~S is not external in ~S.");
		$float153$0_0 = SubLObjectFactory.makeDouble(0.0);
		$kw154$INITIAL = SubLObjectFactory.makeKeyword("INITIAL");
		$kw155$DOT1 = SubLObjectFactory.makeKeyword("DOT1");
		$kw156$SIGN = SubLObjectFactory.makeKeyword("SIGN");
		$kw157$DECIMALS = SubLObjectFactory.makeKeyword("DECIMALS");
		$kw158$DIGITS = SubLObjectFactory.makeKeyword("DIGITS");
		$kw159$EXPONENT = SubLObjectFactory.makeKeyword("EXPONENT");
		$kw160$DOT2 = SubLObjectFactory.makeKeyword("DOT2");
		$kw161$SLASH = SubLObjectFactory.makeKeyword("SLASH");
		$kw162$DENOMINATOR = SubLObjectFactory.makeKeyword("DENOMINATOR");
		$kw163$FRACTION = SubLObjectFactory.makeKeyword("FRACTION");
		$kw164$DECIMALS2 = SubLObjectFactory.makeKeyword("DECIMALS2");
		$kw165$EXPONENT_SIGN = SubLObjectFactory.makeKeyword("EXPONENT-SIGN");
		$kw166$EXPONENT_VALUE = SubLObjectFactory.makeKeyword("EXPONENT-VALUE");
		$str167$Can_t_happen_ = SubLObjectFactory.makeString("Can't happen.");
		$kw168$DIGIT = SubLObjectFactory.makeKeyword("DIGIT");
		$str169$_S_does_not_contain_an_integer_ = SubLObjectFactory.makeString("~S does not contain an integer.");
		$kw170$TRAILING_WHITESPACE = SubLObjectFactory.makeKeyword("TRAILING-WHITESPACE");
		$str171$The__S_reader_macro_does_not_take = SubLObjectFactory
				.makeString("The ~S reader macro does not take an argument.");
		$str172$The__S_reader_macro_expected_a_st = SubLObjectFactory
				.makeString("The ~S reader macro expected a string.");
		$str173$The__S_reader_macro_could_not_int = SubLObjectFactory
				.makeString("The ~S reader macro could not interpret ~S as a GUID string.");
		$sym174$RIGHT_PAREN = SubLObjectFactory.makeUninternedSymbol("RIGHT-PAREN");
		$str175$Nothing_before_consing_dot_ = SubLObjectFactory.makeString("Nothing before consing dot.");
		$kw176$LIST = SubLObjectFactory.makeKeyword("LIST");
		$kw177$CONSING_DOT = SubLObjectFactory.makeKeyword("CONSING-DOT");
		$str178$Nothing_after_consing_dot_ = SubLObjectFactory.makeString("Nothing after consing dot.");
		$str179$Too_many_consing_dots_ = SubLObjectFactory.makeString("Too many consing dots.");
		$kw180$AFTER_CONSING_DOT = SubLObjectFactory.makeKeyword("AFTER-CONSING-DOT");
		$str181$Too_many_objects_after_consing_do = SubLObjectFactory.makeString("Too many objects after consing dot.");
		$str182$Ignoring_unmatched_close_parenthe = SubLObjectFactory
				.makeString("Ignoring unmatched close parenthesis.");
		$str183$Unmatched__A_ = SubLObjectFactory.makeString("Unmatched ~A.");
		$sym184$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
		$kw185$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
		$kw186$ESCAPE = SubLObjectFactory.makeKeyword("ESCAPE");
		$sym187$LIST = SubLObjectFactory.makeSymbol("LIST");
		$sym188$LIST_ = SubLObjectFactory.makeSymbol("LIST*");
		$sym189$APPEND = SubLObjectFactory.makeSymbol("APPEND");
		$sym190$NCONC = SubLObjectFactory.makeSymbol("NCONC");
		$sym191$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
		$sym192$BQ_VECTOR = SubLObjectFactory.makeSymbol("BQ-VECTOR");
		$sym193$BQ_APPEND = SubLObjectFactory.makeSymbol("BQ-APPEND");
		$str194$_ = SubLObjectFactory.makeString(",");
		$str195$_ = SubLObjectFactory.makeString("@");
		$str196$_ = SubLObjectFactory.makeString(".");
		$str197$BQ_VECTOR = SubLObjectFactory.makeString("BQ-VECTOR");
		$str198$_A_after_dot_in__S_ = SubLObjectFactory.makeString("~A after dot in ~S.");
		$list199 = ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), CommonSymbols.T, SubLNil.NIL);
		$list200 = ConsesLow.list(SubLObjectFactory.makeSymbol("APPEND"), SubLObjectFactory.makeSymbol("LIST"),
				SubLObjectFactory.makeSymbol("LIST*"), SubLObjectFactory.makeSymbol("NCONC"));
		$sym201$CONS = SubLObjectFactory.makeSymbol("CONS");
		$sym202$BQ_LIST_ = SubLObjectFactory.makeSymbol("BQ-LIST*");
		$sym203$BQ_CONS = SubLObjectFactory.makeSymbol("BQ-CONS");
		$list204 = ConsesLow.list(
				ConsesLow.cons(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("BQ-CONS")),
				ConsesLow.cons(SubLObjectFactory.makeSymbol("LIST"), SubLObjectFactory.makeSymbol("BQ-LIST")),
				ConsesLow.cons(SubLObjectFactory.makeSymbol("APPEND"), SubLObjectFactory.makeSymbol("BQ-APPEND")),
				ConsesLow.cons(SubLObjectFactory.makeSymbol("NCONC"), SubLObjectFactory.makeSymbol("BQ-NCONC")));
		$str205$_A_read_after_backquote_in__S_ = SubLObjectFactory.makeString("~A read after backquote in ~S.");
		$str206$_S_read_outside_a_backquote_ = SubLObjectFactory.makeString("~S read outside a backquote.");
		$str207$Undefined_reader_macro__A_A_ = SubLObjectFactory.makeString("Undefined reader macro ~A~A.");
		$str208$_S_is_not_the_name_of_a_character = SubLObjectFactory.makeString("~S is not the name of a character.");
		$sym209$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
		$str210$Attempt_the_use_the__A_reader_mac = SubLObjectFactory
				.makeString("Attempt the use the ~A reader macro when ~S is ~S.");
		$sym211$_READ_EVAL_ = SubLObjectFactory.makeSymbol("*READ-EVAL*");
		$int212$36 = SubLObjectFactory.makeInteger(36);
		$str213$The_form_after__A_reader_macro_wa = SubLObjectFactory
				.makeString("The form after ~A reader macro was not a list.");
		$str214$Label__S_appears_more_than_once_ = SubLObjectFactory.makeString("Label ~S appears more than once.");
		$str215$Label__S_has_not_been_seen_ = SubLObjectFactory.makeString("Label ~S has not been seen.");
		$kw216$NOT = SubLObjectFactory.makeKeyword("NOT");
		$str217$Bogus_feature_expression__S_ = SubLObjectFactory.makeString("Bogus feature expression ~S.");
		$kw218$AND = SubLObjectFactory.makeKeyword("AND");
		$kw219$OR = SubLObjectFactory.makeKeyword("OR");
		$str220$Unknown_feature_operator__S_ = SubLObjectFactory.makeString("Unknown feature operator ~S.");
		$kw221$HASH = SubLObjectFactory.makeKeyword("HASH");
		$kw222$VERTICAL_BAR = SubLObjectFactory.makeKeyword("VERTICAL-BAR");
	}

	@Override
	public void declareFunctions() {
		declare_reader_file();
	}

	@Override
	public void initializeVariables() {
		init_reader_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_reader_file();
	}
}
