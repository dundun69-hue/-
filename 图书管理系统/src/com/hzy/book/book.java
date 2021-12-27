package com.hzy.book;

public class book {
    private String BookName;
    private String BookAuthor;
    private int BookPrice;
    private String Booktype;
    private boolean BookState;//是否被借走
    private String name;//借阅人

    /*
    public book(String BookName,String BookAuthor,int BookPrice,String Booktype,boolean BookState,String name){
    this.BookName=BookName;
    this.BookAuthor=BookAuthor;
    this.BookPrice=BookPrice;
    this.Booktype=Booktype;
    this.BookState=BookState;
    this.name=name;
    }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        this.BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.BookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.BookPrice = bookPrice;
    }

    public String getBooktype() {
        return Booktype;
    }

    public void setBooktype(String booktype) {
        this.Booktype = booktype;
    }

    public boolean isBookState() {
        return isBookState();
    }

    public void setBookState(boolean bookState) {
        this.BookState = bookState;
    }

    public String toString(){
        return "书名"+BookName+"作者"+BookAuthor+"价格"+BookPrice+"是否被借走"+BookState+"类型"+Booktype+"被"+name+"借走了";
    }

}






