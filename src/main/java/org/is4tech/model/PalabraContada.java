package org.is4tech.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
public class PalabraContada {
    String palabra;
    int cantidad;

    @Override
    public String toString() {
        return "{palabra: " + palabra + ", cantidad: " + cantidad + "}";
    }
}
