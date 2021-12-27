package com.hzy.user;

import java.util.ArrayList;
import java.util.Scanner;
import com.hzy.user.*;
import com.hzy.book.*;
import com.hzy.admin.*;
import com.hzy.test;
public class login {
    static ArrayList<account> list = new ArrayList<account>();
    static String zhanghao;
    static String mima;
    static Scanner input = new Scanner(System.in);
    static login lg=new login();

    public static void logIn(){               //注册方法
        account at = new account();
        System.out.println("输入注册成账号");
        at.setZhanghao(input.next());
        System.out.println("输入注册密码");
        at.setMima(input.next());
        list.add(at);
        loginCz();
    }

    public static void signUp(){              //登录方法
        System.out.println("输入登录账号");
        zhanghao=input.next();
        if( findAccount(zhanghao)==null){
            System.out.println("您输入的账号不存在");
        }else{
            System.out.println("请输入密码");
            mima=input.next();
            if( findAccount2(mima)==null ){
                System.out.println("密码错误");
            }else{
                System.out.println("密码正确");
                mainGui.mainCz();
            }
        }
    }



    public static account findAccount(String zhanghao){
        account tamp=null;
        for (account at:list) {
            if (zhanghao.equals(at.getZhanghao())){
                tamp=at;
            }
        }
        return tamp;
    }


    public static account findAccount2(String mima){
        account tamp2=null;
        for (account at:list) {
            if (mima.equals(at.getMima())){
                tamp2=at;
            }
        }
        return tamp2;
    }


    public static void loginCz(){
        System.out.println("==============");
        System.out.println("1：注册");
        System.out.println("2：登录");
        System.out.println("3：退出");
        System.out.println("==============");
        int xuanze;
        xuanze=input.nextInt();

        while (true){

            switch (xuanze){
                case 1: logIn(); break;
                case 2: signUp(); break;
                case 3: mainGui.outSystem(); break;
            }
        }

    }

}
