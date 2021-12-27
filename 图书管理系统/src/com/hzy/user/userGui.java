package com.hzy.user;
import com.hzy.book.*;

import java.util.Scanner;

public class userGui {
    static operation op = new operation();
    static int xuanze;
    public static void userCz(){
        while(true){
            System.out.println("请选择");
            System.out.println("1：查找书籍");
            System.out.println("2：借书");
            System.out.println("3：查看所有书籍");
            System.out.println("4：返回主界面");
            Scanner input = new Scanner(System.in);
            xuanze = input.nextInt();
            switch (xuanze){
                case 1:operation.searchBook();break;
                case 2:operation.borrowBook();break;
                case 3:operation.showBook();break;
                case 4:mainGui.mainCz();break;
            }

        }
    }

}
