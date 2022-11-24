import Model.Books;
import Model.Borrow;
import Model.Students;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Students stud1 = new Students("ram","12","17");
        Students stud2 = new Students("Shyam","12","18");
        Students stud3 = new Students("Hari","12","18");
        Books name1 = new Books("It ends with us","Colleen Hoover","2016",12345);
        Books name2 = new Books("It starts with us","Colleen Hoover","2022",123456);
        Books name3 = new Books("A thousand boy kisses","Tille Cole","2016",123457);
        Borrow naam1 = new Borrow("Bom","22 dec","22 jan");
        Borrow naam2= new Borrow("Sajjit","22 jan","22 feb");
        Borrow naam3 = new Borrow("Malla","22 feb","22 mar");

        System.out.println();


name2.result();






    }
}
