package com.example.storepractice.presentation.Request.Dto;

import com.example.storepractice.domain.Entity.Product;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDto {


  private String name;
  private String description;
  private int stock;
  private double price;
  private boolean isActive;
  private boolean isDeleted;
  //relacion
  private UUID categoryId;

  public boolean getActive(){
    return isActive;
  }
}


