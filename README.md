Instructions:

I have created this sample test by using the BDD with POM pattern with respect to selenium webdriver.
BDD means Behavioral Driven Developement approach that has evolved from TDD.
It is a collaborative approach to software developement that bridges the communication gap between business and IT.
I have used POM to create object repository for Web UI elements,it helps make the code more readable,maintainable and reusable.
POM says operations and flows in the UI should be seperated from the verification
I used Java as the programming language to enhance the test cases.
I have created the class RunCukesTestIT,it will trigger the feature files and the step definition files.

How to execute the solution:
First I have written cucumber feature file in gherkin language,where we use simple plain english language in form of Given When Then.
I have created the classes for each page,there I have mentioned the Webelements and actions on that perticular page.
I have created Step definition files inline with the feature file,from there I called the page objects.so there I kept operations seperate from the verification
I created the seperate class called RunCukesTestIT,from there I have given the feature file path and stepdefinition file path and tags,pluggins
I have taken all these in seperate corresponding packages
Created pageobjects package for pages,support package for the intialize driver,any waits,and web elements
created Utilities package for the screen shots 
created Data provider package to get the data from the property file
I have put all the static information throughout the application in property file i.e,config.properties
Created resources directory to put feature files and Chrome driver.


Analysis:

During the test I have faced some of the challenges like handling of dynamic webelements,to overcome this,I used some of the xpath methods.
If I had more time I will create test base class to intialise webdriver,rather than extends Driver class in every class.
I have gone through some of the reusable methods,so put those methods seperately and called whenever needed.
I could do better if  I have good time for this test like take the screen shots and better framework structure.
I have used Junit for asserts the page title and make sure that in right path regarding this test
