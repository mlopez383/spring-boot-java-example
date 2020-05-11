package com.lopezmiguelangel.springboot.basics.example;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpertoController {
	@Autowired
	private ExpertoJpaRepository expertoService;
	
	@Autowired
	private ImparticionJpaRepository imparticionService;
	
    @GetMapping("/experto")
	public void test() throws Exception{
        
    	 List<Experto> lista = expertoService.findAll();
  
         for (Experto e : lista) {
             System.out.println(e.getNombre());
             for (Imparticion i : e.getImparticiones()) {
                 System.out.println(i.getTitulo());
             }
         }
        
         
         List<Imparticion> books = imparticionService.findAll();
         books.forEach(b -> System.out.println(
             String.format("%s, %s", b.getTitulo(), b.getExperto().getNombre())
         ));
         
	}
}