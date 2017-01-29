##Chapter01-02-Exercices##
##########################

**Bài tập cho chương 1,2 (20170122 17:12:56)**

> 1. Thế nào là JDK, JRE? Dùng JDK hoặc JRE trong những trường hợp nào?
> 2. Các biến môi trường PATH và CLASSPATH là gì? và được ứng dụng trong thực tế (qua nhiều hệ điều hành Windows, Linux ...) như thế nào?
> 3. Làm thế nào chỉ cần 1 câu lệnh có thể thực thi 1 file chứa source java được soạn từ console hoặc notepad?
> 4. Làm thế nào để tạo ra một bản protable JAVA có thể chạy mà không cần cài đặt? (đa phần các ứng dụng Java đều có yêu cầu cài sẵn môi trường Java)
> 5. Theo quan điểm riêng của bạn, vì sao Java đang đứng top 1 của các ngôn ngữ lập trình? (theo Tiobe)
mọi người trả lời trên GITHUB và paste link lên đây nhé.



##
##
**Answer (7:13 20170127)**

> Câu 1. Thế nào là JDK, JRE? Dùng JDK hoặc JRE trong những trường hợp nào?
<ul>
    <li>
    JDK is "Java Development Kit". That's the software for PROGRAMMERS who want to write Java programs.
	</li>

    <li>
    JRE is "Java Runtime Environment". That's the software for CONSUMERS who want to run Java programs.
    </li>
</ul>

##
> Câu 2. Các biến môi trường PATH và CLASSPATH là gì? và được ứng dụng trong thực tế (qua nhiều hệ điều hành Windows, Linux ...) như thế nào?
<ul>

"PATH" are the list of directories that the Operating System traverses to LOCATE EXECUTABLE FILES.


<b>On Linux</b>, add a line such as the following to the end of your [~/.bashrc] or [~/.bash_profile] or [/etc/profile] file:<br>
export PATH=jdk/bin:$PATH 


<b> On Windows</b>,
<br>
<a href="http://prntscr.com/e1nnat">1/ Computer-->Properties</a>
<br>
<a href="http://prntscr.com/e1nnl6">2/ Advanced System Settings</a>
<br>
<a href="http://prntscr.com/e1nnys">3/ System Properties-->Enviroment Variables...</a>
<br>
<a href="http://prntscr.com/e1noti">4/ System Variables</a>
<br>
4.1/ <b>PATH</b>: Add new value [;D:\Program Files\Java\jdk1.8.0_112\bin;] , without "Square brackets"
<br>
4.2/ <b>CLASSPATH</b>: Add new value [D:\Program Files\Java\jre1.8.0_112\lib;.;D:\Program Files\Java\jre1.8.0_112\lib\ext;]



    <li>
    </li>

    <li>
    </li>

    <li>
    </li>
</ul>
#
