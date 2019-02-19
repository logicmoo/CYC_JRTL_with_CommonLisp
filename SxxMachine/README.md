Overview
========

Prolog Cafe is a Prolog-to-Java source-to-source translator system. 
Prolog programs are first translated into Java programs via the WAM (Warren Abstract Machine), 
and then those programs are compiled by a usual Java compiler such as SUN's JDK SE.

This project is a fork of Google's project http://code.google.com/p/prolog-cafe/ version 1.3, 
which is a fork of 1.2.5 from http://kaminari.scitec.kobe-u.ac.jp/prologcafe/

Building
========
You should have JDK version 1.8 and Maven version 3.3.3 installed.

For building:

	mvn clean install 

The  command produces the target\prolog-cafe-&lt;version&gt;.jar

For cleanup:

	mvn clean


Versioning
==========
This project is a fork of Google's project http://code.google.com/p/prolog-cafe/ version 1.3.
Although Google has produced versions 1.4 and 1.4.1, 
version 1.3 was selected as basement for fork,
because this version is used in production (in parent project - Gerrit),
while versions 1.4+ seems to be not ready for production yet.

It is clear that the code will be modified (bug fixes, merging Google changes, new functionality, etc).
All such modification should receive version 1.3.N
where N is the sequential number of the change.
 
