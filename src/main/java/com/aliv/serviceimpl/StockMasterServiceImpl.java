package com.aliv.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliv.model.StockMasterModel;
import com.aliv.repository.StockMasterRepo;
import com.aliv.service.StockMasterService;

@Service
public class StockMasterServiceImpl implements StockMasterService {
	
	@Autowired
	private StockMasterRepo stockMasterRepo;
	
	@Autowired
	private StockMasterModel stockMasterModel;

	@Override
	public StockMasterModel addStock(StockMasterModel stockMasterModel) {
		
		return null;
	}

	@Override
	public int deleteStock(StockMasterModel stockMasterModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public StockMasterModel getStockByItemNo(String stockMasterModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockMasterModel getStockByName(String stockName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockMasterModel getStockByManufacturer(String stockManufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockMasterModel> getStockByNameLike(String stockName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockMasterModel> getStockDescriptionLike(String stockDescription) {
		// TODO Auto-generated method stub
		return null;
	}

}
