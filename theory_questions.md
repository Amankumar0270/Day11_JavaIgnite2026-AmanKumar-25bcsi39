# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception


Answer->>

Checked Exception

Checked at compile time.
Must be handled using try-catch or declared using throws.
Example: IOException

Unchecked Exception

Checked at runtime.
Handling is optional.
Example: ArithmeticException


Give one Java example for each.



2)Explain difference between:

throw

throws

Where do we use each one?

Answer->>

throw

Used to explicitly throw an exception.
Used inside a method body.
Example:
throw new ArithmeticException("Error");

throws

Used to declare exceptions that a method may throw.
Used in the method signature.
Example:
public void readFile() throws IOException



3)Why do we need it instead of built-in exceptions?

Give a real-life example where custom exception is useful.


Answer->>

Custom Exceptions are used to represent application-specific errors that built-in exceptions cannot clearly describe.

Real-Life Example:
In a banking application, if a user tries to withdraw more money than the available balance, we can create a custom exception:

class InsufficientBalanceException extends Exception

This makes the error more meaningful and easier to understand than using a generic exception.

