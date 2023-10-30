<%-- 
    Document   : Machienebyreference
    Created on : Oct 27, 2023, 9:18:55 PM
    Author     : LENOVO
--%>

<%@page import="ma.school.service.MachineService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
        <link href="style/csslocal.css" rel="stylesheet" type="text/css"/>
        <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="script/Machinebyreference.js" type="text/javascript"></script>

    </head>
    <body>
        <%@include file="template/header.jsp" %>
        <%@include file="template/menu.jsp" %>
        <div class="content">
            <form method="GET" action="Machinebyreference">
                <fieldset>
                    <legend>Selectionnez la reference</legend>
                    <table border="0">

                        <tr>
                            <td>Reference</td>
                            <td>
                                <select id="reference" name="reference">
                                    <option value="0">Choisir une reference</option>
                                    <%
                                        Machine ms = new Machine();
                                        for (reference m : ms.findAll()) {
                                    %>
                                    <option value="<%=m.getId()%>"><%=m.getReference()%></option>
                                    <%}%>
                                </select>
                            </td>
                        </tr>


                    </table>
                </fieldset>
            </form>
            <%
                MachineService mms = new MachineService();
            %>
            <fieldset>
                <legend>Liste des Machines</legend>

                <table border="1" class="tab">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Reference <br>
                                <input id="f" type="text" name="f" value="" /></th>
                            <th>Prix</th>
                            <th>Marque</th>
                            <th>Date d'achat</th>

                            <th>Supprimer</th>
                            <th>Modifier</th>
                        </tr>
                    </thead>
                    <tbody  id='body'>
                        
                       
                    </tbody>
                </table>

            </fieldset>
        </form>            
</body>
</html>

