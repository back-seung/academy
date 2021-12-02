package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_BBSDAO;
import com.human.VO.BBSVO;
@Service
public class IF_BBSServiceImpl implements IF_BBSService{
	@Inject
	private IF_BBSDAO bbsdao; 
	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		// 실제 데이터 베이스 작업등 서비스 로직을 싱행한다....
		bbsdao.insert(bbsvo);		
	}
	@Override
	public List<BBSVO> bbsList() throws Exception {
		/*
		권한을 체크하도록 추가등 사용자 요청을 처리하는 다양한 매커니즘이 추가 될 수도 있다..		
		*/
		return bbsdao.selectAll();  // repository 에 데이터베이스 작업을 요청
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
}
