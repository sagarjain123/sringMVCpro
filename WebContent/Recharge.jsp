<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>MobileRecharge</h1>
<h2>${ msg } aap ka recharge plan jio ko  ${ plan }</h2>
<form action="recharge.do" method="post">
<pre>
MobileNo : <input type="text" name="mobileNO">
amount :<input type="text" name="amount">
Network Provider:<input type="text" name="networkProvider">
Plan :<input type="text" name="plan">
<input type="submit" value="proceed">  
</pre>
</form>

</body>
</htl>