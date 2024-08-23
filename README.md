# Project for Germany_KS

## Test execution Steps
- IDE-Eclipse
- Scripting language-JAVA
- UnitTestingTool-TestNG
- First I have created a maven project in which I have added various dependencies in its POM.xml file such as testNG from mvn repository website so that it is available in my project without directly downloading.
- In src/test/java I have created assignment package in which I have developed the script for Login page testing of germanyiscalling.
- I have used testNG so I have made both test in same class by using @test annotation
- Also I have first given path(from my local) for browser launching using System.setProperty

### Steps
1. Go to src/test/java>>open package assignment>>open GermanyisCalling class and run as TestNG test by right click --run as>>testNG Test
2. Both test gets executed and pass and failure status is reflected , also skipped test cases are also reflected
3. Right click on the class Germanyiscalling and convert to testNG suite and run the suite file that is xml file which generates html report
4. Report-Go to test-output folder >>go to-emailable html report>>click on it html report is reflected in the browser.
  
## Assumptions
NA

## Additional Information

Improvements 

1. When I click on Home/Successstory/Blog on top navigation there is a white space reflected in background--> it should be a smooth transition.

2. Similarly as I click on ReadMore button on home page >>then click on ContactNow button in center >>redirection to different page is not smooth-->it should be a smooth transition
Mostly all redirections are not smooth-->it should be smooth while redirecting to next page.

3. In login page Login button should be in center -->it should be properly aligned.




