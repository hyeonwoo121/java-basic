package ex1;

 class Book {
        String title = "Java Basic";

        public Book(String title) {
            title = title;
        }

        void printTitle() {
            System.out.println(this.title);
        }

        public static void main(String[] args) {
            Book book = new Book("Java Advanced");
            book.printTitle();
        }
    }

