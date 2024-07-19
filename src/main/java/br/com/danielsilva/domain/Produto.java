package br.com.danielsilva.domain;

import br.com.danielsilva.dao.Persistente;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_produto")
    @SequenceGenerator(name = "seq_produto" , sequenceName = "produto_seq", initialValue = 1 , allocationSize = 1 )
    private Long id;
    @Column(name = "DESCRIPTION" , nullable = false , length = 50)
    private String description;
    @Column(name = "CODIGO" , nullable = false , length = 30)
    private String codigo;
    @Column(name = "PRICE", nullable = false , length = 30)
    private BigDecimal price;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
