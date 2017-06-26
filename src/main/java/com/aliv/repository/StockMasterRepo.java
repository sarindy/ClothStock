package com.aliv.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aliv.model.StockMasterModel;

@Repository
public interface StockMasterRepo extends CrudRepository<StockMasterModel, Integer> {

	public StockMasterModel findBystockItemNo(String stockItemNo);

	public StockMasterModel findByStockName(String stockName);

	public StockMasterModel findByStockManufacturer(String stockManufacturer);

	public List<StockMasterModel> findByStockNameLikeOrderByStockName(String stockName);

	public List<StockMasterModel> findByStockDescriptionLikeOrderByStockName(String stockDescription);

}
