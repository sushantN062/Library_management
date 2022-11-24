package Model;

public class Students {
String name;

    public Students(String name, String clas, String age) {
        this.name = name;
        this.clas = clas;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    String clas;
String age;

public void printFormat(){
    System.out.println();
}




}
