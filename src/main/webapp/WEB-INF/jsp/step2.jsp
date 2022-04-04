<%@ page language="java"%>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<html>
<head>
    <title>Step 2</title>
</head>
<body>
    Step 2: <bean:write name="step2Form" property="value"/><br/>
    <html:link page="/step1">step 1</html:link>
</body>
</html>
