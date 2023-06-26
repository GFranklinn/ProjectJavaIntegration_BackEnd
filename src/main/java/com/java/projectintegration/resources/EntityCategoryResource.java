package com.java.projectintegration.resources;

import com.java.projectintegration.model.EntityCategory;
import com.java.projectintegration.model.EntityLine;
import com.java.projectintegration.repository.EntityCategoryRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/project-api")
@Api(value = "API REST Categorias")
@CrossOrigin(origins = "*")
public class EntityCategoryResource {

    @Autowired
    EntityCategoryRepository entityCategoryRepository;

    @GetMapping("/categorias")
    @ApiOperation(value = "Lista com as categorias de medidores")
    public List<EntityCategory> getList() {
        return entityCategoryRepository.findAll();
    }

    @GetMapping("/categorias/{id_line}")
    @ApiOperation(value = "Lista de categorias de medidores de uma linha")
    public List<EntityCategory> getListFiltered(@PathVariable(value = "id_line") EntityLine id_Line){

        return entityCategoryRepository.findCategoryByEntityLine(id_Line);
    }

    @PostMapping("/categoria")
    @ApiOperation(value = "Salva somente uma categoria")
    @Transactional
    public EntityCategory save(@RequestBody EntityCategory entityCategory) {
        return entityCategoryRepository.save(entityCategory);
    }

    @PutMapping("/categoria")
    @ApiOperation(value = "Atualiza somente uma categoria")
    @Transactional
    public EntityCategory update(@RequestBody EntityCategory entityCategory) {
        return entityCategoryRepository.save(entityCategory);
    }

    @DeleteMapping("/categoria")
    @ApiOperation(value = "Exclui somente uma categoria")
    @Transactional
    public void delete(@RequestBody EntityCategory entityCategory) {
        entityCategoryRepository.delete(entityCategory);
    }
}