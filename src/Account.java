public abstract class Account {

        protected  long balance;

        public boolean add(long amount){
        if (amount <= 0) {
            return false;
        }
        balance = balance + amount;
        return true;
        }

        public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            return account.add(amount);
        }
        else {
            return false;
        }
        }

        public abstract boolean pay(long amount);

        public long getbalance(){
            return balance;
        }

}
