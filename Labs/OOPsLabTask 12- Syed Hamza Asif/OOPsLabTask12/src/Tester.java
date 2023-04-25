public class Tester extends Employee {
    private int linesOfCodePerDay;
    private double rate;

    public Tester(String name, int id, double rate) {
        super(name, id);
        this.rate = rate;
    }

    public int work() {
        linesOfCodePerDay = (int) (Math.random() * 101) + 150;
        return linesOfCodePerDay;
    }

    @Override
    public double salary() {
        return linesOfCodePerDay * rate;
    }
    @Override
    public String toString() {
        return super.toString() + " rate: " + rate;
    }
}