package com.kelp.kelpProject;

import java.util.*;

public class AccModel {
	private String AccNo = "";
	private String AccName = "";
	private Integer AccBal = 0;
	private Integer AccBalTemp = 0;
	
	private String AccNo1 = "";
	private String AccNo2 = "";
	
//	private Float subtotal = 0f;
//	private Float total = 0f;
//	private Float discount = 0f;
//	private Float prodiscount = 0f;
//	private Float totalprodiscount = 0f;
//	private Float entryFee = 0f;
//	private Float proFee = 0f;
//	private Integer minProgramTotal = 10000;
	

	public AccModel() {
		super();
	}

public AccModel(String accNo, String accName, Integer accBal) {
	super();
	AccNo = accNo;
	AccName = accName;
	AccBal = accBal;
}

public String getAccNo() {
	return AccNo;
}

public void setAccNo(String accNo) {
	AccNo = accNo;
}

public String getAccName() {
	return AccName;
}

public void setAccName(String accName) {
	AccName = accName;
}

public Integer getAccBal() {
	return AccBal;
}

public void setAccBal(Integer accBal) {
	AccBal = accBal;
}

public Integer getAccBalTemp() {
	return AccBalTemp;
}

public void setAccBalTemp(Integer accBalTemp) {
	AccBalTemp = accBalTemp;
}

public String getAccNo1() {
	return AccNo1;
}

public void setAccNo1(String accNo1) {
	AccNo1 = accNo1;
}

public String getAccNo2() {
	return AccNo2;
}

public void setAccNo2(String accNo2) {
	AccNo2 = accNo2;
}
	
	

	


	
	
}
