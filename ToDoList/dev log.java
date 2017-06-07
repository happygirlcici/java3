CREATE TABLE IF NOT EXISTS `people`.`person` (
  `taskid` INT(11) NOT NULL AUTO_INCREMENT,
  `taskname` VARCHAR(60) NOT NULL,
  `taskdate` date NOT NULL,
  `taskstatus` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`taskid`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


====
tfTaskName

btAdd
btChooseDate
btSearch
jxDpTaskDate

jListTask

listModelTask

cbTaskStatusUnfinished
cbTaskStatusFinished

popupMenu

ppmiDelete
ppmiEdit


dlgEdit

dlgtfTaskName
dlgDatePicker
dlgtfTaskDate
dlgtfTaskStatus

dlgbtEdit
dlgbtQuit

dlglbEditResult


https://davidwburns.wordpress.com/2012/06/19/add-jxdatepicker-to-the-netbeans-swing-controls-palette/

java.util.Date cannot be cast to java.sql.Date

java.lang.ClassCastException: java.util.Date cannot be cast to java.sql.Date

how to import date picker in netbeans

http://stackoverflow.com/questions/15077455/converting-date-format-of-jxdatepicker-to-date-type-of-mysql-for-storing-it-in-d

I want to store the date type value in mysql with the format: yyyy-mm-dd How can I do it?
final SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");

DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
jXDatePicker1.setFormats(dateFormat);
DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
String date_to_store = sysDate.format(jXDatePicker1.getDate()).toString();
This will give you jXDatePicker1 (declaration and initilization not included here) input as properly formatted String date_to_store output to store in mySQL.



if(i<0)
i=0;
else
i=i-1;

可簡寫成

i=(i<0)?0:i-1;

done


AWT-EventQueue-0" java.lang.ArrayIndexOutOfBoundsException: -1
================================
http://stackoverflow.com/questions/14684523/add-swingx-pallete-in-netbeans-7-2

Adding SwingX library to NetBeans:

Open NetBeans, go to menu Tools > Library Manager and click "New Library...";
Type a name (could be "SwingX") and click Ok;
Select the Library that you created and, in the Classpath box (on the right), click "Add JAR/Folder...";
Then go to the folder where you downloaded swingx.jar file, select it and click "Add JAR/Folder" in this window.
Now the SwingX components are already available to you use in NetBeans. But, to use them in a project, do the following steps:

Adding SwingX library to the Project Libraries:

Right click on your project that you want to use the SwingX components and select Properties;
Select "Libraries" in the left box;
Click "Add Library..." and select the library that you created in Adding SwingX library to NetBeans ("SwingX", as I suggested);
Click "Add Library" and then Ok.
Now your project can use the SwingX components, but we already need to set the NetBeans's Palette to show the SwingX components.


=================================
安装使用SQLite
http://www.runoob.com/sqlite/sqlite-tutorial.html

https://www.oschina.net/question/12_53183



进入 SQL 下载页面：http://www.sqlite.org/download.html
下载 Windows 下的预编译二进制文件包：
sqlite-shell-win32-x86-<build#>.zip
sqlite-dll-win32-x86-<build#>.zip
注意: <build#> 是 sqlite 的编译版本号
将 zip 文件解压到你的磁盘，并将解压后的目录添加到系统的 PATH 变量中，以方便在命令行中执行 sqlite 命令。

CREATE TABLE IF NOT EXISTS task (
  `taskid` INT(11) NOT NULL AUTO_INCREMENT,
  `taskname` VARCHAR(60) NOT NULL,
  `taskdate` date NOT NULL,
  `taskstatus` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`taskid`))
  
  
  
  create table task(
   ...> taskid int primary_key,autoincrement,
   ...> taskname varchar(60),
   ...> taskdate varchar(30),
   ...> taskstatus varchar(15));
   
   create table task( taskid INTEGER PRIMARY KEY   AUTOINCREMENT,taskname varchar(60) not null ,taskdate varchar(30) not null,taskstatus varchar(15));
   
   INSERT INTO task (taskid,taskname,taskdate,taskstatus) VALUES (1, 'Buy milk', '2017-01-01 00:00:00', 'finished' );
   
   windows环境变量
   
   http://www.360doc.com/content/13/0127/06/7775902_262609993.shtml
   
   
   sqlite autoincrement id 问题？
   
   问题：
   resultSet
   
   ===========================================
   
   或者也可以直接用以下命令
mysql>show tables from databaseName;//databaseName可以用show databases得来

mysql查看表结构命令，如下:
desc 表名;
show columns from 表名;
或者
describe 表名;
show create table 表名;
或者
use information_schema
select * from columns where table_name='表名';

 Class.forName("org.sqlite.JDBC");  
         connection = DriverManager.getConnection("jdbc:sqlite:C:\sqlite3\task.db"); 

C:\sqlite3\task

jdbc:sqlite:C:/sqlite3/task.db