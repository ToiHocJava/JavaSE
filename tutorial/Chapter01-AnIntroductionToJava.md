##Chapter 01: An Introduction to Java##
########################################################

**1.1 Java as a Programming Platform**
> 1. The first release of Java in 1996
> 2. Java is certainly a good programming language
> 3. Java is a whole platform:
	<ul>
	<li>3.1. A huge library</li>
	<li>3.2. Containing lots of reuseable code</li>
	<li>3.3. Executing enviroment provides services: security, portability across OS, automatic garbage collection.</li>
	</ul>

**1.2 The java "White Paper" Buzzwords:**
> 1.2.1. Simple:
	<ul>
	<li>1.2.1. Chúng tôi muốn build 1 hệ thống có thể được lập trình dễ dàng. Chúng tôi thấy rằng C++ không phù hợp, chúng tôi đã thiết kế ra Java từ việc tham khảo C++.</li>
	<li>1.2.2. Cấu trúc của Java phải rõ ràng, ko cần "header files, pointer, structures, unions, operator overloading, virtual base classes,.."</li>
	</ul>

> 1.2.2. Object-Oriented
<ul>
<li>Thiết kế hướng đối tượng là kỹ thuật lập trình hướng trọng tâm vào data (objects) và interfaces của object</li>
<li>Đặc điểm OO của Java tương đương với khái niệm OO của C++</li>
<li>Sự khác biệt lớn nhất giữa Java và C++ ở chỗ  "multiple inheritance", Java đã đổi bằng khái niệm đơn giản hơn - **Interface** </li>
</ul>

> 1.2.3. Distributed
<ul>
<li>Java has an extensive library of routines for copying with TCP/IP protocols like HTTP and FTP</li>
<li>Java applications can open and access objects accross the NET via URLs with the same as when accessing a local file system</li>
<li>Nowaday, one takes this for granted, but in 1995, connecting to a web server from C++ or Visual Basic programs was a major undertaking</li>
</ul>

> 1.2.4. Robust
<ul>
<li>Java is intended for writing programs that must be reliable in a variety of ways</li>
<li>Java puts a lot of emphasis on early checking for possible problems, later dynamic (runtime) checking, and eliminating situation that are error-prone...</li>
<li>The single biggest difference between Java and C/C++ is that Java has a pointer model that eliminates (/i'limineit/loại ra, loại trừ) the possibility of overwriting memory and corrupting data</li>
<li>Java compiler detects many problems that in other languages would show up only at runtimes</li>
<li>At the second point, anyone who has spent hours chasing memory corruption caused by a pointer bug will be very happy with this aspect of Java</li>
</ul>

> 1.2.5. Secure
<ul>
<li>Java is intended to be used in networked/distributed environment.</li>
<li>Java enables the contruction of virus-free, tamper-free (/'tæmpə/giả mạo, làm giả) system</li>
<li>Java was designed to make certain kinds of attacks impossible:</li>
    <ul>
    <li>Over-running the runtime stack-a common attack of worms and virues</li>
    <li>Corrupting memory outside its own process space</li>
    <li>Reading or writing files without permission</li>
    <li>Originally, the Java attitude towards downloaded code was "Bring it on!" Un-trusted code was executed in a SANDBOX ENVIRONMENT where its could not impact the host system. USers were assured that nothing bad could happen becase Java code, no matter where it came from, was incapable of escaping from the sanbox</li>
    <li>After a number of high-profile attacks, browser vendors and Oracle became increasingly cautions. Java browsers plug-ins no longer trust remote code unless it is digitally signed and users have aggred to its execution - MENTION TO JAVA APPLET</li>
    </ul>
</ul>

> 1.2.6. Architecture-Nleutral
<ul>
<li>The compiler generates an architecture-neutral object file format - the conpiled code is executed on many prossors</li>
<li>The Java compiler does this by generating **BYTECODE** instructions</li>
<li>JAVA BYTECODE are designed to be both easy to interpret on ANY MACHINE, EASY TRANSLATED into native machine code on the fly</li>
<li>Interpreting VIRTUAL MACHINE INSTRUCTORS IS SLOWER THAN RUNNING MACHINE INSTRUCTIONS AT FULL SPEED</li>
<li>Java's VIRTUAL MACHINE has another advantage - increasing security because it can check the behavior of instruction sequences</li>
</ul>

> 1.2.7. Portable
<ul>
<li>An "int" in Java is always a 32-bit integer. In C/C++, "int" can mean a 16-bit or 32-bit integer or any other size that the compiler vendor likes.</li>
<li>"short int" < "int" < "long int" </li>
<li>Binary data is stored and transmitted in a fixed format, eliminating confusion about byte odering.</li>
<li>Strings are saved in a standard Unicode format</li>
<li>The libraries that are a part of the system define PORTABLE INTERFACE</li>
<li>Java libraries do a greate job of letting you work in a PLATFORM-INDEPENDENT manner. You can work with files, REGular eXpression, XML, dates and times, databases, network connections, threads, etc without worrying about the underlying OS.</li>
<li>Not only are your programs portable, but the Java API are often of higher quality than the native ones</li>
</ul>

> 1.2.8. Interpreted
<ul>
<li>The Java interpreter can execute JAVA BYTECODES directly on any machine to which the interpreter has been ported</li>
</ul>


> 1.2.9. High-Performance
<ul>
<li>There are situations where higher performance is required. The BYTECODES can be translated ON THE FLY (at runtime) into machine code for particular CPU the application is running on</li>
<li>Today, the JIT - Just-In-Time compilers have become so good that they are competitive with traditional compilers</li>
<li>JIT compiler can monitor which code is executed frequently and OPTIMIZE JUST THAT CODE FOR SPEED</li>
<li>JIT compiler knows which classes have been loaded.</li>
</ul>


> 1.2.10. Multithreaded
<ul>
<li>The benefits of multithreading are better interactive responseveness and REAL-TIME behavior</li>
<li>Concurrent programming is never easy, but Java has done a very good job making it manageable</li>
<li>Instead of faster processors, we just get more of them, and we have to keep them busy</li>
</ul>

> 1.2.11. Dynamic
<ul>
<li>Java is a more dynamic language than C/C++</li>
<li>Libraries can freely add new methods and instance variables without any effect on their client.</li>
<li>This is an important FEATURE in the situations where code needs to be added to a running program.</li>
</ul>

**1.3 Java Applets and the Internet**
<ul>
<li>Java prgrams that work on web pages are call APPLETS</li>
<li>Most importantly, thanks to the security of the VIRTUAL MACHINE, you never need to worry about attacks from hostile code</li>
<li>Inserting an APPET into a web page works much like embedding an image</li>
<li>Various version of the web browser ran different versions of Java, some of which were seriously OUTDATED.</li>
<li>Java as dogged by serious security issues.</li>
</ul>

**1.4 A short History of Java**
<ul>
<li>Java goes back to 1991, from a group of SUN MICROSYSTEM engineers, led by "Patrick Naughton" and "James Gosling", wanted to degign a SMALL COMPUTER LANGUAGE that could be used for consumer deviced like cable TV switchboxes. The project was code-name "GREEN"</li>
<li>The requirements for small, tight, and platform-neutral code led the team to design a portable language that generated intermediate code for a VIRTUAL MACHINE</li>
<li>James Gosling was call his language "OAK" - that as right outside his window at Sun Microsystem. The people at Sun later realized that Oak was the name of an existing computer language, so they changed</li>
<li>The first version of Java 1.0 in early 1996</li>
<li>The second version of Java 1.2 inDec 1998. Three days after, Sun's markeing dept changed the name to the "Java 2 Standard Edition Software Depvelopment Kit Version 1.2</li>
    <ul>
    <li>The Micro Edition for embedded devices such as cell phones</li>
    <li>The Enterprise Edition for server-side processing</li>
    </ul>

<li>Version 1.3 and 1.4 of JavaSE were incremental improvments overs the initial Java 2 release</li>
<li>Version 5.0 was the first release since version 1.1 that updated the Java language in significant ways (This version was originally 1.5 but the version number jumped to 5.0 at 2004 JavaOne conference</li>
    <ul>
    <li>Generic types (roughly comparable to C++ templates) have been added</li>
    <li>Several other useful language features were inspired by C#: a "for each" loop, autoboxing, and annotations</li>
    </ul>
<li>Version 6 (without .0 suffix) was released at the end of 2006. Additional performance improments and library enhancements</li>
<li>Version 7 was released by Oracle in 2011 (Oracle was bought Sun in 2009, 7.4 bil USD)</li>
<li>Version 8 was released 2014</li>
<li></li>
<li></li>
<li></li>
<li></li>
</ul>

**1.5 Common Misconception about Java**
#
<ul>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
</ul>
#