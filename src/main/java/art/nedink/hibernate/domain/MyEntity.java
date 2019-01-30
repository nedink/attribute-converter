package art.nedink.hibernate.domain;

import art.nedink.hibernate.StringToBytesConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MyEntity {

    @Id
    @GeneratedValue
    private Integer id;
    @Convert(converter = StringToBytesConverter.class)
    private String myString;
}
