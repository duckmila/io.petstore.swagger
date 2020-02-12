This is the test automation framework for http://petstore.swagger.io/

Commands:
1. Run all the JUnit tests
mvn clean test

2. Run all the JUnit test with website name changing
mvn clean -DwebsiteName="http://example.io" test

3. Run only pet queries test
mvn clean -Dgroups="tests.TestPet" test

4. Run only order queries test
mvn clean -Dgroups="tests.TestOrder" test

5. Watch Allure test reports after tests run
mvn allure:serve