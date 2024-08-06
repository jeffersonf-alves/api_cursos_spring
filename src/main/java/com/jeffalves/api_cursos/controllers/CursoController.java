package com.jeffalves.api_cursos.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @PostMapping("/save")
    public String saveCurso() {
        return "Funcionando!!";
    }


}
