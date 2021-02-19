package com.micro.demo.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

//import javax.validation.contrainsts.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Demo implements AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    @NotNull
    @Column (nullable = false)
    private String title;


}
