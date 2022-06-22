
package roles;
import roles.User;
public class Librarian extends User implements interfaces.Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public void bookOrdering(User supplier) {
        System.out.println("Библиотекарь " + name + " заказал книги " + "у " + "поставщика " + supplier.getName());
    }

    @Override
    public void searchingBook(User reader) {
        System.out.println("Администратор " + name + " ищет книгу" + " для читателя " + reader.getName());
    }
}