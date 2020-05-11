package com.lopezmiguelangel.springboot.basics.example;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

 
@Entity
 
public class Imparticion {
    @Id
    private Integer id;
    private String titulo;
    @ManyToOne
    @JoinColumn(name="nombre_experto")
    private Experto experto;

    public Imparticion() {
        super();
    }
 
    public Imparticion(Integer id, String titulo, Experto experto) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.experto = experto;
    }
 
    public Experto getExperto() {
        return experto;
    }
 
    public void setExperto(Experto experto) {
        this.experto = experto;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
