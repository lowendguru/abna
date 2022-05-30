# ABNA
Test Automation Assignment


# Test execution
## Preconditions
The requirements to run the automated tests are:
- Java 8+
- Maven 3.6+
- Chrome

# Executing from command line
This is a maven project. If Java and Maven are correctly configured in the host system, the test suite can be executed via the following command lines.

To run all tests scenarios available in the folder src/test/resources/features/ use the command:

` mvn clean integration-test `

To run a subset of scenarios filtered by @tags use:

`mvn clean integration-test -Dcucumber.filter.tags="@tag"`

### Test reports

Results will be available in the file `target/cucumber-report/CucumberReport.html` after the execution is completed