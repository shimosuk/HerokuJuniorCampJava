#!/bin/sh
mvn compile
if [ $? = 0 ]
then
open http://localhost:8080/greeting/goodbye
open http://localhost:8080/greeting/yes
java -cp target/classes:target/dependency/* com.example.Main
fi
