<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Acceuil</title>
</head>
<body>
    <a href="View/addEditeurView.jsp" >Ajouter un editeur</a> <br/>
    <html:link href="View/addAnnonceurView.jsp" >Ajouter un Anonceur</html:link> <br/>
    <%--<a href="/loadForm.do" >Ajouter une compagne</a> <br/>--%>
    <html:link action="/loadForm" >Ajouter une compagne</html:link> <br/>
</body>
</html>
