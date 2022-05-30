import java.util.Scanner;

public class lr4 {
    public static void Input(int[][] arr, int n, int m){
        Scanner scan = new Scanner(System.in);
        int a;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a = scan.nextInt();
                arr[i][j] = a;
            }
        }
    }
    public static void Output(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int Task1(int[][] arr, int n, int m){
        int max = arr[0][0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
            sum += max;
            max = 0;
        }
        return sum;
    }
    static void createRandArr(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;j++){
                arr[i][j] = (int) Math.round((Math.random() * 200) - 100);
            }
        }
        Output(arr,n, n);
    }

    static boolean findGlDg(int[][]arr, int n){
        int sumI = 0, sumJ = 0;
        for (int i = 0; i < n; i++) {
            sumI+=arr[i][i];
        }
        int j = n-1;
        for (int i = 0; i < n; i++) {
            sumJ+=arr[i][j--];
        }
        System.out.println("Головна діагональ: " + sumI);
        System.out.println("Бічна діагональ: " + sumJ);
        return sumI > sumJ;
    }
    static void changeNM(int[][] arr, int n){
        int temp;
        for (int k = 0; k < n; k++) {
            for (int i = k; i < n; i++) {
                temp = arr[k][i];
                arr[k][i] = arr[i][k];
                arr[i][k] = temp;
            }
        }
    }
    static void Task2(int[][] arr, int n){
        if (findGlDg(arr, n)){
            System.out.println("Сума елементів головної діагоналі більша від суми елементів бокової діагоналі");
            changeNM(arr, n);
            System.out.println("Завдання:");
            Output(arr, n, n);
        }
        else {
            System.out.println("Головна діагональ менша за бічну діагональ.");
        }
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

                switch (choice) {
                        case (1): {
                            System.out.println("Завдання - 1");
                            System.out.println("Введіть кількість рядків:");
                            int n = scan.nextInt();
                            System.out.println("Введіть кількість стовбців:");
                            int m = scan.nextInt();
                            int[][] arr = new int[n][m];
                            System.out.println("Введіть масив:");
                            Input(arr,n,m);
                            System.out.println("Масив:");
                            Output(arr,n,m);
                            System.out.println("Сума найбільших елементів рядків: " + Task1(arr,n,m));
                            break;
                        }
                        case (2): {
                            System.out.println("Завдання - 2");
                            System.out.println("Введіть розмір квадратної матриці: ");
                            int n = scan.nextInt();
                            int[][] arr = new int[n][n];
                            createRandArr(arr, n);
                            Task2(arr, n);
                            break;
                        }
                        default: {
                            break;
                        }
                    }
        }while (choice != 0);
    }
}
