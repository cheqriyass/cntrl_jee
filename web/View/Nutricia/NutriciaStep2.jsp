<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nutricia step 1</title>
</head>
<body>

<html:form action="/step2" method="post">

    <table>

        <tr>
            <td>Sex</td>
            <td>
                <html:radio property="sex" value="Homme" disabled="true">H</html:radio>
                <html:radio property="sex" value="Femme" disabled="true">F</html:radio>
            </td>
        </tr>

        <tr>
            <td>Taille</td>
            <td><html:text property="taille" disabled="true"></html:text></td>
        </tr>

        <tr>
            <td>Poid</td>
            <td><html:text property="poid" disabled="true"></html:text></td>
        </tr>


        <tr>
            <td>Tele</td>
            <td><html:text property="tele"></html:text></td>
            <td><html:errors property="tele"></html:errors></td>
        </tr>

        <tr>
            <td>Adresse</td>
            <td><html:text property="adresse"></html:text></td>
            <td><html:errors property="adresse"></html:errors></td>
        </tr>

    </table>
    <html:hidden property="step" value="2"></html:hidden>
    <html:submit value="Je valide" property="btnstep2"/>
</html:form>

</body>
</html>