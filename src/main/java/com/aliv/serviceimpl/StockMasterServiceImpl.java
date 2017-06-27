package com.aliv.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliv.model.StockMasterModel;
import com.aliv.repository.StockMasterRepo;
import com.aliv.service.StockMasterService;

@Service
public class StockMasterServiceImpl implements StockMasterService {

	static final Logger logger = Logger.getLogger(StockMasterServiceImpl.class);

	@Autowired
	private StockMasterRepo stockMasterRepo;

	@Autowired
	private StockMasterModel stockMasterModel;

	@Override
	public StockMasterModel addStock(StockMasterModel stockMasterModel) {

		/*
		 * Can put some condition checking on stockMasterModel here
		 */

		stockMasterRepo.save(stockMasterModel);
		return null;
	}

	@Override
	public StockMasterModel getStockByItemNo(String stockItemNo) {
		try {
			return stockMasterRepo.findBystockItemNo(stockItemNo);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}

	}

	@Override
	public StockMasterModel getStockByName(String stockName) {
		try {

			return stockMasterRepo.findByStockName(stockName);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}

	}

	@Override
	public StockMasterModel getStockByManufacturer(String stockManufacturer) {
		try {
			return stockMasterRepo.findByStockManufacturer(stockManufacturer);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}

	}

	@Override
	public List<StockMasterModel> getStockByNameLike(String stockName) {
		try {
			List<StockMasterModel> stockMasterModels = new ArrayList<>();
			stockMasterRepo.findByStockNameLikeOrderByStockName(stockName).forEach(stockMasterModels::add);

			return stockMasterModels;

		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}

	}

	@Override
	public List<StockMasterModel> getStockDescriptionLike(String stockDescription) {
		try {
			List<StockMasterModel> stockMasterModels = new ArrayList<>();
			stockMasterRepo.findByStockDescriptionLikeOrderByStockName(stockDescription)
					.forEach(stockMasterModels::add);
			return stockMasterModels;

		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}

	}

	@Override
	public int deleteStock(String stockItemNo) {
		try {
			this.stockMasterModel = stockMasterRepo.findBystockItemNo(stockItemNo);
			if (this.stockMasterModel != null) {
				this.stockMasterModel.setDeleted("YES");
				stockMasterRepo.save(this.stockMasterModel);
				return 0;
			}

			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return 1;
		}
	}

	@Override
	public List<StockMasterModel> getAllActiveStock() {
		try {

			return stockMasterRepo.findAllActive("");
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}

	@Override
	public List<StockMasterModel> getAllStock() {
		try {

			return (List<StockMasterModel>) stockMasterRepo.findAll();
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}

}
