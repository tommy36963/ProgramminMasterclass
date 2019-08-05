package section6OOP;

public class BankAccount {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount(403537, 7777, "Ronald Mcdonald", "Rmcdonald@maccys.com","372585988");
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());


        bankAccount.depositFunds(800);
        bankAccount.withdrawFunds(300);

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());

        VipCustomer vipCustomer1 = new VipCustomer("Bob", 25000.00);
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Tim", 100.00, "timmy@g.com");
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());



    }

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){ // Default Constructor can be used also
        //this(81446,32.00,"Default name", "Default email", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber,double balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public  void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made.  New balance = " + this.balance);

    }
    public void withdrawFunds(double withdraw){
        if(this.balance - withdraw < 0){
            System.out.println("Invalid funds only " + this.balance + " is available to withdraw");
        }else{
            this.balance -= withdraw;
            System.out.println("Withdrawal of " + withdraw + " processed.  Remaining balance = " + this.balance);
        }

    }

}
