// Всем привет! К сожалению вообще не могу понять как прикрутить конвертер для римских чисел, пока тяжело понять
// алгоритм работы в Java. Я самостоятельно изучаю питон и после него Тяжело сообразить что нужно конкретно написать
// для тех или иных действий. Я понимаю что тз выполнено не полностью, но время идет и хочется быстрее приступить к
// обучению. Всем добра и хорошего дня!

package calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Converter converter = new Converter();
        String[] actions = {"+", "-", "/", "*"};
        String[] index = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        System.out.print("Type example: ");
        String exp = scn.nextLine();
        int actIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])) {
                actIndex = i;
                break;
            }
            if (actIndex == -1) {
                System.out.println("incorrect amount");
                return;
            }
        }
        String[] data = exp.split(index[actIndex]);
        //if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {
        //   int a, b;
        //   String a = data[0];
        //   String b = data[1];
        //    boolean isRoman = converter.isRoman(data[0]);
        //    if(isRoman){
        //        a = isRoman.
        //    }

        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int result;
        switch (actions[actIndex]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                result = a / b;
                break;

            }
            System.out.println(result);
        } //else {
           // System.out.println("Numbers must be equal formats");
        }

