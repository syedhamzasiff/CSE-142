public class Person implements PersonInterface{
    int cashSaving;
    int retirementFund;
    String firstName;
    String lastName;

    public Person(int cashSaving, int retirementFund, String firstName, String lastName) {
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public int computeTotalWealth() {
        return cashSaving + retirementFund;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }

}
