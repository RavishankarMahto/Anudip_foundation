import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class TrainRouteManager {
    public static void main(String[] args) {
        LinkedList<String> trainStops = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTrain Route Management System");
            System.out.println("1. Add a stop");
            System.out.println("2. Add a stop at the beginning");
            System.out.println("3. Add a stop at the end");
            System.out.println("4. Remove a stop by name");
            System.out.println("5. Remove the first stop");
            System.out.println("6. Remove the last stop");
            System.out.println("7. Search for a stop");
            System.out.println("8. Retrieve a stop by index");
            System.out.println("9. Retrieve the first stop");
            System.out.println("10. Retrieve the last stop");
            System.out.println("11. Update a stop");
            System.out.println("12. Find total stops");
            System.out.println("13. Display all stops");
            System.out.println("14. Clear all stops");
            System.out.println("15. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter stop name to add: ");
                    String stop = scanner.nextLine();
                    trainStops.add(stop);
                    System.out.println("Stop added.");
                    break;
                case 2:
                    System.out.print("Enter stop name to add at the beginning: ");
                    String firstStop = scanner.nextLine();
                    trainStops.addFirst(firstStop);
                    System.out.println("Stop added at the beginning.");
                    break;
                case 3:
                    System.out.print("Enter stop name to add at the end: ");
                    String lastStop = scanner.nextLine();
                    trainStops.addLast(lastStop);
                    System.out.println("Stop added at the end.");
                    break;
                case 4:
                    System.out.print("Enter stop name to remove: ");
                    String removeStop = scanner.nextLine();
                    if (trainStops.remove(removeStop)) {
                        System.out.println("Stop removed.");
                    } else {
                        System.out.println("Stop not found.");
                    }
                    break;
                case 5:
                    if (!trainStops.isEmpty()) {
                        trainStops.removeFirst();
                        System.out.println("First stop removed.");
                    } else {
                        System.out.println("No stops to remove.");
                    }
                    break;
                case 6:
                    if (!trainStops.isEmpty()) {
                        trainStops.removeLast();
                        System.out.println("Last stop removed.");
                    } else {
                        System.out.println("No stops to remove.");
                    }
                    break;
                case 7:
                    System.out.print("Enter stop name to search: ");
                    String searchStop = scanner.nextLine();
                    if (trainStops.contains(searchStop)) {
                        System.out.println("Stop is part of the route.");
                    } else {
                        System.out.println("Stop not found.");
                    }
                    break;
                case 8:
                    System.out.print("Enter index to retrieve stop: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < trainStops.size()) {
                        System.out.println("Stop at index " + index + ": " + trainStops.get(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 9:
                    if (!trainStops.isEmpty()) {
                        System.out.println("First stop: " + trainStops.getFirst());
                    } else {
                        System.out.println("No stops available.");
                    }
                    break;
                case 10:
                    if (!trainStops.isEmpty()) {
                        System.out.println("Last stop: " + trainStops.getLast());
                    } else {
                        System.out.println("No stops available.");
                    }
                    break;
                case 11:
                    System.out.print("Enter index to update stop: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (updateIndex >= 0 && updateIndex < trainStops.size()) {
                        System.out.print("Enter new stop name: ");
                        String newStop = scanner.nextLine();
                        trainStops.set(updateIndex, newStop);
                        System.out.println("Stop updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 12:
                    System.out.println("Total stops: " + trainStops.size());
                    break;
                case 13:
                    System.out.println("List of train stops:");
                    for (String s : trainStops) {
                        System.out.println(s);
                    }
                    break;
                case 14:
                    trainStops.clear();
                    System.out.println("All stops cleared.");
                    break;
                case 15:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



// OUTPUT:
/*  
Train Route Management System
1. Add a stop
2. Add a stop at the beginning
3. Add a stop at the end
4. Remove a stop by name
5. Remove the first stop
6. Remove the last stop
7. Search for a stop
8. Retrieve a stop by index
9. Retrieve the first stop
10. Retrieve the last stop
11. Update a stop
12. Find total stops
13. Display all stops
14. Clear all stops
15. Exit
Enter your choice: 
*/