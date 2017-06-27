package com.aliv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliv.model.StockMasterModel;
import com.aliv.serviceimpl.StockMasterServiceImpl;

@RestController
public class StockMasterController {

	@Autowired
	private StockMasterServiceImpl stockMasterServiceImpl;

	@Autowired
	private StockMasterModel stockMasterModel;

	@RequestMapping(value = "/addStock", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<StockMasterModel> addStockModelController(@RequestBody StockMasterModel stockMasterModel) {
		try {
			this.stockMasterModel = stockMasterModel;

			stockMasterServiceImpl.addStock(stockMasterModel);

			return new ResponseEntity<StockMasterModel>(this.stockMasterModel, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<StockMasterModel>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/getAllStock", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<StockMasterModel>> getAllStock() {
		try {
			List<StockMasterModel> stockMasterModels = new ArrayList<>();
			stockMasterServiceImpl.getAllStock().forEach(stockMasterModels::add);

			return new ResponseEntity<List<StockMasterModel>>(stockMasterModels, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<List<StockMasterModel>>(HttpStatus.BAD_REQUEST);
		}

	}

}
