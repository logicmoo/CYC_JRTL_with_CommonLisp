;;; -*- Mode: LISP; Syntax: Common-lisp; Package: USER; Base: 10. -*-

;;; DEMO-DEFAULTS.LISP

;;; test cases for default reasoning

#|

(LOOM:use-loom 'USER)
(in-kb 'user-kb)



;;; DEFAULTS

(defkb foo-kb (upper-structure-kb))
(in-kb 'foo-kb)
(in-kb 'loom-kb)


;;; TWEETY:
(initialize-network)
(defconcept Bird
  :disjoint-covering (Flies Not-Flies))
(defconcept Flies :is (:and Bird :primitive))
(defconcept Not-Flies :is (:and Bird :primitive))
(defconcept Penguin :is (:and Bird :primitive))
(default Bird Flies)
(default Penguin Not-Flies)

(tellm (Bird Tweety))
(tellm (Penguin Tweety))
(forgetm (Bird Tweety))
(tellm (Bird Tweety))
(forgetm (Penguin Tweety))



;;; NIXON DIAMONDS:
(set-features :display-match-changes)
(initialize-network)
(defconcept Person
  :disjoint-covering (Pacifist Hawk))
(defconcept Pacifist :is (:and Person :primitive))
(defconcept Hawk :is (:and Person :primitive))
(defconcept Quaker :is (:and Person :primitive)
   :defaults Pacifist)
(defconcept Republican :is (:and Person :primitive)
   :defaults Hawk)
(defconcept Q&R :is (:and Quaker Republican)
   :defaults Person)
;(initialize-instances)
(tellm (Quaker Nixon))
(tellm (Republican Nixon))
(forgetm (Quaker Nixon))


;;; STRICT OVERRIDE OF DEFAULT:
(initialize-network)
(defconcept d
   :disjoint-covering (a not-a))
(defconcept not-a :is (:and d :primitive))
(defconcept a :is (:and d :primitive))
(defconcept b)
(defconcept c :is (:and a b))
(defconcept e
   :defaults c)
(defconcept f :is (:and e :primitive)
   :constraints not-a)



;;; STRICT AND DEFAULT ROLE FILLERS:
(initialize-network)
(defrelation r :range integer :attributes :single-valued)
(defconcept a)
(implies a (:the r 5))
(defconcept b)
(default b (:the r 7))

(initialize-instances)
(tellm (a fred))
(tellm (r fred 6))
(tellm (b fred))
(forgetm (r fred 6))
(forgetm (a fred))
(forgetm (b fred))

(retrieve ?x (r fred ?x))


;;; DEFAULT VALUE RESTRICTIONS
(initialize-network)
(defconcept b
  :constraint (:at-least 1 r))
(defrelation r)
(defconcept a
   :defaults (:all r B))
(defconcept c
  :constraint (:at-most 0 r))

(initialize-instances)
(tellm (A fred))
(tellm (r fred joe))
(tellm (C joe))
(forgetm (C joe))


(initialize-network)
(defrelation r :attributes :single-valued)
(defconcept a
  :defaults b)
(defconcept b
   :constraints (:all r C))
(defconcept c)

(initialize-instances)
(tellm (A fred))
(tellm (r fred joe))
(forgetm (A fred))


;;; TBOX SIDE OF DEFAULT VALUE RESTRICTIONS:
(initialize-network)
(defconcept b
  :constraint (:at-least 1 r))
(defconcept bb
  :constraint (:at-most 0 r))
(defrelation r)
(defconcept a
   :defaults (:all r B))
(defconcept aa
  :defaults (:all r bb))
(defconcept c :is (:and A aa))
(defconcept d
   :defaults (:and (:all r b) (:all r bb)))
(defconcept e :is (:and aa :primitive)
  :defaults (:all r b))	    


;;; CLOSED-ROLE DEFAULTS:
(initialize-network)
(defrelation r :attributes :closed-world)
(defconcept a)
(defconcept b :is (:and a (:all r a)))

(initialize-instances)
(tellm (A fred))
(tellm (r fred joe))
(tellm (A joe))
(forgetm (A joe))


;;; STRICT TRUTH MAINTENANCE (TYPE BOMBS):
(initialize-network)
(defrelation r)
(defconcept a
   :constraints (:at-most 1 r))
(defconcept b :is (:and a (:all r a)))

(initialize-instances)
(tellm (A fred))
(tellm (r fred joe))
(tellm (A joe))
(forgetm (A joe))

