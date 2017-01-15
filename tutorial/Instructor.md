NGUYÊN TẮC ĐẦU TIÊN KHI HỌC LẬP TRÌNH
=====================================
##Học tư duy, không học code##
> -Code là muôn hình vạn trạng, còn tư duy là kim chỉ nam, là định hướng để giải quyết vấn đề, trong sách có 14 chương
đa phần các bạn làm system, có thể bỏ qua chương 10,11,12. Trừ phi các bạn muốn làm ứng dụng có giao diện và chúng ta sẽ bắt đầu từ chương 1

> -Trung bình 1 tuần sẽ là 1 chương. Chúng ta sẽ có khoản 12 tuần để hoàn thành phần lập trình Java
thuật ngữ là Java SE. SE = Standard Edition, **có nội lực Java SE thì mới có thể sang Java EE tốt được**. EE = Enterprise Edition

> -Java EE là bao gồm các kỹ thuật lập trình hướng web và trên các môi trường doanh nghiệp, tuy nhiên dù phức tạp đến chừng nào thì tất cả vẫn base nên nội lực Java SE, chỉ cần học tốt Java SE thì mọi thứ khác sẽ hấp thụ khá nhanh.


**Chúng ta có 3 IDE chính để chạy Java**

NO | IDE             
---|-----------------
 1 |[Eclipse](https://eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/neon/2/eclipse-java-neon-2-win32-x86_64.zip)      
 2 |[NetBeans] (http://download.netbeans.org/netbeans/8.2/final/bundles/netbeans-8.2-javase-windows.exe)
 3 |[IntelliJ IDEA] (https://download.jetbrains.com/idea/ideaIU-2016.3.2.win.zip)
(LastUpdate: 2017.01.15)

Đa phần công ty outsource xài Eclipse các project cá nhân xài NetBeans, IntellJ là bá đạo nhất (nhưng có tính phí. Android Studio base trên IntellJ
Bản JavaSE của IntellJ thì free, IDE là tool để hỗ trợ lập trình Java trực quan hơn, còn về bản chất có thể dùng notepad hoặc console để soạn thảo code java cũng được.

##Source code chúng ta sẽ dev dùng các IDE nêu trên sau đó push source lên github##


##Lịch học:##
> -Chúng ta sẽ bắt đầu tìm hiểu vào các **chiều thứ Bảy từ 2h - 5h**. Nội dung xoay quanh các thắc mắc về chương đã đọc trong tuần và làm bài tập
nộp qua github

> -Mỗi người nên là 1 account git, để sau này có thể tự mình review lại chặng đường mình đã đi qua

> -Thứ Bảy tuần sau là trả bài chương 1, chương 2 nha các bạn,  **21/1/2017: trả bài chương 1, 2**

> -Nội dung kiểm tra gồm các kiến thức, khái niệm được mô tả trong chương 1, 2 và một số cách vận dụng kiến thức vào thực tế và hãy luôn nhớ, #LẬP TRÌNH LÀ NIỀM VUI#, cứ thoải mái nhất, ngồi cafe và đọc sách lập trình.

#
#
#
#
#
##Hướng dẫn sử dụng GITHUB##
> https://github.com/hocchudong/git-github-for-sysadmin

> http://rogerdudler.github.io/git-guide/index.vi.html

> http://knsv.github.io/mermaid/live_editor/


##Draw Diagrams With Markdown##
###################################
```sequence
Andrew->China: Says Hello
Note right of China: China thinks about it
China-->Andrew: How are you?
Andrew->>China: I am good thanks!
```

```flow
st=>start: Start:>http://www.google.com[blank]
e=>end:>http://www.google.com
op1=>operation: My Operation
sub1=>subroutine: My Subroutine
cond=>condition: Yes
or No?:>http://www.google.com
io=>inputoutput: catch something...

st->op1->cond
cond(yes)->io->e
cond(no)->sub1(right)->op1
```
#
```
%% Sequence diagram code
sequenceDiagram
    participant Alice
    participant Bob
    Alice->>John: Hello John, how are you?
    loop Healthcheck
        John->>John: Fight against hypochondria
    end
    Note right of John: Rational thoughts<br/>prevail...
    John-->>Alice: Great!
    John->>Bob: How about you?
    Bob-->>John: Jolly good!
```
#
<img src="http://image.prntscr.com/image/e03c941747844484968dcd85772e0865.png">
