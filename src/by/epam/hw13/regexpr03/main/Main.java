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

		// ����� ������ � ����
		UserDBCreator.createUserDB();

		// dto-������ ��� �����������
		// ������ - ������� ������������ � ����/����
		// � ������ �������� ����������� �������� ������
		Request request = new Request("INSERT_USER", new User(1212, "gman", "g.man@gmail.com", "+3754124-111-22-55"));

		Controller controller = new Controller();

		try {

			// �������� ������� ����������� � ����� �� �������
			Response response = controller.execute(request);
			// ���� ������� ����� ������� ������� - ������ ���� ������
			System.out.println(response);

		} catch (ServiceException e) {

			/*
			 * �.�. ServiceException ����� ����� ����� ��� dao-, ��� � ������ ��������� (��.
			 * UserServiceImpl), ���������� ��� ������ ��� ���������� ����������
			 */
			String dtoMessage = "Connection failed!";
			String serviceExceptionMessage = e.getMessage();

			if (serviceExceptionMessage.equals(dtoMessage)) {
				// ���� dto-������
				System.out.println(serviceExceptionMessage);
			} else {
				// ���� ������ ���������
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
