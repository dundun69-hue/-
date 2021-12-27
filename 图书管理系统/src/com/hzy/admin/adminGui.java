package com.hzy.admin;
import com.hzy.book.*;
import com.hzy.user.*;
import java.util.Scanner;

    public class adminGui {
    static operation op = new operation();
        public static void adminCz(){
            while (true) {
                System.out.println("请选择");
                System.out.println("1：添加书籍"+'\n'+"2：删除书籍"+'\n'+"3：修改书籍"+'\n'+"4：查找书籍"+'\n'+"5：列出所有书籍"+'\n'+"6：返回主界面");
                int xuanze;
                Scanner input = new Scanner(System.in);
                xuanze = input.nextInt();
                switch (xuanze) {
                    case 1: operation.addBook();    break;
                    case 2: operation.moveBook();   break;
                    case 3: operation.changeBook(); break;
                    case 4: operation.searchBook(); break;
                    case 5: operation.showBook();   break;
                    case 6: mainGui.mainCz();       break;
                }
            }
        }
    }
