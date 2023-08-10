import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[]args){
        Pessoa p1 = new Pessoa("Fernado", "Fritas","Fernando.Federal@yahoo.com");
        Pessoa p2 = new Pessoa("Giovanni", "BaniBani","bombadao@hotmail.com");
        Pessoa p3 = new Pessoa("Gabrielson", "Rochedo","RoRokkj@outlook.com");
        Pessoa p4 = new Pessoa("Zorzettão", "Mamadissimo","Topgun@gmail.com");
        Pessoa p5 = new Pessoa("Davi", "Gomes","davigsousa13@gmail.com");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);


        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();
        pessoas.forEach(p -> System.out.println(p.toString()));

    }
}
