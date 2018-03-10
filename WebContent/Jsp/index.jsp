<jsp:useBean id="obj" class="bean.val"/>
<%  
String m=obj.name(5);  
out.println("value is "+m); 
 out.println("sql"+obj.getsql());
%>