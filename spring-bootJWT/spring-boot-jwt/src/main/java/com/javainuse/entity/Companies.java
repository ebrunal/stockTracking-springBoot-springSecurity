package com.javainuse.entity;

import javax.persistence.*;


@Entity
@Table

public class Companies {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    
	    private Long m_kodu;
	    
	    private String m_adi;
	    
	    @OneToOne(mappedBy = "companies")
	    private Stock stock;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getM_kodu() {
			return m_kodu;
		}

		public void setM_kodu(Long m_kodu) {
			this.m_kodu = m_kodu;
		}

		public String getM_adi() {
			return m_adi;
		}

		public void setM_adi(String m_adi) {
			this.m_adi = m_adi;
		}


		

	

}
