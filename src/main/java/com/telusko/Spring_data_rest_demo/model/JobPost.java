package com.telusko.Spring_data_rest_demo.model;


import java.util.List;



import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {
    @Id
    private int postId;
    private String postProfile; 
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    @Override
    public String toString() {
        return "JobPost [postId=" + postId + ", postProfile=" + postProfile + ", postDesc=" + postDesc
                + ", reqExperience=" + reqExperience + ", postTechStack=" + postTechStack + "]";
    }

}
