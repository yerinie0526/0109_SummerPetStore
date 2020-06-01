//나중에 필요하면 쓰기
//package summerpetstore.repository.mapper;
//
//import java.util.List;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.w3c.dom.Comment;
//
//public class GPCommentMapperRepository {
//	
//	@Autowired
//	private SqlSessionTemplate sqlSession;
//	
//	public Integer insertComment(Comment comment) {
//		Integer result = sqlSession.getMapper(GPCommentMapper.class).insertComment(comment);
//		return result;
//	}
//	
//	public Integer updateComment(Comment comment) {
//		Integer result = sqlSession.getMapper(CommentMapper.class).updateComment(comment);
//		return result;
//	}
//
//	public Integer deleteComment(Long commentNo) {
//		Integer result = sqlSession.getMapper(CommentMapper.class).deleteComment(commentNo);
//		return result;
//	}
//
//}
