package egovframework.example.sample.service.impl;

import java.util.List;

import egovframework.example.sample.service.wonVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper ("wonMapper")
public interface wonMapper {
	
	List<?> selectWonList(wonVO wonVO) throws Exception;
}
