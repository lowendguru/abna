# ABNA
Test Automation Assignment

# Automated test suite
These functional tests are 

# Test execution
## Preconditions
The requirements to run the automated tests are:
- Java 8+
- Maven 3.6+
- Chrome latest

# Executing from command line
This is a maven project. If Java and Maven are correctly configured in the host system all dependencies will be automatically resolved. The test suite can be executed via the following command lines.

To run all tests scenarios available in the folder `src/test/resources/features/` use the command:

` mvn clean verify `

To run a subset of scenarios filtered by `@tags` use the following line with the desired tags:

`mvn clean verify -Dcucumber.filter.tags="@tag1 or @tag2"`

### Test reports

Results will be available in the file `target/site/serenity/index.html` after the execution is completed

## Demo
[![Click for video demo of execution](https://img.youtube.com/vi/FSHKn-_1m5g/0.jpg)](https://youtu.be/FSHKn-_1m5g "Demo")