import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = scanner.nextInt();
        String guestType = scanner.next();
        String weekday = scanner.next();
        double dayPrice;
        double totalPrice = 0;

        switch (weekday) {
            case "Friday": {
                switch (guestType) {
                    case "Students": {
                        dayPrice = 8.45;
                        if (peopleCount >= 30) {
                            totalPrice = (peopleCount * dayPrice) * 0.85;
                        } else {
                            totalPrice = peopleCount * dayPrice;
                        }
                        break;
                    }

                    case "Business": {
                        dayPrice = 10.9;
                        if (peopleCount >= 100) {
                            peopleCount -= 10;
                        }
                        totalPrice = peopleCount * dayPrice;
                        break;
                    }

                    case "Regular" : {
                        dayPrice = 15;
                        totalPrice = peopleCount * dayPrice;
                        if (peopleCount >= 10 && peopleCount <= 20) {
                            totalPrice *= 0.95;
                        }
                        break;
                    }
                }
                break;
            }
            case "Saturday": {
                switch (guestType) {
                    case "Students": {
                        dayPrice = 9.8;
                        if (peopleCount >= 30) {
                            totalPrice = (peopleCount * dayPrice) * 0.85;

                        } else {
                            totalPrice = peopleCount * dayPrice;
                        }
                        break;
                    }

                    case "Business": {
                        dayPrice = 15.6;
                        if (peopleCount >= 100) {
                            peopleCount -= 10;
                        }
                        totalPrice = peopleCount * dayPrice;
                        break;
                    }
                    case "Regular": {
                        dayPrice = 20;
                        totalPrice = peopleCount * dayPrice;
                        if (peopleCount >= 10 && peopleCount <= 20) {
                            totalPrice *= 0.95;
                        }
                        break;
                    }
                }
                break;
            }
            case "Sunday": {
                switch (guestType) {
                    case "Students": {
                        dayPrice = 10.46;
                        if (peopleCount >= 30) {
                            totalPrice = (peopleCount * dayPrice) * 0.85;
                        } else {
                            totalPrice = peopleCount * dayPrice;
                        }
                        break;
                    }
                    case "Business": {
                        dayPrice = 16;
                        if (peopleCount >= 100) {
                            peopleCount -= 10;
                        }
                        totalPrice = peopleCount * dayPrice;
                        break;
                    }

                    case "Regular": {
                        dayPrice = 22.50;
                        totalPrice = peopleCount * dayPrice;
                        if (peopleCount >= 10 && peopleCount <= 20) {
                            totalPrice *= 0.95;
                        }
                        break;
                    }
                }
                break;
            }
        }
        System.out.printf("\nTotal price: %.2f", totalPrice);
    }
}

