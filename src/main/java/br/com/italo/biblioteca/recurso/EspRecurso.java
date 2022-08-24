package br.com.italo.biblioteca.recurso;


import br.com.italo.biblioteca.dominio.Informacoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/esp")
public class EspRecurso {

    private static Informacoes informacoesAtuais = new Informacoes(0.0, "Sem info",
            "Sem info");


    @GetMapping(value = "/buscar-informacoes")
    public ResponseEntity<Informacoes> buscaInfo(){
        return ResponseEntity.status(HttpStatus.OK).body(informacoesAtuais);
    }

    @PostMapping(value = "/inserir-informacoes")
    public ResponseEntity<String> informacoesSensor(@RequestBody Informacoes informacoes){
        informacoesAtuais = informacoes;
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }





}
