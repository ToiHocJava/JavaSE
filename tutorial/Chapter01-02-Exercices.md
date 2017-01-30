##Chapter01-02-Exercices##
##########################

**Bài tập cho chương 1,2 (20170122 17:12:56)**

> 1. Thế nào là JDK, JRE? Dùng JDK hoặc JRE trong những trường hợp nào?
> 2. Các biến môi trường PATH và CLASSPATH là gì? và được ứng dụng trong thực tế (qua nhiều hệ điều hành Windows, Linux ...) như thế nào?
> 3. Làm thế nào chỉ cần 1 câu lệnh có thể thực thi 1 file chứa source java được soạn từ console hoặc notepad?
> 4. Làm thế nào để tạo ra một bản protable JAVA có thể chạy mà không cần cài đặt? (đa phần các ứng dụng Java đều có yêu cầu cài sẵn môi trường Java)
> 5. Theo quan điểm riêng của bạn, vì sao Java đang đứng top 1 của các ngôn ngữ lập trình? (theo Tiobe)
<br>
<br>
(mọi người trả lời trên GITHUB và paste link lên đây nhé)



##
##
**Answer (7:13 20170127)**

> Câu 1. Thế nào là JDK, JRE? Dùng JDK hoặc JRE trong những trường hợp nào?
<ul>
    <li>
    JDK is <b>Java Development Kit</b>. That's the software for PROGRAMMERS who want to write Java programs.
	</li>
    <li>
    JRE is <b>Java Runtime Environment</b>. That's the software for CONSUMERS who want to run Java programs.
    </li>
</ul>

##
> Câu 2. Các biến môi trường PATH và CLASSPATH là gì? và được ứng dụng trong thực tế (qua nhiều hệ điều hành Windows, Linux ...) như thế nào?
<ul>
<li>
<b>PATH</b> are the list of directories that the Operating System traverses to LOCATE EXECUTABLE FILES.
</li>
<li>
<b>On Linux</b>, add a line such as the following to the end of your [~/.bashrc] or [~/.bash_profile] or [/etc/profile] file:<br>
export PATH=jdk/bin:$PATH
<br>
<a href="http://image.prntscr.com/image/80d30536b56142a6b271703d88e2e1ef.png">Linux "/etc/profile"</a>
<br>
<img src="http://image.prntscr.com/image/80d30536b56142a6b271703d88e2e1ef.png">
<br>
</li>
<li>
<b> On Windows</b>,
<br>
1/ <a href="http://prntscr.com/e1nnat">Computer-->Properties</a>
<br>
<img src="http://image.prntscr.com/image/82ed785be1f941629909c06879c2d033.png">
<br>
2/ <a href="http://prntscr.com/e1nnl6">Advanced System Settings</a>
<br>
<img src="http://image.prntscr.com/image/3de7a92fce4e46328526b250d9b21180.png">
<br>
3/ <a href="http://prntscr.com/e1nnys">System Properties-->Enviroment Variables...</a>
<br>
<img src="http://image.prntscr.com/image/de2e4904b6664712bf2ae6a7ea24c8a7.png">
<br>
4/ <a href="http://prntscr.com/e1noti">System Variables</a>
<br>
<img src="http://image.prntscr.com/image/2ae40f7bb79c44cfaaf65778222302c6.png">
<br>
4.1/ <b>PATH</b>: Add new value [;D:\Program Files\Java\jdk1.8.0_112\bin;] , without "Square brackets"
<br>
4.2/ <b>CLASSPATH</b>: Add new value [D:\Program Files\Java\jre1.8.0_112\lib;.;D:\Program Files\Java\jre1.8.0_112\lib\ext;] , without "Square brackets"
<br>
<br>
After config PATH, CLASSPATH, you can test: <br>
Windows CMD: 
<a href="http://prntscr.com/e1o0ur">java -version</a>
<br>
<img src="http://image.prntscr.com/image/cf5f497a252040778aa4feb7d050bf70.png">
<br>
Linux Console: 
<br>
<a href="http://image.prntscr.com/image/4dabcbdf506f4b36adeb1c6f03f30066.png">java -version</a>
</li>
</ul>


##
> Câu 3. Làm thế nào chỉ cần 1 câu lệnh có thể thực thi 1 file chứa source java được soạn từ console hoặc notepad?
<ul>
<li>
3.1 Source code: <a href="https://github.com/ToiHocJava/JavaSE/blob/master/src/Welcome.java">Welcome.java
</a>
</li>
<li>
3.2 Compile source code to bytecode: root@srv021:/opt/workspace# <b><font size="4" color="red">/opt/jdk1.8.0_121/bin/javac Welcome.java</font></b>
</li>
<li>
3.3 Created new file name <a href="http://prntscr.com/e28cpa"><b>Welcome.class</b></a>
<img srv="http://image.prntscr.com/image/373fbbc1d8e94a3ab8f19b38c1e5f6e1.png">
</li>
<li>
3.4 Execute bytecode file: root@srv021:/opt/workspace# <b>/opt/jdk1.8.0_121/bin/java Welcome</b>
</li>
<li>
3.5 Result: <a href="http://prntscr.com/e28ep8"><b>Welcome to Javaworld</b></a>
<br>
<img src="http://image.prntscr.com/image/473274b5d777453f89d363c0777a781f.png">
</li>
</ul>


##
> Câu 4. Làm thế nào để tạo ra một bản portable JAVA có thể chạy mà không cần cài đặt? (đa phần các ứng dụng Java đều có yêu cầu cài sẵn môi trường Java)
<ul>
<li>
RESULT: <a href="https://drive.google.com/drive/folders/0B5CVqveXl6nqd2g4ejJxeDdZOXc"><b>JAVA APPS PORTABLE</b></a>
</li>
<li>
<b>Steps</b>:
<br>
4.1 Source code: <a href="https://github.com/ToiHocJava/JavaSE/blob/master/src/Welcome.java">Welcome.java</a>
<br>
4.2 Create bytecode: <b>/opt/jdk1.8.0_121/bin/javac Welcome.java</b>
<br>
4.3 Create .jar file from bytecode:
<br>
4.3.1 Create folder name "WelcomeJavaWorld"
<br>
4.3.2 Create folder name "WelcomeJavaWorld/META-INF"
<br>
4.3.3 Create file name "WelcomeJavaWorld/META-INF/<b>MANIFEST.MF</b>", content:
<br>
Manifest-Version: 1.0
<br>
Main-Class: Welcome
<br>
Souce: <a href="http://prntscr.com/e2ehpg">http://prntscr.com/e2ehpg</a>
<br>
<img src="http://image.prntscr.com/image/c12683b5ef5344c098143d8be956b373.png">
<br>
4.3.4 Compress folder "WelcomeJavaWorld" to "WelcomeJavaWorld.jar", using compressor:
<br>
root@srv021:/opt/JavaApp-Portable-Linux/apps# <b>zip -r WelcomeJavaWorld.jar META-INF Welcome.class</b>
<br>
Source: <a href="http://prntscr.com/e2eit3">http://prntscr.com/e2eit3</a>
<br>
<img src="http://image.prntscr.com/image/3b78c80fd64542beb17ea2ef07caaded.png">
<br>
Result, created "<b>WelcomeJavaWorld.jar</b>" file: <a href="http://prntscr.com/e2ejdt">http://prntscr.com/e2ejdt</a>
<br>
<img src="http://image.prntscr.com/image/5eea6c408edb499da67c839f16d32af1.png">
<br>
<br>
Test: <a href="http://prntscr.com/e2ekgb"> http://prntscr.com/e2ekgb </a>
<br>
<img src="http://image.prntscr.com/image/9db7d4845324473391bf53dff45f92c5.png">
<br>
/opt/jdk1.8.0_121/bin/java -jar WelcomeJavaWorld.jar
<br>
Welcome to Javaworld
</li>
</ul>


##
> 5. Theo quan điểm riêng của bạn, vì sao Java đang đứng top 1 của các ngôn ngữ lập trình? (theo <a href="http://www.tiobe.com/tiobe-index/">Tiobe</a>)
<ul>
<li>
<b>TIOBE Index for January 2017</b>
<br>
<img src="http://image.prntscr.com/image/373fc9a149684a3781ad95e511a2900c.png">
</li>
<li>
<b>TIOBE Programming Community Index</b>
<br>
<img src="http://image.prntscr.com/image/593ef5dddb3b4bb491e3022c241c6bdf.png">
</li>
<li>
<b>Very Long Term History</b>
<br>
<img src="http://image.prntscr.com/image/4a60353216584ebeaccb6cf122b32bac.png">
</li>
</ul>