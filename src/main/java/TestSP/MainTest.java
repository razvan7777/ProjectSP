package TestSP;


import com.example.projectsp.ToCVisitor;
import com.example.projectsp.models.Author;
import com.example.projectsp.models.Book;
import com.example.projectsp.models.Paragraph;
import com.example.projectsp.models.Section;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainTest {

    public static void main(String[] args) {



        Firma a = new Firma("Nokia");
        Departament departament = new Departament("5G");
        departament.add(new Manager("Sefu", 10000));
        departament.add(new Programator("CelBun", 15000));
        departament.add(new Programator("CelNeBun", 4500));
        departament.add(new Tester("DoarTestez", 12000));
        a.add(departament);
        VisitorTest calculSalar = new VisitorSalar();
        a.accept(calculSalar);
        calculSalar.print();






    }


    }


