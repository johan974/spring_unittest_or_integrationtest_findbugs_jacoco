This simple Maven/Java project with only 1 Domain class shows the basic features for testing and code quality. 
The following plugins are used: 
* Surefire and Failsafe - Unit or Integration testing
* Findbugs - Code inspector
* Jaoco - Test coverage

Results: 
* Scenario 1: 
  * mvn clean install -Pdev               ==> performs the unit test
  * mvn site                              ==> test coverage ... of 30%
* Scenario 2: 
  * mvn clean install -Pintegration       ==> performs the INTEGRATION test
  * mvn site                              ==> test coverage ... of 60%
