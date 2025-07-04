package com.javaexpress.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	@JsonProperty("credential")
	@JsonInclude(value = Include.NON_NULL)
	private CredentialDto credentialDto;
}

