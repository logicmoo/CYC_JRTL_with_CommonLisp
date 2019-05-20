(asdf:operate 'asdf:load-op 'clsql)

(in-package #:clsql-user)

;; You must set these variables to appropriate values.
(defvar *tutorial-database-type* nil
  "Possible values are :postgresql :postgresql-socket, :mysql,
:oracle, :odbc, :aodbc or :sqlite")
(defvar *tutorial-database-name* "clsqltut"
  "The name of the database we will work in.")
(defvar *tutorial-database-user* ""
  "The name of the database user we will work as.")
(defvar *tutorial-database-server* ""
  "The name of the database server if required")
(defvar *tutorial-database-password* ""
  "The password if required")

(clsql:def-view-class employee ()
  ((emplid
    :db-kind :key
    :db-constraints :not-null
    :type integer
    :initarg :emplid)
   (first-name
    :accessor first-name
    :type (string 30)
    :initarg :first-name)
   (last-name
    :accessor last-name
    :type (string 30)
    :initarg :last-name)
   (email
    :accessor employee-email
    :type (string 100)
    :initarg :email)
   (companyid
    :type integer
    :initarg :companyid)
   (company
    :accessor employee-company
    :db-kind :join
    :db-info (:join-class company
                          :home-key companyid
                          :foreign-key companyid
                          :set nil))
   (managerid
    :type integer
    :initarg :managerid)
   (manager
    :accessor employee-manager
    :db-kind :join
    :db-info (:join-class employee
                          :home-key managerid
                          :foreign-key emplid
                          :set nil)))
  (:base-table employee))

(clsql:def-view-class company ()
  ((companyid
    :db-kind :key
    :db-constraints :not-null
    :type integer
    :initarg :companyid)
   (name
    :type (string 100)
    :initarg :name)
   (presidentid
    :type integer
    :initarg :presidentid)
   (president
    :reader president
    :db-kind :join
    :db-info (:join-class employee
                          :home-key presidentid
                          :foreign-key emplid
                          :set nil))
   (employees
    :reader company-employees
    :db-kind :join
    :db-info (:join-class employee
                          :home-key companyid
                          :foreign-key companyid
                          :set t)))
  (:base-table company))

;; Connect to the database (see the CLSQL documentation for vendor
;; specific connection specs).
(case *tutorial-database-type*
  ((:mysql :postgresql :postgresql-socket)
   (clsql:connect `(,*tutorial-database-server*
                    ,*tutorial-database-name*
                    ,*tutorial-database-user*
                    ,*tutorial-database-password*)
                  :database-type *tutorial-database-type*))
  ((:odbc :aodbc :oracle)
   (clsql:connect `(,*tutorial-database-name*
                    ,*tutorial-database-user*
                    ,*tutorial-database-password*)
                  :database-type *tutorial-database-type*))
  (:sqlite
   (clsql:connect `(,*tutorial-database-name*)
                  :database-type *tutorial-database-type*)))

;; Record the sql going out, helps us learn what is going
;; on behind the scenes
(clsql:start-sql-recording)

;; Create the tables for our view classes
;; First we drop them, ignoring any errors
(ignore-errors
 (clsql:drop-view-from-class 'employee)
 (clsql:drop-view-from-class 'company))

(clsql:create-view-from-class 'employee)
(clsql:create-view-from-class 'company)


;; Create some instances of our view classes
(defvar company1 (make-instance 'company
                              :companyid 1
                              :name "Widgets Inc."
                              ;; Lenin is president of Widgets Inc.
                              :presidentid 1))

(defvar employee1 (make-instance 'employee
                               :emplid 1
                               :first-name "Vladamir"
                               :last-name "Lenin"
                               :email "lenin@soviet.org"
                               :companyid 1))

(defvar employee2 (make-instance 'employee
                               :emplid 2
                               :first-name "Josef"
                               :last-name "Stalin"
                               :email "stalin@soviet.org"
                               :companyid 1
                               ;; Lenin manages Stalin (for now)
                               :managerid 1))

(clsql:update-records-from-instance employee1)
(clsql:update-records-from-instance employee2)
(clsql:update-records-from-instance company1)

;; lets use the functional sql interface
(clsql:locally-enable-sql-reader-syntax)

(format t "The email address of ~A ~A is ~A"
        (first-name employee1)
        (last-name employee1)
        (employee-email employee1))

(setf (employee-email employee1) "lenin-nospam@soviets.org")

;; Update the database
(clsql:update-records-from-instance employee1)

(let ((new-lenin (car
                  (clsql:select 'employee
                              :where [= [slot-value 'employee 'emplid] 1]
                              :flatp t))))
  (format t "His new email is ~A"
          (employee-email new-lenin)))


;; Some queries

;; all employees
(clsql:select 'employee)
;; all companies
(clsql:select 'company)

;; employees named Lenin
(clsql:select 'employee :where [= [slot-value 'employee 'last-name]
                                "Lenin"])

(clsql:select 'company :where [= [slot-value 'company 'name]
                               "Widgets Inc."])

;; Employees of Widget's Inc.
(clsql:select 'employee
            :where [and [= [slot-value 'employee 'companyid]
                           [slot-value 'company 'companyid]]
                        [= [slot-value 'company 'name]
                           "Widgets Inc."]])

;; Same thing, except that we are using the employee
;; relation in the company view class to do the join for us,
;; saving us the work of writing out the SQL!
(company-employees company1)

;; President of Widgets Inc.
(president company1)

;; Manager of Josef Stalin
(employee-manager employee2)
