package com.hussein.chatme.models;

import java.io.Serializable;

//To display user list from fireStore database
public class User implements Serializable {
    public String name,image,email,token;
}
