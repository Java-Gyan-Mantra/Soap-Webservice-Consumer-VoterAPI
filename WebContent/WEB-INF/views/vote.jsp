<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voter Home Page</title>
<style type="text/css">
a.two:link {
	color: blue;
	text-decoration: none;
	font-size: 20px;
}

a.two:visited {
	color: red;
}

a.two:hover {
	font-size: 150%;
}

h1 {
	text-align: center;
	color: green;
	font-style: italic;
}

#below {
	border-radius: 5px;
	padding: 5px;
	font-size: 20px;
	width: 270px;
	text-align: center;
	color: navy;
	margin: auto;
	/*Just to prevent the content from being to close to the corner*/
}

fieldset {
	padding: 40px;
	font-size: 20px;
	width: 300px;
	text-align: center;
	color: green;
	margin: auto;
}
</style>
</head>
<body>
	<h1>${message}</h1>
	<form action="${pageContext.request.contextPath}/addVote.aspx"
		method="post">
		<fieldset>
			<marquee style="font-style: oblique; color: red;">Give vote
				now</marquee>
			<legend>Add vote </legend>
			<table align="center">
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>State :</td>
					<td><input type="text" name="state"></td>
				</tr>
				<tr>
					<td>Dist :</td>
					<td><input type="text" name="dist"></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>Voter Type :</td>
					<td><select name="voterType">
							<option value="BJP">BJP</option>
							<option value="BJD">BJD</option>
							<option value="CONGRESS">CONGRESS</option>
					</select></td>
				</tr>
				<tr>
					<td>Candidate Sign :</td>
					<td><input type="text" name="candidatesSign"></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td>Male<input type="radio" name="gender" value="male">Female<input
						type="radio" name="gender" value="female"></td>
				</tr>
			</table>
			<center>
				<input type="submit" value="VOTE-NOW">
			</center>
		</fieldset>
	</form>
	<br>
	<br>
	<form action="${pageContext.request.contextPath}/getStatus.aspx">
		<fieldset id="below">
			<legend>Check your status now</legend>
			<p style="color: red;">
				<b>${error_msg}</b>
			</p>
			<table align="center">
				<tr>
					<td>VoterId :</td>
					<td><input type="text" name="voterId"
						placeholder="Enter your UniqueId" required></td>
				</tr>
			</table>
			<center>
				<input type="submit" value="STATUS">
			</center>
			<table align="center" style="text-align: center;">
				<tr style="color: blue;">
					<td style="padding-right: 10px"><a class="two"
						href="${pageContext.request.contextPath}/getActivity.aspx?voterType=BJP">BJP</a></td>
					<td style="padding-right: 10px"><a class="two"
						href="${pageContext.request.contextPath}/getActivity.aspx?voterType=BJD">BJD</a></td>
					<td style="padding-right: 10px"><a class="two"
						href="${pageContext.request.contextPath}/getActivity.aspx?voterType=CONGRESS">CONGRESS</a></td>
				</tr>
			</table>
		</fieldset>
	</form>
	<table align="center" border="2"
		style="text-align: center; border: 2; caption-side: top; padding: 2px; position: static;">
		<tr>
			<td>Count :<input type="range" min="0" max="10"
				value="${count}"><b style="color: gray;">${count}</b></td>
		</tr>
		<tr>
			<th>NAME</th>
			<th>STATE</th>
			<th>DIST</th>
			<th>AGE</th>
			<th>GENDER</th>
			<th>VOTER_TYPE</th>
			<th>SIGN</th>
		</tr>
		<c:forEach items="${user}" var="user">
			<tr>
				<td>${user.name}</td>
				<td>${user.state}</td>
				<td>${user.dist}</td>
				<td>${user.age}</td>
				<td>${user.gender}</td>
				<td>${user.voterType}</td>
				<td>${user.candidatesSign}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>