package student.system;

public class Account {
    private String account;             //账号
    private String password;            //密码

    public String getAccount() {        //获取账号
        return account;
    }

    public void setAccount(String account) {    //添加密码
        this.account = account;
    }

    public String getPassword() {       //获取密码
        return password;
    }

    public void setPassword(String password) {      //添加密码
        this.password = password;
    }


    public String toStringAcc() {
        return "账户信息{" + "账号='" + account + '\'' + ", 密码='" + password + '\'' + '}';
    }
}
