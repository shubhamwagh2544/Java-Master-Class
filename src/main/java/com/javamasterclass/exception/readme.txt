###
Checked Ex - Compile Time Ex
- IOException
- ClassNotFoundException
- FileNotFoundException
- SQLException
- InterruptedException
We can't compile code before handling these exceptions -> hence Compile Time exception / Checked Exceptions.
We need to handle these exceptions by try-catch or throw.

###
Unchecked Ex - Runtime Ex
- ArithmeticException
- IndexOutOfBoundsException -> ArrayIndexOutOfBoundsException
- IllegalArgumentException -> NumberFormatException
- Null Pointer Exceptions
- Class Cast Exception
We can compile code before handling these exceptions - they occur at runtime -> Runtime Ex / Unchecked Exceptions
We can explicitly handle these exceptions by try-catch or throw.

###
rules
- thrown exception should be same or subtype of caught exception
- if we throw checked exception A and catch any exception B -> then CE for checked exception A -> [unhandled exception A]
- we can't catch checked exception even if not thrown one [thrown checked exceptions must be handled]
- we can catch unchecked exception even if not thrown one [thrown unchecked may/may not be handled]

- if unchecked ex explicitly handled -> no program break
- if unchecked ex not handled -> program break

- checked ex must be handled before code compilation - else CE

while catching multiple exceptions together
- Exception Types in multi-catch statement must be disjoint set
- it means, one exception should not be subtype to another exception -> disjoint exceptions
- we can't add checked and unchecked exceptions together in multi-catch -> exceptions shall be compatible

- we can add subtypes of runtime exception in multi-catch
