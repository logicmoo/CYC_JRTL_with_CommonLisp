app([],Ys,Ys).
app([A|Xs],Ys,[A|Zs]):-app(Xs,Ys,Zs).

nrev([],[]).
nrev([X|Xs],Zs):-nrev(Xs,Ys),app(Ys,[X],Zs).

full_range(It,L):- for(_,1,It),nrev(L,_),fail.
full_range(_,_).

dummypred(_,_).

empty_range(It,L):-for(_,1,It),dummypred(L,_),fail.
empty_range(_,_).

integers(Max,Ps):-
  findall(I,for(I,1,Max),Ps).

ebm(It,Len):-
    integers(Len,L),
    empty_range(It,L).
    
tbm(It,Len):-
	integers(Len,L),
	full_range(It,L).

big:-println('BMARK_brev_3000_times_100_elem_nrev:'),tbm(3000,100).

mid:-println('BMARK_brev_1000_times_100_elem_nrev:'),tbm(1000,100).
    
small:-
    println('BMARK_brev_100_times_30_elem_nrev:'),
	tbm(100,30).
	