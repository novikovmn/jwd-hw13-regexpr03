package by.epam.hw13.regexpr03.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import by.epam.hw13.regexpr03.bean.User;

public final class UserDBCreator {

	private static final UserDBCreator instance = new UserDBCreator();

	private UserDBCreator() {

	}

	public static UserDBCreator getInstance() {
		return instance;
	}

	public static void createUserDB() {

		List<User> users = List.of(new User(1, "neo", "neo.smith@mail.ru", "+37544-111-22-33"),
				new User(2, "agent007", "agent.007@bk.ru", "+37533-454-24-73"),
				new User(3, "gman", "combine.xen@yandex.ru", "+37544-333-33-33"));

		File file = new File("data" + File.separator + "user_db.txt");

		try (FileWriter writer = new FileWriter(file, true); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

			for (User user : users) {
				bufferedWriter.write(user.toString() + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
