# ABNA
Test Automation Assignment. The goal of this project is to demonstrate a test approach with a test automation framework.

## Test environment
The web page was originally available in a .zip file and was then deployed in a test server with url: http://abna.lowendguru.com/

# Automated test suite
The functional tests are written in Java using Serenity and Cucumber.

## Structure

### Tests in Gherkin language
Test scenarios are described in human-readable reusable sentences. The scenarios are grouped in .feature files found in folder `src/test/resources/features/`. Tags @ were used at the Feature level and at the Scenario level to allow for partial execution. The tags are also useful to filter results in the report.

### Page Object classes
The Page Object pattern is implemented by mapping pages (or sections) to Java classes where the elements are identified by web selectors. All page object classes extend from a BasePage and they can be found in folder `src/test/java/functionaltests/pageobjects`.

### Step definitions
The Gherkin expressions used in the .feature files are mapped (glued) to methods via regex. The step methods can be found in folder `src/test/java/functionaltests/stepdefinitions`. Step classes extend from CommonSteps for reusability of common methods.

### Configuration files
Serenity uses files `serenity.properties` and `src/test/resources/serenity.conf` for various configuration parameters. The conf file is particularly useful to enable/disable the browser's headless mode and to define environments.  

# Test execution
## Preconditions
The requirements to run the automated tests are:
- Java 8+
- Maven 3.6+
- Chrome latest

# Executing from command line
This is a maven project. If Java and Maven are installed in the host system all dependencies will be automatically resolved. The test suite can be executed via the following command lines.

To run all tests scenarios available in the folder `src/test/resources/features/` use the command:

` mvn clean verify`

To run a subset of scenarios filtered by `@tags` use the following line with the desired tags:

`mvn clean verify -Dcucumber.filter.tags="@tag1 or @tag2"`

### Test reports

A full report is available after test execution is completed. The report contains pass/fail data, test duration and detailed descriptions of failed steps (including screenshot).

Results will be available in the file `target/site/serenity/index.html`.

For demo purposes a generated report can be found in the repo file `demo/report.zip` and also available on the test server url: http://abna.lowendguru.com/report/index.html 

### Results

Test coverage include positive and negative test cases. Assumptions were made for some of the tests, see comments in file `HomePage.feature` .

Some tests are failing based on assumed expected behavior, the report shows the failed assertion messages and screenshots. 

## Video demo of execution
The following video demonstrates an execution of the full test suite and the resulting test report.

[![Click for video demo of execution](https://img.youtube.com/vi/FSHKn-_1m5g/0.jpg)](https://youtu.be/FSHKn-_1m5g "Demo video")