package com.lopezmiguelangel.springboot.basics.example;

import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;


@Entity
@NamedEntityGraph(
name = "ExpertoConImparticiones", attributeNodes = {
@NamedAttributeNode("imparticiones"),
})
public class Experto {
    @Id
    private String nombre;
     
    @OneToMany(mappedBy="experto")
    private List<Imparticion> imparticiones= new ArrayList<Imparticion>();
     
    public List<Imparticion> getImparticiones() {
        return imparticiones;
    }
 
    public void setImparticiones(List<Imparticion> imparticiones) {
        this.imparticiones = imparticiones;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public Experto(String nombre) {
        super();
        this.nombre = nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addImparticion(Imparticion i) {
        imparticiones.add(i);
    }
 
    public Experto() {
        super();
    }
}