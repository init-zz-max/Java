package main.gof.behaviour.mediator;

/**
 * Mock transactions
 */
public class TransactionN {
    public TransactionN(String typeOfTransaction, int quantity, String trader) {
        System.out.println("Transaction N executed" + typeOfTransaction + " " + quantity + " " + trader);
        //execute transaction ...
    }
}
