##Chapter 03: Fundamental Programming Structures In Java##
########################################################

##
**3.1 A Simple Java Program**

Looking at one of the simplest java programs, file name "<a href="https://github.com/ToiHocJava/JavaSE/blob/master/src/chapter03/FirstSample.java"><b>FirstSample.java</b></a>":
```java
public class FirstSample
{
    public static void main(String[] args)	
    {
    	System.out.println("We will not use 'Hello, World!");
    }
}
```
-Keyword [<b>public</b>] is called an "access modifier". More information in Chapter 5.
<br>
-Keyword [<b>class</b>] reminds you that everything in a Java program lives inside a class. More information in Chapter 4.
<br>
-Keyword [<b>FirstName</b>] is the name of the class. Names must begin with a letter (uppercase letter, you should use "<b>CamelCase</b>"), and after that, they can have any combination of letters and digits. The length is essentially un-limited. You cannot use a Java reserved word (such as public, class) for a class name. See Appendix A for a list of reserved words.
<br>
-You need to make the filename for the source code the same as the name of public class, with the extension "<b>.java</b>". Thus, you must store this code in a file called "<b>FirstSample.java</b>"
<br>
-To run a compiled program, the "<b>Java Virtual Machine</b>" always starts execution with the code in the <b>main</b> method in the class you indicate.
<br>
-According to the <b>Java Language Specificateion</b>, the <b>main</b> method must be declared "<b>public</b>"
<br>
-The braces { } in the source code usually called blocks.
<br>
-Don't worry about the keywords [<b>static void</b>], more information in Chapter 4.
<br>
-We are using the "System.out" object and calling its <b>println</b> method. Notice the periods used to invoke a method, Java uses the general syntax:
<br>
```java
object.method(parameters)
```
as its equivalent of a function call.


##
**3.2 Comments**

-Comments in Java, as in most programming languages.
<br>
-For 1 line: ```//<comment 1 line is in here>```
<br>
-For multi line:
```/**<comment multi line is in here>*/```


##
**3.3 Data Types**

-Java is a strongly typed language. This means that every variable must have a declared type. There are <u>eight</u> <b>primitive types</b> in Java.
<br>
--4 - Four of them are <b>"integer" types</b>
<br>
--2 - Two are <b>"floating-point number" types</b>
<br>
--1 - One is the <b>character type "char"</b>, used for code units in the Unicode encoding scheme.
<br>
--1 - One is a <b>"boolean" type</b>  for truth values.

<br>
**3.3.1 Integer Types**

-The integer types are for numbers without "factional parts". 
<br>
-Negative values are allowed.
<br>

Type | Storage Requirement | Range (inclusive)
--- | --- | ---
int | 4 bytes | –2,147,483,648 to 2,147,483, 647 (just over 2 billion)
short | 2 bytes | –32,768 to 32,767
long | 8 bytes | –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
byte | 1 byte | –128 to 127



<br>
**3.3.2 Floating-Point Types**
<br>
**3.3.3 The char Type**
<br>
**3.3.4 Unicode and the char Type**
<br>
**3.3.5 The boolean Type**

**3.4 Variables**
<br>
**3.4.1 Initializing Variables**
<br>
**3.4.2 Constants**
<br>

**3.5 Operators**
<br>
**3.5.1 Mathematical Functions and Constants**
<br>
**3.5.2 Conversions between Numeric Types**
<br>
**3.5.3 Casts**
<br>
**3.5.4 Combining Assignment with Operators**
<br>
**3.5.5 Increment and Decrement Operators**
<br>
**3.5.6 Relational and boolean Operators**
<br>
**3.5.7 Bitwise Operators**
<br>
**3.5.8 Parenthese and Operator Hierachy**
<br>
**3.5.9 Enumerated Types**

**3.6 Strings**
<br>
**3.6.1 Substrings**
<br>
**3.6.2 Comcatenation**
<br>
**3.6.3 Strings Are Immutable**
<br>
**3.6.4 Testing Strings for Equality**
<br>
**3.6.5 Empty and Null Strings**
<br>
**3.6.6 Code Points and Code Units**
<br>
**3.6.7 The String API**
<br>
**3.6.8 Reading the Online API Documentaion**
<br>
**3.6.9 Building Strings**
<br>

**3.7 Input and Output**
<br>
**3.7.1 Reading Input**
<br>
**3.7.2 Formatting Output**
<br>
**3.7.3 File Input and Output**


**3.8 Control Flow**
<br>
**3.8.1 Block Scope**
<br>
**3.8.2 Conditional Statements**
<br>
**3.8.3 Loops**
<br>
**3.8.4 Determinate Loops**
<br>
**3.8.5 Multiple Selections-The [Switch] Statement**
<br>
**3.8.6 Statements That Break Control Flow**
<br>


**3.9. Big Numbers**


**3.10 Arrays**
<br>
**3.10.1 The [for each] Loop**
<br>
**3.10.2 Array Initializers and Anonyous Arrays**
<br>
**3.10.3 Array Copying**
<br>
**3.10.4 Command-Line Parameters**
<br>
**3.10.5 Array Sorting**
<br>
**3.10.6 Multidimensional Arrays**
<br>
**3.10.7 Ragged Arrays**
<ul>
    <li>
    </li>

    <li>
    </li>

    <li>
    </li>

    <li>
    </li>

    <li>
    </li>
</ul>
#
