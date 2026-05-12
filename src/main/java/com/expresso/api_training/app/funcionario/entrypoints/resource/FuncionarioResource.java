package com.expresso.api_training.app.funcionario.entrypoints.resource;

import com.expresso.api_training.commons.ResponseData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/funcionario")
public interface FuncionarioResource {

    @GetMapping("/teste")
    ResponseEntity<ResponseData> testeApi();

    @PostMapping
    ResponseEntity<ResponseData<FuncionarioResponse>> salvarFuncionario(@Valid @RequestBody FuncionarioRequest request);
//o que e esse annotation de "@Valid", na verdade, o que faz cada parte do parametro dessa rota?
}
