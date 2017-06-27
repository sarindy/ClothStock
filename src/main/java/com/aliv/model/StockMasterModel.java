package com.aliv.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "stock_master_detail")
@Component
public class StockMasterModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stock_item_id")
	private long id;

	@Column(name = "stock_item_no", unique = true)
	private String stockItemNo;
	@Column(name = "stock_name", unique = true)
	private String stockName;
	@Column(name = "stock_description")
	private String stockDescription;
	@Column(name = "stock_manufacturer")
	private String stockManufacturer;
	@Column(name = "cost_per_item")
	private double costPerItem;
	@Column(name = "stock_quantity")
	private long stockQuantity;
	@Column(name = "inventory_value")
	private double inventoryValue;
	@Column(name = "stock_reorder_level")
	private int stockReorderLevel;
	@Column(name = "days_per_order")
	private int stockDaysPerOrder;
	@Column(name = "stock_discontinue")
	private int stockDisContinue;
	@Column(name = "in_or_out")
	private String inOrOut;

	@Column(name = "date_done")
	@Temporal(TemporalType.TIMESTAMP)
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+7") this only change in json
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "GMT+7")
	private Date dateDone;

	private String deleted;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStockItemNo() {
		return stockItemNo;
	}

	public void setStockItemNo(String stockItemNo) {
		this.stockItemNo = stockItemNo;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockDescription() {
		return stockDescription;
	}

	public void setStockDescription(String stockDescription) {
		this.stockDescription = stockDescription;
	}

	public String getStockManufacturer() {
		return stockManufacturer;
	}

	public void setStockManufacturer(String stockManufacturer) {
		this.stockManufacturer = stockManufacturer;
	}

	public double getCostPerItem() {
		return costPerItem;
	}

	public void setCostPerItem(double costPerItem) {
		this.costPerItem = costPerItem;
	}

	public long getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(long stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public double getInventoryValue() {
		return inventoryValue;
	}

	public void setInventoryValue(double inventoryValue) {
		this.inventoryValue = inventoryValue;
	}

	public int getStockReorderLevel() {
		return stockReorderLevel;
	}

	public void setStockReorderLevel(int stockReorderLevel) {
		this.stockReorderLevel = stockReorderLevel;
	}

	public int getStockDaysPerOrder() {
		return stockDaysPerOrder;
	}

	public void setStockDaysPerOrder(int stockDaysPerOrder) {
		this.stockDaysPerOrder = stockDaysPerOrder;
	}

	public int getStockDisContinue() {
		return stockDisContinue;
	}

	public void setStockDisContinue(int stockDisContinue) {
		this.stockDisContinue = stockDisContinue;
	}

	public String getInOrOut() {
		return inOrOut;
	}

	public void setInOrOut(String inOrOut) {
		this.inOrOut = inOrOut;
	}

	public Date getDateDone() {
		return dateDone;
	}

	public void setDateDone(Date dateDone) {
		this.dateDone = new Date();
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "StockMasterModel [id=" + id + ", stockItemNo=" + stockItemNo + ", stockName=" + stockName
				+ ", stockDescription=" + stockDescription + ", stockManufacturer=" + stockManufacturer
				+ ", costPerItem=" + costPerItem + ", stockQuantity=" + stockQuantity + ", inventoryValue="
				+ inventoryValue + ", stockReorderLevel=" + stockReorderLevel + ", stockDaysPerOrder="
				+ stockDaysPerOrder + ", stockDisContinue=" + stockDisContinue + ", inOrOut=" + inOrOut + ", dateDone="
				+ dateDone + ", deleted=" + deleted + "]";
	}

	public StockMasterModel(long id, String stockItemNo, String stockName, String stockDescription,
			String stockManufacturer, double costPerItem, long stockQuantity, double inventoryValue,
			int stockReorderLevel, int stockDaysPerOrder, int stockDisContinue, String inOrOut, Date dateDone,
			String deleted) {

		this.stockItemNo = stockItemNo;
		this.stockName = stockName;
		this.stockDescription = stockDescription;
		this.stockManufacturer = stockManufacturer;
		this.costPerItem = costPerItem;
		this.stockQuantity = stockQuantity;
		this.inventoryValue = inventoryValue;
		this.stockReorderLevel = stockReorderLevel;
		this.stockDaysPerOrder = stockDaysPerOrder;
		this.stockDisContinue = stockDisContinue;
		this.inOrOut = inOrOut;
		this.dateDone = dateDone;
		this.deleted = deleted;
	}

	public StockMasterModel() {
		// TODO Auto-generated constructor stub
	}

	public StockMasterModel stockMasterModel() {
		return new StockMasterModel();
	}

}
