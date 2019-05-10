/*****************************************************************
Time-stamp: <2008-10-29 10:41:19 banbara>

NAME
       pl2am: Translating Prolog into WAM-based Intermediate Code

USAGE
       # sicstus
       ?- [pl2am].
       ?- pl2am([File1, File2, [Op1,..,OpN]]).

PARAMETERS
       File1 is an input prolog file name.
       File2 is an output file name.
       Op    ::= ed | ac | ie | rc | idx | clo
          ed : eliminate disjunctions
          ac : arithmetic compilation
          ie : inline expansion
          rc : optimise recursive call
          idx: switch_on_hash (2nd. level indexing)
          clo: generate closure for meta predicates
          pif(folder): folder for writing package init predicates

DESCRIPTION
       This program translates Prolog program into WAM-based intermediate codes.
       Generated codes can be translated into Java program by using am2j.pl,
       and then compiled and executed by usual java utilities
       with the Prolog Cafe runtime system.

COPYRIGHT
       pl2am (Translating Prolog into WAM-based Intermediate Code)
       Copyright (C) 1997-2008 by
          Mutsunori Banbara (banbara@kobe-u.ac.jp) and
          Naoyuki Tamura (tamura@kobe-u.ac.jp)

SEE ALSO
       http://kaminari.istc.kobe-u.ac.jp/PrologCafe/
*****************************************************************/

/*****************************************************************
             WAM-BASED INTERMEDIATE INSTRUCTIONS

Put Instructions
================
  put_var(X)
  put_int(i, X)
  put_float(f, X)
  put_con(f/n, X)
  put_con(c, X),
  put_list(Xi, Xj, Xk)
  put_str(Xi, Y, Xj)
  put_str_args([Xi,..,Xn], Y)
  put_clo(p:G, X)
  put_cont(p:BinG, C)
  put_cont(BinG, C)

Get Instructions
================
  get_val(Xi, Xj)
  get_int(i, Xi, Xj)
  get_float(f, Xi, Xj)
  get_con(c, Xi, Xj)
  get_ground(g, Xi, Xj)
  get_list(X)
  get_str(f/n, Xi, Xj)

Unify Instructions
==================
  unify_var(X)
  unify_val(X)
  unify_int(i, X)
  unify_float(f, X)
  unify_con(c, X)
  unify_ground(g, X)
  unify_void(i)

Choice Instructions
===================
  try(Li, Lj)
  retry(Li, Lj)
  trust(L)

Indexing Instructions
=====================
  switch_on_term(Lv, Li, Lf, Lc, Ls, Ll)
  switch_on_hash(TAG, i, L, hashtable)

Control Instructions
====================
  execute(p:BinG)
  execute(BinG)
  inline(G)

Other Instructions
==================
  (:- G)

  comment(Message)
  debug(Message)
  info(Message)

  begin_predicate(p, f/n)
  end_predicate(p, f/n)

  import_package(p)
  import_package(p, f/n)

  main(f/n, public): [Instructions]
  main(f/n, non-public): [Instructions]
  L: [Instructions]

  label(L)
  deref(Ri, Rj)
  set(Ri, Rj)
  setB0
  goto(L)

  decl_term_vars([R1,...,Rn])
  decl_pred_vars([R1,...,Rn])

  new_hash(TAG, i)
  put_hash(X, L, TAG)

  static([Instructions])

Notation
********
  X ::= a(i) | S
  Y ::= y(i) | S
  S ::= s(i) | si(i) | sf(i)
  L ::= f/n | f/n+i | f/n+TAG | f/n+TAG+i | f/n+TAG+i+i
  TAG ::= var | int | flo | con | str | lis | top | sub | nil
  BinG ::= C | f(A1,..,An, C)
  G ::= f(A1,..,An)
  A ::= void | X
  C ::= cont | p(N)
  R ::= cont | econt | a(i) | arg(i) | ea(i)

*****************************************************************/

/*****************************************************************
  Declarations
*****************************************************************/
:- op(1170, xfx, (:-)).
:- op(1170, xfx, (-->)).
:- op(1170,  fx, (:-)).
:- op(1170,  fx, (?-)).
:- op( 500, yfx, (#)).

:- op(1150,  fx, (constant)).     % added by Augeo
:- op(1150,  fx, (dynamic)).
:- op(1150,  fx, (meta_predicate)).
:- op(1150,  fx, (package)).  % Prolog Cafe specific
:- op(1150,  fx, (public)).
:- op(1150,  fx, (import)).   % Prolog Cafe specific
:- op(1150,  fx, (include)).     % added by Augeo
:- op(1150,  fx, (mode)).
:- op(1150,  fx, (multifile)).
:- op(1150,  fx, (block)).
:- op(1150,  fx, (ifdef)).     % added by Augeo
:- op(1150,  fx, (ifndef)).     % added by Augeo
:- op(1150,  fx, (domain)).     % added by Augeo
:- op(1150,  fx, (database)).     % added by Augeo
:- op(1150,  fx, (include_resource)).     % added by Augeo

:- dynamic internal_clause/2.
:- dynamic internal_predicates/2.
:- dynamic dynamic_predicates/3.
:- dynamic database_call/1.
:- dynamic compiler_constant/2.
:- dynamic meta_predicates/3.
:- dynamic package_name/1.
:- dynamic public_predicates/2.
:- dynamic import_package/2.
:- dynamic internal_declarations/1.
:- dynamic file_name/1.
:- dynamic included_file/1.
:- dynamic dummy_clause_counter/1.
:- dynamic pl2am_flag/1.
:- dynamic fail_flag/0.  % used for generating label(fail/0) or not
:- dynamic skip_code/0. % used for conditional compilation
:- dynamic ifdef_flag/0. % used for conditional compilation
:- dynamic domain_definition/2.
:- dynamic file_base/1.
:- dynamic file_line/2.

% :- module('SxxMachine.compiler.pl2am', [main/0,pl2am/1]).
%package(_).
%:- package 'SxxMachine.compiler.pl2am'.

:- public main/0, pl2am/1.
/*****************************************************************
  Main
*****************************************************************/
main_pl2am :-
	read(X),
	pl2am(X).

pl2am([PrologFile, AsmFile, Opts]) :-
	read_in_program(PrologFile, Opts),
	open(AsmFile, write, Out),
	compile_all_predicates(Out),
	close(Out).
%pl2am(_).

/*****************************************************************
  Read in Program
*****************************************************************/
read_in_program(File, Opts) :-
	pl2am_preread(File, Opts),
	clause(file_name(F),_),
	read_in_file(F),
	pl2am_postread.

read_in_file(File):-
	build_file_name(File,F),
	open(F, read, In),
	repeat,
	  line_count(In, L),
	  assert_file_line(F,L),
	  read_clause_(In, X),
	  assert_clause(X),
	X == end_of_file,
	!,
	retractall(file_line(_,_)),
	close(In).

read_clause_(Stream, Clause):-
	catch(read(Stream, Clause),_,fail), % catch is necessary only for SWI prolg
	!.
read_clause_(_, _):-
	pl2am_error([]),
	fail.

%%% Pre-init
pl2am_preread(File, Opts) :-
	retractall(internal_clause(_,_)),
	retractall(internal_predicates(_,_)),
	retractall(dynamic_predicates(_,_,_)),
	retractall(database_call(_)),
	retractall(compiler_constant(_,_)),
	retractall(meta_predicates(_,_,_)),
	retractall(package_name(_)),
	retractall(public_predicates(_,_)),
	retractall(import_package(_,_)),
	retractall(internal_declarations(_)),
	retractall(file_name(_)),
	retractall(included_file(_)),
	retractall(dummy_clause_counter(_)),
	retractall(pl2am_flag(_)),
	retractall(fail_flag),
	retractall(skip_code),
	retractall(ifdef_flag),
	retractall(domain_definition(_, _)),
	assert(database_call('SxxMachine.builtin':call)),
	assert_file_name(File),
	assert(dummy_clause_counter(0)),
	assert_compile_opts(Opts),
	assert_default_decls.

assert_file_name(Directory/File):-
	!,
	assert(file_name(File)),
	assert(file_base(Directory)).

assert_file_name(File):-
	assert_file_name(''/File).

build_file_name(File,File):-
	clause(file_base(''),_),
	!.

build_file_name(File,File):-
	File = Package:ResourceName,
	!.

build_file_name(InFile,OutFile):-
	clause(file_base(Directory),_),
	list_to_string([Directory,'/',InFile],OutFile),
	!.

build_file_name(File,File).

assert_file_line(File,Line):-
	retractall(file_line(_,_)), %TODO keep stack of included
	assert(file_line(File,Line)).

assert_default_decls :-
	builtin_meta_predicates(Pred, Arity, Mode),
	assert(meta_predicates(Pred, Arity, Mode)),
	fail.
assert_default_decls.

assert_compile_opts([]) :- !.
assert_compile_opts([O|Os]) :-
	assert_copts(O),
	assert_compile_opts(Os).

assert_copts(O) :-
	clause(pl2am_flag(O), _),
	!.
assert_copts(O) :-
	copt_expr(O),
	!,
	assert(pl2am_flag(O)).
assert_copts(O) :-
	pl2am_error([O,is,an,invalid,option,for,pl2am]),
	fail.

copt_expr(ed).
copt_expr(ac).
copt_expr(ie).
copt_expr(rc).
copt_expr(rc(_,_)).
copt_expr(idx).
copt_expr(clo).
copt_expr(pif(_)).

%%% Post-init
pl2am_postread :-
	assert_import('SxxMachine.lang'),
	assert_import('SxxMachine.builtin'),
	assert_dummy_package,
	assert_dummy_public.

assert_dummy_package :-
	clause(package_name(_), _),
	!.
assert_dummy_package :-
	assert(package_name(user)).

assert_dummy_public :-
	clause(public_predicates(_,_), _),
	!.
assert_dummy_public :-
	assert(public_predicates(_,_)).

%%% Expand constants
expand_constants(InClause,OutClause):-
	atom(InClause),
	clause(compiler_constant(InClause,OutClause),_),
	!.
expand_constants(InClause,OutClause):-
	compound(InClause),
	InClause =.. InList,
	pl2am_maplist(expand_constants, InList, OutList),
	OutClause =.. OutList,
	!.
expand_constants(Clause,Clause):-!.

%%% Assert Clauses
assert_clause(end_of_file) :- !.
assert_clause((:- ifdef C)) :- !,
	assert_ifdef(C).
assert_clause((:- ifndef C)) :- !,
	assert_ifndef(C).
assert_clause((:- elsedef)) :- !,
	assert_elsedef.
assert_clause((:- enddef)) :- !,
	assert_enddef.
assert_clause(_):-
	clause(skip_code,_), !.
assert_clause((:- constant C)) :- !,
	assert_constant(C).
assert_clause(C):-
	expand_constants(C,EC),
	assert_clause_(EC).

assert_clause_((:- include F)):- !,
	assert_include_file(F).
assert_clause_((:- include_resource F)):- !,
	assert_include_file(F).
assert_clause_((:- database D)):- !,
	assert_database(D).
assert_clause_((:- dynamic G)) :- !,
	conj_to_list(G, G1),
	assert_dynamic_predicates(G1).
assert_clause_((:- domain D)) :- !,
	assert_domain_definition(D).
assert_clause_((:- module(M, PList))) :- !,
	assert_package(M),
	assert_public_predicates(PList).
assert_clause_((:- meta_predicate G)) :- !,
	conj_to_list(G, G1),
	assert_meta_predicates(G1).
assert_clause_((:- package G)) :- !,
	assert_package(G).
assert_clause_((:- public G)) :- !,
	conj_to_list(G, G1),
	assert_public_predicates(G1).
assert_clause_((:- import G)) :- !,
	assert_import(G).
assert_clause_((:- mode _G)) :- !,
	pl2am_message(['*** WARNING',mode,declaration,is,not,supported,yet]).
assert_clause_((:- multifile _G)) :- !,
	pl2am_message(['*** WARNING',multifile,declaration,is,not,supported,yet]).
assert_clause_((:- block _G)) :- !,
	pl2am_message(['*** WARNING',block,declaration,is,not,supported,yet]).
assert_clause_((:- G)) :- !,
	call(G),
	assert_declarations(G).
assert_clause_(('$init' :- InitBody)):-
	clause(pl2am_flag(pif(PackageInitFolder)),_),
	!,
	write_init(('$init' :- InitBody)).
assert_clause_((Head :- ;(Body1,Body2))):- !,
	assert_clause_((Head :- Body1)),
	assert_clause_((Head :- Body2)).
assert_clause_(Clause) :-
	preprocess(Clause, Cl),
	assert_cls(Cl).

%%% Constant Declaration
assert_constant(C):-
	C = (Name=_),
	clause(compiler_constant(Name,_),_),
	!,
	pl2am_error([compiler,constant,Name,is,already,defined]),
	fail.
assert_constant(C):-
	C = (Name=Value),
	assert(compiler_constant(Name,Value)),
	!.
assert_constant(C):-
	pl2am_error([C,is,an,invalid,constant,declaration]),
	fail.

%%% Conditional compilation
assert_ifdef(_):-
	clause(ifdef_flag,_),
	!,
	pl2am_error([nested,ifdef,are,not,supported]),
	fail.
assert_ifdef(C):-
	\+(clause(compiler_constant(C,_),_)),
	assert(skip_code).
assert_ifdef(_):-
	assert(ifdef_flag).

assert_ifndef(_):-
	clause(ifdef_flag,_),
	!,
	pl2am_error([nested,ifdef,are,not,supported]),
	fail.
assert_ifndef(C):-
	clause(compiler_constant(C,_),_),
	assert(skip_code).
assert_ifndef(_):-
	assert(ifdef_flag).

assert_elsedef:-
	clause(ifdef_flag,_),
	clause(skip_code,_),
	!,
	retractall(skip_code).
assert_elsedef:-
	clause(ifdef_flag,_),
	!,
	assert(skip_code).
assert_elsedef:-
	!,
	pl2am_error([elsedef,without,ifdef]),
	fail.

assert_enddef:-
	clause(ifdef_flag,_),
	!,
	retractall(skip_code),
	retractall(ifdef_flag).
assert_enddef:-
	!,
	pl2am_error([enddef,without,ifdef]),
	fail.

%%% Include files
assert_include_file(F):-
	clause(file_name(BaseFile),_),
	pl2am_resolve_file(BaseFile, F, IncludeFile),
	clause(included_file(IncludeFile),_),
	!.
assert_include_file(F):-
	clause(file_name(BaseFile),_),
	pl2am_resolve_file(BaseFile, F, IncludeFile),
	assert(included_file(IncludeFile)),
	retractall(file_name(_)),
	assert(file_name(IncludeFile)),
	read_in_file(IncludeFile),
	retractall(file_name(_)),
	assert(file_name(BaseFile)),
	!.
assert_include_file(F):-
	clause(file_name(BaseFile),_),
	pl2am_error([failed,to,include,file,F,in,BaseFile]),
	fail.

%%% Database declaration
assert_database(D):-
	D = (Name=_),
	clause(domain_definition(Name,_),_),
	!,
	pl2am_error([database,Name,is,already,defined]),
	fail.
assert_database(D):-
	D = (_=Value),
	assert_domain_definition(D),
	assert_database_dynamic(Value),
	!.
assert_database(D):-
	pl2am_error([D,is,an,invalid,database,definition]),
	fail.

assert_database_dynamic(;(Fact,Tail)):-
	!,
	assert_database_dynamic(Fact),
	assert_database_dynamic(Tail).

assert_database_dynamic(Fact):-
	functor(Fact,Name,Arity),
	assert_dynamic(Name/Arity).

%%% Dynamic Declaration
assert_dynamic_predicates([]) :- !.
assert_dynamic_predicates([G|Gs]) :-
	assert_dynamic(G),
	assert_dynamic_predicates(Gs).

assert_dynamic(G) :-
	\+ clause(package_name('SxxMachine.builtin'), _),
	G = F/A,
	functor(Head, F, A),
	system_predicate(Head),
	!,
	pl2am_error([can,not,redefine,builtin,predicate,F/A]),
	fail.
assert_dynamic(G) :-
	G = F/A,
	clause(dynamic_predicates(F,A,_), _), !.
assert_dynamic(G) :-
	G = F/A,
	clause(database_call(Call),_),
	assert(dynamic_predicates(F,A,Call)), !.
assert_dynamic(G) :-
	pl2am_error([G,is,an,invalid,dynamic,declaration]),
	fail.

%%% Domain definitions
assert_domain_definition(D):-
	D = (Name=_),
	clause(domain_definition(Name,_),_),
	!,
	pl2am_error([domain,Name,is,already,defined]),
	fail.
assert_domain_definition(D):-
	D = (Name=Value),
	assert(domain_definition(Name,Value)),
	!.
assert_domain_definition(D):-
	pl2am_error([D,is,an,invalid,domain,definition]),
	fail.

%%% Meta Predicates Declaration
assert_meta_predicates([]) :- !.
assert_meta_predicates([G|Gs]) :-
	assert_meta(G),
	assert_meta_predicates(Gs).

assert_meta(G) :-
	functor(G, F, A),
	clause(meta_predicates(F, A, _), _),
	!.
assert_meta(G) :-
	functor(G, F, A),
	G =.. [_|M],
	mode_expr(M),
	!,
	assert(meta_predicates(F, A, M)).
assert_meta(G) :-
	pl2am_error([G,is,an,invalid,meta_predicate,declaration]),
	fail.

%%% Package Declaration
assert_package(G) :-
	clause(package_name(G1), _),
	G \== G1,
	!,
	pl2am_error([duplicate,package,declarations,:,G1,and,G]),
	fail.
assert_package(G) :-
	atom(G),
	!,
	assert(package_name(G)),
	retractall(import_package(G, _)).
assert_package(G) :-
	pl2am_error([G,is,invalid,package,declaration]),
	fail.

%%% Public Declaration
assert_public_predicates([]) :- !.
assert_public_predicates([G|Gs]) :-
	assert_public(G),
	assert_public_predicates(Gs).

assert_public(F/A) :-
	predspec_expr(F/A),
	clause(public_predicates(F, A), _),
	!.
assert_public(F/A) :-
	predspec_expr(F/A),
	assert(public_predicates(F, A)).

%%% Import Declaration
assert_import(G) :-
	atom(G),
	!,
	assert_impt(G, (*)).
assert_import(M:P) :-
	atom(M),
	(predspec_expr(P) ; atom(P)),
	!,
	assert_impt(M, P).
assert_import(G) :-
	pl2am_error([G,is,invalid,import,declaration]),
	fail.

assert_impt(M, _P) :-
	clause(package_name(M), _),
	!.
assert_impt(M, P) :-
	clause(import_package(M, P0), _),
	(P0 == (*) ; P0 == P),
	!.
assert_impt(M, P) :-
	assert(import_package(M, P)).

%%% Assert Declaration (:- G)
assert_declarations(G) :-
	clause(internal_declarations(G), _),
	!.
assert_declarations(G) :-
	assert(internal_declarations(G)).

%%% Assert Cluase
assert_cls((Head :- Body)) :- !,
	assert_predicate(Head),
	assert(internal_clause(Head, Body)).
assert_cls(Head) :- !,
	assert_predicate(Head),
	assert(internal_clause(Head, true)).

assert_predicate(Head) :-
	\+ clause(package_name('SxxMachine.builtin'), _),
	system_predicate(Head),
	!,
	functor(Head, Functor, Arity),
	pl2am_error([can,not,redefine,builtin,predicate,Functor/Arity]),
	fail.
assert_predicate(Head) :-
	functor(Head, Functor, Arity),
	clause(internal_predicates(Functor, Arity), _),
	!.
assert_predicate(Head) :-
	functor(Head, Functor, Arity),
	assert(internal_predicates(Functor, Arity)).

%%% Preprocess
preprocess(Cl0, Cl) :-
	clause(pl2am_flag(ed), _),
	!,
	expand_term(Cl0, Cl1),
	eliminate_disjunction(Cl1, Cl).
preprocess(Cl0, Cl) :-
	expand_term(Cl0, Cl).

eliminate_disjunction(Cl0, Cl) :-
	eliminate_disj(Cl0, Cl, DummyCls),
	assert_dummy_clauses(DummyCls).

assert_dummy_clauses([]) :- !.
assert_dummy_clauses([C|Cs]) :-
	assert_clause(C),
	assert_dummy_clauses(Cs).

/*****************************************************************
  Compile Prolog Program
*****************************************************************/
compile_all_predicates(Out) :- % output declarations (ex. op/3)
	clause(internal_declarations(G), _),
	writeq(Out, (:- G)), write(Out, '.'), nl(Out),
	fail.
compile_all_predicates(_) :-   % treat dynamic declaration
	findall(Functor/Arity, dynamic_predicates(Functor, Arity, 'SxxMachine.builtin':call), PredSpecs),
	assert_init_clauses(PredSpecs),
	fail.
compile_all_predicates(Out) :- % compile predicate
	clause(internal_predicates(Functor, Arity), _),
	compile_predicate(Functor, Arity, Instructions, []),
	write_asm(Out, Instructions),
	nl(Out),
	fail.
compile_all_predicates(Out) :- write_domain_definitions(Out).
compile_all_predicates(Out) :- nl(Out).

write_asm(_, []) :- !.
write_asm(Out, [Instruction|Instructions]) :- !,
	write_asm(Out, Instruction),
	write_asm(Out, Instructions).
write_asm(Out, begin_predicate(P, FA)) :- !,
	writeq(Out, begin_predicate(P, FA)), write(Out, '.'), nl(Out).
write_asm(Out, end_predicate(P, FA)) :- !,
	writeq(Out, end_predicate(P, FA)), write(Out, '.'), nl(Out).
write_asm(Out, comment(Comment0)) :- !,
	copy_term(Comment0, Comment),
	numbervars(Comment, 0, _),
        tab(Out, 8), writeq(Out, comment(Comment)), write(Out, '.'), nl(Out).
write_asm(Out, (Label: Instruction)) :- !,
	writeq(Out, Label), write(Out, ' :'), nl(Out),
	write_asm(Out, Instruction).
write_asm(Out, Instruction) :-
	tab(Out, 8), writeq(Out, Instruction), write(Out, '.'), nl(Out).


write_domain_definitions(Out):-
	clause(package_name(PackageName),_),
	clause(domain_definition(Name,Value),_),
	AssertTerm = (:- assert(domain_definition(PackageName:Name = Value))),
	writeq(Out,AssertTerm),	write(Out, '.'), nl(Out),
	fail.
write_domain_definitions(_).

write_init(InitPredicate):-
	clause(package_name(PackageName),_),
	clause(pl2am_flag(pif(PackageInitFolder)),_),
	list_to_string([PackageInitFolder,'/',PackageName,'.init.pl'],File),
	with_mutex(PackageName, write_init_file(File, PackageName, InitPredicate)).

write_init(_).

write_init_file(File, PackageName, InitPredicate):-
	\+(exists_file(File)),
	!,
	write_init_predicate(File, PackageName, InitPredicate).

write_init_file(File, PackageName, InitPredicate):-
	read_init_predicate(File, InPackageName, InInitPredicate),
	%PackageName == InPackageName,
	InitPredicate = (InitHead :- InitBody),
	InInitPredicate = (InInitHead :- InInitBody),
	%InitHead == InInitHead,
	conj_union(InitBody, InInitBody, NewBody),
	NewBody \== InInitBody,
	write_init_predicate(File, PackageName, (InitHead :- NewBody)).

write_init_file(_,_,_).

conj_member(X, X):- !.
conj_member(X,(X,_)):- !.
conj_member(X,(_,Y)):-
	conj_member(X,Y).

conj_union((X,L),Y,O):-
	conj_member(X,Y),
	!,
	conj_union(L,Y,O).

conj_union((X,L),Y,O):-
	!,
	conj_union(L,(X,Y),O).

conj_union(X, Y, Y):-
	conj_member(X, Y),
	!.
conj_union(X, Y, (X,Y)).

read_init_predicate(File, PackageName, InitPredicate):-
	open(File, read, In),
	read_clause_(In, Package),
	read_clause_(In, InitPredicate),
	close(In),
	Package = (:- package PackageName).


write_init_predicate(File, PackageName, InitPredicate):-
	open(File,write,Stream),
	nl(Stream),
	write(Stream,':- package \''),
	write(Stream,PackageName),
	write(Stream,'\'.'),
	nl(Stream),
	writeq(Stream,InitPredicate),
	write(Stream,'.'),
	nl(Stream),
	close(Stream).


/****************************************************************
  Treat Dynamic Declaration
****************************************************************/
assert_init_clauses([]) :- !.
assert_init_clauses(PredSpecs) :-
	collect_init_cls(PredSpecs, Cls),
	assert_init_cls(Cls),
	!.

collect_init_cls([], []) :- !.
collect_init_cls([F/A|FAs], [Cls|Cls1]) :-
	clause(internal_predicates(F,A), _),
	!,
	functor(Head, F, A),
	findall(assertz((Head :- Body)), internal_clause(Head, Body), Cls),
	retractall(internal_predicates(F,A)),
	retractall(internal_clause(Head, _)),
	collect_init_cls(FAs, Cls1).
%collect_init_cls([FA|FAs], [hash_put(P,FA,[])|Cls]) :-
collect_init_cls([FA|FAs], ['$new_indexing_hash'(P,FA,_)|Cls]) :-
	clause(package_name(P), _),
	!,
	collect_init_cls(FAs, Cls).

assert_init_cls([]) :- !.
assert_init_cls(Cls) :-
	list_to_conj(Cls, Body),
	assert_clause(('$init' :- Body)).

/****************************************************************
  Compile Predicate
****************************************************************/
compile_predicate(Functor, Arity) -->
	{functor(Head, Functor, Arity)},
	{findall((Head :- Body), internal_clause(Head, Body), Clauses)},
	{clause(package_name(P), _)},
	[begin_predicate(P, Functor/Arity)],
	generate_info(Functor, Arity),
	generate_import,
	compile_pred(Clauses, Functor/Arity),
	[end_predicate(P, Functor/Arity)].

%%% Program Code
compile_pred([], _) --> [], !.
compile_pred([Clause], FA) --> !,
	{check_modifier(FA, MF)}, % checks public or non-public
	[main(FA, MF): []],
	[PutGroundTerm],    % generates put instructions of ground terms
	[FA: []],
	[comment(Clause)],
	[setB0],            % set B0 register for cut
	[DeclLocalVars],    % generates the declarations of local variables
	{FA = _/A},
	set_arguments(1, A, arg, a, set), % set arg(N) to a(N).
	{GTI0 = [1,[],[]]}, % GTI0 = [SN,SAlloc,PutGroundTerm]
	compile_clause(Clause, GTI0, GTI, LTI),
	{GTI = [_,_,PutGroundTerm0], pl2am_rev(PutGroundTerm0, PutGroundTerm)},
	{LTI = [XN,_,PN|_], generate_var_decl([1,1], [XN,PN], DeclLocalVars, [])}.
compile_pred(Clauses, FA) -->
	{check_modifier(FA, MF)}, % checks public or non-public
	[main(FA,MF): []],
	[PutGroundTerm],    % generates ground terms
	[OPT1],
	[PutLabel],         % generates label declarations
	[NewHash],          % generates new_hash
	[PutHash],          % generates pub_hash
	%
	[FA: []],
	{FA = Functor/Arity},
	set_arguments(1, Arity, arg, ea, set), % set arg(N) to engine.areg(N)
	[set(cont, econt)], % set cont to engine.cont
	[OPT2],
	[OPT3],
	[setB0],            % set B0 register for cut
	generate_switch(Clauses, FA, GLI), % generates control and indexing instructions.
	{GTI0 = [1,[],[]]}, % GTI0 = [SN,SAlloc,PutGroundTerm]
	compile_pred2(Clauses, FA, 1, GTI0, GTI),
	%
	{GTI = [_,SAlloc,PutGroundTerm0], pl2am_rev(PutGroundTerm0, PutGroundTerm)},
	{GLI = [PutLabel, Hash0]},
	% replace the hash key with s(i), si(i), or sf(i)
	{replace_hash_keys(Hash0, SAlloc, NewHash, PutHash0)},
	{PutHash0 == [] -> PutHash = [] ; PutHash = static(PutHash0)},
	% generate code for the recursize call optimization
	{clause(pl2am_flag(rc(Functor,Arity)), _) ->
              OPT1 = label(FA+top), OPT2 = goto(FA+top), OPT3 = FA+top: []
              ;
              OPT1 = [], OPT2 = [], OPT3 = []
	}.

compile_pred2([], _, _, GTI, GTI) --> !.
compile_pred2([Clause|Clauses], FA, N, GTI0, GTI) -->
	[FA+N: []],
	[comment(Clause)],
	[DeclLocalVars],    % generates the declarations of local variables
	[decl_pred_vars([cont])],
	{FA = _/Arity},
	set_arguments(1, Arity, ea, a, set), % set engine.areg(N) to a(N).
	[set(econt, cont)], % set engine.cont to cont
	compile_clause(Clause, GTI0, GTI1, LTI),
	{N1 is N + 1},
	compile_pred2(Clauses, FA, N1, GTI1, GTI),
	{LTI = [XN,_,PN|_], generate_var_decl([1,1], [XN,PN], DeclLocalVars, [])}.

%%% Control and Indexing instructions
generate_switch(Clauses, FA, [Label, Hash]) -->
	% generates try, retry, trust, switch_on_term, and switch_on_hash
	{generate_switch0(Clauses, FA, Instrs, [])},
	% generates sub-labels for BP
	generate_bp_label(Instrs, FA+sub, 1, Ls0, SWTs),
	% generates fail label (fail_flag may be asserted by generate_switch0/4)
	{(retract(fail_flag) -> Ls1 = [label(fail/0)|Ls0] ; Ls1 = Ls0)},
	% generates labels for clauses
	{length(Clauses, N)},
	{generate_cl_label(FA, 1, N, Ls2)},
	{pl2am_append(Ls1, Ls2, Label)},
	% generates new_hash and put_hash instructions for switch_on_hash
	{gen_hash(SWTs, Hash, [])}.

generate_switch0(Clauses, FA) -->
	{get_indices(Clauses, FA, 1, Is)},
	generate_switch1(Is, FA).

%%% 1st. Indexing
generate_switch1(Is, FA) -->
	{FA = _/0},
	!,
	generate_tries(Is).
generate_switch1(Is, _) -->
	{all_variable_indices(Is)},
	!,
	generate_tries(Is).
generate_switch1(Is, FA) -->
	[switch_on_term(LV,LI,LF,LC,LS,LL)],
	generate_sw(Is, FA, var, LV, [], PIs0),
	generate_sw(Is, FA, int, LI, PIs0, PIs1),
	generate_sw(Is, FA, flo, LF, PIs1, PIs2),
	generate_sw(Is, FA, con, LC, PIs2, PIs3),
	generate_sw(Is, FA, str, LS, PIs3, PIs4),
	generate_sw(Is, FA, lis, LL, PIs4, _).

generate_sw(Is, FA, Tag, L, PIs0, PIs) -->
	{select_indices(Is, Tag, Is1)},
	generate_sw1(Is1, FA, Tag, L, PIs0, PIs).

%%% 2nd. Indexing
generate_sw1([], _, _, fail/0, PIs, PIs) --> !, {assert_fail}.
generate_sw1([I], _, _, L, PIs, PIs) --> !, {I = [L|_]}.
generate_sw1(Is, FA, Tag, L, PIs0, PIs) -->
	{no_switch_on_hash(Is, Tag)},
	!,
	generate_sw2(Is, FA, Tag, L, PIs0, PIs).
generate_sw1(Is, FA, Tag, FA+Tag, PIs0, PIs) -->
	generate_sw(Is, FA, nil, L, PIs0, PIs),
	{count_unique_hash(Is, Size, Keys)},
	[FA+Tag: switch_on_hash(Tag, Size, L, HT)],
	{generate_hash_table(Keys, Is, LIs)},
	generate_hash_tries(LIs, FA+Tag, 0, HT).

no_switch_on_hash(Is, Tag) :-
	clause(pl2am_flag(idx), _),
	!,
	(Tag = var ; Tag = lis ; Tag = nil ; count_unique_hash(Is, C, _), C < 2).
no_switch_on_hash(_, _).

generate_sw2(Is, _, _, L, PIs, PIs) -->
	{pl2am_member((L,Is), PIs)},
	!.
generate_sw2(Is, FA, Tag, FA+Tag, PIs0, [(FA+Tag,Is)|PIs0]) -->
	[FA+Tag: []],
	generate_tries(Is).

generate_hash_tries([], _, _, []) --> !.
generate_hash_tries([K:[]|LIs], L0, N, [K:fail/0|Ls]) --> !,
	{assert_fail},
	generate_hash_tries(LIs, L0, N, Ls).
generate_hash_tries([K:[I]|LIs], L0, N, [K:L|Ls]) --> !,
	{I = [L|_]},
	generate_hash_tries(LIs, L0, N, Ls).
generate_hash_tries([K:Is|LIs], L0, N, [K:L0+N|Ls]) -->
	[L0+N: []],
	generate_tries(Is),
	{N1 is N + 1},
	generate_hash_tries(LIs, L0, N1, Ls).

generate_hash_table([], _, []) :- !.
generate_hash_table([K|Ks], Is0, [K:Is|LIs]) :-
	select_hash(Is0, K, Is),
	generate_hash_table(Ks, Is0, LIs).

select_hash([], _, []).
select_hash([I|Is0], K, [I|Is]) :-
	I = [_,_,Tag,Hash],
	(Tag = var ; K = Hash),
	!,
	select_hash(Is0, K, Is).
select_hash([_|Is0], K, Is) :-
	select_hash(Is0, K, Is).

%%% Choice Point (try, retry, trust)
generate_tries([I|Is]) -->
	{I = [L|_]},
	[try(L)],
	generate_tries1(Is).

generate_tries1([I]) --> !,
	{I = [L|_]},
	[trust(L)].
generate_tries1([I|Is]) -->
	{I = [L|_]},
	[retry(L)],
	generate_tries1(Is).

get_indices([], _, _, []).
get_indices([_|Clauses], FA, N, [[FA+N]|Is]) :-
	FA = _/0,
	!,
	N1 is N + 1,
	get_indices(Clauses, FA, N1, Is).
get_indices([Clause|Clauses], FA, N, [[FA+N,A1,Tag,Hash]|Is]) :-
	Clause = (Head :- _),
	arg(1, Head, A1),
	get_hash(A1, Tag, Hash),
	N1 is N + 1,
	get_indices(Clauses, FA, N1, Is).

get_hash(X, var, 0) :- var(X), !.
get_hash(X, int, X) :- integer(X), !.
get_hash(X, flo, X) :- float(X), !.
get_hash(X, con, X) :- atom(X), !.
get_hash(X, lis, '.'/2) :- X = [_|_], !.
get_hash(X, str, F/A) :- functor(X, F, A), !.

all_variable_indices([]).
all_variable_indices([[_,_,var,_]|Is]) :-
	all_variable_indices(Is).

count_unique_hash([], 0, []).
count_unique_hash([I|Is], C, K) :-
	count_unique_hash(Is, C0, K0),
	I = [_,_,Tag,Hash],
	((Tag = var ; pl2am_member([_,_,Tag,Hash], Is)) ->
	    C = C0, K = K0
	;
	    C is C0 + 1, K = [Hash|K0]
	).

select_indices([], _, []).
select_indices([I|Is0], Tag, [I|Is]) :-
	I = [_,_,T|_],
	(Tag = var ; Tag = T ; T = var),
	!,
	select_indices(Is0, Tag, Is).
select_indices([_|Is0], Tag, Is) :-
	select_indices(Is0, Tag, Is).

%%% Assert Fail Flag
assert_fail:- clause(fail_flag, _), !.
assert_fail:- assert(fail_flag).

%%% Generate Labels for Backtrack Point
generate_bp_label([], _, _, [], []) --> !.
generate_bp_label([X|Xs], CL, N, Ls, [X|Hs]) -->
	{X = switch_on_hash(_,_,_,_)},
	!,
	[X],
	generate_bp_label(Xs, CL, N, Ls, Hs).
generate_bp_label([try(L)|Xs], CL, N, [label(CL+N)|Ls], Hs) --> !,
	[try(L, CL+N)],
	[CL+N: []],
	{N1 is N+1},
	generate_bp_label(Xs, CL, N1, Ls, Hs).
generate_bp_label([retry(L)|Xs], CL, N, [label(CL+N)|Ls], Hs) --> !,
	[retry(L, CL+N)],
	[CL+N: []],
	{N1 is N+1},
	generate_bp_label(Xs, CL, N1, Ls, Hs).
generate_bp_label([(L:X)|Xs], _, _, [label(L)|Ls], Hs) --> !,
	[L: []],
	generate_bp_label([X|Xs], L, 1, Ls, Hs).
generate_bp_label([X|Xs], CL, N, Ls, Hs) -->
	[X],
	generate_bp_label(Xs, CL, N, Ls, Hs).

generate_cl_label(_, I, N, []) :-
	I > N,
	!.
generate_cl_label(FA, I, N, [label(FA+I)|Ls]) :-
	I1 is I+1,
	generate_cl_label(FA, I1, N, Ls).

%%% Generate Hash instructions for switch_on_hash
gen_hash([]) --> !.
gen_hash([switch_on_hash(T,S,_,H)|Xs]) --> !,
	[new_hash(T,S)],
	gen_put_hash(H, T),
	gen_hash(Xs).

gen_put_hash([], _) --> !.
gen_put_hash([K:V|Xs], T) -->
	[put_hash(K, V, T)],
	gen_put_hash(Xs, T).

replace_hash_keys([], _, [], []) :- !.
replace_hash_keys([put_hash(K,L,H)|Xs], SA, NHs, [put_hash(X,L,H)|PHs]) :- !,
	replace_key(K, SA, X),
	replace_hash_keys(Xs, SA, NHs, PHs).
replace_hash_keys([X|Xs], SA, [X|NHs], PHs) :-
	replace_hash_keys(Xs, SA, NHs, PHs).

replace_key(K, Alloc, X) :-
	integer(K),
	allocated(Alloc, K:int, [X,yes]),
	!.
replace_key(K, Alloc, X) :-
	float(K),
	allocated(Alloc, K:flo, [X,yes]),
	!.
replace_key(K, Alloc, X) :-
	atom(K),
	allocated(Alloc, K:con, [X,yes]),
	!.
replace_key(K, Alloc, X) :-
	nonvar(K),
	K = F/A,
	atom(F),
	integer(A),
	allocated(Alloc, K:con, [X,yes]),
	!.
replace_key(K, _, _) :-
	pl2am_error([replacement,of,hash,key,K,failed]),
	fail.

%%% Import Declarations
generate_import -->
	{findall((P,C), import_package(P, C), X)},
	gen_import(X).

gen_import([]) --> !.
gen_import([(P,'*')|Xs]) --> !,
	[import_package(P)],
	gen_import(Xs).
gen_import([(P,C)|Xs]) -->
	[import_package(P, C)],
	gen_import(Xs).

%%% Information
generate_info(Functor, Arity) -->
	{clause(file_name(File), _)},
	[info([Functor/Arity, File])].

%%% Check the Modifier of Predicate F/A.
check_modifier('$init'/0, public) :- !.
check_modifier(F/A, public) :-
	clause(public_predicates(F, A), _),
	!.
check_modifier(_, non-public).

%%% generate a list of registers with given range.
range_reg(I, N, _, []) :- I > N, !.
range_reg(I, N, A, [R|Rs]) :-
	I =< N,
	I1 is I+1,
	R =.. [A, I],
	range_reg(I1, N, A, Rs).

%%% generate set instructions
gen_set([], []) --> !.
gen_set([X|Xs], [Y|Ys]) --> [set(X, Y)], gen_set(Xs, Ys).

%%% generate deref instructions
gen_deref([], []) --> !.
gen_deref([X|Xs], [Y|Ys]) --> [deref(X, Y)], gen_deref(Xs, Ys).

%%% generate set and deref instructions
set_arguments(SN, EN, R1, R2, Flag) -->
	{range_reg(SN, EN, R1, L1)},
	{range_reg(SN, EN, R2, L2)},
	gen_set_arg(Flag, L1, L2).

gen_set_arg(set, L1, L2) --> gen_set(L1, L2).
gen_set_arg(deref, L1, L2) --> gen_deref(L1, L2).

%%% generate decl_var instructions
generate_var_decl([X0,P0], [XN,PN]) -->
	{X1 is XN-1, P1 is PN-1},
	{range_reg(X0, X1, a, XL)},
	{range_reg(P0, P1, p, PL)},
	gen_decl_term_vars(XL),
	gen_decl_pred_vars(PL).

gen_decl_term_vars([]) --> !.
gen_decl_term_vars(XL) --> [decl_term_vars(XL)].

gen_decl_pred_vars([]) --> !.
gen_decl_pred_vars(PL) --> [decl_pred_vars(PL)].

/****************************************************************
  Compile Clause
****************************************************************/
compile_clause((Head :- Body), GTI0, GTI, LTI) -->
	{pretreat_body(Body, Goals0)},     % cut, rename, compile aith exp.
	{localize_meta(Goals0, Goals)},    % add package name for meta predicates
	{precompile(Head, Goals, Instrs)}, % generate get, put, put_clo, put_cont, inline
	[comment((Head :- Goals))],        % output precompiled clause
	compile_chunks(Instrs, GTI0, GTI, LTI),
	!.
compile_clause(Clause, _, _, _) -->
	{pl2am_error([compilation,of,Clause,failed])},
	{fail}.

%%%%%%%%%% Pretreat Body and Compile Arithmetic Expressions
pretreat_body(Body, Goals) :-
	pretreat_body0(Body, Cut, Goals0, []),
	pretreat_cut(Cut, Goals0, Goals).

pretreat_cut(Cut, Gs, Gs) :- var(Cut), !.
pretreat_cut('$cut'(Level), ['$cut'(Level)|Gs], ['$neck_cut'|Gs]) :-
	\+(pl2am_member('$cut'(Level), Gs)),
	!.
pretreat_cut('$cut'(Level), ['$cut'(Level)|Gs], ['$get_level'(Level),'$neck_cut'|Gs]) :-!.
pretreat_cut('$cut'(Level), Gs, ['$get_level'(Level)|Gs]).

pretreat_body0(G, _) --> {var(G)}, !, [call(G)].
pretreat_body0(!, Cut) --> !, {Cut = '$cut'(Level)}, ['$cut'(Level)].
pretreat_body0(otherwise, _) --> !.
pretreat_body0(true, _)  --> !.
pretreat_body0(fail, _)  --> !, [fail].
pretreat_body0(false, _) --> !, [fail].
pretreat_body0(halt, _)  --> !, [halt].
pretreat_body0(abort, _) --> !, [abort].
pretreat_body0((G1,G2), Cut) --> !, pretreat_body0(G1, Cut), pretreat_body0(G2, Cut).
pretreat_body0(G, _) --> pretreat_builtin(G), !.
pretreat_body0(G, _) --> {functor(G, F, A), clause(dynamic_predicates(F, A, _:Call), _), CG=..[Call,G]}, !, [CG].
pretreat_body0(findall(X,G,L), Z) --> {
        nonvar(G),
        functor(G, F, A),
        clause(dynamic_predicates(F, A, Call), _),
        Call\=='SxxMachine.builtin':call,
        Call=P:C,
        clause(package_name(P1), _),
        CG=..[C,P1:G]
    },
    !,
    pretreat_body0(findall(X,P:CG,L), Z).

pretreat_body0(G, _) --> [G].

%%% rename builtins
pretreat_builtin(X = Y)    --> !, ['$unify'(X, Y)].
pretreat_builtin(X \= Y)    --> !, ['$not_unifiable'(X, Y)].
pretreat_builtin(X == Y)   --> !, ['$equality_of_term'(X, Y)].
pretreat_builtin(X \== Y)  --> !, ['$inequality_of_term'(X, Y)].
pretreat_builtin(?=(X, Y)) --> !, ['$identical_or_cannot_unify'(X, Y)].
pretreat_builtin(X @< Y)   --> !, ['$before'(X, Y)].
pretreat_builtin(X @> Y)   --> !, ['$after'(X, Y)].
pretreat_builtin(X @=< Y)  --> !, ['$not_after'(X, Y)].
pretreat_builtin(X @>= Y)  --> !, ['$not_before'(X, Y)].
pretreat_builtin(compare(Op,X,Y)) --> {Op == (=)}, !, ['$equality_of_term'(X, Y)].
pretreat_builtin(compare(Op,X,Y)) --> {Op == (<)}, !, ['$before'(X, Y)].
pretreat_builtin(compare(Op,X,Y)) --> {Op == (>)}, !, ['$after'(X, Y)].
pretreat_builtin(X =.. Y)  --> !, ['$univ'(X, Y)].
pretreat_builtin(X =:= Y)  --> !, pretreat_is(U, X), pretreat_is(V, Y), ['$arith_equal'(U, V)].
pretreat_builtin(X =\= Y)  --> !, pretreat_is(U, X), pretreat_is(V, Y), ['$arith_not_equal'(U, V)].
pretreat_builtin(X > Y)    --> !, pretreat_is(U, X), pretreat_is(V, Y), ['$greater_than'(U, V)].
pretreat_builtin(X >= Y)   --> !, pretreat_is(U, X), pretreat_is(V, Y), ['$greater_or_equal'(U, V)].
pretreat_builtin(X < Y)    --> !, pretreat_is(U, X), pretreat_is(V, Y), ['$less_than'(U, V)].
pretreat_builtin(X =< Y)   --> !, pretreat_is(U, X), pretreat_is(V, Y), ['$less_or_equal'(U, V)].
pretreat_builtin(Z is X)   --> !, pretreat_is0(Z, X).

pretreat_is(Z, X) --> {var(X)}, !, {X = Z}.
pretreat_is(Z, X) --> pretreat_is0(Z, X).

pretreat_is0(Z, X) --> {clause(pl2am_flag(ac), _)}, !, precompile_is(X, Z).
pretreat_is0(Z, X) --> [is(Z, X)].

%%% compile aithmetic expressions
precompile_is(X, A) --> {var(X)}, !, [is(A, X)].
precompile_is(X, A) --> {number(X)}, !, {X = A}.
precompile_is(X, A) --> {builtin_arith_constant(X)}, !, {X = A}.
precompile_is(+(X), A) --> !, precomp_is(X, A).
precompile_is(-(X), A) --> !, precompile_is(-1*X, A).
precompile_is(X+Y,  A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$plus'(U, V, A)].
precompile_is(X-Y,  A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$minus'(U, V, A)].
precompile_is(X*Y,  A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$multi'(U, V, A)].
precompile_is(X/Y,  A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$float_quotient'(U, V, A)].
precompile_is(X//Y, A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$int_quotient'(U, V, A)].
precompile_is(X mod Y, A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$mod'(U, V, A)].
precompile_is(X rem Y, A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$mod'(U, V, A)].
precompile_is(X/\Y, A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$bitwise_conj'(U, V, A)].
precompile_is(X\/Y, A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$bitwise_disj'(U, V, A)].
precompile_is(X#Y,  A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$bitwise_exclusive_or'(U, V, A)].
precompile_is(\(X), A) --> !, precomp_is(X, U), ['$bitwise_neg'(U, A)].
precompile_is(X<<Y, A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$shift_left'(U, V, A)].
precompile_is(X>>Y, A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$shift_right'(U, V, A)].
precompile_is([X],  A) --> !, precomp_is(X, A).
precompile_is(abs(X),     A) --> !, precomp_is(X, U), ['$abs'(U, A)].
precompile_is(min(X,Y),   A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$min'(U, V, A)].
precompile_is(max(X,Y),   A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$max'(U, V, A)].
precompile_is(round(X),   A) --> !, precomp_is(X, U), ['$round'(U, A)].
precompile_is(floor(X),   A) --> !, precomp_is(X, U), ['$floor'(U, A)].
precompile_is(ceiling(X),    A) --> !, precomp_is(X, U), ['$ceil'(U, A)].
precompile_is(sin(X),     A) --> !, precomp_is(X, U), ['$sin'(U, A)].
precompile_is(cos(X),     A) --> !, precomp_is(X, U), ['$cos'(U, A)].
precompile_is(tan(X),     A) --> !, precomp_is(X, U), ['$tan'(U, A)].
precompile_is(asin(X),    A) --> !, precomp_is(X, U), ['$asin'(U, A)].
precompile_is(acos(X),    A) --> !, precomp_is(X, U), ['$acos'(U, A)].
precompile_is(atan(X),    A) --> !, precomp_is(X, U), ['$atan'(U, A)].
precompile_is(sqrt(X),    A) --> !, precomp_is(X, U), ['$sqrt'(U, A)].
precompile_is(log(X),     A) --> !, precomp_is(X, U), ['$log'(U, A)].
precompile_is(exp(X),     A) --> !, precomp_is(X, U), ['$exp'(U, A)].
precompile_is(X**Y,   A) --> !, precomp_is(X, U), precomp_is(Y, V), ['$pow'(U, V, A)].
precompile_is(degrees(X), A) --> !, precomp_is(X, U), ['$degrees'(U, A)].
precompile_is(radians(X), A) --> !, precomp_is(X, U), ['$radians'(U, A)].
precompile_is(rint(X),    A) --> !, precomp_is(X, U), ['$rint'(U, A)].
precompile_is(float(X),   A) --> !, precomp_is(X, U), ['$float'(U, A)].
precompile_is(float_integer_part(X),    A) --> !, precomp_is(X, U), ['$float_integer_part'(U, A)].
precompile_is(float_fractional_part(X), A) --> !, precomp_is(X, U), ['$float_fractional_part'(U, A)].
precompile_is(truncate(X),A) --> !, precomp_is(X, U), ['$truncate'(U, A)].
precompile_is(sign(X),    A) --> !, precomp_is(X, U), ['$sign'(U, A)].
precompile_is(X, _) -->
	{pl2am_error([unknown,arithemetic,expression,X])},
	{fail}.

precomp_is(X, A) --> {var(X)}, {var(A)}, !, {X = A}.
precomp_is(X, A) --> precompile_is(X, A).

%%%%%%%%%% Add Pacakge (module) name to meta predicates
localize_meta(G0, G) :-
	clause(package_name(P), _),
	localize_meta(G0, P, G),
	!.

localize_meta([], _, []) :- !.
localize_meta([G|Gs], P, [G1|Gs1]) :-
	localize_meta_goal(G, P, X),
	(X = P:Y -> G1 = Y ; G1 = X),
	localize_meta(Gs, P, Gs1).

localize_meta_goal(G, P, G1) :- var(G), !,
	localize_meta_goal(call(G), P, G1).
localize_meta_goal(P:G, _, G1) :- !,
	localize_meta_goal(G, P, G1).
localize_meta_goal((X,Y), P, (X1,Y1)) :- !,
	localize_meta_goal(X, P, X1),
	localize_meta_goal(Y, P, Y1).
localize_meta_goal((X->Y), P, (X1->Y1)) :- !,
	localize_meta_goal(X, P, X1),
	localize_meta_goal(Y, P, Y1).
localize_meta_goal((X;Y), P, (X1;Y1)) :- !,
	localize_meta_goal(X, P, X1),
	localize_meta_goal(Y, P, Y1).
localize_meta_goal(G, P, G1) :-
	functor(G, F, A),
	(clause(meta_predicates(F, A, M), _) ; builtin_local_predicates(F, A, M)),
	!,
	G  =.. [F|As],
	localize_meta_args(M, As, P, As1),
	G1 =.. [F|As1].
localize_meta_goal(G, P, call(P:G)) :- var(P), !.
localize_meta_goal(G, _, G) :- system_predicate(G), !.
localize_meta_goal(G, P, P:G).

localize_meta_args([], [], _, []) :- !.
localize_meta_args([:|Ms], [A|As], P, [P:A|As1]) :-
	(var(A) ; A \= _:_),
	!,
	localize_meta_args(Ms, As, P, As1).
localize_meta_args([;|Ms], [A|As], P, [P:A|As1]) :-
	(var(A) ; A \= _:_),
	!,
	localize_meta_args(Ms, As, P, As1).
localize_meta_args([_|Ms], [A|As], P, [A|As1]) :-
	localize_meta_args(Ms, As, P, As1).

%%%%%%%%%% Precompile Clause and Optimize Recursive Call
precompile(Head, Goals, Instrs) :-
	precompile_head(Head, Instrs0, Bs),
	precompile_body(Goals, Bs, []),
	optimize_recursive_call(Head, Instrs0, Instrs).

%%% Precompile head (generates get instructions)
precompile_head(Head) -->
	{Head =.. [_|Args]},
	precomp_head(Args, 1).

precomp_head([], _) --> !.
precomp_head([A|As], I) -->
	[get(A, a(I))],
	{I1 is I + 1},
	precomp_head(As, I1).

%%% Precompile body
%%% (generates put, put_clo, put_cont, and inline instructions)
precompile_body(Goals) -->
	{clause(pl2am_flag(ie), _)},
	!,
	{pickup_inline_goals(Goals, IGs, Gs)},
	precomp_inline(IGs, Gs).
precompile_body(Goals) -->
	precomp_body(Goals).

precomp_body([]) --> !, [execute(cont)].
precomp_body([M:G|Cont]) --> !,
	binarize_body(G, Cont, G1),
	[execute(M:G1)].
precomp_body([G|Cont]) -->
	binarize_body(G, Cont, G1),
	[execute(G1)].

/*---------------------------------------------------------------
 Binarization technique was developed by P.Tarau and M.Boyer,
 please see:
   * "Elementary Logic Programs"
     P.Tarau and M.Boyer
     Programming Language Implementation and Logic Programming,
     pp.159--173, LNCS 456, Springer Verlag, 1990
----------------------------------------------------------------*/
binarize_body(G, Cont, G1) -->
	{G  =.. [F|Args]},
	{functor(G, F, A)},
	precomp_call(Args, Us, F, A),
	%precomp_call(Args, Us), % for no closure
	precomp_cont(Cont, V),
	{pl2am_append(Us, [V], Ws)},
	{G1 =.. [F|Ws]}.

precomp_call([], []) --> !.
precomp_call([A|As], [U|Us]) -->
	[put(A, U)],
	precomp_call(As, Us).

precomp_cont([], cont) --> !.
precomp_cont([M:G|Cont], V) --> !,
	binarize_body(G, Cont, G1),
	[put_cont(M:G1, V)].
precomp_cont([G|Cont], V) -->
	binarize_body(G, Cont, G1),
	[put_cont(G1, V)].

precomp_inline([], Gs1) --> !, precomp_body(Gs1).
precomp_inline([fail|_], _) --> !, [inline(fail)].
precomp_inline([G|Gs], Gs1) -->
	{G  =.. [F|Args]},
	{functor(G, F, A)},
	precomp_call(Args, Us, F, A),
	%precomp_call(Args, Us),
	{G1 =.. [F|Us]},
	[inline(G1)],
	precomp_inline(Gs, Gs1).

pickup_inline_goals([], [], []) :- !.
pickup_inline_goals([G|Gs], [G|IGs], BGs) :-
	builtin_inline_predicates(G),
	!,
	pickup_inline_goals(Gs, IGs, BGs).
pickup_inline_goals(Gs, [], Gs).

%%% Generate Closure
precomp_call(As, Us, Functor, Arity) -->
	{clause(pl2am_flag(clo), _)},
	{clause(meta_predicates(Functor, Arity, Mode), _)},
	!,
	{clause(package_name(P), _)},
	precomp_closure(Mode, As, P, Us).
precomp_call(As, Us, _, _) --> precomp_call(As, Us).

precomp_closure([], [], _, []) --> !.
precomp_closure([:|Ms], [A|As], P, [U|Us]) -->
	{get_closure(A, P, C)},
	!,
	[put_clo(C, U)],
	precomp_closure(Ms, As, P, Us).
precomp_closure([_|Ms], [A|As], P, [U|Us]) -->
	[put(A, U)],
	precomp_closure(Ms, As, P, Us).

get_closure(G, _, _) :- var(G), !, fail.
get_closure(_, P, _) :- var(P), !, fail.
get_closure(P:G, _, Clo) :- !, get_closure(G, P, Clo).
get_closure(G, P, P:G) :-  % ???
	atom(P),
	callable(G),
	functor(G, F, A),
	\+ clause(dynamic_predicates(F,A,_), _),
	!.

%%% Optimize Recursive Call
optimize_recursive_call(Head, Instrs0, Instrs) :-
	clause(pl2am_flag(rc), _),
	!,
	optimize_rc(Instrs0, Head, Instrs, []).
optimize_recursive_call(_, Instrs, Instrs).

optimize_rc([], _) --> !.
optimize_rc([execute(Goal)|Xs], Head) -->
	{functor(Head, F, A)},
	{functor(Goal, F, A1)},
	{A+1 =:= A1},
	!,
	{assert_copts(rc(F, A))},
	{Goal =.. [F|Args]},
	{range_reg(1, A, ea, Rs0)},
	{pl2am_append(Rs0, [econt], Rs)},
	gen_set(Args, Rs),
	[goto(F/A+top)],
	optimize_rc(Xs, Head).
optimize_rc([X|Xs], Head) -->
	[X],
	optimize_rc(Xs, Head).

%%%%%%%%%% Compile Clause
compile_chunks(Chunk, GTI0, GTI, LTI) -->
	{alloc_voids(Chunk, [], Alloc)},  % check void variables
        compile_chunk(Chunk, Alloc, GTI0, GTI, LTI).

compile_chunk([], _, GTI, GTI, []) --> !.
compile_chunk(Chunk, Alloc, GTI0, GTI, LTI) -->
	{free_x_reg(Chunk, 1, XN), YN = 1, PN = 1},
	{LTI0 = [XN, YN, PN, Alloc]},
	comp_chunk(Chunk, LTI0, LTI, GTI0, GTI).

comp_chunk([], LTI, LTI, GTI, GTI) --> !.
comp_chunk([(L:[])|Cs], LTI0, LTI, GTI0, GTI) --> !,
	[L:[]],
	comp_chunk(Cs, LTI0, LTI, GTI0, GTI).
comp_chunk([(L:C)|Cs], LTI0, LTI, GTI0, GTI) --> !,
	[L:[]],
	comp_chunk([C|Cs], LTI0, LTI, GTI0, GTI).
comp_chunk([C|Cs], LTI0, LTI, GTI0, GTI) --> !,
	comp_instr(C, LTI0, LTI1, GTI0, GTI1),
	comp_chunk(Cs, LTI1, LTI, GTI1, GTI).

%%% finds an available number A-register
free_x_reg([], XN, XN).
free_x_reg([get(_,V)|Cs], XN0, XN) :- nonvar(V), V = a(N), !,
	XN1 is max(N+1, XN0),
	free_x_reg(Cs, XN1, XN).
free_x_reg([put(_,V)|Cs], XN0, XN) :- nonvar(V), V = a(N), !,
	XN1 is max(N+1, XN0),
	free_x_reg(Cs, XN1, XN).
free_x_reg([_|Cs], XN0, XN) :-
	free_x_reg(Cs, XN0, XN).

%%% finds void variables and allocates them in Alloc.
alloc_voids(Chunks, Alloc0, Alloc) :-
	variables(Chunks, Vars),
	alloc_voids1(Vars, Chunks, Alloc0, Alloc).

alloc_voids1([], _, Alloc, Alloc).
alloc_voids1([V|Vars], Chunks, Alloc0, Alloc) :-
	count_variable(V, Chunks, 1),
	!,
	Alloc1 = [[V,void,_Seen]|Alloc0],
	alloc_voids1(Vars, Chunks, Alloc1, Alloc).
alloc_voids1([_|Vars], Chunks, Alloc0, Alloc) :-
	alloc_voids1(Vars, Chunks, Alloc0, Alloc).

%%%%%%%%%% Compile Precompiled Instructions: get, put, put_clo, and put_cont
/*
  comp_instr(+Instr, +LTI0, ?LTI, +GTI0, ?GTI)
  Instr    : Intermediate instruction
  LTI      : [XN, YN, PN, Alloc]
   XN      : The register a(XN) is available for "Term".
   YN      : The register y(YN) is available for "Term[]".
   PN      : The register p(PN) is available for "Predicate".
   Alloc   : [[VarTerm, Register, Seen],...]
  GTI      : [SN, SAlloc, SInstrs]
   SN      : The registers s(SN), si(SN), or sf(SN) are available for static "Term".
   SAlloc  : [[NonVarTerm:Type, Register, Seen],...]
   SInstrs : list of instructions for static terms.
  Seen     : Unbound variable | yes | void
  Type     : int | flo | con | str | lis | arr
*/
comp_instr(get(X, A), LTI0, LTI, GTI0, GTI) --> !,
	gen_get(X, A, LTI0, LTI, GTI0, GTI).
comp_instr(put(X, V), LTI0, LTI, GTI0, GTI) --> !,
	gen_put(X, V, LTI0, LTI, GTI0, GTI).
comp_instr(put_clo(X, V), LTI0, LTI, GTI0, GTI) --> !,
	gen_put_clo(X, V, LTI0, LTI, GTI0, GTI).
comp_instr(put_cont(X, V), LTI0, LTI, GTI0, GTI) --> !,
	gen_put_cont(X, V, LTI0, LTI, GTI0, GTI).
comp_instr(Instr, LTI, LTI, GTI, GTI) -->
	[Instr].

%%%%%%%%%% put instructions
gen_put(_, A, _, _, _, _) --> {nonvar(A)}, !,
	{pl2am_error([A,should,be,an,unbound,variable])},
	{fail}.
gen_put(X, A, LTI0, LTI, GTI, GTI) --> {var(X)}, !,
	{assign_reg(X, R, Seen, LTI0, LTI)},
	gen_put_var(R, Seen, A).
gen_put(X, A, LTI, LTI, GTI0, GTI) --> {integer(X)}, !,
	{assign_sreg(X:int, R, Seen, GTI0, GTI1)},
	gen_put_int(X, R, Seen, A, GTI1, GTI).
gen_put(X, A, LTI, LTI, GTI0, GTI) --> {long(X)}, !,
	{assign_sreg(X:long, R, Seen, GTI0, GTI1)},
	gen_put_int(X, R, Seen, A, GTI1, GTI).
gen_put(X, A, LTI, LTI, GTI0, GTI) --> {float(X)}, !,
	{assign_sreg(X:flo, R, Seen, GTI0, GTI1)},
	gen_put_float(X, R, Seen, A, GTI1, GTI).
gen_put(X, A, LTI, LTI, GTI0, GTI) --> {atom(X)}, !,
	{assign_sreg(X:con, R, Seen, GTI0, GTI1)},
	gen_put_con(X, R, Seen, A, GTI1, GTI).
gen_put(X, A, LTI0, LTI, GTI0, GTI) -->
	{ground(X), X = [X1|X2]},
	!,
	gen_put_args([X1,X2], [R1,R2], LTI0, LTI, GTI0, GTI1),
	{assign_sreg(X:lis, R, Seen, GTI1, GTI2)},
	gen_put_list([R1,R2], R, Seen, A, GTI2, GTI).
gen_put(X, A, LTI0, LTI, GTI0, GTI) -->
	{ground(X), X =..[_|Args], functor(X,F,N)},
	!,
	{assign_sreg(F/N:con, R0, Seen0, GTI0, GTI1)},
	gen_put_con(F/N, R0, Seen0, _, GTI1, GTI2),
	gen_put_args(Args, Regs, LTI0, LTI, GTI2, GTI3),
	{assign_sreg(Args:arr, R1, Seen1, GTI3, GTI4)},
	gen_put_str_args(Regs, R1, Seen1, _, GTI4, GTI5),
	{assign_sreg(X:str, R, Seen, GTI5, GTI6)},
	gen_put_str([R0,R1], R, Seen, A, GTI6, GTI).
gen_put(X, A, LTI0, LTI, GTI0, GTI) -->
	{X = [X1|X2]},
	!,
	gen_put_args([X1,X2], [R1,R2], LTI0, LTI1, GTI0, GTI),
	{assign_reg(_, R, Seen, LTI1, LTI)},
	{Seen = yes, R = A},
	[put_list(R1, R2, R)].
gen_put(X, A, LTI0, LTI, GTI0, GTI) -->
	{X =..[_|Args], functor(X,F,N)},
	!,
	{assign_sreg(F/N:con, R0, Seen0, GTI0, GTI1)},
	gen_put_con(F/N, R0, Seen0, _, GTI1, GTI2),
	gen_put_args(Args, Regs, LTI0, LTI1, GTI2, GTI),
	{inc_YN(R1, LTI1, LTI2)},
	{assign_reg(_, R, Seen, LTI2, LTI)},
	{Seen = yes, R = A},
	[put_str_args(Regs, R1)],
	[put_str(R0, R1, R)].

gen_put_var(void, _, A) --> !, {A = void}. % void is a special constant.
gen_put_var(R, Seen, A) --> {var(Seen)}, !,
	{Seen = yes, R = A},
	[put_var(R)].
gen_put_var(R, _, A) --> {R = A}.

gen_put_int(X, R, Seen, A, GTI0, GTI)  --> {var(Seen)}, !,
	{Seen = yes, R = A},
	{add_instr(put_int(X, R), GTI0, GTI)}.
gen_put_int(_, R, _, A, GTI, GTI)  --> {R = A}.

gen_put_float(X, R, Seen, A, GTI0, GTI)  --> {var(Seen)}, !,
	{Seen = yes, R = A},
	{add_instr(put_float(X, R), GTI0, GTI)}.
gen_put_float(_, R, _, A, GTI, GTI)  --> {R = A}.

gen_put_con(X, R, Seen, A, GTI0, GTI)  --> {var(Seen)}, !,
	{Seen = yes, R = A},
	{add_instr(put_con(X, R), GTI0, GTI)}.
gen_put_con(_, R, _, A, GTI, GTI)  --> {R = A}.

gen_put_list([R1,R2], R, Seen, A, GTI0, GTI) --> {var(Seen)}, !,
	{Seen = yes, R = A},
	{add_instr(put_list(R1, R2, R), GTI0, GTI)}.
gen_put_list(_, R, _, A, GTI, GTI) --> {R = A}.

gen_put_str_args(Regs, R, Seen, A, GTI0, GTI) --> {var(Seen)}, !,
	{Seen = yes, R = A},
	{add_instr(put_str_args(Regs, R), GTI0, GTI)}.
gen_put_str_args(_, R, _, A, GTI, GTI) --> {R = A}.

gen_put_str([R0,R1], R, Seen, A, GTI0, GTI) --> {var(Seen)}, !,
	{Seen = yes, R = A},
	{add_instr(put_str(R0, R1, R), GTI0, GTI)}.
gen_put_str(_, R, _, A, GTI, GTI) --> {R = A}.

gen_put_args([], [], LTI, LTI, GTI, GTI) --> !.
gen_put_args([X|Xs], [R|Rs], LTI0, LTI, GTI0, GTI) -->
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	gen_put_args(Xs, Rs, LTI1, LTI, GTI1, GTI).

gen_put_clo(P:X, A, LTI0, LTI, GTI0, GTI) -->
	{X =..[F|Args]},
	!,
	gen_put_args(Args, Regs, LTI0, LTI1, GTI0, GTI),
	{assign_reg(_, R, Seen, LTI1, LTI)},
	{Seen = yes, R = A},
	{X1 =..[F|Regs]},
	{(clause(package_name(P), _) -> CLO = X1 ; CLO = P:X1)},
	[put_clo(CLO, R)].

%%%%%%%%%% get instructions
gen_get(X, A, LTI0, LTI, GTI0, GTI) -->
	gen_get([A=X], LTI0, LTI, GTI0, GTI).

gen_get([], LTI, LTI, GTI, GTI) --> !.
gen_get([A=X|_], LTI, LTI, GTI, GTI) -->
	{var(A)},
	!,
	{pl2am_error([A,must,not,be,a,variable,in,get(X,A)])},
	{fail}.
gen_get([A=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{var(X)},
	{assign_reg(X, R, Seen, LTI0, LTI1)},
	{nonvar(Seen)},
	!,
	gen_get_var(R, Seen, A),
	gen_get(Instrs, LTI1, LTI, GTI0, GTI).
gen_get([A=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{var(X)},
	!,
	{add_alloc([X,A,yes], LTI0, LTI1)},
	gen_get(Instrs, LTI1, LTI, GTI0, GTI).
gen_get([A=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{integer(X)},
	!,
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	[get_int(X, R, A)],
	gen_get(Instrs, LTI1, LTI, GTI1, GTI).
gen_get([A=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{float(X)},
	!,
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	[get_float(X, R, A)],
	gen_get(Instrs, LTI1, LTI, GTI1, GTI).
gen_get([A=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{atom(X)},
	!,
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	[get_con(X, R, A)],
	gen_get(Instrs, LTI1, LTI, GTI1, GTI).
gen_get([A=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{ground(X)},
	!,
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	[get_ground(X, R, A)],
	gen_get(Instrs, LTI1, LTI, GTI1, GTI).
gen_get([A=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{X = [X1|X2]},
	!,
	[get_list(A)],
	gen_unify([X1,X2], Instrs1, LTI0, LTI1, GTI0, GTI1),
	gen_get(Instrs1, LTI1, LTI2, GTI1, GTI2),
	gen_get(Instrs, LTI2, LTI, GTI2, GTI).
gen_get([A=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{X =.. [F|Args], functor(X, F, N)},
	{assign_sreg(F/N:con, R, Seen, GTI0, GTI1)},
	gen_put_con(F/N, R, Seen, _, GTI1, GTI2),
	[get_str(F/N, R, A)],
	gen_unify(Args, Instrs1, LTI0, LTI1, GTI2, GTI3),
	gen_get(Instrs1, LTI1, LTI2, GTI3, GTI4),
	gen_get(Instrs, LTI2, LTI, GTI4, GTI).

gen_get_var(void, _, _) --> !.
gen_get_var(R, _, A) --> [get_val(R, A)].

%%%%%%%%%% unify instructions
gen_unify([], [], LTI, LTI, GTI, GTI) --> !.
gen_unify([X|Xs], Instrs, LTI0, LTI, GTI0, GTI) -->
	{var(X)},
	!,
	{assign_reg(X, R, Seen, LTI0, LTI1)},
	gen_unify_var(R, Seen),
	gen_unify(Xs, Instrs, LTI1, LTI, GTI0, GTI).
gen_unify([X|Xs], Instrs, LTI0, LTI, GTI0, GTI) -->
	{integer(X)},
	!,
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	[unify_int(X, R)],
	gen_unify(Xs, Instrs, LTI1, LTI, GTI1, GTI).
gen_unify([X|Xs], Instrs, LTI0, LTI, GTI0, GTI) -->
	{float(X)},
	!,
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	[unify_float(X, R)],
	gen_unify(Xs, Instrs, LTI1, LTI, GTI1, GTI).
gen_unify([X|Xs], Instrs, LTI0, LTI, GTI0, GTI) -->
	{atom(X)},
	!,
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	[unify_con(X, R)],
	gen_unify(Xs, Instrs, LTI1, LTI, GTI1, GTI).
gen_unify([X|Xs], Instrs, LTI0, LTI, GTI0, GTI) -->
	{ground(X)},
	!,
	gen_put(X, R, LTI0, LTI1, GTI0, GTI1),
	[unify_ground(X, R)],
	gen_unify(Xs, Instrs, LTI1, LTI, GTI1, GTI).
gen_unify([X|Xs], [R=X|Instrs], LTI0, LTI, GTI0, GTI) -->
	{assign_reg(_, R, Seen, LTI0, LTI1)},
	gen_unify_var(R, Seen),
	gen_unify(Xs, Instrs, LTI1, LTI, GTI0, GTI).

%%% unify_void, unify_variable, unify_value
gen_unify_var(void, _) --> !, [unify_void(1)].
gen_unify_var(R, Seen) --> {var(Seen)}, !,
	{Seen = yes},
	[unify_var(R)].
gen_unify_var(R, _) --> [unify_val(R)].

%%%%%%%%%% generate continuation goal
gen_put_cont(X, R, LTI0, LTI, GTI, GTI) -->
	{inc_PN(R, LTI0, LTI)},
	[put_cont(X, R)].

%%% A register
assign_reg(X, Reg, Seen, LTI0, LTI) :- nonvar(X), !,
	pl2am_error([X,must,be,unbound,variable,in,assign_reg(X,Reg,Seen,LTI0,LTI)]),
	fail.
assign_reg(X, Reg, Seen, [XN,YN,PN,Alloc], [XN,YN,PN,Alloc]) :-
	allocated(Alloc, X, [Reg,Seen]),
	!.
assign_reg(X, Reg, Seen, [XN,YN,PN,Alloc], [XN1,YN,PN,Alloc1]) :-
	Reg = a(XN),
	XN1 is XN + 1,
	Alloc1 = [[X,Reg,Seen]|Alloc].

allocated([[V|X]|_], V0, X) :- V == V0, !.
allocated([_|Alloc], V0, X) :- allocated(Alloc, V0, X).

%%% S register
assign_sreg(X, Reg, Seen, GTI0, GTI) :- \+ ground(X), !,
	pl2am_error([X,must,be,ground,term,in,assign_sreg(X,Reg,Seen,GTI0,GTI)]),
	fail.
assign_sreg(X, Reg, Seen, [SN,SAlloc,SInstrs], [SN,SAlloc,SInstrs]) :-
	allocated(SAlloc, X, [Reg,Seen]),
	!.
assign_sreg(X:T, Reg, Seen, [SN,SAlloc,SInstrs], [SN1,SAlloc1,SInstrs]) :-
	assign_sreg0(T, SN, Reg),
	SN1 is SN+1,
	SAlloc1 = [[X:T,Reg,Seen]|SAlloc].

assign_sreg0(int, SN, si(SN)) :- !.
assign_sreg0(flo, SN, sf(SN)) :- !.
assign_sreg0(_,   SN,  s(SN)) :- !.
%assign_sreg0(con, SN, sc(SN)) :- !.
%assign_sreg0(str, SN, ss(SN)) :- !.
%assign_sreg0(lis, SN, sl(SN)) :- !.
%assign_sreg0(arr, SN, sa(SN)) :- !.

%%% incriment YN
inc_YN(y(YN), [XN,YN|Zs], [XN,YN1|Zs]) :- YN1 is YN+1.

%%% incriment PN
inc_PN(p(PN), [XN,YN,PN|Zs], [XN,YN,PN1|Zs]) :- PN1 is PN+1.

%%% add an instruction to GTI
add_instr(Instr, [SN,SAlloc,SInstrs0], [SN,SAlloc,[Instr|SInstrs0]]).

%%% add an allocation to LTI
add_alloc(E, [XN,YN,PN,Alloc0], [XN,YN,PN,[E|Alloc0]]).

/*****************************************************************
  Built-in Predicates and Constants
*****************************************************************/
builtin_meta_predicates((^), 2, [?,:]).
builtin_meta_predicates(call, 1, [:]).
builtin_meta_predicates(once, 1, [:]).
builtin_meta_predicates((\+), 1, [:]).
builtin_meta_predicates(findall, 3, [?,:,?]).
builtin_meta_predicates(bagof, 3, [?,:,?]).
builtin_meta_predicates(setof, 3, [?,:,?]).
builtin_meta_predicates(on_exception, 3, [?,:,:]).
builtin_meta_predicates(catch, 3, [:,?,:]).
builtin_meta_predicates(synchronized, 2, [?,:]).
builtin_meta_predicates(freeze, 2, [?,:]).

builtin_local_predicates(assert, 1, [:]).
builtin_local_predicates(asserta, 1, [:]).
builtin_local_predicates(assertz, 1, [:]).
builtin_local_predicates(retract, 1, [:]).
builtin_local_predicates(retractall, 1, [:]).
builtin_local_predicates(assert, 2, [:,?]).
builtin_local_predicates(asserta, 2, [:,?]).
builtin_local_predicates(assertz, 2, [:,?]).
builtin_local_predicates(retract, 2, [:,?]).
builtin_local_predicates(retractall, 2, [:,?]).
builtin_local_predicates(save, 2, [?,:]).
builtin_local_predicates(clause, 2, [:,?]).
builtin_local_predicates(abolish, 1, [:]).
builtin_local_predicates(log_level, 1, [:]).
builtin_local_predicates(loggable, 1, [:]).
builtin_local_predicates(log_error, 2, [:,?]).
builtin_local_predicates(log, 2, [:,?]).
builtin_local_predicates(log, 3, [:,?,?]).
builtin_local_predicates(log, 4, [:,?,?,?]).
builtin_local_predicates(log, 5, [:,?,?,?,?]).
builtin_local_predicates(log, 6, [:,?,?,?,?,?]).
builtin_local_predicates(log, 7, [:,?,?,?,?,?,?]).
builtin_meta_predicates(with_mutex, 2, [?,:]).

% Control constructs
builtin_inline_predicates(fail).
builtin_inline_predicates('$get_level'(_)).
builtin_inline_predicates('$neck_cut').
builtin_inline_predicates('$cut'(_)).
% Term unification
builtin_inline_predicates('$unify'(_,_)).
builtin_inline_predicates('$not_unifiable'(_,_)).
% Type testing
builtin_inline_predicates(var(_)).
builtin_inline_predicates(atom(_)).
builtin_inline_predicates(integer(_)).
builtin_inline_predicates(long(_)).
builtin_inline_predicates(float(_)).
builtin_inline_predicates(atomic(_)).
builtin_inline_predicates(nonvar(_)).
builtin_inline_predicates(number(_)).
builtin_inline_predicates(java(_)).
builtin_inline_predicates(java(_,_)).
builtin_inline_predicates(closure(_)).
builtin_inline_predicates(ground(_)).
% Term comparison
builtin_inline_predicates('$equality_of_term'(_,_)).
builtin_inline_predicates('$inequality_of_term'(_,_)).
builtin_inline_predicates('$after'(_,_)).
builtin_inline_predicates('$before'(_,_)).
builtin_inline_predicates('$not_after'(_,_)).
builtin_inline_predicates('$not_before'(_,_)).
builtin_inline_predicates('$identical_or_cannot_unify'(_,_)).
% Term creation and decomposition
builtin_inline_predicates(copy_term(_,_)).
% Arithmetic evaluation
builtin_inline_predicates(is(_,_)).
builtin_inline_predicates('$abs'(_,_)).
builtin_inline_predicates('$asin'(_,_)).
builtin_inline_predicates('$acos'(_,_)).
builtin_inline_predicates('$atan'(_,_)).
builtin_inline_predicates('$bitwise_conj'(_,_,_)).
builtin_inline_predicates('$bitwise_disj'(_,_,_)).
builtin_inline_predicates('$bitwise_exclusive_or'(_,_,_)).
builtin_inline_predicates('$bitwise_neg'(_,_)).
builtin_inline_predicates('$ceil'(_,_)).
builtin_inline_predicates('$cos'(_,_)).
builtin_inline_predicates('$degrees'(_,_)).
builtin_inline_predicates('$exp'(_,_)).
builtin_inline_predicates('$float_quotient'(_,_,_)).
builtin_inline_predicates('$floor'(_,_)).
builtin_inline_predicates('$int_quotient'(_,_,_)).
builtin_inline_predicates('$log'(_,_)).
builtin_inline_predicates('$max'(_,_,_)).
builtin_inline_predicates('$min'(_,_,_)).
builtin_inline_predicates('$minus'(_,_,_)).
builtin_inline_predicates('$mod'(_,_,_)).
builtin_inline_predicates('$multi'(_,_,_)).
builtin_inline_predicates('$plus'(_,_,_)).
builtin_inline_predicates('$pow'(_,_,_)).
builtin_inline_predicates('$radians'(_,_)).
builtin_inline_predicates('$rint'(_,_)).
builtin_inline_predicates('$round'(_,_)).
builtin_inline_predicates('$shift_left'(_,_,_)).
builtin_inline_predicates('$shift_right'(_,_,_)).
builtin_inline_predicates('$sin'(_,_)).
builtin_inline_predicates('$sqrt'(_,_)).
builtin_inline_predicates('$tan'(_,_)).
builtin_inline_predicates('$float'(_,_)).
builtin_inline_predicates('$float_integer_part'(_,_)).
builtin_inline_predicates('$float_fractional_part'(_,_)).
builtin_inline_predicates('$truncate'(_,_)).
builtin_inline_predicates('$sign'(_,_)).
% Arithmetic comparison
builtin_inline_predicates('$arith_equal'(_,_)).
builtin_inline_predicates('$arith_not_equal'(_,_)).
builtin_inline_predicates('$greater_or_equal'(_,_)).
builtin_inline_predicates('$greater_than'(_,_)).
builtin_inline_predicates('$less_or_equal'(_,_)).
builtin_inline_predicates('$less_than'(_,_)).

builtin_arith_constant(random).
builtin_arith_constant(pi).
builtin_arith_constant(e).

/*****************************************************************
  Eliminate disjunctions
*****************************************************************/
%  The clause a :- b;c is converted into a :- b. and a :- c.
%  In addition,
%    (C1 -> C2)        is converted into ((C1,!,C2) ; fail).
%    ((C1 -> C2) ; C3) is converted into ((C1,!,C2) ; C3).
%    not(C)            is converted into ((C,!,fail) ; true).
%    \+(C)             is converted into ((C,!,fail) ; true).
%  And then all of disjunctions are eliminated.
%
%  Note: this is based on flatten.pl in holmer's benchmark.

eliminate_disj(Cl, NewCl, DummyCls) :-
	extract_disj(Cl, NewCl, Disjs, []),
	treat_disj(Disjs, DummyCls, []).

extract_disj(Cl, Cl) --> {var(Cl)}, !.
extract_disj(Cl, (H :- NewB)) --> {Cl = (H :- B)}, !,
	extract_disj(B, NewB, Cl).
extract_disj(Cl, Cl) --> !.

extract_disj(G, G, _) --> {var(G)}, !.
extract_disj((G1, G2), (NewG1, NewG2), Cl) --> !,
	extract_disj(G1, NewG1, Cl),
	extract_disj(G2, NewG2, Cl).
extract_disj(G, NewG, Cl) --> {is_disj(G, DisjG)}, !,
	{retract(dummy_clause_counter(N))},
	[disj(DisjG, N, NewG, Cl)],
	{N1 is N+1},
	{assert(dummy_clause_counter(N1))}.
extract_disj(G, G, _) --> !.

is_disj((C1->C2), ((C1,!,C2);fail)) :- !.
is_disj(((C1->C2);C3), ((C1,!,C2);C3)) :- !.
is_disj((C1;C2), (C1;C2)) :- !.
is_disj(not(C),((C,!,fail);true)) :- !.
is_disj(\+(C),((C,!,fail);true)).

treat_disj([]) --> !.
treat_disj([disj((A;B),N,X,C)|Disjs]) -->
	{variables((A;B), Vars)},
	{variables(C, CVars)},
	{intersect_vars(Vars, CVars, Args)},
	{clause(file_name(File), _)},
	{list_to_string(['$dummy_', N, '_', File], Name)},
	{X =.. [Name|Args]},
	{copy_term((X :- A), DummyCla)},
	{copy_term((X :- B), DummyClb)},
	[DummyCla],
	[DummyClb],
	treat_disj(Disjs).

intersect_vars(V1, V2, Out) :-
	sort(V1, Sorted1),
	sort(V2, Sorted2),
	intersect_sorted_vars(Sorted1, Sorted2, Out).

intersect_sorted_vars([], _, []) :- !.
intersect_sorted_vars(_, [], []).
intersect_sorted_vars([X|Xs], [Y|Ys], [X|Rs]) :- X == Y, !,
	intersect_sorted_vars(Xs, Ys, Rs).
intersect_sorted_vars([X|Xs], [Y|Ys], Rs) :- X @< Y, !,
	intersect_sorted_vars(Xs,[Y|Ys],Rs).
intersect_sorted_vars([X|Xs], [Y|Ys], Rs) :- X @> Y, !,
	intersect_sorted_vars([X|Xs],Ys,Rs).

/*****************************************************************
  Utilities
*****************************************************************/
%%% print
pl2am_error(M) :-
	clause(file_line(File,Line),_),
	!,
	pl2am_message(user_error, ['***','PL2ASM','ERROR',in,File,at,Line,':'|M]).

pl2am_error(M) :- pl2am_message(user_error, ['***','PL2ASM','ERROR'|M]).

pl2am_message(M) :- pl2am_message(user_output, M).

pl2am_message(Stream, []) :- nl(Stream), flush_output(Stream).
pl2am_message(Stream, [M|Ms]) :- write(Stream, M), write(Stream, ' '), pl2am_message(Stream, Ms).

%%% format
mode_expr([]).
mode_expr([M|Ms]) :- nonvar(M), pl2am_member(M, [:,;,+,-,?]), !, mode_expr(Ms).

predspec_expr(F/A) :- atom(F), integer(A).

%%% list
pl2am_append([], Zs, Zs).
pl2am_append([X|Xs], Ys, [X|Zs]) :- pl2am_append(Xs, Ys, Zs).

pl2am_rev(L, R) :- pl2am_rev(L, [], R).
pl2am_rev([], R, R).
pl2am_rev([X|L], Y, R) :- pl2am_rev(L, [X|Y], R).

pl2am_member(X, [X|_]).
pl2am_member(X, [_|Ys]) :- pl2am_member(X, Ys).

pl2am_memq(X, [Y|_]) :- X==Y, !.
pl2am_memq(X, [_|Ys]) :- pl2am_memq(X, Ys).

flatten_list([]) --> !.
flatten_list([L1|L2]) --> !, flatten_list(L1), flatten_list(L2).
flatten_list(L) --> [L].

flatten_code([]) --> !.
flatten_code([(L: C)|Code]) --> !,
	[L: []],
	flatten_code([C|Code]).
flatten_code([Code1|Code2]) --> !,
	flatten_code(Code1),
	flatten_code(Code2).
flatten_code(Code) --> [Code].

pl2am_maplist(_,[],[]).
pl2am_maplist(Goal, [Elem1|Tail1], [Elem2|Tail2]) :-
	Term =.. [Goal,Elem1,Elem2],
	call(Term),
	pl2am_maplist(Goal,Tail1,Tail2).

pl2am_resolve_file(BaseFile, File, File):-
	File = Package:ResourceName,
	!.

pl2am_resolve_file(BaseFile, File, IncludeFile):-
	pl2am_file_directory(BaseFile,Directory),
	atom_concat(Directory, File, IncludeFile).

pl2am_file_directory(BaseFile,Directory):-
	atom_chars(BaseFile,BaseFileChars),
	pl2am_rev(BaseFileChars, BaseFileCharsRev),
	pl2am_file_directory_(BaseFileCharsRev, DirectoryCharsRev),
	pl2am_add_directory_separator(DirectoryCharsRev, DirectoryCharsRev1),
	pl2am_rev(DirectoryCharsRev1,DirectoryChars),
	atom_chars(Directory,DirectoryChars).

pl2am_file_directory_([],[]):-!.
pl2am_file_directory_(['\\'],['\\']):-!.
pl2am_file_directory_(['/'],['/']):-!.
pl2am_file_directory_(['\\'|BaseFileCharsRev], BaseFileCharsRev):-!.
pl2am_file_directory_(['/'|BaseFileCharsRev], BaseFileCharsRev):-!.
pl2am_file_directory_([_|BaseFileCharsRev],DirectoryCharsRev):-
	pl2am_file_directory_(BaseFileCharsRev,DirectoryCharsRev).

pl2am_add_directory_separator(D,D):-
	D = ['/'|_],
	!.
pl2am_add_directory_separator(D,D):-
	D = ['\\'|_],
	!.
pl2am_add_directory_separator(D,['/'|D]).

%%% transform
conj_to_list(X, _) :-  var(X), !,
	pl2am_error([variable,X,can,not,be,converted,to,'[A|B]',expression]),
	fail.
conj_to_list(((X1,X2),Xs), Y) :- !, conj_to_list((X1,(X2,Xs)), Y).
conj_to_list((X,Xs), [X|Zs]) :- !, conj_to_list(Xs, Zs).
conj_to_list((X), [X]).

list_to_string(List, String) :-
	list_to_chars(List, Chars0),
	flatten_list(Chars0, Chars, []),
	atom_codes(String, Chars).

list_to_chars([], []) :- !.
list_to_chars([L|Ls], [C|Cs]) :- atom(L), !,
	atom_codes(L, C),
	list_to_chars(Ls, Cs).
list_to_chars([L|Ls], [C|Cs]) :- number(L), !,
	number_codes(L, C),
	list_to_chars(Ls, Cs).

list_to_conj(X, Y) :-
	flatten_list(X, L, []),
	list_to_conj0(L, Y).

list_to_conj0(X, _) :- var(X), !,
	pl2am_error([variable,X,can,not,be,converted,to,'(A,B)',expression]),
	fail.
list_to_conj0([X], (X)).
list_to_conj0([X|Xs], (X,Ys)) :- !, list_to_conj0(Xs, Ys).

%%% misc
variables(X, Vs) :- variables(X, [], Vs).

variables(X, Vs, Vs) :- var(X), pl2am_memq(X, Vs), !.
variables(X, Vs, [X|Vs]) :- var(X), !.
variables(X, Vs0, Vs0) :-  atomic(X), !.
variables([X|Xs], Vs0, Vs) :- !, variables(X, Vs0, Vs1), variables(Xs, Vs1, Vs).
variables(X, Vs0, Vs) :- X =.. Xs, variables(Xs, Vs0, Vs).

count_variable(V, X, 1) :- V == X, !.
count_variable(_, X, 0) :- var(X), !.
count_variable(_, X, 0) :- atomic(X), !.
count_variable(V, [X|Y], N) :- !,
	count_variable(V, X, N1),
	count_variable(V, Y, N2),
	N is N1 + N2.
count_variable(V, X, N) :-
	X =.. Xs,
	count_variable(V, Xs, N).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% END
% written by SICStus Prolog 3.12.8

/*****************************************************************
Time-stamp: <2008-10-29 10:42:42 banbara>

NAME
       am2cpp: Translating WAM-based Intermediate Code into Java

USAGE
       # sicstus
       ?- [am2cpp].
       ?- am2cpp([File]).

       # sicstus
       ?- [am2cpp].
       ?- am2cpp([File, Dir]).

PARAMETERS
       File is an input WAM-based Intermediate file name.

DESCRIPTION
       This program translates WAM-based intermediate codes into Java.
       For each predicate p/n, the file named "PRED_p_n.java" is generated.
       Generated files can be compiled and executed by usual
       java utilities (ex. javac) with the Prolog Cafe runtime system.

COPYRIGHT
       am2cpp (Translating WAM-based Intermediate Code into Java)
       Copyright (C) 1997-2008 by
          Mutsunori Banbara (banbara@kobe-u.ac.jp) and
          Naoyuki Tamura (tamura@kobe-u.ac.jp)

SEE ALSO
       http://kaminari.istc.kobe-u.ac.jp/PrologCafe/
*****************************************************************/

/*****************************************************************
  Declarations
*****************************************************************/
:- op(1170, xfx, (:-)).
:- op(1170, xfx, (-->)).
:- op(1170,  fx, (:-)).
:- op(1170,  fx, (?-)).
:- op(1150,  fx, (public)).
:- op(1150,  fx, (package)).  % Prolog Cafe specific

:- op(1170, xfx, (:-)).
:- op(1170, xfx, (-->)).
:- op(1170,  fx, (:-)).
:- op(1170,  fx, (?-)).
:- op( 500, yfx, (#)).
:- op(1150,  fx, (dynamic)).
:- op(1150,  fx, (meta_predicate)).
:- op(1150,  fx, (package)).
:- op(1150,  fx, (public)).
:- op(1150,  fx, (import)).
:- op(1150,  fx, (mode)).
:- op(1150,  fx, (multifile)).
:- op(1150,  fx, (block)).

:- dynamic dest_dir/1.
:- dynamic current_arity/1.
:- dynamic current_functor/1.
:- dynamic current_package/1.
:- dynamic domain_definition/1.
:- dynamic inlined/2.

% :- module('TauPrologG.compiler.am2cpp', [main/0,am2cpp/1]).
package(X):- nb_setval(package,X).
:- package 'TauPrologG.compiler.am2cpp'.
:- public main/0, am2cpp/1.
/*****************************************************************
  Main
*****************************************************************/
main_am2cpp :-
	read(X),
	am2cpp(X).

pl2cpp([File]) :- !, pl2cpp([File, '.']).
pl2cpp([File,Dir]) :- am2cpp([File,Dir]).

am2cpp([File]) :- !, am2cpp([File, '.']).
am2cpp([File,Dir]) :-
	retractall(dest_dir(_)),
	assert(dest_dir(Dir)),
	open(File, read, In),
	repeat,
	  read(In, X),
	  write_java(X, In),
	X == end_of_file,
	!,
	close(In),
	write_domains.

write_domains:-
	clause(dest_dir(Dir),_),
	findall(D,domain_definition(D),LD),
	% on some platforms (like SWI prolog) predicate write_domain_definitions might be not available
	% so wrap it with catch and produce warning message
	catch('TauPrologG.builtin':call('TauPrologG.builtin':write_domain_definitions(Dir,LD)),_,am2cpp_message([domain,definitions,are,not,supported,and,skipped])).

write_java(X, _) :- var(X), !,
	am2cpp_error([unbound,variable,is,found]),
	fail.
write_java(end_of_file, _) :- !.
write_java((:- G), _) :- !, call(G).
write_java(begin_predicate(P, F/A), In) :-
	clause(dest_dir(Dir), _),
	retractall(current_package(_)),
	retractall(current_arity(_)),
	retractall(current_functor(_)),
	retractall(inlined(_,_)),
	assert(current_package(P)),
	assert(current_arity(A)),
	assert(current_functor(F)),
	predicate_encoding(F, F1),
	package_encoding(P, PDir),
	list_to_string([Dir,'/',PDir], SrcDir),
	list_to_string([SrcDir,'/','PRED_',F1,'_',A,'.java'], SrcFile),
	mkdirs(SrcDir),
	open(SrcFile, write, Out),
	write(Out, 'package '),
	  write_package(P, Out),
	  write(Out, ';'),
	  nl(Out),
	repeat,
	  read(In, X),
	  write_java0(X, In, Out),
	X == end_predicate(P, F/A),
	close(Out),
	!.
write_java(X, _) :-
	am2cpp_error([X,is,an,invalid,argument,in,write_java/2]),
	fail.

/*****************************************************************
  Write Java
*****************************************************************/
write_java0(X, _, _) :- var(X), !,
	am2cpp_error([unbound,variable,is,found]),
	fail.
write_java0([], _, _) :- !.
write_java0([X|Xs], In, Out) :- !,
	write_java0(X, In, Out),
	write_java0(Xs, In, Out).
write_java0(end_predicate(_, _), _, Out) :- !,
	tab(Out, 4),
	write(Out, '}'), nl(Out),
	write(Out, '}'), nl(Out).
write_java0(comment(Comment), _, Out) :- !,
	numbervars(Comment, 0, _),
	tab(Out, 4),
	write(Out, '// '),
	writeq(Out, Comment), nl(Out).
write_java0(debug(Comment), _, Out) :- !,
	numbervars(Comment, 0, _),
	write(Out, '// '),
	writeq(Out, Comment), nl(Out).
write_java0(info([FA,File|_]), _, Out) :- !,
	write(Out, '/*'), nl(Out),
        write(Out, ' '), writeq(Out, FA),
        write(Out, ' defined in '), writeq(Out, File), nl(Out),
        write(Out, ' This file is generated by Prolog Cafe.'), nl(Out),
        write(Out, ' PLEASE DO NOT EDIT!'), nl(Out),
        write(Out, '*/'), nl(Out).
write_java0(import_package(P), _, Out) :- !,
	write(Out, 'import '),
	write_package(P, Out),
	write(Out, '.*;'), nl(Out).
write_java0(import_package(P,FA), _, Out) :- !,
	write(Out, 'import '),
	write_package(P, Out),
	write(Out, '.'),
	(FA = _/_ ->
	    write_class_name(FA, Out)
	    ;
	    write_package(FA, Out)
	),
	write(Out, ';'), nl(Out).
write_java0((Label: Instruction), In, Out) :- !,
	write_label(Label, Out),
	write_java0(Instruction, In, Out).
write_java0(label(fail/0), _, Out) :- !,
	tab(Out, 4),
	write(Out, 'private static final Operation '),
	write_index(fail/0, Out),
	write(Out, ' = TauPrologG.Failure.FAIL_0'),
	write(Out, ';'), nl(Out).
write_java0(label(L), _, Out) :- !.
%	tab(Out, 4),
%	write(Out, 'static final Operation '),
%	write_index(L, Out),
%	write(Out, ' = new '),
%	write_class_name(L, Out),
%	write(Out, '();'), nl(Out).
write_java0(goto(L), _, Out) :- !,
	tab(Out, 8),
	write(Out, 'return '),
	write_index(L, Out),
	write(Out, '(engine);'), nl(Out).
write_java0(setB0, _, Out) :- !,
	tab(Out, 8),
	write(Out, 'engine.setB0();'), nl(Out).
write_java0(deref(_,void), _, _) :- !.
write_java0(deref(Ri,Rj), _, Out) :- !,
	tab(Out, 8),
	write_reg(Rj, Out),
	write(Out, ' = '),
	write_reg(Ri, Out),
	write(Out, '.DeRef();'), nl(Out).
write_java0(set(_,void), _, _) :- !.
write_java0(set(Ri,Rj), _, Out) :- !,
	tab(Out, 8),
	write_reg(Rj, Out),
	write(Out, ' = '),
	write_reg(Ri, Out),
	write(Out, ';'), nl(Out).
write_java0(decl_term_vars([]), _, _) :- !.
write_java0(decl_term_vars(L), _, Out) :- !,
	tab(Out, 8),
	write(Out, 'Term '),
	write_reg_args(L, Out),
	write(Out, ';'), nl(Out).
write_java0(decl_pred_vars([]), _, _) :- !.
write_java0(decl_pred_vars(L), _, Out) :- !,
	tab(Out, 8),
	write(Out, 'Operation '),
	write_reg_args(L, Out),
	write(Out, ';'), nl(Out).
write_java0(put_cont(BinG,C), _, Out) :- !,
	(BinG = P:G -> true ; BinG = G),
	functor(G, F, A0),
	A is A0-1,
	G =.. [F|Args],
	tab(Out, 8),
	write_reg(C, Out),
	write(Out, ' = new '),
	(nonvar(P) -> write_package(P, Out), write(Out, '.') ; true),
	write_class_name(F/A, Out),
	write(Out, '('),
	write_reg_args(Args, Out),
	write(Out, ');'), nl(Out).
write_java0(execute(cont), _, Out) :- !,
	tab(Out, 8),
	write(Out, 'return cont;'), nl(Out).
write_java0(execute(BinG), _, Out) :- !,
	(BinG = P:G -> true ; BinG = G),
	functor(G, F, A0),
	A is A0-1,
	G =.. [F|Args],
	tab(Out, 8),
	write(Out, 'return new '),
	(nonvar(P) -> write_package(P, Out), write(Out, '.') ; true),
	write_class_name(F/A, Out),
	write(Out, '('),
	write_reg_args(Args, Out),
	write(Out, ');'), nl(Out).
write_java0(inline(G), In, Out) :-
	write_inline(G, In, Out),
	!.
write_java0(new_hash(Tag,I), _, Out) :- !,
	tab(Out, 4),
	write(Out, 'private static final java.util.HashMap<Term, Operation> '),
	(Tag == int -> write(Out, 'Int') ; write(Out, Tag)),
	write(Out, ' = new java.util.HashMap<Term, Operation>('),
	write(Out, I),
	write(Out, ');'), nl(Out).
write_java0(put_hash(X,L,Tag), _, Out) :- !,
	tab(Out, 8),
	(Tag == int -> write(Out, 'Int') ; write(Out, Tag)),
	write(Out, '.put('),
	(clause(inlined(X,F/A),_) ->
	    write(Out, 'Const.intern("'), write_constant(F, Out), write(Out, '",'), write(Out, A), write(Out, ')')
	    ;
	    write_reg(X, Out)
	),
	write(Out, ', '),
	write_method_ref(L, Out),
	write(Out, ');'), nl(Out).
write_java0(static(Instrs), In, Out) :- !,
	tab(Out, 4),
	write(Out, 'static {'), nl(Out),
	write_java0(Instrs, In, Out),
	tab(Out, 4),
	write(Out, '}'), nl(Out).
%%% Put Instructions
write_java0(put_var(X), _, Out) :- !,
	tab(Out, 8),
	write_reg(X, Out),
	write(Out, ' = new Var(engine);'), nl(Out).
write_java0(put_int(I,X), _, Out) :-
	long(I),
	!,
	tab(Out, 4),
	write(Out, 'private static final LongTerm '),
	write_reg(X, Out),
	write(Out, ' = new LongTerm('),
	write(Out, I),
	write(Out, 'L);'),
	nl(Out).
write_java0(put_int(I,X), _, Out) :- !,
	tab(Out, 4),
	write(Out, 'private static final IntegerTerm '),
	write_reg(X, Out),
	write(Out, ' = new IntegerTerm('),
	(java_integer(I) -> true; write(Out, 'new java.math.BigInteger("')),
	write(Out, I),
	(java_integer(I) -> true; write(Out, '")')),
	write(Out, ');'), nl(Out).
write_java0(put_float(F,X), _, Out) :- !,
	tab(Out, 4),
	write(Out, 'private static final Float '),
	write_reg(X, Out),
	write(Out, ' = new Float('),
	write(Out, F),
	write(Out, ');'), nl(Out).
write_java0(put_con(F/A,X), _, Out) :- !,
	assert(inlined(X,F/A)).
write_java0(put_con(C,X), _, Out) :- !,
	tab(Out, 4),
	write(Out, 'private static final Const '),
	write_reg(X, Out),
	write(Out, ' = Const.intern("'),
	(C = F/A ->
	    write_constant(F, Out), write(Out, '", '), write(Out, A), write(Out, ');')
	    ;
	    write_constant(C, Out), write(Out, '");')
	),
	nl(Out).
write_java0(put_list(Xi,Xj,Xk), _, Out) :- !,
	(Xk = s(_) ->
	    tab(Out, 4), write(Out, 'private static final ListTerm ')
	    ;
	    tab(Out, 8)
	),
	write_reg(Xk, Out),
	write(Out, ' = LIST('),
	write_reg(Xi, Out),
	write(Out, ', '),
	write_reg(Xj, Out),
	write(Out, ');'), nl(Out).
write_java0(put_str(Xi,Y,Xj), _, Out) :- !,
	(Xj = s(_) ->
	    tab(Out, 4), write(Out, 'private static final .Fun ')
	    ;
	    tab(Out, 8)
	),
	write_reg(Xj, Out),
	write(Out, ' = F('),
	(clause(inlined(Xi,F/A),_) ->
	    write(Out, '"'), write_constant(F, Out), write(Out, '"')
	    ;
	    write_reg(Xi, Out)
	),
	write(Out, ', '),
	write_reg(Y, Out),
	write(Out, ');'), nl(Out).
write_java0(put_str_args(Xs,s(Y)), _, Out) :- !,
    assert(inlined(s(Y),str_args(Xs))).
write_java0(put_str_args(Xs,Y), _, Out) :- !,
	(Y = s(_) ->
	    tab(Out, 4), write(Out, 'private static final ')
	    ;
	    tab(Out, 8)
	),
	write(Out, 'Term[] '),
	write_reg(Y, Out),
	write(Out, ' = {'),
	write_reg_args(Xs, Out),
	write(Out, '};'), nl(Out).
write_java0(put_clo(G0, X), _, Out) :- !,
	(G0 = P:G -> true ; G0 = G),
	functor(G, F, A),
	G =.. [F|Args0],
	am2cpp_append(Args0, ['null'], Args),
	tab(Out, 8),
	write_reg(X, Out),
	write(Out, ' = new ClosureTerm(new '),
	(nonvar(P) -> write_package(P, Out), write(Out, '.') ; true),
	write_class_name(F/A, Out),
	write(Out, '('),
	write_reg_args(Args, Out),
	write(Out, '));'), nl(Out).
%%% Get Instructions
write_java0(get_val(Xi,Xj), _, Out) :- !,
	tab(Out, 8),
	write(Out, 'if (! '), write_reg(Xi, Out), write(Out, '.unify('),
	write_reg(Xj, Out), write(Out, ', engine.trail))'), nl(Out),
	tab(Out, 12),
	write(Out, 'return engine.fail();'), nl(Out).
write_java0(get_int(_,Xi,Xj), In, Out) :- !,
	write_java0(get_val(Xi, Xj), In, Out).
/*
write_java0(get_int(N,Xi,Xj), In, Out) :- !,
	write_java0(deref(Xj,Xj), In, Out),
	% read mode
	tab(Out, 8),
	write(Out, 'if ('), write_reg(Xj, Out), write(Out, ' .IsInt() || '), write_reg(Xj, Out), write(Out, ' instanceof LongTerm){'), nl(Out),
	tab(Out, 12),
	write(Out, 'if (((NumberTerm) '), write_reg(Xj, Out), write(Out, ').intValue() != '),
	write(Out, N), write(Out, ')'), nl(Out),
	tab(Out, 16),
 	write(Out, 'return engine.fail();'), nl(Out),
	% write mode
	tab(Out, 8),
	write(Out, '} else if ('), write_reg(Xj, Out), write(Out, ' instanceof Var){'), nl(Out),
	tab(Out, 12),
	write(Out, '((Var) '), write_reg(Xj, Out), write(Out, ').bind('),
	write_reg(Xi, Out), write(Out, ', engine.trail);'), nl(Out),
	tab(Out, 8),
	% otherwise fail
 	write(Out, '} else {'), nl(Out),
	tab(Out, 12),
 	write(Out, 'return engine.fail();'), nl(Out),
	tab(Out, 8),
 	write(Out, '}'), nl(Out).
*/
write_java0(get_float(_,Xi,Xj), In, Out) :- !,
	write_java0(get_val(Xi, Xj), In, Out).
/*
write_java0(get_float(N,Xi,Xj), In, Out) :- !,
	write_java0(deref(Xj,Xj), In, Out),
	% read mode
	tab(Out, 8),
	write(Out, 'if ('), write_reg(Xj, Out), write(Out, ' instanceof Float){'), nl(Out),
	tab(Out, 12),
	write(Out, 'if (((Float) '), write_reg(Xj, Out), write(Out, ').doubleValue() != '),
	write(Out, N), write(Out, ')'), nl(Out),
	tab(Out, 16),
 	write(Out, 'return engine.fail();'), nl(Out),
	% write mode
	tab(Out, 8),
	write(Out, '} else if ('), write_reg(Xj, Out), write(Out, ' instanceof Var){'), nl(Out),
	tab(Out, 12),
	write(Out, '((Var) '), write_reg(Xj, Out), write(Out, ').bind('),
	write_reg(Xi, Out), write(Out, ', engine.trail);'), nl(Out),
	tab(Out, 8),
	% otherwise fail
 	write(Out, '} else {'), nl(Out),
	tab(Out, 12),
 	write(Out, 'return engine.fail();'), nl(Out),
	tab(Out, 8),
 	write(Out, '}'), nl(Out).
*/
write_java0(get_con(_,Xi,Xj), In, Out) :- !,
	write_java0(get_val(Xi, Xj), In, Out).

/*
write_java0(get_con(_,Xi,Xj), In, Out) :- !,
	write_java0(deref(Xj,Xj), In, Out),
	% read mode
	tab(Out, 8),
	write(Out, 'if ('), write_reg(Xj, Out), write(Out, ' .IsConst()){'), nl(Out),
	tab(Out, 12),
	write(Out, 'if (! '),
	write_reg(Xj, Out), write(Out, '.equals('), write_reg(Xi, Out),
	write(Out, '))'), nl(Out),
	tab(Out, 16),
 	write(Out, 'return engine.fail();'), nl(Out),
	% write mode
	tab(Out, 8),
	write(Out, '} else if ('), write_reg(Xj, Out), write(Out, ' instanceof Var){'), nl(Out),
	tab(Out, 12),
	write(Out, '((Var) '), write_reg(Xj, Out), write(Out, ').bind('),
	write_reg(Xi, Out), write(Out, ', engine.trail);'), nl(Out),
	tab(Out, 8),
	% otherwise fail
 	write(Out, '} else {'), nl(Out),
	tab(Out, 12),
 	write(Out, 'return engine.fail();'), nl(Out),
	tab(Out, 8),
 	write(Out, '}'), nl(Out).
 */
write_java0(get_ground(_,Xi,Xj), In, Out) :- !,
	write_java0(get_val(Xi, Xj), In, Out).
write_java0(get_list(X), In, Out) :- !,
	write_java0(deref(X,X), In, Out),
	read_instructions(2, In, Us),
	% read mode
	tab(Out, 8),
	write(Out, 'if ('), write_reg(X, Out), write(Out, ' IsList()){'), nl(Out),
	tab(Out, 12),
	write(Out, 'Term[] args = {('),
	write_reg(X, Out), write(Out, ').Arg(1),('),
	write_reg(X, Out), write(Out, ').Arg(2)};'), nl(Out),
	write_unify_read(Us, 0, Out),
	% write mode
	tab(Out, 8),
	write(Out, '} else if ('), write_reg(X, Out), write(Out, ' instanceof Var){'), nl(Out),
	write_unify_write(Us, Rs, Out),
	tab(Out, 12),
	write(Out, '((Var) '), write_reg(X, Out), write(Out, ').bind(LIST('),
	write_reg_args(Rs, Out), write(Out, '), engine.trail);'), nl(Out),
	% otherwise fail
	tab(Out, 8),
 	write(Out, '} else {'), nl(Out),
	tab(Out, 12),
 	write(Out, 'return engine.fail();'), nl(Out),
	tab(Out, 8),
 	write(Out, '}'), nl(Out).
write_java0(get_str(_F/A,Xi,Xj), In, Out) :- !,
	write_java0(deref(Xj,Xj), In, Out),
	read_instructions(A, In, Us),
	% simple unify
		write_unify_write(Us, Rs, Out),
        tab(Out, 12),
    	write(Out, 'if (!'), write_reg(Xj, Out), write(Out, '.unify(F('),
    	write_reg(Xi, Out), write(Out, ', '), write_reg_args(Rs, Out), write(Out, '), engine.trail)){'), nl(Out),
	    tab(Out, 16),
 	    write(Out, 'return engine.fail();'), nl(Out),
	    tab(Out, 12),
 	    write(Out, '}'), nl(Out).


/*	% read mode
	tab(Out, 8),
	write(Out, 'if ('), write_reg(Xj, Out), write(Out, ' .IsStruct()){'), nl(Out), %??? == F
	tab(Out, 12),
	write(Out, 'if (! '), write_reg(Xi, Out),
	write(Out, '.equals(((.Fun)'), write_reg(Xj, Out),
	write(Out, ').functor()))'), nl(Out),
	tab(Out, 16),
	write(Out, 'return engine.fail();'), nl(Out),
	tab(Out, 12),
	write(Out, 'Term[] args = ((.Fun)'),
	write_reg(Xj, Out), write(Out, ').args();'), nl(Out),
	write_unify_read(Us, 0, Out),
	% write mode
	tab(Out, 8),
	write(Out, '} else if ('), write_reg(Xj, Out), write(Out, ' instanceof Var){'), nl(Out),
	write_unify_write(Us, Rs, Out),
	tab(Out, 12),
	write(Out, 'Term[] args = {'), write_reg_args(Rs, Out), write(Out, '};'), nl(Out),
	tab(Out, 12),
	write(Out, '((Var) '), write_reg(Xj, Out), write(Out, ').bind(F('),
	write_reg(Xi, Out), write(Out, ', args), engine.trail);'), nl(Out),
	% otherwise fail
	tab(Out, 8),
 	write(Out, '} else {'), nl(Out),
	tab(Out, 12),
 	write(Out, 'return engine.fail();'), nl(Out),
	tab(Out, 8),
 	write(Out, '}'), nl(Out).
 */
%%% Choice Instructions
write_java0(try(Li,Lj), _, Out) :- !,
	clause(current_arity(A), _),
	tab(Out, 8),
	write(Out, 'engine.jtry'),
	( A =< 8 ->
		write(Out, A), write(Out, '(')
		;
		write(Out, '('), write(Out, A), write(Out, ', ')
	),
	write(Out, 'null, '),
	write_method_ref(Lj, Out),
	write(Out, ');'), nl(Out),
	tab(Out, 8),
	write(Out, 'return '), write_index(Li, Out), write(Out, '(engine);'), nl(Out).
write_java0(retry(Li,Lj), _, Out) :- !,
	tab(Out, 8),
	write(Out, 'engine.retry(null, '),
	write_method_ref(Lj, Out),
	write(Out, ');'), nl(Out),
	tab(Out, 8),
	write(Out, 'return '), write_index(Li, Out), write(Out, '(engine);'), nl(Out).
write_java0(trust(L), _, Out) :- !,
	tab(Out, 8),
	write(Out, 'engine.trust(null);'), nl(Out),
	tab(Out, 8),
	write(Out, 'return '), write_index(L, Out), write(Out, '(engine);'), nl(Out).
%%% Indexing Instructions
write_java0(switch_on_term(Lv,Li,Lf,Lc,Ls,Ll), _, Out) :- !,
	tab(Out, 8),
	write(Out, '{'), write_inline_start('switch_on_term', Out), nl(Out),
	tab(Out, 12),
	write(Out, 'Term x = engine.Areg[0].DeRef();'),nl(Out),
    write_if_method_call('x IsVar() ', Lv, Out),
    write_if_method_call('x .IsList() ', Ll, Out),
    write_if_method_call('x .IsStruct() ', Ls, Out),
    write_if_method_call('x .IsConst() ', Lc, Out),
    write_if_method_call('x .IsInt() ', Li, Out),
    write_if_method_call('x IsFloat() ', Lf, Out),
    tab(Out, 12),
    write(Out, 'return '), write_index(Lv, Out), write(Out, '(engine);'), nl(Out),
	tab(Out, 8),
	write(Out, '}'), write_inline_end(Out), nl(Out).
write_java0(switch_on_hash(Tag,_,L, _), _, Out) :- !,
	tab(Out, 8),
	write(Out, 'return engine.switch_on_hash('),
	(Tag == int -> write(Out, 'Int') ; write(Out, Tag)),
	write(Out, ', '),
	write_method_ref(L, Out), write(Out, ').exec(engine);'), nl(Out).
write_java0(Instruction, _, _) :-
	am2cpp_error([Instruction,is,an,invalid,instruction]),
	fail.

/*****************************************************************
  Write Label
*****************************************************************/
write_label(main(F/A, Modifier), Out) :- !,
	% Import class constants within translation unit
	clause(current_package(P), _),
	nl(Out),
%	write(Out, 'import static '), write_package(P, Out), write(Out, '.'),
%	write_class_name(F/A, Out), write(Out, '.*;'),
%	nl(Out),
	nl(Out),
	% Class definition
	(Modifier == (public) -> write(Out, 'public ') ; true),
	write(Out, 'final class '),
	write_class_name(F/A, Out),
	write(Out, ' extends '),
	write_predicate_base_class(A, Out),
	write(Out, ' {'), nl(Out).
write_label(F/A, Out) :- !,
	% instance variable declaration
	(A > 4 ->
	    nl(Out),
	    write_enum('private final Term ', arg, 5, A, ', ', ';', 4, Out), nl(Out)
	    ;
	    true
	),
	% constructor
	nl(Out),
	write_constructor(F/A, Out), nl(Out),
	% toString method
	nl(Out),
	write_to_string(F/A, Out), nl(Out),	
	% exec method
	nl(Out),
	tab(Out, 4), write(Out, '@Override'), nl(Out),
	tab(Out, 4),
	write(Out, 'public Operation exec(Prolog engine) {'), nl(Out).
write_label(L, Out) :-
	tab(Out, 4),
	write(Out, '}'), nl(Out),
	nl(Out),
	% method for control instructions and clauses
	tab(Out, 4),
	write(Out, 'private final static Operation '),
    write_index(L, Out),
	write(Out, '(Prolog engine) {'), nl(Out), !.
write_label(Instruction, _, _) :-
	am2cpp_error([Instruction,is,an,invalid,instruction]),
	fail.

/*****************************************************************
  Write Constructor
*****************************************************************/
write_constructor(F/A, Out) :-
	tab(Out, 4), write(Out, 'public '),
	write_class_name(F/A, Out), write(Out, '('),
	(A > 0 ->
	    write_enum('', 'Term a', 1, A, ', ', ', ', 0, Out)
	    ;
	    true
	),
	write(Out, 'Operation cont) {'), nl(Out),
	A > 0,
	for(I, 1, A),
	    tab(Out, 8),
	    write(Out, 'this.'), write(Out, arg), write(Out, I),
	    write(Out, ' = '),
	    write(Out, a), write(Out, I),
	    write(Out, ';'),  nl(Out),
	fail.
write_constructor(_, Out) :-
	tab(Out, 8),
	write(Out, 'this.cont = cont;'), nl(Out),
	tab(Out, 4),
	write(Out, '}').

write_enum(Head, Sym, SN, EN, Delim, _, Tab, Out) :-
	SN =< EN,
	tab(Out, Tab),
	write(Out, Head),
	for(I, SN, EN),
	    write(Out, Sym),
	    write(Out, I),
	    (I < EN -> write(Out, Delim) ; true),
	fail.
write_enum(_, _, SN, EN, _, Tail, _, Out) :-
	SN =< EN,
	write(Out, Tail).

/*****************************************************************
  Write Unify Instructions
*****************************************************************/
%%% Read Mode
write_unify_read([], _, _) :- !.
write_unify_read([unify_void(I)|Xs], N, Out) :- !,
	N1 is N+I,
	write_unify_read(Xs, N1, Out).
write_unify_read([X|Xs], N, Out) :-
	write_unify_r(X, N, Out),
	N1 is N+1,
	write_unify_read(Xs, N1, Out).

write_unify_r(X, _, _) :- var(X), !,
	am2cpp_error([unbound,variable,is,found]),
	fail.
write_unify_r(unify_var(X), N, Out) :- !,
	tab(Out, 12),
	write_reg(X, Out),
	write(Out, ' = '),
	write_reg(args(N), Out),
	write(Out, ';'), nl(Out).
write_unify_r(unify_val(X), N, Out) :- !,
	tab(Out, 12),
	write(Out, 'if (! '),
	write_reg(X, Out),
	write(Out, '.unify('),
	write_reg(args(N), Out),
	write(Out, ', engine.trail))'), nl(Out),
	tab(Out, 16),
	write(Out, 'return engine.fail();'), nl(Out).
write_unify_r(unify_int(_,X), N, Out) :- !,   %???
	write_unify_r(unify_val(X), N, Out).
write_unify_r(unify_float(_,X), N, Out) :- !, %???
	write_unify_r(unify_val(X), N, Out).
write_unify_r(unify_con(_,X), N, Out) :- !,   %???
	write_unify_r(unify_val(X), N, Out).
write_unify_r(unify_ground(_,X), N, Out) :- !,
	write_unify_r(unify_val(X), N, Out).
write_unify_r(X, _, _) :-
	am2cpp_error([X,is,an,invalid,instruction]),
	fail.

%%% Write Mode
write_unify_write([], [], _) :- !.
write_unify_write([unify_void(0)|Xs], Rs, Out) :- !,
	write_unify_write(Xs, Rs, Out).
write_unify_write([unify_void(I)|Xs], [void|Rs], Out) :-
	I > 0,
	!,
	I1 is I-1,
	write_unify_write([unify_void(I1)|Xs], Rs, Out).
write_unify_write([X|Xs], [R|Rs], Out) :-
	write_unify_w(X, R, Out),
	write_unify_write(Xs, Rs, Out).

write_unify_w(X, _, _) :- var(X), !,
	am2cpp_error([unbound,variable,is,found]),
	fail.
write_unify_w(unify_var(X), X, Out) :- !,
	tab(Out, 12),
	write_reg(X, Out),
	write(Out, ' = new Var(engine);'), nl(Out).
write_unify_w(unify_val(X), X, _) :- !.
write_unify_w(unify_int(_,X), X, _) :- !.
write_unify_w(unify_float(_,X), X, _) :- !.
write_unify_w(unify_con(_,X), X, _) :- !.
write_unify_w(unify_ground(_,X), X, _) :- !.
write_unify_w(X, _, _) :-
	am2cpp_error([X,is,an,invalid,instruction]),
	fail.

/*****************************************************************
  Write Inline
*****************************************************************/
write_inline(X, In, Out) :-
	write_inline_start(X, Out),
	write_inline0(X, In, Out),
	write_inline_end(Out).

write_inline_start(Goal, Out) :-
	tab(Out, 8),
	write(Out, '//START inline expansion of '), write(Out, Goal), nl(Out).
write_inline_end(Out) :-
	tab(Out, 8),
	write(Out, '//END inline expansion'), nl(Out).

% Control constructs
write_inline0(fail, _, Out) :- !,
	tab(Out, 8), write(Out, 'return engine.fail();'), nl(Out).
write_inline0('$get_level'(X), _, Out) :- !,
	write_if_fail(op('!', unify(X,#('new IntegerTerm'('engine.B0')))), [], 8, Out).
write_inline0('$neck_cut', _, Out)     :- !,
	tab(Out, 8), write(Out, 'engine.neckCut();'), nl(Out).
write_inline0('$cut'(X), _, Out)       :- !,
	write_deref_args([X], Out),
	tab(Out, 8),
	write(Out, 'if ('), write_reg(X, Out), write(Out, ' .IsInt()) {'), nl(Out),
	tab(Out, 12),
	write(Out, 'engine.cut(((IntegerTerm) '), write_reg(X, Out),
	write(Out, ').intValue());'), nl(Out),
	tab(Out, 8),
	write(Out, '} else {'), nl(Out),
	tab(Out, 12),
	write(Out, 'throw new IllegalTypeException("integer", '),
	write_reg(X, Out), write(Out, ');'), nl(Out),
	tab(Out, 8),
	write(Out, '}'), nl(Out).
% Term unification
write_inline0('$unify'(X,Y), _, Out)         :- !, write_if_fail(op('!', unify(X,Y)), [], 8, Out).
write_inline0('$not_unifiable'(X,Y), _, Out) :- !, write_if_fail(unify(X,Y), [], 8, Out).
% Type testing
write_inline0(var(X), _, Out)     :- !, write_if_fail(op('!', instanceof(X, 'Var')), [X], 8, Out).
write_inline0(atom(X), _, Out)    :- !, write_if_fail(op('!', instanceof(X, 'Const')), [X], 8, Out).
write_inline0(integer(X), _, Out) :- !, write_if_fail(op('!', instanceof(X, 'IntegerTerm')), [X], 8, Out).
write_inline0(long(X), _, Out)    :- !, write_if_fail(op('!', instanceof(X, 'LongTerm')), [X], 8, Out).
write_inline0(float(X), _, Out)   :- !, write_if_fail(op('!', instanceof(X, 'Float')), [X], 8, Out).
write_inline0(nonvar(X), _, Out)  :- !, write_if_fail(instanceof(X, 'Var'), [X], 8, Out).
write_inline0(number(X), _, Out)  :- !,
	NI = op('!', instanceof(X, 'IntegerTerm')),
	NL = op('!', instanceof(X, 'LongTerm')),
	ND = op('!', instanceof(X, 'Float')),
	write_if_fail(op('&&', op('&&', NI, ND), NL) , [X], 8, Out).
write_inline0(java(X), _, Out)    :- !, write_if_fail(op('!', instanceof(X, 'JavaObjectTerm')), [X], 8, Out).
write_inline0(closure(X), _, Out) :- !, write_if_fail(op('!', instanceof(X, 'ClosureTerm')), [X], 8, Out).
write_inline0(atomic(X), _, Out) :- !,
	NS = op('!', instanceof(X, 'Const')),
	NI = op('!', instanceof(X, 'IntegerTerm')),
	NL = op('!', instanceof(X, 'LongTerm')),
	ND = op('!', instanceof(X, 'Float')),
	write_if_fail(op('&&', NL, op('&&', NS, op('&&', NI, ND))) , [X], 8, Out).
write_inline0(java(X,Y), _, Out) :- !,
	write_if_fail(op('!', instanceof(X, 'JavaObjectTerm')), [X], 8, Out),
	EXP = #('Const.create'(@(getName(@(getClass(@(object(cast('JavaObjectTerm',X))))))))),
	write_if_fail(op('!', unify(Y,EXP)), [], 8, Out).
write_inline0(ground(X), _, Out) :- !, write_if_fail(op('!', @('isGround'(X))), [X], 8, Out).
% Term comparison
write_inline0('$equality_of_term'(X,Y), _, Out)   :- !, write_if_fail(op('!',@('equals'(X,Y))), [X,Y], 8, Out).
write_inline0('$inequality_of_term'(X,Y), _, Out) :- !, write_if_fail(@('equals'(X,Y)), [X,Y], 8, Out).
write_inline0('$after'(X,Y), _, Out)              :- !, write_if_fail(op('<=',@('compareTo'(X,Y)),0), [X,Y], 8, Out).
write_inline0('$before'(X,Y), _, Out)             :- !, write_if_fail(op('>=',@('compareTo'(X,Y)),0), [X,Y], 8, Out).
write_inline0('$not_after'(X,Y), _, Out)          :- !, write_if_fail(op('>', @('compareTo'(X,Y)),0), [X,Y], 8, Out).
write_inline0('$not_before'(X,Y), _, Out)         :- !, write_if_fail(op('<', @('compareTo'(X,Y)),0), [X,Y], 8, Out).
write_inline0('$identical_or_cannot_unify'(X,Y), _, Out) :- !,
	write_if_fail(op('&&', op('!',@('equals'(X,Y))), unify(X,Y)), [X,Y], 8, Out).
% Term creation and decomposition
write_inline0(copy_term(X,Y), _, Out) :- nonvar(X), nonvar(Y), !,
	write_if_fail(op('!', unify(Y, #('engine.copy'(X)))), [X], 8, Out).
% Arithmetic evaluation
write_inline0(is(X,Y), _, Out)                        :- !, write_arith(_,           Y, X, 8, Out).
write_inline0('$abs'(X,Y),  _, Out)                   :- !, write_arith('abs',       X, Y, 8, Out).
write_inline0('$asin'(X,Y), _, Out)                   :- !, write_arith('asin',      X, Y, 8, Out).
write_inline0('$acos'(X,Y), _, Out)                   :- !, write_arith('acos',      X, Y, 8, Out).
write_inline0('$atan'(X,Y), _, Out)                   :- !, write_arith('atan',      X, Y, 8, Out).
write_inline0('$bitwise_conj'(X,Y,Z), _, Out)         :- !, write_arith('and',       X, Y, Z, 8, Out).
write_inline0('$bitwise_disj'(X,Y,Z), _, Out)         :- !, write_arith('or',        X, Y, Z, 8, Out).
write_inline0('$bitwise_exclusive_or'(X,Y,Z), _, Out) :- !, write_arith('xor',       X, Y, Z, 8, Out).
write_inline0('$bitwise_neg'(X,Y), _, Out)            :- !, write_arith('not',       X, Y, 8, Out).
write_inline0('$ceil'(X,Y), _, Out)                   :- !, write_arith('ceil',      X, Y, 8, Out).
write_inline0('$cos'(X,Y), _, Out)                    :- !, write_arith('cos',       X, Y, 8, Out).
write_inline0('$degrees'(X,Y), _, Out)                :- !, write_arith('toDegrees', X, Y, 8, Out).
write_inline0('$exp'(X,Y), _, Out)                    :- !, write_arith('exp',       X, Y, 8, Out).
write_inline0('$float'(X,Y), _, Out)                  :- !, write_arith('toFloat',   X, Y, 8, Out).
write_inline0('$float_integer_part'(X,Y), _, Out)     :- !, write_arith('floatIntPart',   X, Y, 8, Out).
write_inline0('$float_fractional_part'(X,Y), _, Out)  :- !, write_arith('floatFractPart', X, Y, 8, Out).
write_inline0('$float_quotient'(X,Y,Z), _, Out)       :- !, write_arith('divide',    X, Y, Z, 8, Out).
write_inline0('$floor'(X,Y), _, Out)                  :- !, write_arith('floor',     X, Y, 8, Out).
write_inline0('$int_quotient'(X,Y,Z), _, Out)         :- !, write_arith('intDivide', X, Y, Z, 8, Out).
write_inline0('$log'(X,Y), _, Out)                    :- !, write_arith('log',       X, Y, 8, Out).
write_inline0('$max'(X,Y,Z), _, Out)                  :- !, write_arith('max',       X, Y, Z, 8, Out).
write_inline0('$min'(X,Y,Z), _, Out)                  :- !, write_arith('min',       X, Y, Z, 8, Out).
write_inline0('$minus'(X,Y,Z), _, Out)                :- !, write_arith('subtract',  X, Y, Z, 8, Out).
write_inline0('$mod'(X,Y,Z), _, Out)                  :- !, write_arith('mod',       X, Y, Z, 8, Out).
write_inline0('$multi'(X,Y,Z), _, Out)                :- !, write_arith('multiply',  X, Y, Z, 8, Out).
write_inline0('$plus'(X,Y,Z), _, Out)                 :- !, write_arith('add',       X, Y, Z, 8, Out).
write_inline0('$pow'(X,Y,Z), _, Out)                  :- !, write_arith('pow',       X, Y, Z, 8, Out).
write_inline0('$radians'(X,Y), _, Out)                :- !, write_arith('toRadians', X, Y, 8, Out).
write_inline0('$rint'(X,Y), _, Out)                   :- !, write_arith('rint',      X, Y, 8, Out).
write_inline0('$round'(X,Y), _, Out)                  :- !, write_arith('round',     X, Y, 8, Out).
write_inline0('$shift_left'(X,Y,Z), _, Out)           :- !, write_arith('shiftLeft', X, Y, Z, 8, Out).
write_inline0('$shift_right'(X,Y,Z), _, Out)          :- !, write_arith('shiftRight', X, Y, Z, 8, Out).
write_inline0('$sign'(X,Y), _, Out)                   :- !, write_arith('signum',    X, Y, 8, Out).
write_inline0('$sin'(X,Y), _, Out)                    :- !, write_arith('sin',       X, Y, 8, Out).
write_inline0('$sqrt'(X,Y), _, Out)                   :- !, write_arith('sqrt',      X, Y, 8, Out).
write_inline0('$tan'(X,Y), _, Out)                    :- !, write_arith('tan',       X, Y, 8, Out).
write_inline0('$truncate'(X,Y), _, Out)               :- !, write_arith('truncate',  X, Y, 8, Out).
% Arithmetic comparison
write_inline0('$arith_equal'(X,Y), _, Out)      :- !, write_arith_compare('!=', X, Y, 8, Out).
write_inline0('$arith_not_equal'(X,Y), _, Out)  :- !, write_arith_compare('==', X, Y, 8, Out).
write_inline0('$greater_or_equal'(X,Y), _, Out) :- !, write_arith_compare('<',  X, Y, 8, Out).
write_inline0('$greater_than'(X,Y), _, Out)     :- !, write_arith_compare('<=', X, Y, 8, Out).
write_inline0('$less_or_equal'(X,Y), _, Out)    :- !, write_arith_compare('>',  X, Y, 8, Out).
write_inline0('$less_than'(X,Y), _, Out)        :- !, write_arith_compare('>=', X, Y, 8, Out).

write_deref_args([], _) :- !.
write_deref_args([s(_)|Xs], Out) :- !,
	write_deref_args(Xs, Out).
write_deref_args([si(_)|Xs], Out) :- !, % ???
	write_deref_args(Xs, Out).
write_deref_args([sf(_)|Xs], Out) :- !, % ???
	write_deref_args(Xs, Out).
write_deref_args([X|Xs], Out) :-
	write_java0(deref(X,X), _, Out),
	write_deref_args(Xs, Out).

write_if_fail(Cond, Args, Tab, Out) :- nonvar(Cond), ground(Args), !,
	EXP  = if_then(Cond, 'return engine.fail()'),
	write_deref_args(Args, Out),
	write_inline_java(EXP, Tab, Out).

make_arith_arg(E, _) :- var(E), !, fail.
make_arith_arg(E, E) :- E = si(_), !.
make_arith_arg(E, E) :- E = sf(_), !.
%make_arith_arg(E, cast('NumberTerm',E)) :- E = a(_), !. %???
make_arith_arg(E, #('Arithmetic.evaluate'(E))).

write_arith(M, E, V, Tab, Out) :-
	make_arith_arg(E, A1),
	nonvar(V),
	(    nonvar(M) -> A0 =.. [M,A1], A = @(A0)
             ;    A = A1
	),
	%EXP  = try_catch(SENT, 'BuiltinException', ['e.goal = this','throw e']),
	EXP = if_then(op('!', unify(V,A)), 'return engine.fail()'),
	%write_deref_args([E], Out),
	write_inline_java(EXP, Tab, Out).

write_arith(M, E1, E2, V, Tab, Out) :-
	nonvar(M),
	make_arith_arg(E1, A1),
	make_arith_arg(E2, A2),
	nonvar(V),
	A0 =.. [M,A1,A2],
	A = @(A0),
	%EXP = try_catch(SENT, 'BuiltinException', ['e.goal = this','throw e']),
	EXP = if_then(op('!', unify(V,A)), 'return engine.fail()'),
	%write_deref_args([E1,E2], Out),
	write_inline_java(EXP, Tab, Out).

write_arith_compare(M, E1, E2, Tab, Out) :-
	nonvar(M),
	make_arith_arg(E1, A1),
	make_arith_arg(E2, A2),
	A0 =.. ['arithCompareTo',A1,A2],
	A = @(A0),
	%EXP = try_catch(SENT, 'BuiltinException', ['e.goal = this','throw e']),
	EXP = if_then(op(M, A, 0), 'return engine.fail()'),
	%write_deref_args([E1,E2], Out),
	write_inline_java(EXP, Tab, Out).

write_inline_java(X, _, _) :- var(X), !, fail.
write_inline_java([], _, _) :- !.
write_inline_java([X|Xs], Tab, Out) :- !,
	write_inline_java(X, Tab, Out),
	write_inline_java(Xs, Tab, Out).
write_inline_java(try_catch(TRY,EXCEPT,CATCH), Tab, Out) :- !,
	tab(Out, Tab),
	write(Out, 'try {'), nl(Out),
	Tab1 is Tab + 4,
	write_inline_java(TRY, Tab1, Out),
	tab(Out, Tab),
	write(Out, '} catch ('), write(Out, EXCEPT), write(Out, ' e) {'), nl(Out),
	write_inline_java(CATCH, Tab1, Out),
	tab(Out, Tab),
	write(Out, '}'), nl(Out).
write_inline_java(if_then(IF, THEN), Tab, Out) :- !,
	tab(Out, Tab),
	write(Out, 'if ('), write_inline_exp(IF, 0, Out), write(Out, ') {'), nl(Out),
	Tab1 is Tab + 4,
	write_inline_java(THEN, Tab1, Out),
	tab(Out, Tab),
	write(Out, '}'), nl(Out).
write_inline_java(if_then_else(IF, THEN, ELSE), Tab, Out) :- !,
	tab(Out, Tab),
	write(Out, 'if ('), write_inline_exp(IF, 0, Out), write(Out, ') {'), nl(Out),
	Tab1 is Tab + 4,
	write_inline_java(THEN, Tab1, Out),
	tab(Out, Tab),
	write(Out, '} else {'), nl(Out),
	write_inline_java(ELSE, Tab1, Out),
	tab(Out, Tab),
	write(Out, '}'), nl(Out).
write_inline_java(X, Tab, Out) :-
	tab(Out, Tab),
	write(Out, X), write(Out, ';'), nl(Out).

write_inline_exp(X, _, _) :- var(X), !, fail.
write_inline_exp([], _, _) :- !.
write_inline_exp([X], Tab, Out) :- !,
	write_inline_exp(X, Tab, Out).
write_inline_exp([X|Xs], Tab, Out) :- !,
	write_inline_exp(X, Tab, Out),
	write(Out, ','),
	write_inline_exp(Xs, 0, Out).
write_inline_exp(bracket(Exp), Tab, Out) :- !,
	tab(Out, Tab),
	write(Out, '('),
	write_inline_exp(Exp, 0, Out),
	write(Out, ')').
write_inline_exp(op(Op, Exp), Tab, Out) :- !,
	tab(Out, Tab),
	write(Out, Op), write(Out, ' '), write_inline_exp(Exp, 0, Out).
write_inline_exp(op(Op, Exp1, Exp2), Tab, Out) :- !,
	tab(Out, Tab),
	write_inline_exp(Exp1, 0, Out),
	write(Out, ' '),
	write(Out, Op),
	write(Out, ' '),
	write_inline_exp(Exp2, 0, Out).
write_inline_exp(instanceof(Exp,Class), Tab, Out) :- !,
	tab(Out, Tab),
	write(Out, '('),
	write_inline_exp(Exp, 0, Out),
	write(Out, ' instanceof '), write(Out, Class),
	write(Out, ')').
write_inline_exp(cast(Class,Exp), Tab, Out) :- !,
	tab(Out, Tab),
	write(Out, '(('), write(Out, Class), write(Out, ') '),
	write_inline_exp(Exp, 0, Out), write(Out, ')').
write_inline_exp(unify(X,Y), Tab, Out) :- !,
	tab(Out, Tab),
	write_inline_exp(X, 0, Out),
	write(Out, '.unify('),
	write_inline_exp(Y, 0, Out),
	write(Out, ', engine.trail)').
write_inline_exp(#(X), Tab, Out) :- !,
	X =.. [F|As],
	tab(Out, Tab),
	write(Out, F), write(Out, '('),
	write_inline_exp(As, 0, Out),
	write(Out, ')').
write_inline_exp(@(X), Tab, Out) :- !,
	X =.. [F|As],
	write_inline_method(F, As, Tab, Out).
write_inline_exp(X, Tab, Out) :- X = s(_), !,
	tab(Out, Tab), write_reg(X, Out).
write_inline_exp(X, Tab, Out) :- X = si(_), !,  % ???
	tab(Out, Tab), write_reg(X, Out).
write_inline_exp(X, Tab, Out) :- X = sf(_), !,  % ???
	tab(Out, Tab), write_reg(X, Out).
write_inline_exp(X, Tab, Out) :- X = a(_), !,
	tab(Out, Tab), write_reg(X, Out).
write_inline_exp(X, Tab, Out) :- X == void, !,  % ???
	tab(Out, Tab), write_reg(X, Out).
write_inline_exp(X, Tab, Out) :-
	tab(Out, Tab), write(Out, X).

write_inline_method(F, _, _, _) :- var(F), !, fail.
write_inline_method(_, A, _, _) :- var(A), !, fail.
write_inline_method(F, [A], Tab, Out) :- !,
	tab(Out, Tab),
	write_inline_exp(A, 0, Out),
	write(Out, '.'), write(Out, F), write(Out, '()').
write_inline_method(F, [A,B], Tab, Out) :-
	tab(Out, Tab),
	write_inline_exp(A, 0, Out),
	write(Out, '.'), write(Out, F), write(Out, '('),
	write_inline_exp(B, 0, Out), write(Out, ')').


/*****************************************************************
  Write Insert
*****************************************************************/
write_insert(X, _, _) :- var(X), !, fail.
write_insert([], _, _) :- !.
write_insert([X|Xs], _, Out) :-
	atom(X),
	write(Out, X), nl(Out),
	write_insert(Xs, _, Out).

/*****************************************************************
  Write toString(StringBuilder sb)
*****************************************************************/
write_to_string(F/A, Out):-
	tab(Out, 4), write(Out, '@Override'), nl(Out),
	tab(Out, 4), write(Out, 'public void toString(StringBuilder sb) {'), nl(Out),
	predicate_encoding(F, F1),
	tab(Out, 8), write(Out, 'sb.append("'), write(Out, F1),
	( A>0 -> 
		write(Out, '(");'), nl(Out),
		write_enum('','arg',1,A,'.toString(sb); sb.append(", "); ','.toString(sb);',8,Out), nl(Out),
		tab(Out, 8), write(Out, 'sb.append(")");'), nl(Out)
		;
		write(Out, '");'), nl(Out)
	),
	tab(Out, 4), write(Out, '}'), nl(Out).

/*****************************************************************
  Auxiliaries
*****************************************************************/

% Create a directory if missing
mkdirs(Dir) :- exists_directory(Dir), !.
mkdirs(Dir) :-
  file_directory_name(Dir, Parent),
  mkdirs(Parent),
  catch(make_directory(Dir),_,exists_directory(Dir)). % it is ok if we failed to create a directory, because it is already exist

% int
java_integer(X) :- integer(X), -2147483648 =< X, X =< 2147483647.

% Read Instructions
read_instructions(0, _, []) :- !.
read_instructions(N, In, [X|Xs]) :-
	N > 0,
	read(In, X),
	N1 is N-1,
	read_instructions(N1, In, Xs).

% Write package name
write_package(P, Out) :- !,
	write(Out, P).

% Write class name
write_class_name(L, Out) :-
	write(Out, 'PRED_'), write_index(L, Out).

% Write out base class name
write_predicate_base_class(0, Out) :- !, write(Out, 'Predicate').
write_predicate_base_class(1, Out) :- !, write(Out, 'Predicate.P1').
write_predicate_base_class(2, Out) :- !, write(Out, 'Predicate.P2').
write_predicate_base_class(3, Out) :- !, write(Out, 'Predicate.P3').
write_predicate_base_class(4, Out) :- !, write(Out, 'Predicate.P4').
write_predicate_base_class(_, Out) :- !, write(Out, 'Predicate.P4').

% Write method reference
write_method_ref(fail/0, Out):- !,
    write_index(fail/0, Out).
write_method_ref(R, Out):-
    clause(current_arity(A), _),
    clause(current_functor(F), _),
    write_class_name(F/A, Out),
    write(Out, '::'),
    write_index(R, Out).

% Write if method call for switch_on_term
write_if_method_call(Cond, fail/0, Out):-
    !,
    tab(Out, 12),
    write(Out, 'if ('), write(Out, Cond), write(Out, ') {'), nl(Out),
    tab(Out, 16),
    write(Out, 'return engine.fail();'), nl(Out),
    tab(Out, 12),
    write(Out, '}'), nl(Out).

write_if_method_call(Cond, Method, Out):-
    tab(Out, 12),
    write(Out, 'if ('), write(Out, Cond), write(Out, ') {'), nl(Out),
    tab(Out, 16),
    write(Out, 'return '), write_index(Method, Out), write(Out, '(engine);'), nl(Out),
    tab(Out, 12),
    write(Out, '}'), nl(Out).

% Write label
write_index(F/A, Out) :- !,
	write_pred_spec(F/A, Out).
write_index(L+I, Out) :-
	write_index(L, Out), write(Out, '_'), write(Out, I).

% Write constant name
write_constant(X, Out) :-
	constant_encoding(X, Y),
	write(Out, Y).

% Write predicate specification
write_pred_spec(F/A, Out) :-
	predicate_encoding(F, F1),
	write(Out, F1), write(Out, '_'), write(Out, A).

% Package name as directory
package_encoding(P, Dir) :-
  atom_codes(P, Chs0),
  package_encoding(Chs0, Chs, []),
  atom_codes(Dir, Chs).

package_encoding([]) --> !.
package_encoding([46|Xs]) --> !, [47], package_encoding(Xs).
package_encoding([X|Xs])  --> !, [X] , package_encoding(Xs).

% Predicate Encoding
predicate_encoding(X, Y) :-
	atom_codes(X, Chs0),
	pred_encoding(Chs0, Chs, []),
	atom_codes(Y, Chs).

pred_encoding([]) --> !.
pred_encoding([X|Xs]) -->
	pred_encoding_char(X),
	pred_encoding(Xs).

pred_encoding_char(X) --> {97 =< X, X =< 122}, !, [X]. % a..z
pred_encoding_char(X) --> {65 =< X, X =<  90}, !, [X]. % A..Z
pred_encoding_char(X) --> {48 =< X, X =<  57}, !, [X]. % 0..9
pred_encoding_char(95) --> !, [95].                    % '_'
pred_encoding_char(36) --> !, [36].                    % '$' ???
pred_encoding_char(X) --> {0 =< X, X =< 65535}, !,
	[36],  % '$'
	pred_encoding_hex(X).
pred_encoding_char(X) -->
	{am2cpp_error([X,is,an,invalid,character,code]), fail}.

pred_encoding_hex(X) -->
	{int_to_hex(X, [], H)},
	pred_encoding_hex_char(H).

pred_encoding_hex_char([])        --> !, [48,48,48,48]. % 0000
pred_encoding_hex_char([X])       --> !, [48,48,48, X]. % 000X
pred_encoding_hex_char([X,Y])     --> !, [48,48, X, Y]. % 00XY
pred_encoding_hex_char([X,Y,Z])   --> !, [48, X, Y, Z]. % 0XYZ
pred_encoding_hex_char([X,Y,Z,W]) --> !, [ X, Y, Z, W]. % XYZW

int_to_hex(0, H, H) :- !.
int_to_hex(D, H0, H) :-
	R is D mod 16,
	D1 is D//16,
	hex_map(R, R1),
	int_to_hex(D1, [R1|H0], H).

hex_map(10, 65) :- !. % 'A'
hex_map(11, 66) :- !. % 'B'
hex_map(12, 67) :- !. % 'C'
hex_map(13, 68) :- !. % 'D'
hex_map(14, 69) :- !. % 'E'
hex_map(15, 70) :- !. % 'F'
hex_map(X, Y) :- 0 =< X, X =<  9, number_codes(X, [Y]).

% Constant Encoding (especially, escape sequence)
constant_encoding(X, Y) :-
	atom_codes(X, Chs0),
	con_encoding(Chs0, Chs),  %???
	atom_codes(Y, Chs).

con_encoding([], []) :- !.
con_encoding([ 7|Xs], [92, 97|Ys]):- !, con_encoding(Xs, Ys). % \a
con_encoding([ 8|Xs], [92, 98|Ys]):- !, con_encoding(Xs, Ys). % \b
con_encoding([ 9|Xs], [92,116|Ys]):- !, con_encoding(Xs, Ys). % \t
con_encoding([10|Xs], [92,110|Ys]):- !, con_encoding(Xs, Ys). % \n
con_encoding([11|Xs], [92,118|Ys]):- !, con_encoding(Xs, Ys). % \v
con_encoding([12|Xs], [92,102|Ys]):- !, con_encoding(Xs, Ys). % \f
con_encoding([13|Xs], [92,114|Ys]):- !, con_encoding(Xs, Ys). % \r
con_encoding([34|Xs], [92, 34|Ys]):- !, con_encoding(Xs, Ys). % \"
con_encoding([39|Xs], [92, 39|Ys]):- !, con_encoding(Xs, Ys). % \'
con_encoding([92|Xs], [92, 92|Ys]):- !, con_encoding(Xs, Ys). % \\
con_encoding([X|Xs], [X|Ys]):- con_encoding(Xs, Ys).

% Write Register name
write_reg(X, _) :- var(X), !,
	am2cpp_error([register,expression,must,not,be,unbound,variable]),
	fail.
write_reg(void,   Out) :- !, write(Out, 'new Var(engine)').
/*
write_reg(ea(1),  Out) :- !, write(Out, 'engine.areg1').
write_reg(ea(2),  Out) :- !, write(Out, 'engine.areg2').
write_reg(ea(3),  Out) :- !, write(Out, 'engine.areg3').
write_reg(ea(4),  Out) :- !, write(Out, 'engine.areg4').
write_reg(ea(5),  Out) :- !, write(Out, 'engine.areg5').
write_reg(ea(6),  Out) :- !, write(Out, 'engine.areg6').
write_reg(ea(7),  Out) :- !, write(Out, 'engine.areg7').
write_reg(ea(8),  Out) :- !, write(Out, 'engine.areg8').
*/
write_reg(ea(X),  Out) :- !, write(Out, 'engine.Areg['), Y is X-1, write(Out, Y), write(Out, ']').
write_reg(econt,  Out) :- !, write(Out, 'engine.cont').
write_reg(arg(X), Out) :- !, write(Out, arg), write(Out, X).
write_reg(a(X),   Out) :- !, write(Out, a), write(Out, X).
write_reg(s(X),   Out) :- clause(inlined(s(X),F/A),_), !, write(Out, '"'), write_constant(F, Out), write(Out, '"').
write_reg(s(X),   Out) :- clause(inlined(s(X),str_args(Xs)),_), !, write_reg_args(Xs, Out).
write_reg(s(X),   Out) :- !, write(Out, s), write(Out, X).
write_reg(si(X),   Out) :- !, write(Out, si), write(Out, X). % ???
write_reg(sf(X),   Out) :- !, write(Out, sf), write(Out, X). % ???
write_reg(y(X),   Out) :- !, write(Out, y), write(Out, X).
write_reg(p(X),   Out) :- !, write(Out, p), write(Out, X).
write_reg(cont,   Out) :- !, write(Out, cont).
write_reg(null,   Out) :- !, write(Out, null).
% am2cpp only
write_reg(args(X),Out) :- !, write(Out, 'args['), write(Out, X), write(Out, ']').
write_reg(X, _) :-
	am2cpp_error([X,is,an,invalid,register,expression]),
	fail.

write_reg_args([], _) :- !.
write_reg_args([X], Out) :- !,
	write_reg(X, Out).
write_reg_args([X|Xs], Out) :-
	write_reg(X, Out),
	write(Out, ', '),
	write_reg_args(Xs, Out).

/*****************************************************************
             WAM-BASED INTERMEDIATE INSTRUCTIONS

Put Instructions
================
+  put_var(X)
+  put_int(i, X)
+  put_float(f, X)
+  put_con(f/n, X)
+  put_con(c, X),
+  put_list(Xi, Xj, Xk)
+  put_str(Xi, Y, Xj)
+  put_str_args([Xi,..,Xn], Y)
+  put_clo(p:G, X)

Get Instructions
================
+  get_val(Xi, Xj)
+  get_int(i, Xi, Xj)
+  get_float(f, Xi, Xj)
+  get_con(c, Xi, Xj)
+  get_ground(g, Xi, Xj)
+  get_list(X)
+  get_str(f/n, Xi, Xj)

Unify Instructions
==================
+  unify_var(X)
+  unify_val(X)
+  unify_int(i, X)
+  unify_float(f, X)
+  unify_con(c, X)
+  unify_ground(g, X)
+  unify_void(i)

Choice Instructions
===================
+  try(Li, Lj)
+  retry(Li, Lj)
+  trust(L)

Indexing Instructions
=====================
+  switch_on_term(Lv, Li, Lf, Lc, Ls, Ll)
+  switch_on_hash(TAG, i, L, hashtable)

Other Instructions
==================
+  comment(Message)
+  debug(Message)

+  begin_predicate(p, f/n)
+  end_predicate(p, f/n)

+  import_package(p)
+  import_package(p, f/n)

+  main(f/n, public): [Instructions]
+  main(f/n, non-public): [Instructions]
+  L: [Instructions]

+  label(L)
+  setB0
+  goto(L)
+  deref(Ri, Rj)
+  set(Ri, Rj)

+  decl_term_vars([R1,...,Rn])
+  decl_pred_vars([R1,...,Rn])

+  put_cont(p:BinG, C)
+  put_cont(BinG, C)
+  execute(p:BinG)
+  execute(BinG)
+  inline(G)

+  new_hash(TAG, i)
+  put_hash(X, L, TAG)

+  static([Instructions])

Notation
********
  X ::= a(i) | S
  Y ::= y(i) | S
  S ::= s(i) | si(i) | sf(i)
  L ::= f/n | f/n+i | f/n+TAG | f/n+TAG+i | f/n+TAG+i+i
  TAG ::= var | int | flo | con | str | lis | top | sub | nil
  BinG ::= C | f(A1,..,An, C)
  G ::= f(A1,..,An)
  A ::= void | X
  C ::= cont | p(N)
  R ::= cont | econt | a(i) | arg(i) | ea(i)

*****************************************************************/

/*****************************************************************
  Utilities
*****************************************************************/
for(M, M, N) :- M =< N.
for(I, M, N) :- M =< N, M1 is M + 1, for(I, M1, N).

%%% print
am2cpp_error(M) :- am2cpp_message(user_error, ['***','AM2JAVA','ERROR'|M]).

am2cpp_message(M) :- am2cpp_message(user_output, M).

am2cpp_message(Stream,[]) :- nl(Stream), flush_output(Stream).
am2cpp_message([M|Ms]) :- write(Stream, M), write(Stream, ' '), am2cpp_message(Stream, Ms).

%%% list
am2cpp_append([], Zs, Zs).
am2cpp_append([X|Xs], Ys, [X|Zs]) :- am2cpp_append(Xs, Ys, Zs).

flatten_list([]) --> !.
flatten_list([L1|L2]) --> !, flatten_list(L1), flatten_list(L2).
flatten_list(L) --> [L].

list_to_string(List, String) :-
	list_to_chars(List, Chars0),
	flatten_list(Chars0, Chars, []),
	atom_codes(String, Chars).

list_to_chars([], []) :- !.
list_to_chars([L|Ls], [C|Cs]) :- atom(L), !,
	atom_codes(L, C),
	list_to_chars(Ls, Cs).
list_to_chars([L|Ls], [C|Cs]) :- number(L), !,
	number_codes(L, C),
	list_to_chars(Ls, Cs).

% END
% written by SICStus Prolog 3.12.8
