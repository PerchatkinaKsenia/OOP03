

public class Medicine implements Comparable<Medicine>{
    private String name;
    private String weight;
    private int power;


    public Medicine(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "medicine{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(@NotNull Medicine o) {
        return Integer.compare(this.power, o.power);
//        if (this.name.compareTo(o.name) > 0) return -1;
//        if (this.name.compareTo(o.name) < 0) return 1;
//        return 0;
//        return Integer.compare(0, this.name.compareTo(o.name));
    }
}