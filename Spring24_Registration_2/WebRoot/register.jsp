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
<h1>�û�ע��</h1>
<hr>
	<center>
		<form action="registerDeal.jsp" name="f" method="post"  onSubmit="return check()">
			<table>
				<tr>
					<td>��&nbsp;��&nbsp;����</td>
					<td><input type="text" name="username" ></td>
				</tr>
				<tr>
					<td>��&nbsp;&nbsp;&nbsp;&nbsp;�룺</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>ȷ�����룺</td>
					<td><input type="password" name="repassword"></td>
				</tr>
				<tr height="50">
					<td colspan="2" align="center"><input type="submit" value="ע��">
						&nbsp;&nbsp; <input type="reset" value="����">
				</tr>
			</table>
		</form>
	</center>
	<script type="text/javascript">
		function check() {
			var obj=document.f;
			if(obj.username.value.length==0){
				alert("�û�������Ϊ�գ�");
				obj.username.focus();
				return false;
			}
			if(obj.password.value.length==0){
				alert("���벻��Ϊ�գ�");
				obj.password.focus();
				return false;
			}
			if(obj.password.value!=obj.repassword.value){
				alert("���벻һ��!");
				obj.repassword.focus();
				return false;
			}
			return true;
		}
	</script>
</body>
</html>
