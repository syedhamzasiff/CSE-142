public class Programmer extends Employee {
    private int linesOfCodePerDay;
    private double rate;
    private int time;

    public Programmer(String name, int id, double rate, int time) {
        super(name, id);
        this.rate = rate;
        this.time = time;
    }

    public int work() {
        linesOfCodePerDay = (int) (Math.random() * 1001) + 500;
        return linesOfCodePerDay;
    }

    @Override
    public double salary() {
        return linesOfCodePerDay * rate * time;
    }

    @Override
    public String toString() {
        return super.toString() + " rate: " + rate + " time: " + time;
    }

}
