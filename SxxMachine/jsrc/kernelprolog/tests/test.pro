 :- ['jsrc/kernelprolog/tests/nrev'].
 :- ['jsrc/kernelprolog/tests/q8'].
 :- ['jsrc/kernelprolog/tests/allperms'].
 

go1:-
  unfolder_source(':-'(x(X),member(X,[1,2,3,4])),S),
  getfl(S,the(A)),
  println(a(A)),
  getfl(S,the(B)),
  println(a(B)),
  unfolder_source(B,SB),
  getfl(SB,the(AA)),
  println(aa(AA)),
  getfl(SB,the(BB)),
  println(bb(BB)).

go2:-
  unfolder_source(':-'(x(X),member(X,[1,2,3])),S),
  getfl(S,Answer),
  println(Answer).

go3:-
  unfolder_source(':-'(q(X),qs(X)),Solver),
  repeat,
    getfl(Solver,Answer),
    println(Answer),
  eq(Answer,no).

go4:-
  unfolder_source(':-'(ok,go1),Solver),
  getfl(Solver,Answer),
  println(Answer).

% end

xthe(X,G,A):-
   new_solver(X,G,Solver),
   getfl(Solver,Answer),
   xconvert(Answer,A),
   getfl(Solver,no).

xconvert(no,no).
xconvert(':-'(A,true),the(A)).

go5:-
  list_source([1,2,3],I1),
  list_source([4,5],I2),
  println(s1(I1)),
  println(s2(I2)),
  append_sources(I1,I2,I3),
  println(s3(I3)),
  source_list(I3,Xs),
  println(Xs).

go5a:-
  list_source([1,2,3],I1),
  list_source([4,5],I2),
  list_source([6,7],I3),
  append_sources([I1,I2,I3],I4),
  source_list(I4,Xs),
  println(Xs).

go6:-
  list_source([1,2,3],I1),
  list_source([a,b,c],I2),
  compose_sources(I1,I2,I3),
  source_list(I3,Xs),
  println(Xs).

go7:-
  list_source([1,2,3],I),
  getfl(I,A),
  println(A),
  split_source(I,I1,I2),
  compose_sources(I1,I2,I3),
  source_list(I3,Xs),
  println(Xs).

perm([],[]).
perm([X|Xs],Zs):-
	perm(Xs,Ys),
	insert(X,Ys,Zs).

insert(X,Ys,[X|Ys]).
insert(X,[Y|Ys],[Y|Zs]):-
	insert(X,Ys,Zs).

nrev([],[]).
nrev([X|Xs],Zs):-nrev(Xs,Ys),append(Ys,[X],Zs).

% Naive reverse benchmark
bm(N):-ints(1,N,Is),println(N),nrev(Is,Rs),println(Rs).
pm(N):-ints(1,N,Is),println(N),perm(Is,Rs),println(Rs),fail.

go8:-
  clause_file_writer('example.txt',Writer),fprint_clause(Writer,example(one)),stop(Writer),
  file_clause_reader('example.txt',Reader),fread(Reader,X),stop(Reader),println(X).

  
go13:-
  answer_source(X,member(X,[1,2,3]),S1),
  list_source([a,b],S2),
  list_source([10,20],S3),
  compose_sources(S1,S2,C),
  compose_sources(C,S3,D),
  source_list(D,R),
  println(R).
  
go14:-
  answer_source(X,member(X,[1,2,3]),S1),
  list_source([a],S2),
  list_source([10,20],S3),
  merge_sources([S1,S2,S3],S),
  source_list(S,R),
  println(R).
  
