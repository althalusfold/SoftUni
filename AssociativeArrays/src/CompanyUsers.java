import java.util.*;
public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> listOfEmployees = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String employeeID = input.split(" -> ")[1];

            if (!listOfEmployees.containsKey(company)) {
                listOfEmployees.put(company, new ArrayList<>());
            }

            if (!listOfEmployees.get(company).contains(employeeID)) {
                listOfEmployees.get(company).add(employeeID);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : listOfEmployees.entrySet()) {
            System.out.println(entry.getKey());
            for (String employeeID : entry.getValue()) {
                System.out.println("-- " + employeeID);
            }
        }
    }
}
