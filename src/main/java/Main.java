import dao.UserDao;
import model.User;

public class Main {
    public static void main(String[] args) {

        User user = new User("Guster", "Rua do Feirante nao sei o numero", 812);

        UserDao dao1 = new UserDao();
        dao1.addUser(user);
        System.out.println("Lista do objeto dao1" + dao1.listUsers());

        UserDao dao2 = new UserDao();
        System.out.println("Lista do objeto dao2" + dao2.listUsers());

        UserDao dao3 = new UserDao();
        System.out.println("Lista do objeto dao3" + dao3.listUsers());

        UserDao dao4 = new UserDao();
        System.out.println("Lista do objeto dao4" + dao4.listUsers());

        UserDao dao5 = new UserDao();
        System.out.println("Lista do objeto dao5" + dao5.listUsers());

    }
}
