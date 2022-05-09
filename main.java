import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
            do{
                System.out.println("Виберіть завдання: ");
                System.out.println("Завдання - 1");
                System.out.println("Завдання - 2");
                System.out.println("Завдання - 3");
                System.out.println("Завдання - 4");
                System.out.println("Завершити програму - 0");
                choice = scan.nextInt();
                switch (choice) {
                    case (1):
                        System.out.println("Завдання - 1");
                        System.out.println("Введіть a:");
                        double a = scan.nextDouble();
                        System.out.println("Введіть b:");
                        double b = scan.nextDouble();
                        System.out.println("Введіть c: ");
                        double c = scan.nextDouble();

                        if (c > 0) {
                            if (Math.sqrt(b - a) > 0) {
                                if (Math.sqrt(c) > 0) {
                                    double y1 = Math.sqrt(b - a) + 2 * Math.sqrt(c);
                                    System.out.printf("Результат: %.2f\n", y1);
                                } else {
                                    System.out.println("З заданих значень корень не добувається!");
                                }
                            } else {
                                System.out.println("З заданих значень корень не добувається!");
                            }
                        }

                        if(c == 0) {
                            if (c - 6 * a != 0) {
                                double y2 = b / (c - 6 * a);
                                System.out.printf("Результат: %.2f\n", y2);
                            } else {
                                System.out.println("Введені значення при яких знаменник = 0!");
                            }
                        }
                        if (c < 0){
                            double y3 = b + 12 * Math.pow(c, 3);
                            System.out.printf("Результат: %.2f\n", y3);
                        }

                        System.out.println("Через else if:");

                        if (c > 0) {
                            if (Math.sqrt(b - a) > 0) {
                                if (Math.sqrt(c) > 0) {
                                    double y1 = Math.sqrt(b - a) + 2 * Math.sqrt(c);
                                    System.out.printf("Результат: %.2f\n", y1);
                                } else {
                                    System.out.println("З заданих значень корень не добувається!");
                                }
                            } else {
                                System.out.println("З заданих значень корень не добувається!");
                            }
                        }

                        else if(c == 0) {
                            if (c - 6 * a != 0) {
                                double y2 = b / (c - 6 * a);
                                System.out.printf("Результат: %.2f\n", y2);
                            } else {
                                System.out.println("Введені значення при яких знаменник = 0!");
                            }
                        }
                        else {
                            double y3 = b + 12 * Math.pow(c, 3);
                            System.out.printf("Результат: %.2f\n", y3);
                        }
                        break;
                    case (2):
                        System.out.println("Завдання - 2");
                        double r,l;
                        do {
                            System.out.println("Введіть радіус круга:");
                            r = scan.nextDouble();
                        }while (r <= 0);

                        do {
                            System.out.println("Введіть довжину квадрата:");
                            l = scan.nextDouble();
                        }while (l <= 0);

                        double S_circle = Math.PI * Math.pow(r, 2);
                        double S_square = Math.pow(l, 2);
                        if (S_square >= S_circle) {
                            System.out.println("Круг помістився в квадрат.");
                        } else {
                            System.out.println("Круг не помістився в квадрат.");
                        }
                        break;
                    case (3):
                        System.out.println("Завдання - 3");
                        int city;
                        city = scan.nextInt();
                        switch (city) {
                            case (58000): {
                                System.out.println("Чернівці");
                                break;
                            }
                            case (56664): {
                                System.out.println("Баловне");
                                break;
                            }
                            case (17600): {
                                System.out.println("Варва");
                                break;
                            }
                            case (37300): {
                                System.out.println("Гадяч");
                                break;
                            }
                            case (59021): {
                                System.out.println("Давидівка");
                                break;
                            }
                            case (71501): {
                                System.out.println("Енергодар");
                                break;
                            }
                            case (45240): {
                                System.out.println("Жидичина");
                                break;
                            }
                            case (82446): {
                                System.out.println("Загірне");
                                break;
                            }
                            case (76000): {
                                System.out.println("Івано-Франківськ");
                                break;
                            }
                            case (32300): {
                                System.out.println("Кам'янець-Подільський");
                                break;
                            }
                            default:{
                                System.out.println("Місто з таким індексом не знайдено.");
                                break;
                            }
                        }
                        break;

                    case (4): {
                        System.out.println("Завдання - 4");
                        System.out.println("Введіть a:");
                        int A = scan.nextInt();
                        System.out.println("Введіть y:");
                        int y = scan.nextInt();
                        System.out.println("Введіть z:");
                        int z = scan.nextInt();
                        if (Math.pow(y, 2) - 2 * A != 0) {
                            double x = A * Math.pow(y, 2) - 2 * A + Math.pow(Math.cos(z), 2);
                            System.out.printf("Результат: %.2f\n", x);
                        }
                        else {
                            System.out.println("Введені значення при яких знаменник = 0!");
                        }
                        break;
                    }
                    case 0:{
                        break;
                    }
                    default:{
                        System.out.println("Введені некоректні дані!");
                        break;
                    }
                }
            } while(choice != 0);
    }
}
