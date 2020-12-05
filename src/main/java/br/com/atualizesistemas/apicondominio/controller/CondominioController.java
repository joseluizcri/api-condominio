package br.com.atualizesistemas.apicondominio.controller;

import br.com.atualizesistemas.apicondominio.models.Condominio;
import br.com.atualizesistemas.apicondominio.repositories.CondominioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CondominioController {

    @Autowired
    private CondominioRepository repository;

    @GetMapping("/create")
    public ResponseEntity createCondominio(){
        Condominio condominio = new Condominio();
        condominio.setDescricao("Condominio");
        return ResponseEntity.ok(repository.save(condominio));
    }

    @GetMapping("/list")
    public ResponseEntity list() {
        return ResponseEntity.ok(repository.findAll());
    }
}
