package Factory;

public class Drink {
    private String name;
    private double prise;
    private String stat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String isStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", stat='" + stat + '\'' +
                '}';
    }

    public void prepare(){
        System.out.println(toString());
    }
}
