package com.moodle.auth.userkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @Autowired
    private LoginService loginService;

    @GetMapping("/Moodle/Login/{email}")
    public ResponseEntity<?> moodlelogin(@PathVariable String email){
        String url;
        try {
            url = loginService.moodleloginByEmail(email);
            if(url == null)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok(url);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }
    
}
