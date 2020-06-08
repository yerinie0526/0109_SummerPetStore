package summerpetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import summerpetstore.dao.MarketDAO;
import summerpetstore.model.GpModel;

public class MarketService {
	
	@Autowired
	private MarketDAO mdao;
	
	// 수정
	@Transactional
	public int updateGP(GpModel gp) { // 매개변수 고려 필요
		return mdao.updateGp(gp);
	}
	
	// 삭제
	@Transactional
	public int deleteGP(GpModel gp) { // 매개변수 고려 필요
		return mdao.deleteGp(gp.getItemId());
	}
	
	// 취소; 기간이 지났는데도, 인원이 차지 않았을 경우, 자동 취소 및 환불
	@Transactional
	public int cancelGP(GpModel gp) { // 매개변수 고려 필요
		return gpRepository.cancelGp(gp.getItemId());
	}

}
