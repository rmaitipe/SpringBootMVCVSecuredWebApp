package com.services;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements IMessageService {

	@Override
	public String echo(String s) {
		return s+s;
	}

}
