
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.beans.Machine;
import ma.school.beans.Marque;
import ma.school.util.HibernateUtil;
import ma.school.service.EtudiantService;
import ma.school.service.MachineService;
import ma.school.service.MarqueService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leblond
 */
public class Test {
    public static void main(String[] args) {
        EtudiantService es = new EtudiantService();
        MachineService ms = new MachineService();
        MarqueService mms= new MarqueService();
        es.create(new Etudiant("Eskandar", "Oumaima", "El jadida", new Date(), "femme"));
        es.create(new Etudiant("Ess", "Manal", "Casa", new Date(), "femme"));
         es.create(new Etudiant("Lagnidi", "Amina", "Azzemour", new Date(), "femme"));
          
        ms.create(new Machine("L", new Date(), 5000));
        ms.create(new Machine("H", new Date(), 5400));
        ms.create(new Machine("T", new Date(), 5010));
        
        mms.create(new Marque("ll","lenovo"));
        mms.create(new Marque("tt","toshiba"));
        mms.create(new Marque("hh","hp"));
       
         
        for(Etudiant e : es.findAll())
            System.out.println(e.getId()+" "+e.getNom()+" "+e.getPrenom()+" "+e.getVille()+e.getDateNaissance()+" "+e.getSexe());
        for( Machine m: ms.findAll())
            System.out.println(m.getId()+" "+m.getReference()+" "+m.getDateAchat()+" "+m.getPrix());
        for( Marque a: mms.findAll())
            System.out.println(a.getId()+" "+a.getCode()+" "+a.getLibelle());
    }
}
