package lab7;

public class Task4 {
    static class UserAccount {
        private String username;
        private String password;

        UserAccount(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public boolean login(String enteredPassword) {
            return password.equals(enteredPassword);
        }

        public void changePassword(String oldPassword, String newPassword) {
            if (password.equals(oldPassword) && newPassword != null && !newPassword.isEmpty()) {
                password = newPassword;
            }
        }

        public String getUsername() {
            return username;
        }
    }

    public static void main(String[] args) {
        UserAccount user = new UserAccount("admin", "1234");
        System.out.println("Успішний вхід: " + user.login("1234"));
        user.changePassword("1234", "5678");
        System.out.println("Новий пароль правильний: " + user.login("5678"));
    }
}
