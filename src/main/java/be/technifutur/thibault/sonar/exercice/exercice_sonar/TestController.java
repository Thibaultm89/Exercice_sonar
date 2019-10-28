package be.technifutur.thibault.sonar.exercice.exercice_sonar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

//@Log4j2

@RestController
@SessionAttributes("hello")
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);



    @RequestMapping(method = GET)
    private String tester() {
        if (false){
            System.out.println("hello");
        }


        List<String> List = new ArrayList<String>();
        List.remove("Hello");

        return "ça marche !";


    }



    @Transactional
    public String InUtule(){
        return " ";
    }

    public Boolean AnePasFaire(){
        return null;
    }
}

