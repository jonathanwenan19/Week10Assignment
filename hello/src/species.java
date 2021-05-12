public class species extends Genus
{

        private String speciesName;
    public species( String s, String g )
        {
            super(g);
            setSpeciesName(s);
        }
        public void setSpeciesName(String s){ speciesName = s; }
        public String getSpeciesName(){ return speciesName; }
        public String toString()
        {
            return "Species: " + getGenusName() + " " + speciesName;
        }
        public boolean equals(species s)
        {
            return speciesName.equals(s.getSpeciesName());
        }


}

