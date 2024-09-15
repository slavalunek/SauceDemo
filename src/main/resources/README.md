# Ferst task
```
[INFO]   org.testng:testng ..................................... 7.6.0 -> 7.6.1
[INFO]   org.testng:testng ..................................... 7.6.0 -> 7.6.1
[INFO]   org.testng:testng ..................................... 7.6.0 -> 7.6.1
[INFO]   org.testng:testng ..................................... 7.6.0 -> 7.6.1
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.907 s
[INFO] Finished at: 2022-07-12T15:20:52+04:00
[INFO] ------------------------------------------------------------------------
```
## Second task
```
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.83 s - in TestSuite
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  13.159 s
[INFO] Finished at: 2022-07-12T15:29:51+04:00
[INFO] ------------------------------------------------------------------------
```
### Third task
```
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.96 s - in org.example.LoginTest
[INFO] Results:
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.285 s
[INFO] Finished at: 2022-07-12T15:37:56+04:00
[INFO] ------------------------------------------------------------------------
PS D:\curses\SauceDemo> mvn test -Dtest=CartTest#complianceOfTheAddedProduct+removeProduct                            
[INFO] -----------------------< org.example:SauceDemo >------------------------
[INFO] Running org.example.CartTest
```
#### Fourth task
```
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.107 s - in org.example.LoginTest
[INFO] Results:
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.361 s
[INFO] Finished at: 2022-07-12T16:05:43+04:00
[INFO] ------------------------------------------------------------------------

d:\curses\SauceDemo>mvn test -Dtest=LoginTest#userShouldLoginWithValidCredentials -Dusername=standard_user -Dpassword=secret_sauce
```