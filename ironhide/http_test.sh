#!/bin/bash

if( curl -Is http://127.0.0.1:8181/ironhide-webapp-1.0-SNAPSHOT/ | head -n1 | grep 200); then
exit 
else
exit 99
fi
