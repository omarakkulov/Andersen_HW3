package ru.akkulov.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private int id;
    private String name;
    private String customer;
    private int duration;
    private String methodology;
    private int team_id;
}
