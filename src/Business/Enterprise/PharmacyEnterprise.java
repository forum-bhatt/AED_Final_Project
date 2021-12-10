/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.PatientRole;
import Business.Role.PharmacyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class PharmacyEnterprise extends Enterprise {

    public PharmacyEnterprise(String name){
        super(name,EnterpriseType.Pharmacy);
       // this.cityPatients = new PatientDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyAdminRole());
        return roles;
    }

   
    
    

   
    
}
