import java.util.Scanner;

public class lr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Виберіть завдання: ");
            System.out.println("Завдання - 1");
            System.out.println("Завдання - 2");
            System.out.println("Завдання - 4");
            System.out.println("Завершити програму - 0");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    double x, y, z;
                    do {
                        System.out.println("Введіть значення x: ");
                        x = scan.nextDouble();
                        System.out.println("Введіть значення y: ");
                        y = scan.nextDouble();
                        System.out.println("Введіть значення z: ");
                        z = scan.nextDouble();
                    }while (x - 1 / (1 + Math.pow(x,2)) == 0 && z == 0);

                    double t = (1 + z) * (x + y / z) / (x - 1 / (1 + Math.pow(x,2)));

                    System.out.printf("Результат: %.2f\n", t);
                    break;
                }
                case 2: {
                    System.out.println("For: ");
                    int i,j = 0;
                    {
                        int sum = 0;
                        for (i = 1; i < 80; i++) {
                            if(i % 2 != 0) {
                                sum += i;
                                j++;
                            }
                        }
                        System.out.println(sum / j);
                    }

                    System.out.println("While: ");
                    i = 1;
                    j = 0;
                    int sum = 0;
                    while (i < 80) {
                        if(i % 2 != 0) {
                            sum += i;
                            j++;
                        }
                        i++;
                    }
                    System.out.println(sum / j);

                    System.out.println("Do...while: ");
                    i = 1;
                    j = 0;
                    sum = 0;
                    do {
                        if(i % 2 != 0) {
                            sum += i;
                            j++;
                        }
                        i++;
                    } while (i < 80);
                    System.out.println(sum / j);

                    break;
                }
                case 4: {
                    float f = 0.0f;
                    float x = 0.0f;
                    int a = 1;
                    int b = 2;
                    float dx = 0.025f;
                    System.out.println("----------------------------");
                    for (x = a; x <= b; x += dx) {
                        f = (float)(Math.log(2) * x);
                        System.out.printf("|");
                        System.out.printf("x = %.2f", x );
                        System.out.printf("\t|");
                        System.out.printf("\tf(x) = %.2f", f);
                        System.out.printf("|");
                        System.out.println("\n----------------------------");
                    }
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Ввеедені некоректні дані!");
                    break;
                }
            }
        } while (choice != 0);
    }
}
