<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter Editeur</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
</head>
<body>

<a href="../../index.jsp">Acceuil</a><br/><br/>

<h1>Ajouter un nouveau Editeur</h1>

<html:form action="/addEditeur" method="post">

    <table>
        <tr>
            <td>Nom domaine</td>
            <td><html:text property="nomDomaine" ></html:text></td>
            <td><html:errors property="nomDomaine"></html:errors></td>

        </tr>

        <tr>
            <td>Index</td>
            <td><html:text property="indexAlexa"></html:text></td>
            <td><html:errors property="indexAlexa"></html:errors></td>
        </tr>

        <tr>
            <td>Visiteur par mois</td>
            <td><html:text property="visiteursParMois"></html:text></td>
            <td><html:errors property="visiteursParMois"></html:errors></td>
        </tr>

        <tr>
            <td>prix Par Jour</td>
            <td><html:text property="prixParJour"></html:text></td>
            <td><html:errors property="prixParJour"></html:errors></td>
        </tr>

        <tr>
            <td>email</td>
            <td><html:text property="emailRespo"></html:text></td>
            <td><html:errors property="emailRespo"></html:errors></td>
        </tr>

    </table>
    <html:submit value="enregistrer"/>
</html:form>

</body>
</html>
