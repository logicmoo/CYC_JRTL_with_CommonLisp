allperms([],[[]]).
allperms([X|Xs],Perms2):-
       	allperms(Xs,Perms1),
        extendperms(Perms1,X,Perms2).

extendperms([],_,[]).
extendperms([Perm|Perms1],X,[[X|Perm]|Perms3]):-
	extendperms(Perms1,X,Perms2),
	insert_one_item(Perm,X,[],Perms2,Perms3).

insert_one_item([],_,_,Perms,Perms).
insert_one_item([Y|Ys],X,Acc,Perms1,[Zs|Perms2]):-
       	revapp(Acc,[Y,X|Ys],Zs),
        insert_one_item(Ys,X,[Y|Acc],Perms1,Perms2).

revapp([],Acc,Acc).
revapp([X|Xs],Acc,Zs):-
       revapp(Xs,[X|Acc],Zs).

nats(Min,Max,Ps):-
  findall(I,for(I,Min,Max),Ps).

permute([],[]).
permute([X|Xs],Zs):-
	permute(Xs,Ys),
	ins(X,Ys,Zs).

ins(X,Ys,[X|Ys]).
ins(X,[Y|Ys],[Y|Zs]):-
	ins(X,Ys,Zs).

g0(N):-nats(1,N,Ns),permute(Ns,_),fail.
g0(_).

g1(N,Ps):-nats(1,N,Ns),allperms(Ns,Ps).

g2(N,Ps):-nats(1,N,Ns),findall(P,permute(Ns,P),Ps).


test(Mes,X):-
  write('++++>'),write(Mes),nl,
  X.

ap_go:-test('perms:',g0(10)).

ap_go1:-test('allperms:',g1(9,_)).

ap_go2:-test('allperms with findall:',g2(9,_)).

