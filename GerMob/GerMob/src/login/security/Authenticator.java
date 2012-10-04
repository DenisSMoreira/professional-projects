/*
 * Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved.
 */
package login.security;

import java.util.HashMap;
import java.util.Map;

import login.entitys.User;

public class Authenticator {
	
    private static final Map<String, String> USERS = new HashMap<String, String>();
    private User loggedUser;
    private static Authenticator authenticator;
    
	private Authenticator(){
	}
	
	public static Authenticator getInstance(){
		if(authenticator == null){
			return authenticator = new Authenticator();
		}else{
			return authenticator;
		}
	}
	
    static {
        USERS.put("demo", "demo");
    }
    
    public boolean validate(String user, String password){
        String validUserPassword = USERS.get(user);
        boolean retorno = validUserPassword != null && validUserPassword.equals(password);
        setLoggedUser(new User(user));
        return retorno;
    }
    
    public User getLoggedUser() {
        return loggedUser;
    }

	private void setLoggedUser(User loggedUser) {
		this.loggedUser = loggedUser;
	}

	public void updateUser(User user) {
		if(loggedUser.getId().equals(user.getId())){
			setLoggedUser(user);
		}
	}
}
