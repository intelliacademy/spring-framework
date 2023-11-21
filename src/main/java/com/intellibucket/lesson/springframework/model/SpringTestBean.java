package com.intellibucket.lesson.springframework.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SpringTestBean {
    private String name;
    private Integer integer;
    private int[] intArray;
    private Person person;
    private List<String> stringList;
    private Set<String> stringSet;
    private Map<String, String> stringMap;

    @Override
    public String toString() {
        return "SpringTestBean{" +
                "name='" + name + '\'' +
                ", integer=" + integer +
                ", intArray=" + Arrays.toString(intArray) +
                ", person=" + person +
                ", stringList=" + stringList +
                ", stringSet=" + stringSet +
                ", stringMap=" + stringMap +
                '}';
    }
}
