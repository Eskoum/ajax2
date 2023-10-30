/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.school.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ma.school.beans.Machine;
import ma.school.beans.Marque;
import ma.school.dao.IDao;
import ma.school.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author a
 */
public class MachineService implements IDao<Machine>{

    @Override
    public void create(Machine o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(o);
        session.getTransaction().commit();
        session.close();                
    }

    @Override
    public void update(Machine o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.update(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Machine o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Machine> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Machine> etds = session.createQuery("from Machine").list();
        session.getTransaction().commit();
        session.close();
        return etds;

    }

    @Override
    public Machine findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        Machine e = (Machine) session.get(Machine.class, id);
        session.getTransaction().commit();
        session.close();
        return e;
    }
    
    
    public List<Machine> findByMarque(Marque marque) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Machine> etds = session.getNamedQuery("findByMarque").setParameter("marque", marque).list();
        session.getTransaction().commit();
        session.close();
        return etds;

    }
    public List<Machine> filterByReference(String reference) {
    List<Machine> allMachines = getAllMachines(); // Supposons que vous avez une méthode pour obtenir toutes les machines

    List<Machine> filteredMachines = new ArrayList<>();

    for (Machine machine : allMachines) {
        if (machine.getReference() != null && machine.getReference().equals(reference)) {
            // Si la référence de la machine correspond à la référence saisie, ajoutez-la à la liste filtrée
            filteredMachines.add(machine);
        }
    }

    return filteredMachines;
}
    public List<Machine> getAllMachines() {
    // Supposons que vous ayez une liste (ou une source de données) de toutes les machines
    // Vous devez remplacer cela par votre propre logique d'accès aux données
    List<Machine> machines = new ArrayList<>();
    
    // Exemple : Ajouter quelques machines à la liste
    machines.add(new Machine("ll", new Date(), 5000));
    machines.add(new Machine("l7", new Date(), 4000));
            machines.add(new Machine("ol", new Date(), 5800));
   
    return machines;
}
    
}


