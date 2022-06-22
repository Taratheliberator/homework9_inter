import roles.*;

public class Main {
    public static void main(String[] args) {

        Administrator administrator =  new User("Джон");

        Reader reader = (Reader) new User ("Томас");

        Librarian librarian = (Librarian) new User("Лукас");

        Supplier supplier = (Supplier) new User("Майкл");

        administrator.overdueNotification(reader); // уведомление о просроченности
        reader.takeBook(administrator); // читатель взял книги у администратора
        librarian.bookOrdering(supplier);// библиотекарь заказал книги у поставщика

        reader.takeBook(administrator); // Поставщик стал читателем и взял книги из библиотеки
        librarian.searchingBook(reader);// библиотекарь стал администратором и ищет книгу читателю
    }
}
