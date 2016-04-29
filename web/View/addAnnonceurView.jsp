<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter Editeur</title>
</head>
<body>
<a href="../../index.jsp">Acceuil</a><br/><br/>

<h1>Ajouter un nouveau annonceur</h1>

<html:form action="/addAnnonceur" method="post">

    <table>
        <tr>
            <td>Societe</td>
            <td><html:text property="societe"></html:text></td>
            <td><html:errors property="societe"></html:errors></td>

        </tr>

        <tr>
            <td>Raison Sociale</td>
            <td><html:text property="raisonSociale"></html:text></td>
            <td><html:errors property="raisonSociale"></html:errors></td>
        </tr>

        <tr>
            <td>Adresse de fac</td>
            <td><html:text property="adresse"></html:text></td>
            <td><html:errors property="adresse"></html:errors></td>
        </tr>

        <tr>
            <td>Tele</td>
            <td><html:text property="tele"></html:text></td>
            <td><html:errors property="tele"></html:errors></td>
        </tr>


    </table>
    <html:submit value="enregistrer"/>
</html:form>

</body>
</html>
