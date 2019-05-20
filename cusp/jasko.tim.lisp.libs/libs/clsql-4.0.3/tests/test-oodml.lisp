;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; ======================================================================
;;;; File:    test-oodml.lisp
;;;; Author:  Marcus Pearce <m.t.pearce@city.ac.uk>
;;;; Created: 01/04/2004
;;;; Updated: $Id$
;;;;
;;;; Tests for the CLSQL Object Oriented Data Definition Language
;;;; (OODML).
;;;;
;;;; This file is part of CLSQL.
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; ======================================================================

(in-package #:clsql-tests)

#.(clsql:locally-enable-sql-reader-syntax)

(setq *rt-oodml*
      '(

        (deftest :oodml/select/1
            (mapcar #'(lambda (e) (slot-value e 'last-name))
             (clsql:select 'employee :order-by [last-name] :flatp t :caching nil))
          ("Andropov" "Brezhnev" "Chernenko" "Gorbachev" "Kruschev" "Lenin" "Putin"
           "Stalin" "Trotsky" "Yeltsin"))

        (deftest :oodml/select/2
            (mapcar #'(lambda (e) (slot-value e 'name))
             (clsql:select 'company :flatp t :caching nil))
          ("Widgets Inc."))

        (deftest :oodml/select/3
            (mapcar #'(lambda (e) (slot-value e 'ecompanyid))
             (clsql:select 'employee
                           :where [and [= [slot-value 'employee 'ecompanyid]
                                          [slot-value 'company 'companyid]]
                                       [= [slot-value 'company 'name]
                                          "Widgets Inc."]]
                           :flatp t
                           :caching nil))
          (1 1 1 1 1 1 1 1 1 1))

        (deftest :oodml/select/4
            (mapcar #'(lambda (e)
                        (concatenate 'string (slot-value e 'first-name)
                                     " "
                                     (slot-value e 'last-name)))
             (clsql:select 'employee :where [= [slot-value 'employee 'first-name]
                                               "Vladimir"]
                           :flatp t
                           :order-by [last-name]
                           :caching nil))
          ("Vladimir Lenin" "Vladimir Putin"))

        (deftest :oodml/select/5
            (length (clsql:select 'employee :where [married] :flatp t :caching nil))
          3)

        (deftest :oodml/select/6
            (let ((a (caar (clsql:select 'address :where [= 1 [addressid]] :caching nil))))
              (values
               (slot-value a 'street-number)
               (slot-value a 'street-name)
               (slot-value a 'city)
               (slot-value a 'postal-code)))
          10 "Park Place" "Leningrad" 123)

        (deftest :oodml/select/7
            (let ((a (caar (clsql:select 'address :where [= 2 [addressid]] :caching nil))))
              (values
               (slot-value a 'street-number)
               (slot-value a 'street-name)
               (slot-value a 'city)
               (slot-value a 'postal-code)))
          nil "" "no city" 0)

        (deftest :oodml/select/8
            (mapcar #'(lambda (e) (slot-value e 'married))
             (clsql:select 'employee :flatp t :order-by [emplid] :caching nil))
          (t t t nil nil nil nil nil nil nil))

        (deftest :oodml/select/9
            (mapcar #'(lambda (pair)
                        (list
                         (typep (car pair) 'address)
                         (typep (second pair) 'employee-address)
                         (slot-value (car pair) 'addressid)
                         (slot-value (second pair) 'aaddressid)
                         (slot-value (second pair) 'aemplid)))
             (employee-addresses employee1))
          ((t t 1 1 1) (t t 2 2 1)))

        (deftest :oodml/select/10
            (mapcar #'(lambda (pair)
                        (list
                         (typep (car pair) 'address)
                         (typep (second pair) 'employee-address)
                         (slot-value (car pair) 'addressid)
                         (slot-value (second pair) 'aaddressid)
                         (slot-value (second pair) 'aemplid)))
             (employee-addresses employee2))
          ((t t 2 2 2)))

        (deftest :oodml/select/11
         (values (mapcar #'(lambda (x) (slot-value x 'emplid))
                         (clsql:select 'employee :order-by '(([emplid] :asc))
                                       :flatp t))
          (mapcar #'(lambda (x) (slot-value x 'emplid))
           (clsql:select 'employee :order-by '(([emplid] :desc))
                         :flatp t)))
         (1 2 3 4 5 6 7 8 9 10)
         (10 9 8 7 6 5 4 3 2 1))

        ;; test retrieval is deferred
        (deftest :oodm/retrieval/1
            (every #'(lambda (e) (not (slot-boundp e 'company)))
             (select 'employee :flatp t :caching nil))
          t)

        (deftest :oodm/retrieval/2
            (every #'(lambda (e) (not (slot-boundp e 'address)))
             (select 'deferred-employee-address :flatp t :caching nil))
          t)

        ;; :retrieval :immediate should be boundp before accessed
        (deftest :oodm/retrieval/3
            (every #'(lambda (ea) (slot-boundp ea 'address))
             (select 'employee-address :flatp t :caching nil))
          t)

        (deftest :oodm/retrieval/4
            (mapcar #'(lambda (ea) (typep (slot-value ea 'address) 'address))
             (select 'employee-address :flatp t :caching nil))
          (t t t t t))

        (deftest :oodm/retrieval/5
            (mapcar #'(lambda (ea) (typep (slot-value ea 'address) 'address))
             (select 'deferred-employee-address :flatp t :caching nil))
          (t t t t t))

        (deftest :oodm/retrieval/6
            (every #'(lambda (ea) (slot-boundp (slot-value ea 'address) 'addressid))
             (select 'employee-address :flatp t :caching nil))
          t)

        (deftest :oodm/retrieval/7
            (every #'(lambda (ea) (slot-boundp (slot-value ea 'address) 'addressid))
             (select 'deferred-employee-address :flatp t :caching nil))
          t)

        (deftest :oodm/retrieval/8
            (mapcar #'(lambda (ea) (slot-value (slot-value ea 'address) 'street-number))
             (select 'employee-address :flatp t :order-by [aaddressid] :caching nil))
          (10 10 nil nil nil))

        (deftest :oodm/retrieval/9
            (mapcar #'(lambda (ea) (slot-value (slot-value ea 'address) 'street-number))
             (select 'deferred-employee-address :flatp t :order-by [aaddressid] :caching nil))
          (10 10 nil nil nil))

        ;; tests update-records-from-instance
        (deftest :oodml/update-records/1
            (values
             (progn
               (let ((lenin (car (clsql:select 'employee
                                               :where [= [slot-value 'employee 'emplid]
                                                         1]
                                               :flatp t
                                               :caching nil))))
                 (concatenate 'string
                              (first-name lenin)
                              " "
                              (last-name lenin)
                              ": "
                              (employee-email lenin))))
             (progn
               (setf (slot-value employee1 'first-name) "Dimitriy"
                     (slot-value employee1 'last-name) "Ivanovich"
                     (slot-value employee1 'email) "ivanovich@soviet.org")
               (clsql:update-records-from-instance employee1)
               (let ((lenin (car (clsql:select 'employee
                                               :where [= [slot-value 'employee 'emplid]
                                                         1]
                                               :flatp t
                                               :caching nil))))
                 (concatenate 'string
                              (first-name lenin)
                              " "
                              (last-name lenin)
                              ": "
                              (employee-email lenin))))
             (progn
               (setf (slot-value employee1 'first-name) "Vladimir"
                     (slot-value employee1 'last-name) "Lenin"
                     (slot-value employee1 'email) "lenin@soviet.org")
               (clsql:update-records-from-instance employee1)
               (let ((lenin (car (clsql:select 'employee
                                               :where [= [slot-value 'employee 'emplid]
                                                         1]
                                               :flatp t
                                               :caching nil))))
                 (concatenate 'string
                              (first-name lenin)
                              " "
                              (last-name lenin)
                              ": "
                              (employee-email lenin)))))
          "Vladimir Lenin: lenin@soviet.org"
          "Dimitriy Ivanovich: ivanovich@soviet.org"
          "Vladimir Lenin: lenin@soviet.org")

        ;; tests update-record-from-slot
        (deftest :oodml/update-records/2
            (values
             (employee-email
              (car (clsql:select 'employee
                                 :where [= [slot-value 'employee 'emplid] 1]
                                 :flatp t
                                 :caching nil)))
             (progn
               (setf (slot-value employee1 'email) "lenin-nospam@soviet.org")
               (clsql:update-record-from-slot employee1 'email)
               (employee-email
                (car (clsql:select 'employee
                                   :where [= [slot-value 'employee 'emplid] 1]
                                   :flatp t
                                   :caching nil))))
             (progn
               (setf (slot-value employee1 'email) "lenin@soviet.org")
               (clsql:update-record-from-slot employee1 'email)
               (employee-email
                (car (clsql:select 'employee
                                   :where [= [slot-value 'employee 'emplid] 1]
                                   :flatp t
                                   :caching nil)))))
          "lenin@soviet.org" "lenin-nospam@soviet.org" "lenin@soviet.org")

        ;; tests update-record-from-slots
        (deftest :oodml/update-records/3
            (values
             (let ((lenin (car (clsql:select 'employee
                                             :where [= [slot-value 'employee 'emplid]
                                                       1]
                                             :flatp t
                                             :caching nil))))
               (concatenate 'string
                            (first-name lenin)
                            " "
                            (last-name lenin)
                            ": "
                            (employee-email lenin)))
             (progn
               (setf (slot-value employee1 'first-name) "Dimitriy"
                     (slot-value employee1 'last-name) "Ivanovich"
                     (slot-value employee1 'email) "ivanovich@soviet.org")
               (clsql:update-record-from-slots employee1 '(first-name last-name email))
               (let ((lenin (car (clsql:select 'employee
                                               :where [= [slot-value 'employee 'emplid]
                                                         1]
                                               :flatp t
                                               :caching nil))))
                 (concatenate 'string
                              (first-name lenin)
                              " "
                              (last-name lenin)
                              ": "
                              (employee-email lenin))))
             (progn
               (setf (slot-value employee1 'first-name) "Vladimir"
                     (slot-value employee1 'last-name) "Lenin"
                     (slot-value employee1 'email) "lenin@soviet.org")
               (clsql:update-record-from-slots employee1 '(first-name last-name email))
               (let ((lenin (car (clsql:select 'employee
                                               :where [= [slot-value 'employee 'emplid]
                                                         1]
                                               :flatp t
                                               :caching nil))))
                 (concatenate 'string
                              (first-name lenin)
                              " "
                              (last-name lenin)
                              ": "
                              (employee-email lenin)))))
          "Vladimir Lenin: lenin@soviet.org"
          "Dimitriy Ivanovich: ivanovich@soviet.org"
          "Vladimir Lenin: lenin@soviet.org")

        ;; tests update-instance-from-records
        (deftest :oodml/update-instance/1
            (values
             (concatenate 'string
                          (slot-value employee1 'first-name)
                          " "
                          (slot-value employee1 'last-name)
                          ": "
                          (slot-value employee1 'email))
             (progn
               (clsql:update-records [employee]
                                     :av-pairs '(([first-name] "Ivan")
                                                 ([last-name] "Petrov")
                                                 ([email] "petrov@soviet.org"))
                                     :where [= [emplid] 1])
               (clsql:update-instance-from-records employee1)
               (concatenate 'string
                            (slot-value employee1 'first-name)
                            " "
                            (slot-value employee1 'last-name)
                            ": "
                            (slot-value employee1 'email)))
             (progn
               (clsql:update-records [employee]
                                     :av-pairs '(([first-name] "Vladimir")
                                                 ([last-name] "Lenin")
                                                 ([email] "lenin@soviet.org"))
                                     :where [= [emplid] 1])
               (clsql:update-instance-from-records employee1)
               (concatenate 'string
                            (slot-value employee1 'first-name)
                            " "
                            (slot-value employee1 'last-name)
                            ": "
                            (slot-value employee1 'email))))
          "Vladimir Lenin: lenin@soviet.org"
          "Ivan Petrov: petrov@soviet.org"
          "Vladimir Lenin: lenin@soviet.org")

        ;; tests update-slot-from-record
        (deftest :oodml/update-instance/2
            (values
             (slot-value employee1 'email)
             (progn
               (clsql:update-records [employee]
                                     :av-pairs '(([email] "lenin-nospam@soviet.org"))
                                     :where [= [emplid] 1])
               (clsql:update-slot-from-record employee1 'email)
               (slot-value employee1 'email))
             (progn
               (clsql:update-records [employee]
                                     :av-pairs '(([email] "lenin@soviet.org"))
                                     :where [= [emplid] 1])
               (clsql:update-slot-from-record employee1 'email)
               (slot-value employee1 'email)))
          "lenin@soviet.org" "lenin-nospam@soviet.org" "lenin@soviet.org")


        (deftest :oodml/do-query/1
            (let ((result '()))
              (clsql:do-query ((e) [select 'employee :order-by [emplid]])
                (push (slot-value e 'last-name) result))
              result)
          ("Putin" "Yeltsin" "Gorbachev" "Chernenko" "Andropov" "Brezhnev" "Kruschev"
           "Trotsky" "Stalin" "Lenin"))

        (deftest :oodml/do-query/2
            (let ((result '()))
              (clsql:do-query ((e c) [select 'employee 'company
                                             :where [= [slot-value 'employee 'last-name]
                                                       "Lenin"]])
                (push (list (slot-value e 'last-name) (slot-value c 'name))
                      result))
              result)
          (("Lenin" "Widgets Inc.")))

        (deftest :oodml/map-query/1
            (clsql:map-query 'list #'last-name [select 'employee :order-by [emplid]])
          ("Lenin" "Stalin" "Trotsky" "Kruschev" "Brezhnev" "Andropov" "Chernenko"
           "Gorbachev" "Yeltsin" "Putin"))

        (deftest :oodml/map-query/2
            (clsql:map-query 'list #'(lambda (e c) (list (slot-value e 'last-name)
                                                         (slot-value c 'name)))
             [select 'employee 'company :where [= [slot-value 'employee 'last-name]
                                                  "Lenin"]])
          (("Lenin" "Widgets Inc.")))

        (deftest :oodml/iteration/3
            (loop for (e) being the records in
             [select 'employee :where [< [emplid] 4] :order-by [emplid]]
             collect (slot-value e 'last-name))
          ("Lenin" "Stalin" "Trotsky"))


      (deftest :oodml/cache/1
          (progn
            (setf (clsql-sys:record-caches *default-database*) nil)
            (let ((employees (select 'employee)))
              (every #'(lambda (a b) (eq a b))
                     employees (select 'employee))))
        t)

        (deftest :oodml/cache/2
            (let ((employees (select 'employee)))
              (equal employees (select 'employee :flatp t)))
          nil)

        (deftest :oodml/refresh/1
            (let ((addresses (select 'address)))
              (equal addresses (select 'address :refresh t)))
          t)

        (deftest :oodml/refresh/2
            (let* ((addresses (select 'address :order-by [addressid] :flatp t :refresh t))
                   (city (slot-value (car addresses) 'city)))
              (clsql:update-records [addr]
                              :av-pairs '((city_field "A new city"))
                              :where [= [addressid] (slot-value (car addresses) 'addressid)])
              (let* ((new-addresses (select 'address :order-by [addressid] :refresh t :flatp t))
                     (new-city (slot-value (car addresses) 'city))
)
                (clsql:update-records [addr]
                                      :av-pairs `((city_field ,city))
                                      :where [= [addressid] (slot-value (car addresses) 'addressid)])
                (values (equal addresses new-addresses)
                        city
                        new-city)))
          t "Leningrad" "A new city")

        (deftest :oodml/refresh/3
            (let* ((addresses (select 'address :order-by [addressid] :flatp t)))
              (values
               (equal addresses (select 'address :refresh t :flatp t))
               (equal addresses (select 'address :flatp t))))
          nil nil)

        (deftest :oodml/refresh/4
            (let* ((addresses (select 'address :order-by [addressid] :flatp t :refresh t))
                   (*db-auto-sync* t))
              (make-instance 'address :addressid 1000 :city "A new address city")
              (let ((new-addresses (select 'address :order-by [addressid] :flatp t :refresh t)))
                (delete-records :from [addr] :where [= [addressid] 1000])
                (values
                 (length addresses)
                 (length new-addresses)
                 (eq (first addresses) (first new-addresses))
                 (eq (second addresses) (second new-addresses)))))
          2 3 t t)


        (deftest :oodml/uoj/1
            (progn
              (let* ((dea-list (select 'deferred-employee-address :caching nil :order-by ["ea_join" aaddressid]
                                       :flatp t))
                     (dea-list-copy (copy-seq dea-list))
                     (initially-unbound (every #'(lambda (dea) (not (slot-boundp dea 'address))) dea-list)))
                (update-objects-joins dea-list)
                (values
                 initially-unbound
                 (equal dea-list dea-list-copy)
                 (every #'(lambda (dea) (slot-boundp dea 'address)) dea-list)
                 (every #'(lambda (dea) (typep (slot-value dea 'address) 'address)) dea-list)
                 (mapcar #'(lambda (dea) (slot-value (slot-value dea 'address) 'addressid)) dea-list))))
          t t t t (1 1 2 2 2))

        ;; update-object-joins needs to be fixed for multiple keys
        #+ignore
        (deftest :oodml/uoj/2
            (progn
              (clsql:update-objects-joins (list company1))
              (mapcar #'(lambda (e)
                          (slot-value e 'ecompanyid))
                 (company-employees company1)))
          (1 1 1 1 1 1 1 1 1 1))

        (deftest :oodml/big/1
            (let ((objs (clsql:select 'big :order-by [i] :flatp t)))
              (values
               (length objs)
               (do ((i 0 (1+ i))
                    (max (expt 2 60))
                    (rest objs (cdr rest)))
                   ((= i (length objs)) t)
                 (let ((obj (car rest))
                       (index (1+ i)))
                   (unless (and (eql (slot-value obj 'i) index)
                                (eql (slot-value obj 'bi) (truncate max index)))
                     (print index)
                     (describe obj)
                     (return nil))))))
          555 t)

        (deftest :oodml/db-auto-sync/1
            (values
              (progn
                (make-instance 'employee :emplid 20 :groupid 1
                               :last-name "Ivanovich")
                (select [last-name] :from [employee] :where [= [emplid] 20]
                        :flatp t :field-names nil))
             (let ((*db-auto-sync* t))
               (make-instance 'employee :emplid 20 :groupid 1
                              :last-name "Ivanovich")
               (prog1 (select [last-name] :from [employee] :flatp t
                              :field-names nil
                              :where [= [emplid] 20])
                 (delete-records :from [employee] :where [= [emplid] 20]))))
          nil ("Ivanovich"))

        (deftest :oodml/db-auto-sync/2
            (values
             (let ((instance (make-instance 'employee :emplid 20 :groupid 1
                                            :last-name "Ivanovich")))
               (setf (slot-value instance 'last-name) "Bulgakov")
               (select [last-name] :from [employee] :where [= [emplid] 20]
                       :flatp t :field-names nil))
             (let* ((*db-auto-sync* t)
                    (instance (make-instance 'employee :emplid 20 :groupid 1
                                             :last-name "Ivanovich")))
               (setf (slot-value instance 'last-name) "Bulgakov")
               (prog1 (select [last-name] :from [employee] :flatp t
                              :field-names nil
                              :where [= [emplid] 20])
                 (delete-records :from [employee] :where [= [emplid] 20]))))
          nil ("Bulgakov"))

        (deftest :oodml/setf-slot-value/1
            (let* ((*db-auto-sync* t)
                   (instance (make-instance 'employee :emplid 20 :groupid 1)))
              (prog1
                  (setf
                   (slot-value instance 'first-name) "Mikhail"
                   (slot-value instance 'last-name) "Bulgakov")
                (delete-records :from [employee] :where [= [emplid] 20])))
          "Bulgakov")

        (deftest :oodml/float/1
            (let* ((emp1 (car (select 'employee
                                      :where [= [slot-value 'employee 'emplid]
                                                1]
                                      :flatp t
                                      :caching nil)))
                   (height (slot-value emp1 'height)))
              (prog1
                  (progn
                    (setf (slot-value emp1 'height) 1.0E0)
                    (clsql:update-record-from-slot emp1 'height)
                    (= (car (clsql:select [height] :from [employee]
                                          :where [= [emplid] 1]
                                          :flatp t
                                          :field-names nil))
                       1))
                (setf (slot-value emp1 'height) height)
                (clsql:update-record-from-slot emp1 'height)))
         t)

        (deftest :oodml/float/2
            (let* ((emp1 (car (select 'employee
                                     :where [= [slot-value 'employee 'emplid]
                                               1]
                                     :flatp t
                                     :caching nil)))
                   (height (slot-value emp1 'height)))
              (prog1
                  (progn
                    (setf (slot-value emp1 'height) 1.0S0)
                    (clsql:update-record-from-slot emp1 'height)
                    (= (car (clsql:select [height] :from [employee]
                                          :where [= [emplid] 1]
                                          :flatp t
                                          :field-names nil))
                       1))
                (setf (slot-value emp1 'height) height)
                (clsql:update-record-from-slot emp1 'height)))
         t)

        (deftest :oodml/float/3
            (let* ((emp1 (car (select 'employee
                                     :where [= [slot-value 'employee 'emplid]
                                               1]
                                     :flatp t
                                     :caching nil)))
                   (height (slot-value emp1 'height)))
              (prog1
                  (progn
                    (setf (slot-value emp1 'height) 1.0F0)
                    (clsql:update-record-from-slot emp1 'height)
                    (= (car (clsql:select [height] :from [employee]
                                          :where [= [emplid] 1]
                                          :flatp t
                                          :field-names nil))
                       1))
                (setf (slot-value emp1 'height) height)
                (clsql:update-record-from-slot emp1 'height)))
          t)

        (deftest :oodml/float/4
            (let* ((emp1 (car (select 'employee
                                     :where [= [slot-value 'employee 'emplid]
                                               1]
                                     :flatp t
                                     :caching nil)))
                   (height (slot-value emp1 'height)))
              (prog1
                  (progn
                    (setf (slot-value emp1 'height) 1.0D0)
                    (clsql:update-record-from-slot emp1 'height)
                    (= (car (clsql:select [height] :from [employee]
                                          :where [= [emplid] 1]
                                          :flatp t
                                          :field-names nil))
                       1))
                (setf (slot-value emp1 'height) height)
                (clsql:update-record-from-slot emp1 'height)))
         t)

        (deftest :oodml/float/5
            (let* ((emp1 (car (select 'employee
                                      :where [= [slot-value 'employee 'emplid]
                                                1]
                                      :flatp t
                                      :caching nil)))
                   (height (slot-value emp1 'height)))
              (prog1
                  (progn
                    (setf (slot-value emp1 'height) 1.0L0)
                    (clsql:update-record-from-slot emp1 'height)
                    (= (car (clsql:select [height] :from [employee]
                                          :where [= [emplid] 1]
                                          :flatp t
                                          :field-names nil))
                       1))
                (setf (slot-value emp1 'height) height)
                (clsql:update-record-from-slot emp1 'height)))
         t)

        ))



#.(clsql:restore-sql-reader-syntax-state)
