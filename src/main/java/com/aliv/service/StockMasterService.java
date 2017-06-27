package com.aliv.service;

import java.util.List;

import com.aliv.model.StockMasterModel;

public interface StockMasterService {

	public StockMasterModel addStock(StockMasterModel stockMasterModel);

	public int deleteStock(String stockItemNo);

	public StockMasterModel getStockByItemNo(String stockMasterModel);

	public StockMasterModel getStockByName(String stockName);

	public StockMasterModel getStockByManufacturer(String stockManufacturer);

	public List<StockMasterModel> getStockByNameLike(String stockName);

	public List<StockMasterModel> getStockDescriptionLike(String stockDescription);

	public List<StockMasterModel> getAllActiveStock();
	
	public List<StockMasterModel> getAllStock();

}
