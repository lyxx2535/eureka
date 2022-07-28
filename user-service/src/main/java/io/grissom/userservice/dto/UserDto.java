package io.grissom.userservice.dto;

import javax.validation.constraints.NotBlank;

/**
 * Author: Grissom
 */
public class UserDto {
	@NotBlank(message = "用户名不能为空")
	private String name;

	@NotBlank(message = "密码不能为空")
	private String pwd;

	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
