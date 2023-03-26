public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся
        // в неструктурированном формате. Бухгалтерия попросила написать программу, в которой
        // можно работать с Ф. И. О. сотрудников.
        // Напишите четыре строки:
        // 1. С именем firstName — для хранения имени.
        // 2. С именем middleName — для хранения отчества.
        // 3. С именем lastName — для хранения фамилии.
        // 4. С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        // Выведите в консоль фразу: «ФИО сотрудника — …».

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan
        // Ivanovich" на полностью заглавные буквы.
        // В качестве строки с исходными данными используйте строку fullName
        // Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для
        // заполнения отчета — …"

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника для заполнения отчета  - " + fullName.toUpperCase());
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Система, в которой мы работаем, не принимает символ «ё». Напишите программу,
        // которая заменяет символ «ё» на символ «е».
        // В качестве исходных данных используйте строку fullName и данные в ней — "Иванов
        // Семён Семёнович".
        // Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».

        String fullName = "Иванов Семён Семёнович";

        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));

    }
}