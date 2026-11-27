//KEERTHANA G,1WN25CS108, LAB PROGRAM-4
package reports;

import transaction.Account;

public class TransactionReport {
    public void generateReport(Account account) {
        System.out.println("------ Transaction Report ------");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
        System.out.println("--------------------------------");
    }
}