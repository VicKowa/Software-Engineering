package uebung4.client;

import uebung4.businesslogic.US_ManagementSystem;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        US_ManagementSystem usManagementSystem = new US_ManagementSystem();

        while (true) {

            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            }
            usManagementSystem.executeCommand(command);
        }
        scanner.close();
    }
}
