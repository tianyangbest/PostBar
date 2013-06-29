<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My PostBar Website.</title>
</head>
<body>
	<h1>This is my PostBar Website.</h1>
	<table border="1">
		<tr>
			<td>ID</td>
			<td><s:property value="model.id" />
			</td>
		</tr>
		<tr>
			<td>Title</td>
			<td><s:property value="model.title" />
			</td>
		</tr>
		<tr>
			<td>Text</td>
			<td><s:property value="model.text" />
			</td>
		</tr>
		<tr>
			<td>User IP</td>
			<td><s:property value="model.posterIP" />
			</td>
		</tr>
		<tr>
			<td>Create Time</td>
			<td><s:property value="model.createTime" />
			</td>
		</tr>
		<tr>
			<td>last Reply Time</td>
			<td><s:property value="model.lastReplyTime" />
			</td>
		</tr>
		<s:iterator value="model.childPosters" var="childPoster" status="posterIndex">
			<tr>
				<td><s:property value="#posterIndex.count"/> </td>

				<td>
					<table border="1">
						<tr>
							<td colspan="2"><s:property value="#childPoster.title" /></td>
						</tr>
						<tr>
							<td colspan="2"><s:property value="#childPoster.text" /></td>
						</tr>
						<tr>
							<td>Create Time:</td>
							<td><s:property value="#childPoster.CreateTime" /></td>
						</tr>
						<tr>
							<td>IP Address:</td>
							<td><s:property value="#childPoster.posterIP" /></td>
						</tr>
					</table>
				</td>

			</tr>
		</s:iterator>
	</table>


	<s:form action="publishPoster" method="post" theme="simple">
		<s:hidden name="parentPoster.id" value="%{model.id}"></s:hidden>
		<s:textfield name="title" value="Reply: %{model.title}"></s:textfield>
		<br />
		<s:textarea name="text"></s:textarea>
		<input type="submit" value="Submit">
	</s:form>

</body>
</html>


