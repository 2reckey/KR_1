//Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
//Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
public class Reader {
    String name;
    int library_card_number;
    String birthday;
    String faculty;
    String phone_number;

    public Reader(String name, int library_card_number, String birthday, String faculty, String phone_number) {
        this.birthday = birthday;
        this.faculty = faculty;
        this.name = name;
        this.phone_number = phone_number;
        this.library_card_number = library_card_number;
    }

    public String GetEnd(int amount, int status) {
        String end = "";
        if (amount == 1) {
            end = "у";
        } else if (amount < 6 || status == 1) {
            end = "и";
        }
        return end;
    }

    public void TakeBook(int amount) {
        String end = GetEnd(amount, 0);
        System.out.println(name + " взял " + amount + " книг" + end);
    }

    public void TakeBook(String[] book_name_array) {
        int amount = book_name_array.length;
        String end = GetEnd(amount, 1);
        System.out.print(name + " взял" + " книг" + end + ": ");
        for (int i = 0; i < amount; ++i) {
            System.out.print(book_name_array[i] + (i == amount-1 ? ".\n" : ", "));
        }
    }

    public void TakeBook(Book[] book_array) {
        int amount=book_array.length;
        String[] book_name_array=new String[amount];
        for (int i=0;i<amount;++i){
            book_name_array[i]=book_array[i].book_name;
        }
        TakeBook(book_name_array);
    }

    public void ReturnBook(int amount) {
        String end = GetEnd(amount, 0);
        System.out.println(name + " вернул " + amount + " книг" + end);
    }

    public void ReturnBook(String[] book_name_array) {
        int amount = book_name_array.length;
        String end = GetEnd(amount, 1);
        System.out.print(name + " вернул" + " книг" + end + ": ");
        for (int i = 0; i < amount; ++i) {
            System.out.print(book_name_array[i] + (i == amount - 1 ? ".\n" : ", "));
        }
    }

    public void ReturnBook(Book[] book_array) {
        int amount=book_array.length;
        String[] book_name_array=new String[amount];
        for (int i=0;i<amount;++i){
            book_name_array[i]=book_array[i].book_name;
        }
        ReturnBook(book_name_array);
    }

}
