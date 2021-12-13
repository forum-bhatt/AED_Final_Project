package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PopulationEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.TerritoryOrganization;
import Business.Patients.Patient;
import Business.Role.PatientRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.community.Community;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
         Network boston = system.createAndAddNetwork();
         boston.setName("Boston");
         
         Enterprise hospital = boston.getEnterpriseDirectory().createAndAddEnterprise("Hospital Enterprise", Enterprise.EnterpriseType.Hospital);
         
         TerritoryOrganization territory = (TerritoryOrganization)hospital.getOrganizationDirectory().createOrganization(Organization.Type.Territory);
         Community community = territory.getCommunities().AddCommunity("Malden");
         
         Patient patient = ((HospitalEnterprise) hospital).getCityCustomers().addPatient("Siddhant Kohli");
         patient.setCommunity(community);
         patient.setAddress("Boston");
         
         UserAccount patientUser = hospital.getUserAccountDirectory().createUserAccount("sid", "123", patient, new PatientRole());
         
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
