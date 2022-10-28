public class Main {
    public static void main(String[] args) {
        System.out.println("//задание 2");
        String firstName = "Ivan";
        String  middleName = "Ivanov";
        String  lastName = "Ivanovich";

        String fullName1 = firstName + " " + middleName + " " + lastName;
        String fullName2 = fullName1.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullName1);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);

        System.out.println("//задание 3");
        String fullName = "Иванов Семён Семёнович";

        String s2 = fullName.replace('ё', 'е');
        System.out.println(s2);
    }
}