package skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);


        String upperFullName = fullName.toUpperCase();
        System.out.println(upperFullName);


        String result = fullName.replace(" ", " ; ");
        System.out.println(result);


        String fullName1 = "Иванов Семён Семёнович";
        String validFullName1 = fullName1.replace('ё','е');
        System.out.println("Данные ФИО сотрудника — " +validFullName1);


    }
}
