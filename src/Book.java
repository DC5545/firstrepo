import java.util.Objects;

public class Book {
    /*Book – tytuł, autor, rok wydania, status („dostępna”/„wypożyczona”).
    Utworzyć klasę Book z polami: title, author, year, isAvailable.
    Dodać konstruktor i gettery/settery.
    Nadpisać toString() tak, aby wyświetlała dane książki.
    (Opcjonalnie) nadpisać equals() i hashCode() – książka uznawana za tę samą, jeśli tytuł i autor się zgadzają.
     */

    //Pola klasy(atrybuty) prywatne - dostęp do nich odbywa się poprzez gettery i settery
    private String title;
    private String author;
    private int yearOfPublication;
    private boolean availableStatus; //status książki, gdzie true = dostępna, false = niedostępna

    //Konstruktor
    public Book (String title, String author, int yearOfPublication, boolean availableStatus){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.availableStatus = availableStatus;
        //TODO czy ten konstruktor wystarczy?
    }

    //Getter i setter dla title, author, yearOfPublication, availableStatus
    public String getTitle(){
       return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public int getYearOfPublication(){return yearOfPublication;}
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isAvailableStatus(){
        return availableStatus;
    }
    public void setAvailableStatus(boolean availableStatus){
        this.availableStatus = availableStatus;
    }

    //Nadpisanie metody toString() tak, aby wyświetlała dane książki
    @Override
    public String toString() {
        return String.format("%s , %s (%d) - %s",
                title, author, yearOfPublication, availableStatus ? "available" : "unavailable");
    }

    //Nadpisanie equals() i hashcode() - książka uznawana za tę samą, jeśli tytuł i autor się zgadzają.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title != null && author != null
                && title.equalsIgnoreCase(book.title) && author.equalsIgnoreCase(book.author);
    }

    //Hascode()
    public int hastCode() {
        return Objects.hash(tittle == null ? null : title.toLowercase(), author == null ? author.toLowercase());
    }

}
