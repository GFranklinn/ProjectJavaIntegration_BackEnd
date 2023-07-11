package com.java.projectintegration.resources;

import com.java.projectintegration.model.EntityCategory;
import com.java.projectintegration.model.EntityModel;
import com.java.projectintegration.repository.EntityModelRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/project-api")
@Api(value = "API REST Modelos")
@CrossOrigin(origins = "*")
public class EntityModelResource{
    @Autowired
    EntityModelRepository entitymodelRepository;

    @GetMapping("/modelos")
    @ApiOperation(value = "Lista com os modelos de medidores")
    public List<EntityModel> getList() {
        return entitymodelRepository.findAll();
    }

    @GetMapping("/modelos/{id_category}")
    @ApiOperation(value = "Lista dos modelos de medidores com somente uma categoria")
    public List<EntityModel> getfilteredList(@PathVariable(value = "id_category") EntityCategory id_category){
        return entitymodelRepository.findModelByEntityCategory(id_category);
    }

    @PostMapping("/modelo")
    @ApiOperation(value = "Salva somente uma categoria")
    @Transactional
    public EntityModel save(@RequestBody EntityModel entityModel) {
        return entitymodelRepository.save(entityModel);
    }

    @PutMapping("/modelo")
    @ApiOperation(value = "Atualiza somente uma categoria")
    @Transactional
    public EntityModel update(@RequestBody EntityModel entityModel) {
        return entitymodelRepository.save(entityModel);
    }

    @DeleteMapping("/modelo")
    @ApiOperation(value = "Exclui somente um modelo")
    @Transactional
    public void delete(@RequestBody EntityModel entityModel) {
        entitymodelRepository.delete(entityModel);
    }
}