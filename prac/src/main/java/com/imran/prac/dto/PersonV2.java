package com.imran.prac.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class PersonV2
{
	private Name name;
	private int age;
}
