/* combined service + repository layer for simplicity
will handle crud and business logic for now
* */

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<Book> books;
    //add an id bc we need to increment
    private int id = 1;

    public BookManager(){
        this.books = new ArrayList<>();
    }

    //create
    public Book createBook(String author, String title){
        if(author == null || title == null){
            System.out.println("Please provide both author and title");
        }
        Book b = new Book(id++, author, title);
        books.add(b);
        return b;
    }

    //read all books
   public List<Book> allBooks(){
        return new ArrayList<>(books);
   }

   //update book based on given Id
    public boolean updateBook(int id, String author, String title){
        for(Book b : books){
            if(b.getId() == id){
                b.setTitle(title);
                b.setAuthor(author);
                return true;
            }
        }
        return false;
    }

    //delete book based on given id
    public boolean deleteBook(int id){
        for(Book b: books){
            if(b.getId() == id){
                books.remove(id);
                return true;
            }
        }
        return false;
    }

    //mark as completed
    public boolean markAsCompleted(int id){
        for(Book b: books){
            if(b.getId() == id){
                b.setMarkAsCompleted(true);
                return true;
            }
        }
        return false;
    }

}
