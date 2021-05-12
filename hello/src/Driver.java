import java.util.LinkedList;
import java.util.Scanner;
public class Driver
{
    public static Specimen[] Database = new Specimen[10];
    public static LinkedList makeList(Specimen[] animals)
    {
        LinkedList<Specimen> Animals = new LinkedList<>();
        for(Specimen i : animals)
        {
            Animals.add(i);
        }
        return Animals;
    }
    public static int countSpecimen(Specimen[] Array)
    {
        int count = 0;
        for (Specimen i : Array)
        {
            if(i == null) {
                continue;
            }
            else
            {
                count += 1;
            }
        }
        return count;
    }

    public static LinkedList<Specimen> makeSpeciesList(LinkedList<Specimen> animals)
    {
        LinkedList<Specimen> SpeciesList = new LinkedList<>();
        for(int i = 0 ; i <= animals.size() ; i++)
        {
          SpeciesList.add(animals.get(i));
        }
        return SpeciesList;
    }

    public static LinkedList<Specimen> makeSpeciesListUnique(LinkedList<Specimen> animals)
    {
        LinkedList<Specimen> SpeciesListUnique = new LinkedList<>();
        for(Specimen i: animals)
        {
            if(SpeciesListUnique.contains(i.getTOA()) == true)
            {continue;}
            else
                {
                SpeciesListUnique.add(i);
            }
        }
        return SpeciesListUnique;
    }



    public static void main(String[] args)
    {
        Genus Animalia = new Genus("Animalia");
        species Fish = new species("Fish","Animalia");
        species Birds = new species("Birds", "Animalia");
        species Mammals = new species("Mammals","Animalia");
        Specimen Shark = new Specimen("Shark",001,Fish);
        Specimen Lion = new Specimen("Lion",002, Mammals);
        Specimen Hummingbird = new Specimen("Hummingbird",003, Birds);
        Specimen Eleplant= new Specimen("Elephant", 004, Mammals);
        Database[0] = Shark;
        Database[1] = Lion;
        Database[2] = Hummingbird;
        System.out.println(countSpecimen(Database));
        LinkedList<Specimen> newList = makeList(Database);
        for(Specimen i : newList)
        {
            if(i == null)
            {continue;}
            else
            {
                System.out.println(i.getName());
            }
        }
        LinkedList<Specimen> newList1 = makeSpeciesList(newList);
        LinkedList<Specimen> newList2 = makeSpeciesListUnique(newList);
    }
}
