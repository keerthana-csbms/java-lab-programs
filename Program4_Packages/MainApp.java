//KEERTHANA G,1WN25CS108, LAB PROGRAM-4
import transaction.Account;
import reports.TransactionReport;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("KEERTHANA G,1WN25CS108, LAB PROGRAM-4");
        Account acc = new Account("ACC1001", 5000.0);
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.withdraw(10000);

        TransactionReport report = new TransactionReport();
        report.generateReport(acc);
    }
}