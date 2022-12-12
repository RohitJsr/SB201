package com.masai.Model;

public class AccountDTO {
	
	private Integer srcAccno;
	private Integer desAcccno;
	private Integer ammount;
	public AccountDTO(Integer srcAccno, Integer desAcccno, Integer ammount) {
		super();
		this.srcAccno = srcAccno;
		this.desAcccno = desAcccno;
		this.ammount = ammount;
	}
	public AccountDTO() {
		super();
	}
	public Integer getSrcAccno() {
		return srcAccno;
	}
	public void setSrcAccno(Integer srcAccno) {
		this.srcAccno = srcAccno;
	}
	public Integer getDesAcccno() {
		return desAcccno;
	}
	public void setDesAcccno(Integer desAcccno) {
		this.desAcccno = desAcccno;
	}
	public Integer getAmmount() {
		return ammount;
	}
	public void setAmmount(Integer ammount) {
		this.ammount = ammount;
	}
	
	

}
