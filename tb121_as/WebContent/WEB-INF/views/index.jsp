<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/css/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/css/icon.css">

	<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/easyui-lang-zh_CN.js"></script>
  
  
  </head>
  
  <body class="easyui-layout">
  <div data-options="region:'north',border:false" style="height: 100px" >
  <tiles:insertAttribute name="top"></tiles:insertAttribute>
  </div>
  
  <div data-options="region:'center',title:'代理商管理系统'">
  	<tiles:insertAttribute name="center"></tiles:insertAttribute>
  </div>
  
  <div data-options="region:'south',border:false" style="height: 50px"  >
  	<tiles:insertAttribute name="foot"></tiles:insertAttribute>
  </div>
  
  </body>
  
  
 </html>
