package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    /**
     * 3.6. Нужно написать класс User (пользователь) с методом аутентификации по логину и паролю,
     * (В метод передаются логин и пароль, метод возвращает true, если пароль и логин совпадают, иначе - false)
     */
    @Test
    void userCreationSuccess() {
        User user = new User("Alex", "123456");
        String login="Alex";
        String pass="123456";
        assertTrue(user.auth(login, pass));
    }

    @Test
    void userCreationFail() {
        User user = new User("Alex", "123456");
        String login="A";
        String pass="1";
        assertFalse(user.auth(login, pass));
    }

}