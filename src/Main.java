import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();

        System.out.println("Start of book manager");
        System.out.println("---------------------");

        while (true){
            System.out.println("Please enter a number");
            System.out.println("1. Add a new book");
            System.out.println("2. Delete a book");
            System.out.println("3. Update a book");
            System.out.println("4. List all book");
            System.out.println("5. Mark book as read");
            System.out.println("6. Exit");

            String input = scanner.nextLine();

            if(input.isBlank()){
                break;
            }

            if(input.equals("1")){
                //add a new book
                System.out.println("Please insert title");
                String newTitle = scanner.nextLine();
                System.out.println("Please insert author");
                String newAuthor = scanner.nextLine();
                bookManager.createBook(newAuthor, newTitle);
                System.out.println("Added a new book: " + newAuthor + " by " + newAuthor);

            } else if(input.equals("2")){
                //remove a book
                System.out.println("Insert id of a book to remove");
                String id = scanner.nextLine();
                bookManager.deleteBook(Integer.parseInt(id));
                System.out.println("Deleted book with id of + " + id);
            } else if(input.equals("3")){
                //update a book based on id
                System.out.println("Insert id of a book you need to update");
                String id = scanner.nextLine();
                String newAuthor = scanner.nextLine();
                String newTitle = scanner.nextLine();
                bookManager.updateBook(Integer.parseInt(id), newAuthor, newTitle);
                System.out.println("Book no:" + id + "updated with new values: " + newTitle + " - " + newAuthor);
            } else if (input.equals("4")) {
                //list all books
                if(bookManager.allBooks().isEmpty()){
                    System.out.println("Book list is empty, please add author and title");
                } else{
                    for(Book b: bookManager.allBooks()){
                        System.out.println(b);
                    }
                }
            } else if(input.equals("5")){
                //mark book as completed
                System.out.println("Insert if of book to be mark as completed");
                String id = scanner.nextLine();
                bookManager.markAsCompleted(Integer.parseInt(id));
                System.out.println("Book " + id + " marked as completed");
            } else if(input.equals("6")){
                System.out.println("Exiting book manager");
            } else{
                System.out.println("Number invalid, please input 1-6");
            }

        }

    }
}