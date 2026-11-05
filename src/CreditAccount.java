public class CreditAccount extends Account {
    private long creditLimit = 10_000;

    @Override 
    public boolean pay(long amount){
        if (amount <= 0) {
            return false;
        }
        if (balance - amount < -creditLimit) {
            return false;
        }
        balance = balance - amount;
        return true;
    }
}
