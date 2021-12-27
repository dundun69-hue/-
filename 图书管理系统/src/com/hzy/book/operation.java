package com.hzy.book;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class operation {
     static Scanner input = new Scanner(System.in);
     public static ArrayList<book> list =new ArrayList<book>();


    static String BookName;             //书的名字
    static String BookAuthor;          //书的作者
    static int BookPrice;           //书的价格
    static String Booktype;        //书的类型
    static boolean BookState;      //书是否被借走
    static String name;



    public static void addBook(){                  //添加一本书籍
        book bk=new book();
        System.out.println("==================");
        System.out.println("请输入要添加的书籍名字：");
        bk.setBookName(input.next());
        System.out.println("请输入作者姓名：");
        bk.setBookAuthor(input.next());
        System.out.println("请输入书的类型：");
        bk.setBooktype(input.next());
        System.out.println("请输入书的价格：");
        bk.setBookPrice(input.nextInt());
        bk.setBookState(false);
        list.add(bk);
        System.out.println("添加成功！");
        System.out.println("===================");
    }

    public static void moveBook(){
        String BookName;
        System.out.println("请输入要删除的书名");
        BookName=input.next();
    if (findBook(BookName)==null){
        System.out.println("查无此书");
        }else{
        list.remove(findBook(BookName));
        }
    }


    public  static book findBook(String BookName){
        book targer = null;                                              //定义临时变量去返回这个变量，并且给变量赋值
        for (book bk : list) {
            if (BookName.equals(bk.getBookName())){                                 //equals方法用来比较是否相等 比较输入的名字和su中的名字
                targer = bk;
                break;
            }
        }
        return targer;
    }


    public static void showBook() {
        if (list.isEmpty()) {
            System.out.println("书库现在没有书籍");
            } else {
            for (book bk : list) {
                    System.out.println(bk.toString());
                }
            }
         }

    public static void changeBook(){
        String BookName;
        book tamp=null;
        System.out.println("请输入要修改的书籍名称");
        BookName = input.next();
        if((tamp=findBook(BookName))==null){
            System.out.println("查无此书");
            System.out.println("修改失败");
        }else if((findBook(BookName).getName())==null ){
            System.out.println("请输入新的书名");
            tamp.setBookName(input.next());
            System.out.println("请输入新的作者");
            tamp.setBookAuthor(input.next());
            System.out.println("请归类书的新类型");
            tamp.setBooktype(input.next());
            System.out.println("请输入书的新价格");
            tamp.setBookPrice(input.nextInt());
        }else{
            System.out.println("请输入新的书名");
            tamp.setBookName(input.next());
            System.out.println("请输入新的作者");
            tamp.setBookAuthor(input.next());
            System.out.println("请归类书的新类型");
            tamp.setBooktype(input.next());
            System.out.println("请输入书的新价格");
            tamp.setBookPrice(input.nextInt());
            System.out.println("请输入新的借书人姓名");
            tamp.setName(input.next());
        }
    }

    public static void searchBook(){
        String bookname;
        System.out.println("请输入要搜索的书名");
        bookname=input.next();
        if(findBook(bookname)==null){
            System.out.println("搜索的书籍不存在");
        }else{
            System.out.println();
        }
    }

    public static void borrowBook(){
        book bk=new book();
        String BookName;
        book tamp=null;
        System.out.println("请输入要借的书名");
        BookName=input.next();
        if(findBook(BookName)==null){
            System.out.println("没有这本书！");
        }else{
            bk.setBookState(true);
            list.add(bk);
        }

    }


}
