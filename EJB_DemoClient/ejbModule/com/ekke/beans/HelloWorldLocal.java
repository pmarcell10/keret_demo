package com.ekke.beans;

import javax.ejb.Local;

@Local
public interface HelloWorldLocal {

	public String SayHello();
	
	public String SayHelloLocal(String name);
}
