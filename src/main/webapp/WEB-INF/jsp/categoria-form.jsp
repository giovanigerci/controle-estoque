<!DOCTYPE html>
<html>
<head>
    <title>Cadastrar Categoria</title>
</head>
<body>
    <h2>Cadastrar Categoria</h2>
    <form action="categoria" method="post">
        Nome: <input type="text" name="nome" required><br>
        Tamanho:
        <select name="tamanho">
            <option value="PEQUENO">Pequeno</option>
            <option value="MEDIO">Médio</option>
            <option value="GRANDE">Grande</option>
        </select><br>
        Embalagem:
        <select name="embalagem">
            <option value="LATA">Lata</option>
            <option value="VIDRO">Vidro</option>
            <option value="PLASTICO">Plástico</option>
        </select><br>
        <button type="submit">Salvar</button>
    </form>
</body>
</html>
