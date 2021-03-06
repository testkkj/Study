<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
  /**
  * @Class Name : egovSampleList.jsp
  * @Description : Sample List 화면
  * @Modification Information
  *
  *   수정일         수정자                   수정내용
  *  -------    --------    ---------------------------
  *  2021.02.02            최초 생성
  *
  * author 실행환경 개발팀
  * since 2020.02.02
  *
  * Copyright (C) 2020 by MOPAS  All right reserved.
  */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title><spring:message code="title.sample" /></title>
    <link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
    <script type="text/javaScript" language="javascript" defer="defer">
    </script>    
<title>Insert title here</title>
</head>
<body>
<h1>hello Won World!</h1>
<div id="table">
    <table>
		<colgroup>
			<col width="40"/>
			<col width="100"/>
			<col width="150"/>
		</colgroup>
		<tr>
			<th align="center">ID</th>
			<th align="center">NAME</th>
			<th align="center">SALER</th>
		</tr>
		<c:forEach items="${wonResultList}" var="won">
		    <tr>
		        <td>${won.biderId}</td>
		        <td>${won.biderNm}</td>
		        <td>${won.salerId}</td>
		    </tr>
		</c:forEach>
    </table>
</div>
</body>
</html>