package com.opticsolutions.courseApi.course;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ApiModel("This the courses Structure")
public class Course {
    @ApiModelProperty("Unique id that identifies every course")
    @Id
    String id;
    @ApiModelProperty("This is the name of the course")
    String name;
    @ApiModelProperty("This is small description about  the course")
    String description;
}
