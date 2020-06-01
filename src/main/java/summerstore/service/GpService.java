package summerstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.w3c.dom.Comment;

public class GpService {
	
	@Autowired
	   private GPCommentMapperRepository gpcommentRepository;
	
	// ����
	@Transactional
	public int updateGP(Comment comment) { // �Ű����� ��� �ʿ�
		return commentRepository.updateComment(comment);
	}
	
	// ����
	@Transactional
	public void deleteGP(Comment comment) { // �Ű����� ��� �ʿ�
		return commentRepository.deleteComment(comment);
	}
	
	// ���; �Ⱓ�� �����µ���, �ο��� ���� �ʾ��� ���, �ڵ� ��� �� ȯ��
	@Transactional
	public void gpcancelGP(Comment comment) { // �Ű����� ��� �ʿ�
		return commentRepository.gpcancelComment(comment);
	}
	
	// �˻�
	@Transactional
	public List<Comment> searchGP(Comment comment) { // �Ű����� ��� �ʿ�
		return commentRepository.searchComment(comment);
	}
	
	// ����
	@Transactional
	public void participateGP(Comment comment) { // �Ű����� ��� �ʿ�
		return commentRepository.participateGPComment(comment);
	}
	
	public boolean is_GPJP_exist(Comment comment) {
		
		return 
	}
}
