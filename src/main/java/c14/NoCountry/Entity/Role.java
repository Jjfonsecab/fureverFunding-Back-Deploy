package c14.NoCountry.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public enum Role {
    ADMIN,
    CREATOR,
    DONOR
}
