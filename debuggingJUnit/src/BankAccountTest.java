import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount account = new BankAccount("Jenny", "Austin", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
        // the delta value is the margin of error allowed between expected and actual values.

    }

    // best practices - you should run only one assert per test
    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("This test has not been implemented");

    }

    // Name of the method should reflect the actual test being done.
    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount account = new BankAccount("Jenny", "Austin", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
        //every test should be able to run separately, and pass on its own without the need for running the other tests in the Test class
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount account = new BankAccount("Jenny", "Austin", 1000.00, BankAccount.CHECKING);
        double balance = account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
        //every test should be able to run separately, and pass on its own without the need for running the other tests in the Test class
    }

    @org.junit.jupiter.api.Test
    void dummyTest() {
        assertEquals(20, 20);
        //first value is what value you want to test and the second is the actual value.
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        BankAccount account = new BankAccount("Jenny", "Austin", 1000.00, BankAccount.CHECKING);
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }
}

//To avoid mistakes, add a fail immediately so that you don't forget to add a test and then think its passed when really there was no test included in the "test"