package com.ekke.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorld
 */
@Stateless(mappedName = "HelloWorld")
@LocalBean
public class HelloWorld implements HelloWorldRemote, HelloWorldLocal {

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String SayHelloLocal(String name) {
		return "Hello Local" + name + "!";
	}

	@Override
	public String SayHello() {
		return "Hello";
	}

	@Override
	public String SayHelloRemote(String name) {
		return "Hello Remote" + name + "!";
	}

}
