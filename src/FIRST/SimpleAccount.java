package FIRST;
public class SimpleAccount extends Account {
@Override
public boolean pay(long amount){
    if (amount <= 0) {
        return false;
    }
    if (balance < amount) {
        return false;
    }
    balance = balance - amount;
    return true;
}
}