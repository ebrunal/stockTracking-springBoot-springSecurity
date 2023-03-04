package com.javainuse.entity;


import javax.persistence.*;


@Entity
@Table

public class Stock {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Integer s_kodu;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private Users users;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "companies_id", referencedColumnName = "id")
    private Companies companies;
    
	public Stock() {
		
	}
	
	public Stock(Integer s_kodu) {
		super();
		this.s_kodu = s_kodu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getS_kodu() {
		return s_kodu;
	}

	public void setS_kodu(Integer s_kodu) {
		this.s_kodu = s_kodu;
	}

	



	
}
