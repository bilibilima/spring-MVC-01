<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试表格</title>
</head>
<body>

	<form name="loginForm" action="../login/doLogin.do" method="post">
	
		<table align="center" border="1" width="600">
			<tr>
				<td colspan="2" style="text-align:center">用户登录</td>
			</tr>
			
			<tr>
				<td>账号：</td>
				<td><input name="account" type="text" /></td>
			</tr>
			
			<tr>
				<td>密码：</td>
				<td><input name="password" type="password" /></td>
			</tr>

			<tr>
				<td>年龄：</td>
				<td><input name="age" type="text" /></td>
			</tr>

			<tr>
				<td>出生：</td>
				<td><input name="birthday" type=time" /></td>
			</tr>
					
			<tr>
				<td><input type="submit" value="确定"/></td>
				<td><input type="reset" value="重填"/></td>
			</tr>
		</table>
	
	</form>
	
	
</body>
</html>