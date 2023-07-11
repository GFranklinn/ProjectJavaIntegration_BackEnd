package com.java.projectintegration.resources;

import com.java.projectintegration.model.EntityLine;
import com.java.projectintegration.repository.EntityLineRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "API Linhas")
@CrossOrigin(origins = "*")
@RequestMapping(value = "/project-api")
public class EntityLineResource {

    @Autowired
    EntityLineRepository entityLineRepository;

    @GetMapping("/linha")
    @ApiOperation(value = "Lista com as linhas de medidores")
    public List<EntityLine> getList() {
        return entityLineRepository.findAll();
    }

    @PostMapping("/linha")
    @ApiOperation(value = "Salva somente uma linha")
    public EntityLine save(@RequestBody EntityLine entityLine) {
        return entityLineRepository.save(entityLine);
    }

    @PutMapping("/linha")
    @ApiOperation(value = "Atualiza somente uma linha")
    public EntityLine update(@RequestBody EntityLine entityLine) {
        return entityLineRepository.save(entityLine);
    }

    @DeleteMapping("/linha")
    @ApiOperation(value = "Deleta somente uma linha")
    public void delete(@RequestBody EntityLine entityLine) {
        entityLineRepository.delete(entityLine);
    }




}