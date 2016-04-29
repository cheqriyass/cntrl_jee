<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<a href="../../index.jsp">Acceuil</a><br/><br/>


<h1>Editeur Ajouter avec succes</h1>
<table>
    <tr>
        <td>Nom domaine</td>
        <td><bean:write name="editeurForm" property="nomDomaine"/></td>
    </tr>

    <tr>
        <td>Index</td>
        <td><bean:write name="editeurForm" property="indexAlexa"/></td>
    </tr>

    <tr>
        <td>Visiteur par mois</td>
        <td><bean:write name="editeurForm" property="visiteursParMois"/></td>
    </tr>

    <tr>
        <td>prix Par Jour</td>
        <td><bean:write name="editeurForm" property="prixParJour"/></td>
    </tr>

    <tr>
        <td>email</td>
        <td><bean:write name="editeurForm" property="emailRespo"/></td>
    </tr>
</table>

</body>
</html>
