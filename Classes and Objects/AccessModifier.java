public class AccessModifier {
    public static void main(String[] args) {
        BankAccount a=new BankAccount();
        System.out.println("Account "+ a.setAccount(22010));
        System.out.println("Username "+a.setUsername("Hariom"));
    }
}
class BankAccount{
    private String username;
    private int account;
    public String setUsername(String username){
        this.username=username;
        return username;
    }
    public int setAccount(int account){
        this.account=account;
        return account;
    }
}
