import java.util.*;
public class DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> guestMeals = new LinkedHashMap<>();
        Map<String, Integer> unlikedMealsCount = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Stop")) {
            String[] tokens = input.split("-");
            String command = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];

            switch (command) {
                case "Like":
                    guestMeals.putIfAbsent(guest, new ArrayList<>());
                    if (!guestMeals.get(guest).contains(meal)) {
                        guestMeals.get(guest).add(meal);
                    }
                    break;
                case "Dislike":
                    if (guestMeals.containsKey(guest)) {
                        if (guestMeals.get(guest).contains(meal)) {
                            guestMeals.get(guest).remove(meal);
                            System.out.printf("%s doesn't like the %s.%n", guest, meal);
                            unlikedMealsCount.put(meal, unlikedMealsCount.getOrDefault(meal, 0) + 1);
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                        }
                    } else {
                        System.out.printf("%s is not at the party.%n", guest);
                    }
                    break;
            }
        }

        guestMeals.forEach((guest, meals) -> {
            System.out.printf("%s: %s%n", guest, String.join(", ", meals));
        });

        System.out.println("Unliked meals: " + unlikedMealsCount.values().stream().mapToInt(Integer::intValue).sum());
    }
}
