public class BankAccount {
    static  String bankName="ABC Bank";
    static int totalAccounts=0;

    static void getTotalAccounts(){
        System.out.println("Total number of bank accounts "+totalAccounts);
    }
    final int accountHolderNumber; // can't be manipulated
    String accountHolderName;

    BankAccount(int accountHolderNumber,String accountHolderName){
        this.accountHolderName=accountHolderName;
        this.accountHolderNumber=accountHolderNumber;
        totalAccounts++;
    }

    void printDetails(){
        System.out.println("Bank Name "+bankName);
        getTotalAccounts();
        System.out.println("Name of account holder "+accountHolderName);
        System.out.println("Name of account Number "+accountHolderNumber);
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount(8392830,"kjksdjfkls");

        if(b instanceof BankAccount){
            b.printDetails();
        }
    }
}
