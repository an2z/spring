package hellojpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

import static lombok.AccessLevel.PROTECTED;

@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class Address {
    private String street;
    private String zipcode;
    private String city;
}
