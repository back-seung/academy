package com.human.DAO;

import java.util.List;

import com.human.VO.BBSVO;
import com.human.VO.PageVO;

public interface IF_BBSDAO {	
	//서비스단에서 호출한 작업을 sqlsession을 통해서 실제 데이터베이스 작업을 실행하기 위한 DAO
	// 본 DAO와 mapper의 sql과 mapping을 해서 사용합니다.
	public void insert(BBSVO bbsvo) throws Exception;
	// select * from bbs   : 쿼리문을을 생각하면 매개변수는 없고.. 리턴값이 있다..다중행
	public List<BBSVO> selectAll(PageVO pagevo) throws Exception;  // 전체 글보기 처리할 메서드... sqlsesion
	// update bbs set cnt=cnt+1 where no=?
	public void updateCntbbs(int vo) throws Exception;
	//select * from bbs where no=?
	public BBSVO selectOne(int vo) throws Exception;
	// update bbs set name=#{name}, memo=#{memo) where no= #{vo}
	public void updateBBS(BBSVO bbsvo) throws Exception;
	// delete from bbs where no = #{dno}
	public void delBBS(int dno) throws Exception;
	// select count(*) from bbs;
	public int bbscnt() throws Exception;
	// select bbs_seq.nextval from dual;
	public int getbbsSeq() throws Exception;
	// insert into bbs_attach	values (bbs_attach_seq.nextval, #{글번호}, #{파일명})
	public void insertattach(int bno, String filename) throws Exception;
	// select filename from bbs_attach where bbs_no=?
	public List<String> selectAttach(int vno) throws Exception;

}
