package Clase1.SpringEducacionitPractice.Entity;

import Clase1.SpringEducacionitPractice.Interface.UserContact;
import org.springframework.stereotype.Service;

@Service("UserContact")
public class UserContactDiscord implements UserContact {
    @Override
    public String getUserContact(){
        return "User contact by discord:";
    }
}
