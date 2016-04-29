<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<a href="../../index.jsp">Acceuil</a><br/><br/>


<h1>Annonceur Ajouter avec succes</h1>
<table>
    <tr>
        <td>Societe</td>
        <td><bean:write name="annonceurForm" property="societe"></bean:write></td>

    </tr>

    <tr>
        <td>Raison Sociale</td>
        <td><bean:write name="annonceurForm" property="raisonSociale"></bean:write></td>
    </tr>

    <tr>
        <td>Adresse de fac</td>
        <td><bean:write name="annonceurForm" property="adresse"/></td>
    </tr>

    <tr>
        <td>Tele</td>
        <td><bean:write name="annonceurForm" property="tele"/></td>
    </tr>


</table>

</body>
</html>
