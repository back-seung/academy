package com.seung.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.seung.DAO.IF_Site_DAO;
import com.seung.DAO.IF_User_DAO;
import com.seung.VO.Site_VO;
import com.seung.VO.User_VO;

@Service
public class Site_ServiceImpl implements IF_Site_Service {
	@Inject
	private IF_Site_DAO bbsdao;

	@Override
	public void insert(Site_VO bbsvo) throws Exception {
		bbsdao.insert(bbsvo);
	}

	@Override
	public List<Site_VO> selectAll() throws Exception {
		return bbsdao.selectAll();
	}

	@Override
	public Site_VO selectOne(int no) throws Exception {
		bbsdao.updateCnt(no);
		return bbsdao.selectOne(no);
	}

	@Override
	public Site_VO updateView(int no) throws Exception {
		return bbsdao.selectOne(no);
	}

	@Override
	public void update(Site_VO siteVO) throws Exception {
		bbsdao.update(siteVO);
	}

	@Override
	public void delete(int no) throws Exception {
		bbsdao.delete(no);
	}

}
