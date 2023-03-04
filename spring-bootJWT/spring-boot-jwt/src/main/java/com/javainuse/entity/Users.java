package com.javainuse.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

public class Users {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
		@NotEmpty()
		private String name;
	    
	    @NotEmpty()
	    @Email(message="{errors.invalid_email}")
	    private String email;
	    
		@NotEmpty
		@Size(min=4)
	    private String password;
		
		@OneToOne(mappedBy = "users")
	    private Stock stock;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}


		

	
}
