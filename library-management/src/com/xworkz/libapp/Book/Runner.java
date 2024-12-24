package com.xworkz.libapp.Book;

public  interface Runner {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);
        book.setBookId(1);
        book.setBookName("Political history of assam");
        book.setBookAuthor("Dr.Rajen Saikia");
        book.setBookPublication("Rathod publications");
        System.out.println(book.hashCode());

        Book book1 = new Book();
        System.out.println(book1);
        book1.setBookId(1);
        book1.setBookName("Political history of assam");
        book1.setBookAuthor("Dr.Rajen Saikia");
        book1.setBookPublication("Rathod publications");
        System.out.println(book1.hashCode());

//        boolean same = book.equals(book1);
//        System.out.println(same);

    }
}
