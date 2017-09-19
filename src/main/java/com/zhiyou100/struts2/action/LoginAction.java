package com.zhiyou100.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	/** 参数校验 */
	public void validate() {// 会自动先校验
		// 验证非空
		if (username == null || "".equals(username.trim())) {
			// 添加错误信息
			super.addFieldError("username", "用户名不能为空");
		}
	}

	@Override
	public String execute() throws Exception {
		if ("智游".equals(username) && "123".equals(password)) {
			return SUCCESS;
		} else if ("zhiyou".equals(username) && "123".equals(password)) {
			super.addActionError("用户名或密码错误");
			return INPUT;
		}
		return "forward";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
