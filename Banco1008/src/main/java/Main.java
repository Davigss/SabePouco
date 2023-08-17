import entity.Endereco;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[]args){
        Pessoa p1 = new Pessoa("Fernado", "Fritas","Fernando.Federal@yahoo.com", new Endereco("Av. Padre Arlindo Cruz", "São Paulo"));
        Pessoa p2 = new Pessoa("Giovanni", "BaniBani","bombadao@hotmail.com", new Endereco("Rua Indio Geek", "Porto Feliz"));
        Pessoa p3 = new Pessoa("Gabrielson", "Rochedo","RoRokkj@outlook.com", new Endereco("Rua Xiró", "São Paulo") );
        Pessoa p4 = new Pessoa("Zorzettão", "Mamadissimo","Topgun@gmail.com", new Endereco("Av. Pedro Vicente", "São Paulo"));
        Pessoa p5 = new Pessoa("Davi", "Gomes","davigsousa13@gmail.com",new Endereco("Rua das Graças", "São Bernardo do Campo"));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from pessoa", Pessoa.class).list();
        pessoas.forEach(p -> System.out.println(p.toString()));


        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction1 = session1.beginTransaction();

        transaction1.commit();

        List<Endereco> enderecos = session1.createQuery("from endereco", Endereco.class).list();
        enderecos.forEach(p -> System.out.println(p.toString()));
    }
}
