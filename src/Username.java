public class Username {

    public static void main(String[] args) {
        String nikName = "mit";
        switch (nikName) {
            case "user":
                System.out.println("Вы пошли в систему как пользователь");
                break;
            case "admin":
                System.out.println("Вы пошли в систему как администратор");
                break;
            case "owner":
                System.out.println("Вы пошли в систему как владелец");
                break;
            default:
                System.out.println("Ваш статус неопределен");
        }
    }

}
