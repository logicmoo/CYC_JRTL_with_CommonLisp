;; Author: Berlin Brown
;; Short Description: Database Test - connect to the entity links database
;; and run a query 
;; Environment: (SBCL 1.0.14) common lisp with libraries:
;; clsql-mysql, uffi
;;
;; Description: The following snippet contains common lisp code
;; connect to a simple URL database called botlist_development and returns 
;; two records from a table called entity_links.
;; 
;; References:
;; [1] http://clsql.b9.com/manual/with-database.html
(require :clsql)
(require :clsql-mysql)
(clsql:locally-enable-sql-reader-syntax)
(setf clsql:*default-caching* nil)
;; Data structure to store our links
(clsql:def-view-class entity_links ()
  ((main_url
    :reader main_url
    :initarg :main_url
    :type string)
   (url_title
    :reader url_title
    :initarg :url_title
    :type string)   
   ))
;; Ensure that the references to the entity links table, uses
;; the correct tablename and case.
(setf (clsql:view-table (find-class 'entity_links)) '|entity_links|)

(defmacro with-db ((database) &body body)
  `(clsql:with-database
	   ;; Supply database connect str
	   ;; For mysql => URL DATABASE USER PASSWORD
	   (,database '("localhost" "botlist_development" "USER" "PASSWORD")
				  :database-type :mysql
				  :pool t 
				  :if-exists nil)
	 ,@body))
(defun test-db ()
  "Wrapper method for the test case; connect to the database
and run a simple query"
  (with-db (db)
	(setf clsql:*default-database* db)
	(clsql:status t)
	(let ((z (clsql:query 
			  "select main_url from entity_links limit 0,2" 
			  :database db))
		  (d (clsql:select 'entity_links
						   :database db
						   :flatp t)))
	  (print z)))
  (format t "After with-db~%")
  (clsql:status t))
(defun main ()
  "Main entry point for the example"
  (format t "Running - ~%")
  (test-db)
  (format t "Done - ~%"))
(main)
;; End of the File