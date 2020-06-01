package summerpetstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.w3c.dom.Comment;

import summerpetstore.dao.GpDAO;
//import summerpetstore.repository.mapper.GPMapperRepository;
import summerpetstore.model.GpModel;

public class GpService {
	
	@Autowired
	private GpDAO gpdao;
	
	// 수정
	@Transactional
	public int updateGP(GpModel gp) { // 매개변수 고려 필요
		return gpdao.updateGp(gp);
	}
	
	// 삭제
	@Transactional
	public int deleteGp(int itemId) { // 매개변수 고려 필요
		return gpdao.deleteGp(itemId);
	}
	
	// 취소; 기간이 지났는데도, 인원이 차지 않았을 경우, 자동 취소 및 환불
	@Transactional
	public void gpcancelGp(GpModel gp) { // 매개변수 고려 필요
		return gpdao.cancelGp(gp);
	}
	
	// 검색
	@Transactional
	public List<GpModel> searchGp(GpModel gp) { // 매개변수 고려 필요
		return gpdao.searchGp(gp.getName(), gp.getItemKind());
	}
	
	// 참가
	@Transactional
	public void participateGp(GpModel gp) { // 매개변수 고려 필요
		return gpdao.participateGp(gp);
	}
	
	public boolean is_GPJP_exist(GpModel gp) {	
		return 
	}
}
