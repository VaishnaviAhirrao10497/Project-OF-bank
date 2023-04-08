package com.vaishnavi.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private Long rollNo;
			private String firstName;
			private String lastName;
			private String city;
			private String password;
			
			
}
