# Testing setup for travis

[![Build Status](https://travis-ci.org/ppopoff/test-travis.svg?branch=master)](https://travis-ci.org/ppopoff/test-travis)

Small hello-world project for travis CI
Contains a number of tests, build icon on readme page and nothing else.

Has Cassanrda [Community Edition](http://www.datastax.com/wp-content/uploads/2011/09/DS-DataStax-Community.pdf) support:
Cassandra is provided via Datastax Community Edition and uses stock configuration (available on 127.0.0.1).

Issues I've faced

 - Travis has no knowledge about openjdk8
 - .travis.yml must be commited before we connect our repo with travis
 - cross-compilation doesn't work that easy. Looks like you have to add matrix or smth like it

