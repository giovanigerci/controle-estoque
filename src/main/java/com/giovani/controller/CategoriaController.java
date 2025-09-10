package com.giovani.controller;

import com.giovani.config.ConnectionFactory;
import com.giovani.dao.CategoriaDAO;

import com.giovani.model.Categoria;
import com.giovani.model.enums.Tamanho;
import com.giovani.model.enums.TipoEmbalagem;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/categoria")
public class CategoriaController extends HttpServlet {
    private CategoriaDAO categoriaDAO;

    @Override
    public void init() {
        Connection connection = ConnectionFactory.getConnection();
        categoriaDAO = new CategoriaDAO(connection);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Categoria> categorias = categoriaDAO.listar();
            request.setAttribute("categorias", categorias);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/categoria-lista.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String tamanho = request.getParameter("tamanho");
        String embalagem = request.getParameter("embalagem");

        Categoria categoria = new Categoria();
        categoria.setNome(nome);
        categoria.setTamanho(Tamanho.valueOf(tamanho.toUpperCase()));
        categoria.setEmbalagem(TipoEmbalagem.valueOf(embalagem.toUpperCase()));

        try {
            categoriaDAO.inserir(categoria);
            response.sendRedirect("categoria");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
