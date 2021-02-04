package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.wonVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("wonDAO")
public class wonDAO extends EgovAbstractDAO {
	
	public List<?> selectWonList(wonVO wonVO) throws Exception{
		return list("wonDAO.selectWonList", wonVO);
	}
}
