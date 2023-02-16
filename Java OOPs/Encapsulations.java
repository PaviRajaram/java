package study;
class Account{
    private int psw;
    private String UserName;
    public int getPsw() {
        return psw;
    }
    public void setPsw(int psw) {
        this.psw = psw;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
}
public class Encapsulations {
    public static void main(String[] args) {
        Account ac=new Account();
        System.out.println("Your Account:");
        ac.setUserName("Pavithra");
        System.out.println("UserName:"+ac.getUserName());
        ac.setPsw(3626);
        System.out.println("Password:"+ac.getPsw());
    }
}
