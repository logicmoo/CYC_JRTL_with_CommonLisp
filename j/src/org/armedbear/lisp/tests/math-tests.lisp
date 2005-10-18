;;; math-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: math-tests.lisp,v 1.1 2005-10-18 13:34:21 piso Exp $
;;;
;;; This program is free software; you can redistribute it and/or
;;; modify it under the terms of the GNU General Public License
;;; as published by the Free Software Foundation; either version 2
;;; of the License, or (at your option) any later version.
;;;
;;; This program is distributed in the hope that it will be useful,
;;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;; GNU General Public License for more details.
;;;
;;; You should have received a copy of the GNU General Public License
;;; along with this program; if not, write to the Free Software
;;; Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

;;; Some of these tests are based on tests in the CLISP test suite.

;; SET-FLOATING-POINT-MODES, GET-FLOATING-POINT-MODES
#+abcl
(progn
  (ext:set-floating-point-modes :traps nil)
  (assert (equal (ext:get-floating-point-modes) '(:traps nil)))
  (assert (equal (getf (ext:get-floating-point-modes) :traps) nil))
  (ext:set-floating-point-modes :traps '(:overflow))
  (assert (equal (ext:get-floating-point-modes) '(:traps (:overflow))))
  (assert (equal (getf (ext:get-floating-point-modes) :traps) '(:overflow)))
  (ext:set-floating-point-modes :traps '(:underflow))
  (assert (equal (ext:get-floating-point-modes) '(:traps (:underflow))))
  (assert (equal (getf (ext:get-floating-point-modes) :traps) '(:underflow)))
  (ext:set-floating-point-modes :traps '(:overflow :underflow))
  (assert (equal (ext:get-floating-point-modes) '(:traps (:overflow :underflow))))
  (assert (equal (getf (ext:get-floating-point-modes) :traps) '(:overflow :underflow)))
  )
#+sbcl
(progn
  (sb-int:set-floating-point-modes :traps nil)
  (assert (equal (getf (sb-int:get-floating-point-modes) :traps) nil))
  (sb-int:set-floating-point-modes :traps '(:overflow))
  (assert (equal (getf (sb-int:get-floating-point-modes) :traps) '(:overflow)))
  (sb-int:set-floating-point-modes :traps '(:underflow))
  (assert (equal (getf (sb-int:get-floating-point-modes) :traps) '(:underflow)))
  (sb-int:set-floating-point-modes :traps '(:overflow :underflow))
  (assert (null (set-exclusive-or (getf (sb-int:get-floating-point-modes) :traps)
                                  '(:overflow :underflow))))
  )

;; Restore defaults.
#+abcl
(ext:set-floating-point-modes :traps '(:overflow :underflow))
#+sbcl
(sb-int:set-floating-point-modes :traps '(:overflow :invalid :divide-by-zero))

#-clisp
(progn
  (assert (= most-positive-single-float 3.4028235e+38))
  (assert (= least-positive-single-float 1.4012985e-45))

  (assert (= (log most-positive-single-float) 88.72284))
  (assert (= (log least-positive-single-float) -103.27893))
  )

;; SQRT
#+clisp
(assert (eql (sqrt 0) 0))
#-clisp
(assert (= (sqrt 0) 0.0))
#+clisp
(assert (eql (sqrt 1) 1))
#-clisp
(assert (= (sqrt 1) 1.0))
#+clisp
(assert (eql (sqrt 9) 3))
#-clisp
(assert (= (sqrt 9) 3.0))
#+clisp
(assert (eql (sqrt -9) #c(0 3)))
#-clisp
(assert (eql (sqrt -9) #c(0.0 3.0)))
#+clisp
(assert (eql (sqrt #c(-7 24)) #c(3 4)))
#-clisp
(assert (= (sqrt #c(-7 24)) #c(3.0 4.0)))

(assert (= (sqrt 1d0) 1.0d0))
(assert (= (sqrt -1) #c(0 1)))
(assert (= (sqrt -1d0) #c(0 1.0d0)))
(assert (= (sqrt #c(0.0 0.0)) #c(0.0 0.0)))
(assert (= (sqrt #c(4.0 0.0)) #c(2.0 0.0)))
(assert (= (sqrt #c(-4.0 0.0)) #c(0.0 2.0)))
(assert (= (sqrt #c(-4.4855622e-7 0.0)) #c(0.0 6.697434e-4)))

#-clisp
(progn
  ;; (sqrt -0.0) => -0.0
  (assert (minusp (float-sign (sqrt -0.0))))
  (assert (minusp (float-sign (sqrt -0.0d0)))))

;; EXP
(assert (= (exp #c(0 0)) 1))
(assert (= (exp #c(0 1)) #c(0.5403023 0.84147096)))
#-clisp
(assert (= (exp #c(1 1)) #c(1.4686939 2.2873552)))
#+clisp
(assert (= (exp #c(1 1)) #c(1.468694 2.2873552)))
(assert (= (exp #c(1 1d0)) #c(1.4686939399158851d0 2.2873552871788423d0)))
(assert (= (exp #c(1d0 1d0)) #c(1.4686939399158851d0 2.2873552871788423d0)))
(assert (= (exp #c(0 1d0)) #c(0.5403023058681398d0 0.8414709848078965d0)))
(assert (= (exp 1) 2.7182817))
(assert (= (exp 1f0) 2.7182817))
(assert (= (exp 1d0) 2.718281828459045d0))

;; EXPT
(assert (= (expt -5s0 2s0) #c(25s0 0s0)))
(assert (= (expt -5f0 2f0) #c(25f0 0f0)))
(assert (= (expt -5d0 2d0) #c(25d0 0d0)))
(assert (= (expt -5l0 2l0) #c(25l0 0l0)))
(assert (= (expt -5 2) 25))
(assert (= (expt 5s0 3s0) 125s0))
(assert (= (expt 5f0 3f0) 125f0))
(assert (= (expt 5d0 3d0) 125d0))
(assert (= (expt 5l0 3l0) 125l0))
(assert (= (expt 5 3) 125))
(assert (= (expt #c(10 11) 1) #c(10 11)))
(assert (= (expt 0 1/2) 0))
(assert (= (expt 1 1/2) 1))
(assert (= (expt 9 1/2) 3))
#+clisp
(assert (= (expt -9 1/2) #c(0 3)))
#+(or sbcl cmu)
(assert (= (expt -9 1/2) #c(1.8369095e-16 3.0)))
#+abcl
(assert (= (expt -9 1/2) #c(1.8369701e-16 3.0)))
(assert (- (expt -8 1/3) #c(1.0 1.7320508)))
(assert (= (expt #c(-7 24) 1/2) #c(3 4)))
(assert (= (expt 729 1/6) 3))
(assert (= (expt -3 -1) -1/3))
(assert (= (expt #c(3 4) -1) #c(3/25 -4/25)))
#-clisp
(assert (= (expt 14 #c(1.0 1.0)) #c(-12.269101 6.743085)))
#+clisp
(assert (= (expt 14 #c(1.0 1.0)) #c(-12.269099 6.7430854)))
