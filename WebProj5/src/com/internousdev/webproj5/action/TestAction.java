package com.internousdev.webproj5.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.webproj5.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class TestAction extends ActionSupport implements SessionAware {

	private String username;
	private String password;
	private List<LoginDTO>loginDTOList=new ArrayList<LoginDTO>();
}
