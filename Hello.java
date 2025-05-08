import java.util.Vector;
public class Hello
{
    public static void main(String[] args) 
    {
        System.out.println("hello martina!");

        //stampo 3 volte il nome 
        for (int i = 0; i < 3; i++)
        {
            System.out.println("martina");
        }

        //stampa la mia data di nascita
        System.out.println("13/08/2007");

        //dichiaro vector
        Vector lettere = new Vector();
        lettere.add('m');
        lettere.add('a');
        lettere.add('r');
        lettere.add('t');
        lettere.add('i');
        lettere.add('n');
        lettere.add('a');

        //stampo il vector
        System.out.println (lettere);
    }
}
