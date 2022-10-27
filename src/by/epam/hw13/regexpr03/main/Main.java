package by.epam.hw13.regexpr03.main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import by.epam.hw13.regexpr03.bean.User;
import by.epam.hw13.regexpr03.controller.Controller;
import by.epam.hw13.regexpr03.controller.dto.Request;
import by.epam.hw13.regexpr03.controller.dto.Response;
import by.epam.hw13.regexpr03.service.exception.ServiceException;

public class Main {

	public static void main(String[] args) {

		// пишем юзеров в файл
		UserDBCreator.createUserDB();

		// dto-объект для кортроллера
		// задача - вставка пользователя в базу/файл
		// В НОМЕРЕ ТЕЛЕФОНА СОЗНАТЕЛЬНО ДОПУЩЕНА ОШИБКА
		Request request = new Request("INSERT_USER", new User(1212, "gman", "g.man@gmail.com", "+3754124-111-22-55"));

		Controller controller = new Controller();

		try {

			// передача запроса контроллеру и далее по уровням
			Response response = controller.execute(request);
			// если вставка юзера пройдет успешно - увидим этот статус
			System.out.println(response);

		} catch (ServiceException e) {

			/*
			 * т.к. ServiceException может иметь ввиду как dao-, так и ошибку валидации (см.
			 * UserServiceImpl), определяем как именно это исключение обработать
			 */
			String dtoMessage = "Connection failed!";
			String serviceExceptionMessage = e.getMessage();

			if (serviceExceptionMessage.equals(dtoMessage)) {
				// если dto-ошибка
				System.out.println(serviceExceptionMessage);
			} else {
				// если ошибка валидации
				Map<String, String> invalidFields = e.getInvalidFields();
				Set<Entry<String, String>> invalidFieldsSet = invalidFields.entrySet();
				System.err.println(e.getMessage());
				for (Entry<String, String> invalidField : invalidFieldsSet) {
					System.err.println(invalidField);
				}
			}

		}

	}

}
