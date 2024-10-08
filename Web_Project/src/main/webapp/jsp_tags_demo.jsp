<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

     <body>
     <%------Including resource:index.html --%>
     <%@ include file = "index.html" %>
     <h2>Welcome to demonstration of JSP Tags</h2>
     
     
     <%-----Declaring Some Variable, defining some method --%>
     <%!
     int num = 7;
     public String sayGreeting(String name)
     {
    	 return "Hello" + name.toUpperCase();
     }
 
     %>
     
     
     <%----Using the variable and method through expression --%>
     <h2>Value of variable : num is <%=num %></h2>
     <h2>Square of <%=num %> is <%=(num * num)%> </h2>
     <h2> Is <%=num %> greater than 3 ? <%=(num>3) %></h2>
     
     
     <%-------Invoking method sayGreeting --%>
     <h2><%= sayGreeting(" Pushpa") %></h2>
     
     
     <%----Displaying message WELCOME 5 times using H2 heading style with
      help of for loop through  Scriptlet --%>
     <%
     for(int a = 1; a<=5;a++){
    	
      %>
      <h2>WELCOME</h2>
      <%
     }
      %>
     
     
     <%-- Showing Today's Date using LocalDate Class from java.time package--%>
     <%
     LocalDate today = LocalDate.now();
     %>
     <h2>Today is <%=today %></h2>

     </body>
</html>