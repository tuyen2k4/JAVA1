package baithijava1;

public class Bookdemo {
    public static void main(String[] args){
        Author authors= new Author("Russel ","Winderand");
        Book book = new Book("Developing Java Software",authors,79.75);
        System.out.println(book);

    }
}
