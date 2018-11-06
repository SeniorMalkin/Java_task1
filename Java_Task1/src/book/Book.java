package book;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book: name: " + name + "  authors: " + getAuthorNames()
                + "  price: " + price + "  qty " +qty;
    }
    public  String getAuthorNames()
    {
        String result = " ";
        for (Author a: authors
             ) {
            result += a.getName() + ",";
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        for(int i =0 ;i<authors.length;i++)
        {
            if(!authors[i].equals(book.authors[i]))
                return false;
        }
        return name.equals(book.name) && price == book.price && qty == book.qty;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result += authors.hashCode();
        long f = Double.doubleToLongBits(price);
        result += (int)(f^(f >>> 32));
        result += qty;
        return result;
    }
}
