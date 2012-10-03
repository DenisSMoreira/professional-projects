package br.com.util.annotation.validate.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.util.annotation.validate.Contact;

public final class ContactImpl {
	/**
	 * Validate the email address
	 */
	private static boolean isValidEmail(String email) {
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher m = p.matcher(email);
		return m.matches();
	}

	private static boolean isValidPhone(String phone) {
		Pattern p = Pattern.compile("\\d\\d([,\\s])?\\d\\d\\d\\d([,\\s])?\\d\\d\\d\\d");
		Matcher m = p.matcher(phone);
		return m.matches();
	}

	private static boolean isValidMobile(String mobile) {
		Pattern p = Pattern.compile("\\d\\d(\\d[,\\s])?\\d\\d\\d([,\\s])?\\d\\d\\d\\d");
		Matcher m = p.matcher(mobile);
		return m.matches();
	}

	private static boolean isValidWebsite(String website) {
		Pattern p = Pattern.compile("^(https?|ftp|file)://.+$");
		Matcher m = p.matcher(website);
		return m.matches();
	}

	public final static void validateContact(Object object) {
		try {
			Field[] fields = object.getClass().getDeclaredFields();
			for (Field field : fields) {
				Annotation[] annotations = field.getAnnotations();
				for (Annotation annotation : annotations) {
					if (annotation instanceof Contact) {

						Contact validator = (Contact) annotation;

						if (field.getModifiers() == Modifier.PRIVATE) {
							field.setAccessible(true);
						}

						boolean result = false;
						switch (validator.type()) {
						case PHONE:
							result = ContactImpl.isValidPhone((String) field.get(object));
							break;
						case MOBILE:
							result = ContactImpl.isValidMobile((String) field.get(object));
							break;
						case EMAIL:
							result = ContactImpl.isValidEmail((String) field.get(object));
							break;
						case WEBSITE:
							result = ContactImpl.isValidWebsite((String) field.get(object));
							break;
						}
						if (!result) {
							Object superclass = object.getClass().getSuperclass();
							if(superclass instanceof JFrame){
								JOptionPane.showMessageDialog((JFrame) superclass, "Campo: " + field.getName()+  ": " + field.get(object)+ "inválido");
								
							}else if(superclass instanceof JPanel){
								JOptionPane.showMessageDialog((JPanel) superclass, "Campo: " + field.getName()+  ": " + field.get(object)+ "inválido");
							}
							
							System.out.println("Invalid " + field.getName()
									+ ": " + field.get(object));
						}
					}
				}
			}

		} catch (Exception e) {

		}

	}
}