# DeliveryHeroMaven
Content of the Project

This project for Vendor Portal - OSS Team. Settings and Opening Times Plugin tests will automate.

Tools and Technologies :

Selenium WebDriver, Cucumber, TestNG, Java , Cucumber Report, Jenkins

Patterns :

OOP and POM pattern was used

Prerequest :

Java Latest JDK

https://www.oracle.com/tr/java/technologies/javase

How to execute tests :

Open terminal and type below command.
```sh
-DbrowserName="value"
```
You can use chrome, firefox or safari as browserName value
```sh
-Dcucumber.filter.tags="@value"
```
You can filter your scenarios or features also by using cucumber tags. Using tag is optional.
```sh
-Denv="value"
```
You can execute tests on staging or production environment. (stg, eu02.stg , foodpanda , talabat , pedidosya ,yemeksepeti)
```sh
-DvendorId="value"
```
You can use this parameter with which vendor you want to test with.
```sh
 mvn clean test -Dcucumber.filter.tags="@value" -Dbrowser="chrome" -Denv="value" -DvendorId="value"
```


Cucumber-Report

available at below directory

/eclipse-workspace/DeliveryHeroMaven/target/cucumber-reports.html
