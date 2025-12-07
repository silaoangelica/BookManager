/*serves as the database
* DB model
* */

public class Book {

    private final int id;
    private String author;
    private String title;
    private boolean markAsCompleted;

    public Book(int id, String author, String title){
        this.id = id; //changeable? no. - setter not needed
        this.author = author;
        this.title = title;
        this.markAsCompleted = false;
    }

    //setter
    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setMarkAsCompleted(boolean markAsCompleted) {
        this.markAsCompleted = markAsCompleted;
    }

    //getter
    public int getId(){
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isMarkAsCompleted() {
        return markAsCompleted;
    }

    //return a
    //format: [ ] 1. Title - Author
    public String toString(){
        return String.format("[%s] %d. %s - %s",
                markAsCompleted ? "x" : " ", id, title, author);
    }
}
