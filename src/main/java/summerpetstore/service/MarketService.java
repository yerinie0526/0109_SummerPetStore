package summerpetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import summerpetstore.dao.MarketDAO;
import summerpetstore.model.GpModel;

public class MarketService {
	
	@Autowired
	private MarketDAO mdao;
	
	// ����
	@Transactional
	public int updateGP(GpModel gp) { // �Ű����� ��� �ʿ�
		return mdao.updateGp(gp);
	}
	
	// ����
	@Transactional
	public int deleteGP(GpModel gp) { // �Ű����� ��� �ʿ�
		return mdao.deleteGp(gp.getItemId());
	}
	
	// ���; �Ⱓ�� �����µ���, �ο��� ���� �ʾ��� ���, �ڵ� ��� �� ȯ��
	@Transactional
	public int cancelGP(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpRepository.cancelGp(gp.getItemId());
	}

}
