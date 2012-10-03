package teste;

import br.com.util.annotation.validate.impl.BeanTeste;
import br.com.util.annotation.validate.impl.ContactImpl;


public class TestAnnotation {

	/**
	 * @param args
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public static void main(String[] args){
		BeanTeste beanTeste = new BeanTeste();
		beanTeste.setName("Tim Sturt");
		beanTeste.setPhone("09 1234 3819"); 			//correct phone format XX XXXX XXXX
		beanTeste.setMobilePhone("023912 9123"); 	//correct mobile format XXX XXX XXXX
		beanTeste.setEmail("test@gmail.com");		//correct email format
		beanTeste.setWebsite("http://test.com");		//correct website url
		beanTeste.setAddress("Earth");
		System.out.println("TESTE");
		
		
		ContactImpl.validateContact(beanTeste);

	}

}