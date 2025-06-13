package lab7;

public class Task2 {
    static class Book {
        private String title;
        private String author;
        private double price;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price >= 0) {
                this.price = price;
            }
        }

        public void displayInfo() {
            System.out.println("Назва: " + title + ", Автор: " + author + ", Ціна: " + price);
        }
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("1984");
        book.setAuthor("Джордж Орвелл");
        book.setPrice(250);
        book.displayInfo();
    }
}
