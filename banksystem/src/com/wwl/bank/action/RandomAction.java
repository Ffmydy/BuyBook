package com.wwl.bank.action;

import java.io.ByteArrayInputStream;  

import com.opensymphony.xwork2.ActionContext;  
import com.opensymphony.xwork2.ActionSupport;
import com.wwl.bank.util.RandomNumUtil;

@SuppressWarnings("serial")
public class RandomAction extends ActionSupport{  
	
	private ByteArrayInputStream inputStream; 
	
	@SuppressWarnings("unchecked")
	public String execute() throws Exception{  
		
		RandomNumUtil rdnu=RandomNumUtil.Instance();   
		this.setInputStream(rdnu.getImage());//ȡ�ô�������ַ�����ͼƬ   
		//ȡ������ַ�������HttpSession
		ActionContext.getContext().getSession().put("random", rdnu.getString());   
		return SUCCESS;   
	}   
	
	public void setInputStream(ByteArrayInputStream inputStream) {   
		this.inputStream = inputStream;   
	}   
	
	public ByteArrayInputStream getInputStream() {   
		return inputStream;   
	}  
} 
