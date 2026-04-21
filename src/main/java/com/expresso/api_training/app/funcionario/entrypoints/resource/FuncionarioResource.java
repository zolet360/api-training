package com.expresso.api_training.app.funcionario.entrypoints.resource;

import com.expresso.api_training.commons.ResponseData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/funcionario")
public interface FuncionarioResource {

    @GetMapping("/teste")
    ResponseEntity<ResponseData> testeApi();
}
