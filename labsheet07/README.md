# OOPS Lab Sheet 07 - Exception Handling

This lab sheet contains beginner-friendly Java programs about exception handling, packages, and multithreading. Each question can be compiled and run separately.

## Questions

1. `question01/Question01Division.java` - Divides two entered integers and handles division by zero with `try`, `catch`, and `finally`.
2. `question02/Question02ArrayIndex.java` - Displays an array value for an entered index and handles an invalid index.
3. `question03/Question03MultipleCatch.java` - Converts two entered strings to integers and handles invalid numbers and division by zero separately.
4. `question04/Question04NestedTry.java` - Uses an outer `try` for division and a nested `try` for accessing an array.
5. `question05/Question05FinallyBlock.java` - Demonstrates that the `finally` block runs even when division by zero occurs.
6. `question06/Question06CheckAge.java` - Uses `throw` to reject an age below 18 and handles the exception in `main`.
7. `question07/Question07CustomPassword.java` - Creates and handles a custom exception when a password has fewer than six characters.
8. `question08/Question08ThrowsKeyword.java` - Declares `throws NumberFormatException` on a method and handles invalid input in its caller.
9. `question09/Question09FinallyAndReturn.java` - Shows that `finally` runs before a method returns its value.
10. `question10/Question10BankAccount.java` - Handles a custom insufficient-funds exception and the built-in illegal-argument exception.

## Intermediate: Packages

11. `question11/` - Creates the `mypack` package and imports its `Hello` class into a separate program.
12. `question12/` - Creates the `shapes` package with `Circle` and `Rectangle` classes and calculates both areas.
13. `question13/` - Demonstrates public and package-private classes in `testpack`. The public class is accessible from another package; `DefaultClass` is not. Trying to use `DefaultClass` from `Question13UseTestPack` causes a compile-time access error because it has package-private visibility.
14. `question14/company/` - Creates the `company.employees` and `company.main` subpackages and uses `Employee` from `Main`.
15. `question15/` - Demonstrates public and protected members across packages. The outside class directly accesses the public member and accesses the protected member through a subclass. Default and private members are not accessible from that outside class.
16. `question16/` - Calls `Dog` once with `import animals.Dog;` and once using the fully qualified name `animals.Dog`.
17. `question17/` - Uses `import mypackage.*;` to access classes `A`, `B`, and `C`.
18. `question18/` - Imports `ArrayList` and `Scanner` from Java's built-in `java.util` package.
19. `question19/` - Imports `utils.MathUtils` and calls its static arithmetic methods.
20. `question20/` - Compiles `college.students.Student` and `college.students.Main` into the package directory using `javac -d .`.

## Advance: Multithreading

21. `question21/Question21ThreadClass.java` - Creates a thread by extending `Thread` and prints a message five times.
22. `question22/Question22RunnableInterface.java` - Creates a thread using `Runnable` and prints numbers from 1 to 10.
23. `question23/Question23ThreadLifecycle.java` - Demonstrates New, Runnable, Blocked, and Terminated states. Java uses `RUNNABLE` for both ready-to-run and currently running threads.
24. `question24/Question24ThreadNames.java` - Starts two named threads; their output can interleave because the scheduler decides when each runs.
25. `question25/Question25ThreadPriorities.java` - Sets minimum, normal, and maximum priorities. Priority does not guarantee execution order.
26. `question26/Question26SleepAndContinue.java` - Sleeps one thread for two seconds while another thread continues working.
27. `question27/Question27JoinThreads.java` - Uses `join()` so the second thread starts after the first finishes.
28. `question28/Question28UnsynchronizedCounter.java` - Uses latches to reliably demonstrate a lost update when two threads access a counter without synchronization.
29. `question29/Question29SynchronizedCounter.java` - Uses a synchronized method so two threads safely increment a shared counter.
30. `question30/Question30MultithreadingExample.java` - Simulates file downloading and processing with two cooperating tasks.

## Compile

Open PowerShell in this folder and compile all programs into `out`:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

Run a program using its package and class name (from PowerShell in this folder):

```powershell
java -cp out labsheet07.question01.Question01Division
java -cp out labsheet07.question02.Question02ArrayIndex
java -cp out labsheet07.question03.Question03MultipleCatch
java -cp out labsheet07.question04.Question04NestedTry
java -cp out labsheet07.question05.Question05FinallyBlock
java -cp out labsheet07.question06.Question06CheckAge
java -cp out labsheet07.question07.Question07CustomPassword
java -cp out labsheet07.question08.Question08ThrowsKeyword
java -cp out labsheet07.question09.Question09FinallyAndReturn
java -cp out labsheet07.question10.Question10BankAccount
java -cp out labsheet07.question11.Question11UsePackage
java -cp out labsheet07.question12.Question12UseShapes
java -cp out labsheet07.question13.Question13UseTestPack
java -cp out company.main.Main
java -cp out labsheet07.question15.Question15AccessTest
java -cp out labsheet07.question16.Question16ImportDog
java -cp out labsheet07.question16.Question16FullyQualifiedDog
java -cp out labsheet07.question17.Question17WildcardImport
java -cp out labsheet07.question18.Question18JavaUtil
java -cp out labsheet07.question19.Question19UseMathUtils
java -cp out college.students.Main
java -cp out labsheet07.question21.Question21ThreadClass
java -cp out labsheet07.question22.Question22RunnableInterface
java -cp out labsheet07.question23.Question23ThreadLifecycle
java -cp out labsheet07.question24.Question24ThreadNames
java -cp out labsheet07.question25.Question25ThreadPriorities
java -cp out labsheet07.question26.Question26SleepAndContinue
java -cp out labsheet07.question27.Question27JoinThreads
java -cp out labsheet07.question28.Question28UnsynchronizedCounter
java -cp out labsheet07.question29.Question29SynchronizedCounter
java -cp out labsheet07.question30.Question30MultithreadingExample
```

The package examples use packages such as `mypack`, `shapes`, `company.employees`, and `utils`. Compile all source files together using the command above so each demo can find its package classes.

## Question 20: Compile from its source folder

To see the `javac -d .` directory structure directly, open PowerShell in `question20` and run:

```powershell
javac -d . Student.java
javac -d . Main.java
java college.students.Main
```

The compiler creates `college\students\Student.class` and `college\students\Main.class` under the current folder. Alternatively, compile every lab program using the general command above, then run `java -cp out college.students.Main` from the `labsheet07` folder.
