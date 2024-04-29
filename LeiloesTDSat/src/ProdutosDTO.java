/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class ProdutosDTO {
    private Integer id;
    private String nome;
    private Float valor;
    private String condicao;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Float getValor() {
        return valor;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
}
