<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nutricia step 1</title>
</head>
<body onload="check()">

<html:form action="/step1" method="post">

    <table>

        <tr>
            <td>Sex</td>
            <td>
                <html:radio property="sex" value="Homme" styleId="sex">H</html:radio>
                <html:radio property="sex" value="Femme">F</html:radio>
            </td>
            <td><html:errors property="sex"></html:errors></td>
        </tr>

        <tr>
            <td>Taille</td>
            <td><html:text property="taille"></html:text></td>
            <td><html:errors property="taille"></html:errors></td>

        </tr>



        <tr>
            <td>Poid</td>
            <td><html:text property="poid"></html:text></td>
            <td><html:errors property="poid"></html:errors></td>
        </tr>

    </table>
    <html:hidden property="step" value="1"></html:hidden>
    <html:submit value="je commence" property="btnstep1"/>
</html:form>

<script>
    function check() {
        document.getElementById("sex").checked = true;
    }
</script>

</body>
</html>
