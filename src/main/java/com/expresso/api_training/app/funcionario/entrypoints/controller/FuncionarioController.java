package com.expresso.api_training.app.funcionario.entrypoints.controller;

import com.expresso.api_training.app.funcionario.entrypoints.resource.FuncionarioResource;
import com.expresso.api_training.commons.ResponseData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController implements FuncionarioResource {

    @Override
    public ResponseEntity<ResponseData> testeApi(){
        return ResponseEntity.ok(ResponseData.success(null, "Teste bem sucessedido!"));
    }
}
