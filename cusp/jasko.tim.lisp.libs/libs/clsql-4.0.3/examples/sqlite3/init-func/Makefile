# FILE IDENTIFICATION
#
#  Name:         Makefile
#  Purpose:      Makefile for SQLite 3 init function example.
#  Programer:    Aurelio Bignoli
#  Date Started: Oct 2004
#
#  CVS Id:   $Id$
#
# This file, part of CLSQL, is Copyright (c) 2004 by Aurelio Bignoli
#
# CLSQL users are granted the rights to distribute and use this software
# as governed by the terms of the Lisp Lesser GNU Public License
# (http://opensource.franz.com/preamble.html), also known as the LLGPL.

sqlite3-utils.so:	iso-8859-15-coll.c Makefile
	gcc -c -fPIC iso-8859-15-coll.c -o iso-8859-15-coll.o
	gcc -shared iso-8859-15-coll.o -o sqlite3-utils.so -l sqlite3

