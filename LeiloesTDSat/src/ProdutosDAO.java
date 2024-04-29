/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class ProdutosDAO {

    Connection conn;
    PreparedStatement prep;
    ResultSet rs;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();

    public void cadastrarProduto(ProdutosDTO produto) {

        String sql = "insert into produtos (nome, valor, condicao) value(?,?,?)";
        conn = new conectaDAO().connectDB();
        try {
            prep = conn.prepareStatement(sql);
            prep.setString(1, produto.getNome());
            prep.setFloat(2, produto.getValor());
            prep.setString(3, produto.getCondicao());

            prep.execute();
            prep.close(); //Fecha conexao

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na calsse cadastrarProdutoDAO" + erro.getMessage());
        }
    }



public ArrayList<ProdutosDTO> listarProdutos(){
        
        /*String sql = "Select * from produtos";
        conn = new conectaDAO().connectDB();

        try {

            prep = conn.prepareStatement(sql);
            rs = prep.executeQuery();

            while (rs.next()) {
                ProdutosDTO produto = new ProdutosDTO();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getFloat("valor"));
                produto.setCondicao(rs.getString("condicao"));

                listagem.add(produto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe CategoriaDAO em pasquisarCategoria" + erro.getMessage());
        }*/
            
        return listagem;
    }
}
