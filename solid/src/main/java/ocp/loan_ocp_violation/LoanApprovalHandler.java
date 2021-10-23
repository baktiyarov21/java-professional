package ocp.loan_ocp_violation;

public class LoanApprovalHandler {
    public void approveLoan(PersonalLoanValidator validator)
    {
        if ( validator.isValid())
        {
            //Process the loan.
        }
    }
}
class PersonalLoanValidator
{
    public boolean isValid()
    {
        //Validation logic
        return true;
    }
}
