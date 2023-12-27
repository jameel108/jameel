@echo off
set projectLocation=C:\Users\moham\eclipse-workspace\batch39\HRMS_Project
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
