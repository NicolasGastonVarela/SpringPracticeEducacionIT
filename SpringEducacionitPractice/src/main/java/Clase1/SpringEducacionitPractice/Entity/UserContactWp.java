package Clase1.SpringEducacionitPractice.Entity;

import Clase1.SpringEducacionitPractice.Interface.UserContact;

//@Service("UserContact")
public class UserContactWp implements UserContact {
    @Override
    public String getUserContact() {
        return "User contact by wp: ";
    }
}
