#!/bin/sh
mvn compile
if [ $? = 0 ]
then
open http://localhost:8080/HelloGoodbye/YouSay/goodbye
open http://localhost:8080/HelloGoodbye/YouSay/yes
java -cp target/classes:target/dependency/* com.example.Main
fi
