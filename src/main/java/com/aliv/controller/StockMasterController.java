package com.aliv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aliv.model.StockMasterModel;
import com.aliv.serviceimpl.StockMasterServiceImpl;


@RestController
public class StockMasterController {
	
	@Autowired
	private StockMasterServiceImpl stockMasterServiceImpl;
	
	@Autowired
	private StockMasterModel stockMasterModel;
	
	public ResponseEntity<StockMasterModel> addStockModelController(@RequestBody StockMasterModel stockMasterModel){
		this.stockMasterModel = stockMasterModel;
		/*
		 * Can put some condition checking on stockMasterModel here
		 */
		
		stockMasterServiceImpl.addStock(stockMasterModel);
		
		return new ResponseEntity<StockMasterModel>(this.stockMasterModel,HttpStatus.OK);
		
	}
	
	

}
