package Model;

public class Borrow {
    String student_name;

    public Borrow(String student_name, String taken_date, String return_date) {
        this.student_name = student_name;
        this.taken_date = taken_date;
        this.return_date = return_date;
    }

    String taken_date;
    String return_date;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getTaken_date() {
        return taken_date;
    }

    public void setTaken_date(String taken_date) {
        this.taken_date = taken_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
}
