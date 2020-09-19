<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.vuavent.springO.entity.NhanVien" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="header.jsp"></jsp:include>

<title>Insert title here</title>
</head>
<body>
 
	<c:forEach items="${listnv}" var="nv">
		<c:out value="${nv.getName() }"/>
	</c:forEach>
	
	<a id="thea" href="chitiet">chi tiet ne</a>	<br>
	
	<c:catch var="exception">
		<%int z = 5/0; %>
	</c:catch>
	<c:if test="${exception != null }">
		Error: ${exception.message }
	</c:if> <br>
	
	<c:set var="so" value="1000"/>
	<c:if test="${so == 1000}">
		So A ne ml
	</c:if>
	
	<c:choose>
		<c:when test="${so == 1000 }">
		1000dong ne ku
		</c:when>
		
		<c:when test="${so == 100 }">
		100 dong thui 
		</c:when>
		
		<c:otherwise>
		Nhieu tien qua ong nghe
		</c:otherwise>
	</c:choose><br>
	
	<c:forTokens items="Vu,Minh,Tran" delims="," var="name">
	<c:out value="${name }"/>
	</c:forTokens><br>
	
</body>
</html>