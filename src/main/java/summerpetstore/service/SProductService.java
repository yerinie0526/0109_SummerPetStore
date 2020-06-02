package summerpetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import summerpetstore.dao.SProductDAO;

@Service
public class SProductService {
	@Autowired
	private SProductDAO spRepository;
	
	public ItemModel showInfo(String itemId) {
		
	}
}
