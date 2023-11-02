import lombok.*;

import java.io.Serializable;

@Getter @Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    private String name;
    private Boolean isActive;
    private String email;
}
