import java.util.ArrayList;

public class customerRecords implements java.io.Serializable {

    ArrayList<Records> records = new ArrayList<Records>();

    public customerRecords(ArrayList<Records> records) {

    }

    public ArrayList<Records> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Records> records) {
        this.records = records;
    }


}



