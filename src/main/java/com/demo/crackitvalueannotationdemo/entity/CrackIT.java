package com.demo.crackitvalueannotationdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class CrackIT extends BaseEntity{
    @Id
    private Integer id;

    @NotNull(message = "Please enter a valid name")
    private String name;

    @NotBlank
    private String playListName;

    @Min(100)
    private Integer views;
}
