package com.ekke.beans;

import javax.ejb.Remote;

@Remote
public interface HelloWorldRemote {

	public String SayHello();
	
	public String SayHelloRemote(String name);
}
