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
	private String bider_id = "";
	
	/** 응찰자명 */
	private String bider_nm = "";
	
	/** 중도매인번호 */
	private String saler_id = "";
	
	
	public String getBider_id() {
		return bider_id;
	}

	public void setBider_id(String bider_id) {
		this.bider_id = bider_id;
	}

	public String getBider_nm() {
		return bider_nm;
	}

	public void setBider_nm(String bider_nm) {
		this.bider_nm = bider_nm;
	}

	public String getSaler_id() {
		return saler_id;
	}

	public void setSaler_id(String saler_id) {
		this.saler_id = saler_id;
	}
	
	
	
	
}
