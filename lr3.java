import java.util.Scanner;

    public class lr3 {

        static  void Input(int[] arr){
            Scanner scan = new Scanner(System.in);
            int a;
            for(int i = 0; i < arr.length; i++) {
                a = scan.nextInt();
                arr[i] = a;
            }
        }

        static void Output (int[] arr){
            for(int i = 0; i < arr.length; i++) {
                System.out.printf(arr[i] + " ");
            }
        }

        static int Fun_Count(int arr[], int size){
            int count = 0;
            for(int i = 0; i < size; i++){
                if(arr[i] < 0){
                    count++;
                }
            }
           return count;
        }

        static int Fun_Sum(int arr[], int size){
            int sum = 0;
            int min = Math.abs(arr[0]);
            int index = 0;
            for(int i = 0; i < size; i++) {
                if (Math.abs(arr[i]) < min){
                    min = arr[i];
                    index = i;
                }
            }
            System.out.println("Мінімальне за модулем: " + min);
            for(int i = index + 1; i < size;i++){
                sum+=arr[i];
            }
            return sum;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Виберіть завдання: ");
            System.out.println("Завдання - 1");
            System.out.println("Завдання - 2");
            System.out.println("Завершити програму - 0");
            choice = scan.nextInt();
            try {
                switch (choice) {
                    case (1): {
                        System.out.println("Завдання - 1");
                        int size;
                        do {
                            System.out.println("Введіть розмір масиву:");
                            size = scan.nextInt();
                        }while (size <= 0);
                        int[] arr = new int[size];
                        System.out.println("Введіть масив:");
                        Input(arr);
                        System.out.println("Масив:");
                        Output(arr);
                        int count = 0, sum = 0;
                        for(int i = 0; i < arr.length; i++){
                            if(arr[i] < 0){
                                count++;
                            }
                            sum+=arr[i];
                        }
                        System.out.println("\nКількість від'ємних чисел: " + count);
                        System.out.println("Сума всіх чисел: " + sum);
                        if (count > sum/ arr.length){
                            System.out.println("Кількість від'ємних елементів більша за середнє арифметичне значення масиву, кожен елемент збільшено на 10.");
                            for(int i = 0; i < arr.length;i++){
                                arr[i] = arr[i] + 10;
                                System.out.printf(arr[i] + " ");
                            }
                        }
                        else{
                            System.out.println("Кількість від'ємних елементів менша за середнє значення масиву, елементи масиву = 0.");
                            for(int i = 0; i < arr.length;i++){
                                arr[i] = 0;
                                System.out.printf(arr[i] + " ");
                            }
                        }
                        System.out.println("");
                        break;
                    }
                    case (2): {
                        System.out.println("Завдання - 2");
                        System.out.println("Виберіть як буде заповнюватись масив 1 - з клавіватури, 2 - рандомно");
                        int ch = 0;
                        ch = scan.nextInt();
                        switch (ch){
                            case (1):{
                                System.out.println("Масив з клавіатури");
                                int size;
                                do {
                                    System.out.println("Введіть розмір масиву:");
                                    size = scan.nextInt();
                                }while (size <= 0);
                                int[] arr = new int[size];
                                System.out.println("Введіть масив:");
                                Input(arr);
                                System.out.println("Масив:");
                                Output(arr);
                                System.out.println("");
                                System.out.println("Кількість від’ємних елементів масиву:" + Fun_Count(arr, size));
                                System.out.println("Cумa елементів масиву, розташованих після мінімального за модулем елемента: " + Fun_Sum(arr, size));
                                break;
                            }
                            case (2):{
                                System.out.println("Масив з рандомних значень");
                                int size;
                                do {
                                    System.out.println("Введіть розмір масиву:");
                                    size = scan.nextInt();
                                }while (size <= 0);
                                int[] arr = new int[size];
                                for (int i = 0; i < size; i++) {
                                    arr[i] = (int) Math.round((Math.random() * 200) - 100);
                                }
                                System.out.println("Масив:");
                                Output(arr);
                                System.out.println("");
                                System.out.println("Кількість від’ємних елементів масиву:" + Fun_Count(arr, size));
                                System.out.println("Cумa елементів масиву, розташованих після мінімального за модулем елемента: " + Fun_Sum(arr, size));
                                break;
                            }
                            default:{
                                System.out.println("Введені не правильні дані!");
                            }
                        }
                        break;
                    }
                    default: {
                        break;
                    }
                }
            } catch (Exception ex) {
                System.out.println("Введені не правильні дані!");
            }
        }while (choice != 0);
    }
}
