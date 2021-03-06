package com.tutorial.springboot.Domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Data
public class BlogInformation {
    private List<items> item;
    private DateTimeFormat lastBuild;
    private Integer total;
    private Integer start;
    private Integer display;

    @Data
    public class items{
        private String title;
        private String link;
        private String description;
        private DateTimeFormat postdate;
    }

}
