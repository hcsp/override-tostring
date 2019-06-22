package com.github.hcsp.inheritance;

import com.github.hcsp.test.helper.ProjectSourceFileReader;
import java.util.Random;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void test() {
        int id = new Random().nextInt(1000);
        String name = UUID.randomUUID().toString();
        String userString = new User(id, name).toString();
        Assertions.assertTrue(userString.contains("" + id));
        Assertions.assertTrue(userString.contains(name));
    }

    @Test
    public void hasOverride() {
        Assertions.assertTrue(
                ProjectSourceFileReader.readAsString(User.class).contains("@Override"));
    }
}
