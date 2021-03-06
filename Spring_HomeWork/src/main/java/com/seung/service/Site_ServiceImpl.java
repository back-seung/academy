package com.seung.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.seung.DAO.IF_Site_DAO;
import com.seung.VO.Page_VO;
import com.seung.VO.Site_VO;

@Service
public class Site_ServiceImpl implements IF_Site_Service {
	@Inject
	private IF_Site_DAO bbsdao;

	@Override
	public void insert(Site_VO bbsvo) throws Exception {
		bbsdao.insert(bbsvo);
	}

	@Override
	public List<Site_VO> selectAll(Page_VO pageVO) throws Exception {
		return bbsdao.selectAll(pageVO);
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

	@Override
	public int boardCNT() throws Exception{
		return bbsdao.boardCNT();
	}

}
