package com.klu;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class app {
    public static void main(String[] args) {
        // CREATE
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Student s1 = new Student(104, "Krishna", "ECE");
        session.save(s1);
        tx.commit();
        session.close();
        System.out.println("Student Inserted");
        // READ
        session = HibernateUtil.getSessionFactory().openSession();
        Student s = session.get(Student.class, 101);
        System.out.println(s.getName() + " " + s.getDept());
        session.close();
        // UPDATE
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        s.setDept("AI & DS");
        session.update(s);
        tx.commit();
        session.close();
        System.out.println("Student Updated");
        // DELETE
//        session = HibernateUtil.getSessionFactory().openSession();
//        tx = session.beginTransaction();
//        session.delete(s);
//        tx.commit();
//        session.close();
//        System.out.println("Student Deleted");
    }}
