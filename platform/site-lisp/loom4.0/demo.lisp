;;; -*- Mode:Lisp; Package:DEMO; Base:10; Fonts:(TR18); Syntax:Common-Lisp -*-

;;; DEMO.LISP

;;; LOOM DEMONSTRATION FILE

(defpackage "DEMO" (:use "COMMON-LISP"))
(in-package "DEMO")
(LOOM:use-loom "DEMO")
(set-features :display-match-changes :emit-match-stars :emit-classify-dots)
(unset-features :ask-for-concept-names)

(creation-policy :classified-instance)
(creation-policy :clos-instance)
(creation-policy :lite-instance)
(change-context 'DEMO-THEORY)
(initialize-network)

;----------------------------------------------------------------
;; Define some primitive concepts and relations:

(defconcept Transport)
(defconcept Wheel)
(defrelation has-wheel
   :constraints (:range Wheel))

;----------------------------------------------------------------
;;; Define a non-primitive concept:

(defconcept Cycle :is (and Transport (at-least 1 has-wheel)))
;----------------------------------------------------------------
;; Recognize an instance of Cycle.
;;    Look for the deduction "(Cycle C1)";
;;    Also note the deduction "(Wheel W1)":

(tellm (:create C1 Transport)
       (:create W1 Wheel)
       (has-wheel C1 W1))

;----------------------------------------------------------------
;; Automatic concept classification.
;;    Observe that Unicycle classifies below Cycle:
(defconcept Unicycle :is (and Transport (exactly 1 has-wheel)))
(pc Unicycle)

;----------------------------------------------------------------
;; Demonstration of open-world semantics.
;;    Before this "tell", C1 is not recognized as a Unicycle:
(pi c1)
(tellm (:about C1 (at-most 1 has-wheel)))
(ask (Unicycle C1))

;----------------------------------------------------------------
;; Automatic merging and unmerging of concepts.
(defconcept Bicycle :is (and Transport (exactly 1 has-wheel)))
(pc Bicycle)
(defconcept Bicycle :is (and Transport (exactly 2 has-wheel)))
(pc Bicycle)

;----------------------------------------------------------------
;; Detection of incoherence (membership in disjoint concepts):
;;    When the creation policy is :classified-instance, look
;;    for the deduction "(Incoherent C1)".
;;    Note: Disjointness of Unicycle & Bicycle found using
;;       backward-chaining.
(unset-features :clip-roles)
(tellm (has-wheel C1 W2))
(pi C1)
(set-features :clip-roles)

;----------------------------------------------------------------
;; Retracting a fact.
;;   C1 is now neither a Unicycle or a Bicycle, nor is it
;;   incoherent:
(forgetm (:about C1 (at-most 1 has-wheel)))
(ask (Bicycle C1))

;----------------------------------------------------------------
;; Automatic role-closure.
;;    "has-wheel" is redefined to be closed-world.
;;    This permits C1 to be recognized as a Bicycle:
(defrelation has-wheel
   :constraints (:range Wheel)
   :characteristics :closed-world)
(tellm)
(pi C1)


;================================================================
;; METHODS & RULES
;================================================================
(clear-context)
(defconcept Wheel)
(defrelation has-wheel
   :constraints (:range Wheel))
(defconcept Car)
(defrelation name :characteristics :single-valued)

(defset Tire-Pressure :is (:the-ordered-set 'FLAT 'LOW 'NORMAL))
(defrelation tire-pressure
   :domain Wheel  :range Tire-Pressure
   :characteristics :single-valued)

(defconcept Low-Wheel
	    :is (and Wheel (:the tire-pressure (:through 'FLAT 'LOW))))
(defconcept Flat-Wheel
	    :is (and Wheel (:the tire-pressure (:the-set 'FLAT))))

(defconcept Car-with-Low-Tire
   :is (and Car (:some has-wheel Low-Wheel)))
(defconcept Car-with-Flat-Tire
   :is (and Car (:some has-wheel Flat-Wheel)))

(defmethod say-car-status (?c)
   :situation (Car-with-Low-Tire ?c)
   :response ((LOOM::say "Car" (get-value ?c 'name) "has a low tire")))

(defmethod say-car-status (?c)
   :situation (Car-with-Flat-Tire ?c)
   :response ((LOOM::say "Car" (get-value ?c 'name) "has a flat tire")))

(defmethod say-car-status (?c)
   :situation (Car ?c)
   :response ((LOOM::say "Car" (get-value ?c 'name) "is OK")))
 
;----------------------------------------------------------------
;; Invoking LOOM Methods
;;    Observe how type specificity determines which method is called;

(initialize-instances)
(tellm (:create C2 Car) (name C2 'Veronica)
       (:create W3 Wheel) (has-wheel C2 W3)
       (:create W4 Wheel) (has-wheel C2 W4))
(perform (say-car-status (get-instance 'c2)))

(tellm (tire-pressure W3 'Low))
;; If C2 is a classified instance, then its classified as a Car-with-Low-Tire
(pi w3)
(perform (say-car-status (get-instance 'c2)))

(tellm (tire-pressure W4 'Flat))
(perform (say-car-status (get-instance 'c2)))

(forgetm (has-wheel C2 W4))
(perform (say-car-status (get-instance 'c2)))

;----------------------------------------------------------------
;; Redefining Operator Filters

(perform (say-car-status (get-instance 'c2)))

(defaction say-car-status (?c)
   :filters (:select-all))

(perform (say-car-status (get-instance 'c2)))

(defaction say-car-status (?c)
   :filters (:most-specific))
;----------------------------------------------------------------
;; Production rule behavior

(unset-features :display-match-changes :emit-match-stars)

(defset Door-Status :is (the-set 'OPEN 'CLOSED))
(defrelation door-status
   :domain Car    :range Door-Status
   :characteristics :single-valued)
(defconcept Car-with-Open-Door
   :is (and Car (the door-status (the-set 'OPEN))))

(defproduction R1
   :when (:detects (Car-with-Open-Door ?c))
   :perform (say-car-status ?c))

(tellm (door-status C2 'CLOSED))
(tellm (door-status C2 'OPEN))

(tellm (has-wheel C2 W4))
(tellm (tire-pressure W4 'FLAT))
(tellm (door-status C2 'CLOSED))
(tellm (door-status C2 'OPEN))

(tellm (tire-pressure W4 'NORMAL))
(tellm (door-status C2 'CLOSED))
(tellm (door-status C2 'OPEN))

;; TO DO:
;; ADD retrieve & ask EXAMPLES
