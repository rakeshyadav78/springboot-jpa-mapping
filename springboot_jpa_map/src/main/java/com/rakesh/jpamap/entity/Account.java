package com.rakesh.jpamap.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id", nullable = false, unique = true)
	private Integer accounId;
	@Column(name = "branch_code", nullable = false)
	private String branchCode;
	@Column(name = "product_code", nullable = false)
	private String productCode;
	@Column(name = "account_no", nullable = false)
	private String accountNo;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer accounId, String branchCode, String productCode, String accountNo, Customer customer) {
		super();
		this.accounId = accounId;
		this.branchCode = branchCode;
		this.productCode = productCode;
		this.accountNo = accountNo;
		this.customer = customer;
	}

	public Integer getAccounId() {
		return accounId;
	}

	public void setAccounId(Integer accounId) {
		this.accounId = accounId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accounId=");
		builder.append(accounId);
		builder.append(", branchCode=");
		builder.append(branchCode);
		builder.append(", productCode=");
		builder.append(productCode);
		builder.append(", accountNo=");
		builder.append(accountNo);
		builder.append(", customer=");
		builder.append(customer);
		builder.append("]");
		return builder.toString();
	}

}
