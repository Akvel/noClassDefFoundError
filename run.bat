@echo off

rem mvn clean install

set cjar=test-compile-classes/target/test-compile-classes-0.0.1-SNAPSHOT.jar
set rjar=test-runtime-classes/target/test-runtime-classes-0.0.1-SNAPSHOT.jar

echo  ----------- Test 1
java -cp %cjar% pro.akvel.test.noclassdeffound.MainClass1

echo  ----------- Test 2
java -cp %cjar%;%rjar% pro.akvel.test.noclassdeffound.MainClass1

echo ----------- Test 5
java -cp %cjar%;%rjar% pro.akvel.test.noclassdeffound.MainClass2

echo ----------- Test 6
java -cp %cjar%;%rjar% pro.akvel.test.noclassdeffound.MainClass3

echo ----------- Test 7
java -cp %cjar% pro.akvel.test.noclassdeffound.MainClass4

echo ----------- Test 8.1
java -cp %cjar% pro.akvel.test.noclassdeffound.MainClass5

echo ----------- Test 8.2
java -cp %cjar% pro.akvel.test.noclassdeffound.MainClass6

echo ----------- Test 9
java -cp %cjar%;%rjar% pro.akvel.test.noclassdeffound.MainClass7

echo ----------- Test 10,11
java -cp %cjar%;%rjar% pro.akvel.test.noclassdeffound.MainClass8


