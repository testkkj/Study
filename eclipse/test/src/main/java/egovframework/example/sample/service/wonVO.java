package egovframework.example.sample.service;

import java.io.Serializable;

/**
 * @Class Name : SampleVO.java
 * @Description : SampleVO Class
 * @Modification Information
 * @
 * @  수정일              수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2021.02.01    원효재            최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2021. 02.01
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */

public class wonVO implements Serializable  {
	
	/** 응찰자ID */
	private String biderid = "";
	
	/** 응찰자명 */
	private String bidernm = "";
	
	/** 중도매인번호 */
	private String salerid = "";

	public String getBiderid() {
		return biderid;
	}

	public void setBiderid(String biderid) {
		this.biderid = biderid;
	}

	public String getBidernm() {
		return bidernm;
	}

	public void setBidernm(String bidernm) {
		this.bidernm = bidernm;
	}

	public String getSalerid() {
		return salerid;
	}

	public void setSalerid(String salerid) {
		this.salerid = salerid;
	}
	
	
	
	
	
	
}
