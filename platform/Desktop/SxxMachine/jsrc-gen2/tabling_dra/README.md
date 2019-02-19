# tabling
Port to SWI-Prolog's C @ https://github.com/logicmoo/swipl-devel-unstable/   for the "dra" memoizing interpreter 


   General description  Written by Feliks Kluzniak at UTD (January 2009).
   -------------------

   A simple (and very inefficient) interpreter that emulates "top-down tabled
   programming", as described in

     [1] Hai-Feng Guo, Gopal Gupta:
         Tabled Logic Programming with Dynamic Ordering of Alternatives
         (17th ICLP, 2001)

   There are two significant changes with respect to the description in the
   paper:

       - A tabled goal will never produce the same answer twice.

         More specifically: two answers will never be variants of each other.
         Please note that "goal" means a goal instance.

       - By default, new answers for a tabled goal will be produced before
         old answers.  The user can reverse the order by means of an "old_first"
         directive.

         Here, "new answer for a tabled goal" means an answer that has not yet
         been seen (and tabled) for a variant of the goal.

         The default behaviour is intended to help computations converge more
         quickly.  The user is given an option to change it, because some
         predicates may produce a very large (even infinite) set of answers on
         backtracking, and the application might not require those answers.

   The terminology has been modified under the influence of

     [2] Neng-Fa Zhou, Taisuke Sato, Yi-Dong Shen:
         Linear Tabling Strategies and Optimizations
         (TPLP 2008 (?))

   More specifically, "masters" are called "pioneers" (although in a sense
   somewhat different than in [2]: we use "pioneer" for "topmost looping goal"),
   and "strongly connected components" are called "clusters".

   Note that "clusters" are detected dynamically, to achieve greater precision
   (a dependency graph among static calls can only be a rough approximation, a
   dependency graph among predicates is rougher still).


   Nomenclature
   ------------

   Some predicates are "tabled", because the user has declared them to be such
   by using an appropriate directive, e.g.,

       :- table p/2 .

   All calls to a tabled predicate that are present in the interpreted program
   are called "tabled calls".  Instances of such calls are called "tabled
   goals".  In general, we will use the term "call" to refer to a static entity
   in the program, and "goal" to refer to an instance of a call.  We will also
   avoid the conventional overloading of the term "goal" in yet another way: we
   will call a sequence (i.e., conjunction) of goals just that (unless we can
   refer to it as a "query" or a "resolvent").

   Similarly, the user can declare a predicate to be "coinductive", by using
   another kind of directive, e.g.,

       :- coinductive0  p/2 .
       :- coinductive1 q/3 .

   Calls and goals that refer to a coinductive predicate will also be called
   "coinductive".



   Data structures
   ---------------

   The interpreter uses a number of tables that store information accumulated
   during a computation.  A computation consists in reading a program and
   executing a number of queries.  A query is a sequence (i.e., conjunction) of
   goals.

   The tables (implemented as dynamic predicates of Prolog) are:


   -- is_coinductive0( generic head )
   -- is_coinductive1( generic head )
   -- is_tabled( generic head )
   -- is_old_first( generic head )

           Each of these tables contains an entry for each predicate that has
           been declared as having the corresponding property (i.e., as
           coinductive, table etc.).  For instance, when the interpreter reads
               :- coinductive0 p/2 .
           it stores the fact
               is_coinductive0( p( _, _ ) ).

           A "coinductive0" declaration is deemed to supersede "coinductive1",
           and information about a predicate that has been so declared is stored
           both in coinductive0/1 and coinductive1/1.

           These tables are cleared only before reading in a new program.



	HOWTO
	---------------

  NOTE:
 
    1.    :- use_module(library(dra)).
 
    2. The interpreter supports a number of directives:
 
       a) Tabled and coinductive predicates should be declared as such in
          the program file, e.g.,
              :- table       ancestor/2.
              :- coinductive0  comember/2.
              :- coinductive1 comember/2.
 
          "coinductive1" means that if there are coinductive hypotheses
          with which a goal unifies, then the usual clauses will not be tried
          after the hypotheses are exhausted (this is "new style"
          coinduction).
 
       b) To include files use the usual Prolog syntax:
              :- [ file1, file2, ... ].
 
       c) To declare predicates used in an interpreted program as dynamic,
          use
              :- dynamic p/k.
 
       d) By default, a goal produces new (i.e., heretofore unknown) answers
          before producing old ones.  To reverse this behaviour, use
 
              :- old_first p/k.
          or
              :- old_first all.
 
       e) To produce a wallpaper traces use the traces directive. For example,
 
              :- traces p/3, q/0, r/1.
 
          will traces predicates "p/3", "q/0" and "r/1".  If you want to traces
          everything, use
 
              :- traces all.
 
          These directives are cumulative.
 
       f) To print out subsets of the current answer table, use
 
              :- answers( Goal, Pattern ).
 
          this will print all tabled answers that are associated with a
          variant of Goal and unifiable with Pattern.
          To get a dump of the entire table, use just
 
              :- answers( _, _ ).
 
    2. The program should contain no other directives. It may, however,
       contain queries, which will be executed immediately upon reading.
 
    3. Just before the result of a query is reported, the interpreter
       produces a printout with statistics accummulated since the previous
       printout (or since the beginning, if this is the first printout during
       this session with the interpreted program). The printout looks like
       this:
 
           [K steps, M new answers tabled (N in all)]
 
       where K, M and N are some natural numbers. K is the number of
       evaluated goals, M is the number of new additions to the answer table,
       N is the current size of the answer table.
 
    4. If the program invokes a built-in predicate, that predicate dra_must
       be declared in the table "is_never_tabled/1" (see file "dra_builtins.pl").
       Every addition should be considered carefully: some built-ins might
       require special treatment by the interpreter.
 
    5. The program may contain clauses that modify the definition of the
       interpreter's predicate "essence_hook/2" (the clauses will be asserted
       at the front of the predicate, and will thus override the default
       definition for some cases).  The default definition is
 
          essence_hook( T, T ).
 
       This predicate is invoked _in certain contexts_ when:
          - two terms are about to be compared (either for equality or to
            check whether they are variants of each other);
          - an answer is tabled;
          - an answer is retrieved from the table.
 
       The primary intended use is to suppress arguments that carry only
       administrative information and that may differ in two terms that are
       "semantically" equal or variants of each other. (Such, for example, is
       the argument that carries the set of coinductive hypotheses in a
       co-logic program translated into Prolog: see "../coind/translate_clp".
       Mind you, that translation need not be applied to programs executed by
       this interpreter).
 
       For example, the presence of
 
          essence_hook( p( A, B, _ ),  p( A, B ) ).
 
       will result in "p( a, b, c )" and "p( a, b, d )" being treated as
       identical, as each of them will be translated to "p( a, b )" before
       comparison.
 
       NOTE: This facility should be used with the utmost caution, as it
             may drastically affect the semantics of the interpreted program
             in a fashion that would be hard to understand for someone who
             does not understand the details of the interpreter.

 
     The top level notes "never_tabled" declarations in the table "is_never_tabled".
        For example,
 
            :- never_tabled p/1, q/2.
 
        will be stored as
 
            is_never_tabled( p( _ ) ).
            is_never_tabled( q( _, _ ) ).
 
        The intended meaning is that "never_tabled" predicates do not make use
        (directly or indirectly) of the special features provided by the
        metainterpreter, so their invocations can be handled just by handing
        them over to Prolog (which would presumably speed up the computation).
 
        Please note that the never_tabled predicates (which should be defined in
        files mentioned in ":- load_is_support( filename )." directives) are
        compiled into the module "never_tabled" (unless they are defined within
        other modules).
 
 
     The metainterpreter should provide the following predicates
        ("hooks") that will be called by the top level:
 
           - is_cuts_ok/1:
                  Defines patterns for built-in predicates from the host
                  system that can be invoked by the interpreted program.
                  For example, to allow writeln/2, declare:
                      is_cuts_ok( writeln( _, _ ) ).

           - initialise/0:
                  This will be called before loading a new program,
                  giving the metainterpreter an opportunity to
                  (re)initialise its data structures.

 
           - process_dra_ective/1:
                  Whenever the top level encounters a legal directive
                  ":- D" (see above), it invokes "process_directive( D )"
                  to give the interpreter a chance to act upon the
                  directive.
 
           - dra_interp/1:
                  This would be the main entry point of the metainterpreter.
                  Whenever the top level encounters a query (of the form
                  "?- Q."), it will display the query and then call
                  "dra_call_interp( Q )".  Depending on the result, it will then
                  display "No", or "Yes" (preceded by a display of bindings
                  acquired by the variables occurring in "Q"); in the latter
                  case it will also backtrack to obtain more solutions.
 

# Some TODOs

Document this pack!

Write tests

Untangle the 'pack' install deps 
(Moving predicates over here from logicmoo_base)


# Not _obligated_ to maintain a git fork just to contribute

Dislike having tons of forks that are several commits behind the main git repo?

Be old school - Please ask to be added to TeamSPoon and Contribute directly !

Still, we wont stop you from doing it the Fork+PullRequest method

# [BSD 2-Clause License](LICENSE.md)

Copyright (c) 2017, 
TeamSPoon and Douglas Miles <logicmoo@gmail.com> 
All rights reserved.


