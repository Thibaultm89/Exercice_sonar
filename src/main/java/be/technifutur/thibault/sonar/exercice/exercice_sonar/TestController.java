package be.technifutur.thibault.sonar.exercice.exercice_sonar;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
@SessionAttributes("hello")
public class TestController {

    @RequestMapping(method = GET)
    private String tester() {
        if (false){
            System.out.println("hello");
        }
        return "ça marche !";
    }



    @Transactional
    public String intule(){
        return " ";
    }
}

