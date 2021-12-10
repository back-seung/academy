package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_BBSDAO;
import com.human.VO.BBSVO;
import com.human.VO.PageVO;
@Service
public class IF_BBSServiceImpl implements IF_BBSService{
	@Inject
	private IF_BBSDAO bbsdao; 
	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		// 실제 데이터 베이스 작업등 서비스 로직을 싱행한다....
		//  12월 6일 첨부파일 추가됨....upgrade
		//  테이블은 2개 : 1개 게시글 테이블    insert into bbs values (bbs_seq.nextval, #{name}, #{memo}, 0, default)
		//             1개 첨부파일 테이블  insert into bbs_attach values (첨부파일테이블기본키, bbs_seq.nextval, 파일명);
		// 수정 >> 1. 시퀀스 번호 가져오기  2. vo에 시퀀스 저장하기   3. 쿼리문 조정
		int nowNO = bbsdao.getbbsSeq();  // 1번
		bbsvo.setNo(nowNO);  // 2번, 3번 쿼리문 조정.
		bbsdao.insert(bbsvo);	// 게시글을 등록 후 첨부파일을 별도로 등록
		// 첨부파일 기록...
		// 첨부파일이 배열로 되어 있어서(추후에 여러개의 파일을 업로그 업그레이드) 
		String[] files = bbsvo.getFiles();
		if(files == null) {return;}
		for(String fileName : files) {
			bbsdao.insertattach(nowNO, fileName);  // 파일명을 가져와서 하나씩 등록하겠다.
		}
	}
	@Override
	public List<BBSVO> bbsList(PageVO pagevo) throws Exception {
		/*
		권한을 체크하도록 추가등 사용자 요청을 처리하는 다양한 매커니즘이 추가 될 수도 있다..		
		*/
		return bbsdao.selectAll(pagevo);  // repository 에 데이터베이스 작업을 요청
	}
	@Override
	public BBSVO viewDetail(int vno) throws Exception {
		// DB
		bbsdao.updateCntbbs(vno);     // 조회수 증가하는 쿼리  update bbs set cnt=cnt+1 where no=?
		return bbsdao.selectOne(vno);    // 해당 자료를 넘기는 쿼리   select * from bbs where no=?
	}
	@Override
	public BBSVO modBBSForm(int vno) throws Exception {
		// TODO Auto-generated method stub
		return bbsdao.selectOne(vno);  // select * from bbs where no=?
	}
	@Override
	public void modBBSUpdate(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		bbsdao.updateBBS(bbsvo);
	}
	@Override
	public void delBBS(int dno) throws Exception {
		// TODO Auto-generated method stub
		bbsdao.delBBS(dno);  // 실제 데이터베이스 작업 의도
	}
	@Override
	public int bbscnt() throws Exception {
		// TODO Auto-generated method stub
		return bbsdao.bbscnt();
	}
	@Override
	public List<String> selectAttach(int vno) throws Exception {
		// TODO Auto-generated method stub
		return bbsdao.selectAttach(vno);
	}
	
}
