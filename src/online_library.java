//you have to implement a library using java class library...
//methods :show available books,add books ,issue books, return books
// properties :array to store the available books,
// array to store the issued books
class Library {
    int no_of_books;
    String[] books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    public void addBooks(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book has been added!!");
    }

    public void showAvailableBooks() {
        System.out.println("Showing available books : ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    public void issueBooks(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    public void returnBooks(String book) {
        addBooks(book);
        System.out.println("The book has been returned!!");
    }
}

public class online_library {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBooks("Think and Grow Rich");
        l.addBooks("Algorithms");
        l.addBooks("C++");
        l.showAvailableBooks();
        l.issueBooks("C++");
        l.showAvailableBooks();
        l.returnBooks("C++");
        l.showAvailableBooks();
    }
}
