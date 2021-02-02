package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;
import egovframework.example.sample.service.SinVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("sinDAO")
public class SinDAO extends EgovAbstractDAO {
	public SinVO selectSin(SinVO vo) throws Exception {
		return (SinVO) select("SinDAO.selectSin", vo);
	}
}
