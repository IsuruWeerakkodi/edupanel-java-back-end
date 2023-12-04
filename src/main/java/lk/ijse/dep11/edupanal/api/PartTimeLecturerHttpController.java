package lk.ijse.dep11.edupanal.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers/part-time")
@CrossOrigin
public class PartTimeLecturerHttpController {

    @PatchMapping("/ranks")
    public void arrangePartTimeLecturersOrder(){
        System.out.println("arrangeFullTimeLecturersOrder()");
    }

    @GetMapping
    public void getAllPartTimeLecturers(){
        System.out.println("getAllFullTimeLecturers()");
    }
}
