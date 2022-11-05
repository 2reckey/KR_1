public class Main {

    public static void main(String[] args) {
	Reader Vasiliy=new Reader("Петров В. В.",123123,"11/09/2001","ИТиАБД","+7(988)5640356");
    Vasiliy.TakeBook(3);
    String[] book_names=new String[]{"Приключения", "Словарь", "Энциклопедия"};
    Vasiliy.TakeBook(book_names);
    Book book_1=new Book("Приключения");
    Book book_2=new Book("Словарь");
    Book book_3=new Book("Энциклопедия");
    Vasiliy.TakeBook(new Book[]{book_1, book_2, book_3});
    Vasiliy.ReturnBook(book_names);
    }
}
