package TOY_SHOP1.TOY_SHOP;


public class MainApp {
    public static void main(String[] args) {

        try {
            BaseView[] view = {new AdminView(), new ConsumerView()};
            new Controller().appStart(view, args[0]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("============ Лотерея игрушек ===============");
            System.out.println("Вызов справки, введите аргумент: --help, -h");
            System.out.println("============================================");
        }
    }
}
