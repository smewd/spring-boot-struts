package com.smood.service;


import org.springframework.stereotype.Service;


@Service("dummyService")
public class DummyService
{
	public String printMessage(String msg)
	{
		return "Message from form: " + msg;
	}
}
