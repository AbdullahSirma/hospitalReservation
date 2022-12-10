import Business.Concrete.DoctorService;
import Business.Concrete.UserService;
import DataAccess.RepositoryBase;
import Entities.Concrete.Doctor;
import Entities.Concrete.Randevu;
import Entities.Concrete.User;


import java.util.Scanner;

import static Entities.Concrete.Doctor.doctorCount;
import static Entities.Concrete.Randevu.randevuCount;
import static Entities.Concrete.User.userCount;


public class Main {
    public static void main(String[] args)
    {

        RepositoryBase repositoryBase = new RepositoryBase();
        UserService userService = new UserService();
        DoctorService doctorService = new DoctorService();
        Doctor secondDoctor = new Doctor(doctorCount,"abdullah","sirma","beyin Cerrahi","3","3");
        Doctor thirdDoctor = new Doctor(doctorCount,"Gizem","sen","Kalp Doktoru","4","4");

        repositoryBase.doctorListesi.add(secondDoctor);
        repositoryBase.doctorListesi.add(thirdDoctor);
        LoginPage loginPage = new LoginPage(repositoryBase);
        loginPage.setVisible(true);

    }

}