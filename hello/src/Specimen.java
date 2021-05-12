public class Specimen
{
        private String name;
        private int cageNumber;
        private species toa; // "Type Of Animal"
        public Specimen( String a, int c, species s)
        {
            setName(a);
            setCage(c);
            setTOA(s);

        }
        public void setName(String a){ name = a; }
        public void setCage(int c){ cageNumber = c; }
        public void setTOA(species s){ toa = s; }
        public String getName(){ return name; }
        public int getCage(){ return cageNumber; }
        public species getTOA(){ return toa; }
        public String toString()
        {
            return name + " is a " + toa + " in cage " + cageNumber;
        }

}
