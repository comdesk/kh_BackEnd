package org.zerock.myapp.domain;

import lombok.Data;

@Data
public class LoginDTO {
	private String userid;
	private String userpw;
	private Boolean rememberMe;
} //end class
