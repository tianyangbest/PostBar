<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My PostBar Website.</title>
</head>
<body>
	<h1>This is my PostBar Website.</h1>

	The total number of Posters is:
	<s:property value="allPosters.size()" />

	<table border="1">
		<tr>
			<td>ID</td>
			<td>Title</td>
			<td>IP Address</td>
			<td>Create Time</td>
			<td>Last Reply Time</td>
		</tr>
		<s:iterator value="allPosters" var="poster">
			<tr>
				<td><s:property value="#poster.id" /></td>
				<td><s:a action="showPoster" namespace="/">
						<s:property value="#poster.title" />
						<s:param name="id" value="#poster.id"></s:param>
					</s:a></td>
				<td><s:property value="#poster.posterIP" /></td>
				<td><s:property value="#poster.createTime" /></td>
				<td><s:property value="#poster.lastReplyTime" /></td>
			</tr>
		</s:iterator>
	</table>
	<br />

	<s:form action="publishPoster" method="post" theme="simple">
		<s:textfield name="title"></s:textfield>
		<br />
		<s:textarea name="text"></s:textarea>
		<input type="submit" value="Submit">
	</s:form>
</body>
</html>


