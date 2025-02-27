package chapter8;

import java.util.Scanner;

public class Chapter8Exercise {
    // Създаваме статичен Scanner за четене на вход от конзолата
    public static Scanner scanner = new Scanner(System.in);

    // Вътрешен клас за валидация на пароли
    public static class PasswordValidator {
        // Полета за потребителско име и текуща парола
        private String username;
        private String currentPassword;

        // Полета за валидност и съобщение за грешка
        private boolean valid;
        private String errorMessage;

        // Конструктор за инициализация на потребителско име и текуща парола
        public PasswordValidator(String username, String currentPassword) {
            this.username = username;
            this.currentPassword = currentPassword;
        }

        // Метод за връщане на валидността на паролата
        public boolean isValid() {
            return valid;
        }

        // Метод за връщане на съобщението за грешка
        public String getErrorMessage() {
            return errorMessage;
        }

        // Метод за затваряне на Scanner
        public void closeScanner() {
            scanner.close();
        }

        // Главен метод (входна точка на програмата)
        public static void main(String[] args) {
            // Извикваме метода login() за въвеждане на потребителско име и парола
            PasswordValidator validator = login();
            // Извеждаме правилата за паролата
            validator.printPasswordRules();

            // Цикъл do-while за повторно въвеждане на парола, докато не е валидна
            do {
                // Извикваме метода getProposedPassword() за въвеждане на нова парола
                String proposedPassword = validator.getProposedPassword();
                // Извикваме метода changePassword() за валидация на новата парола
                validator.changePassword(proposedPassword);

            } while (!validator.isValid()); // Проверяваме валидността на паролата

            // Извеждаме съобщение, че паролата е валидна
            System.out.println("The proposed password is valid");

            // Затваряме Scanner
            validator.closeScanner();
        }

        // Метод за въвеждане на потребителско име и парола
        public static PasswordValidator login() {
            System.out.println("Enter your username:");
            String username = scanner.nextLine();

            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            // Създаваме и връщаме нов обект PasswordValidator
            return new PasswordValidator(username, password);
        }

        // Метод за извеждане на правилата за паролата
        public void printPasswordRules() {
            System.out.println("Your new password must meet the following requirements:");
            System.out.println("* at least 8 characters long");
            System.out.println("* contain an uppercase letter");
            System.out.println("* contain a special character");
            System.out.println("* not contain the username");
            System.out.println("* not the same as the old password");
            System.out.println();
        }

        // Метод за въвеждане на нова парола от потребителя
        public String getProposedPassword() {
            System.out.println("Enter your new password:");
            return scanner.nextLine();
        }

        // Метод за валидация на новата парола
        public void changePassword(String newPassword) {
            // Задаваме валидността на true и изчистваме съобщението за грешка
            valid = true;
            errorMessage = "";

            // Проверяваме дължината на паролата
            if (newPassword.length() < 8) {
                valid = false;
                errorMessage += "\n Your password must be at least 8 characters.";
            }

            // Проверяваме дали има главна буква
            if (newPassword.equals(newPassword.toLowerCase())) {
                valid = false;
                errorMessage += "\n Your password must include an uppercase letter.";
            }

            // Проверяваме дали има специален символ
            if (newPassword.matches("[a-zA-Z0-9 ]*")) {
                valid = false;
                errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
            }

            // Проверяваме дали паролата съдържа потребителското име
            if (newPassword.toUpperCase().contains(username.toUpperCase())) {
                valid = false;
                errorMessage += "\n Your password cannot contain your username.";
            }

            // Проверяваме дали паролата е същата като текущата парола
            if (newPassword.equals(currentPassword)) {
                valid = false;
                errorMessage += "\n Your password must be different from your current password.";
            }
        }
    }
}
