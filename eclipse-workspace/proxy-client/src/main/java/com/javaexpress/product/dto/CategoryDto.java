package com.javaexpress.product.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDto {

	private int categoryId;
	
	private String categoryTitle;
	
	private Set<CategoryDto> subCategoriesDto;
	
	
	@JsonProperty("parentCategory")
	private CategoryDto parentCategoryDto;
	
	private Set<ProductDto> productDto;

		
	}

	
	
	
	



