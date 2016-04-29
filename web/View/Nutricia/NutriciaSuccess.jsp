<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nutricia Success</title>
</head>
<body>


<h1>Nutricia Success</h1>

    <table>

        <tr>
            <td>Sex</td>
            <td><bean:write name="nutriciaF" property="sex" /></td>
        </tr>

        <tr>
            <td>Taille</td>
            <td><bean:write name="nutriciaF" property="taille"></bean:write></td>
        </tr>

        <tr>
            <td>Poid</td>
            <td><bean:write name="nutriciaF" property="poid" /></td>
        </tr>

        <tr>
            <td>Tele</td>
            <td><bean:write name="nutriciaF" property="tele"></bean:write></td>

        </tr>

        <tr>
            <td>Adresse</td>
            <td><bean:write name="nutriciaF" property="adresse"></bean:write></td>
        </tr>

    </table>


</body>
</html>