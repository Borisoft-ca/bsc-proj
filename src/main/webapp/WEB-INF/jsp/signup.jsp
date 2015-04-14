<%@include file="includes/header.jsp"%>

<h1><spring:message code="hello_borisoft"/></h1>
<!-- Expression ${full_name} is getting value of attribute with the key="full_name" from the Model sent by controller -->
<h2>Please Sign Up, Mr. ${full_name}</h2>

<%@include file="includes/footer.jsp"%>