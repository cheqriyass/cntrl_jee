<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<a href="../../index.jsp">Acceuil</a><br/><br/>


<h1>Compagne Ajouter avec succes</h1>
<table>
    <tr>
        <td>Societe</td>
        <td><bean:write name="compagneForm" property="societe" /></td>
    </tr>

    <tr>
        <td>Editeur</td>
        <td><bean:write name="compagneForm" property="nomDomaine"/></td>
    </tr>

    <tr>
        <td>Nombre de jours</td>
        <td><bean:write name="compagneForm" property="nbrJours" /></td>
    </tr>

    <tr>
        <td>Prix Total</td>
        <td><bean:write name="compagneForm" property="prixTot" /></td>
    </tr>


</table>

</body>
</html>
