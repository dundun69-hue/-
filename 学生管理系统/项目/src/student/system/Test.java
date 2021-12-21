package student.system;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
    private static Scanner input=new Scanner(System.in);
    private static List<Student> list = new ArrayList<Student>();
    private static List<Account> listAccount = new ArrayList<Account>();
    //private static Student su=new Student();                      //创建学生对象（在这里创建学生对象后，添加学生方法最后一次添加会把前面数据覆盖）

    public static void main(String[] args) {
        jiemian();
    }

    public static void jiemian(){
        int xuanze=0;
        System.out.println("1：管理员模式");
        System.out.println("2：学生登录");
        System.out.println("3：关闭程序");
            while(true){
                System.out.println("请选择：");
                xuanze=input.nextInt();
                switch (xuanze){
                    case 1:adminAssess();break;
                    case 2:userGui();break;
                    case 3:chengxujieshu();break;
                }
            }
    }


    public static void adminGui(){                                  //管理员界面方法
        int xuanze;                                                 //Switch 选择定义变量
        System.out.println("===============");
        System.out.println("1：添加学生信息");
        System.out.println("2：删除学生信息");
        System.out.println("3：修改学生信息");
        System.out.println("4：查找学生信息");
        System.out.println("5：显示所有学生信息");
        System.out.println("6：学生数据存档");
        System.out.println("7：返回主界面");
        System.out.println("===============");
        while(true){
            System.out.println("请选择：");
            xuanze=input.nextInt();
            switch(xuanze){
                case 1:addStudent();
                    break;
                case 2:moveStudent();
                    break;
                case 3:changeStudent();
                    break;
                case 4:findStudent();
                    break;
                case 5:showStudent();
                    break;
                case 6:                      //不会写存档
                    break;
                case 7: jiemian();
                    break;
            }
        }
    }                                      //管理员界面方法

    public static void adminAssess() {
        String xuanze;
        System.out.println("想进管理员啊？我考考你。");
        System.out.println("那个属于本程序的类");
        System.out.println("A:Account  B:Tast  C:hzy最帅  D:student");
        while (true) {
            System.out.println("请选择：");
            xuanze = input.next();
            switch (xuanze) {
                case "A":adminGui();
                    break;
                case "a":adminGui();
                    break;
                case "B":huidacuowu();
                    break;
                case "b":huidacuowu();
                    break;
                case "C":adminGui();
                    break;
                case "c":adminGui();
                    break;
                case "D":huidacuowu();
                    break;
                case "d":huidacuowu();
                    break;
            }
        }
    }                   //选择题方法
            public static void userGui () {                                  //管理员界面方法
                int xuanze1;                                                 //Switch 选择定义变量
                System.out.println("===============");
                System.out.println("1：注册账户");
                System.out.println("2：查询学生成绩");
                System.out.println("3：返回主界面");
                System.out.println("===============");
                while (true) {
                    System.out.println("请选择：");
                    xuanze1 = input.nextInt();
                    switch (xuanze1) {
                        case 1:
                            loginStudent();
                            break;
                        case 2:
                            findStudent();
                            break;
                        case 3:
                            jiemian();
                            break;
                    }
                }
            }               //用户模块界面
            //管理员模块开始
            public static void addStudent () {                                        //添加学生信息的方法
                Student su = new Student();                                           //把学生对象new在addStudent方法里可以让while循环每词都new一次su对象，可以给list赋值新的数据
                double temp = 0;
                System.out.println("请输入学生姓名");
                su.setName(input.next());
                System.out.println("请输入学生学号");
                su.setNum(input.next());
                System.out.println("请输入学生数学成绩");
                su.setMath(input.nextInt());
                System.out.println("请输入学生语文成绩");
                su.setChinese(input.nextInt());
                System.out.println("请输入学生英语成绩");
                su.setEnglish(input.nextInt());

                temp = temp + su.getChinese() + su.getEnglish() + su.getMath();
                su.setTotal(temp);
                su.setAve(temp / 3.0);

                list.add(su);                                                       //list对象调用add方法把 su传入list中
            }                                                                       //添加学生数据方法

            public static void moveStudent () {                                       //删除学生数据方法
                String name = "";
                Student temp = null;
                System.out.println("输入您要删除的学生名字");
                name = input.next();
                if ((temp = findStudentByInput(name)) == null) {
                    System.out.println("您要删除的学生不存在");
                } else {
                    list.remove(temp);
                    System.out.println("删除成功！");
                }
            }                                                                       //删除学生数据方法（根据姓名删除）

            public static void findStudent () {                                       //查找学生方法
                String name = "";
                System.out.println("请输入学生名字进行查找");
                name = input.next();
                if (findStudentByInput(name) == null) {
                    System.out.println("您输入的学生不存在");
                } else {
                    System.out.println(findStudentByInput(name));
                }
            }                                                                       //查找学生方法

            public static void changeStudent () {
                double linshi = 0;
                Student temp = null;                                                                     //定义临时变量存储遍历的学生信息
                String name = "";
                System.out.println("请输入要修改的学生名字");
                name = input.next();
                if ((temp = findStudentByInput(name)) == null) {
                    System.out.println("您输入的学生不存在");
                } else {
                    System.out.println("请输入学生姓名");
                    temp.setName(input.next());
                    System.out.println("请输入学生学号");
                    temp.setNum(input.next());
                    System.out.println("请输入学生数学成绩");
                    temp.setMath(input.nextInt());
                    System.out.println("请输入学生语文成绩");
                    temp.setChinese(input.nextInt());
                    System.out.println("请输入学生英语成绩");
                    temp.setEnglish(input.nextInt());

                    linshi = linshi + temp.getChinese() + temp.getEnglish() + temp.getMath();
                    temp.setTotal(linshi);
                    temp.setAve(linshi / 3.0);

                }

            }                                                                     //更改学生方法

            public static void showStudent () {                                       //显示学生数据的方法
                for (Student su : list) {                                               //增强for循环
                    System.out.println(su.toString());
                }                                                                  //System.out.println(su.toString());
            }                                                                       //展示学生数据方法

            public static Student findStudentByInput (String input){                 //查找指定的学生数据，封装方法
                Student targer = null;                                              //定义临时变量去返回这个变量，并且给变量赋值
                for (Student su : list) {
                    if (input.equals(su.getName())) {                                 //equals方法用来比较是否相等 比较输入的名字和su中的名字
                        targer = su;
                        break;
                    }
                }
                return targer;
            }                                                   //查找指定的学生数据，封装方法
            //管理员模块结束

            //用户模块开始
            //注册模块
            public static void loginStudent () {
                Account account = new Account();
                System.out.println("输入注册的用户名");
                account.setAccount(input.next());
                System.out.println("输入你的密码");
                account.setPassword(input.next());
                listAccount.add(account);
            }           //注册账号方法
            //注册模块结束
            //登录模块开始
            public static void singUp () {            //不会写

            }                   //登录方法
            //登录模块结束
            //账户信息
            public static void showAccount () {
                for (Account account : listAccount) {
                    System.out.println(account.toStringAcc());
                }
            }               //展示全部账户和密码
            //用户模块结束
            public static void chengxujieshu () {
                System.out.println("这就不用了？");
                System.exit(0);
            }                   //退出程序

            public static void huidacuowu () {
                System.out.println("你装老师是不？你别用了");
                System.exit(0);
            }           //回答错误后退出程序方法
        }
