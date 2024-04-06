package testng;

import org.testng.annotations.Test;

public class GroupAttributes {

    @Test(groups = "LoanType1")
    public void personal_loan(){
        System.out.println("personal_loan");
    }

    public void home_loan(){
        System.out.println("home_loan");
    }

    @Test(groups = "LoanType2")
    public void gold_loan(){
        System.out.println("gold_loan");
    }

    @Test(groups = "LoanType2")
    public void credit_card_loan(){
        System.out.println("credit_card_loan");
    }
}
