;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; ======================================================================
;;;; File:    test-syntax.lisp
;;;; Author:  Marcus Pearce <m.t.pearce@city.ac.uk>
;;;; Created: 30/03/2004
;;;; Updated: $Id$
;;;; ======================================================================
;;;;
;;;; Description ==========================================================
;;;; ======================================================================
;;;;
;;;; Tests for the CLSQL Symbolic SQL syntax.
;;;;
;;;; ======================================================================

(in-package #:clsql-tests)

#.(clsql:locally-enable-sql-reader-syntax)


(setq *rt-syntax*
      '(

(deftest :syntax/generic/1
    (clsql:sql "foo")
  "'foo'")

(deftest :syntax/generic/2
    (clsql:sql 23)
  "23")

(deftest :syntax/generic/3
    (clsql:sql 'bar)
  "BAR")

(deftest :syntax/generic/4
    (clsql:sql '("ten" 10 ten))
  "('ten',10,TEN)")

(deftest :syntax/generic/5
    (clsql:sql ["SELECT FOO,BAR FROM BAZ"])
  "SELECT FOO,BAR FROM BAZ")

(deftest :syntax/generic/6
    (clsql:sql "What's up Doc?")
  "'What''s up Doc?'")

(deftest :syntax/ident/1
    (clsql:sql [foo])
  "FOO")

(deftest :syntax/ident/2
    (clsql:sql [foo bar])
  "FOO.BAR")

(deftest :syntax/ident/3
    (clsql:sql [foo :integer])
  "FOO")

(deftest :syntax/ident/4
    (clsql:sql [foo bar :integer])
  "FOO.BAR")

(deftest :syntax/ident/5
    (clsql:sql [foo "bar"])
    "FOO \"bar\"")

(deftest :syntax/ident/6
    (clsql:sql ["foo" bar])
 "\"foo\".BAR")

(deftest :syntax/ident/7
    (clsql:sql ["foo" bar :integer])
 "\"foo\".BAR")


(deftest :syntax/attribute/1
    (clsql:sql (clsql:sql-expression :table 'foo :attribute 'bar))
  "FOO.BAR")

(deftest :syntax/attribute/2
    (clsql:sql (clsql:sql-expression :table 'foo :attribute "bar"))
  "FOO.\"bar\"")

(deftest :syntax/attribute/3
    (clsql:sql (clsql:sql-expression :table "foo" :attribute 'bar))
  "\"foo\".BAR")

(deftest :syntax/attribute/4
    (clsql:sql (clsql:sql-expression :table "foo" :attribute "bar"))
  "\"foo\".\"bar\"")


(deftest :syntax/subquery/1
    (clsql:sql [any '(3 4)])
 "ANY((3,4))")

(deftest :syntax/subquery/2
    (clsql:sql [in [foo] '(foo bar baz)])
  "(FOO IN (FOO,BAR,BAZ))")

(deftest :syntax/subquery/3
    (clsql:sql [all '(foo bar baz)])
  "ALL((FOO,BAR,BAZ))")

(deftest :syntax/subquery/4
    (clsql:sql [exists '(foo bar baz)])
  "EXISTS((FOO,BAR,BAZ))")

(deftest :syntax/subquery/5
    (clsql:sql [some '(foo bar baz)])
  "SOME((FOO,BAR,BAZ))")


(deftest :syntax/aggregate/1
    (clsql:sql [max [+ [foo] [* 1000 [bar]]]])
 "MAX((FOO + (1000 * BAR)))")

(deftest :syntax/aggregate/2
    (clsql:sql [avg [+ [foo] [* 1000 [bar]]]])
 "AVG((FOO + (1000 * BAR)))")

(deftest :syntax/aggregate/3
    (clsql:sql [min [+ [foo] [* 1000 [bar]]]])
 "MIN((FOO + (1000 * BAR)))")

(deftest :syntax/aggregate/4
    (clsql:sql [sum [foo] [bar]])
 "SUM(FOO,BAR)")

(deftest :syntax/aggregate/5
    (clsql:sql [count [foo]])
 "COUNT(FOO)")


(deftest :syntax/logical/1
    (clsql:sql [and [foo] [bar]])
  "(FOO AND BAR)")

(deftest :syntax/logical/2
    (clsql:sql [or [foo] [bar]])
  "(FOO OR BAR)")

(deftest :syntax/logical/3
    (clsql:sql [not [foo]])
  "(NOT (FOO))")


(deftest :syntax/null/1
    (clsql:sql [null [foo]])
  "(FOO IS NULL)")

(deftest :syntax/null/2
    (clsql:sql [not [null [foo]]])
  "(NOT ((FOO IS NULL)))")

(deftest :syntax/null/3
    (clsql:sql [null])
  "NULL")

(deftest :syntax/null/4
    (clsql:sql [not [null]])
  "(NOT (NULL))")



(deftest :syntax/relational/1
    (clsql:sql [> [baz] [beep]])
  "(BAZ > BEEP)")

(deftest :syntax/relational/2
    (let ((x 10))
      (clsql:sql [> [foo] x]))
  "(FOO > 10)")

(deftest :syntax/relational/3
    (clsql:sql [>= [baz] [beep]])
  "(BAZ >= BEEP)")

(deftest :syntax/relational/4
    (clsql:sql [< [baz] [beep]])
  "(BAZ < BEEP)")

(deftest :syntax/relational/5
    (clsql:sql [= [baz] [beep]])
  "(BAZ = BEEP)")

(deftest :syntax/relational/6
    (clsql:sql [<> [baz] [beep]])
  "(BAZ <> BEEP)")


(deftest :syntax/between/1
    (clsql:sql [between [- [foo] 1] [* [bar] 5] [/ [baz] 9]])
  "(FOO - 1) BETWEEN (BAR * 5) AND (BAZ / 9)")

(deftest :syntax/between/2
    (clsql:sql [not [between [- [foo] 1] [* [bar] 5] [/ [baz] 9]]])
  "(NOT ((FOO - 1) BETWEEN (BAR * 5) AND (BAZ / 9)))")


(deftest :syntax/arithmetic/1
    (clsql:sql [+ [foo bar] [baz]])
 "(FOO.BAR + BAZ)")

(deftest :syntax/arithmetic/2
    (clsql:sql [- [foo bar] [baz]])
 "(FOO.BAR - BAZ)")

(deftest :syntax/arithmetic/3
    (clsql:sql [/ [foo bar] [baz]])
 "(FOO.BAR / BAZ)")

(deftest :syntax/arithmetic/4
    (clsql:sql [* [foo bar] [baz]])
 "(FOO.BAR * BAZ)")

(deftest :syntax/arithmetic/5
    (clsql:sql [- [foo bar]])
 "(- (FOO.BAR))")

(deftest :syntax/arithmetic/6
    (clsql:sql [* 2 3])
  "(2 * 3)")


(deftest :syntax/substr/1
    (clsql:sql [substr [hello] 1 4])
 "SUBSTR(HELLO,1,4)")

(deftest :syntax/substring/1
    (clsql:sql [substring [hello] 1 4])
 "SUBSTRING(HELLO,1,4)")


(deftest :syntax/concat/1
    (clsql:sql [|| [foo] [bar] [baz]])
 "(FOO || BAR || BAZ)")

(deftest :syntax/concat/2
    (clsql:sql [concat [foo] [bar]])
 "CONCAT(FOO,BAR)")


(deftest :syntax/pattern/1
    (clsql:sql [like [foo] "%v"])
  "(FOO LIKE '%v')")

(deftest :syntax/pattern/2
    (clsql:sql [not [like [foo] "%v"]])
  "(NOT ((FOO LIKE '%v')))")


(deftest :syntax/distinct/1
    (clsql:sql [distinct [foo bar :string]])
 "DISTINCT FOO.BAR")

(deftest :syntax/distinct/2
    (clsql:sql [distinct [foo :string] [bar :integer]])
 "DISTINCT FOO, BAR")


(deftest :syntax/order-by/1
    (clsql:sql [order-by [foo]])
 "ORDER BY FOO")

(deftest :syntax/group-by/1
    (clsql:sql [group-by [foo]])
 "GROUP BY FOO")

(deftest :syntax/group-by/2
    (clsql:sql
     (clsql-sys::make-query [foo] [bar] [count [foo]]
      :from [table]
      :group-by '([foo] [bar])
      :order-by '([foo] [bar])))
  "SELECT FOO,BAR,COUNT(FOO) FROM TABLE GROUP BY FOO,BAR ORDER BY FOO,BAR")


(deftest :syntax/coalesce/1
    (clsql:sql [coalesce [foo] [bar] "not specified"])
 "COALESCE(FOO,BAR,'not specified')")

(deftest :syntax/coalesce/2
    (clsql:sql [nvl [foo] "not specified"])
 "COALESCE(FOO,'not specified')")

(deftest :syntax/nvl/1
    (clsql:sql [nvl [foo] "not specified"])
 "COALESCE(FOO,'not specified')")



(deftest :syntax/sets/1
    (clsql:sql [union [select [foo] :from [bar]] [select [baz] :from [bar]]])
 "SELECT FOO FROM BAR UNION SELECT BAZ FROM BAR")

(deftest :syntax/sets/2
    (clsql:sql [intersect [select [foo] :from [bar]] [select [baz] :from [bar]]])
 "SELECT FOO FROM BAR INTERSECT SELECT BAZ FROM BAR")

(deftest :syntax/sets/3
    (clsql:sql [except [select [foo] :from [bar]] [select [baz] :from [bar]]])
 "SELECT FOO FROM BAR EXCEPT SELECT BAZ FROM BAR")

(deftest :syntax/sets/4
    (clsql:sql [minus [select [foo] :from [bar]] [select [baz] :from [bar]]])
 "SELECT FOO FROM BAR MINUS SELECT BAZ FROM BAR")


(deftest :syntax/function/1
    (clsql:sql [function "COS" [age]])
  "COS(AGE)")

(deftest :syntax/function/2
    (clsql:sql [function "TO_DATE" "02/06/99" "mm/DD/RR"])
  "TO_DATE('02/06/99','mm/DD/RR')")


(deftest :syntax/query/1
    (clsql:sql [select [person_id] [surname] :from [person]])
  "SELECT PERSON_ID,SURNAME FROM PERSON")

(deftest :syntax/query/2
    (clsql:sql [select [foo] [bar *]
                      :from '([baz] [bar])
                      :where [or [= [foo] 3]
                                 [> [baz.quux] 10]]])
  "SELECT FOO,BAR.* FROM BAZ,BAR WHERE ((FOO = 3) OR (BAZ.QUUX > 10))")

(deftest :syntax/query/3
    (clsql:sql [select [foo bar] [baz]
                      :from '([foo] [quux])
                      :where [or [> [baz] 3]
                                 [like [foo bar] "SU%"]]])
  "SELECT FOO.BAR,BAZ FROM FOO,QUUX WHERE ((BAZ > 3) OR (FOO.BAR LIKE 'SU%'))")

(deftest :syntax/query/4
    (clsql:sql [select [count [*]] :from [emp]])
  "SELECT COUNT(*) FROM EMP")


(deftest :syntax/expression/1
    (clsql:sql
     (clsql:sql-operation
      'select
      (clsql:sql-expression :table 'foo :attribute 'bar)
      (clsql:sql-expression :attribute 'baz)
      :from (list
             (clsql:sql-expression :table 'foo)
             (clsql:sql-expression :table 'quux))
      :where
      (clsql:sql-operation 'or
                          (clsql:sql-operation
                           '>
                           (clsql:sql-expression :attribute 'baz)
                           3)
                          (clsql:sql-operation
                           'like
                           (clsql:sql-expression :table 'foo
                                                :attribute 'bar)
                           "SU%"))))
  "SELECT FOO.BAR,BAZ FROM FOO,QUUX WHERE ((BAZ > 3) OR (FOO.BAR LIKE 'SU%'))")

(deftest :syntax/expression/2
    (clsql:sql
     (apply (clsql:sql-operator 'and)
            (loop for table in '(thistime nexttime sometime never)
                  for count from 42
                  collect
                  [function "BETWEEN"
                            (clsql:sql-expression :table table
                                                 :attribute 'bar)
                            (clsql:sql-operation '* [hip] [hop])
                            count]
                  collect
                  [like (clsql:sql-expression :table table
                                             :attribute 'baz)
                        (clsql:sql table)])))
  "(BETWEEN(THISTIME.BAR,(HIP * HOP),42) AND (THISTIME.BAZ LIKE 'THISTIME') AND BETWEEN(NEXTTIME.BAR,(HIP * HOP),43) AND (NEXTTIME.BAZ LIKE 'NEXTTIME') AND BETWEEN(SOMETIME.BAR,(HIP * HOP),44) AND (SOMETIME.BAZ LIKE 'SOMETIME') AND BETWEEN(NEVER.BAR,(HIP * HOP),45) AND (NEVER.BAZ LIKE 'NEVER'))")

))

#.(clsql:restore-sql-reader-syntax-state)
