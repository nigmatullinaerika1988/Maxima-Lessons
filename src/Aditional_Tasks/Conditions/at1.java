package src.Aditional_Tasks.Conditions;

import java.util.Scanner;

//1. Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
//“Число больше десяти”, если меньше – “Число меньше десяти”
public class at1 {
    public static void main(String[] args) {
        Scanner hghgf = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int chisloSKonsoli = hghgf.nextInt();
        if (chisloSKonsoli > 10) {
            System.out.println("Chislo bolshe 10");
        } else if (chisloSKonsoli == 10) {
            System.out.println("Chislo ravno 10");
        } else {
            System.out.println("Chislo ne bolshe 10");

        }
    }
}
