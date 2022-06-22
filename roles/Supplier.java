package roles;
import roles.Supplier;
public class Supplier extends User implements interfaces.Supplier {


      private String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void bookSupplying(User supplier) {
        System.out.println("Поставщик " + name + " привез книги");

    }


   // @Override
   // public void takeBook(Administrator administrator) {
    //    System.out.println("Читатель " + name + " взял книги у администратора " +  administrator.getName());
   // }

    //@Override
  //  public void returnBook(Administrator administrator) {
     //   System.out.println("Читатель " + name + " вернул книги администратору " + administrator.getName());
 //   }
}
