<%@ page import="java.util.List" %>
<%@ page import="com.giovani.model.Categoria" %>
<%
    List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Categorias</title>
</head>
<body>
    <h2>Lista de Categorias</h2>
    <a href="categoria-form.jsp">Nova Categoria</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Tamanho</th>
            <th>Embalagem</th>
        </tr>
        <% for(Categoria c : categorias) { %>
        <tr>
            <td><%= c.getId() %></td>
            <td><%= c.getNome() %></td>
            <td><%= c.getTamanho() %></td>
            <td><%= c.getEmbalagem() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
