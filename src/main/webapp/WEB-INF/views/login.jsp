<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body id=body-login>
	<div id=body-flex-login>
		<div id=container-login>
			<div id=container-login-left>
				<div class="header-left">
					<span id="welcome">Welcome</span><br> <span id="after-welcome">Hãy
						tạo nên phong cách của bạn cùng MeoShop</span>
				</div>
				<div id="bottom-left">
					<p>
						<span>Luôn cập nhật thời trang mới nhất</span>
					</p>
					<p>
						<span>Giảm hơn 50% tất cả mặt hàng dành cho khách VIP</span>
					</p>
					<p>
						<span>Tận tình tư vấn tạo nên phong cách của bạn</span>
					</p>
				</div>
			</div>
			<div id=container-login-right>
				<div id="header-right" class="header-left">
					<span class="actived">Đăng nhập</span> / <span>Đăng kí</span>
				</div>
				<div>
					<form>
					<input class=input1 type="text" placeholder="Email" ><br>
					<input class=input2 type="password" placeholder=""><br>
					<input class=button type="submit" value="ĐĂNG NHẬP">
					</form>
				</div>
				<div id=logo>
				<img src='<c:url value="resources/images/fb.png"/>' />
				<img src='<c:url value="resources/images/ig.png"/>' style="margin-left: 10px" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>