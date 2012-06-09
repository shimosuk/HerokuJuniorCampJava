#!/bin/sh
mvn compile
if [ $? = 0 ]
then
open http://localhost:8080/greeting/hello
open http://localhost:8080/greeting/bye
java -cp target/classes:target/dependency/* com.example.Main
fi
