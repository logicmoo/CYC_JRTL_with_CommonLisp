/*
 * Tests.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Tests.java,v 1.25 2004-03-16 02:39:05 piso Exp $
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
 */

package org.armedbear.lisp;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;
import junit.textui.TestRunner;

public class Tests extends TestCase
{
    private static final String ERROR = Interpreter.ERROR;

    public void testAll()
    {
        verify("foo", ERROR);
        verify("(symbol-value 'foo)", ERROR);
        verify("'foo", "foo");
        verify("'(quote foo)", "'foo");

        // symbolp
        verify("(symbolp 'elephant)", "T");
        verify("(symbolp 12)", "NIL");
        verify("(symbolp nil)", "T");
        verify("(symbolp 'nil)", "T");
        verify("(symbolp ())", "T");
        verify("(symbolp '())", "T");
        verify("(symbolp t)", "T");
        verify("(symbolp 't)", "T");
        verify("(symbolp :test)", "T");
        verify("(symbolp \"hello\")", "NIL");

        // defvar
//         verify("foo", ERROR);
//         verify("(defvar foo)", "foo");
//         verify("foo", ERROR);
//         verify("(defvar foo 1234)", "foo");
//         verify("foo", "1234");
//         verify("(defvar foo 'bar)", "foo");
//         verify("foo", "1234");

        verify("(setq)", "NIL");

        // setq sequential assignment
        verify("(setq a 1 b 2 c 3)", "3");
        verify("a", "1");
        verify("b", "2");
        verify("c", "3");
        verify("(setq a (1+ b) b (1+ a) c (+ a b))", "7");
        verify("a", "3");
        verify("b", "4");
        verify("c", "7");

        // setq, let
//         verify("(defvar *x* 1234)", "*x*");
//         verify("*x*", "1234");
//         verify("(let ((*x* 10)) (setq *x* 23))", "23");
//         verify("*x*", "1234");

        verify("(setq foo 'bar)", "bar");
        verify("(symbol-value 'foo)", "bar");
        verify("foo", "bar");
        verify("(eval 'foo)", "bar");
        verify("(eval foo)", ERROR);
        verify("(setq foo 'baz)", "baz");
        verify("foo", "baz");
        verify("(eval 'foo)", "baz");

        verify("(setq foo 12)", "12");
        verify("foo", "12");
        verify("(eval foo)", "12");
        verify("(setq foo '12)", "12");
        verify("foo", "12");
        verify("(eval foo)", "12");

        verify("(+ 1 2 3)", "6");
        verify("(- 1)", "-1");
        verify("(- 6 4)", "2");
        verify("(- 10 6 3)", "1");
        verify("(*)", "1");
        verify("(* 2 4 6)", "48");
        verify("(/)", ERROR);
        verify("(/ 1234)", "1/1234");
        verify("(/ 81 3)", "27");
        verify("(/ 48 2 4 6)", "1");

        verify("(setq foo 12)", "12");
        verify("(+ 23 foo)", "35");
        verify("(setq bar 300)", "300");
        verify("(+ foo bar)", "312");
        verify("(setq foo (+ foo bar))", "312");
        verify("foo", "312");

        verify("(setq a 12 b 13)", "13");
        verify("a", "12");
        verify("b", "13");
        verify("(+ a b)", "25");

        verify("t", "T");
        verify("nil", "NIL");
        verify("()", "NIL");

        // listp
        verify("(listp ())", "T");
        verify("(listp '())", "T");
        verify("(listp nil)", "T");
        verify("(listp 123)", "NIL");
        verify("(listp '(a b c))", "T");
        verify("(setq foo '(1 2 3))", "(1 2 3)");
        verify("(listp foo)", "T");

        verify("(length)", ERROR);
        verify("(length 12)", ERROR);
        verify("(length ())", "0");
        verify("(length '(a b c))", "3");
        verify("(length '(a . b))", ERROR);

        verify("(numberp 12)", "T");
        verify("(setq foo 12)", "12");
        verify("(numberp foo)", "T");
        verify("(numberp 'foo)", "NIL");

        // atom
        verify("(atom 'sss)", "T");
        verify("(atom (cons 1 2))", "NIL");
        verify("(atom nil)", "T");
        verify("(atom '())", "T");
        verify("(atom 3)", "T");

        // consp
        verify("(consp nil)", "NIL");
        verify("(consp (cons 1 2))", "T");
        verify("(consp '())", "NIL");
        verify("(consp 'nil)", "NIL");

        // car, cdr
        verify("(car 'a)", ERROR);
        verify("(car '(a))", "a");
        verify("(cdr '(a))", "NIL");
        verify("(car '(a b c))", "a");
        verify("(cdr '(a b c))", "(b c)");
        verify("(setq foo '(a b c))", "(a b c)");
        verify("(car foo)", "a");
        verify("(cdr foo)", "(b c)");
        verify("(car nil)", "NIL");
        verify("(cdr '(1 . 2))", "2");
        verify("(cdr '(1 2))", "(2)");
        verify("(cadr '(1 2))", "2");
        verify("(car '(a b c))", "a");
        verify("(cdr '(a b c))", "(b c)");

        verify("(third '(a b))", "NIL");
        verify("(third '(a b c))", "C");
        verify("(fourth '(a b c))", "NIL");
        verify("(fourth '(a b c d))", "D");

        // cons
        verify("(cons 1 2)", "(1 . 2)");
        verify("(cons 1 nil)", "(1)");
        verify("(cons nil 2)", "(NIL . 2)");
        verify("(cons nil nil)", "(NIL)");
        verify("(cons 1 (cons 2 (cons 3 (cons 4 nil))))", "(1 2 3 4)");
        verify("(cons 'a 'b)", "(a . b)");
        verify("(cons 'a (cons 'b (cons 'c '())))", "(a b c)");
        verify("(cons 'a '(b c d))", "(a b c d)");
        verify("(cons 'a (cons 'b (cons 'c 'd)))", "(A B C . D)");

        // list
        verify("(list)", "NIL");
        verify("(list '(+ 2 1) (+ 2 1))", "((+ 2 1) 3)");
        verify("(list 'a 'b 'c)", "(a b c)");
        verify("(list 1)", "(1)");
        verify("(setq a 1)", "1");
        verify("(list a 2)", "(1 2)");

        // list*
        verify("(list*)", ERROR);
        verify("(list* 1)", "1");
        verify("(list* 1 2)", "(1 . 2)");
        verify("(setq a '(1 2))", "(1 2)");
        verify("(eq a (list* a))", "T");
        verify("(list* 'a 'b 'c 'd)", "(A B C . D)");
        verify("(list* 'a 'b 'c '(d e f))", "(A B C D E F)");

        // append
        verify("(append '(a b c) '(d e f) '() '(g))", "(a b c d e f g)");
        verify("(append '(a b c) 'd)", "(a b c . d)");
        verify("(setq lst '(a b c))", "(a b c)");
        verify("(append lst '(d))", "(a b c d)");
        verify("lst", "(a b c)");
        verify("(append)", "NIL");
        verify("(append 'a)", "a");
        verify("(append () () '(a b))", "(A B)");

        // nconc
        verify("(nconc)", "NIL");
        verify("(setq x '(a b c))", "(A B C)");
        verify("(setq y '(d e f))", "(D E F)");
        verify("(nconc x y)", "(A B C D E F)");
        verify("x", "(A B C D E F)");
        verify("(setq foo (list 'a 'b 'c 'd 'e) bar (list 'f 'g 'h 'i 'j) baz (list 'k 'l 'm))",
            "(K L M)");
        verify("(setq foo (nconc foo bar baz))", "(A B C D E F G H I J K L M)");
        verify("foo", "(A B C D E F G H I J K L M)");
        verify("bar", "(F G H I J K L M)");
        verify("baz", "(K L M)");
        verify("(setq foo (list 'a 'b 'c 'd 'e) bar (list 'f 'g 'h 'i 'j) baz (list 'k 'l 'm))",
            "(K L M)");
        verify("(setq foo (nconc nil foo bar nil baz))", "(A B C D E F G H I J K L M)");
        verify("foo", "(A B C D E F G H I J K L M)");
        verify("bar", "(F G H I J K L M)");
        verify("baz", "(K L M)");
        verify("(setq x '(a b c))", "(A B C)");
        verify("(setq y '(d e f))", "(D E F)");
        verify("(nconc x y)", "(A B C D E F)");
        verify("x", "(A B C D E F)");

        // remove
//         verify("(remove 4 '(1 3 4 5 9))", "(1 3 5 9)");
//         verify("(remove 4 '(1 2 4 1 3 4 5))", "(1 2 1 3 5)");

        // strings
        verify("\"foo\"", "\"foo\"");
        verify("(setq foo \"bar\")", "\"bar\"");
        verify("foo", "\"bar\"");

        // if
        verify("(if t 123)", "123");
        verify("(if () t)", "NIL");
        verify("(if t 123 456)", "123");
        verify("(if nil 123 456)", "456");
        verify("(if (listp '(a b c)) 123 456)", "123");
        verify("(if (listp '(a b c)) (+ 1 2) (+ 3 4))", "3");
        verify("(if (numberp '(a b c)) (+ 1 2) (+ 3 4))", "7");

        // when
//         verify("(when t 'hello)", "hello");
//         verify("(when nil 'hello)", "NIL");
//         verify("(when t)", "NIL");
//         verify("(when ())", "NIL");

        // and
        verify("(and)", "T");

        // or
        verify("(or)", "NIL");
        verify("(setq temp0 nil temp1 10 temp2 20 temp3 30)", "30");
        verify("(or temp0 temp1 (setq temp2 37))", "10");
        verify("temp2", "20");

        // unless
//         verify("(unless t 'hello)", "NIL");
//         verify("(unless nil 'hello)", "hello");
//         verify("(unless t)", "NIL");
//         verify("(unless ())", "NIL");

        // progn
        verify("(progn (+ 1 2) (+ 3 4) (+ 5 6))", "11");
        verify("(progn (setq foo 12) (setq foo 27))", "27");
        verify("foo", "27");
        verify("(progn)", "NIL");
        verify("(progn (+ 2 1) 2)", "2");
        verify("(progn 1 2 3)", "3");
        verify("(setq a 1)", "1");
        verify("(if a (progn (setq a nil) 'here) (progn (setq a t) 'there))",
             "here");
        verify("a","NIL");

        // block
        verify("(block empty)", "NIL");
        verify("(block test (+ 1 2) (+ 3 4) (+ 5 6))", "11");
//         verify("(block nil (return) 1)", "NIL");
//         verify("(block nil (return 1) 2)", "1");
//         verify("(block nil (block alpha (return 1) 2))", "1");
//         verify("(block alpha (block nil (return 1)) 2)", "2");
//         verify("(block nil (block nil (return 1) 2))", "1");
//         verify("(block nil (return (values 1 2)) 3)", "1, 2");
        verify("(block alpha (return-from alpha) 1)", "NIL");
        verify("(block alpha (return-from alpha 1) 2)", "1");
        verify("(let ((x 1)) (block stop (setq x 2) (return-from stop) (setq x 3)) x)",
             "2");
        verify("(block outer (block inner (return-from outer 1)) 2)", "1");
        verify("(block twin (block twin (return-from twin 1)) 2)", "2");

        // let
        verify("(let () 1234)", "1234");
        verify("(let ((x 1) (y 2)) (+ x y))", "3");
        verify("z", ERROR);
        verify("(setq z 1234)", "1234");
        verify("z", "1234");
        verify("(let ((x 1) (y 2) (z 3)) (+ x y z))", "6");
        verify("z", "1234");
        verify("(let ((x 1) (y 2) (z 3)) (setq z 4) (+ x y z))", "7");
        verify("z", "1234");
        verify("(let ((x 1) (y 2)) (setq z 4) (+ x y z))", "7");
        verify("z", "4");

        // let*
//         verify("(setq a 'top)", "TOP");
//         verify("(defun dummy-function () a)", "DUMMY-FUNCTION");
//         verify("(let ((a 'inside) (b a)) (format nil \"~A ~A ~A\" a b (dummy-function)))",
//             "\"INSIDE TOP TOP\"");
//         verify("(let* ((a 'inside) (b a)) (format nil \"~A ~A ~A\" a b (dummy-function)))",
//             "\"INSIDE INSIDE TOP\"");
        verify("(let* ((x 1) (y (+ x 1))) (+ x y))", "3");

        // =
        verify("(= 0 0)", "T");
        verify("(= 1 0)", "NIL");
        verify("(= 0 1)", "NIL");
        verify("(= 3 3)", "T");
        verify("(= 3 5)", "NIL");
        verify("(= 3 3 3 3)", "T");
        verify("(= 3 3 5 3)", "NIL");
        verify("(= 3 6 5 2)", "NIL");
        verify("(= 3 2 3)", "NIL");
        verify("(= 3)", "T");
        verify("(= 3 4 'foo)", "NIL");
        verify("(= 23 (+ 11 12))", "T");

        // /=
        verify("(/= 3 3)", "NIL");
        verify("(/= 3 5)", "T");
        verify("(/= 3 3 3 3)", "NIL");
        verify("(/= 3 3 5 3)", "NIL");
        verify("(/= 3 6 5 2)", "T");
        verify("(/= 3 2 3)", "NIL");
        verify("(/= 3)", "T");
        verify("(/= 3 3 'foo)", "NIL");

        // <=
        verify("(<= 14 14)", "T");
        verify("(<= 14 15)", "T");
        verify("(<= 15 14)", "NIL");

        // evenp, oddp
        verify("(evenp 2)", "T");
        verify("(evenp 3)", "NIL");
        verify("(oddp 2)", "NIL");
        verify("(oddp 3)", "T");
        verify("(evenp 0)", "T");
        verify("(oddp -1)", "T");

        // zerop
        verify("(zerop 0)", "T");
        verify("(zerop 1234)", "NIL");
        verify("(zerop '(a b c))", ERROR);
        verify("(zerop (- 3 3))", "T");

        // min, max
        verify("(max 3)", "3");
        verify("(min 3)", "3");
        verify("(max 6 12)", "12");
        verify("(min 6 12)", "6");
        verify("(max -6 -12)", "-6");
        verify("(min -6 -12)", "-12");
        verify("(max 1 3 2 -7)", "3");
        verify("(min 1 3 2 -7)", "-7");
        verify("(max -2 3 0 7)", "7");
        verify("(min -2 3 0 7)", "-2");

        // defun
//         verify("(setq x 1234)", "1234");
//         verify("(defun foo (x) (+ x x))", "foo");
//         verify("(foo 10)", "20");
//         verify("x", "1234");

        // function
        verify("(function xxx)", ERROR);

        // functionp
        verify("(functionp 'append)", "NIL");
        verify("(functionp #'append)", "T");
        verify("(functionp (symbol-function 'append))", "T");
        verify("(functionp nil)", "NIL");
        verify("(functionp 12)", "NIL");
        verify("(functionp '(lambda (x) (* x x)))", "NIL");
        verify("(functionp #'(lambda (x) (* x x)))", "T");

        // special-operator-p
        verify("(special-operator-p 'if)", "T");
        verify("(special-operator-p 'car)", "NIL");
        verify("(special-operator-p 'one)", "NIL");

        // funcall
        verify("(funcall #'+ 1 2 3)", "6");
        verify("(funcall #'+ (+ 1 2) 3)", "6");
        verify("(funcall 'car '(1 2 3))", "1");
        verify("(cons 1 2)", "(1 . 2)");
        verify("(progn (setq cons (symbol-function '+)) (funcall cons 1 2 3))",
            "6");
        verify("(cons 1 2)", "(1 . 2)");

        // apply
        verify("(apply (function +) '(1 2 3))", "6");
        verify("(apply '+ '(1 2 3))", "6");
        verify("(apply '+ 1 2 '(3 4 5))", "15");
        verify("(apply '+ 1 2 3)", ERROR); // Last argument must be a list.
        verify("(apply 'cons '((+ 2 3) 4))", "((+ 2 3) . 4)");
//         verify("(defun add (x y) (+ x y))", "add");
//         verify("(add 1 2)", "3");
//         verify("(apply #'add '(1 2))", "3");
//         verify("(apply #'add '((+ 1 2) 3))", ERROR);
//         verify("(apply #'+ ())", "0");
//         verify("(apply #'concatenate 'string '(\"foo\" \"bar\"))", "\"foobar\"");

        // lambda
        verify("((lambda (x) (+ x x)) 23)", "46");
//         verify("(apply (lambda (x y z) (+ x y z)) '(1 2 3))", "6");
//         verify("(funcall (lambda (x) (+ x 3)) 4)", "7");

        // mapcar
        verify("(mapcar #'(lambda (x) (+ x 10)) '(1 2 3))", "(11 12 13)");
        verify("(mapcar #'list '(a b c) '(1 2 3 4))", "((a 1) (b 2) (c 3))");
        verify("(mapcar #'car '((1 a) (2 b) (3 c)))", "(1 2 3)");
        verify("(mapcar #'abs '(3 -4 2 -5 -6))", "(3 4 2 5 6)");
        verify("(mapcar #'cons '(a b c) '(1 2 3))", "((a . 1) (b . 2) (c . 3))");

        // eq
        verify("(eq 'a 'a)", "T");
        verify("(eq 'a 'b)", "NIL");
        verify("(eq (cons 'a 'b) (cons 'a 'c))", "NIL");
        verify("(eq (cons 'a 'b) (cons 'a 'b))", "NIL");
        verify("(progn (setq x (cons 'a 'b)) (eq x x))", "T");
        verify("(progn (setq x '(a . b)) (eq x x))", "T");
        verify("(let ((x \"Foo\")) (eq x x))", "T");
        verify("(eq \"FOO\" \"foo\")", "NIL");

        // eql
        verify("(eql 'a 'b)", "NIL");
        verify("(eql 'a 'a)", "T");
        verify("(eql 3 3)", "T");
        verify("(eql (cons 'a 'b) (cons 'a 'c))", "NIL");
        verify("(eql (cons 'a 'b) (cons 'a 'b))", "NIL");
        verify("(progn (setq x (cons 'a 'b)) (eql x x))", "T");
        verify("(progn (setq x '(a . b)) (eql x x))", "T");
        verify("(eql #\\a #\\a)", "T");
        verify("(eql \"FOO\" \"foo\")", "NIL");

        // equal
        verify("(equal 'a 'b)", "NIL");
        verify("(equal 'a 'a)", "T");
        verify("(equal 3 3)", "T");
        verify("(equal (cons 'a 'b) (cons 'a 'c))", "NIL");
        verify("(equal (cons 'a 'b) (cons 'a 'b))", "T");
        verify("(equal #\\A #\\A)", "T");
        verify("(equal #\\A #\\a)", "NIL");
        verify("(equal \"Foo\" \"Foo\")", "T");
        verify("(equal \"FOO\" \"foo\")", "NIL");
        verify("(equal \"This-string\" \"This-string\")", "T");
        verify("(equal \"This-string\" \"this-string\")", "NIL");

        // equalp
        verify("(equalp 'a 'b)", "NIL");
        verify("(equalp 'a 'a)", "T");
        verify("(equalp 3 3)", "T");
        verify("(equalp (cons 'a 'b) (cons 'a 'c))", "NIL");
        verify("(equalp (cons 'a 'b) (cons 'a 'b))", "T");
        verify("(equalp #\\A #\\A)", "T");
        verify("(equalp #\\A #\\a)", "T");
        verify("(equalp \"Foo\" \"Foo\")", "T");
        verify("(equalp \"FOO\" \"foo\")", "T");

        // string
        verify("(string \"already a string\")", "\"already a string\"");
        verify("(string 'elm)", "\"ELM\"");
        verify("(string #\\c)", "\"c\"");

        // string= (case sensitive)
//         verify("(string= \"foo\" \"foo\")", "T");
//         verify("(string= \"foo\" \"Foo\")", "NIL");
//         verify("(string= \"foo\" \"bar\")", "NIL");

        // string-equal (case insensitive)
//         verify("(string-equal \"foo\" \"foo\")", "T");
//         verify("(string-equal \"foo\" \"Foo\")", "T");
//         verify("(string-equal \"foo\" \"bar\")", "NIL");

        // make-string
//         verify("(make-string 10 :initial-element #\\5)", "\"5555555555\"");
//         verify("(length (make-string 10))", "10");

        // char
        verify("(char \"test\" 0)", "#\\t");

        // boundp
        verify("(setq x 1)", "1");
        verify("(boundp 'x)", "T");
        verify("(makunbound 'x)", "X");
        verify("(boundp 'x)", "NIL");
        verify("(let ((x 2)) (boundp 'x))", "NIL");

        // fboundp
        verify("(fboundp 'car)", "T");
//         verify("(defun my-function (x) x)", "MY-FUNCTION");
//         verify("(fboundp 'my-function)", "T");
//         verify("(fmakunbound 'my-function)", "MY-FUNCTION");
//         verify("(fboundp 'my-function)", "NIL");

        // dotimes
        verify("(dotimes (temp-one 10 temp-one))", "10");
        verify("(setq temp-two 0)", "0");

        // member
//         verify("(member 2 '(1 2 3))", "(2 3)");
//         verify("(member 'e '(a b c d))", "NIL");

        // nth
        verify("(nth 0 '(foo bar baz))", "FOO");
        verify("(nth 1 '(foo bar baz))", "BAR");
        verify("(nth 3 '(foo bar baz))", "NIL");

        // nthcdr
        verify("(nthcdr 0 '())", "NIL");
        verify("(nthcdr 3 '())", "NIL");
        verify("(nthcdr 0 '(a b c))", "(A B C)");
        verify("(nthcdr 2 '(a b c))", "(C)");
        verify("(nthcdr 4 '(a b c))", "NIL");
        verify("(nthcdr 1 '(0 . 1))", "1");
        verify("(nthcdr 3 '(0 . 1)))", "ERROR");

        // rplaca, rplacd
        verify("(setq g '(a b c))", "(A B C)");
        verify("(rplaca (cdr g) 'd)", "(D C)");
        verify("g", "(A D C)");
        verify("(setq x '(a b c))", "(A B C)");
        verify("(rplacd x 'd)", "(A . D)");
        verify("x", "(A . D)");

        // endp
        verify("(endp nil)", "T");
        verify("(endp '(1 2))", "NIL");
        verify("(endp (cddr '(1 2)))", "T");

        // reverse
//         verify("(reverse '(a b c d e))", "(e d c b a)");

        // subst
//         verify("(setq tree1 '(1 (1 2) (1 2 3) (1 2 3 4)))",
//             "(1 (1 2) (1 2 3) (1 2 3 4))");
//         verify("(subst \"two\" 2 tree1)",
//             "(1 (1 \"two\") (1 \"two\" 3) (1 \"two\" 3 4))");
//         verify("(subst \"five\" 5 tree1)",
//             "(1 (1 2) (1 2 3) (1 2 3 4))");
//         verify("(subst 'tempest 'hurricane '(shakespeare wrote (the hurricane)))",
//             "(SHAKESPEARE WROTE (THE TEMPEST))");
//         verify("(subst 'foo 'nil '(shakespeare wrote (twelfth night)))",
//             "(SHAKESPEARE WROTE (TWELFTH NIGHT . FOO) . FOO)");

        // last
//         verify("(last nil)", "NIL");
//         verify("(last '(1 2 3))", "(3)");
//         verify("(last '(1 2 . 3))", "(2 . 3)");
//         verify("(setq x (list 'a 'b 'c 'd))", "(A B C D)");
//         verify("(last x)", "(D)");
//         verify("(rplacd (last x) (list 'e 'f))", "(D E F)");
//         verify("x", "(A B C D E F)");
//         verify("(last x)", "(F)");
//         verify("(last '(a b c))", "(C)");
//         verify("(last '(a b c) 0)", "NIL");
//         verify("(last '(a b c) 1)", "(C)");
//         verify("(last '(a b c) 2)", "(B C)");
//         verify("(last '(a b c) 3)", "(A B C)");
//         verify("(last '(a b c) 4)", "(A B C)");
//         verify("(last '(a . b) 0)", "B");
//         verify("(last '(a . b) 1)", "(A . B)");
//         verify("(last '(a . b) 2)", "(A . B)");

        // subseq
//         verify("(setq str \"012345\")", "\"012345\"");
//         verify("(subseq str 2)", "\"2345\"");
//         verify("(subseq str 3 5)", "\"34\"");

        // values
        verify("(values)", "");
        verify("(values 1)", "1");
        verify("(values 1 2)", "1, 2");
        verify("(values 1 2 3)", "1, 2, 3");
        verify("(values (values 1 2 3) 4 5)", "1, 4, 5");
        verify("(let ((x (values 1 2 3))) x)", "1");
        verify("(let ((x (values))) x)", "NIL");
        verify("(+ 1 (values 1 2 3))", "2");
        verify("(1+ (values 1 2 3))", "2");

        // multiple-value-bind
        verify("(multiple-value-bind (x y z) (values 1 2 3) (list x y z))",
            "(1 2 3)");
        verify("(multiple-value-bind (x y z) (values 1 2) (list x y z))",
            "(1 2 NIL)");

        // multiple-value-list
        verify("(multiple-value-list (car '(a b c)))", "(A)");
        verify("(multiple-value-list (values 1 2 3))", "(1 2 3)");

        // macroexpand-1
        verify("(defmacro nil! (x) (list 'setq x nil))", "NIL!");
        verify("(macroexpand-1 '(nil! x))", "(SETQ X NIL), T");

        // vector
        verify("(arrayp (setq v (vector 1 2 'sirens)))", "T");
        verify("(vectorp v)", "T");
        verify("(simple-vector-p v)", "T");
        verify("(length v)", "3");
        verify("(vector)", "#()");
        verify("(vector ())", "#(NIL)");
        verify("(vector 'a 'b 'c)", "#(A B C)");
        verify("#()", "#()");
        verify("#(a b c)", "#(A B C)");

        // arrayp
        verify("(arrayp \"aaaa\")", "T");
        verify("(vectorp \"aaaa\")", "T");
        verify("(simple-vector-p \"aaaa\")", "NIL");

        // unwind-protect
//         verify("(block nil (unwind-protect (return 1) (return 2)))", "2");
        verify("(catch nil (unwind-protect (throw nil 1) (throw nil 2)))", "2");
        verify("(catch 'a (catch 'b (unwind-protect (1+ (catch 'a (throw 'b 1))) (throw 'a 10))))",
            "10");
        verify("(catch 'bar (catch 'foo (unwind-protect (throw 'foo 3) (throw 'bar 4) (print 'xxx))))",
            "4");

        // flet
        verify("(flet ((double (x) (+ x x))) (double 42))", "84");
        verify("(flet ((plus (a b) (+ a b)) (minus (a b) (- a b))) (list (plus 1 2) (minus 1 2)))",
            "(3 -1)");
        verify("(list (flet ((+ (a b) (- a b))) (+ 3 2)) (+ 3 2))", "(1 5)");
        verify("(flet ((+ (a b) (+ (+ a b a) b))) (+ 3 2))", "10");

        // labels
        verify("(labels ((queue (l) (if (car l) (queue (cdr l)) 'end))) (queue '(1 2 3)))",
            "END");
        verify("(labels ((+ (a b) (* a (+ a a b)))) (+ 1 2 3))", ERROR);
    }

    private void verify(String input, String expected)
    {
        assertTrue(input != null);
        assertTrue(expected != null);
        String output = Interpreter.evalString(input);
        if (!expected.equalsIgnoreCase(output)) {
            System.out.println("input = |" + input + "|");
            System.out.println("output = |" + output + "|");
            assertTrue(false);
        }
    }

    public static Test suite()
    {
        return new TestSuite(Tests.class);
    }

    public static void main(String[] args) {
        TestRunner.run(suite());
    }
}
