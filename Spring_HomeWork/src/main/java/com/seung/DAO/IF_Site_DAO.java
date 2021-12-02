package com.seung.DAO;

import java.util.List;

import com.seung.VO.Page_VO;
import com.seung.VO.Site_VO;

public interface IF_Site_DAO {
	public void insert(Site_VO bbsvo) throws Exception;

	public List<Site_VO> selectAll(Page_VO pageVO) throws Exception;

	public Site_VO selectOne(int no) throws Exception;

	public void updateCnt(int no) throws Exception;

	public void update(Site_VO siteVO) throws Exception;

	public void delete(int no) throws Exception;

	public int boardCNT() throws Exception;

}
