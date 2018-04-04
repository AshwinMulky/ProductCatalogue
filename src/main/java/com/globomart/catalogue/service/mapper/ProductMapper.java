package com.globomart.catalogue.service.mapper;

import com.globomart.catalogue.domain.*;
import com.globomart.catalogue.service.dto.ProductDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Product and its DTO ProductDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {


}
