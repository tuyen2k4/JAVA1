package baithijava1;

public class Book {
  private  String title;
  private Author authors;
  private  double price;

    public Book(String title, Author authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return authors;
    }

    public void setAuthor(Author authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return "Title: "+this.title+"\nAuthors: "+this.authors+"\nPrice: "+this.price;
    }




}
