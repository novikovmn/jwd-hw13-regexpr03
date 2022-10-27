package by.epam.hw13.regexpr03.dao.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import by.epam.hw13.regexpr03.bean.User;
import by.epam.hw13.regexpr03.dao.UserDAO;
import by.epam.hw13.regexpr03.dao.exception.DAOException;

public class UserDAOImpl implements UserDAO{
	
	private final File file = new File("data" + File.separator + "user_db.txt"); 

	@Override
	public void insertUser(User user) throws DAOException {
		
		try(FileWriter writer = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(writer)){
			
			
			bufferedWriter.write(user.toString() + "\n"); 
			
		} catch (IOException e) {
			throw new DAOException("Connection failed!", e);
		}
		
	}

}
