package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Enitity class for Stock_Purchase_Details
 * 
 * @author
 *
 */
@Entity
@Table(name = "stock_purchase_details	")
public class StockPrchDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stockpurchaseId;

	@Column(name = "invoice_no")
	private String invoiceNo;

	@Column(name = "vendor_name")
	private String vendorName;

	@Column(name = "category")
	private String category;

	@Column(name = "sub_category")
	private String subCategory;

	
	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	@Column(name = "item")
	private String item;

	@Column(name = "carat")
	private String carat;

	@Column(name = "weight")
	private double weight;

	@Column(name = "quantity")
	private String quantity;

	@Column(name = "bill_amount")
	private double billAmount;

	@Column(name = "amount_paid")
	private double amountPaid;

	public int getStockpurchaseId() {
		return stockpurchaseId;
	}

	public void setStockpurchaseId(int stockpurchaseId) {
		this.stockpurchaseId = stockpurchaseId;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCarat() {
		return carat;
	}

	public void setCarat(String carat) {
		this.carat = carat;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amountPaid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(billAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((carat == null) ? 0 : carat.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((invoiceNo == null) ? 0 : invoiceNo.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + stockpurchaseId;
		result = prime * result + ((vendorName == null) ? 0 : vendorName.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockPrchDtls other = (StockPrchDtls) obj;
		if (Double.doubleToLongBits(amountPaid) != Double.doubleToLongBits(other.amountPaid))
			return false;
		if (Double.doubleToLongBits(billAmount) != Double.doubleToLongBits(other.billAmount))
			return false;
		if (carat == null) {
			if (other.carat != null)
				return false;
		} else if (!carat.equals(other.carat))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (invoiceNo == null) {
			if (other.invoiceNo != null)
				return false;
		} else if (!invoiceNo.equals(other.invoiceNo))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (stockpurchaseId != other.stockpurchaseId)
			return false;
		if (vendorName == null) {
			if (other.vendorName != null)
				return false;
		} else if (!vendorName.equals(other.vendorName))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

}
