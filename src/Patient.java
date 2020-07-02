import java.util.ArrayList;

public class Patient {
    private String name;
    private String email;
    private String phone;
    private String city;
    private String state;
    private ArrayList<Symptom> symptoms;


    public Patient(String name, String email, String phone, String city, String state, ArrayList<Symptom> symptoms) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.symptoms = symptoms;
    }

    public Patient() {

    }
}
