;;-*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

;;; Incremental Cycle Test -- used when new concept is defined
;;;    in the TBox

(defun find-cycle-containing-node (rootNode)
  ;; Beginning at start node, look for a cycle;
  ;; Print a warning message if one is found
 (let ((passCounter (decf *revise-subgraph-pass-counter*)))
   (labels ((help-check-for-cycles
	      (node)
	      ;; Return a list of nodes forming a cycle ending 
	      ;;    at *start-node-for-cycle-check* if a cycle is found
	      ;; Nodes already visited are marked with a pass counter
	      ;; Note: Logic depends on *start-node-for-cycle-check*
	      ;;    not being marked (by the pass counter)
	      
	      ;; return if we have landed on the start node
	      (when (eq node rootNode)
		(return-from help-check-for-cycles (list node)))
	      ;; otherwise, keep looking
	      (loop for super in (depend-ons node)
		   when (neq (already-revised-counter super) passCounter)
		   do
		   (let ((cycle (help-check-for-cycles super)))
		     (when cycle
		       (return-from help-check-for-cycles (cons super cycle))))) )) 
   ;; note: don't mark "rootNode"
   (loop for super in (depend-ons rootNode)
	when (neq (already-revised-counter super) passCounter)
	do
	(let ((cycle (help-check-for-cycles super)))
	  (when cycle
	    (warn "Cycle found in TBox definitions: ~S" cycle)
	    (return)))) )))



(defun find-tbox-cycle ()
  (loop for c in *top-level-unclassified-concepts*
       unless (member :undefined (attributes c))
       do
       (map-transitively
	 c
	 depend-ons
	 #'find-cycle-containing-node)))

(find-tbox-cycle)

;; (map-transitively foo super-concepts #'car :use-pass-counter t)

(loop for c in (list-unclassified-concepts)
       when (and (not (member :undefined (attributes c)))
		 (member c (depend-ons c)))
       do
       (warn "Cycle found in TBox definitions: ~S" c))
