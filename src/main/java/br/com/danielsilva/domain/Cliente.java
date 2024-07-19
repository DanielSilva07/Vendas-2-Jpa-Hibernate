package br.com.danielsilva.domain;

import br.com.danielsilva.dao.Persistente;

import javax.persistence.*;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "cliente_seq")
    @SequenceGenerator( name = "cliente_seq" , sequenceName = "seq_cliente" , initialValue = 1 ,allocationSize = 1)
    private Long id;

    @Column(name = "NOME" , nullable = false ,length = 50 )
    private String nome;
    @Column(name = "CPF" , nullable = false , length = 50)
    private Long cpf;
    @Column(name = "ENDERECO" , nullable = false , length = 50)
    private String endereco;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}