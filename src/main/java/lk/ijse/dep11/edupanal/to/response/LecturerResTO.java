package lk.ijse.dep11.edupanal.to.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.N;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LecturerResTO {
    private Integer id;
    private String name;
    private String designation;
    private String qualifications;
    private String type;
    private String pictureUrl;
    private String linkedin;

}
