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

        //dichiaro array statico
        char[]lettere = {'m', 'a', 'r', 't', 'i', 'n', 'a'};
        
        //stampo array
        for (int i = 0; i < lettere.length; i++)
        {
            System.out.println(lettere[i]);
        }
    }
}
