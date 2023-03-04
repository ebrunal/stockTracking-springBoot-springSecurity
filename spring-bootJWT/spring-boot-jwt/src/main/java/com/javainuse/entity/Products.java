package com.javainuse.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



 
 @Table
 @Entity
public class Products {
	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    
	    private Long p_kodu;
	    
	    private String p_ad;

	    private Float p_fiyat;
	    
	    private Integer p_adet;
	    
	    @OneToMany(
				cascade = CascadeType.ALL,
				orphanRemoval = true
				)
		
		@JoinColumn(name = "products_id")
		private List<Stock> stock = new ArrayList<>();
	    
	    public Products() {
	    	
	    }
	    
	    
	    public Products(Long p_kodu, String p_ad, Float p_fiyat, Integer p_adet, List<Stock> stock) {
			super();
			this.p_kodu = p_kodu;
			this.p_ad = p_ad;
			this.p_fiyat = p_fiyat;
			this.p_adet = p_adet;
			this.stock = stock;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Long getP_kodu() {
			return p_kodu;
		}


		public void setP_kodu(Long p_kodu) {
			this.p_kodu = p_kodu;
		}


		public String getP_ad() {
			return p_ad;
		}


		public void setP_ad(String p_ad) {
			this.p_ad = p_ad;
		}


		public Float getP_fiyat() {
			return p_fiyat;
		}


		public void setP_fiyat(Float p_fiyat) {
			this.p_fiyat = p_fiyat;
		}


		public Integer getP_adet() {
			return p_adet;
		}


		public void setP_adet(Integer p_adet) {
			this.p_adet = p_adet;
		}


		public List<Stock> getStock() {
			return stock;
		}


		public void setStock(List<Stock> stock) {
			this.stock = stock;
		}

	    
		

		

}
