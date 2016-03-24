<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>register</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
<h1>用户注册</h1>
<hr>
	<center>
		<form action="registerDeal.jsp" name="f" method="post"  onSubmit="return check()">
			<table>
				<tr>
					<td>用&nbsp;户&nbsp;名：</td>
					<td><input type="text" name="username" ></td>
				</tr>
				<tr>
					<td>密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input type="password" name="repassword"></td>
				</tr>
				<tr height="50">
					<td colspan="2" align="center"><input type="submit" value="注册">
						&nbsp;&nbsp; <input type="reset" value="重置">
				</tr>
			</table>
		</form>
	</center>
	<script type="text/javascript">
		function check() {
			var obj=document.f;
			if(obj.username.value.length==0){
				alert("用户名不能为空！");
				obj.username.focus();
				return false;
			}
			if(obj.password.value.length==0){
				alert("密码不能为空！");
				obj.password.focus();
				return false;
			}
			if(obj.password.value!=obj.repassword.value){
				alert("密码不一致!");
				obj.repassword.focus();
				return false;
			}
			return true;
		}
	</script>
</body>
</html>
