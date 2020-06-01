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
	
	// ����
	@Transactional
	public int updateGP(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpdao.updateGp(gp);
	}
	
	// ����
	@Transactional
	public int deleteGp(int itemId) { // �Ű����� ��� �ʿ�
		return gpdao.deleteGp(itemId);
	}
	
	// ���; �Ⱓ�� �����µ���, �ο��� ���� �ʾ��� ���, �ڵ� ��� �� ȯ��
	@Transactional
	public void gpcancelGp(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpdao.cancelGp(gp);
	}
	
	// �˻�
	@Transactional
	public List<GpModel> searchGp(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpdao.searchGp(gp.getName(), gp.getItemKind());
	}
	
	// ����
	@Transactional
	public void participateGp(GpModel gp) { // �Ű����� ��� �ʿ�
		return gpdao.participateGp(gp);
	}
	
	public boolean is_GPJP_exist(GpModel gp) {	
		return 
	}
}
