package c14.NoCountry.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostUpdateResponse {
    private Integer id;
    private String name;
    private String data;
    private String image;
}
