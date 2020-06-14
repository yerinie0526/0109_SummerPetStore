package spetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spetstore.dao.SProductDAO;
import spetstore.model.ItemModel;

@Service
public class SProductService {
	@Autowired
	private SProductDAO spRepository;
	
	@Transactional
	public ItemModel showInfo(int itemId) {
		return spRepository.showInfo(itemId);
	}

	public ItemModel registerSP(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ItemModel deleteSP(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ItemModel updateSP(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}
}
