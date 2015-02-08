#!/usr/bin/perl -w
use strict;

use Test::More qw( no_plan );

sub main{

diag "Start URL check test";
system "sh http_test.sh";
ok ( "$?" == 0 , "URL fetch Test");
}
main;

