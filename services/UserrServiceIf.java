package com.capgemini.coronavirustracker.services;

import java.util.List;

import com.capgemini.coronavirustracker.models.Userr;

public interface UserrServiceIf {
    public Userr SaveUserDetails(Userr user);
    public Userr fetchUserByemailIdAndPassword(Userr user);
    public Userr fetchById(int id);
    public List<Userr> fetchAllUser();
  

}
