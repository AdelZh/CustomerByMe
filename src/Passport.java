import java.time.LocalDate;

public class Passport {
    private LocalDate dateOfBirth;
    private String country;
    private String gender;

    public Passport(LocalDate dateOfBirth, String country, String gender) {
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }





    @Override
    public String toString() {
        return "Passport{" +
                "dateOfBirth=" + dateOfBirth +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
