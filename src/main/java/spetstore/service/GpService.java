package spetstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spetstore.dao.GpDAO;
import spetstore.model.GpModel;

@Service
public class GpService {
	
	@Autowired
	private GpDAO gpRepository;
	
	// 수정
	@Transactional
	public int updateGP(GpModel gp) { // 매개변수 고려 필요
		return gpRepository.updateGp(gp);
	}
	
	// 삭제
	@Transactional
	public int deleteGP(GpModel gp) { // 매개변수 고려 필요
		return gpRepository.deleteGp(gp.getItemId());
	}
	
	// 취소; 기간이 지났는데도, 인원이 차지 않았을 경우, 자동 취소 및 환불
	@Transactional
	public int cancelGP(GpModel gp) { // 매개변수 고려 필요
		return gpRepository.cancelGp(gp.getItemId());
	}
	
	// 검색
	@Transactional
	public List<GpModel> searchGP(GpModel gp) { // 매개변수 고려 필요
		return gpRepository.searchGp(gp.getItemmodel().getName(), gp.getItemmodel().getItemKind());
	}
	
	// 참가
	@Transactional
	public int participateGP(GpModel gp) { // 매개변수 고려 필요
		return gpRepository.participateGp(gp.getItemmodel().getItemId(), gp.getGpjpmodel().getUserName());
	}
	
	@Transactional
	public boolean is_GPJP_exist(GpModel gp) {
		return gpRepository.is_GPJP_exist(gp.getItemId());
	}
	
	@Transactional
	public int cancelGpJPId(int itemId) {
		return gpRepository.cancelGpJPId(itemId);
	}
}
