package Assingment1;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n----- STRING MENU -----");
            System.out.println("1. length()");
            System.out.println("2. isEmpty()");
            System.out.println("3. charAt()");
            System.out.println("4. toString()");
            System.out.println("5. equals()");
            System.out.println("6. compareTo()");
            System.out.println("7. contains()");
            System.out.println("8. indexOf()");
            System.out.println("9. lastIndexOf()");
            System.out.println("10. startsWith()");
            System.out.println("11. endsWith()");
            System.out.println("12. matches()");
            System.out.println("13. substring()");
            System.out.println("14. toLowerCase()");
            System.out.println("15. trim()");
            System.out.println("16. replace()");
            System.out.println("17. split()");
            System.out.println("18. join()");
            System.out.println("19. valueOf()");
            System.out.println("20. StringBuffer");
            System.out.println("21. StringBuilder");
            System.out.println("22. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.println("Is Empty = " + str.isEmpty());
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < str.length()) {
                        System.out.println("Character = " + str.charAt(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.println("toString() = " + str.toString());
                    break;

                case 5:
                    System.out.print("Enter another string: ");
                    String str2 = sc.nextLine();

                    System.out.println("Equals = " + str.equals(str2));
                    break;

                case 6:
                    System.out.print("Enter another string: ");
                    str2 = sc.nextLine();

                    System.out.println("compareTo() = " + str.compareTo(str2));
                    break;

                case 7:
                    System.out.print("Enter text to search: ");
                    String search = sc.nextLine();

                    System.out.println("Contains = " + str.contains(search));
                    break;

                case 8:
                    System.out.print("Enter text to find: ");
                    search = sc.nextLine();

                    System.out.println("Index = " + str.indexOf(search));
                    break;

                case 9:
                    System.out.print("Enter text to find: ");
                    search = sc.nextLine();

                    System.out.println("Last Index = " + str.lastIndexOf(search));
                    break;

                case 10:
                    System.out.print("Enter prefix: ");
                    String prefix = sc.nextLine();

                    System.out.println("Starts With = " + str.startsWith(prefix));
                    break;

                case 11:
                    System.out.print("Enter suffix: ");
                    String suffix = sc.nextLine();

                    System.out.println("Ends With = " + str.endsWith(suffix));
                    break;

                case 12:
                    System.out.print("Enter regular expression: ");
                    String regex = sc.nextLine();

                    System.out.println("Matches = " + str.matches(regex));
                    break;

                case 13:
                    System.out.print("Enter starting index: ");
                    int start = sc.nextInt();

                    System.out.print("Enter ending index: ");
                    int end = sc.nextInt();

                    if (start >= 0 && end <= str.length() && start <= end) {
                        System.out.println("Substring = " +
                                str.substring(start, end));
                    } else {
                        System.out.println("Invalid indexes.");
                    }
                    break;

                case 14:
                    System.out.println("Lowercase = " + str.toLowerCase());
                    break;

                case 15:
                    System.out.println("Trimmed = '" + str.trim() + "'");
                    break;

                case 16:
                    System.out.print("Enter text to replace: ");
                    String oldText = sc.nextLine();

                    System.out.print("Enter new text: ");
                    String newText = sc.nextLine();

                    System.out.println("Result = " +
                            str.replace(oldText, newText));
                    break;

                case 17:
                    String[] words = str.split(" ");

                    System.out.println("Split result:");

                    for (String word : words) {
                        System.out.println(word);
                    }
                    break;

                case 18:
                    String[] parts = str.split(" ");

                    System.out.println("Joined String = " +
                            String.join("-", parts));
                    break;

                case 19:
                    System.out.print("Enter an integer: ");
                    int number = sc.nextInt();

                    String value = String.valueOf(number);

                    System.out.println("String value = " + value);
                    break;

                case 20:
                    StringBuffer sb = new StringBuffer(str);

                    System.out.println("Original StringBuffer: " + sb);

                    sb.append(" Java");
                    System.out.println("After append: " + sb);

                    sb.reverse();
                    System.out.println("After reverse: " + sb);
                    break;

                case 21:
                    StringBuilder builder = new StringBuilder(str);

                    System.out.println("Original StringBuilder: " + builder);

                    builder.append(" Java");
                    System.out.println("After append: " + builder);

                    builder.reverse();
                    System.out.println("After reverse: " + builder);
                    break;

                case 22:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 22);

        sc.close();
    }
}