public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задача №1_______");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName;

        fullName = String.join(" ", lastName,firstName,middleName);
        System.out.println("Ф.И.О. сотрудника - "+fullName);
        System.out.println();

        System.out.println("_______Задача №2_______");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        System.out.println();

        System.out.println("_______Задача №3_______");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName);
    }
}