import java.util.Date;

public abstract class Staff {
    private int id;
    private String nationalIDNumer;
    private String name;
    private String surname;
    private Date birdDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        
        // new id
    }

    public String getNationalIDNumer() {

        return nationalIDNumer;
    }

    public void setNationalIDNumer(String nationalIDNumer) {
        this.nationalIDNumer = nationalIDNumer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirdDate() {
        return birdDate;
    }

    public void setBirdDate(Date birdDate) {
        this.birdDate = birdDate;
    }
}
