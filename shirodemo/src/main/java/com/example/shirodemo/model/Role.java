package com.example.shirodemo.model;

import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Role {

    private Integer rid;
    private String rname;
    private Set<Module> modules = new HashSet<Module>();
    private Set<User> users = new HashSet<User>();
}
