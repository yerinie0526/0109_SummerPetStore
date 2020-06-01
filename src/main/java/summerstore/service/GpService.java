package summerstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.w3c.dom.Comment;

public class GpService {
	
	@Autowired
	   private GPCommentMapperRepository gpcommentRepository;
	
	// 수정
	@Transactional
	public int updateGP(Comment comment) { // 매개변수 고려 필요
		return commentRepository.updateComment(comment);
	}
	
	// 삭제
	@Transactional
	public void deleteGP(Comment comment) { // 매개변수 고려 필요
		return commentRepository.deleteComment(comment);
	}
	
	// 취소; 기간이 지났는데도, 인원이 차지 않았을 경우, 자동 취소 및 환불
	@Transactional
	public void gpcancelGP(Comment comment) { // 매개변수 고려 필요
		return commentRepository.gpcancelComment(comment);
	}
	
	// 검색
	@Transactional
	public List<Comment> searchGP(Comment comment) { // 매개변수 고려 필요
		return commentRepository.searchComment(comment);
	}
	
	// 참가
	@Transactional
	public void participateGP(Comment comment) { // 매개변수 고려 필요
		return commentRepository.participateGPComment(comment);
	}
	
	public boolean is_GPJP_exist(Comment comment) {
		
		return 
	}
}
