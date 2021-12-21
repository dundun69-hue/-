package student.system;
/*
姓名 name 学号num 数学math 语文chines 英语english   总成绩total  平均分ave

*/
public class Student {
    private String name;
    private String num;
    private int math;
    private int chinese;
    private int english;
    private double total;             //总成绩
    private double ave;           //平均分

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAve() {
        return ave;
    }

    public void setAve(double ave) {
        this.ave = ave;
    }
    public String toString(){
        return "学生姓名："+name+"，学生学号："+num+"，数学成绩："+math+"，语文成绩："+chinese+"，英语成绩："+english+
                "，总成绩："+total+"，平均分："+ave;
    }
}
