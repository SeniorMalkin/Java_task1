import book.Author;
import book.Book;

import java.net.Authenticator;

public class main {
    public static void main(String[] args) {
        Author a1 = new Author("Dan Braun","@dbraun",'m');
        Author a2 = new Author("Joane Rouling", "@roul",'f');
        Author a3 = new Author("Lev Tolstoy", "@peaceAnDwar",'m');
        Author[] aths = {a1,a2,a3};
        Book bk1 = new Book("Red book",aths,1001.1);
        System.out.println(bk1.getAuthorNames());
        System.out.println(bk1.getAuthors());
        System.out.println(bk1.toString());
    }
}
