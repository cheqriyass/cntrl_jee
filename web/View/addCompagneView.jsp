<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter Editeur</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
</head>
<body onloadeddata="calcTotal()">
<a href="../../index.jsp">Acceuil</a><br/><br/>

<h1>Ajouter un nouveau compagne</h1>

<html:form action="/addCompagne" method="post">

    <table>
        <tr>
            <td>Societe</td>
            <td>
                <html:select property="societe">
                    <html:optionsCollection name="societeList"/>
                </html:select>
            </td>

        </tr>

        <tr>
            <td>Editeur</td>
            <td>
                <html:select property="nomDomaine" styleId="prixParJour" onchange="calcTotal()">
                    <html:optionsCollection name="domaineList"/>
                </html:select>
            </td>

            <td><html:text property="filtrePrix"/></td>
            <td><html:submit value="Filtrer par prix" onclick="submitForm('/loadForm.do')"/></td>
        </tr>

        <tr>
            <td>Nombre de jours</td>
            <td><html:text property="nbrJours" styleId="nbrJours" value="" onkeyup="calcTotal()"/></td>
        </tr>

        <tr>
            <td>Prix Total</td>
            <td><html:text property="prixTot" styleId="prixTot" value="" style="border: none; color: gray"/></td>
        </tr>


    </table>
    <html:submit value="enregistrer" onclick="submitForm('/addCompagne.do')"/>
</html:form>


<script>

    function submitForm(action) {
        var Form = document.forms[0];
        var selected = $("#prixParJour option:selected");
        var option = document.createElement("option");

        var x = selected.text();
        selected.remove();

        option.text = x;
        option.value = x;

        $('#prixParJour').append($("<option></option>").attr("value",x).text(x));

        console.log(x);
        Form.action = action;
//        Form.submit();
    }

    function calcTotal() {
        var nbrJours = document.getElementById("nbrJours");
        var prixParJour = document.getElementById("prixParJour");
        var prixTot = document.getElementById("prixTot");
        if (nbrJours.value != "")
            prixTot.value = nbrJours.value * prixParJour.value;
    }

</script>

</body>
</html>
