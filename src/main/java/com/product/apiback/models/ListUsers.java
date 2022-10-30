package com.product.apiback.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.product.apiback.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListUsers {

    @JsonProperty("users")
    @ElementCollection
    private List<UserEntity> usersList;
}
