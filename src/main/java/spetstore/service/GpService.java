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
	
	// ����
	@Transactional
	public int updateGP(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpRepository.updateGp(gp);
	}
	
	// ����
	@Transactional
	public int deleteGP(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpRepository.deleteGp(gp.getItemId());
	}
	
	// ���; �Ⱓ�� �����µ���, �ο��� ���� �ʾ��� ���, �ڵ� ��� �� ȯ��
	@Transactional
	public int cancelGP(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpRepository.cancelGp(gp.getItemId());
	}
	
	// �˻�
	@Transactional
	public List<GpModel> searchGP(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpRepository.searchGp(gp.getItemmodel().getName(), gp.getItemmodel().getItemKind());
	}
	
	// ����
	@Transactional
	public int participateGP(GpModel gp) { // �Ű����� ��� �ʿ�
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
