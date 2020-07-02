public class Symptom {
    private String name;
    private int days;

    public Symptom(String name, int days) {
        this.name = name;
        this.days = days;
    }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int days() { return days; }

    public void setDays(int days) { this.days = days; }
}

