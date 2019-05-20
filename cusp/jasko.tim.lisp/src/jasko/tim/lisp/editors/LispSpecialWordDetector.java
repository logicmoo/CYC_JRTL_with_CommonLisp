package jasko.tim.lisp.editors;

import org.eclipse.jface.text.rules.IWordDetector;

public class LispSpecialWordDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		for(int i = 0; i < RESERVED_WORDS.length; i++) {
			if ( (RESERVED_WORDS[i]).charAt(0) == c) {
				return true;
			}
		}

		return false;
	}

	public boolean isWordPart(char c) {
		for (int i = 0; i < RESERVED_WORDS.length; i++) {
			if (((String) RESERVED_WORDS[i]).indexOf(c) != -1) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Here's everything that we bold-face
	 */
	public static final String[] RESERVED_WORDS = "* block handler-case unwind-protect multiple-value-bind values make-instance eval-when incf decf call-next-method defstruct defmethod defconstant defgeneric load when unless deftype defvar defparameter defclass defpackage in-package not defun princ eval apply funcall quote identity function complement backquote lambda set setq setf defun defmacro gensym make symbol intern string loop declare plist get getf putprop remprop hash make array aref car cdr caar cadr cdar cddr caaar caadr cadar caddr cdaar cdadr cddar cdddr caaaar caaadr caadar caaddr cadaar cadadr caddar cadddr cdaaar cdaadr cdadar cdaddr cddaar cddadr cdddar cddddr cons list append reverse first second third fourth fifth sixth seventh eighth ninth tenth last nth nthcdr member assoc subst sublis nsubst nsublis remove length list length mapc mapcar mapl maplist mapcan mapcon rplaca rplacd nconc delete atom symbolp numberp boundp null listp consp minusp zerop plusp evenp oddp eq eql equal cond case and or let let* macrolet if prog prog1 prog2 progn go return do dolist dotimes catch throw error cerror break continue errset baktrace evalhook truncate float rem min max abs sin cos tan expt exp sqrt random logand logior logxor lognot bignums logeqv lognand lognor logorc2 logtest logbitp logcount integer length t nil".split(" ");
	
	/*public static final String[] RESERVED_WORDS = {
		"block",
		"catch",
		"declare",
		"eval-when",
		"flet",
		"function",
		"go",
		"if",
		"labels",
		"let",
		"let*",
		"macrolet",
		"multiple-value-call",
		"multiple-value-prog1",
		"progn",
		"progv",
		"quote",
		"return-from",
		"setq",
		"tagbody",
		"the",
		"throw",
		"unwind-protect"
	};*/

}
