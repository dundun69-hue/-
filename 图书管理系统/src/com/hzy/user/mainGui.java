package com.hzy.user;
import com.hzy.admin.*;
import com.hzy.book.*;
import com.hzy.user.*;
import java.util.Scanner;
public class mainGui {

    static int xuanze;
    static operation op=new operation();
    static Scanner input = new Scanner(System.in);
    public static void mainCz(){
        while(true){

            System.out.println("1：管理员模式");
            System.out.println("2：用户模式");
            System.out.println("3：退出系统");
            System.out.println("请输入选择的模块：");
                    xuanze=input.nextInt();
            switch (xuanze){
                case 1:adminGui.adminCz();break;
                case 2:userGui.userCz();break;
                case 3:outSystem();break;
            }
        }
    }

    public static void outSystem(){
        System.out.println("退出成功");
        System.exit(0);
    }

}
