/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalStaff.getValue())){
            organization = new HospitalStaffOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Territory.getValue())){
            organization = new TerritoryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AmbulanceDriver.getValue())){
            organization = new AmbulanceDriverOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DoctorDepartment.getValue())){
            organization = new DoctorDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DrugManufacturer.getValue())){
            organization = new DrugManufacturerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}