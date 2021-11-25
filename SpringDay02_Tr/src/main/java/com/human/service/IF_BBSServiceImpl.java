package com.human.service;

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
}
