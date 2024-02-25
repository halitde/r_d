import java.util.ArrayList;

public abstract class AdministrativeStaff  extends Staff{
    private ArrayList<String> responsibilities;

    public ArrayList<String> getresponsibilities() {
        return responsibilities;
    }

    public void setresponsibilities(ArrayList<String> responsibility) {

        this.responsibilities = responsibility;

    }
}
