package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    // User : Post -> 1 : (0~N)
    @ManyToOne(fetch = LAZY)
    @JsonIgnore // 외부에 데이터를 공개하지 않기 위함
    private User user;

}
